package de.niklas.bettermc.datagen;

import de.niklas.bettermc.block.ModBlocks;
import de.niklas.bettermc.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PALLADIUM_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.PALLADIUM_DEEPSLATE_ORE)
                .add(ModBlocks.RAW_PALLADIUM_BLOCK)
                .add(ModBlocks.PINK_GARNET_SLAB);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PALLADIUM_BLOCK)
                .add(ModBlocks.PINK_GARNET_WALL);



        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PALLADIUM_DEEPSLATE_ORE)
                .add(ModBlocks.PALLADIUM_ORE);



        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.PINK_GARNET_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.PINK_GARNET_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.PINK_GARNET_WALL);


        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PINK_GARNET_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);


        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PALLADIUM_TOOL)
                .add(ModBlocks.PALLADIUM_DEEPSLATE_ORE)
                .add(ModBlocks.PALLADIUM_ORE)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

    }
}
