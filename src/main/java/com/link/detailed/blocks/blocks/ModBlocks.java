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
    public static final Block ENERGIE = new EnergieDrink(FabricBlockSettings.of(Material.METAL).strength(2f));
    public static final Block MACHINE = new MachineBlock(FabricBlockSettings.of(Material.METAL).strength(2f));
    public static final Block WENDING_MACHINE = new Wending_MachineBlockyeet(FabricBlockSettings.of(Material.METAL).strength(2f));
    public static final Block FIREFOX = new FireFoxBlock(FabricBlockSettings.of(Material.METAL).strength(2f));
    public static final Block PFANNE = new PfnannenItemBlockDnings(FabricBlockSettings.of(Material.METAL).strength(2f));
    public static final Block STATUE = new STtautae(FabricBlockSettings.of(Material.METAL).strength(2f));
    public static final Block VENLO = new MeWhen(FabricBlockSettings.of(Material.METAL).strength(2f));
    public static final Block TISIGUE = new MeWhen(FabricBlockSettings.of(Material.METAL).strength(2f));


    public static void registerBlocks() {


        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"gripper"), GRIPPER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gripper"), new BlockItem(GRIPPER, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "machine"), MACHINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"machine"), new BlockItem(MACHINE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"wending_machine"), WENDING_MACHINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wending_machine"), new BlockItem(WENDING_MACHINE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"firefox"), FIREFOX);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "firefox"), new BlockItem(FIREFOX, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"energie_drink"), new BlockItem(ENERGIE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"energie_drink"), ENERGIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"pfanne"), new BlockItem(PFANNE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"pfanne"), PFANNE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"statue"), new BlockItem(STATUE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"statue"), STATUE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"venlo"), new BlockItem(VENLO, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"venlo"), VENLO);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"tisigue"), new BlockItem(TISIGUE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"tisigue"), TISIGUE);
    }
}
