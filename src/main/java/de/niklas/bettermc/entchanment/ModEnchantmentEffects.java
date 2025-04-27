package de.niklas.bettermc.entchanment;

import com.mojang.serialization.MapCodec;
import de.niklas.bettermc.client.Bettermc;
import de.niklas.bettermc.entchanment.effect.LightningStrikerEnchantmentEffect;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {
    public static final RegistryKey<Enchantment> LIGHTNING_STRIKE = of("lightning_strike");
    public static MapCodec<LightningStrikerEnchantmentEffect> LIGHTNING_EFFECT = register("lightning_effect", LightningStrikerEnchantmentEffect.CODEC);

    private static RegistryKey<Enchantment> of(String path) {
        Identifier id = Identifier.of(Bettermc.MOD_ID, path);
        return RegistryKey.of(RegistryKeys.ENCHANTMENT, id);
    }

    private static <T extends EnchantmentEntityEffect> MapCodec<T> register(String id, MapCodec<T> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(Bettermc.MOD_ID, id), codec);
    }

    public static void registerModEnchantmentEffects() {
    }
}