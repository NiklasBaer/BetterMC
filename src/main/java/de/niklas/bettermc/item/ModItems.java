package de.niklas.bettermc.item;

import de.niklas.bettermc.client.Bettermc;
import de.niklas.bettermc.item.custom.ChiselItem;
import de.niklas.bettermc.item.custom.HammerItem;
import de.niklas.bettermc.item.custom.ModArmorItem;
import de.niklas.bettermc.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;


public class ModItems {
    //Tutorial
    public static final Item PINK_GARNET = registerItem("pink_garnet",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet")))));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "raw_pink_garnet")))));

    //Alex und Niklas (Mod)
    public static final Item PALLADIUM_INGOT = registerItem("palladium_ingot",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "palladium_ingot")))));
    public static final Item RAW_PALLADIUM = registerItem("raw_palladium",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "raw_palladium")))));

    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModToolMaterials.PINK_GARNET, 3, -2.4f, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_sword")))));

    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.PINK_GARNET, 1, -2.8f, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_pickaxe")))));


    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterials.PINK_GARNET, 1.5f, -3.0f, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_shovel")))));

    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterials.PINK_GARNET, 6, -3.2f, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_axe")))));

    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterials.PINK_GARNET, 0, -3f, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_hoe")))));

    public static final Item PINK_GARNET_HAMMER = registerItem("pink_garnet_hammer",
            new HammerItem(ModToolMaterials.PINK_GARNET,BlockTags.PICKAXE_MINEABLE, 7, -3.4f,new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_hammer")))));


    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
            new ModArmorItem(ModAmorMaterials.PINK_GARNET_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings().fireproof().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_helmet")))));
    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
            new ModArmorItem(ModAmorMaterials.PINK_GARNET_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_chestplate")))));
    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
            new ModArmorItem(ModAmorMaterials.PINK_GARNET_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_leggings")))));
    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
            new ModArmorItem(ModAmorMaterials.PINK_GARNET_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_boots")))));

    public static final Item PINK_GARNET_HORSE_ARMOR = registerItem("pink_garnet_horse_armor",
            new AnimalArmorItem(ModAmorMaterials.PINK_GARNET_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet_horse_armor"))).maxCount(1)));

    public static final Item KAUPEN_BOW = registerItem("kaupen_bow",
            new BowItem(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "kaupen_bow"))).maxDamage(500)));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "chisel"))).maxDamage(32)));

    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "bar_brawl_music_disc")))
                    .jukeboxPlayable(ModSounds.BAR_BRAWL_KEY).maxCount(1)));



    public static final Item PALLADIUM_PICKAXE = registerItem("palladium_pickaxe",
            new PickaxeItem(ModToolMaterials.PALLADIUM, 1, -3f, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "palladium_pickaxe")))));
    public static final Item PALLADIUM_AXE = registerItem("palladium_axe",
            new AxeItem(ModToolMaterials.PALLADIUM, 7, -2.8f, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "palladium_axe")))));
    public static final Item PALLADIUM_HOE = registerItem("palladium_hoe",
            new HoeItem(ModToolMaterials.PALLADIUM, 0, -2f, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "palladium_hoe")))));
    public static final Item PALLADIUM_SWORD = registerItem("palladium_sword",
            new SwordItem(ModToolMaterials.PALLADIUM, 4, -3.4f, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "palladium_sword")))));
    public static final Item PALLADIUM_SHOVEL = registerItem("palladium_shovel",
            new ShovelItem(ModToolMaterials.PALLADIUM, 1.5f, -2f, new Item.Settings().fireproof()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "palladium_shovel")))));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM , Identifier.of(Bettermc.MOD_ID, name), item);
    }


    public static void registerModItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {

            fabricItemGroupEntries.add(PINK_GARNET);
            fabricItemGroupEntries.add(RAW_PINK_GARNET);
            fabricItemGroupEntries.add(PALLADIUM_INGOT);
            fabricItemGroupEntries.add(RAW_PALLADIUM);

        });

    }
}
