package net.theblindbandit6.toy_bricks.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.theblindbandit6.toy_bricks.ToyBricks;

public class ModTags {
    //Block Tags
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ToyBricks.MOD_ID, name));
        }
    }

    //Item Tags
    public static class Items {
        public static final TagKey<Item> TOY_BRICKS = createTag("toy_bricks");
        public static final TagKey<Item> TOY_BRICK_BLOCKS = createTag("toy_brick_blocks");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ToyBricks.MOD_ID, name));
        }
    }
}
