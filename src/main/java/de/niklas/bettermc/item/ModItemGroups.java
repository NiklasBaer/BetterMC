package de.niklas.bettermc.item;

import de.niklas.bettermc.block.ModBlocks;
import de.niklas.bettermc.client.Bettermc;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Bettermc.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemGroup.bettermc.pink_garnet"))
                    .entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.PINK_GARNET));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_BLOCK));

                        entries.add(new ItemStack(ModItems.CHISEL));

                        entries.add(new ItemStack(ModItems.RAW_PINK_GARNET));
                        entries.add(new ItemStack(ModBlocks.RAW_PINK_GARNET_BLOCK));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_ORE));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_DEEPSLATE_ORE));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_SLAB));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_DOOR));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_STAIRS));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_TRAPDOOR));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_FENCE));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_FENCE_GATE));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_WALL));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_PRESSURE_PLATE));
                        entries.add(new ItemStack(ModBlocks.PINK_GARNET_BUTTON));

                        entries.add(new ItemStack(ModItems.PINK_GARNET_SWORD));
                        entries.add(new ItemStack(ModItems.PINK_GARNET_PICKAXE));
                        entries.add(new ItemStack(ModItems.PINK_GARNET_AXE));
                        entries.add(new ItemStack(ModItems.PINK_GARNET_SHOVEL));
                        entries.add(new ItemStack(ModItems.PINK_GARNET_HOE));

                        entries.add(new ItemStack(ModItems.PINK_GARNET_HAMMER));

                        entries.add(new ItemStack(ModItems.PINK_GARNET_HELMET));
                        entries.add(new ItemStack(ModItems.PINK_GARNET_CHESTPLATE));
                        entries.add(new ItemStack(ModItems.PINK_GARNET_LEGGINGS));
                        entries.add(new ItemStack(ModItems.PINK_GARNET_BOOTS));

                        entries.add(new ItemStack(ModItems.PINK_GARNET_HORSE_ARMOR));


                        entries.add(new ItemStack(ModItems.KAUPEN_BOW));


                    }).build());


    public static final ItemGroup PALLADIUM = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Bettermc.MOD_ID, "palladium"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PALLADIUM_INGOT))
                    .displayName(Text.translatable("itemGroup.bettermc.palladium"))
                    .entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.RAW_PALLADIUM));
                        entries.add(new ItemStack(ModItems.PALLADIUM_INGOT));
                        entries.add(new ItemStack(ModBlocks.PALLADIUM_BLOCK));

                        entries.add(new ItemStack(ModBlocks.PALLADIUM_ORE));
                        entries.add(new ItemStack(ModBlocks.PALLADIUM_DEEPSLATE_ORE));
                        entries.add(new ItemStack(ModBlocks.RAW_PALLADIUM_BLOCK));

                    }).build());

    public static void registerItemGroups() {

    }

}
