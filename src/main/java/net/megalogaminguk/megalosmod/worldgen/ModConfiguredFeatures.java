package net.megalogaminguk.megalosmod.worldgen;



import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;


public class ModConfiguredFeatures {

    //Overworld
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINIUM_ORE_KEY = registerKey("aluminium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CALCIUM_ORE_KEY = registerKey("calcium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CINNABAR_ORE_KEY = registerKey("cinnabar_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGNESIUM_ORE_KEY = registerKey("magnesium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OSMIUM_ORE_KEY = registerKey("osmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILICON_ORE_KEY = registerKey("silicon_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SODIUM_ORE_KEY = registerKey("sodium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZINC_ORE_KEY = registerKey("zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZIRCONIUM_ORE_KEY = registerKey("zirconium_ore");

    //Deepslate
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANTIMONY_ORE_KEY = registerKey("deepslate_antimony_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BISMUTH_ORE_KEY = registerKey("deepslate_bismuth_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CADMIUM_ORE_KEY = registerKey("deepslate_cadmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHROMIUM_ORE_KEY = registerKey("deepslate_chromium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_ORE_KEY = registerKey("deepslate_cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GALLIUM_ORE_KEY = registerKey("deepslate_gallium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRIDIUM_ORE_KEY = registerKey("deepslate_iridium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGANESE_ORE_KEY = registerKey("deepslate_manganese_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOLYBDENUM_ORE_KEY = registerKey("deepslate_molybdenum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALLADIUM_ORE_KEY = registerKey("deepslate_palladium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUTHENIUM_ORE_KEY = registerKey("deepslate_ruthenium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> THALLIUM_ORE_KEY = registerKey("deepslate_thallium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_ORE_KEY = registerKey("deepslate_tungsten_ore");

    //Nether
    public static final ResourceKey<ConfiguredFeature<?, ?>> ARSENIC_ORE_KEY = registerKey("nether_arsenic_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BARIUM_ORE_KEY = registerKey("nether_barium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERYLLIUM_ORE_KEY = registerKey("nether_beryllium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAESIUM_ORE_KEY = registerKey("nether_caesium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GERMANIUM_ORE_KEY = registerKey("nether_germanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HAFNIUM_ORE_KEY = registerKey("nether_hafnium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> INDIUM_ORE_KEY = registerKey("nether_indium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIOBIUM_ORE_KEY = registerKey("nether_niobium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PHOSPHORUS_ORE_KEY = registerKey("nether_phosphorus_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RHENIUM_ORE_KEY = registerKey("nether_rhenium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RHODIUM_ORE_KEY = registerKey("nether_rhodium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SELENIUM_ORE_KEY = registerKey("nether_selenium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TECHNETIUM_ORE_KEY = registerKey("nether_technetium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TELLURIUM_ORE_KEY = registerKey("nether_tellurium_ore");

    //End
    public static final ResourceKey<ConfiguredFeature<?, ?>> LITHIUM_ORE_KEY = registerKey("end_lithium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBIDIUM_ORE_KEY = registerKey("end_rubidium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SCANDIUM_ORE_KEY = registerKey("end_scandium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRONTIUM_ORE_KEY = registerKey("end_strontium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TANTALUM_ORE_KEY = registerKey("end_tantalum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VANADIUM_ORE_KEY = registerKey("end_vanadium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YTTRIUM_ORE_KEY = registerKey("end_yttrium_ore");

    //Nature - Tree
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_ASH_KEY = registerKey("black_ash");

    //Nature - Bush
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOOSEBERRY_BUSH_KEY = registerKey("gooseberry_bush");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        register(context, ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.ALUMINIUM_ORE.get().defaultBlockState(),9));
        register(context, CALCIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.CALCIUM_ORE.get().defaultBlockState(),9));
        register(context, CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.CINNABAR_ORE.get().defaultBlockState(),9));
        register(context, LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.LEAD_ORE.get().defaultBlockState(),9));
        register(context, MAGNESIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.MAGNESIUM_ORE.get().defaultBlockState(),9));

        register(context, NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.NICKEL_ORE.get().defaultBlockState(),9));
        register(context, OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.OSMIUM_ORE.get().defaultBlockState(),9));
        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.PLATINUM_ORE.get().defaultBlockState(),9));
        register(context, SILICON_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.SILICON_ORE.get().defaultBlockState(),9));
        register(context, SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.SILVER_ORE.get().defaultBlockState(),9));

        register(context, SODIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.SODIUM_ORE.get().defaultBlockState(),9));
        register(context, TIN_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.TIN_ORE.get().defaultBlockState(),9));
        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.TITANIUM_ORE.get().defaultBlockState(),9));
        register(context, ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.ZINC_ORE.get().defaultBlockState(),9));
        register(context, ZIRCONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.ZIRCONIUM_ORE.get().defaultBlockState(),9));

        //Deepslate
        register(context, ANTIMONY_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.ANTIMONY_ORE.get().defaultBlockState(),9));
        register(context, BISMUTH_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.BISMUTH_ORE.get().defaultBlockState(),9));
        register(context, CADMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.CADMIUM_ORE.get().defaultBlockState(),9));
        register(context, CHROMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.CHROMIUM_ORE.get().defaultBlockState(),9));
        register(context, COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.COBALT_ORE.get().defaultBlockState(),9));

        register(context, GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.GALLIUM_ORE.get().defaultBlockState(),9));
        register(context, IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.IRIDIUM_ORE.get().defaultBlockState(),9));
        register(context, MANGANESE_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.MANGANESE_ORE.get().defaultBlockState(),9));
        register(context, MOLYBDENUM_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.MOLYBDENUM_ORE.get().defaultBlockState(),9));
        register(context, PALLADIUM_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.PALLADIUM_ORE.get().defaultBlockState(),9));

        register(context, RUTHENIUM_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.RUTHENIUM_ORE.get().defaultBlockState(),9));
        register(context, THALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.THALLIUM_ORE.get().defaultBlockState(),9));
        register(context, TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.TUNGSTEN_ORE.get().defaultBlockState(),9));

        //Nether
        register(context, ARSENIC_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.ARSENIC_ORE.get().defaultBlockState(),9));
        register(context, BARIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.BARIUM_ORE.get().defaultBlockState(),9));
        register(context, BERYLLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.BERYLLIUM_ORE.get().defaultBlockState(),9));
        register(context, CAESIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.CAESIUM_ORE.get().defaultBlockState(),9));
        register(context, GERMANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.GERMANIUM_ORE.get().defaultBlockState(),9));

        register(context, HAFNIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.HAFNIUM_ORE.get().defaultBlockState(),9));
        register(context, INDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.INDIUM_ORE.get().defaultBlockState(),9));
        register(context, NIOBIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.NIOBIUM_ORE.get().defaultBlockState(),9));
        register(context, PHOSPHORUS_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.PHOSPHORUS_ORE.get().defaultBlockState(),9));
        register(context, RHENIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.RHENIUM_ORE.get().defaultBlockState(),9));

        register(context, RHODIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.RHODIUM_ORE.get().defaultBlockState(),9));
        register(context, SELENIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.SELENIUM_ORE.get().defaultBlockState(),9));
        register(context, TECHNETIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.TECHNETIUM_ORE.get().defaultBlockState(),9));
        register(context, TELLURIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.TELLURIUM_ORE.get().defaultBlockState(),9));

        //End
        register(context, LITHIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.LITHIUM_ORE.get().defaultBlockState(), 9));
        register(context, RUBIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.RUBIDIUM_ORE.get().defaultBlockState(),9));
        register(context, SCANDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.SCANDIUM_ORE.get().defaultBlockState(),9));
        register(context, STRONTIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.STRONTIUM_ORE.get().defaultBlockState(),9));
        register(context, TANTALUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.TANTALUM_ORE.get().defaultBlockState(),9));
        register(context, VANADIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.VANADIUM_ORE.get().defaultBlockState(),9));
        register(context, YTTRIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.YTTRIUM_ORE.get().defaultBlockState(),9));

        register(context, BLACK_ASH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.BLACK_ASH_LOG.get()),
                new ForkingTrunkPlacer(4,4,3),

                BlockStateProvider.simple(ModBlocks.BLACK_ASH_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(3), 3),

                        new TwoLayersFeatureSize(1,0,2)).build());

        register(context, GOOSEBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GOOSEBERRY_BUSH.get()
                                .defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))
                        ), List.of(Blocks.GRASS_BLOCK)));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}