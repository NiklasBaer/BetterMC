package de.niklas.bettermc.datagen;

import de.niklas.bettermc.block.ModBlocks;
import de.niklas.bettermc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    private final CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup;

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
        this.registryLookup = registryLookup;
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PINK_GARNET_BLOCK);
        addDrop(ModBlocks.RAW_PINK_GARNET_BLOCK);
        addDrop(ModBlocks.PALLADIUM_BLOCK);
        addDrop(ModBlocks.RAW_PALLADIUM_BLOCK);

        addDrop(ModBlocks.PINK_GARNET_ORE, multipleOreDrops(ModBlocks.PINK_GARNET_ORE, ModItems.PINK_GARNET, 1, 5));
        addDrop(ModBlocks.PINK_GARNET_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.PINK_GARNET_DEEPSLATE_ORE, ModItems.RAW_PINK_GARNET, 3, 7));
        addDrop(ModBlocks.PALLADIUM_ORE, multipleOreDrops(ModBlocks.PALLADIUM_ORE, ModItems.RAW_PALLADIUM, 1, 5));
        addDrop(ModBlocks.PALLADIUM_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.PALLADIUM_DEEPSLATE_ORE, ModItems.RAW_PALLADIUM, 3, 7));
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper<Enchantment> wrapper = this.registryLookup.join().getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(wrapper.getOrThrow(Enchantments.FORTUNE)))));
    }
}