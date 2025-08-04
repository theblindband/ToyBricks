package net.theblindbandit6.toy_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.theblindbandit6.toy_bricks.block.ModBlocks;
import net.theblindbandit6.toy_bricks.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                //Blocks
                //Toy Bricks
                //createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOY_BRICKS, Ingredient.ofItem(ModItems.WHITE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.TOY_BRICKS), conditionsFromItem(ModBlocks.TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.TOY_BRICKS), conditionsFromItem(ModBlocks.TOY_BRICKS)).offerTo(exporter);
                //Dyed Toy Brick
                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TOY_BRICKS, Ingredient.ofItem(ModItems.WHITE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.WHITE_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.WHITE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.WHITE_TOY_BRICKS), conditionsFromItem(ModBlocks.WHITE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.WHITE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.WHITE_TOY_BRICKS), conditionsFromItem(ModBlocks.WHITE_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TOY_BRICKS, Ingredient.ofItem(ModItems.ORANGE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.ORANGE_TOY_BRICK), conditionsFromItem(ModItems.ORANGE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.ORANGE_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.ORANGE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.ORANGE_TOY_BRICKS), conditionsFromItem(ModBlocks.ORANGE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.ORANGE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.ORANGE_TOY_BRICKS), conditionsFromItem(ModBlocks.ORANGE_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TOY_BRICKS, Ingredient.ofItem(ModItems.MAGENTA_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.MAGENTA_TOY_BRICK), conditionsFromItem(ModItems.MAGENTA_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.MAGENTA_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.MAGENTA_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.MAGENTA_TOY_BRICKS), conditionsFromItem(ModBlocks.MAGENTA_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.MAGENTA_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.MAGENTA_TOY_BRICKS), conditionsFromItem(ModBlocks.MAGENTA_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TOY_BRICKS, Ingredient.ofItem(ModItems.LIGHT_BLUE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.LIGHT_BLUE_TOY_BRICK), conditionsFromItem(ModItems.LIGHT_BLUE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_BLUE_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.LIGHT_BLUE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.LIGHT_BLUE_TOY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_BLUE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.LIGHT_BLUE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.LIGHT_BLUE_TOY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_BLUE_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TOY_BRICKS, Ingredient.ofItem(ModItems.YELLOW_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.YELLOW_TOY_BRICK), conditionsFromItem(ModItems.YELLOW_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.YELLOW_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.YELLOW_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.YELLOW_TOY_BRICKS), conditionsFromItem(ModBlocks.YELLOW_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.YELLOW_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.YELLOW_TOY_BRICKS), conditionsFromItem(ModBlocks.YELLOW_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TOY_BRICKS, Ingredient.ofItem(ModItems.LIME_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.LIME_TOY_BRICK), conditionsFromItem(ModItems.LIME_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.LIME_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.LIME_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.LIME_TOY_BRICKS), conditionsFromItem(ModBlocks.LIME_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.LIME_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.LIME_TOY_BRICKS), conditionsFromItem(ModBlocks.LIME_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TOY_BRICKS, Ingredient.ofItem(ModItems.PINK_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.PINK_TOY_BRICK), conditionsFromItem(ModItems.PINK_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.PINK_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.PINK_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.PINK_TOY_BRICKS), conditionsFromItem(ModBlocks.PINK_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.PINK_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.PINK_TOY_BRICKS), conditionsFromItem(ModBlocks.PINK_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TOY_BRICKS, Ingredient.ofItem(ModItems.GRAY_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.GRAY_TOY_BRICK), conditionsFromItem(ModItems.GRAY_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.GRAY_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.GRAY_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.GRAY_TOY_BRICKS), conditionsFromItem(ModBlocks.GRAY_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.GRAY_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.GRAY_TOY_BRICKS), conditionsFromItem(ModBlocks.GRAY_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TOY_BRICKS, Ingredient.ofItem(ModItems.LIGHT_GRAY_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.LIGHT_GRAY_TOY_BRICK), conditionsFromItem(ModItems.LIGHT_GRAY_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_GRAY_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TOY_BRICKS, Ingredient.ofItem(ModItems.CYAN_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.CYAN_TOY_BRICK), conditionsFromItem(ModItems.CYAN_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.CYAN_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.CYAN_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.CYAN_TOY_BRICKS), conditionsFromItem(ModBlocks.CYAN_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.CYAN_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.CYAN_TOY_BRICKS), conditionsFromItem(ModBlocks.CYAN_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TOY_BRICKS, Ingredient.ofItem(ModItems.PURPLE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.PURPLE_TOY_BRICK), conditionsFromItem(ModItems.PURPLE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.PURPLE_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.PURPLE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.PURPLE_TOY_BRICKS), conditionsFromItem(ModBlocks.PURPLE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.PURPLE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.PURPLE_TOY_BRICKS), conditionsFromItem(ModBlocks.PURPLE_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TOY_BRICKS, Ingredient.ofItem(ModItems.BLUE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.BLUE_TOY_BRICK), conditionsFromItem(ModItems.BLUE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.BLUE_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.BLUE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.BLUE_TOY_BRICKS), conditionsFromItem(ModBlocks.BLUE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.BLUE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.BLUE_TOY_BRICKS), conditionsFromItem(ModBlocks.BLUE_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TOY_BRICKS, Ingredient.ofItem(ModItems.BROWN_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.BROWN_TOY_BRICK), conditionsFromItem(ModItems.BROWN_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.BROWN_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.BROWN_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.BROWN_TOY_BRICKS), conditionsFromItem(ModBlocks.BROWN_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.BROWN_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.BROWN_TOY_BRICKS), conditionsFromItem(ModBlocks.BROWN_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TOY_BRICKS, Ingredient.ofItem(ModItems.GREEN_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.GREEN_TOY_BRICK), conditionsFromItem(ModItems.GREEN_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.GREEN_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.GREEN_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.GREEN_TOY_BRICKS), conditionsFromItem(ModBlocks.GREEN_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.GREEN_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.GREEN_TOY_BRICKS), conditionsFromItem(ModBlocks.GREEN_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TOY_BRICKS, Ingredient.ofItem(ModItems.RED_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.RED_TOY_BRICK), conditionsFromItem(ModItems.RED_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.RED_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.RED_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.RED_TOY_BRICKS), conditionsFromItem(ModBlocks.RED_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.RED_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.RED_TOY_BRICKS), conditionsFromItem(ModBlocks.RED_TOY_BRICKS)).offerTo(exporter);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TOY_BRICKS, Ingredient.ofItem(ModItems.BLACK_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.BLACK_TOY_BRICK), conditionsFromItem(ModItems.BLACK_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.BLACK_TOY_BRICKS_STAIRS, Ingredient.ofItem(ModBlocks.BLACK_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.BLACK_TOY_BRICKS), conditionsFromItem(ModBlocks.BLACK_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TOY_BRICKS_SLAB, Ingredient.ofItem(ModBlocks.BLACK_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.BLACK_TOY_BRICKS), conditionsFromItem(ModBlocks.BLACK_TOY_BRICKS)).offerTo(exporter);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOY_BRICKS_STAIRS, ModBlocks.TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOY_BRICKS_SLAB, ModBlocks.TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TOY_BRICKS, ModItems.WHITE_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TOY_BRICKS_STAIRS, ModBlocks.WHITE_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TOY_BRICKS_SLAB, ModBlocks.WHITE_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TOY_BRICKS, ModItems.LIGHT_GRAY_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TOY_BRICKS_STAIRS, ModBlocks.LIGHT_GRAY_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TOY_BRICKS_SLAB, ModBlocks.LIGHT_GRAY_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TOY_BRICKS, ModItems.GRAY_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TOY_BRICKS_STAIRS, ModBlocks.GRAY_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TOY_BRICKS_SLAB, ModBlocks.GRAY_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TOY_BRICKS, ModItems.BLACK_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TOY_BRICKS_STAIRS, ModBlocks.BLACK_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TOY_BRICKS_SLAB, ModBlocks.BLACK_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TOY_BRICKS, ModItems.BROWN_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TOY_BRICKS_STAIRS, ModBlocks.BROWN_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TOY_BRICKS_SLAB, ModBlocks.BROWN_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TOY_BRICKS, ModItems.RED_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TOY_BRICKS_STAIRS, ModBlocks.RED_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TOY_BRICKS_SLAB, ModBlocks.RED_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TOY_BRICKS, ModItems.ORANGE_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TOY_BRICKS_STAIRS, ModBlocks.ORANGE_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TOY_BRICKS_SLAB, ModBlocks.ORANGE_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TOY_BRICKS, ModItems.YELLOW_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TOY_BRICKS_STAIRS, ModBlocks.YELLOW_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TOY_BRICKS_SLAB, ModBlocks.YELLOW_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TOY_BRICKS, ModItems.LIME_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TOY_BRICKS_STAIRS, ModBlocks.LIME_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TOY_BRICKS_SLAB, ModBlocks.LIME_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TOY_BRICKS, ModItems.GREEN_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TOY_BRICKS_STAIRS, ModBlocks.GREEN_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TOY_BRICKS_SLAB, ModBlocks.GREEN_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TOY_BRICKS, ModItems.CYAN_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TOY_BRICKS_STAIRS, ModBlocks.CYAN_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TOY_BRICKS_SLAB, ModBlocks.CYAN_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TOY_BRICKS, ModItems.LIGHT_BLUE_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TOY_BRICKS_STAIRS, ModBlocks.LIGHT_BLUE_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TOY_BRICKS_SLAB, ModBlocks.LIGHT_BLUE_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TOY_BRICKS, ModItems.BLUE_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TOY_BRICKS_STAIRS, ModBlocks.BLUE_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TOY_BRICKS_SLAB, ModBlocks.BLUE_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TOY_BRICKS, ModItems.PURPLE_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TOY_BRICKS_STAIRS, ModBlocks.PURPLE_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TOY_BRICKS_SLAB, ModBlocks.PURPLE_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TOY_BRICKS, ModItems.MAGENTA_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TOY_BRICKS_STAIRS, ModBlocks.MAGENTA_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TOY_BRICKS_SLAB, ModBlocks.MAGENTA_TOY_BRICKS, 2);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TOY_BRICKS, ModItems.PINK_TOY_BRICK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TOY_BRICKS_STAIRS, ModBlocks.PINK_TOY_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TOY_BRICKS_SLAB, ModBlocks.PINK_TOY_BRICKS, 2);

                //Items
                //Raw Plastic
                createShapeless(RecipeCategory.MISC, ModItems.RAW_PLASTIC, 2)
                        .input(ItemTags.COALS)
                        .input(Items.RESIN_CLUMP)
                        .criterion(hasItem(Items.RESIN_CLUMP), conditionsFromItem(Items.RESIN_CLUMP))
                        .offerTo(exporter);
                //Smelting
                List<ItemConvertible> PLASTIC_BRICK_SMELTABLES = List.of(ModItems.RAW_PLASTIC);
                offerSmelting(PLASTIC_BRICK_SMELTABLES, RecipeCategory.MISC, ModItems.PLASTIC_BRICK, 0.25f, 200, "plastic_brick");
                offerBlasting(PLASTIC_BRICK_SMELTABLES, RecipeCategory.MISC, ModItems.PLASTIC_BRICK, 0.25f, 100, "plastic_brick");
                //Dyed Toy Bricks
                createShapeless(RecipeCategory.MISC, ModItems.WHITE_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.WHITE_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.ORANGE_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.ORANGE_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.MAGENTA_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.MAGENTA_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.LIGHT_BLUE_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.LIGHT_BLUE_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.YELLOW_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.YELLOW_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.LIME_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.LIME_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.PINK_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.PINK_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.GRAY_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.GRAY_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.LIGHT_GRAY_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.LIGHT_GRAY_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.CYAN_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.CYAN_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.PURPLE_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.PURPLE_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.BLUE_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.BLUE_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.BROWN_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.BROWN_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.GREEN_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.GREEN_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.RED_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.RED_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.BLACK_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.BLACK_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "ToyBricks Recipes";
    }
}
