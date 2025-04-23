package net.megalogaminguk.megalosmod.worldgen;



import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;


public class ModConfiguredFeatures {

    //Overworld
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINIUM_ORE_KEY = registerKey("aluminium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CALCIUM_ORE_KEY = registerKey("calcium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CINNABAR_ORE_KEY = registerKey("cinnabar_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MAGNESIUM_ORE_KEY = registerKey("magnesium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OSMIUM_ORE_KEY = registerKey("osmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILICON_ORE_KEY = registerKey("silicon_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SODIUM_ORE_KEY = registerKey("sodium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TITANIUM_ORE_KEY = registerKey("titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZINC_ORE_KEY = registerKey("zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZIRCONIUM_ORE_KEY = registerKey("zirconium_ore");

    //Deepslate
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_ANTIMONY_ORE_KEY = registerKey("deepslate_antimony_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_BISMUTH_ORE_KEY = registerKey("deepslate_bismuth_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_CADMIUM_ORE_KEY = registerKey("deepslate_cadmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_CHROMIUM_ORE_KEY = registerKey("deepslate_chromium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_COBALT_ORE_KEY = registerKey("deepslate_cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_GALLIUM_ORE_KEY = registerKey("deepslate_gallium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_IRIDIUM_ORE_KEY = registerKey("deepslate_iridium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_MANGANESE_ORE_KEY = registerKey("deepslate_manganese_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_MOLYBDENUM_ORE_KEY = registerKey("deepslate_molybdenum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_PALLADIUM_ORE_KEY = registerKey("deepslate_palladium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_RUTHENIUM_ORE_KEY = registerKey("deepslate_ruthenium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_THALLIUM_ORE_KEY = registerKey("deepslate_thallium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_TUNGSTEN_ORE_KEY = registerKey("deepslate_tungsten_ore");

    //Nether
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ARSENIC_ORE_KEY = registerKey("nether_arsenic_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_BARIUM_ORE_KEY = registerKey("nether_barium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_BERYLLIUM_ORE_KEY = registerKey("nether_beryllium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CAESIUM_ORE_KEY = registerKey("nether_caesium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GERMANIUM_ORE_KEY = registerKey("nether_germanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_HAFNIUM_ORE_KEY = registerKey("nether_hafnium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_INDIUM_ORE_KEY = registerKey("nether_indium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_NIOBIUM_ORE_KEY = registerKey("nether_niobium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PHOSPHORUS_ORE_KEY = registerKey("nether_phosphorus_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RHENIUM_ORE_KEY = registerKey("nether_rhenium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RHODIUM_ORE_KEY = registerKey("nether_rhodium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SELENIUM_ORE_KEY = registerKey("nether_selenium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TECHNETIUM_ORE_KEY = registerKey("nether_technetium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TELLURIUM_ORE_KEY = registerKey("nether_tellurium_ore");

    //End
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LITHIUM_ORE_KEY = registerKey("end_lithium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBIDIUM_ORE_KEY = registerKey("end_rubidium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SCANDIUM_ORE_KEY = registerKey("end_scandium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_STRONTIUM_ORE_KEY = registerKey("end_strontium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_TANTALUM_ORE_KEY = registerKey("end_tantalum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_VANADIUM_ORE_KEY = registerKey("end_vanadium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_YTTRIUM_ORE_KEY = registerKey("end_yttrium_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        register(context, OVERWORLD_ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.ALUMINIUM_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_CALCIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.CALCIUM_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.CINNABAR_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.LEAD_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_MAGNESIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.MAGNESIUM_ORE.get().defaultBlockState(),9));

        register(context, OVERWORLD_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.NICKEL_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.OSMIUM_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.PLATINUM_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_SILICON_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.SILICON_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.SILVER_ORE.get().defaultBlockState(),9));

        register(context, OVERWORLD_SODIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.SODIUM_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.TIN_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.TITANIUM_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.ZINC_ORE.get().defaultBlockState(),9));
        register(context, OVERWORLD_ZIRCONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.ZIRCONIUM_ORE.get().defaultBlockState(),9));

        //Deepslate
        register(context, DEEPSLATE_ANTIMONY_ORE_KEY, Feature.ORE, new OreConfiguration(deepslateReplaceables, ModBlocks.ANTIMONY_ORE.get().defaultBlockState(),9));
        register(context, DEEPSLATE_BISMUTH_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.BISMUTH_ORE.get().defaultBlockState(),9));
        register(context, DEEPSLATE_CADMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.CADMIUM_ORE.get().defaultBlockState(),9));
        register(context, DEEPSLATE_CHROMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.CHROMIUM_ORE.get().defaultBlockState(),9));
        register(context, DEEPSLATE_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.COBALT_ORE.get().defaultBlockState(),9));

        register(context, DEEPSLATE_GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.GALLIUM_ORE.get().defaultBlockState(),9));
        register(context, DEEPSLATE_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.IRIDIUM_ORE.get().defaultBlockState(),9));
        register(context, DEEPSLATE_MANGANESE_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.MANGANESE_ORE.get().defaultBlockState(),9));
        register(context, DEEPSLATE_MOLYBDENUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.MOLYBDENUM_ORE.get().defaultBlockState(),9));
        register(context, DEEPSLATE_PALLADIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.PALLADIUM_ORE.get().defaultBlockState(),9));

        register(context, DEEPSLATE_RUTHENIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.RUTHENIUM_ORE.get().defaultBlockState(),9));
        register(context, DEEPSLATE_THALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.THALLIUM_ORE.get().defaultBlockState(),9));
        register(context, DEEPSLATE_TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.TUNGSTEN_ORE.get().defaultBlockState(),9));

        //Nether
        register(context, NETHER_ARSENIC_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.ARSENIC_ORE.get().defaultBlockState(),9));
        register(context, NETHER_BARIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.BARIUM_ORE.get().defaultBlockState(),9));
        register(context, NETHER_BERYLLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.BERYLLIUM_ORE.get().defaultBlockState(),9));
        register(context, NETHER_CAESIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.CAESIUM_ORE.get().defaultBlockState(),9));
        register(context, NETHER_GERMANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.GERMANIUM_ORE.get().defaultBlockState(),9));

        register(context, NETHER_HAFNIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.HAFNIUM_ORE.get().defaultBlockState(),9));
        register(context, NETHER_INDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.INDIUM_ORE.get().defaultBlockState(),9));
        register(context, NETHER_NIOBIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.NIOBIUM_ORE.get().defaultBlockState(),9));
        register(context, NETHER_PHOSPHORUS_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.PHOSPHORUS_ORE.get().defaultBlockState(),9));
        register(context, NETHER_RHENIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.RHENIUM_ORE.get().defaultBlockState(),9));

        register(context, NETHER_RHODIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.RHODIUM_ORE.get().defaultBlockState(),9));
        register(context, NETHER_SELENIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.SELENIUM_ORE.get().defaultBlockState(),9));
        register(context, NETHER_TECHNETIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.TECHNETIUM_ORE.get().defaultBlockState(),9));
        register(context, NETHER_TELLURIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.TELLURIUM_ORE.get().defaultBlockState(),9));

        //End
        register(context, END_LITHIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.LITHIUM_ORE.get().defaultBlockState(), 9));
        register(context, END_RUBIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.RUBIDIUM_ORE.get().defaultBlockState(),9));
        register(context, END_SCANDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.SCANDIUM_ORE.get().defaultBlockState(),9));
        register(context, END_STRONTIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.STRONTIUM_ORE.get().defaultBlockState(),9));
        register(context, END_TANTALUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.TANTALUM_ORE.get().defaultBlockState(),9));
        register(context, END_VANADIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.VANADIUM_ORE.get().defaultBlockState(),9));
        register(context, END_YTTRIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.YTTRIUM_ORE.get().defaultBlockState(),9));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}