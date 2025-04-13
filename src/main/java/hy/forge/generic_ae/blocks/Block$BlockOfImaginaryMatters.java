package hy.forge.generic_ae.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class Block$BlockOfImaginaryMatters extends Block {
    public Block$BlockOfImaginaryMatters() {
        super(Properties.of().destroyTime(1f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops());
    }
    
}
