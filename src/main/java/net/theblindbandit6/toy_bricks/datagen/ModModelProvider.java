package net.theblindbandit6.toy_bricks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.theblindbandit6.toy_bricks.block.ModBlocks;
import net.theblindbandit6.toy_bricks.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Toy Bricks
        BlockStateModelGenerator.BlockTexturePool toyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TOY_BRICKS);
        toyBricksPool.stairs(ModBlocks.TOY_BRICKS_STAIRS);
        toyBricksPool.slab(ModBlocks.TOY_BRICKS_SLAB);
        toyBricksPool.wall(ModBlocks.TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool castleToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CASTLE_TOY_BRICKS);
        castleToyBricksPool.stairs(ModBlocks.CASTLE_TOY_BRICKS_STAIRS);
        castleToyBricksPool.slab(ModBlocks.CASTLE_TOY_BRICKS_SLAB);
        castleToyBricksPool.wall(ModBlocks.CASTLE_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool magmaToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGMA_TOY_BRICKS);
        magmaToyBricksPool.stairs(ModBlocks.MAGMA_TOY_BRICKS_STAIRS);
        magmaToyBricksPool.slab(ModBlocks.MAGMA_TOY_BRICKS_SLAB);
        magmaToyBricksPool.wall(ModBlocks.MAGMA_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool portalToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PORTAL_TOY_BRICKS);
        portalToyBricksPool.stairs(ModBlocks.PORTAL_TOY_BRICKS_STAIRS);
        portalToyBricksPool.slab(ModBlocks.PORTAL_TOY_BRICKS_SLAB);
        portalToyBricksPool.wall(ModBlocks.PORTAL_TOY_BRICKS_WALL);
        //Dyed Toy Bricks
        BlockStateModelGenerator.BlockTexturePool whiteToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_TOY_BRICKS);
        whiteToyBricksPool.stairs(ModBlocks.WHITE_TOY_BRICKS_STAIRS);
        whiteToyBricksPool.slab(ModBlocks.WHITE_TOY_BRICKS_SLAB);
        whiteToyBricksPool.wall(ModBlocks.WHITE_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool orangeToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_TOY_BRICKS);
        orangeToyBricksPool.stairs(ModBlocks.ORANGE_TOY_BRICKS_STAIRS);
        orangeToyBricksPool.slab(ModBlocks.ORANGE_TOY_BRICKS_SLAB);
        orangeToyBricksPool.wall(ModBlocks.ORANGE_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool magentaToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_TOY_BRICKS);
        magentaToyBricksPool.stairs(ModBlocks.MAGENTA_TOY_BRICKS_STAIRS);
        magentaToyBricksPool.slab(ModBlocks.MAGENTA_TOY_BRICKS_SLAB);
        magentaToyBricksPool.wall(ModBlocks.MAGENTA_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool lightBlueToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_TOY_BRICKS);
        lightBlueToyBricksPool.stairs(ModBlocks.LIGHT_BLUE_TOY_BRICKS_STAIRS);
        lightBlueToyBricksPool.slab(ModBlocks.LIGHT_BLUE_TOY_BRICKS_SLAB);
        lightBlueToyBricksPool.wall(ModBlocks.LIGHT_BLUE_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool yellowToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_TOY_BRICKS);
        yellowToyBricksPool.stairs(ModBlocks.YELLOW_TOY_BRICKS_STAIRS);
        yellowToyBricksPool.slab(ModBlocks.YELLOW_TOY_BRICKS_SLAB);
        yellowToyBricksPool.wall(ModBlocks.YELLOW_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool limeToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_TOY_BRICKS);
        limeToyBricksPool.stairs(ModBlocks.LIME_TOY_BRICKS_STAIRS);/* Continue from here */
        limeToyBricksPool.slab(ModBlocks.LIME_TOY_BRICKS_SLAB);
        limeToyBricksPool.wall(ModBlocks.LIME_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool pinkToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_TOY_BRICKS);
        pinkToyBricksPool.stairs(ModBlocks.PINK_TOY_BRICKS_STAIRS);
        pinkToyBricksPool.slab(ModBlocks.PINK_TOY_BRICKS_SLAB);
        pinkToyBricksPool.wall(ModBlocks.PINK_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool grayToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_TOY_BRICKS);
        grayToyBricksPool.stairs(ModBlocks.GRAY_TOY_BRICKS_STAIRS);
        grayToyBricksPool.slab(ModBlocks.GRAY_TOY_BRICKS_SLAB);
        grayToyBricksPool.wall(ModBlocks.GRAY_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool lightGrayToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_TOY_BRICKS);
        lightGrayToyBricksPool.stairs(ModBlocks.LIGHT_GRAY_TOY_BRICKS_STAIRS);
        lightGrayToyBricksPool.slab(ModBlocks.LIGHT_GRAY_TOY_BRICKS_SLAB);
        lightGrayToyBricksPool.wall(ModBlocks.LIGHT_GRAY_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool cyanToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_TOY_BRICKS);
        cyanToyBricksPool.stairs(ModBlocks.CYAN_TOY_BRICKS_STAIRS);
        cyanToyBricksPool.slab(ModBlocks.CYAN_TOY_BRICKS_SLAB);
        cyanToyBricksPool.wall(ModBlocks.CYAN_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool purpleToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_TOY_BRICKS);
        purpleToyBricksPool.stairs(ModBlocks.PURPLE_TOY_BRICKS_STAIRS);
        purpleToyBricksPool.slab(ModBlocks.PURPLE_TOY_BRICKS_SLAB);
        purpleToyBricksPool.wall(ModBlocks.PURPLE_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool blueToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_TOY_BRICKS);
        blueToyBricksPool.stairs(ModBlocks.BLUE_TOY_BRICKS_STAIRS);
        blueToyBricksPool.slab(ModBlocks.BLUE_TOY_BRICKS_SLAB);
        blueToyBricksPool.wall(ModBlocks.BLUE_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool brownToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_TOY_BRICKS);
        brownToyBricksPool.stairs(ModBlocks.BROWN_TOY_BRICKS_STAIRS);
        brownToyBricksPool.slab(ModBlocks.BROWN_TOY_BRICKS_SLAB);
        brownToyBricksPool.wall(ModBlocks.BROWN_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool greenToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_TOY_BRICKS);
        greenToyBricksPool.stairs(ModBlocks.GREEN_TOY_BRICKS_STAIRS);
        greenToyBricksPool.slab(ModBlocks.GREEN_TOY_BRICKS_SLAB);
        greenToyBricksPool.wall(ModBlocks.GREEN_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool redToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_TOY_BRICKS);
        redToyBricksPool.stairs(ModBlocks.RED_TOY_BRICKS_STAIRS);
        redToyBricksPool.slab(ModBlocks.RED_TOY_BRICKS_SLAB);
        redToyBricksPool.wall(ModBlocks.RED_TOY_BRICKS_WALL);
        BlockStateModelGenerator.BlockTexturePool blackToyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_TOY_BRICKS);
        blackToyBricksPool.stairs(ModBlocks.BLACK_TOY_BRICKS_STAIRS);
        blackToyBricksPool.slab(ModBlocks.BLACK_TOY_BRICKS_SLAB);
        blackToyBricksPool.wall(ModBlocks.BLACK_TOY_BRICKS_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_PLASTIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLASTIC_BRICK, Models.GENERATED);
        //Dyed Toy Bricks
        itemModelGenerator.register(ModItems.WHITE_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_GRAY_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_TOY_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_TOY_BRICK, Models.GENERATED);
    }
}
