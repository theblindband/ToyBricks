package net.theblindbandit6.toy_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.theblindbandit6.toy_bricks.block.ModBlocks;
import net.theblindbandit6.toy_bricks.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    //Common Tags
    public static final TagKey<Item> BRICKS          = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "bricks"));
    public static final TagKey<Item> DYED            = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed"));
    public static final TagKey<Item> DYED_WHITE      = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/white"));
    public static final TagKey<Item> DYED_LIGHT_GRAY = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/light_gray"));
    public static final TagKey<Item> DYED_GRAY       = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/gray"));
    public static final TagKey<Item> DYED_BLACK      = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/black"));
    public static final TagKey<Item> DYED_BROWN      = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/brown"));
    public static final TagKey<Item> DYED_RED        = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/red"));
    public static final TagKey<Item> DYED_ORANGE     = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/orange"));
    public static final TagKey<Item> DYED_YELLOW     = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/yellow"));
    public static final TagKey<Item> DYED_LIME       = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/lime"));
    public static final TagKey<Item> DYED_GREEN      = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/green"));
    public static final TagKey<Item> DYED_CYAN       = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/cyan"));
    public static final TagKey<Item> DYED_LIGHT_BLUE = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/light_blue"));
    public static final TagKey<Item> DYED_BLUE       = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/blue"));
    public static final TagKey<Item> DYED_PURPLE     = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/purple"));
    public static final TagKey<Item> DYED_MAGENTA    = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/magenta"));
    public static final TagKey<Item> DYED_PINK       = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "dyed/pink"));


    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //Item Tags
        valueLookupBuilder(ItemTags.STAIRS)
                .add(ModBlocks.TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.CASTLE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.MAGMA_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.PORTAL_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.WHITE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.LIGHT_GRAY_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.GRAY_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.BLACK_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.BROWN_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.RED_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.ORANGE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.YELLOW_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.LIME_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.GREEN_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.CYAN_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.LIGHT_BLUE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.BLUE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.PURPLE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.MAGENTA_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.PINK_TOY_BRICKS_STAIRS.asItem());

        valueLookupBuilder(ItemTags.SLABS)
                .add(ModBlocks.TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.CASTLE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.MAGMA_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.PORTAL_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.WHITE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.LIGHT_GRAY_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.GRAY_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.BLACK_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.BROWN_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.RED_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.ORANGE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.YELLOW_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.LIME_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.GREEN_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.CYAN_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.LIGHT_BLUE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.BLUE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.PURPLE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.MAGENTA_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.PINK_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(BRICKS)
                .add(ModItems.PLASTIC_BRICK)
                .add(ModItems.WHITE_TOY_BRICK)
                .add(ModItems.LIGHT_GRAY_TOY_BRICK)
                .add(ModItems.GRAY_TOY_BRICK)
                .add(ModItems.BLACK_TOY_BRICK)
                .add(ModItems.BROWN_TOY_BRICK)
                .add(ModItems.RED_TOY_BRICK)
                .add(ModItems.ORANGE_TOY_BRICK)
                .add(ModItems.YELLOW_TOY_BRICK)
                .add(ModItems.LIME_TOY_BRICK)
                .add(ModItems.GREEN_TOY_BRICK)
                .add(ModItems.CYAN_TOY_BRICK)
                .add(ModItems.LIGHT_BLUE_TOY_BRICK)
                .add(ModItems.BLUE_TOY_BRICK)
                .add(ModItems.PURPLE_TOY_BRICK)
                .add(ModItems.MAGENTA_TOY_BRICK)
                .add(ModItems.PINK_TOY_BRICK);

        valueLookupBuilder(DYED_WHITE)
                .add(ModItems.WHITE_TOY_BRICK)
                .add(ModBlocks.WHITE_TOY_BRICKS.asItem())
                .add(ModBlocks.WHITE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.WHITE_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_LIGHT_GRAY)
                .add(ModItems.LIGHT_GRAY_TOY_BRICK)
                .add(ModBlocks.LIGHT_GRAY_TOY_BRICKS.asItem())
                .add(ModBlocks.LIGHT_GRAY_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.LIGHT_GRAY_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_GRAY)
                .add(ModItems.GRAY_TOY_BRICK)
                .add(ModBlocks.GRAY_TOY_BRICKS.asItem())
                .add(ModBlocks.GRAY_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.GRAY_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_BLACK)
                .add(ModItems.BLACK_TOY_BRICK)
                .add(ModBlocks.BLACK_TOY_BRICKS.asItem())
                .add(ModBlocks.BLACK_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.BLACK_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_BROWN)
                .add(ModItems.BROWN_TOY_BRICK)
                .add(ModBlocks.BROWN_TOY_BRICKS.asItem())
                .add(ModBlocks.BROWN_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.BROWN_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_RED)
                .add(ModItems.RED_TOY_BRICK)
                .add(ModBlocks.RED_TOY_BRICKS.asItem())
                .add(ModBlocks.RED_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.RED_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_ORANGE)
                .add(ModItems.ORANGE_TOY_BRICK)
                .add(ModBlocks.ORANGE_TOY_BRICKS.asItem())
                .add(ModBlocks.ORANGE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.ORANGE_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_YELLOW)
                .add(ModItems.YELLOW_TOY_BRICK)
                .add(ModBlocks.YELLOW_TOY_BRICKS.asItem())
                .add(ModBlocks.YELLOW_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.YELLOW_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_LIME)
                .add(ModItems.LIME_TOY_BRICK)
                .add(ModBlocks.LIME_TOY_BRICKS.asItem())
                .add(ModBlocks.LIME_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.LIME_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_GREEN)
                .add(ModItems.GREEN_TOY_BRICK)
                .add(ModBlocks.GREEN_TOY_BRICKS.asItem())
                .add(ModBlocks.GREEN_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.GREEN_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_CYAN)
                .add(ModItems.CYAN_TOY_BRICK)
                .add(ModBlocks.CYAN_TOY_BRICKS.asItem())
                .add(ModBlocks.CYAN_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.CYAN_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_LIGHT_BLUE)
                .add(ModItems.LIGHT_BLUE_TOY_BRICK)
                .add(ModBlocks.LIGHT_BLUE_TOY_BRICKS.asItem())
                .add(ModBlocks.LIGHT_BLUE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.LIGHT_BLUE_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_BLUE)
                .add(ModItems.BLUE_TOY_BRICK)
                .add(ModBlocks.BLUE_TOY_BRICKS.asItem())
                .add(ModBlocks.BLUE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.BLUE_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_PURPLE)
                .add(ModItems.PURPLE_TOY_BRICK)
                .add(ModBlocks.PURPLE_TOY_BRICKS.asItem())
                .add(ModBlocks.PURPLE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.PURPLE_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_MAGENTA)
                .add(ModItems.MAGENTA_TOY_BRICK)
                .add(ModBlocks.MAGENTA_TOY_BRICKS.asItem())
                .add(ModBlocks.MAGENTA_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.MAGENTA_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED_PINK)
                .add(ModItems.PINK_TOY_BRICK)
                .add(ModBlocks.PINK_TOY_BRICKS.asItem())
                .add(ModBlocks.PINK_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.PINK_TOY_BRICKS_SLAB.asItem());

        valueLookupBuilder(DYED)
                .add(ModItems.WHITE_TOY_BRICK)
                .add(ModItems.LIGHT_GRAY_TOY_BRICK)
                .add(ModItems.GRAY_TOY_BRICK)
                .add(ModItems.BLACK_TOY_BRICK)
                .add(ModItems.BROWN_TOY_BRICK)
                .add(ModItems.RED_TOY_BRICK)
                .add(ModItems.ORANGE_TOY_BRICK)
                .add(ModItems.YELLOW_TOY_BRICK)
                .add(ModItems.LIME_TOY_BRICK)
                .add(ModItems.GREEN_TOY_BRICK)
                .add(ModItems.CYAN_TOY_BRICK)
                .add(ModItems.LIGHT_BLUE_TOY_BRICK)
                .add(ModItems.BLUE_TOY_BRICK)
                .add(ModItems.PURPLE_TOY_BRICK)
                .add(ModItems.MAGENTA_TOY_BRICK)
                .add(ModItems.PINK_TOY_BRICK)

                .add(ModBlocks.WHITE_TOY_BRICKS.asItem())
                .add(ModBlocks.LIGHT_GRAY_TOY_BRICKS.asItem())
                .add(ModBlocks.GRAY_TOY_BRICKS.asItem())
                .add(ModBlocks.BLACK_TOY_BRICKS.asItem())
                .add(ModBlocks.BROWN_TOY_BRICKS.asItem())
                .add(ModBlocks.RED_TOY_BRICKS.asItem())
                .add(ModBlocks.ORANGE_TOY_BRICKS.asItem())
                .add(ModBlocks.YELLOW_TOY_BRICKS.asItem())
                .add(ModBlocks.LIME_TOY_BRICKS.asItem())
                .add(ModBlocks.GREEN_TOY_BRICKS.asItem())
                .add(ModBlocks.CYAN_TOY_BRICKS.asItem())
                .add(ModBlocks.LIGHT_BLUE_TOY_BRICKS.asItem())
                .add(ModBlocks.BLUE_TOY_BRICKS.asItem())
                .add(ModBlocks.PURPLE_TOY_BRICKS.asItem())
                .add(ModBlocks.MAGENTA_TOY_BRICKS.asItem())
                .add(ModBlocks.PINK_TOY_BRICKS.asItem())

                .add(ModBlocks.WHITE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.LIGHT_GRAY_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.GRAY_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.BLACK_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.BROWN_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.RED_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.ORANGE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.YELLOW_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.LIME_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.GREEN_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.CYAN_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.LIGHT_BLUE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.BLUE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.PURPLE_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.MAGENTA_TOY_BRICKS_STAIRS.asItem())
                .add(ModBlocks.PINK_TOY_BRICKS_STAIRS.asItem())

                .add(ModBlocks.WHITE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.LIGHT_GRAY_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.GRAY_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.BLACK_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.BROWN_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.RED_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.ORANGE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.YELLOW_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.LIME_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.GREEN_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.CYAN_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.LIGHT_BLUE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.BLUE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.PURPLE_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.MAGENTA_TOY_BRICKS_SLAB.asItem())
                .add(ModBlocks.PINK_TOY_BRICKS_SLAB.asItem());
    }
}
