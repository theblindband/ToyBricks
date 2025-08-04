package net.theblindbandit6.toy_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.theblindbandit6.toy_bricks.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        //Toy Bricks Mixed Colours
        addDrop(ModBlocks.TOY_BRICKS);
        addDrop(ModBlocks.TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.TOY_BRICKS_SLAB);
        addDrop(ModBlocks.CASTLE_TOY_BRICKS);
        addDrop(ModBlocks.CASTLE_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.CASTLE_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.MAGMA_TOY_BRICKS);
        addDrop(ModBlocks.MAGMA_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.MAGMA_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.PORTAL_TOY_BRICKS);
        addDrop(ModBlocks.PORTAL_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.PORTAL_TOY_BRICKS_SLAB);
        //Dyed Toy Bricks
        addDrop(ModBlocks.WHITE_TOY_BRICKS);
        addDrop(ModBlocks.WHITE_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.WHITE_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.ORANGE_TOY_BRICKS);
        addDrop(ModBlocks.ORANGE_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.ORANGE_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.MAGENTA_TOY_BRICKS);
        addDrop(ModBlocks.MAGENTA_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.MAGENTA_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.LIGHT_BLUE_TOY_BRICKS);
        addDrop(ModBlocks.LIGHT_BLUE_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.YELLOW_TOY_BRICKS);
        addDrop(ModBlocks.YELLOW_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.YELLOW_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.LIME_TOY_BRICKS);
        addDrop(ModBlocks.LIME_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.LIME_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.PINK_TOY_BRICKS);
        addDrop(ModBlocks.PINK_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.PINK_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.GRAY_TOY_BRICKS);
        addDrop(ModBlocks.GRAY_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.GRAY_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.LIGHT_GRAY_TOY_BRICKS);
        addDrop(ModBlocks.LIGHT_GRAY_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.CYAN_TOY_BRICKS);
        addDrop(ModBlocks.CYAN_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.CYAN_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.PURPLE_TOY_BRICKS);
        addDrop(ModBlocks.PURPLE_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.PURPLE_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.BLUE_TOY_BRICKS);
        addDrop(ModBlocks.BLUE_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.BLUE_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.BROWN_TOY_BRICKS);
        addDrop(ModBlocks.BROWN_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.BROWN_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.GREEN_TOY_BRICKS);
        addDrop(ModBlocks.GREEN_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.GREEN_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.RED_TOY_BRICKS);
        addDrop(ModBlocks.RED_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.RED_TOY_BRICKS_SLAB);
        addDrop(ModBlocks.BLACK_TOY_BRICKS);
        addDrop(ModBlocks.BLACK_TOY_BRICKS_STAIRS);
        addDrop(ModBlocks.BLACK_TOY_BRICKS_SLAB);
    }
}
