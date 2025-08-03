package net.theblindbandit6.toy_bricks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.theblindbandit6.toy_bricks.ToyBricks;
import net.theblindbandit6.toy_bricks.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TOY_BRICKS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ToyBricks.MOD_ID, "toy_bricks_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TOY_BRICKS))
                    .displayName(Text.translatable("itemgroup.toy_bricks_item_group"))
                    .entries((displayContext, entries) -> {
                        //Items
                        entries.add(ModItems.RAW_PLASTIC);
                        entries.add(ModItems.PLASTIC_BRICK);
                        //Dyed Bricks
                        entries.add(ModItems.WHITE_TOY_BRICK);
                        entries.add(ModItems.LIGHT_GRAY_TOY_BRICK);
                        entries.add(ModItems.GRAY_TOY_BRICK);
                        entries.add(ModItems.BLACK_TOY_BRICK);
                        entries.add(ModItems.BROWN_TOY_BRICK);
                        entries.add(ModItems.RED_TOY_BRICK);
                        entries.add(ModItems.ORANGE_TOY_BRICK);
                        entries.add(ModItems.YELLOW_TOY_BRICK);
                        entries.add(ModItems.LIME_TOY_BRICK);
                        entries.add(ModItems.GREEN_TOY_BRICK);
                        entries.add(ModItems.CYAN_TOY_BRICK);
                        entries.add(ModItems.LIGHT_BLUE_TOY_BRICK);
                        entries.add(ModItems.BLUE_TOY_BRICK);
                        entries.add(ModItems.PURPLE_TOY_BRICK);
                        entries.add(ModItems.MAGENTA_TOY_BRICK);
                        entries.add(ModItems.PINK_TOY_BRICK);
                        //Blocks
                        //Toy Bricks
                        entries.add(ModBlocks.TOY_BRICKS);
                        entries.add(ModBlocks.TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.TOY_BRICKS_SLAB);
                        //Dyed Toy Bricks
                        entries.add(ModBlocks.WHITE_TOY_BRICKS);
                        entries.add(ModBlocks.WHITE_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.WHITE_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_TOY_BRICKS);
                        entries.add(ModBlocks.LIGHT_GRAY_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.GRAY_TOY_BRICKS);
                        entries.add(ModBlocks.GRAY_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.GRAY_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.BLACK_TOY_BRICKS);
                        entries.add(ModBlocks.BLACK_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.BLACK_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.BROWN_TOY_BRICKS);
                        entries.add(ModBlocks.BROWN_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.BROWN_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.RED_TOY_BRICKS);
                        entries.add(ModBlocks.RED_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.RED_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.ORANGE_TOY_BRICKS);
                        entries.add(ModBlocks.ORANGE_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.ORANGE_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.YELLOW_TOY_BRICKS);
                        entries.add(ModBlocks.YELLOW_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.YELLOW_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.LIME_TOY_BRICKS);
                        entries.add(ModBlocks.LIME_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.LIME_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.GREEN_TOY_BRICKS);
                        entries.add(ModBlocks.GREEN_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.GREEN_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.CYAN_TOY_BRICKS);
                        entries.add(ModBlocks.CYAN_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.CYAN_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_TOY_BRICKS);
                        entries.add(ModBlocks.LIGHT_BLUE_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.BLUE_TOY_BRICKS);
                        entries.add(ModBlocks.BLUE_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.BLUE_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.PURPLE_TOY_BRICKS);
                        entries.add(ModBlocks.PURPLE_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.PURPLE_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.MAGENTA_TOY_BRICKS);
                        entries.add(ModBlocks.MAGENTA_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.MAGENTA_TOY_BRICKS_SLAB);
                        entries.add(ModBlocks.PINK_TOY_BRICKS);
                        entries.add(ModBlocks.PINK_TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.PINK_TOY_BRICKS_SLAB);
                    }).build());

    public static void registerItemGroups() {
        ToyBricks.LOGGER.info("Registering Item Groups for " + ToyBricks.MOD_ID);
    }
}
