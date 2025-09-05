package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.block.custom.nature.bush.GooseberryBushBlock;
import net.megalogaminguk.megalosmod.block.custom.nature.crop.chilli.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MegalosMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Ore
        blockWithItem(ModBlocks.ALUMINIUM_ORE);
        blockWithItem(ModBlocks.ANTIMONY_ORE);
        blockWithItem(ModBlocks.ARSENIC_ORE);
        blockWithItem(ModBlocks.BARIUM_ORE);
        blockWithItem(ModBlocks.BERYLLIUM_ORE);
        blockWithItem(ModBlocks.BISMUTH_ORE);
        blockWithItem(ModBlocks.CADMIUM_ORE);
        blockWithItem(ModBlocks.CAESIUM_ORE);
        blockWithItem(ModBlocks.CALCIUM_ORE);
        blockWithItem(ModBlocks.CHROMIUM_ORE);
        blockWithItem(ModBlocks.CINNABAR_ORE);
        blockWithItem(ModBlocks.COBALT_ORE);
        blockWithItem(ModBlocks.GALLIUM_ORE);
        blockWithItem(ModBlocks.GERMANIUM_ORE);
        blockWithItem(ModBlocks.HAFNIUM_ORE);
        blockWithItem(ModBlocks.INDIUM_ORE);
        blockWithItem(ModBlocks.IRIDIUM_ORE);
        blockWithItem(ModBlocks.LEAD_ORE);
        blockWithItem(ModBlocks.LITHIUM_ORE);
        blockWithItem(ModBlocks.MAGNESIUM_ORE);
        blockWithItem(ModBlocks.MANGANESE_ORE);
        blockWithItem(ModBlocks.MOLYBDENUM_ORE);
        blockWithItem(ModBlocks.NICKEL_ORE);
        blockWithItem(ModBlocks.NIOBIUM_ORE);
        blockWithItem(ModBlocks.OSMIUM_ORE);
        blockWithItem(ModBlocks.PALLADIUM_ORE);
        blockWithItem(ModBlocks.PHOSPHORUS_ORE);
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.POTASSIUM_ORE);
        blockWithItem(ModBlocks.RHENIUM_ORE);
        blockWithItem(ModBlocks.RHODIUM_ORE);
        blockWithItem(ModBlocks.RUBIDIUM_ORE);
        blockWithItem(ModBlocks.RUTHENIUM_ORE);
        blockWithItem(ModBlocks.SCANDIUM_ORE);
        blockWithItem(ModBlocks.SELENIUM_ORE);
        blockWithItem(ModBlocks.SILICON_ORE);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.SODIUM_ORE);
        blockWithItem(ModBlocks.STRONTIUM_ORE);
        blockWithItem(ModBlocks.TANTALUM_ORE);
        blockWithItem(ModBlocks.TECHNETIUM_ORE);
        blockWithItem(ModBlocks.TELLURIUM_ORE);
        blockWithItem(ModBlocks.THALLIUM_ORE);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.TITANIUM_ORE);
        blockWithItem(ModBlocks.TUNGSTEN_ORE);
        blockWithItem(ModBlocks.VANADIUM_ORE);
        blockWithItem(ModBlocks.YTTRIUM_ORE);
        blockWithItem(ModBlocks.ZINC_ORE);
        blockWithItem(ModBlocks.ZIRCONIUM_ORE);

        //Blocks
        blockWithItem(ModBlocks.ALUMINIUM_BLOCK);
        blockWithItem(ModBlocks.ANTIMONY_BLOCK);
        blockWithItem(ModBlocks.ARSENIC_BLOCK);
        blockWithItem(ModBlocks.BARIUM_BLOCK);
        blockWithItem(ModBlocks.BERYLLIUM_BLOCK);
        blockWithItem(ModBlocks.BISMUTH_BLOCK);
        blockWithItem(ModBlocks.CADMIUM_BLOCK);
        blockWithItem(ModBlocks.CAESIUM_BLOCK);
        blockWithItem(ModBlocks.CALCIUM_BLOCK);
        blockWithItem(ModBlocks.CHROMIUM_BLOCK);
        blockWithItem(ModBlocks.CINNABAR_BLOCK);
        blockWithItem(ModBlocks.COBALT_BLOCK);
        blockWithItem(ModBlocks.GALLIUM_BLOCK);
        blockWithItem(ModBlocks.GERMANIUM_BLOCK);
        blockWithItem(ModBlocks.HAFNIUM_BLOCK);
        blockWithItem(ModBlocks.INDIUM_BLOCK);
        blockWithItem(ModBlocks.IRIDIUM_BLOCK);
        blockWithItem(ModBlocks.LEAD_BLOCK);
        blockWithItem(ModBlocks.LITHIUM_BLOCK);
        blockWithItem(ModBlocks.MAGNESIUM_BLOCK);
        blockWithItem(ModBlocks.MANGANESE_BLOCK);
        blockWithItem(ModBlocks.MOLYBDENUM_BLOCK);
        blockWithItem(ModBlocks.NICKEL_BLOCK);
        blockWithItem(ModBlocks.NIOBIUM_BLOCK);
        blockWithItem(ModBlocks.OSMIUM_BLOCK);
        blockWithItem(ModBlocks.PALLADIUM_BLOCK);
        blockWithItem(ModBlocks.PHOSPHORUS_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_BLOCK);
        blockWithItem(ModBlocks.POTASSIUM_BLOCK);
        blockWithItem(ModBlocks.RHENIUM_BLOCK);
        blockWithItem(ModBlocks.RHODIUM_BLOCK);
        blockWithItem(ModBlocks.RUBIDIUM_BLOCK);
        blockWithItem(ModBlocks.RUTHENIUM_BLOCK);
        blockWithItem(ModBlocks.SCANDIUM_BLOCK);
        blockWithItem(ModBlocks.SELENIUM_BLOCK);
        blockWithItem(ModBlocks.SILICON_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.SODIUM_BLOCK);
        blockWithItem(ModBlocks.STRONTIUM_BLOCK);
        blockWithItem(ModBlocks.TANTALUM_BLOCK);
        blockWithItem(ModBlocks.TECHNETIUM_BLOCK);
        blockWithItem(ModBlocks.TELLURIUM_BLOCK);
        blockWithItem(ModBlocks.THALLIUM_BLOCK);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        blockWithItem(ModBlocks.TUNGSTEN_BLOCK);
        blockWithItem(ModBlocks.VANADIUM_BLOCK);
        blockWithItem(ModBlocks.YTTRIUM_BLOCK);
        blockWithItem(ModBlocks.ZINC_BLOCK);
        blockWithItem(ModBlocks.ZIRCONIUM_BLOCK);

        //Raw Blocks
        blockWithItem(ModBlocks.RAW_ALUMINIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_ANTIMONY_BLOCK);
        blockWithItem(ModBlocks.RAW_ARSENIC_BLOCK);
        blockWithItem(ModBlocks.RAW_BARIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_BERYLLIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_BISMUTH_BLOCK);
        blockWithItem(ModBlocks.RAW_CADMIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_CAESIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_CALCIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_CHROMIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_CINNABAR_BLOCK);
        blockWithItem(ModBlocks.RAW_COBALT_BLOCK);
        blockWithItem(ModBlocks.RAW_GALLIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_GERMANIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_HAFNIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_INDIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_IRIDIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_LEAD_BLOCK);
        blockWithItem(ModBlocks.RAW_LITHIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_MAGNESIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_MANGANESE_BLOCK);
        blockWithItem(ModBlocks.RAW_MOLYBDENUM_BLOCK);
        blockWithItem(ModBlocks.RAW_NICKEL_BLOCK);
        blockWithItem(ModBlocks.RAW_NIOBIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_OSMIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PALLADIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PHOSPHORUS_BLOCK);
        blockWithItem(ModBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(ModBlocks.RAW_POTASSIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_RHENIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_RHODIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_RUBIDIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_RUTHENIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_SCANDIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_SELENIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_SILICON_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.RAW_SODIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_STRONTIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_TANTALUM_BLOCK);
        blockWithItem(ModBlocks.RAW_TECHNETIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_TELLURIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_THALLIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_TITANIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_TUNGSTEN_BLOCK);
        blockWithItem(ModBlocks.RAW_VANADIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_YTTRIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_ZINC_BLOCK);
        blockWithItem(ModBlocks.RAW_ZIRCONIUM_BLOCK);

        //Alloys - Aluminium
        blockWithItem(ModBlocks.AA_BLOCK);
        blockWithItem(ModBlocks.AL_LI_BLOCK);
        blockWithItem(ModBlocks.ALNICO_BLOCK);
        blockWithItem(ModBlocks.ALUMINIUM_SCANDIUM_BLOCK);
        blockWithItem(ModBlocks.BIRMABRIGHT_BLOCK);
        blockWithItem(ModBlocks.DEVARDA_BLOCK);
        blockWithItem(ModBlocks.DURALUMIN_BLOCK);
        blockWithItem(ModBlocks.HIDUMINIUM_BLOCK);
        blockWithItem(ModBlocks.HYDRONALIUM_BLOCK);
        blockWithItem(ModBlocks.ITALMA_BLOCK);
        blockWithItem(ModBlocks.MAGNALIUM_BLOCK);
        blockWithItem(ModBlocks.MAGNOX_BLOCK);
        blockWithItem(ModBlocks.NAMBE_BLOCK);
        blockWithItem(ModBlocks.NITIAL_BLOCK);
        blockWithItem(ModBlocks.SILUMIN_BLOCK);
        blockWithItem(ModBlocks.Y_ALLOY_BLOCK);
        blockWithItem(ModBlocks.ZAMAK_BLOCK);

        //Beryllium
        blockWithItem(ModBlocks.LOCKALLOY_BLOCK);

        //Bismuth
        blockWithItem(ModBlocks.BISMANOL_BLOCK);
        blockWithItem(ModBlocks.CERROBEND_BLOCK);
        blockWithItem(ModBlocks.CERROSAFE_BLOCK);
        blockWithItem(ModBlocks.FIELDS_METAL_BLOCK);
        blockWithItem(ModBlocks.ROSE_METAL_BLOCK);
        blockWithItem(ModBlocks.WOODS_METAL_BLOCK);

        //Chromium
        blockWithItem(ModBlocks.CHROMIUM_HYDRIDE_BLOCK);
        blockWithItem(ModBlocks.CRNISZWTI_BLOCK);
        blockWithItem(ModBlocks.NICHROME_BLOCK);

        //Cobalt
        blockWithItem(ModBlocks.ELGILOY_BLOCK);
        blockWithItem(ModBlocks.MEGALLIUM_BLOCK);
        blockWithItem(ModBlocks.STELLITE_BLOCK);
        blockWithItem(ModBlocks.TALONITE_BLOCK);
        blockWithItem(ModBlocks.ULTIMET_BLOCK);
        blockWithItem(ModBlocks.VITALLIUM_BLOCK);

        //Copper
        blockWithItem(ModBlocks.ALUMINIUM_BRONZE_BLOCK);
        blockWithItem(ModBlocks.ARSENICAL_COPPER_BLOCK);
        blockWithItem(ModBlocks.ARSENICAL_BRONZE_BLOCK);
        blockWithItem(ModBlocks.BELL_METAL_BLOCK);
        blockWithItem(ModBlocks.BERYLLIUM_COPPER_BLOCK);
        blockWithItem(ModBlocks.BILLON_BLOCK);
        blockWithItem(ModBlocks.BRASS_BLOCK);
        blockWithItem(ModBlocks.BRONZE_BLOCK);
        blockWithItem(ModBlocks.CALAMINE_BRASS_BLOCK);
        blockWithItem(ModBlocks.CHINESE_SILVER_BLOCK);
        blockWithItem(ModBlocks.CONSTANTAN_BLOCK);
        blockWithItem(ModBlocks.COPPER_HYDRIDE_BLOCK);
        blockWithItem(ModBlocks.COPPER_TUNGSTEN_BLOCK);
        blockWithItem(ModBlocks.CORINTHIAN_BRONZE_BLOCK);
        blockWithItem(ModBlocks.CUNIFE_BLOCK);
        blockWithItem(ModBlocks.CUAG_BLOCK);
        blockWithItem(ModBlocks.CYMBAL_ALLOY_BLOCK);
        blockWithItem(ModBlocks.DUTCH_METAL_BLOCK);
        blockWithItem(ModBlocks.FLORENTINE_BRONZE_BLOCK);
        blockWithItem(ModBlocks.GILDING_METAL_BLOCK);
        blockWithItem(ModBlocks.GLUCYDUR_BLOCK);
        blockWithItem(ModBlocks.GUANIN_BLOCK);
        blockWithItem(ModBlocks.GUN_METAL_BLOCK);
        blockWithItem(ModBlocks.HEPATIZON_BLOCK);
        blockWithItem(ModBlocks.MANGANIN_BLOCK);
        blockWithItem(ModBlocks.MELCHIOR_BLOCK);
        blockWithItem(ModBlocks.MUNTZ_METAL_BLOCK);
        blockWithItem(ModBlocks.NICKEL_SILVER_BLOCK);
        blockWithItem(ModBlocks.NORDIC_GOLD_BLOCK);
        blockWithItem(ModBlocks.ORMOLU_BLOCK);
        blockWithItem(ModBlocks.PHOSPHOR_BRONZE_BLOCK);
        blockWithItem(ModBlocks.PINCHBECK_BLOCK);
        blockWithItem(ModBlocks.PRINCES_METAL_BLOCK);
        blockWithItem(ModBlocks.SHAKUDO_BLOCK);
        blockWithItem(ModBlocks.SILICON_BRONZE_BLOCK);
        blockWithItem(ModBlocks.SPECULUM_METAL_BLOCK);
        blockWithItem(ModBlocks.TOMBAC_BLOCK);
        blockWithItem(ModBlocks.TUMBAGA_BLOCK);
        blockWithItem(ModBlocks.WHITE_BRONZE_BLOCK);

        //Gallium
        blockWithItem(ModBlocks.AL_GA_BLOCK);
        blockWithItem(ModBlocks.GALFENOL_BLOCK);
        blockWithItem(ModBlocks.GALINSTAN_BLOCK);

        //Gold
        blockWithItem(ModBlocks.COLORED_GOLD_BLOCK);
        blockWithItem(ModBlocks.CROWN_GOLD_BLOCK);
        blockWithItem(ModBlocks.ELECTRUM_BLOCK);
        blockWithItem(ModBlocks.RHODITE_BLOCK);
        blockWithItem(ModBlocks.ROSE_GOLD_BLOCK);
        blockWithItem(ModBlocks.WHITE_GOLD_BLOCK);

        //Iron
        blockWithItem(ModBlocks.ANTHRACITE_IRON_BLOCK);
        blockWithItem(ModBlocks.BULAT_STEEL_BLOCK);
        blockWithItem(ModBlocks.CAST_IRON_BLOCK);
        blockWithItem(ModBlocks.CHROMOLY_BLOCK);
        blockWithItem(ModBlocks.CRUCIBLE_STEEL_BLOCK);
        blockWithItem(ModBlocks.DAMASCUS_STEEL_BLOCK);
        blockWithItem(ModBlocks.DUCOL_BLOCK);
        blockWithItem(ModBlocks.ELINVAR_BLOCK);
        blockWithItem(ModBlocks.FERNICO_BLOCK);
        blockWithItem(ModBlocks.FERROCHROMIUM_BLOCK);
        blockWithItem(ModBlocks.FERROMAGNESIUM_BLOCK);
        blockWithItem(ModBlocks.FERROMANGANESE_BLOCK);
        blockWithItem(ModBlocks.FERROMOLYBDENUM_BLOCK);
        blockWithItem(ModBlocks.FERRONICKEL_BLOCK);
        blockWithItem(ModBlocks.FERROPHOSPHORUS_BLOCK);
        blockWithItem(ModBlocks.FERROSILICON_BLOCK);
        blockWithItem(ModBlocks.FERROTITANIUM_BLOCK);
        blockWithItem(ModBlocks.FERROVANADIUM_BLOCK);
        blockWithItem(ModBlocks.HIGHSPEED_STEEL_BLOCK);
        blockWithItem(ModBlocks.HSLA_STEEL_BLOCK);
        blockWithItem(ModBlocks.INVAR_BLOCK);
        blockWithItem(ModBlocks.IRON_HYDRIDE_BLOCK);
        blockWithItem(ModBlocks.KANTHAL_BLOCK);
        blockWithItem(ModBlocks.KOVAR_BLOCK);
        blockWithItem(ModBlocks.MARAGING_STEEL_BLOCK);
        blockWithItem(ModBlocks.MUSHET_STEEL_BLOCK);
        blockWithItem(ModBlocks.PIG_IRON_BLOCK);
        blockWithItem(ModBlocks.REYNOLDS_FTO_BLOCK);
        blockWithItem(ModBlocks.SILICON_STEEL_BLOCK);
        blockWithItem(ModBlocks.SILVER_STEEL_BLOCK);
        blockWithItem(ModBlocks.SPIEGELEISEN_BLOCK);
        blockWithItem(ModBlocks.SPRING_STEEL_BLOCK);
        blockWithItem(ModBlocks.STAINLESS_STEEL_BLOCK);
        blockWithItem(ModBlocks.STABALLOY_BLOCK);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.TOOL_STEEL_BLOCK);
        blockWithItem(ModBlocks.WEATHERING_STEEL_BLOCK);
        blockWithItem(ModBlocks.WOOTZ_STEEL_BLOCK);
        blockWithItem(ModBlocks.WROUGHT_IRON_BLOCK);

        //Lead
        blockWithItem(ModBlocks.MOLYBDOCHALKOS_BLOCK);
        blockWithItem(ModBlocks.SOLDER_BLOCK);
        blockWithItem(ModBlocks.TERNE_BLOCK);
        blockWithItem(ModBlocks.TYPE_METAL_BLOCK);

        //Magnesium
        blockWithItem(ModBlocks.ELEKTRON_BLOCK);
        blockWithItem(ModBlocks.TMGALZN_BLOCK);

        //Manganese
        blockWithItem(ModBlocks.MNFZ_BLOCK);
        blockWithItem(ModBlocks.MNSZ_BLOCK);

        //Mercury
        blockWithItem(ModBlocks.ZINC_AMALGAM_BLOCK);
        blockWithItem(ModBlocks.ASHTADHATU_BLOCK);

        //Nickel
        blockWithItem(ModBlocks.ALUMEL_BLOCK);
        blockWithItem(ModBlocks.BRIGHTRAY_BLOCK);
        blockWithItem(ModBlocks.CHROMEL_BLOCK);
        blockWithItem(ModBlocks.COIN_SILVER_BLOCK);
        blockWithItem(ModBlocks.COPPER_NICKEL_BLOCK);
        blockWithItem(ModBlocks.CUPRONICKEL_BLOCK);
        blockWithItem(ModBlocks.GERMAN_SILVER_BLOCK);
        blockWithItem(ModBlocks.HASTELLOY_BLOCK);
        blockWithItem(ModBlocks.HAUSLER_BLOCK);
        blockWithItem(ModBlocks.INCONEL_BLOCK);
        blockWithItem(ModBlocks.INCONEL_SES_BLOCK);
        blockWithItem(ModBlocks.MONEL_METAL_BLOCK);
        blockWithItem(ModBlocks.MU_METAL_BLOCK);
        blockWithItem(ModBlocks.NICKEL_CARBON_BLOCK);
        blockWithItem(ModBlocks.NICKEL_HYDRIDE_BLOCK);
        blockWithItem(ModBlocks.NICROSIL_BLOCK);
        blockWithItem(ModBlocks.NIMONIC_BLOCK);
        blockWithItem(ModBlocks.NISIL_BLOCK);
        blockWithItem(ModBlocks.NITINOL_BLOCK);
        blockWithItem(ModBlocks.PERMALLOY_BLOCK);
        blockWithItem(ModBlocks.SUPERMALLOY_BLOCK);

        //Potassium
        blockWithItem(ModBlocks.KLI_BLOCK);
        blockWithItem(ModBlocks.NAK_BLOCK);

        //Rhodium
        blockWithItem(ModBlocks.PSEUDO_PALLADIUM_BLOCK);

        //Scandium
        blockWithItem(ModBlocks.SCANDIUM_HYDRIDE_BLOCK);

        //Silver
        blockWithItem(ModBlocks.ARGENTIUM_STERLING_SILVER_BLOCK);
        blockWithItem(ModBlocks.BRITANNIA_SILVER_BLOCK);
        blockWithItem(ModBlocks.DORE_BLOCK);
        blockWithItem(ModBlocks.DYMALLOY_BLOCK);
        blockWithItem(ModBlocks.GOLOID_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_SILVER_BLOCK);
        blockWithItem(ModBlocks.SHIBUICHI_BLOCK);
        blockWithItem(ModBlocks.STERLING_SILVER_BLOCK);
        blockWithItem(ModBlocks.TIBETAN_SILVER_BLOCK);

        //Tin
        blockWithItem(ModBlocks.BABBITT_BLOCK);
        blockWithItem(ModBlocks.BRITANNIUM_BLOCK);
        blockWithItem(ModBlocks.PEWTER_BLOCK);
        blockWithItem(ModBlocks.QUEENS_METAL_BLOCK);

        //Titanium
        blockWithItem(ModBlocks.BETA_C_BLOCK);
        blockWithItem(ModBlocks.GUM_METAL_BLOCK);
        blockWithItem(ModBlocks.SAL_FV_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_GOLD_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_HYDRIDE_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_NITRIDE_BLOCK);

        //Zirconium
        blockWithItem(ModBlocks.ZIRCALOY_BLOCK);

        //Technology
        blockWithItem(ModBlocks.METALURGIC_FURNACE);

        //Tree - Black Ash
        blockItem(ModBlocks.BLACK_ASH_LOG);
        blockItem(ModBlocks.BLACK_ASH_WOOD);
        blockItem(ModBlocks.STRIPPED_BLACK_ASH_LOG);
        blockItem(ModBlocks.STRIPPED_BLACK_ASH_WOOD);

        blockWithItem(ModBlocks.BLACK_ASH_PLANKS);

        leavesBlock(ModBlocks.BLACK_ASH_LEAVES);
        saplingBlock(ModBlocks.BLACK_ASH_SAPLING);

        logBlock(((RotatedPillarBlock) ModBlocks.BLACK_ASH_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BLACK_ASH_WOOD.get()), blockTexture(ModBlocks.BLACK_ASH_LOG.get()), blockTexture(ModBlocks.BLACK_ASH_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BLACK_ASH_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_BLACK_ASH_WOOD.get()), blockTexture(ModBlocks.STRIPPED_BLACK_ASH_LOG.get()), blockTexture(ModBlocks.STRIPPED_BLACK_ASH_LOG.get()));

        blockItem(ModBlocks.MAPLE_SVCAMORE_LOG);
        blockItem(ModBlocks.MAPLE_SYCAMORE_WOOD);
        blockItem(ModBlocks.STRIPPED_MAPLE_SYCAMORE_LOG);
        blockItem(ModBlocks.STRIPPED_MAPLE_SYCAMORE_WOOD);

        blockWithItem(ModBlocks.MAPLE_SYCAMORE_PLANKS);

        leavesBlock(ModBlocks.MAPLE_SYCAMORE_LEAVES);
        saplingBlock(ModBlocks.MAPLE_SYCAMORE_SAPLING);

        logBlock(((RotatedPillarBlock) ModBlocks.MAPLE_SVCAMORE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MAPLE_SYCAMORE_WOOD.get()), blockTexture(ModBlocks.MAPLE_SVCAMORE_LOG.get()), blockTexture(ModBlocks.MAPLE_SVCAMORE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAPLE_SYCAMORE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MAPLE_SYCAMORE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_MAPLE_SYCAMORE_LOG.get()), blockTexture(ModBlocks.STRIPPED_MAPLE_SYCAMORE_LOG.get()));

        makeBush(((SweetBerryBushBlock) ModBlocks.GOOSEBERRY_BUSH.get()), "gooseberry_berry_bush_stage", "gooseberry_berry_bush_stage");

        makeBhutCrop(((CropBlock) ModBlocks.BHUT_JOLOKIA_CHILLI_CROP.get()), "chilli_bhut_jolokia_crop_stage", "chilli_bhut_jolokia_crop_stage");
        makeBirdsCrop(((CropBlock) ModBlocks.BIRDS_EYE_CHILLI_CROP.get()), "chilli_birds_eye_crop_stage", "chilli_birds_eye_crop_stage");
        makeCarolinaCrop(((CropBlock) ModBlocks.CAROLINA_REAPER_CHILLI_CROP.get()), "chilli_carolina_reaper_crop_stage", "chilli_carolina_reaper_crop_stage");
        makeCayenneCrop(((CropBlock) ModBlocks.CAYENNE_CHILLI_CROP.get()), "chilli_cayenne_crop_stage", "chilli_cayenne_crop_stage");
        makeHabaneroCrop(((CropBlock) ModBlocks.HABANERO_CHILLI_CROP.get()), "chilli_habanero_crop_stage", "chilli_habanero_crop_stage");
        makeJalapenoCrop(((CropBlock) ModBlocks.JALAPENO_CHILLI_CROP.get()), "chilli_jalapeno_crop_stage", "chilli_jalapeno_crop_stage");
        makeNagaGhostCrop(((CropBlock) ModBlocks.NAGA_GHOST_CHILLI_CROP.get()), "chilli_naga_ghost_crop_stage", "chilli_bhut_jolokia_crop_stage");
        makePadronCrop(((CropBlock) ModBlocks.PADRON_CHILLI_CROP.get()), "chilli_padron_crop_stage", "chilli_padron_crop_stage");
        makePoblanoCrop(((CropBlock) ModBlocks.POBLANO_CHILLI_CROP.get()), "chilli_poblano_crop_stage", "chilli_poblano_crop_stage");
        makeScotchCrop(((CropBlock) ModBlocks.SCOTCH_BONNET_CHILLI_CROP.get()), "chilli_scotch_bonnet_crop_stage", "chilli_scotch_bonnet_crop_stage");
        makeSilingCrop(((CropBlock) ModBlocks.SILING_LABUYO_CHILLI_CROP.get()), "chilli_siling_labuyo_crop_stage", "chilli_siling_labuyo_crop_stage");
        makeTabascoCrop(((CropBlock) ModBlocks.TABASCO_CHILLI_CROP.get()), "chilli_tabasco_crop_stage", "chilli_tabasco_crop_stage");
        makeTrinidadCrop(((CropBlock) ModBlocks.TRINIDAD_SCORPION_CHILLI_CROP.get()), "chilli_trinidad_scorpion_crop_stage", "chilli_trinidad_scorpion_crop_stage");
    }

    //Bush
    public void makeBush(SweetBerryBushBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(GooseberryBushBlock.AGE),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(GooseberryBushBlock.AGE))).renderType("cutout"));

        return models;
    }

    //Bhut Jolokia Crop
    public void makeBhutCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> bhutStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] bhutStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((BhutJolokiaChilliCropBlock) block).getAgeProperty()),
        ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((BhutJolokiaChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Bird's Eye Crop
    public void makeBirdsCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> birdsStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] birdsStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((BirdsEyeChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((BirdsEyeChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Carolina Reaper Crop
    public void makeCarolinaCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> carolinaStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] carolinaStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CarolinaReaperChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((CarolinaReaperChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Cayenne Crop
    public void makeCayenneCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cayenneStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cayenneStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CayenneChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((CayenneChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Habanero Crop
    public void makeHabaneroCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> habaneroStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] habaneroStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((HabaneroChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((HabaneroChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Jalapeno Crop
    public void makeJalapenoCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> jalapenoStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] jalapenoStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((JalapenoChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((JalapenoChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Naga Ghost Crop
    public void makeNagaGhostCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> nagaGhostStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] nagaGhostStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((NagaGhostChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((NagaGhostChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Padron Crop
    public void makePadronCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> padronStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] padronStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((PadronChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((PadronChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Poblano Crop
    public void makePoblanoCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> poblanoStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] poblanoStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((PoblanoChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((PoblanoChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Scotch Bonnet Crop
    public void makeScotchCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> scotchStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] scotchStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((ScotchBonnetChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((ScotchBonnetChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Siling Labuyo Crop
    public void makeSilingCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> silingStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] silingStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((SilingLabuyoChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((SilingLabuyoChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Tabasco Crop
    public void makeTabascoCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> tabascoStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] tabascoStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((TabascoChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((TabascoChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //Trinidad Crop
    public void makeTrinidadCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> trinidadStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] trinidadStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((TrinidadScorpionChilliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((TrinidadScorpionChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(), models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(),
                blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("megalosmod:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("megalosmod:block/" + deferredBlock.getId().getPath() + appendix));
    }
}