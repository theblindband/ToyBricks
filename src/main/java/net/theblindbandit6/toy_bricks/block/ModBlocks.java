package net.theblindbandit6.toy_bricks.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.theblindbandit6.toy_bricks.ToyBricks;
import net.theblindbandit6.toy_bricks.sound.ModSounds;

import java.util.function.Function;

public class ModBlocks {
    //Toy Bricks Hardness and Resistance
    private static final float TOY_BRICK_HARDNESS = 1.5F;
    private static final float TOY_BRICK_RESISTANCE = 6.0F;
    //Toy Bricks Mixed Colours
    public static final Block TOY_BRICKS = registerBlock("toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.YELLOW)));
    public static final Block TOY_BRICKS_STAIRS = registerBlock("toy_bricks_stairs",properties -> new StairsBlock(ModBlocks.TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.YELLOW)));
    public static final Block TOY_BRICKS_SLAB = registerBlock("toy_bricks_slab",properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.YELLOW)));
    public static final Block CASTLE_TOY_BRICKS = registerBlock("castle_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.STONE_GRAY)));
    public static final Block CASTLE_TOY_BRICKS_STAIRS = registerBlock("castle_toy_bricks_stairs",properties -> new StairsBlock(ModBlocks.TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.STONE_GRAY)));
    public static final Block CASTLE_TOY_BRICKS_SLAB = registerBlock("castle_toy_bricks_slab",properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.STONE_GRAY)));
    public static final Block MAGMA_TOY_BRICKS = registerBlock("magma_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.BRIGHT_RED)));
    public static final Block MAGMA_TOY_BRICKS_STAIRS = registerBlock("magma_toy_bricks_stairs",properties -> new StairsBlock(ModBlocks.TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.BRIGHT_RED)));
    public static final Block MAGMA_TOY_BRICKS_SLAB = registerBlock("magma_toy_bricks_slab",properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.BRIGHT_RED)));
    public static final Block PORTAL_TOY_BRICKS = registerBlock("portal_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.PURPLE)));
    public static final Block PORTAL_TOY_BRICKS_STAIRS = registerBlock("portal_toy_bricks_stairs",properties -> new StairsBlock(ModBlocks.TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.PURPLE)));
    public static final Block PORTAL_TOY_BRICKS_SLAB = registerBlock("portal_toy_bricks_slab",properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(MapColor.PURPLE)));
    //Dyed Toy Bricks
    public static final Block WHITE_TOY_BRICKS = registerBlock("white_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.WHITE)));
    public static final Block WHITE_TOY_BRICKS_STAIRS = registerBlock("white_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.WHITE_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.WHITE)));
    public static final Block WHITE_TOY_BRICKS_SLAB = registerBlock("white_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.WHITE)));
    public static final Block LIGHT_GRAY_TOY_BRICKS = registerBlock("light_gray_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.LIGHT_GRAY)));
    public static final Block LIGHT_GRAY_TOY_BRICKS_STAIRS = registerBlock("light_gray_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.LIGHT_GRAY_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.LIGHT_GRAY)));
    public static final Block LIGHT_GRAY_TOY_BRICKS_SLAB = registerBlock("light_gray_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.LIGHT_GRAY)));
    public static final Block GRAY_TOY_BRICKS = registerBlock("gray_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.GRAY)));
    public static final Block GRAY_TOY_BRICKS_STAIRS = registerBlock("gray_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.GRAY_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.GRAY)));
    public static final Block GRAY_TOY_BRICKS_SLAB = registerBlock("gray_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.GRAY)));
    public static final Block BLACK_TOY_BRICKS = registerBlock("black_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.BLACK)));
    public static final Block BLACK_TOY_BRICKS_STAIRS = registerBlock("black_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.BLACK_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.BLACK)));
    public static final Block BLACK_TOY_BRICKS_SLAB = registerBlock("black_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.BLACK)));
    public static final Block BROWN_TOY_BRICKS = registerBlock("brown_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.BROWN)));
    public static final Block BROWN_TOY_BRICKS_STAIRS = registerBlock("brown_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.BROWN_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.BROWN)));
    public static final Block BROWN_TOY_BRICKS_SLAB = registerBlock("brown_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.BROWN)));
    public static final Block RED_TOY_BRICKS = registerBlock("red_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.RED)));
    public static final Block RED_TOY_BRICKS_STAIRS = registerBlock("red_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.RED_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.RED)));
    public static final Block RED_TOY_BRICKS_SLAB = registerBlock("red_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.RED)));
    public static final Block ORANGE_TOY_BRICKS = registerBlock("orange_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.ORANGE)));
    public static final Block ORANGE_TOY_BRICKS_STAIRS = registerBlock("orange_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.ORANGE_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.ORANGE)));
    public static final Block ORANGE_TOY_BRICKS_SLAB = registerBlock("orange_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.ORANGE)));
    public static final Block YELLOW_TOY_BRICKS = registerBlock("yellow_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.YELLOW)));
    public static final Block YELLOW_TOY_BRICKS_STAIRS = registerBlock("yellow_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.YELLOW_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.YELLOW)));
    public static final Block YELLOW_TOY_BRICKS_SLAB = registerBlock("yellow_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.YELLOW)));
    public static final Block LIME_TOY_BRICKS = registerBlock("lime_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.LIME)));
    public static final Block LIME_TOY_BRICKS_STAIRS = registerBlock("lime_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.LIME_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.LIME)));
    public static final Block LIME_TOY_BRICKS_SLAB = registerBlock("lime_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.LIME)));
    public static final Block GREEN_TOY_BRICKS = registerBlock("green_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.GREEN)));
    public static final Block GREEN_TOY_BRICKS_STAIRS = registerBlock("green_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.GREEN_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.GREEN)));
    public static final Block GREEN_TOY_BRICKS_SLAB = registerBlock("green_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.GREEN)));
    public static final Block CYAN_TOY_BRICKS = registerBlock("cyan_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.CYAN)));
    public static final Block CYAN_TOY_BRICKS_STAIRS = registerBlock("cyan_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.CYAN_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.CYAN)));
    public static final Block CYAN_TOY_BRICKS_SLAB = registerBlock("cyan_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.CYAN)));
    public static final Block LIGHT_BLUE_TOY_BRICKS = registerBlock("light_blue_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final Block LIGHT_BLUE_TOY_BRICKS_STAIRS = registerBlock("light_blue_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.LIGHT_BLUE_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final Block LIGHT_BLUE_TOY_BRICKS_SLAB = registerBlock("light_blue_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.LIGHT_BLUE)));
    public static final Block BLUE_TOY_BRICKS = registerBlock("blue_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.BLUE)));
    public static final Block BLUE_TOY_BRICKS_STAIRS = registerBlock("blue_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.BLUE_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.BLUE)));
    public static final Block BLUE_TOY_BRICKS_SLAB = registerBlock("blue_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.BLUE)));
    public static final Block PURPLE_TOY_BRICKS = registerBlock("purple_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.PURPLE)));
    public static final Block PURPLE_TOY_BRICKS_STAIRS = registerBlock("purple_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.PURPLE_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.PURPLE)));
    public static final Block PURPLE_TOY_BRICKS_SLAB = registerBlock("purple_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.PURPLE)));
    public static final Block MAGENTA_TOY_BRICKS = registerBlock("magenta_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.MAGENTA)));
    public static final Block MAGENTA_TOY_BRICKS_STAIRS = registerBlock("magenta_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.MAGENTA_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.MAGENTA)));
    public static final Block MAGENTA_TOY_BRICKS_SLAB = registerBlock("magenta_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.MAGENTA)));
    public static final Block PINK_TOY_BRICKS = registerBlock("pink_toy_bricks", properties -> new Block(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.PINK)));
    public static final Block PINK_TOY_BRICKS_STAIRS = registerBlock("pink_toy_bricks_stairs", properties -> new StairsBlock(ModBlocks.PINK_TOY_BRICKS.getDefaultState(), properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.PINK)));
    public static final Block PINK_TOY_BRICKS_SLAB = registerBlock("pink_toy_bricks_slab", properties -> new SlabBlock(properties.strength(TOY_BRICK_HARDNESS, TOY_BRICK_RESISTANCE).sounds(ModSounds.TOY_BRICKS).mapColor(DyeColor.PINK)));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ToyBricks.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(ToyBricks.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ToyBricks.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ToyBricks.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        //ToyBricks.LOGGER.info("Registering Mod Blocks for " + ToyBricks.MOD_ID);
    }
}
