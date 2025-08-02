package net.theblindbandit6.toy_bricks.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.theblindbandit6.toy_bricks.ToyBricks;

import java.util.function.Function;

public class ModBlocks {
    public static final Block TOY_BRICKS = registerBlock("toy_bricks",
            properties -> new Block(properties.strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block TOY_BRICKS_STAIRS = registerBlock("toy_bricks_stairs",
            properties -> new StairsBlock(ModBlocks.TOY_BRICKS.getDefaultState(), properties.strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block TOY_BRICKS_SLAB = registerBlock("toy_bricks_slab",
            properties -> new SlabBlock(properties.strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

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
        ToyBricks.LOGGER.info("Registering Mod Blocks for " + ToyBricks.MOD_ID);
    }
}
