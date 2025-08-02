package net.theblindbandit6.toy_bricks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.theblindbandit6.toy_bricks.ToyBricks;
import net.theblindbandit6.toy_bricks.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TOY_BRICKS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ToyBricks.MOD_ID, "toy_bricks_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TOY_BRICK))
                    .displayName(Text.translatable("itemgroup.toy_bricks_item_group"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.RAW_PLASTIC);
                        entries.add(ModItems.TOY_BRICK);

                        entries.add(ModBlocks.TOY_BRICKS);
                        entries.add(ModBlocks.TOY_BRICKS_STAIRS);
                        entries.add(ModBlocks.TOY_BRICKS_SLAB);

                    }).build());

    public static void registerItemGroups() {
        ToyBricks.LOGGER.info("Registering Item Groups for " + ToyBricks.MOD_ID);
    }
}
