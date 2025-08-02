package net.theblindbandit6.toy_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
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
                List<ItemConvertible> TOY_BRICK_SMELTABLES = List.of(ModItems.RAW_PLASTIC);

                offerSmelting(TOY_BRICK_SMELTABLES, RecipeCategory.MISC, ModItems.TOY_BRICK, 0.25f, 200, "toy_brick");
                offerBlasting(TOY_BRICK_SMELTABLES, RecipeCategory.MISC, ModItems.TOY_BRICK, 0.25f, 100, "toy_brick");

                createShapeless(RecipeCategory.MISC, ModItems.RAW_PLASTIC, 2)
                        .input(ItemTags.COALS)
                        .input(Items.RESIN_CLUMP)
                        .criterion(hasItem(Items.RESIN_CLUMP), conditionsFromItem(Items.RESIN_CLUMP))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "TutorialMod Recipes";
    }
}
