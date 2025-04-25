package de.niklas.bettermc.item;

import de.niklas.bettermc.client.Bettermc;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    //Tutorial
    public static final Item PINK_GARNET = registerItem("pink_garnet",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "pink_garnet")))));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "raw_pink_garnet")))));

    //Alex und Niklas (Mod)
    public static final Item PALLADIUM_INGOT = registerItem("palladium_ingot",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "palladium_ingot")))));
    public static final Item RAW_PALLADIUM = registerItem("raw_palladium",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bettermc.MOD_ID, "raw_palladium")))));


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
