package com.link.detailed.blocks.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class tsiguae extends Block {
    public tsiguae(Settings settings) {
        super(FabricBlockSettings.of(Material.CAKE).strength(0.4f).noCollision().nonOpaque());
    }
}
