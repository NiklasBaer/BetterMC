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
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Function;

public class ModBlocks {

    //Blocks ohne EXP
    public static final Block PINK_GARNET_BLOCK = register(
            "pink_garnet_block",
            Block::new,
            AbstractBlock.Settings.create().strength(2.0f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    public static final Block RAW_PINK_GARNET_BLOCK = register(
            "raw_pink_garnet_block",
            Block::new,
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    public static final Block PALLADIUM_BLOCK = register(
            "palladium_block",
            Block::new,
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.NETHERITE),
            true);

    public static final Block RAW_PALLADIUM_BLOCK = register(
            "raw_palladium_block",
            Block::new,
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.STONE),
            true);

    //Blocks mit EXP
    public static final Block PINK_GARNET_ORE = register(
            "pink_garnet_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7), settings),
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.STONE),
            true);


    public static final Block PINK_GARNET_DEEPSLATE_ORE = register(
            "pink_garnet_deepslate_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7), settings),
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE),
            true);

    public static final Block PALLADIUM_ORE = register(
            "palladium_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7), settings),
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.STONE),
            true);

    public static final Block PALLADIUM_DEEPSLATE_ORE = register(
            "palladium_deepslate_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(3,7), settings),
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE),
            true);

    // Non-Block Blocks

    public static final Block PINK_GARNET_SLAB = register(
            "pink_garnet_slab",
            SlabBlock::new,
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    public static final Block PINK_GARNET_DOOR = register(
            "pink_garnet_door",
            settings -> new DoorBlock(BlockSetType.ACACIA, settings),
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    public static final Block PINK_GARNET_STAIRS = register(
            "pink_garnet_stairs",
            settings -> new StairsBlock(PINK_GARNET_BLOCK.getDefaultState(), settings),
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    public static final Block PINK_GARNET_FENCE = register(
            "pink_garnet_fence",
            FenceBlock::new,
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    public static final Block PINK_GARNET_FENCE_GATE = register(
            "pink_garnet_fence_gate",
            settings -> new FenceGateBlock(WoodType.ACACIA, settings),
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    public static final Block PINK_GARNET_TRAPDOOR = register(
            "pink_garnet_trapdoor",
            settings -> new TrapdoorBlock(BlockSetType.IRON, settings),
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    public static final Block PINK_GARNET_WALL = register(
            "pink_garnet_wall",
            WallBlock::new,
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    public static final Block PINK_GARNET_PRESSURE_PLATE = register(
            "pink_garnet_pressure_plate",
            settings -> new PressurePlateBlock(BlockSetType.IRON, settings),
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    public static final Block PINK_GARNET_BUTTON = register(
            "pink_garnet_button",
            settings -> new ButtonBlock(BlockSetType.IRON, 2 ,settings),
            AbstractBlock.Settings.create().strength(2f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK),
            true);

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        RegistryKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Bettermc.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, name));
    }

    public static void registerModBlocks() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {

            fabricItemGroupEntries.add(PINK_GARNET_BLOCK);
            fabricItemGroupEntries.add(RAW_PINK_GARNET_BLOCK);

            fabricItemGroupEntries.add(PINK_GARNET_ORE);

            fabricItemGroupEntries.add(PINK_GARNET_SLAB);
            fabricItemGroupEntries.add(PINK_GARNET_DOOR);
        });
    }
}
