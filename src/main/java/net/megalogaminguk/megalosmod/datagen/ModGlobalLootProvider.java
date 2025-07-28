package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.item.ModItems;
import net.megalogaminguk.megalosmod.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootProvider extends GlobalLootModifierProvider {
    public ModGlobalLootProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, MegalosMod.MOD_ID);
    }

    @Override
    protected void start() {
        this.add("beef_carcass_from_cow_drops",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cow")).build()
                }, ModItems.BEEF_CARCASS.get()));

        this.add("mutton_carcass_from_sheep_drops",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/sheep")).build()
                }, ModItems.MUTTON_CARCASS.get()));

        this.add("pork_carcass_from_pig_drops",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/pig")).build()
                }, ModItems.PORK_CARCASS.get()));
    }
}
