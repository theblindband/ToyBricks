package net.theblindbandit6.toy_bricks.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.theblindbandit6.toy_bricks.ToyBricks;

public class ModSounds {
    //Toy Bricks Sounds
    public static final SoundEvent TOY_BRICKS_BREAK = registerSoundEvent("toy_bricks_break");
    public static final SoundEvent TOY_BRICKS_STEP = registerSoundEvent("toy_bricks_step");
    public static final SoundEvent TOY_BRICKS_PLACE = registerSoundEvent("toy_bricks_place");
    public static final SoundEvent TOY_BRICKS_HIT = registerSoundEvent("toy_bricks_hit");
    public static final SoundEvent TOY_BRICKS_FALL = registerSoundEvent("toy_bricks_fall");
    //Toy Bricks Sound Group
    public static final BlockSoundGroup TOY_BRICKS = new BlockSoundGroup(1f, 1f,
            TOY_BRICKS_BREAK, TOY_BRICKS_STEP, TOY_BRICKS_PLACE, TOY_BRICKS_HIT, TOY_BRICKS_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(ToyBricks.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSounds() {
        //ToyBricks.LOGGER.info("Registering Mod Sounds for " + ToyBricks.MOD_ID);
    }
}
