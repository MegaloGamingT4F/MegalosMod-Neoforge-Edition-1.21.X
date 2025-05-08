package net.megalogaminguk.megalosmod.worldgen;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ALUMINIUM_ORE_PLACED_KEY = registerKey("aluminium_ore_placed");
    public static final ResourceKey<PlacedFeature> CALCIUM_ORE_PLACED_KEY = registerKey("calcium_ore_placed");
    public static final ResourceKey<PlacedFeature> CINNABAR_ORE_PLACED_KEY = registerKey("cinnabar_ore_placed");
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final ResourceKey<PlacedFeature> MAGNESIUM_ORE_PLACED_KEY = registerKey("magnesium_ore_placed");
    public static final ResourceKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
    public static final ResourceKey<PlacedFeature> OSMIUM_ORE_PLACED_KEY = registerKey("osmium_ore_placed");
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> SILICON_ORE_PLACED_KEY = registerKey("silicon_ore_placed");
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> SODIUM_ORE_PLACED_KEY = registerKey("sodium_ore_placed");
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
    public static final ResourceKey<PlacedFeature> ZINC_ORE_PLACED_KEY = registerKey("zinc_ore_placed");
    public static final ResourceKey<PlacedFeature> ZIRCONIUM_ORE_PLACED_KEY = registerKey("zirconium_ore_placed");

    //Deepslate
    public static final ResourceKey<PlacedFeature> ANTIMONY_ORE_PLACED_KEY = registerKey("antimony_ore_placed");
    public static final ResourceKey<PlacedFeature> BISMUTH_ORE_PLACED_KEY = registerKey("bismuth_ore_placed");
    public static final ResourceKey<PlacedFeature> CADMIUM_ORE_PLACED_KEY = registerKey("cadmium_ore_placed");
    public static final ResourceKey<PlacedFeature> CHROMIUM_ORE_PLACED_KEY = registerKey("chromium_ore_placed");
    public static final ResourceKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
    public static final ResourceKey<PlacedFeature> GALLIUM_ORE_PLACED_KEY = registerKey("gallium_ore_placed");
    public static final ResourceKey<PlacedFeature> IRIDIUM_ORE_PLACED_KEY = registerKey("iridium_ore_placed");
    public static final ResourceKey<PlacedFeature> MANGANESE_ORE_PLACED_KEY = registerKey("manganese_ore_placed");
    public static final ResourceKey<PlacedFeature> MOLYBDENUM_ORE_PLACED_KEY = registerKey("molybdenum_ore_placed");
    public static final ResourceKey<PlacedFeature> PALLADIUM_ORE_PLACED_KEY = registerKey("palladium_ore_placed");
    public static final ResourceKey<PlacedFeature> RUTHENIUM_ORE_PLACED_KEY = registerKey("ruthenium_ore_placed");
    public static final ResourceKey<PlacedFeature> THALLIUM_ORE_PLACED_KEY = registerKey("thallium_ore_placed");
    public static final ResourceKey<PlacedFeature> TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed");

    //Nether
    public static final ResourceKey<PlacedFeature> ARSENIC_ORE_PLACED_KEY = registerKey("arsenic_ore_placed");
    public static final ResourceKey<PlacedFeature> BARIUM_ORE_PLACED_KEY = registerKey("barium_ore_placed");
    public static final ResourceKey<PlacedFeature> BERYLLIUM_ORE_PLACED_KEY = registerKey("beryllium_ore_placed");
    public static final ResourceKey<PlacedFeature> CAESIUM_ORE_PLACED_KEY = registerKey("caesium_ore_placed");
    public static final ResourceKey<PlacedFeature> GERMANIUM_ORE_PLACED_KEY = registerKey("germanium_ore_placed");

    public static final ResourceKey<PlacedFeature> HAFNIUM_ORE_PLACED_KEY = registerKey("hafnium_ore_placed");
    public static final ResourceKey<PlacedFeature> INDIUM_ORE_PLACED_KEY = registerKey("indium_ore_placed");
    public static final ResourceKey<PlacedFeature> NIOBIUM_ORE_PLACED_KEY = registerKey("niobium_ore_placed");
    public static final ResourceKey<PlacedFeature> PHOSPHORUS_ORE_PLACED_KEY = registerKey("phosphorus_ore_placed");
    public static final ResourceKey<PlacedFeature> RHENIUM_ORE_PLACED_KEY = registerKey("rhenium_ore_placed");

    public static final ResourceKey<PlacedFeature> RHODIUM_ORE_PLACED_KEY = registerKey("rhodium_ore_placed");
    public static final ResourceKey<PlacedFeature> SELENIUM_ORE_PLACED_KEY = registerKey("selenium_ore_placed");
    public static final ResourceKey<PlacedFeature> TECHNETIUM_ORE_PLACED_KEY = registerKey("technetium_ore_placed");
    public static final ResourceKey<PlacedFeature> TELLURIUM_ORE_PLACED_KEY = registerKey("tellurium_ore_placed");

    //End
    public static final ResourceKey<PlacedFeature> LITHIUM_ORE_PLACED_KEY = registerKey("lithium_ore_placed");
    public static final ResourceKey<PlacedFeature> RUBIDIUM_ORE_PLACED_KEY = registerKey("rubidium_ore_placed");
    public static final ResourceKey<PlacedFeature> SCANDIUM_ORE_PLACED_KEY = registerKey("scandium_ore_placed");
    public static final ResourceKey<PlacedFeature> STRONTIUM_ORE_PLACED_KEY = registerKey("strontium_ore_placed");
    public static final ResourceKey<PlacedFeature> TANTALUM_ORE_PLACED_KEY = registerKey("tantalum_ore_placed");
    public static final ResourceKey<PlacedFeature> VANADIUM_ORE_PLACED_KEY = registerKey("vanadium_ore_placed");
    public static final ResourceKey<PlacedFeature> YTTRIUM_ORE_PLACED_KEY = registerKey("yttrium_ore_placed");

    public static final ResourceKey<PlacedFeature> BLACK_ASH_PLACED_KEY = registerKey("black_ash_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
//Stone
        register(context, ALUMINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ALUMINIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(28),VerticalAnchor.absolute(80))));

        register(context, CALCIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CALCIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(28),VerticalAnchor.absolute(80))));

        register(context, CINNABAR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CINNABAR_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(28),VerticalAnchor.absolute(80))));

        register(context, LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(28),VerticalAnchor.absolute(80))));

        register(context, MAGNESIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGNESIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20),VerticalAnchor.absolute(80))));

        register(context, NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NICKEL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20),VerticalAnchor.absolute(80))));

        register(context, OSMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OSMIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20),VerticalAnchor.absolute(80))));

        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20),VerticalAnchor.absolute(80))));

        register(context, SILICON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILICON_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(14),VerticalAnchor.absolute(80))));

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(14),VerticalAnchor.absolute(80))));

        register(context, SODIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SODIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(14),VerticalAnchor.absolute(80))));

        register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(14),VerticalAnchor.absolute(80))));

        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10),VerticalAnchor.absolute(80))));

        register(context, ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ZINC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10),VerticalAnchor.absolute(80))));

        register(context, ZIRCONIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ZIRCONIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10),VerticalAnchor.absolute(80))));

        //Deepslate
        register(context, ANTIMONY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANTIMONY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, BISMUTH_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BISMUTH_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, CADMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CADMIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, CHROMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHROMIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COBALT_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, GALLIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GALLIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.IRIDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, MANGANESE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MANGANESE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, MOLYBDENUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOLYBDENUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, PALLADIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PALLADIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, RUTHENIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUTHENIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, THALLIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.THALLIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TUNGSTEN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));


        //Nether
        register(context, ARSENIC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ARSENIC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, BARIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BARIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, BERYLLIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BERYLLIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, CAESIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAESIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, GERMANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GERMANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, HAFNIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.HAFNIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, INDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.INDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NIOBIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NIOBIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, PHOSPHORUS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PHOSPHORUS_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, RHENIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RHENIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, RHODIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RHODIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, SELENIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SELENIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, TECHNETIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TECHNETIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, TELLURIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TELLURIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        //End
        register(context, LITHIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LITHIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(11),VerticalAnchor.absolute(80))));

        register(context, RUBIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBIDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(11),VerticalAnchor.absolute(80))));

        register(context, SCANDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SCANDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(31),VerticalAnchor.absolute(80))));

        register(context, STRONTIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.STRONTIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(41),VerticalAnchor.absolute(80))));

        register(context, TANTALUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TANTALUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(51),VerticalAnchor.absolute(80))));

        register(context, VANADIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VANADIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(60),VerticalAnchor.absolute(80))));

        register(context, YTTRIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.YTTRIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(60),VerticalAnchor.absolute(80))));

        //Nature - Tree
        register(context, BLACK_ASH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_ASH_KEY),
                        VegetationPlacements.treePlacement(PlacementUtils.countExtra(4, 0.1f, 2),
                                ModBlocks.BLACK_ASH_SAPLING.get()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}