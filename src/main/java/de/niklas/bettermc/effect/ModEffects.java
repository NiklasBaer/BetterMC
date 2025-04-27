package de.niklas.bettermc.effect;

import de.niklas.bettermc.client.Bettermc;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> SPIDER = registerStatusEffect("spider", new SpiderEffect(StatusEffectCategory.NEUTRAL, 0x36ebab)
                .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED,
                        Identifier.of(Bettermc.MOD_ID, "spider"), -0.25f,
                        EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect effect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Bettermc.MOD_ID, name), effect);
    }

    public static void registerEffects() {

    }
}
