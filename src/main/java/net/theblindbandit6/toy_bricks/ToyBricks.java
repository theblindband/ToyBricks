package net.theblindbandit6.toy_bricks;

import net.fabricmc.api.ModInitializer;
import net.theblindbandit6.toy_bricks.block.ModBlocks;
import net.theblindbandit6.toy_bricks.item.ModItemGroups;
import net.theblindbandit6.toy_bricks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToyBricks implements ModInitializer {

    public static final String MOD_ID = "toy_bricks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
