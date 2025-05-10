package net.megalogaminguk.megalosmod.item;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.item.tools.ModToolTiers;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MegalosMod.MOD_ID);

    //Metallurgy - Ingots
    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANTIMONY_INGOT = ITEMS.register("antimony_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARSENIC_INGOT = ITEMS.register("arsenic_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BARIUM_INGOT = ITEMS.register("barium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_INGOT = ITEMS.register("beryllium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BISMUTH_INGOT = ITEMS.register("bismuth_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CADMIUM_INGOT = ITEMS.register("cadmium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALCIUM_INGOT = ITEMS.register("calcium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAESIUM_INGOT = ITEMS.register("caesium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CINNABAR_INGOT = ITEMS.register("cinnabar_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GERMANIUM_INGOT = ITEMS.register("germanium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GALLIUM_INGOT = ITEMS.register("gallium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAFNIUM_INGOT = ITEMS.register("hafnium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INDIUM_INGOT = ITEMS.register("indium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOLYBDENUM_INGOT = ITEMS.register("molybdenum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIOBIUM_INGOT = ITEMS.register("niobium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHOSPHORUS_INGOT = ITEMS.register("phosphorus_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POTASSIUM_INGOT = ITEMS.register("potassium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHENIUM_INGOT = ITEMS.register("rhenium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHODIUM_INGOT = ITEMS.register("rhodium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBIDIUM_INGOT = ITEMS.register("rubidium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUTHENIUM_INGOT = ITEMS.register("ruthenium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCANDIUM_INGOT = ITEMS.register("scandium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SELENIUM_INGOT = ITEMS.register("selenium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_INGOT = ITEMS.register("silicon_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_INGOT = ITEMS.register("sodium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONTIUM_INGOT = ITEMS.register("strontium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TANTALUM_INGOT = ITEMS.register("tantalum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TECHNETIUM_INGOT = ITEMS.register("technetium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TELLURIUM_INGOT = ITEMS.register("tellurium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THALLIUM_INGOT = ITEMS.register("thallium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VANADIUM_INGOT = ITEMS.register("vanadium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YTTRIUM_INGOT = ITEMS.register("yttrium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCONIUM_INGOT = ITEMS.register("zirconium_ingot", () -> new Item(new Item.Properties()));

    //Metallurgy - Nuggets
    public static final DeferredItem<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANTIMONY_NUGGET = ITEMS.register("antimony_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARSENIC_NUGGET = ITEMS.register("arsenic_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BARIUM_NUGGET = ITEMS.register("barium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_NUGGET = ITEMS.register("beryllium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BISMUTH_NUGGET = ITEMS.register("bismuth_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CADMIUM_NUGGET = ITEMS.register("cadmium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALCIUM_NUGGET = ITEMS.register("calcium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAESIUM_NUGGET = ITEMS.register("caesium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMIUM_NUGGET = ITEMS.register("chromium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CINNABAR_NUGGET = ITEMS.register("cinnabar_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GERMANIUM_NUGGET = ITEMS.register("germanium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GALLIUM_NUGGET = ITEMS.register("gallium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAFNIUM_NUGGET = ITEMS.register("hafnium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INDIUM_NUGGET = ITEMS.register("indium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_NUGGET = ITEMS.register("lithium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_NUGGET = ITEMS.register("magnesium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_NUGGET = ITEMS.register("manganese_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOLYBDENUM_NUGGET = ITEMS.register("molybdenum_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIOBIUM_NUGGET = ITEMS.register("niobium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALLADIUM_NUGGET = ITEMS.register("palladium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHOSPHORUS_NUGGET = ITEMS.register("phosphorus_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POTASSIUM_NUGGET = ITEMS.register("potassium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHENIUM_NUGGET = ITEMS.register("rhenium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHODIUM_NUGGET = ITEMS.register("rhodium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBIDIUM_NUGGET = ITEMS.register("rubidium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUTHENIUM_NUGGET = ITEMS.register("ruthenium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCANDIUM_NUGGET = ITEMS.register("scandium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SELENIUM_NUGGET = ITEMS.register("selenium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_NUGGET = ITEMS.register("silicon_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_NUGGET = ITEMS.register("sodium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONTIUM_NUGGET = ITEMS.register("strontium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TANTALUM_NUGGET = ITEMS.register("tantalum_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TECHNETIUM_NUGGET = ITEMS.register("technetium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TELLURIUM_NUGGET = ITEMS.register("tellurium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THALLIUM_NUGGET = ITEMS.register("thallium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VANADIUM_NUGGET = ITEMS.register("vanadium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YTTRIUM_NUGGET = ITEMS.register("yttrium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCONIUM_NUGGET = ITEMS.register("zirconium_nugget", () -> new Item(new Item.Properties()));

    //Metallurgy - Dust
    public static final DeferredItem<Item> ALUMINIUM_DUST = ITEMS.register("aluminium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANTIMONY_DUST = ITEMS.register("antimony_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARSENIC_DUST = ITEMS.register("arsenic_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BARIUM_DUST = ITEMS.register("barium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_DUST = ITEMS.register("beryllium_dust", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BISMUTH_DUST = ITEMS.register("bismuth_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CADMIUM_DUST = ITEMS.register("cadmium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALCIUM_DUST = ITEMS.register("calcium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAESIUM_DUST = ITEMS.register("caesium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMIUM_DUST = ITEMS.register("chromium_dust", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CINNABAR_DUST = ITEMS.register("cinnabar_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_DUST = ITEMS.register("cobalt_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GERMANIUM_DUST = ITEMS.register("germanium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GALLIUM_DUST = ITEMS.register("gallium_dust", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HAFNIUM_DUST = ITEMS.register("hafnium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INDIUM_DUST = ITEMS.register("indium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRIDIUM_DUST = ITEMS.register("iridium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_DUST = ITEMS.register("lead_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_DUST = ITEMS.register("lithium_dust", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MAGNESIUM_DUST = ITEMS.register("magnesium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_DUST = ITEMS.register("manganese_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOLYBDENUM_DUST = ITEMS.register("molybdenum_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_DUST = ITEMS.register("nickel_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIOBIUM_DUST = ITEMS.register("niobium_dust", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OSMIUM_DUST = ITEMS.register("osmium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALLADIUM_DUST = ITEMS.register("palladium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHOSPHORUS_DUST = ITEMS.register("phosphorus_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_DUST = ITEMS.register("platinum_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POTASSIUM_DUST = ITEMS.register("potassium_dust", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RHENIUM_DUST = ITEMS.register("rhenium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHODIUM_DUST = ITEMS.register("rhodium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBIDIUM_DUST = ITEMS.register("rubidium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUTHENIUM_DUST = ITEMS.register("ruthenium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCANDIUM_DUST = ITEMS.register("scandium_dust", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SELENIUM_DUST = ITEMS.register("selenium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_DUST = ITEMS.register("silicon_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_DUST = ITEMS.register("silver_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_DUST = ITEMS.register("sodium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONTIUM_DUST = ITEMS.register("strontium_dust", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TANTALUM_DUST = ITEMS.register("tantalum_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TECHNETIUM_DUST = ITEMS.register("technetium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TELLURIUM_DUST = ITEMS.register("tellurium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THALLIUM_DUST = ITEMS.register("thallium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_DUST = ITEMS.register("tin_dust", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TITANIUM_DUST = ITEMS.register("titanium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_DUST = ITEMS.register("tungsten_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VANADIUM_DUST = ITEMS.register("vanadium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YTTRIUM_DUST = ITEMS.register("yttrium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_DUST = ITEMS.register("zinc_dust", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ZIRCONIUM_DUST = ITEMS.register("zirconium_dust", () -> new Item(new Item.Properties()));

    //Metallurgy - Raw Blocks
    public static final DeferredItem<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ANTIMONY = ITEMS.register("raw_antimony", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ARSENIC = ITEMS.register("raw_arsenic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BARIUM = ITEMS.register("raw_barium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BERYLLIUM = ITEMS.register("raw_beryllium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CADMIUM = ITEMS.register("raw_cadmium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CALCIUM = ITEMS.register("raw_calcium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CAESIUM = ITEMS.register("raw_caesium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CHROMIUM = ITEMS.register("raw_chromium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CINNABAR = ITEMS.register("raw_cinnabar", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_COBALT = ITEMS.register("raw_cobalt", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_GERMANIUM = ITEMS.register("raw_germanium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_GALLIUM = ITEMS.register("raw_gallium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_HAFNIUM = ITEMS.register("raw_hafnium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_INDIUM = ITEMS.register("raw_indium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LITHIUM = ITEMS.register("raw_lithium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MANGANESE = ITEMS.register("raw_manganese", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MOLYBDENUM = ITEMS.register("raw_molybdenum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_NICKEL = ITEMS.register("raw_nickel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_NIOBIUM = ITEMS.register("raw_niobium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_OSMIUM = ITEMS.register("raw_osmium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_PALLADIUM = ITEMS.register("raw_palladium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_PHOSPHORUS = ITEMS.register("raw_phosphorus", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_POTASSIUM = ITEMS.register("raw_potassium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_RHENIUM = ITEMS.register("raw_rhenium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_RHODIUM = ITEMS.register("raw_rhodium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_RUBIDIUM = ITEMS.register("raw_rubidium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_RUTHENIUM = ITEMS.register("raw_ruthenium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SCANDIUM = ITEMS.register("raw_scandium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SELENIUM = ITEMS.register("raw_selenium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SILICON = ITEMS.register("raw_silicon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SODIUM = ITEMS.register("raw_sodium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_STRONTIUM = ITEMS.register("raw_strontium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TANTALUM = ITEMS.register("raw_tantalum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TECHNETIUM = ITEMS.register("raw_technetium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TELLURIUM = ITEMS.register("raw_tellurium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_THALLIUM = ITEMS.register("raw_thallium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TITANIUM = ITEMS.register("raw_titanium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_VANADIUM = ITEMS.register("raw_vanadium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_YTTRIUM = ITEMS.register("raw_yttrium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ZINC = ITEMS.register("raw_zinc", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ZIRCONIUM = ITEMS.register("raw_zirconium", () -> new Item(new Item.Properties()));

    //Alloys - Ingots
    public static final DeferredItem<Item> AA_INGOT = ITEMS.register("al_aa_ingot",
            () -> new Item(new Item.Properties()));
    //Alloys - Nuggets
    public static final DeferredItem<Item> AA_NUGGET = ITEMS.register("al_aa_nugget",
            () -> new Item(new Item.Properties()));
    //Alloys - Dust
    public static final DeferredItem<Item> AA_DUST = ITEMS.register("al_aa_dust",
            () -> new Item(new Item.Properties()));

    //Hoplology - Tools
    public static final DeferredItem<SwordItem> ALUMINIUM_SWORD = ITEMS.register("aluminium_sword",
            () -> new SwordItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.ALUMINIUM, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> ALUMINIUM_PICKAXE = ITEMS.register("aluminium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.ALUMINIUM, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> ALUMINIUM_SHOVEL = ITEMS.register("aluminium_shovel",
            () -> new ShovelItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.ALUMINIUM, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> ALUMINIUM_AXE = ITEMS.register("aluminium_axe",
            () -> new AxeItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ALUMINIUM, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> ALUMINIUM_HOE = ITEMS.register("aluminium_hoe",
            () -> new HoeItem(ModToolTiers.ALUMINIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.ALUMINIUM, 0F, -3.0f))));

    public static final DeferredItem<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SILVER, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SILVER, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SILVER, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SILVER, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SILVER, 0F, -3.0f))));

    public static final DeferredItem<SwordItem> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModToolTiers.TITANIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.TITANIUM, 5, -2.4f))));
    public static final DeferredItem<PickaxeItem> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TITANIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.TITANIUM, 1.0F, -2.8f))));
    public static final DeferredItem<ShovelItem> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModToolTiers.TITANIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.TITANIUM, 1.5F, -3.0f))));
    public static final DeferredItem<AxeItem> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModToolTiers.TITANIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.TITANIUM, 6.0F, -3.2f))));
    public static final DeferredItem<HoeItem> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModToolTiers.TITANIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.TITANIUM, 0F, -3.0f))));

    //Hoplology - Armor
    public static final DeferredItem<ArmorItem> ALUMINIUM_HELMET = ITEMS.register("aluminium_helmet",
            ()-> new ArmorItem(ModArmorMaterials.ALUMINIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final DeferredItem<ArmorItem> ALUMINIUM_CHESTPLATE = ITEMS.register("aluminium_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.ALUMINIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final DeferredItem<ArmorItem> ALUMINIUM_LEGGINGS = ITEMS.register("aluminium_leggings",
            ()-> new ArmorItem(ModArmorMaterials.ALUMINIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final DeferredItem<ArmorItem> ALUMINIUM_BOOTS = ITEMS.register("aluminium_boots",
            ()-> new ArmorItem(ModArmorMaterials.ALUMINIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    //Silver
    public static final DeferredItem<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet",
            ()-> new ArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final DeferredItem<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final DeferredItem<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            ()-> new ArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final DeferredItem<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots",
            ()-> new ArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    //Titanium
    public static final DeferredItem<ArmorItem> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            ()-> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
    public static final DeferredItem<ArmorItem> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18))));
    public static final DeferredItem<ArmorItem> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            ()-> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18))));
    public static final DeferredItem<ArmorItem> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            ()-> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));

    //Hoplology - Parts
    public static final DeferredItem<Item> ALUMINIUM_AXEHEAD = ITEMS.register("aluminium_axehead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_BLADE = ITEMS.register("aluminium_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_GUARD = ITEMS.register("aluminium_guard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_HILT = ITEMS.register("aluminium_hilt",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_SHOVELHEAD = ITEMS.register("aluminium_shovelhead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_POMMEL = ITEMS.register("aluminium_pommel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_PICK = ITEMS.register("aluminium_pick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_PLATE = ITEMS.register("aluminium_plate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_AXEHEAD = ITEMS.register("silver_axehead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_BLADE = ITEMS.register("silver_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_GUARD = ITEMS.register("silver_guard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_HILT = ITEMS.register("silver_hilt",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_SHOVELHEAD = ITEMS.register("silver_shovelhead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_POMMEL = ITEMS.register("silver_pommel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_PICK = ITEMS.register("silver_pick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_PLATE = ITEMS.register("silver_plate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_AXEHEAD = ITEMS.register("titanium_axehead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_BLADE = ITEMS.register("titanium_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_GUARD = ITEMS.register("titanium_guard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_HILT = ITEMS.register("titanium_hilt",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_SHOVELHEAD = ITEMS.register("titanium_shovelhead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_POMMEL = ITEMS.register("titanium_pommel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_PICK = ITEMS.register("titanium_pick",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_PLATE = ITEMS.register("titanium_plate",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FABRIC_STRAP = ITEMS.register("fabric_strap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FABRIC_GRIP = ITEMS.register("fabric_grip",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARMOUR_PADDING = ITEMS.register("armour_padding",
            () -> new Item(new Item.Properties()));

    //Nature - Crops
    public static final DeferredItem<Item> BHUT_JOLOKIA_CHILLI = ITEMS.register("chilli_bhut_jolokia",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BIRDS_EYE_CHILLI = ITEMS.register("chilli_birds_eye",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAROLINA_REAPER_CHILLI = ITEMS.register("chilli_carolina_reaper",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAYENNE_CHILLI = ITEMS.register("chilli_cayenne",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HABANERO_CHILLI = ITEMS.register("chilli_habanero",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JALAPENO_CHILLI = ITEMS.register("chilli_jalapeno",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NAGA_GHOST_CHILLI = ITEMS.register("chilli_naga_ghost",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PADRON_CHILLI = ITEMS.register("chilli_padron",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POBLANO_CHILLI = ITEMS.register("chilli_poblano",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCOTCH_BONNET_CHILLI = ITEMS.register("chilli_scotch_bonnet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILING_LABUYO_CHILLI = ITEMS.register("chilli_siling_labuyo",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TABASCO_CHILLI = ITEMS.register("chilli_tabasco",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TRINIDAD_SCORPION_CHILLI = ITEMS.register("chilli_trinidad_scorpion",
            () -> new Item(new Item.Properties()));

    //Nature - Seeds
    public static final DeferredItem<Item> BHUT_JOLOKIA_CHILLI_SEEDS = ITEMS.register("chilli_bhut_jolokia_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BHUT_JOLOKIA_CHILLI_CROP.get(), new Item.Properties()));
    
    public static final DeferredItem<Item> BIRDS_EYE_CHILLI_SEEDS = ITEMS.register("chilli_birds_eye_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BIRDS_EYE_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> CAROLINA_REAPER_CHILLI_SEEDS = ITEMS.register("chilli_carolina_reaper_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CAROLINA_REAPER_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> CAYENNE_CHILLI_SEEDS = ITEMS.register("chilli_cayenne_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CAYENNE_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> HABANERO_CHILLI_SEEDS = ITEMS.register("chilli_habanero_seeds",
            () -> new ItemNameBlockItem(ModBlocks.HABANERO_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> JALAPENO_CHILLI_SEEDS = ITEMS.register("chilli_jalapeno_seeds",
            () -> new ItemNameBlockItem(ModBlocks.JALAPENO_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> NAGA_GHOST_CHILLI_SEEDS = ITEMS.register("chilli_naga_ghost_seeds",
            () -> new ItemNameBlockItem(ModBlocks.NAGA_GHOST_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> PADRON_CHILLI_SEEDS = ITEMS.register("chilli_padron_seeds",
            () -> new ItemNameBlockItem(ModBlocks.PADRON_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> POBLANO_CHILLI_SEEDS = ITEMS.register("chilli_poblano_seeds",
            () -> new ItemNameBlockItem(ModBlocks.POBLANO_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> SCOTCH_BONNET_CHILLI_SEEDS = ITEMS.register("chilli_scotch_bonnet_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SCOTCH_BONNET_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> SILING_LABUYO_CHILLI_SEEDS = ITEMS.register("chilli_siling_labuyo_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SILING_LABUYO_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> TABASCO_CHILLI_SEEDS = ITEMS.register("chilli_tabasco_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TABASCO_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> TRINIDAD_SCORPION_CHILLI_SEEDS = ITEMS.register("chilli_trinidad_scorpion_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TRINIDAD_SCORPION_CHILLI_CROP.get(), new Item.Properties()));

    public static final DeferredItem<Item> GOOSEBERRY_BERRIES = ITEMS.register("gooseberry_berry",
            () -> new ItemNameBlockItem(ModBlocks.GOOSEBERRY_BUSH.get(), new Item.Properties().food(ModFoodProperties.GOOSEBERRY_BERRY)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
