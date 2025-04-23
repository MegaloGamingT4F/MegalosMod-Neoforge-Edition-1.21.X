package net.megalogaminguk.megalosmod.worldgen;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
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
    public static final ResourceKey<PlacedFeature> DEEPSLATE_ANTIMONY_ORE_PLACED_KEY = registerKey("antimony_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_BISMUTH_ORE_PLACED_KEY = registerKey("bismuth_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_CADMIUM_ORE_PLACED_KEY = registerKey("cadmium_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_CHROMIUM_ORE_PLACED_KEY = registerKey("chromium_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_GALLIUM_ORE_PLACED_KEY = registerKey("gallium_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_IRIDIUM_ORE_PLACED_KEY = registerKey("iridium_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_MANGANESE_ORE_PLACED_KEY = registerKey("manganese_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_MOLYBDENUM_ORE_PLACED_KEY = registerKey("molybdenum_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_PALLADIUM_ORE_PLACED_KEY = registerKey("palladium_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_RUTHENIUM_ORE_PLACED_KEY = registerKey("ruthenium_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_THALLIUM_ORE_PLACED_KEY = registerKey("thallium_ore_placed");
    public static final ResourceKey<PlacedFeature> DEEPSLATE_TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed");

    //Nether
    public static final ResourceKey<PlacedFeature> NETHER_ARSENIC_ORE_PLACED_KEY = registerKey("arsenic_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_BARIUM_ORE_PLACED_KEY = registerKey("barium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_BERYLLIUM_ORE_PLACED_KEY = registerKey("beryllium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_CAESIUM_ORE_PLACED_KEY = registerKey("caesium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_GERMANIUM_ORE_PLACED_KEY = registerKey("germanium_ore_placed");

    public static final ResourceKey<PlacedFeature> NETHER_HAFNIUM_ORE_PLACED_KEY = registerKey("hafnium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_INDIUM_ORE_PLACED_KEY = registerKey("indium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_NIOBIUM_ORE_PLACED_KEY = registerKey("niobium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_PHOSPHORUS_ORE_PLACED_KEY = registerKey("phosphorus_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_RHENIUM_ORE_PLACED_KEY = registerKey("rhenium_ore_placed");

    public static final ResourceKey<PlacedFeature> NETHER_RHODIUM_ORE_PLACED_KEY = registerKey("rhodium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SELENIUM_ORE_PLACED_KEY = registerKey("selenium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_TECHNETIUM_ORE_PLACED_KEY = registerKey("technetium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_TELLURIUM_ORE_PLACED_KEY = registerKey("tellurium_ore_placed");

    //End
    public static final ResourceKey<PlacedFeature> END_LITHIUM_ORE_PLACED_KEY = registerKey("lithium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_RUBIDIUM_ORE_PLACED_KEY = registerKey("rubidium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_SCANDIUM_ORE_PLACED_KEY = registerKey("scandium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_STRONTIUM_ORE_PLACED_KEY = registerKey("strontium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_TANTALUM_ORE_PLACED_KEY = registerKey("tantalum_ore_placed");
    public static final ResourceKey<PlacedFeature> END_VANADIUM_ORE_PLACED_KEY = registerKey("vanadium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_YTTRIUM_ORE_PLACED_KEY = registerKey("yttrium_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
//Stone
        register(context, ALUMINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ALUMINIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(28),VerticalAnchor.absolute(80))));

        register(context, CALCIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CALCIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(28),VerticalAnchor.absolute(80))));

        register(context, CINNABAR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CINNABAR_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(28),VerticalAnchor.absolute(80))));

        register(context, LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LEAD_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(28),VerticalAnchor.absolute(80))));

        register(context, MAGNESIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_MAGNESIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20),VerticalAnchor.absolute(80))));

        register(context, NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_NICKEL_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20),VerticalAnchor.absolute(80))));

        register(context, OSMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_OSMIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20),VerticalAnchor.absolute(80))));

        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20),VerticalAnchor.absolute(80))));

        register(context, SILICON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILICON_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(14),VerticalAnchor.absolute(80))));

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(14),VerticalAnchor.absolute(80))));

        register(context, SODIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SODIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(14),VerticalAnchor.absolute(80))));

        register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(14),VerticalAnchor.absolute(80))));

        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TITANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10),VerticalAnchor.absolute(80))));

        register(context, ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ZINC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10),VerticalAnchor.absolute(80))));

        register(context, ZIRCONIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ZIRCONIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10),VerticalAnchor.absolute(80))));

        //Deepslate
        register(context, DEEPSLATE_ANTIMONY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_ANTIMONY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_BISMUTH_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_BISMUTH_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_CADMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_CADMIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_CHROMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_CHROMIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_COBALT_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_GALLIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_GALLIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_IRIDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_MANGANESE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_MANGANESE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_MOLYBDENUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_MOLYBDENUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_PALLADIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_PALLADIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_RUTHENIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_RUTHENIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_THALLIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_THALLIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));

        register(context, DEEPSLATE_TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_TUNGSTEN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64),VerticalAnchor.absolute(-8))));


        //Nether
        register(context, NETHER_ARSENIC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ARSENIC_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_BARIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_BARIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_BERYLLIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_BERYLLIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_CAESIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_CAESIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_GERMANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_GERMANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_HAFNIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_HAFNIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_INDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_INDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_NIOBIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_NIOBIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_PHOSPHORUS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_PHOSPHORUS_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_RHENIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RHENIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_RHODIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RHODIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_SELENIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SELENIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_TECHNETIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_TECHNETIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        register(context, NETHER_TELLURIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_TELLURIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(64),VerticalAnchor.absolute(8))));

        //End
        register(context, END_LITHIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_LITHIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(11),VerticalAnchor.absolute(80))));

        register(context, END_RUBIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_RUBIDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(11),VerticalAnchor.absolute(80))));

        register(context, END_SCANDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SCANDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(31),VerticalAnchor.absolute(80))));

        register(context, END_STRONTIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_STRONTIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(41),VerticalAnchor.absolute(80))));

        register(context, END_TANTALUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_TANTALUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(51),VerticalAnchor.absolute(80))));

        register(context, END_VANADIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_VANADIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(60),VerticalAnchor.absolute(80))));

        register(context, END_YTTRIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_YTTRIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(60),VerticalAnchor.absolute(80))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}