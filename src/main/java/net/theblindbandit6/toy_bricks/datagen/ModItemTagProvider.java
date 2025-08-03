package net.theblindbandit6.toy_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.theblindbandit6.toy_bricks.item.ModItems;
import net.theblindbandit6.toy_bricks.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Items.TOY_BRICKS)
                .add(ModItems.WHITE_TOY_BRICK)
                .add(ModItems.ORANGE_TOY_BRICK)
                .add(ModItems.MAGENTA_TOY_BRICK)
                .add(ModItems.LIGHT_BLUE_TOY_BRICK)
                .add(ModItems.YELLOW_TOY_BRICK)
                .add(ModItems.LIME_TOY_BRICK)
                .add(ModItems.PINK_TOY_BRICK)
                .add(ModItems.GRAY_TOY_BRICK)
                .add(ModItems.LIGHT_GRAY_TOY_BRICK)
                .add(ModItems.CYAN_TOY_BRICK)
                .add(ModItems.PURPLE_TOY_BRICK)
                .add(ModItems.BLUE_TOY_BRICK)
                .add(ModItems.BROWN_TOY_BRICK)
                .add(ModItems.GREEN_TOY_BRICK)
                .add(ModItems.RED_TOY_BRICK)
                .add(ModItems.BLACK_TOY_BRICK);
    }
}
