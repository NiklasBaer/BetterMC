package de.niklas.bettermc.sound;

import de.niklas.bettermc.client.Bettermc;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent CHISEL_USE = registerSoundEvent("chisel_use");

    public static final SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");
    public static final RegistryKey<JukeboxSong> BAR_BRAWL_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Bettermc.MOD_ID, "bar_brawl"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Bettermc.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {

    }
}
