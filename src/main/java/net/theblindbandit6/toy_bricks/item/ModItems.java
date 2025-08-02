package net.theblindbandit6.toy_bricks.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.theblindbandit6.toy_bricks.ToyBricks;

import java.util.function.Function;

public class ModItems {
    public static final Item RAW_PLASTIC = registerItem("raw_plastic", Item::new);
    public static final Item TOY_BRICK = registerItem("toy_brick", Item::new);

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(ToyBricks.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ToyBricks.MOD_ID, name)))));
    }
    public static void registerModItems() {
        ToyBricks.LOGGER.info("Registering Mod Items for " + ToyBricks.MOD_ID);
    }
}