package net.theblindbandit6.toy_bricks.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;
import net.theblindbandit6.toy_bricks.block.ModBlocks;
import net.theblindbandit6.toy_bricks.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool toyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TOY_BRICKS);
        toyBricksPool.stairs(ModBlocks.TOY_BRICKS_STAIRS);
        toyBricksPool.slab(ModBlocks.TOY_BRICKS_SLAB);

        //blockStateModelGenerator.registerDoor(ModBlocks.TOY_BRICK_DOOR);
        //blockStateModelGenerator.registerTrapdoor(ModBlocks.TOY_BRICK_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.RAW_PLASTIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOY_BRICK, Models.GENERATED);

    }
}
