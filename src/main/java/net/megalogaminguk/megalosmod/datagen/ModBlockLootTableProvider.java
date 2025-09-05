package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.block.custom.nature.crop.chilli.*;
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
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
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

        //Alloys
        //Alloys - Aluminium
        dropSelf(ModBlocks.AA_BLOCK.get());
        dropSelf(ModBlocks.AL_LI_BLOCK.get());
        dropSelf(ModBlocks.ALNICO_BLOCK.get());
        dropSelf(ModBlocks.ALUMINIUM_SCANDIUM_BLOCK.get());
        dropSelf(ModBlocks.BIRMABRIGHT_BLOCK.get());
        dropSelf(ModBlocks.DEVARDA_BLOCK.get());
        dropSelf(ModBlocks.DURALUMIN_BLOCK.get());
        dropSelf(ModBlocks.HIDUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.HYDRONALIUM_BLOCK.get());
        dropSelf(ModBlocks.ITALMA_BLOCK.get());
        dropSelf(ModBlocks.MAGNALIUM_BLOCK.get());
        dropSelf(ModBlocks.MAGNOX_BLOCK.get());
        dropSelf(ModBlocks.NAMBE_BLOCK.get());
        dropSelf(ModBlocks.NITIAL_BLOCK.get());
        dropSelf(ModBlocks.SILUMIN_BLOCK.get());
        dropSelf(ModBlocks.Y_ALLOY_BLOCK.get());
        dropSelf(ModBlocks.ZAMAK_BLOCK.get());

        //Beryllium
        dropSelf(ModBlocks.LOCKALLOY_BLOCK.get());

        //Bismuth
        dropSelf(ModBlocks.BISMANOL_BLOCK.get());
        dropSelf(ModBlocks.CERROBEND_BLOCK.get());
        dropSelf(ModBlocks.CERROSAFE_BLOCK.get());
        dropSelf(ModBlocks.FIELDS_METAL_BLOCK.get());
        dropSelf(ModBlocks.ROSE_METAL_BLOCK.get());
        dropSelf(ModBlocks.WOODS_METAL_BLOCK.get());

        //Chromium
        dropSelf(ModBlocks.CHROMIUM_HYDRIDE_BLOCK.get());
        dropSelf(ModBlocks.CRNISZWTI_BLOCK.get());
        dropSelf(ModBlocks.NICHROME_BLOCK.get());

        //Cobalt
        dropSelf(ModBlocks.ELGILOY_BLOCK.get());
        dropSelf(ModBlocks.MEGALLIUM_BLOCK.get());
        dropSelf(ModBlocks.STELLITE_BLOCK.get());
        dropSelf(ModBlocks.TALONITE_BLOCK.get());
        dropSelf(ModBlocks.ULTIMET_BLOCK.get());
        dropSelf(ModBlocks.VITALLIUM_BLOCK.get());

        //Copper
        dropSelf(ModBlocks.ALUMINIUM_BRONZE_BLOCK.get());
        dropSelf(ModBlocks.ARSENICAL_COPPER_BLOCK.get());
        dropSelf(ModBlocks.ARSENICAL_BRONZE_BLOCK.get());
        dropSelf(ModBlocks.BELL_METAL_BLOCK.get());
        dropSelf(ModBlocks.BERYLLIUM_COPPER_BLOCK.get());
        dropSelf(ModBlocks.BILLON_BLOCK.get());
        dropSelf(ModBlocks.BRASS_BLOCK.get());
        dropSelf(ModBlocks.BRONZE_BLOCK.get());
        dropSelf(ModBlocks.CALAMINE_BRASS_BLOCK.get());
        dropSelf(ModBlocks.CHINESE_SILVER_BLOCK.get());
        dropSelf(ModBlocks.CONSTANTAN_BLOCK.get());
        dropSelf(ModBlocks.COPPER_HYDRIDE_BLOCK.get());
        dropSelf(ModBlocks.COPPER_TUNGSTEN_BLOCK.get());
        dropSelf(ModBlocks.CORINTHIAN_BRONZE_BLOCK.get());
        dropSelf(ModBlocks.CUNIFE_BLOCK.get());
        dropSelf(ModBlocks.CUAG_BLOCK.get());
        dropSelf(ModBlocks.CYMBAL_ALLOY_BLOCK.get());
        dropSelf(ModBlocks.DUTCH_METAL_BLOCK.get());
        dropSelf(ModBlocks.FLORENTINE_BRONZE_BLOCK.get());
        dropSelf(ModBlocks.GILDING_METAL_BLOCK.get());
        dropSelf(ModBlocks.GLUCYDUR_BLOCK.get());
        dropSelf(ModBlocks.GUANIN_BLOCK.get());
        dropSelf(ModBlocks.GUN_METAL_BLOCK.get());
        dropSelf(ModBlocks.HEPATIZON_BLOCK.get());
        dropSelf(ModBlocks.MANGANIN_BLOCK.get());
        dropSelf(ModBlocks.MELCHIOR_BLOCK.get());
        dropSelf(ModBlocks.MUNTZ_METAL_BLOCK.get());
        dropSelf(ModBlocks.NICKEL_SILVER_BLOCK.get());
        dropSelf(ModBlocks.NORDIC_GOLD_BLOCK.get());
        dropSelf(ModBlocks.ORMOLU_BLOCK.get());
        dropSelf(ModBlocks.PHOSPHOR_BRONZE_BLOCK.get());
        dropSelf(ModBlocks.PINCHBECK_BLOCK.get());
        dropSelf(ModBlocks.PRINCES_METAL_BLOCK.get());
        dropSelf(ModBlocks.SHAKUDO_BLOCK.get());
        dropSelf(ModBlocks.SILICON_BRONZE_BLOCK.get());
        dropSelf(ModBlocks.SPECULUM_METAL_BLOCK.get());
        dropSelf(ModBlocks.TOMBAC_BLOCK.get());
        dropSelf(ModBlocks.TUMBAGA_BLOCK.get());
        dropSelf(ModBlocks.WHITE_BRONZE_BLOCK.get());

        //Gallium
        dropSelf(ModBlocks.AL_GA_BLOCK.get());
        dropSelf(ModBlocks.GALFENOL_BLOCK.get());
        dropSelf(ModBlocks.GALINSTAN_BLOCK.get());

        //Gold
        dropSelf(ModBlocks.COLORED_GOLD_BLOCK.get());
        dropSelf(ModBlocks.CROWN_GOLD_BLOCK.get());
        dropSelf(ModBlocks.ELECTRUM_BLOCK.get());
        dropSelf(ModBlocks.RHODITE_BLOCK.get());
        dropSelf(ModBlocks.ROSE_GOLD_BLOCK.get());
        dropSelf(ModBlocks.WHITE_GOLD_BLOCK.get());

        //Iron
        dropSelf(ModBlocks.ANTHRACITE_IRON_BLOCK.get());
        dropSelf(ModBlocks.BULAT_STEEL_BLOCK.get());
        dropSelf(ModBlocks.CAST_IRON_BLOCK.get());
        dropSelf(ModBlocks.CHROMOLY_BLOCK.get());
        dropSelf(ModBlocks.CRUCIBLE_STEEL_BLOCK.get());
        dropSelf(ModBlocks.DAMASCUS_STEEL_BLOCK.get());
        dropSelf(ModBlocks.DUCOL_BLOCK.get());
        dropSelf(ModBlocks.ELINVAR_BLOCK.get());
        dropSelf(ModBlocks.FERNICO_BLOCK.get());
        dropSelf(ModBlocks.FERROCHROMIUM_BLOCK.get());
        dropSelf(ModBlocks.FERROMAGNESIUM_BLOCK.get());
        dropSelf(ModBlocks.FERROMANGANESE_BLOCK.get());
        dropSelf(ModBlocks.FERROMOLYBDENUM_BLOCK.get());
        dropSelf(ModBlocks.FERRONICKEL_BLOCK.get());
        dropSelf(ModBlocks.FERROPHOSPHORUS_BLOCK.get());
        dropSelf(ModBlocks.FERROSILICON_BLOCK.get());
        dropSelf(ModBlocks.FERROTITANIUM_BLOCK.get());
        dropSelf(ModBlocks.FERROVANADIUM_BLOCK.get());
        dropSelf(ModBlocks.HIGHSPEED_STEEL_BLOCK.get());
        dropSelf(ModBlocks.HSLA_STEEL_BLOCK.get());
        dropSelf(ModBlocks.INVAR_BLOCK.get());
        dropSelf(ModBlocks.IRON_HYDRIDE_BLOCK.get());
        dropSelf(ModBlocks.KANTHAL_BLOCK.get());
        dropSelf(ModBlocks.KOVAR_BLOCK.get());
        dropSelf(ModBlocks.MARAGING_STEEL_BLOCK.get());
        dropSelf(ModBlocks.MUSHET_STEEL_BLOCK.get());
        dropSelf(ModBlocks.PIG_IRON_BLOCK.get());
        dropSelf(ModBlocks.REYNOLDS_FTO_BLOCK.get());
        dropSelf(ModBlocks.SILICON_STEEL_BLOCK.get());
        dropSelf(ModBlocks.SILVER_STEEL_BLOCK.get());
        dropSelf(ModBlocks.SPIEGELEISEN_BLOCK.get());
        dropSelf(ModBlocks.SPRING_STEEL_BLOCK.get());
        dropSelf(ModBlocks.STAINLESS_STEEL_BLOCK.get());
        dropSelf(ModBlocks.STABALLOY_BLOCK.get());
        dropSelf(ModBlocks.STEEL_BLOCK.get());
        dropSelf(ModBlocks.TOOL_STEEL_BLOCK.get());
        dropSelf(ModBlocks.WEATHERING_STEEL_BLOCK.get());
        dropSelf(ModBlocks.WOOTZ_STEEL_BLOCK.get());
        dropSelf(ModBlocks.WROUGHT_IRON_BLOCK.get());

        //Lead
        dropSelf(ModBlocks.MOLYBDOCHALKOS_BLOCK.get());
        dropSelf(ModBlocks.SOLDER_BLOCK.get());
        dropSelf(ModBlocks.TERNE_BLOCK.get());
        dropSelf(ModBlocks.TYPE_METAL_BLOCK.get());

        //Magnesium
        dropSelf(ModBlocks.ELEKTRON_BLOCK.get());
        dropSelf(ModBlocks.TMGALZN_BLOCK.get());

        //Manganese
        dropSelf(ModBlocks.MNFZ_BLOCK.get());
        dropSelf(ModBlocks.MNSZ_BLOCK.get());

        //Mercury
        dropSelf(ModBlocks.ZINC_AMALGAM_BLOCK.get());
        dropSelf(ModBlocks.ASHTADHATU_BLOCK.get());

        //Nickel
        dropSelf(ModBlocks.ALUMEL_BLOCK.get());
        dropSelf(ModBlocks.BRIGHTRAY_BLOCK.get());
        dropSelf(ModBlocks.CHROMEL_BLOCK.get());
        dropSelf(ModBlocks.COIN_SILVER_BLOCK.get());
        dropSelf(ModBlocks.COPPER_NICKEL_BLOCK.get());
        dropSelf(ModBlocks.CUPRONICKEL_BLOCK.get());
        dropSelf(ModBlocks.GERMAN_SILVER_BLOCK.get());
        dropSelf(ModBlocks.HASTELLOY_BLOCK.get());
        dropSelf(ModBlocks.HAUSLER_BLOCK.get());
        dropSelf(ModBlocks.INCONEL_BLOCK.get());
        dropSelf(ModBlocks.INCONEL_SES_BLOCK.get());
        dropSelf(ModBlocks.MONEL_METAL_BLOCK.get());
        dropSelf(ModBlocks.MU_METAL_BLOCK.get());
        dropSelf(ModBlocks.NICKEL_CARBON_BLOCK.get());
        dropSelf(ModBlocks.NICKEL_HYDRIDE_BLOCK.get());
        dropSelf(ModBlocks.NICROSIL_BLOCK.get());
        dropSelf(ModBlocks.NIMONIC_BLOCK.get());
        dropSelf(ModBlocks.NISIL_BLOCK.get());
        dropSelf(ModBlocks.NITINOL_BLOCK.get());
        dropSelf(ModBlocks.PERMALLOY_BLOCK.get());
        dropSelf(ModBlocks.SUPERMALLOY_BLOCK.get());

        //Potassium
        dropSelf(ModBlocks.KLI_BLOCK.get());
        dropSelf(ModBlocks.NAK_BLOCK.get());

        //Rhodium
        dropSelf(ModBlocks.PSEUDO_PALLADIUM_BLOCK.get());

        //Scandium
        dropSelf(ModBlocks.SCANDIUM_HYDRIDE_BLOCK.get());

        //Silver
        dropSelf(ModBlocks.ARGENTIUM_STERLING_SILVER_BLOCK.get());
        dropSelf(ModBlocks.BRITANNIA_SILVER_BLOCK.get());
        dropSelf(ModBlocks.DORE_BLOCK.get());
        dropSelf(ModBlocks.DYMALLOY_BLOCK.get());
        dropSelf(ModBlocks.GOLOID_BLOCK.get());
        dropSelf(ModBlocks.PLATINUM_SILVER_BLOCK.get());
        dropSelf(ModBlocks.SHIBUICHI_BLOCK.get());
        dropSelf(ModBlocks.STERLING_SILVER_BLOCK.get());
        dropSelf(ModBlocks.TIBETAN_SILVER_BLOCK.get());

        //Tin
        dropSelf(ModBlocks.BABBITT_BLOCK.get());
        dropSelf(ModBlocks.BRITANNIUM_BLOCK.get());
        dropSelf(ModBlocks.PEWTER_BLOCK.get());
        dropSelf(ModBlocks.QUEENS_METAL_BLOCK.get());

        //Titanium
        dropSelf(ModBlocks.BETA_C_BLOCK.get());
        dropSelf(ModBlocks.GUM_METAL_BLOCK.get());
        dropSelf(ModBlocks.SAL_FV_BLOCK.get());
        dropSelf(ModBlocks.TITANIUM_GOLD_BLOCK.get());
        dropSelf(ModBlocks.TITANIUM_HYDRIDE_BLOCK.get());
        dropSelf(ModBlocks.TITANIUM_NITRIDE_BLOCK.get());

        //Zirconium
        dropSelf(ModBlocks.ZIRCALOY_BLOCK.get());

        //Technology
        dropSelf(ModBlocks.PEDESTAL.get());
        dropSelf(ModBlocks.METALURGIC_FURNACE.get());

        LootItemCondition.Builder bhutItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.BHUT_JOLOKIA_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BhutJolokiaChilliCropBlock.AGE, 6));
        LootItemCondition.Builder birdsItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.BIRDS_EYE_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BirdsEyeChilliCropBlock.AGE, 6));
        LootItemCondition.Builder carolinaReaperItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.CAROLINA_REAPER_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CarolinaReaperChilliCropBlock.AGE, 6));
        LootItemCondition.Builder cayenneItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.CAYENNE_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CayenneChilliCropBlock.AGE, 6));
        LootItemCondition.Builder habaneroItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.HABANERO_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HabaneroChilliCropBlock.AGE, 6));
        LootItemCondition.Builder jalapenoItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.JALAPENO_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(JalapenoChilliCropBlock.AGE, 6));
        LootItemCondition.Builder nagaGhostItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.NAGA_GHOST_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(NagaGhostChilliCropBlock.AGE, 6));
        LootItemCondition.Builder padronItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.PADRON_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PadronChilliCropBlock.AGE, 6));
        LootItemCondition.Builder poblanoItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.POBLANO_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PoblanoChilliCropBlock.AGE, 6));
        LootItemCondition.Builder scotchBonnetItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.SCOTCH_BONNET_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ScotchBonnetChilliCropBlock.AGE, 6));
        LootItemCondition.Builder silingLabuyoItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.SILING_LABUYO_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SilingLabuyoChilliCropBlock.AGE, 6));
        LootItemCondition.Builder tabascoItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.TABASCO_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(TabascoChilliCropBlock.AGE, 6));
        LootItemCondition.Builder trinidadScorpionItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.TRINIDAD_SCORPION_CHILLI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(TrinidadScorpionChilliCropBlock.AGE, 6));

        this.add(ModBlocks.BHUT_JOLOKIA_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.BHUT_JOLOKIA_CHILLI_CROP.get(),
                ModItems.BHUT_JOLOKIA_CHILLI.get(), ModItems.BHUT_JOLOKIA_CHILLI_SEEDS.get(), bhutItemConditionBuilder));
        this.add(ModBlocks.BIRDS_EYE_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.BIRDS_EYE_CHILLI_CROP.get(),
                ModItems.BIRDS_EYE_CHILLI.get(), ModItems.BIRDS_EYE_CHILLI_SEEDS.get(), birdsItemConditionBuilder));
        this.add(ModBlocks.CAROLINA_REAPER_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.CAROLINA_REAPER_CHILLI_CROP.get(),
                ModItems.CAROLINA_REAPER_CHILLI.get(), ModItems.CAROLINA_REAPER_CHILLI_SEEDS.get(), carolinaReaperItemConditionBuilder));
        this.add(ModBlocks.CAYENNE_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.CAYENNE_CHILLI_CROP.get(),
                ModItems.CAYENNE_CHILLI.get(), ModItems.CAYENNE_CHILLI_SEEDS.get(), cayenneItemConditionBuilder));
        this.add(ModBlocks.HABANERO_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.HABANERO_CHILLI_CROP.get(),
                ModItems.HABANERO_CHILLI.get(), ModItems.HABANERO_CHILLI_SEEDS.get(), habaneroItemConditionBuilder));
        this.add(ModBlocks.JALAPENO_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.JALAPENO_CHILLI_CROP.get(),
                ModItems.JALAPENO_CHILLI.get(), ModItems.JALAPENO_CHILLI_SEEDS.get(), jalapenoItemConditionBuilder));
        this.add(ModBlocks.NAGA_GHOST_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.NAGA_GHOST_CHILLI_CROP.get(),
                ModItems.NAGA_GHOST_CHILLI.get(), ModItems.NAGA_GHOST_CHILLI_SEEDS.get(), nagaGhostItemConditionBuilder));
        this.add(ModBlocks.PADRON_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.PADRON_CHILLI_CROP.get(),
                ModItems.PADRON_CHILLI.get(), ModItems.PADRON_CHILLI_SEEDS.get(), padronItemConditionBuilder));
        this.add(ModBlocks.POBLANO_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.POBLANO_CHILLI_CROP.get(),
                ModItems.POBLANO_CHILLI.get(), ModItems.POBLANO_CHILLI_SEEDS.get(), poblanoItemConditionBuilder));
        this.add(ModBlocks.SCOTCH_BONNET_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.SCOTCH_BONNET_CHILLI_CROP.get(),
                ModItems.SCOTCH_BONNET_CHILLI.get(), ModItems.SCOTCH_BONNET_CHILLI_SEEDS.get(), scotchBonnetItemConditionBuilder));
        this.add(ModBlocks.SILING_LABUYO_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.SILING_LABUYO_CHILLI_CROP.get(),
                ModItems.SILING_LABUYO_CHILLI.get(), ModItems.SILING_LABUYO_CHILLI_SEEDS.get(), silingLabuyoItemConditionBuilder));
        this.add(ModBlocks.TABASCO_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.TABASCO_CHILLI_CROP.get(),
                ModItems.TABASCO_CHILLI.get(), ModItems.TABASCO_CHILLI_SEEDS.get(), tabascoItemConditionBuilder));
        this.add(ModBlocks.TRINIDAD_SCORPION_CHILLI_CROP.get(), this.createCropDrops(ModBlocks.TRINIDAD_SCORPION_CHILLI_CROP.get(),
                ModItems.TRINIDAD_SCORPION_CHILLI.get(), ModItems.TRINIDAD_SCORPION_CHILLI_SEEDS.get(), trinidadScorpionItemConditionBuilder));

        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);


        this.add(ModBlocks.GOOSEBERRY_BUSH.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.GOOSEBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(ModItems.GOOSEBERRY_BERRIES.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool().when(
                                LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.GOOSEBERRY_BUSH.get())
                                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                        ).add(LootItem.lootTableItem(ModItems.GOOSEBERRY_BERRIES.get()))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                        .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )));

        this.dropSelf(ModBlocks.BLACK_ASH_LOG.get());
        this.dropSelf(ModBlocks.BLACK_ASH_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BLACK_ASH_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BLACK_ASH_WOOD.get());
        this.dropSelf(ModBlocks.BLACK_ASH_SAPLING.get());
        this.dropSelf(ModBlocks.BLACK_ASH_PLANKS.get());

        this.add(ModBlocks.BLACK_ASH_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BLACK_ASH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.MAPLE_SVCAMORE_LOG.get());
        this.dropSelf(ModBlocks.MAPLE_SYCAMORE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MAPLE_SYCAMORE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MAPLE_SYCAMORE_WOOD.get());
        this.dropSelf(ModBlocks.MAPLE_SYCAMORE_SAPLING.get());
        this.dropSelf(ModBlocks.MAPLE_SYCAMORE_PLANKS.get());

        this.add(ModBlocks.MAPLE_SYCAMORE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.MAPLE_SYCAMORE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
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