package net.megalogaminguk.megalosmod.item;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.item.tools.ModToolTiers;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

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

    public static final DeferredItem<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAFNIUM_DUST = ITEMS.register("hafnium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INDIUM_DUST = ITEMS.register("indium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRIDIUM_DUST = ITEMS.register("iridium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties()));

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

    public static final DeferredItem<Item> COAL_DUST = ITEMS.register("coal_dust", () -> new Item(new Item.Properties()));

    //Gastronomy - Meat - Carcass
    public static final DeferredItem<Item> BEEF_CARCASS = ITEMS.register("beef_carcass", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUTTON_CARCASS = ITEMS.register("mutton_carcass", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PORK_CARCASS = ITEMS.register("pork_carcass", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HORSE_CARCASS = ITEMS.register("horse_carcass", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FROG_CARCASS = ITEMS.register("frog_carcass", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOAT_CARCASS = ITEMS.register("goat_carcass", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SQUID_CARCASS = ITEMS.register("squid_carcass", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TURTLE_CARCASS = ITEMS.register("turtle_carcass", () -> new Item(new Item.Properties()));

    //Cuts of Beef
    public static final DeferredItem<Item> BEEF_CHUCK = ITEMS.register("beef_chuck", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BEEF_RIB = ITEMS.register("beef_rib", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BEEF_LOIN = ITEMS.register("beef_loin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BEEF_ROUND = ITEMS.register("beef_round", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BEEF_FLANK = ITEMS.register("beef_flank", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BEEF_PLATE = ITEMS.register("beef_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BEEF_BRISKET = ITEMS.register("beef_brisket", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BEEF_SHANK = ITEMS.register("beef_shank", () -> new Item(new Item.Properties()));

    //Cuts of Mutton
    public static final DeferredItem<Item> MUTTON_NECK = ITEMS.register("mutton_neck", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUTTON_SHOULDER = ITEMS.register("mutton_shoulder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUTTON_LOIN = ITEMS.register("mutton_loin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUTTON_LEG = ITEMS.register("mutton_leg", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUTTON_BREAST = ITEMS.register("mutton_breast", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUTTON_SHANK = ITEMS.register("mutton_shank", () -> new Item(new Item.Properties()));

    //Cuts of Pork
    public static final DeferredItem<Item> PORK_SHOULDER = ITEMS.register("pork_shoulder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PORK_LOIN = ITEMS.register("pork_loin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PORK_BELLY = ITEMS.register("pork_belly", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PORK_LEG = ITEMS.register("pork_leg", () -> new Item(new Item.Properties()));

    //Cuts of Chicken
    public static final DeferredItem<Item> CHICKEN_LEG = ITEMS.register("chicken_leg", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHICKEN_BREAST = ITEMS.register("chicken_breast", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHICKEN_WING = ITEMS.register("chicken_wing", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHICKEN_THIGH = ITEMS.register("chicken_thigh", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHICKEN_DRUMSTICK = ITEMS.register("chicken_drumstick", () -> new Item(new Item.Properties()));

    //Cuts of Horse
    public static final DeferredItem<Item> HORSE_SHOULDER = ITEMS.register("horse_shoulder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HORSE_BREAST = ITEMS.register("horse_breast", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HORSE_RIB = ITEMS.register("horse_rib", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HORSE_PLATE = ITEMS.register("horse_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HORSE_LOIN = ITEMS.register("horse_loin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HORSE_FLANK = ITEMS.register("horse_flank", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HORSE_RUMP = ITEMS.register("horse_rump", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HORSE_ROUND = ITEMS.register("horse_round", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HORSE_LEG = ITEMS.register("horse_leg", () -> new Item(new Item.Properties()));

    //Cuts of Frog
    public static final DeferredItem<Item> FROG_LEGS = ITEMS.register("frog_legs", () -> new Item(new Item.Properties()));

    //Cuts of Goat
    public static final DeferredItem<Item> GOAT_NECK = ITEMS.register("goat_neck", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOAT_SHOULDER = ITEMS.register("goat_shoulder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOAT_BREAST = ITEMS.register("goat_breast", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOAT_RACK = ITEMS.register("goat_rack", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOAT_SHANK = ITEMS.register("goat_shank", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOAT_LOIN = ITEMS.register("goat_loin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOAT_FLANK = ITEMS.register("goat_flank", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOAT_LEG = ITEMS.register("goat_leg", () -> new Item(new Item.Properties()));

    //Cuts of Squid
    public static final DeferredItem<Item> SQUID_MANTLE = ITEMS.register("squid_mantle", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SQUID_TENTACLES = ITEMS.register("squid_tentacles", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SQUID_INK = ITEMS.register("squid_ink", () -> new Item(new Item.Properties()));

    //Cuts of Turtle
    public static final DeferredItem<Item> TURTLE_NECK = ITEMS.register("turtle_neck", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TURTLE_BACK = ITEMS.register("turtle_back", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TURTLE_LEG = ITEMS.register("turtle_leg", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TURTLE_TAIL = ITEMS.register("turtle_tail", () -> new Item(new Item.Properties()));

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

    //Aluminium Alloys
    public static final DeferredItem<Item> AA_INGOT = ITEMS.register("al_aa_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AL_LI_INGOT = ITEMS.register("al_alli_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALNICO_INGOT = ITEMS.register("al_alnico_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_SCANDIUM_INGOT = ITEMS.register("al_aluminium_scandium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BIRMABRIGHT_INGOT = ITEMS.register("al_birmabright_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEVARDA_INGOT = ITEMS.register("al_devarda_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DURALUMIN_INGOT = ITEMS.register("al_duralumin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HIDUMINIUM_INGOT = ITEMS.register("al_hiduminium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HYDRONALIUM_INGOT = ITEMS.register("al_hydronalium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ITALMA_INGOT = ITEMS.register("al_italma_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNALIUM_INGOT = ITEMS.register("al_magnalium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNOX_INGOT = ITEMS.register("al_magnox_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NAMBE_INGOT = ITEMS.register("al_nambe_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NITIAL_INGOT = ITEMS.register("al_nitial_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILUMIN_INGOT = ITEMS.register("al_silumin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Y_ALLOY_INGOT = ITEMS.register("al_yalloy_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZAMAK_INGOT = ITEMS.register("al_zamak_ingot",
            () -> new Item(new Item.Properties()));

    //Beryllium Alloys
    public static final DeferredItem<Item> LOCKALLOY_INGOT = ITEMS.register("be_lockalloy_ingot",
            () -> new Item(new Item.Properties()));

    //Bismuth Alloys
    public static final DeferredItem<Item> BISMANOL_INGOT = ITEMS.register("bi_bismanol_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CERROBEND_INGOT = ITEMS.register("bi_cerrobend_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CERROSAFE_INGOT = ITEMS.register("bi_cerrosafe_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIELDS_METAL_INGOT = ITEMS.register("bi_fields_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_METAL_INGOT = ITEMS.register("bi_rose_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODS_METAL_INGOT = ITEMS.register("bi_woods_metal_ingot",
            () -> new Item(new Item.Properties()));

    //Chromium Alloys
    public static final DeferredItem<Item> CHROMIUM_HYDRIDE_INGOT = ITEMS.register("cr_chromium_hydride_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRNISZWTI_INGOT = ITEMS.register("cr_crniszwti_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICHROME_INGOT = ITEMS.register("cr_nichrome_ingot",
            () -> new Item(new Item.Properties()));

    //Cobalt Alloys
    public static final DeferredItem<Item> ELGILOY_INGOT = ITEMS.register("co_elgiloy_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MEGALLIUM_INGOT = ITEMS.register("co_megallium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STELLITE_INGOT = ITEMS.register("co_stellite_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TALONITE_INGOT = ITEMS.register("co_talonite_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTIMET_INGOT = ITEMS.register("co_ultimet_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VITALLIUM_INGOT = ITEMS.register("co_vitallium_ingot",
            () -> new Item(new Item.Properties()));

    //Copper Alloys
    public static final DeferredItem<Item> ALUMINIUM_BRONZE_INGOT = ITEMS.register("cu_aluminium_bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARSENICAL_BRONZE_INGOT = ITEMS.register("cu_arsenical_bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARSENICAL_COPPER_INGOT = ITEMS.register("cu_arsenical_copper_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BELL_METAL_INGOT = ITEMS.register("cu_bell_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_COPPER_INGOT = ITEMS.register("cu_beryllium_copper_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BILLON_INGOT = ITEMS.register("cu_billon_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_INGOT = ITEMS.register("cu_brass_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("cu_bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALAMINE_BRASS_INGOT = ITEMS.register("cu_calamine_brass_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHINESE_SILVER_INGOT = ITEMS.register("cu_chinese_silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONSTANTAN_INGOT = ITEMS.register("cu_constantan_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_HYDRIDE_INGOT = ITEMS.register("cu_copper_hydride_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_TUNGSTEN_INGOT = ITEMS.register("cu_copper_tungsten_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORINTHIAN_BRONZE_INGOT = ITEMS.register("cu_corinthian_bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUNIFE_INGOT = ITEMS.register("cu_cunife_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUAG_INGOT = ITEMS.register("cu_cuag_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CYMBAL_ALLOY_INGOT = ITEMS.register("cu_cymbal_alloy_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DUTCH_METAL_INGOT = ITEMS.register("cu_dutch_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLORENTINE_BRONZE_INGOT = ITEMS.register("cu_florentine_bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GILDING_METAL_INGOT = ITEMS.register("cu_gilding_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GLUCYDUR_INGOT = ITEMS.register("cu_glucydur_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUANIN_INGOT = ITEMS.register("cu_guanin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUN_METAL_INGOT = ITEMS.register("cu_gun_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEPATIZON_INGOT = ITEMS.register("cu_hepatizon_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANIN_INGOT = ITEMS.register("cu_manganin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MELCHIOR_INGOT = ITEMS.register("cu_melchior_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUNTZ_METAL_INGOT = ITEMS.register("cu_muntz_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_SILVER_INGOT = ITEMS.register("cu_nickel_silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NORDIC_GOLD_INGOT = ITEMS.register("cu_nordic_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORMOLU_INGOT = ITEMS.register("cu_ormolu_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHOSPHOR_BRONZE_INGOT = ITEMS.register("cu_phosphor_bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINCHBECK_INGOT = ITEMS.register("cu_pinchbeck_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRINCES_METAL_INGOT = ITEMS.register("cu_princes_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHAKUDO_INGOT = ITEMS.register("cu_shakudo_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_BRONZE_INGOT = ITEMS.register("cu_silicon_bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPECULUM_METAL_INGOT = ITEMS.register("cu_speculum_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOMBAC_INGOT = ITEMS.register("cu_tombac_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUMBAGA_INGOT = ITEMS.register("cu_tumbaga_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_BRONZE_INGOT = ITEMS.register("cu_white_bronze_ingot",
            () -> new Item(new Item.Properties()));

    //Gallium
    public static final DeferredItem<Item> AL_GA_INGOT = ITEMS.register("ga_alga_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GALFENOL_INGOT = ITEMS.register("ga_galfenol_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GALINSTAN_INGOT = ITEMS.register("ga_galinstan_ingot",
            () -> new Item(new Item.Properties()));

    //Gold
    public static final DeferredItem<Item> COLORED_GOLD_INGOT = ITEMS.register("au_colored_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROWN_GOLD_INGOT = ITEMS.register("au_crown_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_INGOT = ITEMS.register("au_electrum_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHODITE_INGOT = ITEMS.register("au_rhodite_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_GOLD_INGOT = ITEMS.register("au_rose_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_GOLD_INGOT = ITEMS.register("au_white_gold_ingot",
            () -> new Item(new Item.Properties()));

    //Iron
    public static final DeferredItem<Item> ANTHRACITE_IRON_INGOT = ITEMS.register("fe_anthracite_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULAT_STEEL_INGOT = ITEMS.register("fe_bulat_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAST_IRON_INGOT = ITEMS.register("fe_cast_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMOLY_INGOT = ITEMS.register("fe_chromoly_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRUCIBLE_STEEL_INGOT = ITEMS.register("fe_crucible_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DAMASCUS_STEEL_INGOT = ITEMS.register("fe_damascus_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DUCOL_INGOT = ITEMS.register("fe_ducol_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELINVAR_INGOT = ITEMS.register("fe_elinvar_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERNICO_INGOT = ITEMS.register("fe_fernico_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROCHROMIUM_INGOT = ITEMS.register("fe_ferrochromium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROMAGNESIUM_INGOT = ITEMS.register("fe_ferromagnesium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROMANGANESE_INGOT = ITEMS.register("fe_ferromanganese_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROMOLYBDENUM_INGOT = ITEMS.register("fe_ferromolybdenum_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERRONICKEL_INGOT = ITEMS.register("fe_ferronickel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROPHOSPHORUS_INGOT = ITEMS.register("fe_ferrophosphorus_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROSILICON_INGOT = ITEMS.register("fe_ferrosilicon_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROTITANIUM_INGOT = ITEMS.register("fe_ferrotitanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROVANADIUM_INGOT = ITEMS.register("fe_ferrovanadium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HIGHSPEED_STEEL_INGOT = ITEMS.register("fe_highspeed_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HSLA_STEEL_INGOT = ITEMS.register("fe_hsla_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INVAR_INGOT = ITEMS.register("fe_invar_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_HYDRIDE_INGOT = ITEMS.register("fe_iron_hydride_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KANTHAL_INGOT = ITEMS.register("fe_kanthal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KOVAR_INGOT = ITEMS.register("fe_kovar_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MARAGING_STEEL_INGOT = ITEMS.register("fe_maraging_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSHET_STEEL_INGOT = ITEMS.register("fe_mushet_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PIG_IRON_INGOT = ITEMS.register("fe_pig_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REYNOLDS_FTO_INGOT = ITEMS.register("fe_reynolds_fto_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_STEEL_INGOT = ITEMS.register("fe_silicon_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_STEEL_INGOT = ITEMS.register("fe_silver_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPIEGELEISEN_INGOT = ITEMS.register("fe_spiegeleisen_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPRING_STEEL_INGOT = ITEMS.register("fe_spring_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAINLESS_STEEL_INGOT = ITEMS.register("fe_stainless_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STABALLOY_INGOT = ITEMS.register("fe_staballoy_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("fe_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOOL_STEEL_INGOT = ITEMS.register("fe_tool_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WEATHERING_STEEL_INGOT = ITEMS.register("fe_weathering_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOOTZ_STEEL_INGOT = ITEMS.register("fe_wootz_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WROUGHT_IRON_INGOT = ITEMS.register("fe_wrought_iron_ingot",
            () -> new Item(new Item.Properties()));

    //Lead
    public static final DeferredItem<Item> MOLYBDOCHALKOS_INGOT = ITEMS.register("pb_molybdochalkos_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOLDER_INGOT = ITEMS.register("pb_solder_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TERNE_INGOT = ITEMS.register("pb_terne_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TYPE_METAL_INGOT = ITEMS.register("pb_type_metal_ingot",
            () -> new Item(new Item.Properties()));

    //Magnesium
    public static final DeferredItem<Item> ELEKTRON_INGOT = ITEMS.register("mg_elektron_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TMGALZN_INGOT = ITEMS.register("mg_tmgalzn_ingot",
            () -> new Item(new Item.Properties()));

    //Manganese
    public static final DeferredItem<Item> MNFZ_INGOT = ITEMS.register("mn_mnfz_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MNSZ_INGOT = ITEMS.register("mn_mnsz_ingot",
            () -> new Item(new Item.Properties()));

    //Mercury (Cinnabar)
    public static final DeferredItem<Item> ZINC_AMALGAM_INGOT = ITEMS.register("hg_zinc_amalgam_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ASHTADHATU_INGOT = ITEMS.register("hg_ashtadhatu_ingot",
            () -> new Item(new Item.Properties()));

    //Nickel
    public static final DeferredItem<Item> ALUMEL_INGOT = ITEMS.register("ni_alumel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRIGHTRAY_INGOT = ITEMS.register("ni_brightray_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMEL_INGOT = ITEMS.register("ni_chromel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN_SILVER_INGOT = ITEMS.register("ni_coin_silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_NICKEL_INGOT = ITEMS.register("ni_copper_nickel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUPRONICKEL_INGOT = ITEMS.register("ni_cupronickel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GERMAN_SILVER_INGOT = ITEMS.register("ni_german_silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HASTELLOY_INGOT = ITEMS.register("ni_hastelloy_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAUSLER_INGOT = ITEMS.register("ni_hausler_alloy_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCONEL_INGOT = ITEMS.register("ni_inconel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCONEL_SES_INGOT = ITEMS.register("ni_inconel_ses_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MONEL_METAL_INGOT = ITEMS.register("ni_monel_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_CARBON_INGOT = ITEMS.register("ni_nickel_carbon_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_HYDRIDE_INGOT = ITEMS.register("ni_nickel_hydride_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICROSIL_INGOT = ITEMS.register("ni_nicrosil_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIMONIC_INGOT = ITEMS.register("ni_nimonic_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NISIL_INGOT = ITEMS.register("ni_nisil_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NITINOL_INGOT = ITEMS.register("ni_nitinol_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MU_METAL_INGOT = ITEMS.register("ni_mu_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PERMALLOY_INGOT = ITEMS.register("ni_permalloy_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUPERMALLOY_INGOT = ITEMS.register("ni_supermalloy_ingot",
            () -> new Item(new Item.Properties()));

    //Potassium
    public static final DeferredItem<Item> NAK_INGOT = ITEMS.register("k_nak_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KLI_INGOT = ITEMS.register("k_kli_ingot",
            () -> new Item(new Item.Properties()));

    //Rhodium
    public static final DeferredItem<Item> PSEUDO_PALLADIUM_INGOT = ITEMS.register("rh_pseudo_palladium_ingot",
            () -> new Item(new Item.Properties()));

    //Scandium
    public static final DeferredItem<Item> SCANDIUM_HYDRIDE_INGOT = ITEMS.register("sc_scandium_hydride_ingot",
            () -> new Item(new Item.Properties()));

    //Silver
    public static final DeferredItem<Item> ARGENTIUM_STERLING_SILVER_INGOT = ITEMS.register("ag_argentium_sterling_silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRITANNIA_SILVER_INGOT = ITEMS.register("ag_britannia_silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DORE_INGOT = ITEMS.register("ag_dore_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DYMALLOY_INGOT = ITEMS.register("ag_dymalloy_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLOID_INGOT = ITEMS.register("ag_goloid_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_SILVER_INGOT = ITEMS.register("ag_platinum_silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHIBUICHI_INGOT = ITEMS.register("ag_shibuichi_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STERLING_SILVER_INGOT = ITEMS.register("ag_sterling_silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIBETAN_SILVER_INGOT = ITEMS.register("ag_tibetan_silver_ingot",
            () -> new Item(new Item.Properties()));

    //Tin
    public static final DeferredItem<Item> BABBITT_INGOT = ITEMS.register("sn_babbitt_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRITANNIUM_INGOT = ITEMS.register("sn_britannium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEWTER_INGOT = ITEMS.register("sn_pewter_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUEENS_METAL_INGOT = ITEMS.register("sn_queens_metal_ingot",
            () -> new Item(new Item.Properties()));

    //Titanium
    public static final DeferredItem<Item> SAL_FV_INGOT = ITEMS.register("ti_salfv_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BETA_C_INGOT = ITEMS.register("ti_betac_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUM_METAL_INGOT = ITEMS.register("ti_gum_metal_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_GOLD_INGOT = ITEMS.register("ti_titanium_gold_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_HYDRIDE_INGOT = ITEMS.register("ti_titanium_hydride_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_NITRIDE_INGOT = ITEMS.register("ti_titanium_nitride_ingot",
            () -> new Item(new Item.Properties()));

    //Zirconium
    public static final DeferredItem<Item> ZIRCALOY_INGOT = ITEMS.register("zr_zircaloy_ingot",
            () -> new Item(new Item.Properties()));

    //Alloys - Nuggets
    public static final DeferredItem<Item> AA_NUGGET = ITEMS.register("al_aa_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AL_LI_NUGGET = ITEMS.register("al_alli_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALNICO_NUGGET = ITEMS.register("al_alnico_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_SCANDIUM_NUGGET = ITEMS.register("al_aluminium_scandium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BIRMABRIGHT_NUGGET = ITEMS.register("al_birmabright_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEVARDA_NUGGET = ITEMS.register("al_devarda_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DURALUMIN_NUGGET = ITEMS.register("al_duralumin_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HIDUMINIUM_NUGGET = ITEMS.register("al_hiduminium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HYDRONALIUM_NUGGET = ITEMS.register("al_hydronalium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ITALMA_NUGGET = ITEMS.register("al_italma_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNALIUM_NUGGET = ITEMS.register("al_magnalium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNOX_NUGGET = ITEMS.register("al_magnox_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NAMBE_NUGGET = ITEMS.register("al_nambe_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NITIAL_NUGGET = ITEMS.register("al_nitial_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILUMIN_NUGGET = ITEMS.register("al_silumin_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Y_ALLOY_NUGGET = ITEMS.register("al_yalloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZAMAK_NUGGET = ITEMS.register("al_zamak_nugget",
            () -> new Item(new Item.Properties()));

    //Beryllium Alloys
    public static final DeferredItem<Item> LOCKALLOY_NUGGET = ITEMS.register("be_lockalloy_nugget",
            () -> new Item(new Item.Properties()));

    //Bismuth Alloys
    public static final DeferredItem<Item> BISMANOL_NUGGET = ITEMS.register("bi_bismanol_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CERROBEND_NUGGET = ITEMS.register("bi_cerrobend_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CERROSAFE_NUGGET = ITEMS.register("bi_cerrosafe_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIELDS_METAL_NUGGET = ITEMS.register("bi_fields_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_METAL_NUGGET = ITEMS.register("bi_rose_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODS_METAL_NUGGET = ITEMS.register("bi_woods_metal_nugget",
            () -> new Item(new Item.Properties()));

    //Chromium Alloys
    public static final DeferredItem<Item> CHROMIUM_HYDRIDE_NUGGET = ITEMS.register("cr_chromium_hydride_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRNISZWTI_NUGGET = ITEMS.register("cr_crniszwti_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICHROME_NUGGET = ITEMS.register("cr_nichrome_nugget",
            () -> new Item(new Item.Properties()));

    //Cobalt Alloys
    public static final DeferredItem<Item> ELGILOY_NUGGET = ITEMS.register("co_elgiloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MEGALLIUM_NUGGET = ITEMS.register("co_megallium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STELLITE_NUGGET = ITEMS.register("co_stellite_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TALONITE_NUGGET = ITEMS.register("co_talonite_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTIMET_NUGGET = ITEMS.register("co_ultimet_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VITALLIUM_NUGGET = ITEMS.register("co_vitallium_nugget",
            () -> new Item(new Item.Properties()));

    //Copper Alloys
    public static final DeferredItem<Item> ALUMINIUM_BRONZE_NUGGET = ITEMS.register("cu_aluminium_bronze_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARSENICAL_BRONZE_NUGGET = ITEMS.register("cu_arsenical_bronze_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARSENICAL_COPPER_NUGGET = ITEMS.register("cu_arsenical_copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BELL_METAL_NUGGET = ITEMS.register("cu_bell_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_COPPER_NUGGET = ITEMS.register("cu_beryllium_copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BILLON_NUGGET = ITEMS.register("cu_billon_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_NUGGET = ITEMS.register("cu_brass_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_NUGGET = ITEMS.register("cu_bronze_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALAMINE_BRASS_NUGGET = ITEMS.register("cu_calamine_brass_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHINESE_SILVER_NUGGET = ITEMS.register("cu_chinese_silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONSTANTAN_NUGGET = ITEMS.register("cu_constantan_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_HYDRIDE_NUGGET = ITEMS.register("cu_copper_hydride_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_TUNGSTEN_NUGGET = ITEMS.register("cu_copper_tungsten_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORINTHIAN_BRONZE_NUGGET = ITEMS.register("cu_corinthian_bronze_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUNIFE_NUGGET = ITEMS.register("cu_cunife_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUAG_NUGGET = ITEMS.register("cu_cuag_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CYMBAL_ALLOY_NUGGET = ITEMS.register("cu_cymbal_alloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DUTCH_METAL_NUGGET = ITEMS.register("cu_dutch_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLORENTINE_BRONZE_NUGGET = ITEMS.register("cu_florentine_bronze_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GILDING_METAL_NUGGET = ITEMS.register("cu_gilding_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GLUCYDUR_NUGGET = ITEMS.register("cu_glucydur_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUANIN_NUGGET = ITEMS.register("cu_guanin_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUN_METAL_NUGGET = ITEMS.register("cu_gun_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEPATIZON_NUGGET = ITEMS.register("cu_hepatizon_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANIN_NUGGET = ITEMS.register("cu_manganin_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MELCHIOR_NUGGET = ITEMS.register("cu_melchior_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUNTZ_METAL_NUGGET = ITEMS.register("cu_muntz_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_SILVER_NUGGET = ITEMS.register("cu_nickel_silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NORDIC_GOLD_NUGGET = ITEMS.register("cu_nordic_gold_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORMOLU_NUGGET = ITEMS.register("cu_ormolu_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHOSPHOR_BRONZE_NUGGET = ITEMS.register("cu_phosphor_bronze_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINCHBECK_NUGGET = ITEMS.register("cu_pinchbeck_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRINCES_METAL_NUGGET = ITEMS.register("cu_princes_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHAKUDO_NUGGET = ITEMS.register("cu_shakudo_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_BRONZE_NUGGET = ITEMS.register("cu_silicon_bronze_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPECULUM_METAL_NUGGET = ITEMS.register("cu_speculum_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOMBAC_NUGGET = ITEMS.register("cu_tombac_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUMBAGA_NUGGET = ITEMS.register("cu_tumbaga_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_BRONZE_NUGGET = ITEMS.register("cu_white_bronze_nugget",
            () -> new Item(new Item.Properties()));

    //Gallium
    public static final DeferredItem<Item> AL_GA_NUGGET = ITEMS.register("ga_alga_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GALFENOL_NUGGET = ITEMS.register("ga_galfenol_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GALINSTAN_NUGGET = ITEMS.register("ga_galinstan_nugget",
            () -> new Item(new Item.Properties()));

    //Gold
    public static final DeferredItem<Item> COLORED_GOLD_NUGGET = ITEMS.register("au_colored_gold_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROWN_GOLD_NUGGET = ITEMS.register("au_crown_gold_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_NUGGET = ITEMS.register("au_electrum_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHODITE_NUGGET = ITEMS.register("au_rhodite_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_GOLD_NUGGET = ITEMS.register("au_rose_gold_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_GOLD_NUGGET = ITEMS.register("au_white_gold_nugget",
            () -> new Item(new Item.Properties()));

    //Iron
    public static final DeferredItem<Item> ANTHRACITE_IRON_NUGGET = ITEMS.register("fe_anthracite_iron_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULAT_STEEL_NUGGET = ITEMS.register("fe_bulat_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAST_IRON_NUGGET = ITEMS.register("fe_cast_iron_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMOLY_NUGGET = ITEMS.register("fe_chromoly_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRUCIBLE_STEEL_NUGGET = ITEMS.register("fe_crucible_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DAMASCUS_STEEL_NUGGET = ITEMS.register("fe_damascus_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DUCOL_NUGGET = ITEMS.register("fe_ducol_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELINVAR_NUGGET = ITEMS.register("fe_elinvar_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERNICO_NUGGET = ITEMS.register("fe_fernico_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROCHROMIUM_NUGGET = ITEMS.register("fe_ferrochromium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROMAGNESIUM_NUGGET = ITEMS.register("fe_ferromagnesium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROMANGANESE_NUGGET = ITEMS.register("fe_ferromanganese_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROMOLYBDENUM_NUGGET = ITEMS.register("fe_ferromolybdenum_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERRONICKEL_NUGGET = ITEMS.register("fe_ferronickel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROPHOSPHORUS_NUGGET = ITEMS.register("fe_ferrophosphorus_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROSILICON_NUGGET = ITEMS.register("fe_ferrosilicon_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROTITANIUM_NUGGET = ITEMS.register("fe_ferrotitanium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROVANADIUM_NUGGET = ITEMS.register("fe_ferrovanadium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HIGHSPEED_STEEL_NUGGET = ITEMS.register("fe_highspeed_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HSLA_STEEL_NUGGET = ITEMS.register("fe_hsla_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INVAR_NUGGET = ITEMS.register("fe_invar_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_HYDRIDE_NUGGET = ITEMS.register("fe_iron_hydride_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KANTHAL_NUGGET = ITEMS.register("fe_kanthal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KOVAR_NUGGET = ITEMS.register("fe_kovar_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MARAGING_STEEL_NUGGET = ITEMS.register("fe_maraging_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSHET_STEEL_NUGGET = ITEMS.register("fe_mushet_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PIG_IRON_NUGGET = ITEMS.register("fe_pig_iron_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REYNOLDS_FTO_NUGGET = ITEMS.register("fe_reynolds_fto_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_STEEL_NUGGET = ITEMS.register("fe_silicon_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_STEEL_NUGGET = ITEMS.register("fe_silver_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPIEGELEISEN_NUGGET = ITEMS.register("fe_spiegeleisen_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPRING_STEEL_NUGGET = ITEMS.register("fe_spring_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAINLESS_STEEL_NUGGET = ITEMS.register("fe_stainless_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STABALLOY_NUGGET = ITEMS.register("fe_staballoy_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.register("fe_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOOL_STEEL_NUGGET = ITEMS.register("fe_tool_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WEATHERING_STEEL_NUGGET = ITEMS.register("fe_weathering_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOOTZ_STEEL_NUGGET = ITEMS.register("fe_wootz_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WROUGHT_IRON_NUGGET = ITEMS.register("fe_wrought_iron_nugget",
            () -> new Item(new Item.Properties()));

    //Lead
    public static final DeferredItem<Item> MOLYBDOCHALKOS_NUGGET = ITEMS.register("pb_molybdochalkos_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOLDER_NUGGET = ITEMS.register("pb_solder_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TERNE_NUGGET = ITEMS.register("pb_terne_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TYPE_METAL_NUGGET = ITEMS.register("pb_type_metal_nugget",
            () -> new Item(new Item.Properties()));

    //Magnesium
    public static final DeferredItem<Item> ELEKTRON_NUGGET = ITEMS.register("mg_elektron_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TMGALZN_NUGGET = ITEMS.register("mg_tmgalzn_nugget",
            () -> new Item(new Item.Properties()));

    //Manganese
    public static final DeferredItem<Item> MNFZ_NUGGET = ITEMS.register("mn_mnfz_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MNSZ_NUGGET = ITEMS.register("mn_mnsz_nugget",
            () -> new Item(new Item.Properties()));

    //Mercury (Cinnabar)
    public static final DeferredItem<Item> ZINC_AMALGAM_NUGGET = ITEMS.register("hg_zinc_amalgam_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ASHTADHATU_NUGGET = ITEMS.register("hg_ashtadhatu_nugget",
            () -> new Item(new Item.Properties()));

    //Nickel
    public static final DeferredItem<Item> ALUMEL_NUGGET = ITEMS.register("ni_alumel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRIGHTRAY_NUGGET = ITEMS.register("ni_brightray_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMEL_NUGGET = ITEMS.register("ni_chromel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN_SILVER_NUGGET = ITEMS.register("ni_coin_silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_NICKEL_NUGGET = ITEMS.register("ni_copper_nickel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUPRONICKEL_NUGGET = ITEMS.register("ni_cupronickel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GERMAN_SILVER_NUGGET = ITEMS.register("ni_german_silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HASTELLOY_NUGGET = ITEMS.register("ni_hastelloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAUSLER_NUGGET = ITEMS.register("ni_hausler_alloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCONEL_NUGGET = ITEMS.register("ni_inconel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCONEL_SES_NUGGET = ITEMS.register("ni_inconel_ses_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>  MONEL_METAL_NUGGET = ITEMS.register("ni_monel_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_CARBON_NUGGET = ITEMS.register("ni_nickel_carbon_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_HYDRIDE_NUGGET = ITEMS.register("ni_nickel_hydride_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICROSIL_NUGGET = ITEMS.register("ni_nicrosil_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIMONIC_NUGGET = ITEMS.register("ni_nimonic_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NISIL_NUGGET = ITEMS.register("ni_nisil_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NITINOL_NUGGET = ITEMS.register("ni_nitinol_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MU_METAL_NUGGET = ITEMS.register("ni_mu_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PERMALLOY_NUGGET = ITEMS.register("ni_permalloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUPERMALLOY_NUGGET = ITEMS.register("ni_supermalloy_nugget",
            () -> new Item(new Item.Properties()));

    //Potassium
    public static final DeferredItem<Item> NAK_NUGGET = ITEMS.register("k_nak_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KLI_NUGGET = ITEMS.register("k_kli_nugget",
            () -> new Item(new Item.Properties()));

    //Rhodium
    public static final DeferredItem<Item> PSEUDO_PALLADIUM_NUGGET = ITEMS.register("rh_pseudo_palladium_nugget",
            () -> new Item(new Item.Properties()));

    //Scandium
    public static final DeferredItem<Item> SCANDIUM_HYDRIDE_NUGGET = ITEMS.register("sc_scandium_hydride_nugget",
            () -> new Item(new Item.Properties()));

    //Silver
    public static final DeferredItem<Item> ARGENTIUM_STERLING_SILVER_NUGGET = ITEMS.register("ag_argentium_sterling_silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRITANNIA_SILVER_NUGGET = ITEMS.register("ag_britannia_silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DORE_NUGGET = ITEMS.register("ag_dore_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DYMALLOY_NUGGET = ITEMS.register("ag_dymalloy_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLOID_NUGGET = ITEMS.register("ag_goloid_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_SILVER_NUGGET = ITEMS.register("ag_platinum_silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHIBUICHI_NUGGET = ITEMS.register("ag_shibuichi_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STERLING_SILVER_NUGGET = ITEMS.register("ag_sterling_silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIBETAN_SILVER_NUGGET = ITEMS.register("ag_tibetan_silver_nugget",
            () -> new Item(new Item.Properties()));

    //Tin
    public static final DeferredItem<Item> BABBITT_NUGGET = ITEMS.register("sn_babbitt_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRITANNIUM_NUGGET = ITEMS.register("sn_britannium_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEWTER_NUGGET = ITEMS.register("sn_pewter_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUEENS_METAL_NUGGET = ITEMS.register("sn_queens_metal_nugget",
            () -> new Item(new Item.Properties()));

    //Titanium
    public static final DeferredItem<Item> SAL_FV_NUGGET = ITEMS.register("ti_salfv_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BETA_C_NUGGET = ITEMS.register("ti_betac_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUM_METAL_NUGGET = ITEMS.register("ti_gum_metal_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_GOLD_NUGGET = ITEMS.register("ti_titanium_gold_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_HYDRIDE_NUGGET = ITEMS.register("ti_titanium_hydride_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_NITRIDE_NUGGET = ITEMS.register("ti_titanium_nitride_nugget",
            () -> new Item(new Item.Properties()));

    //Zirconium
    public static final DeferredItem<Item> ZIRCALOY_NUGGET = ITEMS.register("zr_zircaloy_nugget",
            () -> new Item(new Item.Properties()));

    //Alloys - Dust
    public static final DeferredItem<Item> AA_DUST = ITEMS.register("al_aa_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AL_LI_DUST = ITEMS.register("al_alli_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALNICO_DUST = ITEMS.register("al_alnico_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_SCANDIUM_DUST = ITEMS.register("al_aluminium_scandium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BIRMABRIGHT_DUST = ITEMS.register("al_birmabright_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEVARDA_DUST = ITEMS.register("al_devarda_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DURALUMIN_DUST = ITEMS.register("al_duralumin_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HIDUMINIUM_DUST = ITEMS.register("al_hiduminium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HYDRONALIUM_DUST = ITEMS.register("al_hydronalium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ITALMA_DUST = ITEMS.register("al_italma_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNALIUM_DUST = ITEMS.register("al_magnalium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNOX_DUST = ITEMS.register("al_magnox_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NAMBE_DUST = ITEMS.register("al_nambe_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NITIAL_DUST = ITEMS.register("al_nitial_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILUMIN_DUST = ITEMS.register("al_silumin_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Y_ALLOY_DUST = ITEMS.register("al_yalloy_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZAMAK_DUST = ITEMS.register("al_zamak_dust",
            () -> new Item(new Item.Properties()));

    //Beryllium Alloys
    public static final DeferredItem<Item> LOCKALLOY_DUST = ITEMS.register("be_lockalloy_dust",
            () -> new Item(new Item.Properties()));

    //Bismuth Alloys
    public static final DeferredItem<Item> BISMANOL_DUST = ITEMS.register("bi_bismanol_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CERROBEND_DUST = ITEMS.register("bi_cerrobend_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CERROSAFE_DUST = ITEMS.register("bi_cerrosafe_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIELDS_METAL_DUST = ITEMS.register("bi_fields_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_METAL_DUST = ITEMS.register("bi_rose_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODS_METAL_DUST = ITEMS.register("bi_woods_metal_dust",
            () -> new Item(new Item.Properties()));

    //Chromium Alloys
    public static final DeferredItem<Item> CHROMIUM_HYDRIDE_DUST = ITEMS.register("cr_chromium_hydride_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRNISZWTI_DUST = ITEMS.register("cr_crniszwti_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICHROME_DUST = ITEMS.register("cr_nichrome_dust",
            () -> new Item(new Item.Properties()));

    //Cobalt Alloys
    public static final DeferredItem<Item> ELGILOY_DUST = ITEMS.register("co_elgiloy_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MEGALLIUM_DUST = ITEMS.register("co_megallium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STELLITE_DUST = ITEMS.register("co_stellite_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TALONITE_DUST = ITEMS.register("co_talonite_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTIMET_DUST = ITEMS.register("co_ultimet_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VITALLIUM_DUST = ITEMS.register("co_vitallium_dust",
            () -> new Item(new Item.Properties()));

    //Copper Alloys
    public static final DeferredItem<Item> ALUMINIUM_BRONZE_DUST = ITEMS.register("cu_aluminium_bronze_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARSENICAL_BRONZE_DUST = ITEMS.register("cu_arsenical_bronze_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARSENICAL_COPPER_DUST = ITEMS.register("cu_arsenical_copper_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BELL_METAL_DUST = ITEMS.register("cu_bell_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_COPPER_DUST = ITEMS.register("cu_beryllium_copper_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BILLON_DUST = ITEMS.register("cu_billon_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_DUST = ITEMS.register("cu_brass_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_DUST = ITEMS.register("cu_bronze_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALAMINE_BRASS_DUST = ITEMS.register("cu_calamine_brass_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHINESE_SILVER_DUST = ITEMS.register("cu_chinese_silver_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONSTANTAN_DUST = ITEMS.register("cu_constantan_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_HYDRIDE_DUST = ITEMS.register("cu_copper_hydride_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_TUNGSTEN_DUST = ITEMS.register("cu_copper_tungsten_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORINTHIAN_BRONZE_DUST = ITEMS.register("cu_corinthian_bronze_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUNIFE_DUST = ITEMS.register("cu_cunife_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUAG_DUST = ITEMS.register("cu_cuag_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CYMBAL_ALLOY_DUST = ITEMS.register("cu_cymbal_alloy_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DUTCH_METAL_DUST = ITEMS.register("cu_dutch_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLORENTINE_BRONZE_DUST = ITEMS.register("cu_florentine_bronze_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GILDING_METAL_DUST = ITEMS.register("cu_gilding_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GLUCYDUR_DUST = ITEMS.register("cu_glucydur_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUANIN_DUST = ITEMS.register("cu_guanin_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUN_METAL_DUST = ITEMS.register("cu_gun_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEPATIZON_DUST = ITEMS.register("cu_hepatizon_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANIN_DUST = ITEMS.register("cu_manganin_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MELCHIOR_DUST = ITEMS.register("cu_melchior_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUNTZ_METAL_DUST = ITEMS.register("cu_muntz_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_SILVER_DUST = ITEMS.register("cu_nickel_silver_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NORDIC_GOLD_DUST = ITEMS.register("cu_nordic_gold_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORMOLU_DUST = ITEMS.register("cu_ormolu_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PHOSPHOR_BRONZE_DUST = ITEMS.register("cu_phosphor_bronze_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINCHBECK_DUST = ITEMS.register("cu_pinchbeck_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRINCES_METAL_DUST = ITEMS.register("cu_princes_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHAKUDO_DUST = ITEMS.register("cu_shakudo_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_BRONZE_DUST = ITEMS.register("cu_silicon_bronze_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPECULUM_METAL_DUST = ITEMS.register("cu_speculum_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOMBAC_DUST = ITEMS.register("cu_tombac_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUMBAGA_DUST = ITEMS.register("cu_tumbaga_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_BRONZE_DUST = ITEMS.register("cu_white_bronze_dust",
            () -> new Item(new Item.Properties()));

    //Gallium
    public static final DeferredItem<Item> AL_GA_DUST = ITEMS.register("ga_alga_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GALFENOL_DUST = ITEMS.register("ga_galfenol_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GALINSTAN_DUST = ITEMS.register("ga_galinstan_dust",
            () -> new Item(new Item.Properties()));

    //Gold
    public static final DeferredItem<Item> COLORED_GOLD_DUST = ITEMS.register("au_colored_gold_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROWN_GOLD_DUST = ITEMS.register("au_crown_gold_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_DUST = ITEMS.register("au_electrum_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHODITE_DUST = ITEMS.register("au_rhodite_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_GOLD_DUST = ITEMS.register("au_rose_gold_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_GOLD_DUST = ITEMS.register("au_white_gold_dust",
            () -> new Item(new Item.Properties()));

    //Iron
    public static final DeferredItem<Item> ANTHRACITE_IRON_DUST = ITEMS.register("fe_anthracite_iron_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULAT_STEEL_DUST = ITEMS.register("fe_bulat_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAST_IRON_DUST = ITEMS.register("fe_cast_iron_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMOLY_DUST = ITEMS.register("fe_chromoly_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRUCIBLE_STEEL_DUST = ITEMS.register("fe_crucible_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DAMASCUS_STEEL_DUST = ITEMS.register("fe_damascus_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DUCOL_DUST = ITEMS.register("fe_ducol_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELINVAR_DUST = ITEMS.register("fe_elinvar_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERNICO_DUST = ITEMS.register("fe_fernico_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROCHROMIUM_DUST = ITEMS.register("fe_ferrochromium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROMAGNESIUM_DUST = ITEMS.register("fe_ferromagnesium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROMANGANESE_DUST = ITEMS.register("fe_ferromanganese_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROMOLYBDENUM_DUST = ITEMS.register("fe_ferromolybdenum_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERRONICKEL_DUST = ITEMS.register("fe_ferronickel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROPHOSPHORUS_DUST = ITEMS.register("fe_ferrophosphorus_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROSILICON_DUST = ITEMS.register("fe_ferrosilicon_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROTITANIUM_DUST = ITEMS.register("fe_ferrotitanium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERROVANADIUM_DUST = ITEMS.register("fe_ferrovanadium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HIGHSPEED_STEEL_DUST = ITEMS.register("fe_highspeed_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HSLA_STEEL_DUST = ITEMS.register("fe_hsla_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INVAR_DUST = ITEMS.register("fe_invar_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_HYDRIDE_DUST = ITEMS.register("fe_iron_hydride_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KANTHAL_DUST = ITEMS.register("fe_kanthal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KOVAR_DUST = ITEMS.register("fe_kovar_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MARAGING_STEEL_DUST = ITEMS.register("fe_maraging_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUSHET_STEEL_DUST = ITEMS.register("fe_mushet_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PIG_IRON_DUST = ITEMS.register("fe_pig_iron_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REYNOLDS_FTO_DUST = ITEMS.register("fe_reynolds_fto_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON_STEEL_DUST = ITEMS.register("fe_silicon_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_STEEL_DUST = ITEMS.register("fe_silver_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPIEGELEISEN_DUST = ITEMS.register("fe_spiegeleisen_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPRING_STEEL_DUST = ITEMS.register("fe_spring_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAINLESS_STEEL_DUST = ITEMS.register("fe_stainless_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STABALLOY_DUST = ITEMS.register("fe_staballoy_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_DUST = ITEMS.register("fe_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOOL_STEEL_DUST = ITEMS.register("fe_tool_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WEATHERING_STEEL_DUST = ITEMS.register("fe_weathering_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOOTZ_STEEL_DUST = ITEMS.register("fe_wootz_steel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WROUGHT_IRON_DUST = ITEMS.register("fe_wrought_iron_dust",
            () -> new Item(new Item.Properties()));

    //Lead
    public static final DeferredItem<Item> MOLYBDOCHALKOS_DUST = ITEMS.register("pb_molybdochalkos_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOLDER_DUST = ITEMS.register("pb_solder_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TERNE_DUST = ITEMS.register("pb_terne_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TYPE_METAL_DUST = ITEMS.register("pb_type_metal_dust",
            () -> new Item(new Item.Properties()));

    //Magnesium
    public static final DeferredItem<Item> ELEKTRON_DUST = ITEMS.register("mg_elektron_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TMGALZN_DUST = ITEMS.register("mg_tmgalzn_dust",
            () -> new Item(new Item.Properties()));

    //Manganese
    public static final DeferredItem<Item> MNFZ_DUST = ITEMS.register("mn_mnfz_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MNSZ_DUST = ITEMS.register("mn_mnsz_dust",
            () -> new Item(new Item.Properties()));

    //Mercury (Cinnabar)
    public static final DeferredItem<Item> ZINC_AMALGAM_DUST = ITEMS.register("hg_zinc_amalgam_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ASHTADHATU_DUST = ITEMS.register("hg_ashtadhatu_dust",
            () -> new Item(new Item.Properties()));

    //Nickel
    public static final DeferredItem<Item> ALUMEL_DUST = ITEMS.register("ni_alumel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRIGHTRAY_DUST = ITEMS.register("ni_brightray_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHROMEL_DUST = ITEMS.register("ni_chromel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COIN_SILVER_DUST = ITEMS.register("ni_coin_silver_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_NICKEL_DUST = ITEMS.register("ni_copper_nickel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUPRONICKEL_DUST = ITEMS.register("ni_cupronickel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GERMAN_SILVER_DUST = ITEMS.register("ni_german_silver_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HASTELLOY_DUST = ITEMS.register("ni_hastelloy_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAUSLER_DUST = ITEMS.register("ni_hausler_alloy_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCONEL_DUST = ITEMS.register("ni_inconel_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCONEL_SES_DUST = ITEMS.register("ni_inconel_ses_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>  MONEL_METAL_DUST = ITEMS.register("ni_monel_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_CARBON_DUST = ITEMS.register("ni_nickel_carbon_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_HYDRIDE_DUST = ITEMS.register("ni_nickel_hydride_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICROSIL_DUST = ITEMS.register("ni_nicrosil_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NIMONIC_DUST = ITEMS.register("ni_nimonic_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NISIL_DUST = ITEMS.register("ni_nisil_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NITINOL_DUST = ITEMS.register("ni_nitinol_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MU_METAL_DUST = ITEMS.register("ni_mu_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PERMALLOY_DUST = ITEMS.register("ni_permalloy_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUPERMALLOY_DUST = ITEMS.register("ni_supermalloy_dust",
            () -> new Item(new Item.Properties()));

    //Potassium
    public static final DeferredItem<Item> NAK_DUST = ITEMS.register("k_nak_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KLI_DUST = ITEMS.register("k_kli_dust",
            () -> new Item(new Item.Properties()));

    //Rhodium
    public static final DeferredItem<Item> PSEUDO_PALLADIUM_DUST = ITEMS.register("rh_pseudo_palladium_dust",
            () -> new Item(new Item.Properties()));

    //Scandium
    public static final DeferredItem<Item> SCANDIUM_HYDRIDE_DUST = ITEMS.register("sc_scandium_hydride_dust",
            () -> new Item(new Item.Properties()));

    //Silver
    public static final DeferredItem<Item> ARGENTIUM_STERLING_SILVER_DUST = ITEMS.register("ag_argentium_sterling_silver_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRITANNIA_SILVER_DUST = ITEMS.register("ag_britannia_silver_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DORE_DUST = ITEMS.register("ag_dore_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DYMALLOY_DUST = ITEMS.register("ag_dymalloy_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLOID_DUST = ITEMS.register("ag_goloid_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_SILVER_DUST = ITEMS.register("ag_platinum_silver_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHIBUICHI_DUST = ITEMS.register("ag_shibuichi_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STERLING_SILVER_DUST = ITEMS.register("ag_sterling_silver_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIBETAN_SILVER_DUST = ITEMS.register("ag_tibetan_silver_dust",
            () -> new Item(new Item.Properties()));

    //Tin
    public static final DeferredItem<Item> BABBITT_DUST = ITEMS.register("sn_babbitt_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRITANNIUM_DUST = ITEMS.register("sn_britannium_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEWTER_DUST = ITEMS.register("sn_pewter_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUEENS_METAL_DUST = ITEMS.register("sn_queens_metal_dust",
            () -> new Item(new Item.Properties()));

    //Titanium
    public static final DeferredItem<Item> SAL_FV_DUST = ITEMS.register("ti_salfv_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BETA_C_DUST = ITEMS.register("ti_betac_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUM_METAL_DUST = ITEMS.register("ti_gum_metal_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_GOLD_DUST = ITEMS.register("ti_titanium_gold_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_HYDRIDE_DUST = ITEMS.register("ti_titanium_hydride_dust",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_NITRIDE_DUST = ITEMS.register("ti_titanium_nitride_dust",
            () -> new Item(new Item.Properties()));

    //Zirconium
    public static final DeferredItem<Item> ZIRCALOY_DUST = ITEMS.register("zr_zircaloy_dust",
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
