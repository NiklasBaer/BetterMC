package de.niklas.bettermc.block;

import de.niklas.bettermc.client.Bettermc;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.structure.rule.blockentity.AppendLootRuleBlockEntityModifier;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ClampedNormalIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Function;

public class ModBlocks {

    //Tutorial
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            AbstractBlock.Settings.create().strength(4.0f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            AbstractBlock.Settings.create().strength(4f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static final Block PINK_GARNET_ORE = registerExperienceDropingBlock("pink_garnet_ore",
            AbstractBlock.Settings.create().strength(4f, 6.0f).sounds(BlockSoundGroup.STONE));

    public static final Block PINK_GARNET_DEEPSLATE_ORE = registerExperienceDropingBlock("pink_garnet_deepslate_ore",
            AbstractBlock.Settings.create().strength(4f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE));

    public static final Block PALLADIUM_ORE = registerExperienceDropingBlock("palladium_ore",
            AbstractBlock.Settings.create().strength(4f, 6.0f).sounds(BlockSoundGroup.STONE));

    public static final Block PALLADIUM_BLOCK = registerBlock("palladium_block",
            AbstractBlock.Settings.create().strength(4f, 6.0f).sounds(BlockSoundGroup.NETHERITE));

    public static final Block PALLADIUM_DEEPSLATE_ORE = registerExperienceDropingBlock("palladium_deepslate_ore",
            AbstractBlock.Settings.create().strength(4f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE));

    public static final Block RAW_PALLADIUM_BLOCK = registerBlock("raw_palladium_block",
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.STONE));

    public static final Block PINK_GARNET_SLAB = registerBlock("pink_garnet_slab",
            AbstractBlock.Settings.create().strength(4f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK));

    private static Block registerExperienceDropingBlock(String name, AbstractBlock.Settings blockSettings) {
        return registerBlock(name, key -> new ExperienceDroppingBlock(ClampedNormalIntProvider.of(3,1,1,10), blockSettings.registryKey(key)));
    }

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        return registerBlock(name, blockRegistryKey -> new Block(blockSettings.registryKey(blockRegistryKey)));
    }

    private static Block registerBlock(String name,
                                       Function<RegistryKey<Block>, Block> createBlock) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Bettermc.MOD_ID, name));
        Block block = createBlock.apply (key);
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }

    public static void registerModBlocks() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {

            fabricItemGroupEntries.add(PINK_GARNET_BLOCK);
            fabricItemGroupEntries.add(RAW_PINK_GARNET_BLOCK);

            fabricItemGroupEntries.add(PINK_GARNET_ORE);
            fabricItemGroupEntries.add(PINK_GARNET_SLAB);

        });
    }
}
