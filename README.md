# Open Simple Frames Create Flavor

![cursed corners](https://media.discordapp.net/attachments/328940219099250688/1186825845864669215/CreateFlavoredOpenSimpleFrames.png)
<br>
Carpenters Blocks but Fabric 1.20, Create Flavor, now with Vertical Slabs !
## The Concept
The idea of Carpenters blocks is that for any given shape in minecraft it should be able to use any texture, for this, a block has to know what model and what texture to use, by default a block already knows what model to use, but we need to store additional information about what texture to use instead, from what I gather, this is usally done using block entities, block entities feel like a lot of overhead for what is effectively a single number, as such my "frame" blocks have an additional property caled texture id.
<br>
when a player interacts with a block, if they have a block in there hand then that blocks texture is then assigned a texture id, this is universal across all frames, for instance, if stone was used on some stairs and assigned the id 1, then any other frame would use texture id 1 for stone, this does add a lot of extra states to some blocks, but at a low level, having the game take a bit longer to load but run fairly unobstructed in game, is a good thing.

## Whats here?
![blocks in the creative inventory](https://media.discordapp.net/attachments/328940219099250688/1186825845399097364/CreateFlavoredOpenSimpleFramesCreativeTab.png?ex=6594a8b3&is=658233b3&hm=b53d2bcc020eb26fe09d1a8160895a2934d70143a340c58ca08a8f0f01d17485&=&format=webp&quality=lossless)
<br>
Crafts have been modified to make them like other copycat blocks, meaning using zinc ingots in a stonecutter.
<br>
some odd blocks in this mod should also be noted
- ramps, and corner ramps, functionally act like stairs
- covers can have up to 3 sides of a block in one block.
- partitions are like walls
- H fences are also like walls
- giant blocks when placed are 2x2 and 4x4 respectively
- fences exist
- doors exist
- blocks that are 1.5 blocks tall one up, one down, they render as such
- there are chests, be careful with them however.
- NEW!! Vertical slabs

## Commands

you can use `/simpleframes report` as an operator to see what blocks are using what texture ids
`/simpleframes set (id) (blockstates)` can be used to change a texture


## why "Open"
I am not a wizard, and I cannot put so much time into modding in the current circumstance, if someone knows how to solve an issue, please make a pull request or gist, suggestions can also be given this way to.
<br>
feel free to make addons and modifications to this mod, eventually there will be a wiki at [https://github.com/LoremVIpsum/OpenSimpleFrames/wiki](https://github.com/LoremVIpsum/OpenSimpleFrames/wiki)
