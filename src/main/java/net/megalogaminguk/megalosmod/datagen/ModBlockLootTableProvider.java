package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.block.custom.cropblocks.chilli.BhutJolokiaChilliCropBlock;
import net.megalogaminguk.megalosmod.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate(){
        //Ore
        add(ModBlocks.ALUMINIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get(), 4, 8));
        add(ModBlocks.ANTIMONY_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ANTIMONY_ORE.get(), ModItems.RAW_ANTIMONY.get(), 4, 8));
        add(ModBlocks.ARSENIC_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ARSENIC_ORE.get(), ModItems.RAW_ARSENIC.get(), 4, 8));
        add(ModBlocks.BARIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.BARIUM_ORE.get(), ModItems.RAW_BARIUM.get(), 4, 8));
        add(ModBlocks.BERYLLIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.BERYLLIUM_ORE.get(), ModItems.RAW_BERYLLIUM.get(), 4, 8));

        add(ModBlocks.BISMUTH_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.BISMUTH_ORE.get(), ModItems.RAW_BISMUTH.get(), 4, 8));
        add(ModBlocks.CADMIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.CADMIUM_ORE.get(), ModItems.RAW_CADMIUM.get(), 4, 8));
        add(ModBlocks.CAESIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.CAESIUM_ORE.get(), ModItems.RAW_CAESIUM.get(), 4, 8));
        add(ModBlocks.CALCIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.CALCIUM_ORE.get(), ModItems.RAW_CALCIUM.get(), 4, 8));
        add(ModBlocks.CHROMIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.CHROMIUM_ORE.get(), ModItems.RAW_CHROMIUM.get(), 4, 8));

        add(ModBlocks.CINNABAR_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.CINNABAR_ORE.get(), ModItems.RAW_CINNABAR.get(), 4, 8));
        add(ModBlocks.COBALT_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.COBALT_ORE.get(), ModItems.RAW_COBALT.get(), 4, 8));
        add(ModBlocks.GALLIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.GALLIUM_ORE.get(), ModItems.RAW_GALLIUM.get(), 4, 8));
        add(ModBlocks.GERMANIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.GERMANIUM_ORE.get(), ModItems.RAW_GERMANIUM.get(), 4, 8));
        add(ModBlocks.HAFNIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HAFNIUM_ORE.get(), ModItems.RAW_HAFNIUM.get(), 4, 8));

        add(ModBlocks.INDIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.INDIUM_ORE.get(), ModItems.RAW_INDIUM.get(), 4, 8));
        add(ModBlocks.IRIDIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.IRIDIUM_ORE.get(), ModItems.RAW_IRIDIUM.get(), 4, 8));
        add(ModBlocks.LEAD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get(), 4, 8));
        add(ModBlocks.LITHIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.LITHIUM_ORE.get(), ModItems.RAW_LITHIUM.get(),4,8));
        add(ModBlocks.MAGNESIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.MAGNESIUM_ORE.get(), ModItems.RAW_MAGNESIUM.get(), 4, 8));

        add(ModBlocks.MANGANESE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.MANGANESE_ORE.get(), ModItems.RAW_MANGANESE.get(), 4, 8));
        add(ModBlocks.MOLYBDENUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.MOLYBDENUM_ORE.get(), ModItems.RAW_MOLYBDENUM.get(), 4, 8));
        add(ModBlocks.NICKEL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NICKEL_ORE.get(), ModItems.RAW_NICKEL.get(), 4, 8));
        add(ModBlocks.NIOBIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.NIOBIUM_ORE.get(), ModItems.RAW_NIOBIUM.get(), 4, 8));
        add(ModBlocks.OSMIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.OSMIUM_ORE.get(), ModItems.RAW_OSMIUM.get(), 4, 8));

        add(ModBlocks.PALLADIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.PALLADIUM_ORE.get(), ModItems.RAW_PALLADIUM.get(), 4, 8));
        add(ModBlocks.PHOSPHORUS_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.PHOSPHORUS_ORE.get(), ModItems.RAW_PHOSPHORUS.get(), 4, 8));
        add(ModBlocks.PLATINUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get(), 4, 8));
        add(ModBlocks.POTASSIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.POTASSIUM_ORE.get(), ModItems.RAW_POTASSIUM.get(), 4, 8));
        add(ModBlocks.RHENIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RHENIUM_ORE.get(), ModItems.RAW_RHENIUM.get(), 4, 8));

        add(ModBlocks.RHODIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RHODIUM_ORE.get(), ModItems.RAW_RHODIUM.get(), 4, 8));
        add(ModBlocks.RUBIDIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUBIDIUM_ORE.get(), ModItems.RAW_RUBIDIUM.get(),4,8));
        add(ModBlocks.RUTHENIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUTHENIUM_ORE.get(), ModItems.RAW_RUTHENIUM.get(), 4, 8));
        add(ModBlocks.SCANDIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SCANDIUM_ORE.get(), ModItems.RAW_SCANDIUM.get(),4,8));
        add(ModBlocks.SELENIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SELENIUM_ORE.get(), ModItems.RAW_SELENIUM.get(), 4, 8));

        add(ModBlocks.SILICON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SILICON_ORE.get(), ModItems.RAW_SILICON.get(), 4, 8));
        add(ModBlocks.SILVER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get(), 4, 8));
        add(ModBlocks.SODIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SODIUM_ORE.get(), ModItems.RAW_SODIUM.get(), 4, 8));
        add(ModBlocks.STRONTIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.STRONTIUM_ORE.get(), ModItems.RAW_STRONTIUM.get(),4,8));
        add(ModBlocks.TANTALUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TANTALUM_ORE.get(), ModItems.RAW_TANTALUM.get(),4,8));

        add(ModBlocks.TECHNETIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TECHNETIUM_ORE.get(), ModItems.RAW_TECHNETIUM.get(), 4, 8));
        add(ModBlocks.TELLURIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TELLURIUM_ORE.get(), ModItems.RAW_TELLURIUM.get(), 4, 8));
        add(ModBlocks.THALLIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.THALLIUM_ORE.get(), ModItems.RAW_THALLIUM.get(), 4, 8));
        add(ModBlocks.TIN_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get(), 4, 8));
        add(ModBlocks.TITANIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get(), 4, 8));

        add(ModBlocks.TUNGSTEN_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get(), 4, 8));
        add(ModBlocks.VANADIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.VANADIUM_ORE.get(), ModItems.RAW_VANADIUM.get(),4,8));
        add(ModBlocks.YTTRIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.YTTRIUM_ORE.get(), ModItems.RAW_YTTRIUM.get(),4,8));
        add(ModBlocks.ZINC_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ZINC_ORE.get(), ModItems.RAW_ZINC.get(), 4, 8));
        add(ModBlocks.ZIRCONIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ZIRCONIUM_ORE.get(), ModItems.RAW_ZIRCONIUM.get(), 4, 8));

        //Blocks
        dropSelf(ModBlocks.ALUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.ANTIMONY_BLOCK.get());
        dropSelf(ModBlocks.ARSENIC_BLOCK.get());
        dropSelf(ModBlocks.BARIUM_BLOCK.get());
        dropSelf(ModBlocks.BERYLLIUM_BLOCK.get());
        dropSelf(ModBlocks.BISMUTH_BLOCK.get());
        dropSelf(ModBlocks.CADMIUM_BLOCK.get());
        dropSelf(ModBlocks.CAESIUM_BLOCK.get());
        dropSelf(ModBlocks.CALCIUM_BLOCK.get());
        dropSelf(ModBlocks.CHROMIUM_BLOCK.get());
        dropSelf(ModBlocks.CINNABAR_BLOCK.get());
        dropSelf(ModBlocks.COBALT_BLOCK.get());
        dropSelf(ModBlocks.GALLIUM_BLOCK.get());
        dropSelf(ModBlocks.GERMANIUM_BLOCK.get());
        dropSelf(ModBlocks.HAFNIUM_BLOCK.get());
        dropSelf(ModBlocks.INDIUM_BLOCK.get());
        dropSelf(ModBlocks.IRIDIUM_BLOCK.get());
        dropSelf(ModBlocks.LEAD_BLOCK.get());
        dropSelf(ModBlocks.LITHIUM_BLOCK.get());
        dropSelf(ModBlocks.MAGNESIUM_BLOCK.get());
        dropSelf(ModBlocks.MANGANESE_BLOCK.get());
        dropSelf(ModBlocks.MOLYBDENUM_BLOCK.get());
        dropSelf(ModBlocks.NICKEL_BLOCK.get());
        dropSelf(ModBlocks.NIOBIUM_BLOCK.get());
        dropSelf(ModBlocks.OSMIUM_BLOCK.get());
        dropSelf(ModBlocks.PALLADIUM_BLOCK.get());
        dropSelf(ModBlocks.PHOSPHORUS_BLOCK.get());
        dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        dropSelf(ModBlocks.POTASSIUM_BLOCK.get());
        dropSelf(ModBlocks.RHENIUM_BLOCK.get());
        dropSelf(ModBlocks.RHODIUM_BLOCK.get());
        dropSelf(ModBlocks.RUBIDIUM_BLOCK.get());
        dropSelf(ModBlocks.RUTHENIUM_BLOCK.get());
        dropSelf(ModBlocks.SCANDIUM_BLOCK.get());
        dropSelf(ModBlocks.SELENIUM_BLOCK.get());
        dropSelf(ModBlocks.SILICON_BLOCK.get());
        dropSelf(ModBlocks.SILVER_BLOCK.get());
        dropSelf(ModBlocks.SODIUM_BLOCK.get());
        dropSelf(ModBlocks.STRONTIUM_BLOCK.get());
        dropSelf(ModBlocks.TANTALUM_BLOCK.get());
        dropSelf(ModBlocks.TECHNETIUM_BLOCK.get());
        dropSelf(ModBlocks.TELLURIUM_BLOCK.get());
        dropSelf(ModBlocks.THALLIUM_BLOCK.get());
        dropSelf(ModBlocks.TIN_BLOCK.get());
        dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());
        dropSelf(ModBlocks.VANADIUM_BLOCK.get());
        dropSelf(ModBlocks.YTTRIUM_BLOCK.get());
        dropSelf(ModBlocks.ZINC_BLOCK.get());
        dropSelf(ModBlocks.ZIRCONIUM_BLOCK.get());

        //Raw Blocks
        dropSelf(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_ANTIMONY_BLOCK.get());
        dropSelf(ModBlocks.RAW_ARSENIC_BLOCK.get());
        dropSelf(ModBlocks.RAW_BARIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_BERYLLIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_BISMUTH_BLOCK.get());
        dropSelf(ModBlocks.RAW_CADMIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_CAESIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_CALCIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_CHROMIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_CINNABAR_BLOCK.get());
        dropSelf(ModBlocks.RAW_COBALT_BLOCK.get());
        dropSelf(ModBlocks.RAW_GALLIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_GERMANIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_HAFNIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_INDIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_IRIDIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(ModBlocks.RAW_LITHIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_MAGNESIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_MANGANESE_BLOCK.get());
        dropSelf(ModBlocks.RAW_MOLYBDENUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_NICKEL_BLOCK.get());
        dropSelf(ModBlocks.RAW_NIOBIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_OSMIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_PALLADIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_PHOSPHORUS_BLOCK.get());
        dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_POTASSIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_RHENIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_RHODIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_RUBIDIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_RUTHENIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_SCANDIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_SELENIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_SILICON_BLOCK.get());
        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        dropSelf(ModBlocks.RAW_SODIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_STRONTIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_TANTALUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_TECHNETIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_TELLURIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_THALLIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        dropSelf(ModBlocks.RAW_TITANIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_TUNGSTEN_BLOCK.get());
        dropSelf(ModBlocks.RAW_VANADIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_YTTRIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_ZINC_BLOCK.get());
        dropSelf(ModBlocks.RAW_ZIRCONIUM_BLOCK.get());

        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.BHUT_JOLOKIA_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BhutJolokiaChilliCropBlock.AGE, 6));

        this.add(ModBlocks.BHUT_JOLOKIA_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.BHUT_JOLOKIA_CHILLI_CROP.get(),
                ModItems.BHUT_JOLOKIA_CHILLI.get(), ModItems.BHUT_JOLOKIA_CHILLI_SEEDS.get(), lootItemConditionBuilder));
}

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}