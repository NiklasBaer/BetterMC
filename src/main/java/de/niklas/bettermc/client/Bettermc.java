package de.niklas.bettermc.client;

import de.niklas.bettermc.block.ModBlocks;
import de.niklas.bettermc.component.ModDataComponentTypes;
import de.niklas.bettermc.item.ModItemGroups;
import de.niklas.bettermc.item.ModItems;
import de.niklas.bettermc.sound.ModSounds;
import de.niklas.bettermc.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

public class Bettermc implements ModInitializer {

    public static final String MOD_ID = "bettermc";

    @Override
    public void onInitialize() {

        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModDataComponentTypes.registerDataComponentTypes();
        ModSounds.registerSounds();

        PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
    }
}
