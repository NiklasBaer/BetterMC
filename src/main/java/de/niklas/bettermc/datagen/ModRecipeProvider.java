package de.niklas.bettermc.datagen;

import de.niklas.bettermc.block.ModBlocks;
import de.niklas.bettermc.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);


                offerSmelting(
                        List.of(ModItems.RAW_PINK_GARNET),
                        RecipeCategory.FOOD,
                        ModItems.PINK_GARNET,
                        0.7f,
                        200,
                        "pink_garnet"
                );

                offerSmelting(
                        List.of(ModItems.RAW_PALLADIUM),
                        RecipeCategory.FOOD,
                        ModItems.PALLADIUM_INGOT,
                        0.7f,
                        200,
                        "palladium_ingot"
                );

                offerBlasting(
                        List.of(ModItems.RAW_PINK_GARNET),
                        RecipeCategory.FOOD,
                        ModItems.PINK_GARNET,
                        0.7f,
                        100,
                        "pink_garnet"
                );
                offerBlasting(
                        List.of(ModItems.RAW_PALLADIUM),
                        RecipeCategory.FOOD,
                        ModItems.PALLADIUM_INGOT,
                        0.7f,
                        100,
                        "palladium_ingot"
                );

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_BLOCK, 1)
                        .input(ModItems.PINK_GARNET, 9)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_GARNET, 9)
                        .input(ModBlocks.PINK_GARNET_BLOCK)
                        .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_PINK_GARNET_BLOCK)
                        .input(ModItems.RAW_PINK_GARNET, 9)
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PINK_GARNET,9)
                        .input(ModBlocks.PINK_GARNET_BLOCK)
                        .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALLADIUM_BLOCK, 1)
                        .input(ModItems.PALLADIUM_INGOT, 9)
                        .criterion(hasItem(ModItems.PALLADIUM_INGOT), conditionsFromItem(ModItems.PALLADIUM_INGOT))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.PALLADIUM_INGOT, 9)
                        .input(ModBlocks.PALLADIUM_BLOCK)
                        .criterion(hasItem(ModBlocks.PALLADIUM_BLOCK), conditionsFromItem(ModBlocks.PALLADIUM_BLOCK))
                        .offerTo(exporter);


                createShaped(RecipeCategory.MISC, ModItems.PINK_GARNET_SWORD, 1)
                        .input('#', ModItems.PINK_GARNET)
                        .input('X', Items.STICK)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" X ")
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PINK_GARNET_PICKAXE, 1)
                        .input('#', ModItems.PINK_GARNET)
                        .input('X', Items.STICK)
                        .pattern("###")
                        .pattern(" X ")
                        .pattern(" X ")
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PINK_GARNET_SHOVEL, 1)
                        .input('#', ModItems.PINK_GARNET)
                        .input('X', Items.STICK)
                        .pattern(" # ")
                        .pattern(" X ")
                        .pattern(" X ")
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PINK_GARNET_AXE, 1)
                        .input('#', ModItems.PINK_GARNET)
                        .input('X', Items.STICK)
                        .pattern(" ##")
                        .pattern(" X#")
                        .pattern(" X ")
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PINK_GARNET_HOE, 1)
                        .input('#', ModItems.PINK_GARNET)
                        .input('X', Items.STICK)
                        .pattern(" ##")
                        .pattern(" X ")
                        .pattern(" X ")
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PINK_GARNET_HAMMER, 1)
                        .input('#', ModBlocks.PINK_GARNET_BLOCK)
                        .input('X', Items.STICK)
                        .pattern("###")
                        .pattern("###")
                        .pattern(" X ")
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PINK_GARNET_HELMET, 1)
                        .input('#', ModItems.PINK_GARNET)
                        .pattern("###")
                        .pattern("# #")
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PINK_GARNET_CHESTPLATE, 1)
                        .input('#', ModItems.PINK_GARNET)
                        .pattern("# #")
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PINK_GARNET_LEGGINGS, 1)
                        .input('#', ModItems.PINK_GARNET)
                        .pattern("###")
                        .pattern("# #")
                        .pattern("# #")
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PINK_GARNET_BOOTS, 1)
                        .input('#', ModItems.PINK_GARNET)
                        .pattern("# #")
                        .pattern("# #")
                        .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PALLADIUM_SWORD, 1)
                        .input('#', ModItems.PALLADIUM_INGOT)
                        .input('X', Items.IRON_SWORD)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" X ")
                        .criterion(hasItem(ModItems.PALLADIUM_INGOT), conditionsFromItem(ModItems.PALLADIUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PALLADIUM_PICKAXE, 1)
                        .input('#', ModItems.PALLADIUM_INGOT)
                        .input('X', Items.IRON_PICKAXE)
                        .pattern("###")
                        .pattern(" X ")
                        .pattern(" # ")
                        .criterion(hasItem(ModItems.PALLADIUM_INGOT), conditionsFromItem(ModItems.PALLADIUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PALLADIUM_SHOVEL, 1)
                        .input('#', ModItems.PALLADIUM_INGOT)
                        .input('X', Items.IRON_SHOVEL)
                        .pattern(" # ")
                        .pattern(" X ")
                        .pattern(" # ")
                        .criterion(hasItem(ModItems.PALLADIUM_INGOT), conditionsFromItem(ModItems.PALLADIUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PALLADIUM_AXE, 1)
                        .input('#', ModItems.PALLADIUM_INGOT)
                        .input('X', Items.IRON_AXE)
                        .pattern(" ##")
                        .pattern(" X#")
                        .pattern(" # ")
                        .criterion(hasItem(ModItems.PALLADIUM_INGOT), conditionsFromItem(ModItems.PALLADIUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.PALLADIUM_HOE, 1)
                        .input('#', ModItems.PALLADIUM_INGOT)
                        .input('X', Items.IRON_HOE)
                        .pattern(" ##")
                        .pattern(" X ")
                        .pattern(" # ")
                        .criterion(hasItem(ModItems.PALLADIUM_INGOT), conditionsFromItem(ModItems.PALLADIUM_INGOT))
                        .offerTo(exporter);


                offerNetheriteUpgradeRecipe(Items.IRON_SWORD, RecipeCategory.TOOLS, ModItems.PALLADIUM_SWORD);
            }
        };
    }



    @Override
    public String getName() {
        return "ModRecipesProvider";
    }
}