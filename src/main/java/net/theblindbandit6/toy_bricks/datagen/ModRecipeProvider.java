package net.theblindbandit6.toy_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
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
            public void generate(RecipeExporter exporter) {
                //Blocks
                //Toy Bricks
                ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOY_BRICKS, 5)
                        .input(ModBlocks.YELLOW_TOY_BRICKS)
                        .input(ModBlocks.BLUE_TOY_BRICKS)
                        .input(ModBlocks.LIME_TOY_BRICKS)
                        .input(ModBlocks.RED_TOY_BRICKS)
                        .input(ModBlocks.MAGENTA_TOY_BRICKS)
                        .criterion(hasItem(ModBlocks.YELLOW_TOY_BRICKS), conditionsFromItem(ModBlocks.YELLOW_TOY_BRICKS))
                        .criterion(hasItem(ModBlocks.BLUE_TOY_BRICKS), conditionsFromItem(ModBlocks.BLUE_TOY_BRICKS))
                        .criterion(hasItem(ModBlocks.LIME_TOY_BRICKS), conditionsFromItem(ModBlocks.LIME_TOY_BRICKS))
                        .criterion(hasItem(ModBlocks.RED_TOY_BRICKS), conditionsFromItem(ModBlocks.RED_TOY_BRICKS))
                        .criterion(hasItem(ModBlocks.MAGENTA_TOY_BRICKS), conditionsFromItem(ModBlocks.MAGENTA_TOY_BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.TOY_BRICKS), conditionsFromItem(ModBlocks.TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.TOY_BRICKS), conditionsFromItem(ModBlocks.TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TOY_BRICKS_WALL, ModBlocks.TOY_BRICKS);

                ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CASTLE_TOY_BRICKS, 2)
                        .input(ModBlocks.LIGHT_GRAY_TOY_BRICKS)
                        .input(ModBlocks.GRAY_TOY_BRICKS)
                        .criterion(hasItem(ModBlocks.GRAY_TOY_BRICKS), conditionsFromItem(ModBlocks.GRAY_TOY_BRICKS))
                        .criterion(hasItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CASTLE_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.CASTLE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.CASTLE_TOY_BRICKS), conditionsFromItem(ModBlocks.CASTLE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CASTLE_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.CASTLE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.CASTLE_TOY_BRICKS), conditionsFromItem(ModBlocks.CASTLE_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CASTLE_TOY_BRICKS_WALL, ModBlocks.CASTLE_TOY_BRICKS);

                ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGMA_TOY_BRICKS, 2)
                        .input(ModBlocks.RED_TOY_BRICKS)
                        .input(ModBlocks.ORANGE_TOY_BRICKS)
                        .criterion(hasItem(ModBlocks.ORANGE_TOY_BRICKS), conditionsFromItem(ModBlocks.ORANGE_TOY_BRICKS))
                        .criterion(hasItem(ModBlocks.RED_TOY_BRICKS), conditionsFromItem(ModBlocks.RED_TOY_BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.MAGMA_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.MAGMA_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.MAGMA_TOY_BRICKS), conditionsFromItem(ModBlocks.MAGMA_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGMA_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.MAGMA_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.MAGMA_TOY_BRICKS), conditionsFromItem(ModBlocks.MAGMA_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGMA_TOY_BRICKS_WALL, ModBlocks.MAGMA_TOY_BRICKS);

                ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORTAL_TOY_BRICKS, 2)
                        .input(ModBlocks.PURPLE_TOY_BRICKS)
                        .input(ModBlocks.MAGENTA_TOY_BRICKS)
                        .criterion(hasItem(ModBlocks.PURPLE_TOY_BRICKS), conditionsFromItem(ModBlocks.PURPLE_TOY_BRICKS))
                        .criterion(hasItem(ModBlocks.MAGENTA_TOY_BRICKS), conditionsFromItem(ModBlocks.MAGENTA_TOY_BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PORTAL_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.PORTAL_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.PORTAL_TOY_BRICKS), conditionsFromItem(ModBlocks.PORTAL_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORTAL_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.PORTAL_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.PORTAL_TOY_BRICKS), conditionsFromItem(ModBlocks.PORTAL_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORTAL_TOY_BRICKS_WALL, ModBlocks.PORTAL_TOY_BRICKS);

                //Dyed Toy Brick
                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TOY_BRICKS, Ingredient.ofItems(ModItems.WHITE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.WHITE_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.WHITE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.WHITE_TOY_BRICKS), conditionsFromItem(ModBlocks.WHITE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.WHITE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.WHITE_TOY_BRICKS), conditionsFromItem(ModBlocks.WHITE_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TOY_BRICKS_WALL, ModBlocks.WHITE_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TOY_BRICKS, Ingredient.ofItems(ModItems.ORANGE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.ORANGE_TOY_BRICK), conditionsFromItem(ModItems.ORANGE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.ORANGE_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.ORANGE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.ORANGE_TOY_BRICKS), conditionsFromItem(ModBlocks.ORANGE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.ORANGE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.ORANGE_TOY_BRICKS), conditionsFromItem(ModBlocks.ORANGE_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TOY_BRICKS_WALL, ModBlocks.ORANGE_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TOY_BRICKS, Ingredient.ofItems(ModItems.MAGENTA_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.MAGENTA_TOY_BRICK), conditionsFromItem(ModItems.MAGENTA_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.MAGENTA_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.MAGENTA_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.MAGENTA_TOY_BRICKS), conditionsFromItem(ModBlocks.MAGENTA_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.MAGENTA_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.MAGENTA_TOY_BRICKS), conditionsFromItem(ModBlocks.MAGENTA_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TOY_BRICKS_WALL, ModBlocks.MAGENTA_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TOY_BRICKS, Ingredient.ofItems(ModItems.LIGHT_BLUE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.LIGHT_BLUE_TOY_BRICK), conditionsFromItem(ModItems.LIGHT_BLUE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_BLUE_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_BLUE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.LIGHT_BLUE_TOY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_BLUE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.LIGHT_BLUE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.LIGHT_BLUE_TOY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_BLUE_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TOY_BRICKS_WALL, ModBlocks.LIGHT_BLUE_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TOY_BRICKS, Ingredient.ofItems(ModItems.YELLOW_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.YELLOW_TOY_BRICK), conditionsFromItem(ModItems.YELLOW_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.YELLOW_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.YELLOW_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.YELLOW_TOY_BRICKS), conditionsFromItem(ModBlocks.YELLOW_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.YELLOW_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.YELLOW_TOY_BRICKS), conditionsFromItem(ModBlocks.YELLOW_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TOY_BRICKS_WALL, ModBlocks.YELLOW_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TOY_BRICKS, Ingredient.ofItems(ModItems.LIME_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.LIME_TOY_BRICK), conditionsFromItem(ModItems.LIME_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.LIME_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.LIME_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.LIME_TOY_BRICKS), conditionsFromItem(ModBlocks.LIME_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.LIME_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.LIME_TOY_BRICKS), conditionsFromItem(ModBlocks.LIME_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TOY_BRICKS_WALL, ModBlocks.LIME_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TOY_BRICKS, Ingredient.ofItems(ModItems.PINK_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.PINK_TOY_BRICK), conditionsFromItem(ModItems.PINK_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.PINK_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.PINK_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.PINK_TOY_BRICKS), conditionsFromItem(ModBlocks.PINK_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.PINK_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.PINK_TOY_BRICKS), conditionsFromItem(ModBlocks.PINK_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TOY_BRICKS_WALL, ModBlocks.PINK_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TOY_BRICKS, Ingredient.ofItems(ModItems.GRAY_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.GRAY_TOY_BRICK), conditionsFromItem(ModItems.GRAY_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.GRAY_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.GRAY_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.GRAY_TOY_BRICKS), conditionsFromItem(ModBlocks.GRAY_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.GRAY_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.GRAY_TOY_BRICKS), conditionsFromItem(ModBlocks.GRAY_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TOY_BRICKS_WALL, ModBlocks.GRAY_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TOY_BRICKS, Ingredient.ofItems(ModItems.LIGHT_GRAY_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.LIGHT_GRAY_TOY_BRICK), conditionsFromItem(ModItems.LIGHT_GRAY_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_GRAY_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.LIGHT_GRAY_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS), conditionsFromItem(ModBlocks.LIGHT_GRAY_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TOY_BRICKS_WALL, ModBlocks.LIGHT_GRAY_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TOY_BRICKS, Ingredient.ofItems(ModItems.CYAN_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.CYAN_TOY_BRICK), conditionsFromItem(ModItems.CYAN_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.CYAN_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.CYAN_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.CYAN_TOY_BRICKS), conditionsFromItem(ModBlocks.CYAN_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.CYAN_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.CYAN_TOY_BRICKS), conditionsFromItem(ModBlocks.CYAN_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TOY_BRICKS_WALL, ModBlocks.CYAN_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TOY_BRICKS, Ingredient.ofItems(ModItems.PURPLE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.PURPLE_TOY_BRICK), conditionsFromItem(ModItems.PURPLE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.PURPLE_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.PURPLE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.PURPLE_TOY_BRICKS), conditionsFromItem(ModBlocks.PURPLE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.PURPLE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.PURPLE_TOY_BRICKS), conditionsFromItem(ModBlocks.PURPLE_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TOY_BRICKS_WALL, ModBlocks.PURPLE_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TOY_BRICKS, Ingredient.ofItems(ModItems.BLUE_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.BLUE_TOY_BRICK), conditionsFromItem(ModItems.BLUE_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.BLUE_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.BLUE_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.BLUE_TOY_BRICKS), conditionsFromItem(ModBlocks.BLUE_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.BLUE_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.BLUE_TOY_BRICKS), conditionsFromItem(ModBlocks.BLUE_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TOY_BRICKS_WALL, ModBlocks.BLUE_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TOY_BRICKS, Ingredient.ofItems(ModItems.BROWN_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.BROWN_TOY_BRICK), conditionsFromItem(ModItems.BROWN_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.BROWN_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.BROWN_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.BROWN_TOY_BRICKS), conditionsFromItem(ModBlocks.BROWN_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.BROWN_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.BROWN_TOY_BRICKS), conditionsFromItem(ModBlocks.BROWN_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TOY_BRICKS_WALL, ModBlocks.BROWN_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TOY_BRICKS, Ingredient.ofItems(ModItems.GREEN_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.GREEN_TOY_BRICK), conditionsFromItem(ModItems.GREEN_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.GREEN_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.GREEN_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.GREEN_TOY_BRICKS), conditionsFromItem(ModBlocks.GREEN_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.GREEN_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.GREEN_TOY_BRICKS), conditionsFromItem(ModBlocks.GREEN_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TOY_BRICKS_WALL, ModBlocks.GREEN_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TOY_BRICKS, Ingredient.ofItems(ModItems.RED_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.RED_TOY_BRICK), conditionsFromItem(ModItems.RED_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.RED_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.RED_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.RED_TOY_BRICKS), conditionsFromItem(ModBlocks.RED_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.RED_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.RED_TOY_BRICKS), conditionsFromItem(ModBlocks.RED_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TOY_BRICKS_WALL, ModBlocks.RED_TOY_BRICKS);

                createCondensingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TOY_BRICKS, Ingredient.ofItems(ModItems.BLACK_TOY_BRICK)).group("toy_bricks").criterion(hasItem(ModItems.BLACK_TOY_BRICK), conditionsFromItem(ModItems.BLACK_TOY_BRICK)).offerTo(exporter);
                createStairsRecipe(ModBlocks.BLACK_TOY_BRICKS_STAIRS, Ingredient.ofItems(ModBlocks.BLACK_TOY_BRICKS)).group("toy_bricks_stairs").criterion(hasItem(ModBlocks.BLACK_TOY_BRICKS), conditionsFromItem(ModBlocks.BLACK_TOY_BRICKS)).offerTo(exporter);
                createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TOY_BRICKS_SLAB, Ingredient.ofItems(ModBlocks.BLACK_TOY_BRICKS)).group("toy_bricks_slab").criterion(hasItem(ModBlocks.BLACK_TOY_BRICKS), conditionsFromItem(ModBlocks.BLACK_TOY_BRICKS)).offerTo(exporter);
                offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TOY_BRICKS_WALL, ModBlocks.BLACK_TOY_BRICKS);

                //Items
                //Raw Plastic
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PLASTIC, 2)
                        .input(ItemTags.COALS)
                        .input(Items.HONEYCOMB)
                        .criterion(hasItem(Items.HONEYCOMB), conditionsFromItem(Items.HONEYCOMB))
                        .offerTo(exporter);
                //Smelting
                List<ItemConvertible> PLASTIC_BRICK_SMELTABLES = List.of(ModItems.RAW_PLASTIC);
                offerSmelting(exporter, PLASTIC_BRICK_SMELTABLES, RecipeCategory.MISC, ModItems.PLASTIC_BRICK, 0.25f, 200, "plastic_brick");
                offerBlasting(exporter, PLASTIC_BRICK_SMELTABLES, RecipeCategory.MISC, ModItems.PLASTIC_BRICK, 0.25f, 100, "plastic_brick");
                //Dyed Toy Bricks
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WHITE_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.WHITE_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORANGE_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.ORANGE_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGENTA_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.MAGENTA_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_BLUE_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.LIGHT_BLUE_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YELLOW_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.YELLOW_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIME_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.LIME_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.PINK_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRAY_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.GRAY_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIGHT_GRAY_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.LIGHT_GRAY_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CYAN_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.CYAN_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PURPLE_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.PURPLE_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLUE_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.BLUE_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BROWN_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.BROWN_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GREEN_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.GREEN_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.RED_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
                ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLACK_TOY_BRICK, 8).group("toy_brick").input(ModItems.PLASTIC_BRICK, 8).input(Items.BLACK_DYE).criterion(hasItem(ModItems.WHITE_TOY_BRICK), conditionsFromItem(ModItems.WHITE_TOY_BRICK)).offerTo(exporter);
            }

    @Override
    public String getName() {
        return "ToyBricks Recipes";
    }
}
