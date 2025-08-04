package net.theblindbandit6.toy_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.theblindbandit6.toy_bricks.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    //Common Tags
    public static final TagKey<Block> BRICKS          = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "bricks"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //Item Tags
        valueLookupBuilder(BlockTags.STAIRS)
                .add(ModBlocks.TOY_BRICKS_STAIRS)
                .add(ModBlocks.CASTLE_TOY_BRICKS_STAIRS)
                .add(ModBlocks.MAGMA_TOY_BRICKS_STAIRS)
                .add(ModBlocks.PORTAL_TOY_BRICKS_STAIRS)
                .add(ModBlocks.WHITE_TOY_BRICKS_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_TOY_BRICKS_STAIRS)
                .add(ModBlocks.GRAY_TOY_BRICKS_STAIRS)
                .add(ModBlocks.BLACK_TOY_BRICKS_STAIRS)
                .add(ModBlocks.BROWN_TOY_BRICKS_STAIRS)
                .add(ModBlocks.RED_TOY_BRICKS_STAIRS)
                .add(ModBlocks.ORANGE_TOY_BRICKS_STAIRS)
                .add(ModBlocks.YELLOW_TOY_BRICKS_STAIRS)
                .add(ModBlocks.LIME_TOY_BRICKS_STAIRS)
                .add(ModBlocks.GREEN_TOY_BRICKS_STAIRS)
                .add(ModBlocks.CYAN_TOY_BRICKS_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_TOY_BRICKS_STAIRS)
                .add(ModBlocks.BLUE_TOY_BRICKS_STAIRS)
                .add(ModBlocks.PURPLE_TOY_BRICKS_STAIRS)
                .add(ModBlocks.MAGENTA_TOY_BRICKS_STAIRS)
                .add(ModBlocks.PINK_TOY_BRICKS_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
                .add(ModBlocks.TOY_BRICKS_SLAB)
                .add(ModBlocks.CASTLE_TOY_BRICKS_SLAB)
                .add(ModBlocks.MAGMA_TOY_BRICKS_SLAB)
                .add(ModBlocks.PORTAL_TOY_BRICKS_SLAB)
                .add(ModBlocks.WHITE_TOY_BRICKS_SLAB)
                .add(ModBlocks.LIGHT_GRAY_TOY_BRICKS_SLAB)
                .add(ModBlocks.GRAY_TOY_BRICKS_SLAB)
                .add(ModBlocks.BLACK_TOY_BRICKS_SLAB)
                .add(ModBlocks.BROWN_TOY_BRICKS_SLAB)
                .add(ModBlocks.RED_TOY_BRICKS_SLAB)
                .add(ModBlocks.ORANGE_TOY_BRICKS_SLAB)
                .add(ModBlocks.YELLOW_TOY_BRICKS_SLAB)
                .add(ModBlocks.LIME_TOY_BRICKS_SLAB)
                .add(ModBlocks.GREEN_TOY_BRICKS_SLAB)
                .add(ModBlocks.CYAN_TOY_BRICKS_SLAB)
                .add(ModBlocks.LIGHT_BLUE_TOY_BRICKS_SLAB)
                .add(ModBlocks.BLUE_TOY_BRICKS_SLAB)
                .add(ModBlocks.PURPLE_TOY_BRICKS_SLAB)
                .add(ModBlocks.MAGENTA_TOY_BRICKS_SLAB)
                .add(ModBlocks.PINK_TOY_BRICKS_SLAB);
    }
}
