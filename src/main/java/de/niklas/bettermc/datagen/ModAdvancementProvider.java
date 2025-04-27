package de.niklas.bettermc.datagen;

import de.niklas.bettermc.client.Bettermc;
import de.niklas.bettermc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup wrapperLookup, Consumer<AdvancementEntry> consumer) {

        AdvancementEntry getPalladium = Advancement.Builder.create()
                .display(
                        ModItems.PALLADIUM_INGOT,
                        Text.literal("Get Palladium"),
                        Text.literal("Now try to get Palladium gear"),
                        Identifier.ofVanilla("textures/item/palladium_ingot.png"),
                        AdvancementFrame.TASK,
                        true,
                        false,
                        false
                )
                .criterion("get_palladium", InventoryChangedCriterion.Conditions.items(ModItems.PALLADIUM_INGOT))
                .build(consumer, Bettermc.MOD_ID + ":get_palladium");

        AdvancementEntry getPinkGarnet = Advancement.Builder.create()
                .display(
                        ModItems.PINK_GARNET,
                        Text.literal("Get Pink Garnet"),
                        Text.literal("Now try to get Pink Garnet gear"),
                        Identifier.ofVanilla("textures/item/pink_garnet.png"),
                        AdvancementFrame.TASK,
                        true,
                        false,
                        false
                )
                .criterion("get_pink_garnet", InventoryChangedCriterion.Conditions.items(ModItems.PINK_GARNET))
                .build(consumer, Bettermc.MOD_ID + ":get_pink_garnet");

        AdvancementEntry getFullSetofPinkGarnetArmor = Advancement.Builder.create()
                .display(
                        ModItems.PINK_GARNET_CHESTPLATE,
                        Text.literal("Get Full Set of Pink Garnet Armor"),
                        Text.literal("What does it feel?"),
                        Identifier.ofVanilla("textures/item/pink_garnet_chestplate.png"),
                        AdvancementFrame.TASK,
                        true,
                        false,
                        false
                )
                .criterion("get_pink_garnet_helmet", InventoryChangedCriterion.Conditions.items(ModItems.PINK_GARNET_HELMET))
                .criterion("get_pink_garnet_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.PINK_GARNET_CHESTPLATE))
                .criterion("get_pink_garnet_leggings", InventoryChangedCriterion.Conditions.items(ModItems.PINK_GARNET_LEGGINGS))
                .criterion("get_pink_garnet_boots", InventoryChangedCriterion.Conditions.items(ModItems.PINK_GARNET_BOOTS))
                .build(consumer, Bettermc.MOD_ID + ":get_full_set_of_pink_garnet_armor");



    }

}