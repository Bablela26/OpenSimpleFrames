package com.loremv.simpleframes.blocks;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class FrameSlabVertical extends FrameBlock{
    public FrameSlabVertical(String capture) {
        super(capture);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(StairsBlock.FACING);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(StairsBlock.FACING,ctx.getHorizontalPlayerFacing());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(StairsBlock.FACING))
        {
            default -> super.getOutlineShape(state,world,pos,context);
            case NORTH -> createCuboidShape(0,0,0,16,16,8);
            case SOUTH -> createCuboidShape(0,0,8,16,16,16);
            case WEST -> createCuboidShape(0,0,0,8,16,16);
            case EAST -> createCuboidShape(8,0,0,16,16,16);
        };
    }
}
