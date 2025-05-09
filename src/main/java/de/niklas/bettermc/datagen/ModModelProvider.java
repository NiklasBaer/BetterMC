package de.niklas.bettermc.datagen;

import de.niklas.bettermc.block.ModBlocks;
import de.niklas.bettermc.client.Bettermc;
import de.niklas.bettermc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool pinkgarnetPool =  blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALLADIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALLADIUM_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PALLADIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PALLADIUM_BLOCK);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);

        pinkgarnetPool.slab(ModBlocks.PINK_GARNET_SLAB);
        pinkgarnetPool.stairs(ModBlocks.PINK_GARNET_STAIRS);

        pinkgarnetPool.fence(ModBlocks.PINK_GARNET_FENCE);
        pinkgarnetPool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);
        pinkgarnetPool.wall(ModBlocks.PINK_GARNET_WALL);

        pinkgarnetPool.button(ModBlocks.PINK_GARNET_BUTTON);
        pinkgarnetPool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALLADIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PALLADIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.PINK_GARNET_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PINK_GARNET_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PALLADIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PALLADIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PALLADIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PALLADIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PALLADIUM_HOE, Models.HANDHELD);




        itemModelGenerator.register(ModItems.PINK_GARNET_HORSE_ARMOR, Models.GENERATED);
        //itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);


        itemModelGenerator.registerArmor(ModItems.PINK_GARNET_HELMET, Identifier.of(Bettermc.MOD_ID, "pink_garnet"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(Bettermc.MOD_ID, "pink_garnet")).build(), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor(ModItems.PINK_GARNET_CHESTPLATE, Identifier.of(Bettermc.MOD_ID, "pink_garnet"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(Bettermc.MOD_ID, "pink_garnet")).build(), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor(ModItems.PINK_GARNET_LEGGINGS, Identifier.of(Bettermc.MOD_ID, "pink_garnet"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(Bettermc.MOD_ID, "pink_garnet")).build(), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor(ModItems.PINK_GARNET_BOOTS, Identifier.of(Bettermc.MOD_ID, "pink_garnet"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(Bettermc.MOD_ID, "pink_garnet")).build(), EquipmentSlot.FEET);



        itemModelGenerator.register(ModItems.BAR_BRAWL_MUSIC_DISC, Models.GENERATED);



    }
}
