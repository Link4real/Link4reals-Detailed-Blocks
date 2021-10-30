package com.link.detailed.blocks.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.link.detailed.blocks.Main.MOD_ID;

public class ModBlocks {


    public static final Block GRIPPER = new GripperBlock(FabricBlockSettings.of(Material.METAL).strength(2f));
    public static final Block MACHINE = new GripperBlock(FabricBlockSettings.of(Material.METAL).strength(2f));


    public static void registerBlocks() {


        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"gripper"), GRIPPER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gripper"), new BlockItem(GRIPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "machine"), MACHINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"machine"), new BlockItem(MACHINE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
