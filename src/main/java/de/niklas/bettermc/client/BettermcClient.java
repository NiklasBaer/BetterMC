package de.niklas.bettermc.client;

import de.niklas.bettermc.block.ModBlocks;
import de.niklas.bettermc.item.ModItemGroups;
import de.niklas.bettermc.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class BettermcClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
