package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MegalosMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Ingot
        basicItem(ModItems.ALUMINIUM_INGOT.get());
        basicItem(ModItems.ANTIMONY_INGOT.get());
        basicItem(ModItems.ARSENIC_INGOT.get());
        basicItem(ModItems.BARIUM_INGOT.get());
        basicItem(ModItems.BERYLLIUM_INGOT.get());
        basicItem(ModItems.BISMUTH_INGOT.get());
        basicItem(ModItems.CADMIUM_INGOT.get());
        basicItem(ModItems.CAESIUM_INGOT.get());
        basicItem(ModItems.CALCIUM_INGOT.get());
        basicItem(ModItems.CHROMIUM_INGOT.get());
        basicItem(ModItems.CINNABAR_INGOT.get());
        basicItem(ModItems.COBALT_INGOT.get());
        basicItem(ModItems.GALLIUM_INGOT.get());
        basicItem(ModItems.GERMANIUM_INGOT.get());
        basicItem(ModItems.HAFNIUM_INGOT.get());
        basicItem(ModItems.INDIUM_INGOT.get());
        basicItem(ModItems.IRIDIUM_INGOT.get());
        basicItem(ModItems.LEAD_INGOT.get());
        basicItem(ModItems.LITHIUM_INGOT.get());
        basicItem(ModItems.MAGNESIUM_INGOT.get());
        basicItem(ModItems.MANGANESE_INGOT.get());
        basicItem(ModItems.MOLYBDENUM_INGOT.get());
        basicItem(ModItems.NICKEL_INGOT.get());
        basicItem(ModItems.NIOBIUM_INGOT.get());
        basicItem(ModItems.OSMIUM_INGOT.get());
        basicItem(ModItems.PALLADIUM_INGOT.get());
        basicItem(ModItems.PHOSPHORUS_INGOT.get());
        basicItem(ModItems.PLATINUM_INGOT.get());
        basicItem(ModItems.POTASSIUM_INGOT.get());
        basicItem(ModItems.RHENIUM_INGOT.get());
        basicItem(ModItems.RHODIUM_INGOT.get());
        basicItem(ModItems.RUBIDIUM_INGOT.get());
        basicItem(ModItems.RUTHENIUM_INGOT.get());
        basicItem(ModItems.SCANDIUM_INGOT.get());
        basicItem(ModItems.SELENIUM_INGOT.get());
        basicItem(ModItems.SILICON_INGOT.get());
        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.SODIUM_INGOT.get());
        basicItem(ModItems.STRONTIUM_INGOT.get());
        basicItem(ModItems.TANTALUM_INGOT.get());
        basicItem(ModItems.TECHNETIUM_INGOT.get());
        basicItem(ModItems.TELLURIUM_INGOT.get());
        basicItem(ModItems.THALLIUM_INGOT.get());
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.TITANIUM_INGOT.get());
        basicItem(ModItems.TUNGSTEN_INGOT.get());
        basicItem(ModItems.VANADIUM_INGOT.get());
        basicItem(ModItems.YTTRIUM_INGOT.get());
        basicItem(ModItems.ZINC_INGOT.get());
        basicItem(ModItems.ZIRCONIUM_INGOT.get());

        //Nugget
        basicItem(ModItems.ALUMINIUM_NUGGET.get());
        basicItem(ModItems.ANTIMONY_NUGGET.get());
        basicItem(ModItems.ARSENIC_NUGGET.get());
        basicItem(ModItems.BARIUM_NUGGET.get());
        basicItem(ModItems.BERYLLIUM_NUGGET.get());
        basicItem(ModItems.BISMUTH_NUGGET.get());
        basicItem(ModItems.CADMIUM_NUGGET.get());
        basicItem(ModItems.CAESIUM_NUGGET.get());
        basicItem(ModItems.CALCIUM_NUGGET.get());
        basicItem(ModItems.CHROMIUM_NUGGET.get());
        basicItem(ModItems.CINNABAR_NUGGET.get());
        basicItem(ModItems.COBALT_NUGGET.get());
        basicItem(ModItems.GALLIUM_NUGGET.get());
        basicItem(ModItems.GERMANIUM_NUGGET.get());
        basicItem(ModItems.HAFNIUM_NUGGET.get());
        basicItem(ModItems.INDIUM_NUGGET.get());
        basicItem(ModItems.IRIDIUM_NUGGET.get());
        basicItem(ModItems.LEAD_NUGGET.get());
        basicItem(ModItems.LITHIUM_NUGGET.get());
        basicItem(ModItems.MAGNESIUM_NUGGET.get());
        basicItem(ModItems.MANGANESE_NUGGET.get());
        basicItem(ModItems.MOLYBDENUM_NUGGET.get());
        basicItem(ModItems.NICKEL_NUGGET.get());
        basicItem(ModItems.NIOBIUM_NUGGET.get());
        basicItem(ModItems.OSMIUM_NUGGET.get());
        basicItem(ModItems.PALLADIUM_NUGGET.get());
        basicItem(ModItems.PHOSPHORUS_NUGGET.get());
        basicItem(ModItems.PLATINUM_NUGGET.get());
        basicItem(ModItems.POTASSIUM_NUGGET.get());
        basicItem(ModItems.RHENIUM_NUGGET.get());
        basicItem(ModItems.RHODIUM_NUGGET.get());
        basicItem(ModItems.RUBIDIUM_NUGGET.get());
        basicItem(ModItems.RUTHENIUM_NUGGET.get());
        basicItem(ModItems.SCANDIUM_NUGGET.get());
        basicItem(ModItems.SELENIUM_NUGGET.get());
        basicItem(ModItems.SILICON_NUGGET.get());
        basicItem(ModItems.SILVER_NUGGET.get());
        basicItem(ModItems.SODIUM_NUGGET.get());
        basicItem(ModItems.STRONTIUM_NUGGET.get());
        basicItem(ModItems.TANTALUM_NUGGET.get());
        basicItem(ModItems.TECHNETIUM_NUGGET.get());
        basicItem(ModItems.TELLURIUM_NUGGET.get());
        basicItem(ModItems.THALLIUM_NUGGET.get());
        basicItem(ModItems.TIN_NUGGET.get());
        basicItem(ModItems.TITANIUM_NUGGET.get());
        basicItem(ModItems.TUNGSTEN_NUGGET.get());
        basicItem(ModItems.VANADIUM_NUGGET.get());
        basicItem(ModItems.YTTRIUM_NUGGET.get());
        basicItem(ModItems.ZINC_NUGGET.get());
        basicItem(ModItems.ZIRCONIUM_NUGGET.get());

        //Dust
        basicItem(ModItems.ALUMINIUM_DUST.get());
        basicItem(ModItems.ANTIMONY_DUST.get());
        basicItem(ModItems.ARSENIC_DUST.get());
        basicItem(ModItems.BARIUM_DUST.get());
        basicItem(ModItems.BERYLLIUM_DUST.get());
        basicItem(ModItems.BISMUTH_DUST.get());
        basicItem(ModItems.CADMIUM_DUST.get());
        basicItem(ModItems.CAESIUM_DUST.get());
        basicItem(ModItems.CALCIUM_DUST.get());
        basicItem(ModItems.CHROMIUM_DUST.get());
        basicItem(ModItems.CINNABAR_DUST.get());
        basicItem(ModItems.COBALT_DUST.get());
        basicItem(ModItems.COPPER_DUST.get());
        basicItem(ModItems.GALLIUM_DUST.get());
        basicItem(ModItems.GERMANIUM_DUST.get());
        basicItem(ModItems.HAFNIUM_DUST.get());
        basicItem(ModItems.INDIUM_DUST.get());
        basicItem(ModItems.IRIDIUM_DUST.get());
        basicItem(ModItems.LEAD_DUST.get());
        basicItem(ModItems.LITHIUM_DUST.get());
        basicItem(ModItems.MAGNESIUM_DUST.get());
        basicItem(ModItems.MANGANESE_DUST.get());
        basicItem(ModItems.MOLYBDENUM_DUST.get());
        basicItem(ModItems.NICKEL_DUST.get());
        basicItem(ModItems.NIOBIUM_DUST.get());
        basicItem(ModItems.OSMIUM_DUST.get());
        basicItem(ModItems.PALLADIUM_DUST.get());
        basicItem(ModItems.PHOSPHORUS_DUST.get());
        basicItem(ModItems.PLATINUM_DUST.get());
        basicItem(ModItems.POTASSIUM_DUST.get());
        basicItem(ModItems.RHENIUM_DUST.get());
        basicItem(ModItems.RHODIUM_DUST.get());
        basicItem(ModItems.RUBIDIUM_DUST.get());
        basicItem(ModItems.RUTHENIUM_DUST.get());
        basicItem(ModItems.SCANDIUM_DUST.get());
        basicItem(ModItems.SELENIUM_DUST.get());
        basicItem(ModItems.SILICON_DUST.get());
        basicItem(ModItems.SILVER_DUST.get());
        basicItem(ModItems.SODIUM_DUST.get());
        basicItem(ModItems.STRONTIUM_DUST.get());
        basicItem(ModItems.TANTALUM_DUST.get());
        basicItem(ModItems.TECHNETIUM_DUST.get());
        basicItem(ModItems.TELLURIUM_DUST.get());
        basicItem(ModItems.THALLIUM_DUST.get());
        basicItem(ModItems.TIN_DUST.get());
        basicItem(ModItems.TITANIUM_DUST.get());
        basicItem(ModItems.TUNGSTEN_DUST.get());
        basicItem(ModItems.VANADIUM_DUST.get());
        basicItem(ModItems.YTTRIUM_DUST.get());
        basicItem(ModItems.ZINC_DUST.get());
        basicItem(ModItems.ZIRCONIUM_DUST.get());

        //Raw
        basicItem(ModItems.RAW_ALUMINIUM.get());
        basicItem(ModItems.RAW_ANTIMONY.get());
        basicItem(ModItems.RAW_ARSENIC.get());
        basicItem(ModItems.RAW_BARIUM.get());
        basicItem(ModItems.RAW_BERYLLIUM.get());
        basicItem(ModItems.RAW_BISMUTH.get());
        basicItem(ModItems.RAW_CADMIUM.get());
        basicItem(ModItems.RAW_CAESIUM.get());
        basicItem(ModItems.RAW_CALCIUM.get());
        basicItem(ModItems.RAW_CHROMIUM.get());
        basicItem(ModItems.RAW_CINNABAR.get());
        basicItem(ModItems.RAW_COBALT.get());
        basicItem(ModItems.RAW_GALLIUM.get());
        basicItem(ModItems.RAW_GERMANIUM.get());
        basicItem(ModItems.RAW_HAFNIUM.get());
        basicItem(ModItems.RAW_INDIUM.get());
        basicItem(ModItems.RAW_IRIDIUM.get());
        basicItem(ModItems.RAW_LEAD.get());
        basicItem(ModItems.RAW_LITHIUM.get());
        basicItem(ModItems.RAW_MAGNESIUM.get());
        basicItem(ModItems.RAW_MANGANESE.get());
        basicItem(ModItems.RAW_MOLYBDENUM.get());
        basicItem(ModItems.RAW_NICKEL.get());
        basicItem(ModItems.RAW_NIOBIUM.get());
        basicItem(ModItems.RAW_OSMIUM.get());
        basicItem(ModItems.RAW_PALLADIUM.get());
        basicItem(ModItems.RAW_PHOSPHORUS.get());
        basicItem(ModItems.RAW_PLATINUM.get());
        basicItem(ModItems.RAW_POTASSIUM.get());
        basicItem(ModItems.RAW_RHENIUM.get());
        basicItem(ModItems.RAW_RHODIUM.get());
        basicItem(ModItems.RAW_RUBIDIUM.get());
        basicItem(ModItems.RAW_RUTHENIUM.get());
        basicItem(ModItems.RAW_SCANDIUM.get());
        basicItem(ModItems.RAW_SELENIUM.get());
        basicItem(ModItems.RAW_SILICON.get());
        basicItem(ModItems.RAW_SILVER.get());
        basicItem(ModItems.RAW_SODIUM.get());
        basicItem(ModItems.RAW_STRONTIUM.get());
        basicItem(ModItems.RAW_TANTALUM.get());
        basicItem(ModItems.RAW_TECHNETIUM.get());
        basicItem(ModItems.RAW_TELLURIUM.get());
        basicItem(ModItems.RAW_THALLIUM.get());
        basicItem(ModItems.RAW_TIN.get());
        basicItem(ModItems.RAW_TITANIUM.get());
        basicItem(ModItems.RAW_TUNGSTEN.get());
        basicItem(ModItems.RAW_VANADIUM.get());
        basicItem(ModItems.RAW_YTTRIUM.get());
        basicItem(ModItems.RAW_ZINC.get());
        basicItem(ModItems.RAW_ZIRCONIUM.get());

        //Armour
        basicItem(ModItems.ARMOUR_PADDING.get());

        //Metallurgy - Hoplology
        basicItem(ModItems.FABRIC_GRIP.get());
        basicItem(ModItems.FABRIC_STRAP.get());

        basicItem(ModItems.ALUMINIUM_AXEHEAD.get());
        basicItem(ModItems.ALUMINIUM_BLADE.get());
        basicItem(ModItems.ALUMINIUM_GUARD.get());
        basicItem(ModItems.ALUMINIUM_HILT.get());
        basicItem(ModItems.ALUMINIUM_SHOVELHEAD.get());
        basicItem(ModItems.ALUMINIUM_POMMEL.get());
        basicItem(ModItems.ALUMINIUM_PICK.get());
        basicItem(ModItems.ALUMINIUM_PLATE.get());

        basicItem(ModItems.SILVER_AXEHEAD.get());
        basicItem(ModItems.SILVER_BLADE.get());
        basicItem(ModItems.SILVER_GUARD.get());
        basicItem(ModItems.SILVER_HILT.get());
        basicItem(ModItems.SILVER_SHOVELHEAD.get());
        basicItem(ModItems.SILVER_POMMEL.get());
        basicItem(ModItems.SILVER_PICK.get());
        basicItem(ModItems.SILVER_PLATE.get());

        basicItem(ModItems.TITANIUM_AXEHEAD.get());
        basicItem(ModItems.TITANIUM_BLADE.get());
        basicItem(ModItems.TITANIUM_GUARD.get());
        basicItem(ModItems.TITANIUM_HILT.get());
        basicItem(ModItems.TITANIUM_SHOVELHEAD.get());
        basicItem(ModItems.TITANIUM_POMMEL.get());
        basicItem(ModItems.TITANIUM_PICK.get());
        basicItem(ModItems.TITANIUM_PLATE.get());

        handheldItem(ModItems.ALUMINIUM_SWORD);
        handheldItem(ModItems.ALUMINIUM_PICKAXE);
        handheldItem(ModItems.ALUMINIUM_SHOVEL);
        handheldItem(ModItems.ALUMINIUM_AXE);
        handheldItem(ModItems.ALUMINIUM_HOE);

        handheldItem(ModItems.SILVER_SWORD);
        handheldItem(ModItems.SILVER_PICKAXE);
        handheldItem(ModItems.SILVER_SHOVEL);
        handheldItem(ModItems.SILVER_AXE);
        handheldItem(ModItems.SILVER_HOE);

        handheldItem(ModItems.TITANIUM_SWORD);
        handheldItem(ModItems.TITANIUM_PICKAXE);
        handheldItem(ModItems.TITANIUM_SHOVEL);
        handheldItem(ModItems.TITANIUM_AXE);
        handheldItem(ModItems.TITANIUM_HOE);

        trimmedArmorItem(ModItems.ALUMINIUM_HELMET);
        trimmedArmorItem(ModItems.ALUMINIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.ALUMINIUM_LEGGINGS);
        trimmedArmorItem(ModItems.ALUMINIUM_BOOTS);

        trimmedArmorItem(ModItems.SILVER_HELMET);
        trimmedArmorItem(ModItems.SILVER_CHESTPLATE);
        trimmedArmorItem(ModItems.SILVER_LEGGINGS);
        trimmedArmorItem(ModItems.SILVER_BOOTS);

        trimmedArmorItem(ModItems.TITANIUM_HELMET);
        trimmedArmorItem(ModItems.TITANIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.TITANIUM_LEGGINGS);
        trimmedArmorItem(ModItems.TITANIUM_BOOTS);

        //Alloys - Ingots
        //Aluminium
        basicItem(ModItems.AA_INGOT.get());
        basicItem(ModItems.AL_LI_INGOT.get());
        basicItem(ModItems.ALNICO_INGOT.get());
        basicItem(ModItems.ALUMINIUM_SCANDIUM_INGOT.get());
        basicItem(ModItems.BIRMABRIGHT_INGOT.get());
        basicItem(ModItems.DEVARDA_INGOT.get());
        basicItem(ModItems.DURALUMIN_INGOT.get());
        basicItem(ModItems.HIDUMINIUM_INGOT.get());
        basicItem(ModItems.HYDRONALIUM_INGOT.get());
        basicItem(ModItems.ITALMA_INGOT.get());
        basicItem(ModItems.MAGNALIUM_INGOT.get());
        basicItem(ModItems.MAGNOX_INGOT.get());
        basicItem(ModItems.NAMBE_INGOT.get());
        basicItem(ModItems.NITIAL_INGOT.get());
        basicItem(ModItems.SILUMIN_INGOT.get());
        basicItem(ModItems.Y_ALLOY_INGOT.get());
        basicItem(ModItems.ZAMAK_INGOT.get());

        //Beryllium
        basicItem(ModItems.LOCKALLOY_INGOT.get());

        //Bismuth
        basicItem(ModItems.BISMANOL_INGOT.get());
        basicItem(ModItems.CERROBEND_INGOT.get());
        basicItem(ModItems.CERROSAFE_INGOT.get());
        basicItem(ModItems.FIELDS_METAL_INGOT.get());
        basicItem(ModItems.ROSE_METAL_INGOT.get());
        basicItem(ModItems.WOODS_METAL_INGOT.get());

        //Chromium
        basicItem(ModItems.CHROMIUM_HYDRIDE_INGOT.get());
        basicItem(ModItems.CRNISZWTI_INGOT.get());
        basicItem(ModItems.NICHROME_INGOT.get());

        //Cobalt
        basicItem(ModItems.ELGILOY_INGOT.get());
        basicItem(ModItems.MEGALLIUM_INGOT.get());
        basicItem(ModItems.STELLITE_INGOT.get());
        basicItem(ModItems.TALONITE_INGOT.get());
        basicItem(ModItems.ULTIMET_INGOT.get());
        basicItem(ModItems.VITALLIUM_INGOT.get());

        //Copper
        basicItem(ModItems.ALUMINIUM_BRONZE_INGOT.get());
        basicItem(ModItems.ARSENICAL_BRONZE_INGOT.get());
        basicItem(ModItems.ARSENICAL_COPPER_INGOT.get());
        basicItem(ModItems.BELL_METAL_INGOT.get());
        basicItem(ModItems.BERYLLIUM_COPPER_INGOT.get());
        basicItem(ModItems.BILLON_INGOT.get());
        basicItem(ModItems.BRASS_INGOT.get());
        basicItem(ModItems.BRONZE_INGOT.get());
        basicItem(ModItems.CALAMINE_BRASS_INGOT.get());
        basicItem(ModItems.CHINESE_SILVER_INGOT.get());
        basicItem(ModItems.CONSTANTAN_INGOT.get());
        basicItem(ModItems.COPPER_HYDRIDE_INGOT.get());
        basicItem(ModItems.COPPER_TUNGSTEN_INGOT.get());
        basicItem(ModItems.CORINTHIAN_BRONZE_INGOT.get());
        basicItem(ModItems.CUNIFE_INGOT.get());
        basicItem(ModItems.CUAG_INGOT.get());
        basicItem(ModItems.CYMBAL_ALLOY_INGOT.get());
        basicItem(ModItems.DUTCH_METAL_INGOT.get());
        basicItem(ModItems.FLORENTINE_BRONZE_INGOT.get());
        basicItem(ModItems.GILDING_METAL_INGOT.get());
        basicItem(ModItems.GLUCYDUR_INGOT.get());
        basicItem(ModItems.GUANIN_INGOT.get());
        basicItem(ModItems.GUN_METAL_INGOT.get());
        basicItem(ModItems.HEPATIZON_INGOT.get());
        basicItem(ModItems.MANGANIN_INGOT.get());
        basicItem(ModItems.MELCHIOR_INGOT.get());
        basicItem(ModItems.MUNTZ_METAL_INGOT.get());
        basicItem(ModItems.NICKEL_SILVER_INGOT.get());
        basicItem(ModItems.NORDIC_GOLD_INGOT.get());
        basicItem(ModItems.ORMOLU_INGOT.get());
        basicItem(ModItems.PHOSPHOR_BRONZE_INGOT.get());
        basicItem(ModItems.PINCHBECK_INGOT.get());
        basicItem(ModItems.PRINCES_METAL_INGOT.get());
        basicItem(ModItems.SHAKUDO_INGOT.get());
        basicItem(ModItems.SILICON_BRONZE_INGOT.get());
        basicItem(ModItems.SPECULUM_METAL_INGOT.get());
        basicItem(ModItems.TOMBAC_INGOT.get());
        basicItem(ModItems.TUMBAGA_INGOT.get());
        basicItem(ModItems.WHITE_BRONZE_INGOT.get());

        //Gallium
        basicItem(ModItems.AL_GA_INGOT.get());
        basicItem(ModItems.GALFENOL_INGOT.get());
        basicItem(ModItems.GALINSTAN_INGOT.get());

        //Gold
        basicItem(ModItems.COLORED_GOLD_INGOT.get());
        basicItem(ModItems.CROWN_GOLD_INGOT.get());
        basicItem(ModItems.ELECTRUM_INGOT.get());
        basicItem(ModItems.RHODITE_INGOT.get());
        basicItem(ModItems.ROSE_GOLD_INGOT.get());
        basicItem(ModItems.WHITE_GOLD_INGOT.get());

        //Iron
        basicItem(ModItems.ANTHRACITE_IRON_INGOT.get());
        basicItem(ModItems.BULAT_STEEL_INGOT.get());
        basicItem(ModItems.CAST_IRON_INGOT.get());
        basicItem(ModItems.CHROMOLY_INGOT.get());
        basicItem(ModItems.CRUCIBLE_STEEL_INGOT.get());
        basicItem(ModItems.DAMASCUS_STEEL_INGOT.get());
        basicItem(ModItems.DUCOL_INGOT.get());
        basicItem(ModItems.ELINVAR_INGOT.get());
        basicItem(ModItems.FERNICO_INGOT.get());
        basicItem(ModItems.FERROCHROMIUM_INGOT.get());
        basicItem(ModItems.FERROMAGNESIUM_INGOT.get());
        basicItem(ModItems.FERROMANGANESE_INGOT.get());
        basicItem(ModItems.FERROMOLYBDENUM_INGOT.get());
        basicItem(ModItems.FERRONICKEL_INGOT.get());
        basicItem(ModItems.FERROPHOSPHORUS_INGOT.get());
        basicItem(ModItems.FERROSILICON_INGOT.get());
        basicItem(ModItems.FERROTITANIUM_INGOT.get());
        basicItem(ModItems.FERROVANADIUM_INGOT.get());
        basicItem(ModItems.HIGHSPEED_STEEL_INGOT.get());
        basicItem(ModItems.HSLA_STEEL_INGOT.get());
        basicItem(ModItems.INVAR_INGOT.get());
        basicItem(ModItems.IRON_HYDRIDE_INGOT.get());
        basicItem(ModItems.KANTHAL_INGOT.get());
        basicItem(ModItems.KOVAR_INGOT.get());
        basicItem(ModItems.MARAGING_STEEL_INGOT.get());
        basicItem(ModItems.MUSHET_STEEL_INGOT.get());
        basicItem(ModItems.PIG_IRON_INGOT.get());
        basicItem(ModItems.REYNOLDS_FTO_INGOT.get());
        basicItem(ModItems.SILICON_STEEL_INGOT.get());
        basicItem(ModItems.SILVER_STEEL_INGOT.get());
        basicItem(ModItems.SPIEGELEISEN_INGOT.get());
        basicItem(ModItems.SPRING_STEEL_INGOT.get());
        basicItem(ModItems.STAINLESS_STEEL_INGOT.get());
        basicItem(ModItems.STABALLOY_INGOT.get());
        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.TOOL_STEEL_INGOT.get());
        basicItem(ModItems.WEATHERING_STEEL_INGOT.get());
        basicItem(ModItems.WOOTZ_STEEL_INGOT.get());
        basicItem(ModItems.WROUGHT_IRON_INGOT.get());

        //Lead
        basicItem(ModItems.MOLYBDOCHALKOS_INGOT.get());
        basicItem(ModItems.SOLDER_INGOT.get());
        basicItem(ModItems.TERNE_INGOT.get());
        basicItem(ModItems.TYPE_METAL_INGOT.get());

        //Magnesium
        basicItem(ModItems.ELEKTRON_INGOT.get());
        basicItem(ModItems.TMGALZN_INGOT.get());

        //Manganese
        basicItem(ModItems.MNFZ_INGOT.get());
        basicItem(ModItems.MNSZ_INGOT.get());

        //Mercury
        basicItem(ModItems.ZINC_AMALGAM_INGOT.get());
        basicItem(ModItems.ASHTADHATU_INGOT.get());

        //Nickel
        basicItem(ModItems.ALUMEL_INGOT.get());
        basicItem(ModItems.BRIGHTRAY_INGOT.get());
        basicItem(ModItems.CHROMEL_INGOT.get());
        basicItem(ModItems.COIN_SILVER_INGOT.get());
        basicItem(ModItems.COPPER_NICKEL_INGOT.get());
        basicItem(ModItems.CUPRONICKEL_INGOT.get());
        basicItem(ModItems.GERMAN_SILVER_INGOT.get());
        basicItem(ModItems.HASTELLOY_INGOT.get());
        basicItem(ModItems.HAUSLER_INGOT.get());
        basicItem(ModItems.INCONEL_INGOT.get());
        basicItem(ModItems.INCONEL_SES_INGOT.get());
        basicItem(ModItems.MONEL_METAL_INGOT.get());
        basicItem(ModItems.MU_METAL_INGOT.get());
        basicItem(ModItems.NICKEL_CARBON_INGOT.get());
        basicItem(ModItems.NICKEL_HYDRIDE_INGOT.get());
        basicItem(ModItems.NICROSIL_INGOT.get());
        basicItem(ModItems.NIMONIC_INGOT.get());
        basicItem(ModItems.NISIL_INGOT.get());
        basicItem(ModItems.NITINOL_INGOT.get());
        basicItem(ModItems.PERMALLOY_INGOT.get());
        basicItem(ModItems.SUPERMALLOY_INGOT.get());

        //Potassium
        basicItem(ModItems.KLI_INGOT.get());
        basicItem(ModItems.NAK_INGOT.get());

        //Rhodium
        basicItem(ModItems.PSEUDO_PALLADIUM_INGOT.get());

        //Scandium
        basicItem(ModItems.SCANDIUM_HYDRIDE_INGOT.get());

        //Silver
        basicItem(ModItems.ARGENTIUM_STERLING_SILVER_INGOT.get());
        basicItem(ModItems.BRITANNIA_SILVER_INGOT.get());
        basicItem(ModItems.DORE_INGOT.get());
        basicItem(ModItems.DYMALLOY_INGOT.get());
        basicItem(ModItems.GOLOID_INGOT.get());
        basicItem(ModItems.PLATINUM_SILVER_INGOT.get());
        basicItem(ModItems.SHIBUICHI_INGOT.get());
        basicItem(ModItems.STERLING_SILVER_INGOT.get());
        basicItem(ModItems.TIBETAN_SILVER_INGOT.get());

        //Tin
        basicItem(ModItems.BABBITT_INGOT.get());
        basicItem(ModItems.BRITANNIUM_INGOT.get());
        basicItem(ModItems.PEWTER_INGOT.get());
        basicItem(ModItems.QUEENS_METAL_INGOT.get());

        //Titanium
        basicItem(ModItems.BETA_C_INGOT.get());
        basicItem(ModItems.GUM_METAL_INGOT.get());
        basicItem(ModItems.SAL_FV_INGOT.get());
        basicItem(ModItems.TITANIUM_GOLD_INGOT.get());
        basicItem(ModItems.TITANIUM_HYDRIDE_INGOT.get());
        basicItem(ModItems.TITANIUM_NITRIDE_INGOT.get());

        //Zirconium
        basicItem(ModItems.ZIRCALOY_INGOT.get());

        //Alloys - Nugget
        //Aluminium
        basicItem(ModItems.AA_NUGGET.get());
        basicItem(ModItems.AL_LI_NUGGET.get());
        basicItem(ModItems.ALNICO_NUGGET.get());
        basicItem(ModItems.ALUMINIUM_SCANDIUM_NUGGET.get());
        basicItem(ModItems.BIRMABRIGHT_NUGGET.get());
        basicItem(ModItems.DEVARDA_NUGGET.get());
        basicItem(ModItems.DURALUMIN_NUGGET.get());
        basicItem(ModItems.HIDUMINIUM_NUGGET.get());
        basicItem(ModItems.HYDRONALIUM_NUGGET.get());
        basicItem(ModItems.ITALMA_NUGGET.get());
        basicItem(ModItems.MAGNALIUM_NUGGET.get());
        basicItem(ModItems.MAGNOX_NUGGET.get());
        basicItem(ModItems.NAMBE_NUGGET.get());
        basicItem(ModItems.NITIAL_NUGGET.get());
        basicItem(ModItems.SILUMIN_NUGGET.get());
        basicItem(ModItems.Y_ALLOY_NUGGET.get());
        basicItem(ModItems.ZAMAK_NUGGET.get());

        //Beryllium
        basicItem(ModItems.LOCKALLOY_NUGGET.get());

        //Bismuth
        basicItem(ModItems.BISMANOL_NUGGET.get());
        basicItem(ModItems.CERROBEND_NUGGET.get());
        basicItem(ModItems.CERROSAFE_NUGGET.get());
        basicItem(ModItems.FIELDS_METAL_NUGGET.get());
        basicItem(ModItems.ROSE_METAL_NUGGET.get());
        basicItem(ModItems.WOODS_METAL_NUGGET.get());

        //Chromium
        basicItem(ModItems.CHROMIUM_HYDRIDE_NUGGET.get());
        basicItem(ModItems.CRNISZWTI_NUGGET.get());
        basicItem(ModItems.NICHROME_NUGGET.get());

        //Cobalt
        basicItem(ModItems.ELGILOY_NUGGET.get());
        basicItem(ModItems.MEGALLIUM_NUGGET.get());
        basicItem(ModItems.STELLITE_NUGGET.get());
        basicItem(ModItems.TALONITE_NUGGET.get());
        basicItem(ModItems.ULTIMET_NUGGET.get());
        basicItem(ModItems.VITALLIUM_NUGGET.get());

        //Copper
        basicItem(ModItems.ALUMINIUM_BRONZE_NUGGET.get());
        basicItem(ModItems.ARSENICAL_BRONZE_NUGGET.get());
        basicItem(ModItems.ARSENICAL_COPPER_NUGGET.get());
        basicItem(ModItems.BELL_METAL_NUGGET.get());
        basicItem(ModItems.BERYLLIUM_COPPER_NUGGET.get());
        basicItem(ModItems.BILLON_NUGGET.get());
        basicItem(ModItems.BRASS_NUGGET.get());
        basicItem(ModItems.BRONZE_NUGGET.get());
        basicItem(ModItems.CALAMINE_BRASS_NUGGET.get());
        basicItem(ModItems.CHINESE_SILVER_NUGGET.get());
        basicItem(ModItems.CONSTANTAN_NUGGET.get());
        basicItem(ModItems.COPPER_HYDRIDE_NUGGET.get());
        basicItem(ModItems.COPPER_TUNGSTEN_NUGGET.get());
        basicItem(ModItems.CORINTHIAN_BRONZE_NUGGET.get());
        basicItem(ModItems.CUNIFE_NUGGET.get());
        basicItem(ModItems.CUAG_NUGGET.get());
        basicItem(ModItems.CYMBAL_ALLOY_NUGGET.get());
        basicItem(ModItems.DUTCH_METAL_NUGGET.get());
        basicItem(ModItems.FLORENTINE_BRONZE_NUGGET.get());
        basicItem(ModItems.GILDING_METAL_NUGGET.get());
        basicItem(ModItems.GLUCYDUR_NUGGET.get());
        basicItem(ModItems.GUANIN_NUGGET.get());
        basicItem(ModItems.GUN_METAL_NUGGET.get());
        basicItem(ModItems.HEPATIZON_NUGGET.get());
        basicItem(ModItems.MANGANIN_NUGGET.get());
        basicItem(ModItems.MELCHIOR_NUGGET.get());
        basicItem(ModItems.MUNTZ_METAL_NUGGET.get());
        basicItem(ModItems.NICKEL_SILVER_NUGGET.get());
        basicItem(ModItems.NORDIC_GOLD_NUGGET.get());
        basicItem(ModItems.ORMOLU_NUGGET.get());
        basicItem(ModItems.PHOSPHOR_BRONZE_NUGGET.get());
        basicItem(ModItems.PINCHBECK_NUGGET.get());
        basicItem(ModItems.PRINCES_METAL_NUGGET.get());
        basicItem(ModItems.SHAKUDO_NUGGET.get());
        basicItem(ModItems.SILICON_BRONZE_NUGGET.get());
        basicItem(ModItems.SPECULUM_METAL_NUGGET.get());
        basicItem(ModItems.TOMBAC_NUGGET.get());
        basicItem(ModItems.TUMBAGA_NUGGET.get());
        basicItem(ModItems.WHITE_BRONZE_NUGGET.get());

        //Gallium
        basicItem(ModItems.AL_GA_NUGGET.get());
        basicItem(ModItems.GALFENOL_NUGGET.get());
        basicItem(ModItems.GALINSTAN_NUGGET.get());

        //Gold
        basicItem(ModItems.COLORED_GOLD_NUGGET.get());
        basicItem(ModItems.CROWN_GOLD_NUGGET.get());
        basicItem(ModItems.ELECTRUM_NUGGET.get());
        basicItem(ModItems.RHODITE_NUGGET.get());
        basicItem(ModItems.ROSE_GOLD_NUGGET.get());
        basicItem(ModItems.WHITE_GOLD_NUGGET.get());

        //Iron
        basicItem(ModItems.ANTHRACITE_IRON_NUGGET.get());
        basicItem(ModItems.BULAT_STEEL_NUGGET.get());
        basicItem(ModItems.CAST_IRON_NUGGET.get());
        basicItem(ModItems.CHROMOLY_NUGGET.get());
        basicItem(ModItems.CRUCIBLE_STEEL_NUGGET.get());
        basicItem(ModItems.DAMASCUS_STEEL_NUGGET.get());
        basicItem(ModItems.DUCOL_NUGGET.get());
        basicItem(ModItems.ELINVAR_NUGGET.get());
        basicItem(ModItems.FERNICO_NUGGET.get());
        basicItem(ModItems.FERROCHROMIUM_NUGGET.get());
        basicItem(ModItems.FERROMAGNESIUM_NUGGET.get());
        basicItem(ModItems.FERROMANGANESE_NUGGET.get());
        basicItem(ModItems.FERROMOLYBDENUM_NUGGET.get());
        basicItem(ModItems.FERRONICKEL_NUGGET.get());
        basicItem(ModItems.FERROPHOSPHORUS_NUGGET.get());
        basicItem(ModItems.FERROSILICON_NUGGET.get());
        basicItem(ModItems.FERROTITANIUM_NUGGET.get());
        basicItem(ModItems.FERROVANADIUM_NUGGET.get());
        basicItem(ModItems.HIGHSPEED_STEEL_NUGGET.get());
        basicItem(ModItems.HSLA_STEEL_NUGGET.get());
        basicItem(ModItems.INVAR_NUGGET.get());
        basicItem(ModItems.IRON_HYDRIDE_NUGGET.get());
        basicItem(ModItems.KANTHAL_NUGGET.get());
        basicItem(ModItems.KOVAR_NUGGET.get());
        basicItem(ModItems.MARAGING_STEEL_NUGGET.get());
        basicItem(ModItems.MUSHET_STEEL_NUGGET.get());
        basicItem(ModItems.PIG_IRON_NUGGET.get());
        basicItem(ModItems.REYNOLDS_FTO_NUGGET.get());
        basicItem(ModItems.SILICON_STEEL_NUGGET.get());
        basicItem(ModItems.SILVER_STEEL_NUGGET.get());
        basicItem(ModItems.SPIEGELEISEN_NUGGET.get());
        basicItem(ModItems.SPRING_STEEL_NUGGET.get());
        basicItem(ModItems.STAINLESS_STEEL_NUGGET.get());
        basicItem(ModItems.STABALLOY_NUGGET.get());
        basicItem(ModItems.STEEL_NUGGET.get());
        basicItem(ModItems.TOOL_STEEL_NUGGET.get());
        basicItem(ModItems.WEATHERING_STEEL_NUGGET.get());
        basicItem(ModItems.WOOTZ_STEEL_NUGGET.get());
        basicItem(ModItems.WROUGHT_IRON_NUGGET.get());

        //Lead
        basicItem(ModItems.MOLYBDOCHALKOS_NUGGET.get());
        basicItem(ModItems.SOLDER_NUGGET.get());
        basicItem(ModItems.TERNE_NUGGET.get());
        basicItem(ModItems.TYPE_METAL_NUGGET.get());

        //Magnesium
        basicItem(ModItems.ELEKTRON_NUGGET.get());
        basicItem(ModItems.TMGALZN_NUGGET.get());

        //Manganese
        basicItem(ModItems.MNFZ_NUGGET.get());
        basicItem(ModItems.MNSZ_NUGGET.get());

        //Mercury
        basicItem(ModItems.ZINC_AMALGAM_NUGGET.get());
        basicItem(ModItems.ASHTADHATU_NUGGET.get());

        //Nickel
        basicItem(ModItems.ALUMEL_NUGGET.get());
        basicItem(ModItems.BRIGHTRAY_NUGGET.get());
        basicItem(ModItems.CHROMEL_NUGGET.get());
        basicItem(ModItems.COIN_SILVER_NUGGET.get());
        basicItem(ModItems.COPPER_NICKEL_NUGGET.get());
        basicItem(ModItems.CUPRONICKEL_NUGGET.get());
        basicItem(ModItems.GERMAN_SILVER_NUGGET.get());
        basicItem(ModItems.HASTELLOY_NUGGET.get());
        basicItem(ModItems.HAUSLER_NUGGET.get());
        basicItem(ModItems.INCONEL_NUGGET.get());
        basicItem(ModItems.INCONEL_SES_NUGGET.get());
        basicItem(ModItems.MONEL_METAL_NUGGET.get());
        basicItem(ModItems.MU_METAL_NUGGET.get());
        basicItem(ModItems.NICKEL_CARBON_NUGGET.get());
        basicItem(ModItems.NICKEL_HYDRIDE_NUGGET.get());
        basicItem(ModItems.NICROSIL_NUGGET.get());
        basicItem(ModItems.NIMONIC_NUGGET.get());
        basicItem(ModItems.NISIL_NUGGET.get());
        basicItem(ModItems.NITINOL_NUGGET.get());
        basicItem(ModItems.PERMALLOY_NUGGET.get());
        basicItem(ModItems.SUPERMALLOY_NUGGET.get());

        //Potassium
        basicItem(ModItems.KLI_NUGGET.get());
        basicItem(ModItems.NAK_NUGGET.get());

        //Rhodium
        basicItem(ModItems.PSEUDO_PALLADIUM_NUGGET.get());

        //Scandium
        basicItem(ModItems.SCANDIUM_HYDRIDE_NUGGET.get());

        //Silver
        basicItem(ModItems.ARGENTIUM_STERLING_SILVER_NUGGET.get());
        basicItem(ModItems.BRITANNIA_SILVER_NUGGET.get());
        basicItem(ModItems.DORE_NUGGET.get());
        basicItem(ModItems.DYMALLOY_NUGGET.get());
        basicItem(ModItems.GOLOID_NUGGET.get());
        basicItem(ModItems.PLATINUM_SILVER_NUGGET.get());
        basicItem(ModItems.SHIBUICHI_NUGGET.get());
        basicItem(ModItems.STERLING_SILVER_NUGGET.get());
        basicItem(ModItems.TIBETAN_SILVER_NUGGET.get());

        //Tin
        basicItem(ModItems.BABBITT_NUGGET.get());
        basicItem(ModItems.BRITANNIUM_NUGGET.get());
        basicItem(ModItems.PEWTER_NUGGET.get());
        basicItem(ModItems.QUEENS_METAL_NUGGET.get());

        //Titanium
        basicItem(ModItems.BETA_C_NUGGET.get());
        basicItem(ModItems.GUM_METAL_NUGGET.get());
        basicItem(ModItems.SAL_FV_NUGGET.get());
        basicItem(ModItems.TITANIUM_GOLD_NUGGET.get());
        basicItem(ModItems.TITANIUM_HYDRIDE_NUGGET.get());
        basicItem(ModItems.TITANIUM_NITRIDE_NUGGET.get());

        //Zirconium
        basicItem(ModItems.ZIRCALOY_NUGGET.get());

        //Alloys - Dust
        //Aluminium
        basicItem(ModItems.AA_DUST.get());
        basicItem(ModItems.AL_LI_DUST.get());
        basicItem(ModItems.ALNICO_DUST.get());
        basicItem(ModItems.ALUMINIUM_SCANDIUM_DUST.get());
        basicItem(ModItems.BIRMABRIGHT_DUST.get());
        basicItem(ModItems.DEVARDA_DUST.get());
        basicItem(ModItems.DURALUMIN_DUST.get());
        basicItem(ModItems.HIDUMINIUM_DUST.get());
        basicItem(ModItems.HYDRONALIUM_DUST.get());
        basicItem(ModItems.ITALMA_DUST.get());
        basicItem(ModItems.MAGNALIUM_DUST.get());
        basicItem(ModItems.MAGNOX_DUST.get());
        basicItem(ModItems.NAMBE_DUST.get());
        basicItem(ModItems.NITIAL_DUST.get());
        basicItem(ModItems.SILUMIN_DUST.get());
        basicItem(ModItems.Y_ALLOY_DUST.get());
        basicItem(ModItems.ZAMAK_DUST.get());

        //Beryllium
        basicItem(ModItems.LOCKALLOY_DUST.get());

        //Bismuth
        basicItem(ModItems.BISMANOL_DUST.get());
        basicItem(ModItems.CERROBEND_DUST.get());
        basicItem(ModItems.CERROSAFE_DUST.get());
        basicItem(ModItems.FIELDS_METAL_DUST.get());
        basicItem(ModItems.ROSE_METAL_DUST.get());
        basicItem(ModItems.WOODS_METAL_DUST.get());

        //Chromium
        basicItem(ModItems.CHROMIUM_HYDRIDE_DUST.get());
        basicItem(ModItems.CRNISZWTI_DUST.get());
        basicItem(ModItems.NICHROME_DUST.get());

        //Cobalt
        basicItem(ModItems.ELGILOY_DUST.get());
        basicItem(ModItems.MEGALLIUM_DUST.get());
        basicItem(ModItems.STELLITE_DUST.get());
        basicItem(ModItems.TALONITE_DUST.get());
        basicItem(ModItems.ULTIMET_DUST.get());
        basicItem(ModItems.VITALLIUM_DUST.get());

        //Copper
        basicItem(ModItems.ALUMINIUM_BRONZE_DUST.get());
        basicItem(ModItems.ARSENICAL_BRONZE_DUST.get());
        basicItem(ModItems.ARSENICAL_COPPER_DUST.get());
        basicItem(ModItems.BELL_METAL_DUST.get());
        basicItem(ModItems.BERYLLIUM_COPPER_DUST.get());
        basicItem(ModItems.BILLON_DUST.get());
        basicItem(ModItems.BRASS_DUST.get());
        basicItem(ModItems.BRONZE_DUST.get());
        basicItem(ModItems.CALAMINE_BRASS_DUST.get());
        basicItem(ModItems.CHINESE_SILVER_DUST.get());
        basicItem(ModItems.CONSTANTAN_DUST.get());
        basicItem(ModItems.COPPER_HYDRIDE_DUST.get());
        basicItem(ModItems.COPPER_TUNGSTEN_DUST.get());
        basicItem(ModItems.CORINTHIAN_BRONZE_DUST.get());
        basicItem(ModItems.CUNIFE_DUST.get());
        basicItem(ModItems.CUAG_DUST.get());
        basicItem(ModItems.CYMBAL_ALLOY_DUST.get());
        basicItem(ModItems.DUTCH_METAL_DUST.get());
        basicItem(ModItems.FLORENTINE_BRONZE_DUST.get());
        basicItem(ModItems.GILDING_METAL_DUST.get());
        basicItem(ModItems.GLUCYDUR_DUST.get());
        basicItem(ModItems.GUANIN_DUST.get());
        basicItem(ModItems.GUN_METAL_DUST.get());
        basicItem(ModItems.HEPATIZON_DUST.get());
        basicItem(ModItems.MANGANIN_DUST.get());
        basicItem(ModItems.MELCHIOR_DUST.get());
        basicItem(ModItems.MUNTZ_METAL_DUST.get());
        basicItem(ModItems.NICKEL_SILVER_DUST.get());
        basicItem(ModItems.NORDIC_GOLD_DUST.get());
        basicItem(ModItems.ORMOLU_DUST.get());
        basicItem(ModItems.PHOSPHOR_BRONZE_DUST.get());
        basicItem(ModItems.PINCHBECK_DUST.get());
        basicItem(ModItems.PRINCES_METAL_DUST.get());
        basicItem(ModItems.SHAKUDO_DUST.get());
        basicItem(ModItems.SILICON_BRONZE_DUST.get());
        basicItem(ModItems.SPECULUM_METAL_DUST.get());
        basicItem(ModItems.TOMBAC_DUST.get());
        basicItem(ModItems.TUMBAGA_DUST.get());
        basicItem(ModItems.WHITE_BRONZE_DUST.get());

        //Gallium
        basicItem(ModItems.AL_GA_DUST.get());
        basicItem(ModItems.GALFENOL_DUST.get());
        basicItem(ModItems.GALINSTAN_DUST.get());

        //Gold
        basicItem(ModItems.COLORED_GOLD_DUST.get());
        basicItem(ModItems.CROWN_GOLD_DUST.get());
        basicItem(ModItems.ELECTRUM_DUST.get());
        basicItem(ModItems.RHODITE_DUST.get());
        basicItem(ModItems.ROSE_GOLD_DUST.get());
        basicItem(ModItems.WHITE_GOLD_DUST.get());

        //Iron
        basicItem(ModItems.ANTHRACITE_IRON_DUST.get());
        basicItem(ModItems.BULAT_STEEL_DUST.get());
        basicItem(ModItems.CAST_IRON_DUST.get());
        basicItem(ModItems.CHROMOLY_DUST.get());
        basicItem(ModItems.CRUCIBLE_STEEL_DUST.get());
        basicItem(ModItems.DAMASCUS_STEEL_DUST.get());
        basicItem(ModItems.DUCOL_DUST.get());
        basicItem(ModItems.ELINVAR_DUST.get());
        basicItem(ModItems.FERNICO_DUST.get());
        basicItem(ModItems.FERROCHROMIUM_DUST.get());
        basicItem(ModItems.FERROMAGNESIUM_DUST.get());
        basicItem(ModItems.FERROMANGANESE_DUST.get());
        basicItem(ModItems.FERROMOLYBDENUM_DUST.get());
        basicItem(ModItems.FERRONICKEL_DUST.get());
        basicItem(ModItems.FERROPHOSPHORUS_DUST.get());
        basicItem(ModItems.FERROSILICON_DUST.get());
        basicItem(ModItems.FERROTITANIUM_DUST.get());
        basicItem(ModItems.FERROVANADIUM_DUST.get());
        basicItem(ModItems.HIGHSPEED_STEEL_DUST.get());
        basicItem(ModItems.HSLA_STEEL_DUST.get());
        basicItem(ModItems.INVAR_DUST.get());
        basicItem(ModItems.IRON_HYDRIDE_DUST.get());
        basicItem(ModItems.KANTHAL_DUST.get());
        basicItem(ModItems.KOVAR_DUST.get());
        basicItem(ModItems.MARAGING_STEEL_DUST.get());
        basicItem(ModItems.MUSHET_STEEL_DUST.get());
        basicItem(ModItems.PIG_IRON_DUST.get());
        basicItem(ModItems.REYNOLDS_FTO_DUST.get());
        basicItem(ModItems.SILICON_STEEL_DUST.get());
        basicItem(ModItems.SILVER_STEEL_DUST.get());
        basicItem(ModItems.SPIEGELEISEN_DUST.get());
        basicItem(ModItems.SPRING_STEEL_DUST.get());
        basicItem(ModItems.STAINLESS_STEEL_DUST.get());
        basicItem(ModItems.STABALLOY_DUST.get());
        basicItem(ModItems.STEEL_DUST.get());
        basicItem(ModItems.TOOL_STEEL_DUST.get());
        basicItem(ModItems.WEATHERING_STEEL_DUST.get());
        basicItem(ModItems.WOOTZ_STEEL_DUST.get());
        basicItem(ModItems.WROUGHT_IRON_DUST.get());

        //Lead
        basicItem(ModItems.MOLYBDOCHALKOS_DUST.get());
        basicItem(ModItems.SOLDER_DUST.get());
        basicItem(ModItems.TERNE_DUST.get());
        basicItem(ModItems.TYPE_METAL_DUST.get());

        //Magnesium
        basicItem(ModItems.ELEKTRON_DUST.get());
        basicItem(ModItems.TMGALZN_DUST.get());

        //Manganese
        basicItem(ModItems.MNFZ_DUST.get());
        basicItem(ModItems.MNSZ_DUST.get());

        //Mercury
        basicItem(ModItems.ZINC_AMALGAM_DUST.get());
        basicItem(ModItems.ASHTADHATU_DUST.get());

        //Nickel
        basicItem(ModItems.ALUMEL_DUST.get());
        basicItem(ModItems.BRIGHTRAY_DUST.get());
        basicItem(ModItems.CHROMEL_DUST.get());
        basicItem(ModItems.COIN_SILVER_DUST.get());
        basicItem(ModItems.COPPER_NICKEL_DUST.get());
        basicItem(ModItems.CUPRONICKEL_DUST.get());
        basicItem(ModItems.GERMAN_SILVER_DUST.get());
        basicItem(ModItems.HASTELLOY_DUST.get());
        basicItem(ModItems.HAUSLER_DUST.get());
        basicItem(ModItems.INCONEL_DUST.get());
        basicItem(ModItems.INCONEL_SES_DUST.get());
        basicItem(ModItems.MONEL_METAL_DUST.get());
        basicItem(ModItems.MU_METAL_DUST.get());
        basicItem(ModItems.NICKEL_CARBON_DUST.get());
        basicItem(ModItems.NICKEL_HYDRIDE_DUST.get());
        basicItem(ModItems.NICROSIL_DUST.get());
        basicItem(ModItems.NIMONIC_DUST.get());
        basicItem(ModItems.NISIL_DUST.get());
        basicItem(ModItems.NITINOL_DUST.get());
        basicItem(ModItems.PERMALLOY_DUST.get());
        basicItem(ModItems.SUPERMALLOY_DUST.get());

        //Potassium
        basicItem(ModItems.KLI_DUST.get());
        basicItem(ModItems.NAK_DUST.get());

        //Rhodium
        basicItem(ModItems.PSEUDO_PALLADIUM_DUST.get());

        //Scandium
        basicItem(ModItems.SCANDIUM_HYDRIDE_DUST.get());

        //Silver
        basicItem(ModItems.ARGENTIUM_STERLING_SILVER_DUST.get());
        basicItem(ModItems.BRITANNIA_SILVER_DUST.get());
        basicItem(ModItems.DORE_DUST.get());
        basicItem(ModItems.DYMALLOY_DUST.get());
        basicItem(ModItems.GOLOID_DUST.get());
        basicItem(ModItems.PLATINUM_SILVER_DUST.get());
        basicItem(ModItems.SHIBUICHI_DUST.get());
        basicItem(ModItems.STERLING_SILVER_DUST.get());
        basicItem(ModItems.TIBETAN_SILVER_DUST.get());

        //Tin
        basicItem(ModItems.BABBITT_DUST.get());
        basicItem(ModItems.BRITANNIUM_DUST.get());
        basicItem(ModItems.PEWTER_DUST.get());
        basicItem(ModItems.QUEENS_METAL_DUST.get());

        //Titanium
        basicItem(ModItems.BETA_C_DUST.get());
        basicItem(ModItems.GUM_METAL_DUST.get());
        basicItem(ModItems.SAL_FV_DUST.get());
        basicItem(ModItems.TITANIUM_GOLD_DUST.get());
        basicItem(ModItems.TITANIUM_HYDRIDE_DUST.get());
        basicItem(ModItems.TITANIUM_NITRIDE_DUST.get());

        //Zirconium
        basicItem(ModItems.ZIRCALOY_DUST.get());

        //Nature - Bush
        basicItem(ModItems.GOOSEBERRY_BERRIES.get());

        //Nature - Sapling
        saplingItem(ModBlocks.BLACK_ASH_SAPLING);
        saplingItem(ModBlocks.MAPLE_SYCAMORE_SAPLING);

        //Nature - Crop
        basicItem(ModItems.BHUT_JOLOKIA_CHILLI.get());
        basicItem(ModItems.BIRDS_EYE_CHILLI.get());
        basicItem(ModItems.CAROLINA_REAPER_CHILLI.get());
        basicItem(ModItems.CAYENNE_CHILLI.get());
        basicItem(ModItems.HABANERO_CHILLI.get());
        basicItem(ModItems.JALAPENO_CHILLI.get());
        basicItem(ModItems.NAGA_GHOST_CHILLI.get());
        basicItem(ModItems.PADRON_CHILLI.get());
        basicItem(ModItems.POBLANO_CHILLI.get());
        basicItem(ModItems.SCOTCH_BONNET_CHILLI.get());
        basicItem(ModItems.SILING_LABUYO_CHILLI.get());
        basicItem(ModItems.TABASCO_CHILLI.get());
        basicItem(ModItems.TRINIDAD_SCORPION_CHILLI.get());

        //Nature - Seeds
        basicItem(ModItems.BHUT_JOLOKIA_CHILLI_SEEDS.get());
        basicItem(ModItems.BIRDS_EYE_CHILLI_SEEDS.get());
        basicItem(ModItems.CAROLINA_REAPER_CHILLI_SEEDS.get());
        basicItem(ModItems.CAYENNE_CHILLI_SEEDS.get());
        basicItem(ModItems.HABANERO_CHILLI_SEEDS.get());
        basicItem(ModItems.JALAPENO_CHILLI_SEEDS.get());
        basicItem(ModItems.NAGA_GHOST_CHILLI_SEEDS.get());
        basicItem(ModItems.PADRON_CHILLI_SEEDS.get());
        basicItem(ModItems.POBLANO_CHILLI_SEEDS.get());
        basicItem(ModItems.SCOTCH_BONNET_CHILLI_SEEDS.get());
        basicItem(ModItems.SILING_LABUYO_CHILLI_SEEDS.get());
        basicItem(ModItems.TABASCO_CHILLI_SEEDS.get());
        basicItem(ModItems.TRINIDAD_SCORPION_CHILLI_SEEDS.get());

        //Gastronomy - Meat Carcass
        basicItem(ModItems.BEEF_CARCASS.get());
        basicItem(ModItems.MUTTON_CARCASS.get());
        basicItem(ModItems.PORK_CARCASS.get());
        basicItem(ModItems.HORSE_CARCASS.get());
        basicItem(ModItems.FROG_CARCASS.get());
        basicItem(ModItems.GOAT_CARCASS.get());
        basicItem(ModItems.SQUID_CARCASS.get());
        basicItem(ModItems.TURTLE_CARCASS.get());

        //Beef
        basicItem(ModItems.BEEF_CHUCK.get());
        basicItem(ModItems.BEEF_RIB.get());
        basicItem(ModItems.BEEF_LOIN.get());
        basicItem(ModItems.BEEF_ROUND.get());
        basicItem(ModItems.BEEF_FLANK.get());
        basicItem(ModItems.BEEF_PLATE.get());
        basicItem(ModItems.BEEF_BRISKET.get());
        basicItem(ModItems.BEEF_SHANK.get());

        //Mutton
        basicItem(ModItems.MUTTON_NECK.get());
        basicItem(ModItems.MUTTON_SHOULDER.get());
        basicItem(ModItems.MUTTON_LOIN.get());
        basicItem(ModItems.MUTTON_LEG.get());
        basicItem(ModItems.MUTTON_BREAST.get());
        basicItem(ModItems.MUTTON_SHANK.get());

        //Pork
        basicItem(ModItems.PORK_SHOULDER.get());
        basicItem(ModItems.PORK_LOIN.get());
        basicItem(ModItems.PORK_BELLY.get());
        basicItem(ModItems.PORK_LEG.get());

        //Chicken
        basicItem(ModItems.CHICKEN_LEG.get());
        basicItem(ModItems.CHICKEN_BREAST.get());
        basicItem(ModItems.CHICKEN_WING.get());
        basicItem(ModItems.CHICKEN_THIGH.get());
        basicItem(ModItems.CHICKEN_DRUMSTICK.get());

        //Horse
        basicItem(ModItems.HORSE_SHOULDER.get());
        basicItem(ModItems.HORSE_BREAST.get());
        basicItem(ModItems.HORSE_RIB.get());
        basicItem(ModItems.HORSE_PLATE.get());
        basicItem(ModItems.HORSE_LOIN.get());
        basicItem(ModItems.HORSE_FLANK.get());
        basicItem(ModItems.HORSE_RUMP.get());
        basicItem(ModItems.HORSE_ROUND.get());
        basicItem(ModItems.HORSE_LEG.get());

        //Frog
        basicItem(ModItems.FROG_LEGS.get());

        //Frog
        basicItem(ModItems.GOAT_NECK.get());
        basicItem(ModItems.GOAT_SHOULDER.get());
        basicItem(ModItems.GOAT_BREAST.get());
        basicItem(ModItems.GOAT_RACK.get());
        basicItem(ModItems.GOAT_SHANK.get());
        basicItem(ModItems.GOAT_LOIN.get());
        basicItem(ModItems.GOAT_FLANK.get());
        basicItem(ModItems.GOAT_LEG.get());

        //Squid
        basicItem(ModItems.SQUID_MANTLE.get());
        basicItem(ModItems.SQUID_TENTACLES.get());
        basicItem(ModItems.SQUID_INK.get());

        //Turtle
        basicItem(ModItems.TURTLE_NECK.get());
        basicItem(ModItems.TURTLE_BACK.get());
        basicItem(ModItems.TURTLE_LEG.get());
        basicItem(ModItems.TURTLE_TAIL.get());
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + item.getId().getPath()));
    }
    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = MegalosMod.MOD_ID; // Change this to your mod id

        if (itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace() + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}