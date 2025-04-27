package de.niklas.bettermc.potion;

import de.niklas.bettermc.client.Bettermc;
import de.niklas.bettermc.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotion {

    public static final RegistryEntry<Potion> SPIDER_POTION = registerPotion("spider_potion",
            new Potion("spider_potion",
            new StatusEffectInstance(ModEffects.SPIDER, 1200, 0, false, true)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(Bettermc.MOD_ID, name), potion);
    }

    public static void registerPotions() {
    }
}
