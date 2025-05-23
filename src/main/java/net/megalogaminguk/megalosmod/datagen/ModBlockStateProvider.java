package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.block.custom.nature.bush.GooseberryBushBlock;
import net.megalogaminguk.megalosmod.block.custom.nature.crop.chilli.BhutJolokiaChilliCropBlock;
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

        makeCrop(((CropBlock) ModBlocks.BHUT_JOLOKIA_CHILLI_CROP.get()), "chilli_bhut_jolokia_crop_stage", "chilli_bhut_jolokia_crop_stage");
        makeBush(((SweetBerryBushBlock) ModBlocks.GOOSEBERRY_BUSH.get()), "gooseberry_berry_bush_stage", "gooseberry_berry_bush_stage");
    }

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

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];

        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((BhutJolokiaChilliCropBlock) block).getAgeProperty()),
        ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + textureName + state.getValue(((BhutJolokiaChilliCropBlock) block).getAgeProperty()))).renderType("cutout"));
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