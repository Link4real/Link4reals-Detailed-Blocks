package com.link.detailed.blocks;

import com.link.detailed.blocks.blocks.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    public static final String MOD_ID = "detailed";

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
    }
}
