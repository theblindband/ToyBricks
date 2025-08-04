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
    //Raw Plastic
    public static final Item RAW_PLASTIC = registerItem("raw_plastic", Item::new);
    public static final Item PLASTIC_BRICK = registerItem("plastic_brick", Item::new);
    //Dyed Toy Bricks
    public static final Item WHITE_TOY_BRICK = registerItem("white_toy_brick", Item::new);
    public static final Item LIGHT_GRAY_TOY_BRICK = registerItem("light_gray_toy_brick", Item::new);
    public static final Item GRAY_TOY_BRICK = registerItem("gray_toy_brick", Item::new);
    public static final Item BLACK_TOY_BRICK = registerItem("black_toy_brick", Item::new);
    public static final Item BROWN_TOY_BRICK = registerItem("brown_toy_brick", Item::new);
    public static final Item RED_TOY_BRICK = registerItem("red_toy_brick", Item::new);
    public static final Item ORANGE_TOY_BRICK = registerItem("orange_toy_brick", Item::new);
    public static final Item YELLOW_TOY_BRICK = registerItem("yellow_toy_brick", Item::new);
    public static final Item LIME_TOY_BRICK = registerItem("lime_toy_brick", Item::new);
    public static final Item GREEN_TOY_BRICK = registerItem("green_toy_brick", Item::new);
    public static final Item CYAN_TOY_BRICK = registerItem("cyan_toy_brick", Item::new);
    public static final Item LIGHT_BLUE_TOY_BRICK = registerItem("light_blue_toy_brick", Item::new);
    public static final Item BLUE_TOY_BRICK = registerItem("blue_toy_brick", Item::new);
    public static final Item PURPLE_TOY_BRICK = registerItem("purple_toy_brick", Item::new);
    public static final Item MAGENTA_TOY_BRICK = registerItem("magenta_toy_brick", Item::new);
    public static final Item PINK_TOY_BRICK = registerItem("pink_toy_brick", Item::new);

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(ToyBricks.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ToyBricks.MOD_ID, name)))));
    }

    public static void registerModItems() {
        //ToyBricks.LOGGER.info("Registering Mod Items for " + ToyBricks.MOD_ID);
    }
}