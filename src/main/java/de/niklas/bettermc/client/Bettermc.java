package de.niklas.bettermc.client;

import de.niklas.bettermc.block.ModBlocks;
import de.niklas.bettermc.component.ModDataComponentTypes;
import de.niklas.bettermc.item.ModItemGroups;
import de.niklas.bettermc.item.ModItems;
import de.niklas.bettermc.sound.ModSounds;
import de.niklas.bettermc.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

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
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {

            if(entity instanceof SheepEntity sheepEntity) {

                if (player.getMainHandStack().getItem() == Items.END_ROD){

                    player.sendMessage(Text.literal("The Player just used the End Rod on a Sheep!"), true);
                    player.getMainHandStack().decrement(1);
                    sheepEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON , 600, 6));

                }

                return ActionResult.SUCCESS;

            }

            return ActionResult.PASS;

        });

    }
}
