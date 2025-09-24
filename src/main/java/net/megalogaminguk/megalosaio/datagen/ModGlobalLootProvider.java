package net.megalogaminguk.megalosaio.datagen;

import net.megalogaminguk.megalosaio.MegalosAIO;
import net.megalogaminguk.megalosaio.item.ModItems;
import net.megalogaminguk.megalosaio.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootProvider extends GlobalLootModifierProvider {
    public ModGlobalLootProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, MegalosAIO.MOD_ID);
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

        this.add("horse_carcass_from_horse_drops",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/horse")).build()
                }, ModItems.HORSE_CARCASS.get()));

        this.add("frog_carcass_from_frog_drops",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/frog")).build()
                }, ModItems.FROG_CARCASS.get()));

        this.add("goat_carcass_from_goat_drops",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/goat")).build()
                }, ModItems.GOAT_CARCASS.get()));

        this.add("squid_carcass_from_squid_drops",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/squid")).build()
                }, ModItems.SQUID_CARCASS.get()));

        this.add("turtle_carcass_from_turtle_drops",
                new AddItemModifier(new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/turtle")).build()
                }, ModItems.TURTLE_CARCASS.get()));
    }
}
