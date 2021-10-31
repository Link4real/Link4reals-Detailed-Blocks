package com.link.detailed.blocks.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class Wending_MachineBlockyeet extends Block {
    public Wending_MachineBlockyeet(Settings settings) {
        super(FabricBlockSettings.of(Material.METAL).ticksRandomly().sounds(BlockSoundGroup.METAL).nonOpaque());
    }
}
