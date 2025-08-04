package net.megalogaminguk.megalosmod.tabs;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MegalosMod.MOD_ID);

    public static final Supplier<CreativeModeTab> METALLURGY_CORE_TAB = CREATIVE_MODE_TAB.register("metallurgy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALUMINIUM_ORE))
                    .title(Component.translatable("creativetab.megalosmod.metallurgy_tab"))
                    .withTabsAfter(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "alloys_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Block
                        output.accept(ModBlocks.ALUMINIUM_ORE);
                        output.accept(ModBlocks.ANTIMONY_ORE.get());
                        output.accept(ModBlocks.ARSENIC_ORE.get());
                        output.accept(ModBlocks.BARIUM_ORE.get());
                        output.accept(ModBlocks.BERYLLIUM_ORE.get());

                        output.accept(ModBlocks.BISMUTH_ORE.get());
                        output.accept(ModBlocks.CADMIUM_ORE.get());
                        output.accept(ModBlocks.CAESIUM_ORE.get());
                        output.accept(ModBlocks.CALCIUM_ORE.get());
                        output.accept(ModBlocks.CHROMIUM_ORE.get());

                        output.accept(ModBlocks.CINNABAR_ORE.get());
                        output.accept(ModBlocks.COBALT_ORE.get());
                        output.accept(ModBlocks.GALLIUM_ORE.get());
                        output.accept(ModBlocks.GERMANIUM_ORE.get());
                        output.accept(ModBlocks.HAFNIUM_ORE.get());

                        output.accept(ModBlocks.INDIUM_ORE.get());
                        output.accept(ModBlocks.IRIDIUM_ORE.get());
                        output.accept(ModBlocks.LEAD_ORE.get());
                        output.accept(ModBlocks.LITHIUM_ORE.get());
                        output.accept(ModBlocks.MAGNESIUM_ORE.get());

                        output.accept(ModBlocks.MANGANESE_ORE.get());
                        output.accept(ModBlocks.MOLYBDENUM_ORE.get());
                        output.accept(ModBlocks.NICKEL_ORE.get());
                        output.accept(ModBlocks.NIOBIUM_ORE.get());
                        output.accept(ModBlocks.OSMIUM_ORE.get());

                        output.accept(ModBlocks.PALLADIUM_ORE.get());
                        output.accept(ModBlocks.PHOSPHORUS_ORE.get());
                        output.accept(ModBlocks.PLATINUM_ORE.get());
                        output.accept(ModBlocks.POTASSIUM_ORE.get());
                        output.accept(ModBlocks.RHENIUM_ORE.get());

                        output.accept(ModBlocks.RHODIUM_ORE.get());
                        output.accept(ModBlocks.RUBIDIUM_ORE.get());
                        output.accept(ModBlocks.RUTHENIUM_ORE.get());
                        output.accept(ModBlocks.SCANDIUM_ORE.get());
                        output.accept(ModBlocks.SELENIUM_ORE.get());

                        output.accept(ModBlocks.SILICON_ORE.get());
                        output.accept(ModBlocks.SILVER_ORE.get());
                        output.accept(ModBlocks.SODIUM_ORE.get());
                        output.accept(ModBlocks.STRONTIUM_ORE.get());
                        output.accept(ModBlocks.TANTALUM_ORE.get());

                        output.accept(ModBlocks.TECHNETIUM_ORE.get());
                        output.accept(ModBlocks.TELLURIUM_ORE.get());
                        output.accept(ModBlocks.THALLIUM_ORE.get());
                        output.accept(ModBlocks.TIN_ORE.get());
                        output.accept(ModBlocks.TITANIUM_ORE.get());

                        output.accept(ModBlocks.TUNGSTEN_ORE.get());
                        output.accept(ModBlocks.VANADIUM_ORE.get());
                        output.accept(ModBlocks.YTTRIUM_ORE.get());
                        output.accept(ModBlocks.ZINC_ORE.get());
                        output.accept(ModBlocks.ZIRCONIUM_ORE.get());

                        //Block
                        output.accept(ModBlocks.ALUMINIUM_BLOCK.get());
                        output.accept(ModBlocks.ANTIMONY_BLOCK.get());
                        output.accept(ModBlocks.ARSENIC_BLOCK.get());
                        output.accept(ModBlocks.BARIUM_BLOCK.get());
                        output.accept(ModBlocks.BERYLLIUM_BLOCK.get());

                        output.accept(ModBlocks.BISMUTH_BLOCK.get());
                        output.accept(ModBlocks.CADMIUM_BLOCK.get());
                        output.accept(ModBlocks.CAESIUM_BLOCK.get());
                        output.accept(ModBlocks.CALCIUM_BLOCK.get());
                        output.accept(ModBlocks.CHROMIUM_BLOCK.get());

                        output.accept(ModBlocks.CINNABAR_BLOCK.get());
                        output.accept(ModBlocks.COBALT_BLOCK.get());
                        output.accept(ModBlocks.GALLIUM_BLOCK.get());
                        output.accept(ModBlocks.GERMANIUM_BLOCK.get());
                        output.accept(ModBlocks.HAFNIUM_BLOCK.get());

                        output.accept(ModBlocks.INDIUM_BLOCK.get());
                        output.accept(ModBlocks.IRIDIUM_BLOCK.get());
                        output.accept(ModBlocks.LEAD_BLOCK.get());
                        output.accept(ModBlocks.LITHIUM_BLOCK.get());
                        output.accept(ModBlocks.MAGNESIUM_BLOCK.get());

                        output.accept(ModBlocks.MANGANESE_BLOCK.get());
                        output.accept(ModBlocks.MOLYBDENUM_BLOCK.get());
                        output.accept(ModBlocks.NICKEL_BLOCK.get());
                        output.accept(ModBlocks.NIOBIUM_BLOCK.get());
                        output.accept(ModBlocks.OSMIUM_BLOCK.get());

                        output.accept(ModBlocks.PALLADIUM_BLOCK.get());
                        output.accept(ModBlocks.PHOSPHORUS_BLOCK.get());
                        output.accept(ModBlocks.PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.POTASSIUM_BLOCK.get());
                        output.accept(ModBlocks.RHENIUM_BLOCK.get());

                        output.accept(ModBlocks.RHODIUM_BLOCK.get());
                        output.accept(ModBlocks.RUBIDIUM_BLOCK.get());
                        output.accept(ModBlocks.RUTHENIUM_BLOCK.get());
                        output.accept(ModBlocks.SCANDIUM_BLOCK.get());
                        output.accept(ModBlocks.SELENIUM_BLOCK.get());

                        output.accept(ModBlocks.SILICON_BLOCK.get());
                        output.accept(ModBlocks.SILVER_BLOCK.get());
                        output.accept(ModBlocks.SODIUM_BLOCK.get());
                        output.accept(ModBlocks.STRONTIUM_BLOCK.get());
                        output.accept(ModBlocks.TANTALUM_BLOCK.get());

                        output.accept(ModBlocks.TECHNETIUM_BLOCK.get());
                        output.accept(ModBlocks.TELLURIUM_BLOCK.get());
                        output.accept(ModBlocks.THALLIUM_BLOCK.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());
                        output.accept(ModBlocks.TITANIUM_BLOCK.get());

                        output.accept(ModBlocks.TUNGSTEN_BLOCK.get());
                        output.accept(ModBlocks.VANADIUM_BLOCK.get());
                        output.accept(ModBlocks.YTTRIUM_BLOCK.get());
                        output.accept(ModBlocks.ZINC_BLOCK.get());
                        output.accept(ModBlocks.ZIRCONIUM_BLOCK.get());

                        //Raw Block
                        output.accept(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_ANTIMONY_BLOCK.get());
                        output.accept(ModBlocks.RAW_ARSENIC_BLOCK.get());
                        output.accept(ModBlocks.RAW_BARIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_BERYLLIUM_BLOCK.get());

                        output.accept(ModBlocks.RAW_BISMUTH_BLOCK.get());
                        output.accept(ModBlocks.RAW_CADMIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_CAESIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_CALCIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_CHROMIUM_BLOCK.get());

                        output.accept(ModBlocks.RAW_CINNABAR_BLOCK.get());
                        output.accept(ModBlocks.RAW_COBALT_BLOCK.get());
                        output.accept(ModBlocks.RAW_GALLIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_GERMANIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_HAFNIUM_BLOCK.get());

                        output.accept(ModBlocks.RAW_INDIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_IRIDIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_LEAD_BLOCK.get());
                        output.accept(ModBlocks.RAW_LITHIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_MAGNESIUM_BLOCK.get());

                        output.accept(ModBlocks.RAW_MANGANESE_BLOCK.get());
                        output.accept(ModBlocks.RAW_MOLYBDENUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_NICKEL_BLOCK.get());
                        output.accept(ModBlocks.RAW_NIOBIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_OSMIUM_BLOCK.get());

                        output.accept(ModBlocks.RAW_PALLADIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_PHOSPHORUS_BLOCK.get());
                        output.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_POTASSIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_RHENIUM_BLOCK.get());

                        output.accept(ModBlocks.RAW_RHODIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_RUBIDIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_RUTHENIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_SCANDIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_SELENIUM_BLOCK.get());

                        output.accept(ModBlocks.RAW_SILICON_BLOCK.get());
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        output.accept(ModBlocks.RAW_SODIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_STRONTIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_TANTALUM_BLOCK.get());

                        output.accept(ModBlocks.RAW_TECHNETIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_TELLURIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_THALLIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_TIN_BLOCK.get());
                        output.accept(ModBlocks.RAW_TITANIUM_BLOCK.get());

                        output.accept(ModBlocks.RAW_TUNGSTEN_BLOCK.get());
                        output.accept(ModBlocks.RAW_VANADIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_YTTRIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_ZINC_BLOCK.get());
                        output.accept(ModBlocks.RAW_ZIRCONIUM_BLOCK.get());

                        //Ingot
                        output.accept(ModItems.ALUMINIUM_INGOT.get());
                        output.accept(ModItems.ANTIMONY_INGOT.get());
                        output.accept(ModItems.ARSENIC_INGOT.get());
                        output.accept(ModItems.BARIUM_INGOT.get());
                        output.accept(ModItems.BERYLLIUM_INGOT.get());

                        output.accept(ModItems.BISMUTH_INGOT.get());
                        output.accept(ModItems.CADMIUM_INGOT.get());
                        output.accept(ModItems.CAESIUM_INGOT.get());
                        output.accept(ModItems.CALCIUM_INGOT.get());
                        output.accept(ModItems.CHROMIUM_INGOT.get());

                        output.accept(ModItems.CINNABAR_INGOT.get());
                        output.accept(ModItems.COBALT_INGOT.get());
                        output.accept(ModItems.GALLIUM_INGOT.get());
                        output.accept(ModItems.GERMANIUM_INGOT.get());
                        output.accept(ModItems.HAFNIUM_INGOT.get());

                        output.accept(ModItems.INDIUM_INGOT.get());
                        output.accept(ModItems.IRIDIUM_INGOT.get());
                        output.accept(ModItems.LEAD_INGOT.get());
                        output.accept(ModItems.LITHIUM_INGOT.get());
                        output.accept(ModItems.MAGNESIUM_INGOT.get());

                        output.accept(ModItems.MANGANESE_INGOT.get());
                        output.accept(ModItems.MOLYBDENUM_INGOT.get());
                        output.accept(ModItems.NICKEL_INGOT.get());
                        output.accept(ModItems.NIOBIUM_INGOT.get());
                        output.accept(ModItems.OSMIUM_INGOT.get());

                        output.accept(ModItems.PALLADIUM_INGOT.get());
                        output.accept(ModItems.PHOSPHORUS_INGOT.get());
                        output.accept(ModItems.PLATINUM_INGOT.get());
                        output.accept(ModItems.POTASSIUM_INGOT.get());
                        output.accept(ModItems.RHENIUM_INGOT.get());

                        output.accept(ModItems.RHODIUM_INGOT.get());
                        output.accept(ModItems.RUBIDIUM_INGOT.get());
                        output.accept(ModItems.RUTHENIUM_INGOT.get());
                        output.accept(ModItems.SCANDIUM_INGOT.get());
                        output.accept(ModItems.SELENIUM_INGOT.get());

                        output.accept(ModItems.SILICON_INGOT.get());
                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.SODIUM_INGOT.get());
                        output.accept(ModItems.STRONTIUM_INGOT.get());
                        output.accept(ModItems.TANTALUM_INGOT.get());

                        output.accept(ModItems.TECHNETIUM_INGOT.get());
                        output.accept(ModItems.TELLURIUM_INGOT.get());
                        output.accept(ModItems.THALLIUM_INGOT.get());
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.TITANIUM_INGOT.get());

                        output.accept(ModItems.TUNGSTEN_INGOT.get());
                        output.accept(ModItems.VANADIUM_INGOT.get());
                        output.accept(ModItems.YTTRIUM_INGOT.get());
                        output.accept(ModItems.ZINC_INGOT.get());
                        output.accept(ModItems.ZIRCONIUM_INGOT.get());

                        //Nugget
                        output.accept(ModItems.ALUMINIUM_NUGGET.get());
                        output.accept(ModItems.ANTIMONY_NUGGET.get());
                        output.accept(ModItems.ARSENIC_NUGGET.get());
                        output.accept(ModItems.BARIUM_NUGGET.get());
                        output.accept(ModItems.BERYLLIUM_NUGGET.get());

                        output.accept(ModItems.BISMUTH_NUGGET.get());
                        output.accept(ModItems.CADMIUM_NUGGET.get());
                        output.accept(ModItems.CAESIUM_NUGGET.get());
                        output.accept(ModItems.CALCIUM_NUGGET.get());
                        output.accept(ModItems.CHROMIUM_NUGGET.get());

                        output.accept(ModItems.CINNABAR_NUGGET.get());
                        output.accept(ModItems.COBALT_NUGGET.get());
                        output.accept(ModItems.GALLIUM_NUGGET.get());
                        output.accept(ModItems.GERMANIUM_NUGGET.get());
                        output.accept(ModItems.HAFNIUM_NUGGET.get());

                        output.accept(ModItems.INDIUM_NUGGET.get());
                        output.accept(ModItems.IRIDIUM_NUGGET.get());
                        output.accept(ModItems.LEAD_NUGGET.get());
                        output.accept(ModItems.LITHIUM_NUGGET.get());
                        output.accept(ModItems.MAGNESIUM_NUGGET.get());

                        output.accept(ModItems.MANGANESE_NUGGET.get());
                        output.accept(ModItems.MOLYBDENUM_NUGGET.get());
                        output.accept(ModItems.NICKEL_NUGGET.get());
                        output.accept(ModItems.NIOBIUM_NUGGET.get());
                        output.accept(ModItems.OSMIUM_NUGGET.get());

                        output.accept(ModItems.PALLADIUM_NUGGET.get());
                        output.accept(ModItems.PHOSPHORUS_NUGGET.get());
                        output.accept(ModItems.PLATINUM_NUGGET.get());
                        output.accept(ModItems.POTASSIUM_NUGGET.get());
                        output.accept(ModItems.RHENIUM_NUGGET.get());

                        output.accept(ModItems.RHODIUM_NUGGET.get());
                        output.accept(ModItems.RUBIDIUM_NUGGET.get());
                        output.accept(ModItems.RUTHENIUM_NUGGET.get());
                        output.accept(ModItems.SCANDIUM_NUGGET.get());
                        output.accept(ModItems.SELENIUM_NUGGET.get());

                        output.accept(ModItems.SILICON_NUGGET.get());
                        output.accept(ModItems.SILVER_NUGGET.get());
                        output.accept(ModItems.SODIUM_NUGGET.get());
                        output.accept(ModItems.STRONTIUM_NUGGET.get());
                        output.accept(ModItems.TANTALUM_NUGGET.get());

                        output.accept(ModItems.TECHNETIUM_NUGGET.get());
                        output.accept(ModItems.TELLURIUM_NUGGET.get());
                        output.accept(ModItems.THALLIUM_NUGGET.get());
                        output.accept(ModItems.TIN_NUGGET.get());
                        output.accept(ModItems.TITANIUM_NUGGET.get());

                        output.accept(ModItems.TUNGSTEN_NUGGET.get());
                        output.accept(ModItems.VANADIUM_NUGGET.get());
                        output.accept(ModItems.YTTRIUM_NUGGET.get());
                        output.accept(ModItems.ZINC_NUGGET.get());
                        output.accept(ModItems.ZIRCONIUM_NUGGET.get());

                        //Dust
                        output.accept(ModItems.ALUMINIUM_DUST.get());
                        output.accept(ModItems.ANTIMONY_DUST.get());
                        output.accept(ModItems.ARSENIC_DUST.get());
                        output.accept(ModItems.BARIUM_DUST.get());
                        output.accept(ModItems.BERYLLIUM_DUST.get());

                        output.accept(ModItems.BISMUTH_DUST.get());
                        output.accept(ModItems.CADMIUM_DUST.get());
                        output.accept(ModItems.CAESIUM_DUST.get());
                        output.accept(ModItems.CALCIUM_DUST.get());
                        output.accept(ModItems.CHROMIUM_DUST.get());

                        output.accept(ModItems.CINNABAR_DUST.get());
                        output.accept(ModItems.COAL_DUST.get());
                        output.accept(ModItems.COBALT_DUST.get());
                        output.accept(ModItems.COPPER_DUST.get());
                        output.accept(ModItems.GALLIUM_DUST.get());

                        output.accept(ModItems.GERMANIUM_DUST.get());
                        output.accept(ModItems.GOLD_DUST.get());
                        output.accept(ModItems.HAFNIUM_DUST.get());
                        output.accept(ModItems.INDIUM_DUST.get());
                        output.accept(ModItems.IRIDIUM_DUST.get());

                        output.accept(ModItems.IRON_DUST.get());
                        output.accept(ModItems.LEAD_DUST.get());
                        output.accept(ModItems.LITHIUM_DUST.get());
                        output.accept(ModItems.MAGNESIUM_DUST.get());
                        output.accept(ModItems.MANGANESE_DUST.get());

                        output.accept(ModItems.MOLYBDENUM_DUST.get());
                        output.accept(ModItems.NICKEL_DUST.get());
                        output.accept(ModItems.NIOBIUM_DUST.get());
                        output.accept(ModItems.OSMIUM_DUST.get());
                        output.accept(ModItems.PALLADIUM_DUST.get());

                        output.accept(ModItems.PHOSPHORUS_DUST.get());
                        output.accept(ModItems.PLATINUM_DUST.get());
                        output.accept(ModItems.POTASSIUM_DUST.get());
                        output.accept(ModItems.RHENIUM_DUST.get());
                        output.accept(ModItems.RHODIUM_DUST.get());

                        output.accept(ModItems.RUBIDIUM_DUST.get());
                        output.accept(ModItems.RUTHENIUM_DUST.get());
                        output.accept(ModItems.SCANDIUM_DUST.get());
                        output.accept(ModItems.SELENIUM_DUST.get());
                        output.accept(ModItems.SILICON_DUST.get());

                        output.accept(ModItems.SILVER_DUST.get());
                        output.accept(ModItems.SODIUM_DUST.get());
                        output.accept(ModItems.STRONTIUM_DUST.get());
                        output.accept(ModItems.TANTALUM_DUST.get());
                        output.accept(ModItems.TECHNETIUM_DUST.get());

                        output.accept(ModItems.TELLURIUM_DUST.get());
                        output.accept(ModItems.THALLIUM_DUST.get());
                        output.accept(ModItems.TIN_DUST.get());
                        output.accept(ModItems.TITANIUM_DUST.get());
                        output.accept(ModItems.TUNGSTEN_DUST.get());

                        output.accept(ModItems.VANADIUM_DUST.get());
                        output.accept(ModItems.YTTRIUM_DUST.get());
                        output.accept(ModItems.ZINC_DUST.get());
                        output.accept(ModItems.ZIRCONIUM_DUST.get());

                        //Raw
                        output.accept(ModItems.RAW_ALUMINIUM.get());
                        output.accept(ModItems.RAW_ANTIMONY.get());
                        output.accept(ModItems.RAW_ARSENIC.get());
                        output.accept(ModItems.RAW_BARIUM.get());
                        output.accept(ModItems.RAW_BERYLLIUM.get());

                        output.accept(ModItems.RAW_BISMUTH.get());
                        output.accept(ModItems.RAW_CADMIUM.get());
                        output.accept(ModItems.RAW_CAESIUM.get());
                        output.accept(ModItems.RAW_CALCIUM.get());
                        output.accept(ModItems.RAW_CHROMIUM.get());

                        output.accept(ModItems.RAW_CINNABAR.get());
                        output.accept(ModItems.RAW_COBALT.get());
                        output.accept(ModItems.RAW_GALLIUM.get());
                        output.accept(ModItems.RAW_GERMANIUM.get());
                        output.accept(ModItems.RAW_HAFNIUM.get());

                        output.accept(ModItems.RAW_INDIUM.get());
                        output.accept(ModItems.RAW_IRIDIUM.get());
                        output.accept(ModItems.RAW_LEAD.get());
                        output.accept(ModItems.RAW_LITHIUM.get());
                        output.accept(ModItems.RAW_MAGNESIUM.get());

                        output.accept(ModItems.RAW_MANGANESE.get());
                        output.accept(ModItems.RAW_MOLYBDENUM.get());
                        output.accept(ModItems.RAW_NICKEL.get());
                        output.accept(ModItems.RAW_NIOBIUM.get());
                        output.accept(ModItems.RAW_OSMIUM.get());

                        output.accept(ModItems.RAW_PALLADIUM.get());
                        output.accept(ModItems.RAW_PHOSPHORUS.get());
                        output.accept(ModItems.RAW_PLATINUM.get());
                        output.accept(ModItems.RAW_POTASSIUM.get());
                        output.accept(ModItems.RAW_RHENIUM.get());

                        output.accept(ModItems.RAW_RHODIUM.get());
                        output.accept(ModItems.RAW_RUBIDIUM.get());
                        output.accept(ModItems.RAW_RUTHENIUM.get());
                        output.accept(ModItems.RAW_SCANDIUM.get());
                        output.accept(ModItems.RAW_SELENIUM.get());

                        output.accept(ModItems.RAW_SILICON.get());
                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.RAW_SODIUM.get());
                        output.accept(ModItems.RAW_STRONTIUM.get());
                        output.accept(ModItems.RAW_TANTALUM.get());

                        output.accept(ModItems.RAW_TECHNETIUM.get());
                        output.accept(ModItems.RAW_TELLURIUM.get());
                        output.accept(ModItems.RAW_THALLIUM.get());
                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.RAW_TITANIUM.get());

                        output.accept(ModItems.RAW_TUNGSTEN.get());
                        output.accept(ModItems.RAW_VANADIUM.get());
                        output.accept(ModItems.RAW_YTTRIUM.get());
                        output.accept(ModItems.RAW_ZINC.get());
                        output.accept(ModItems.RAW_ZIRCONIUM.get());
                    }).build());

    public static final Supplier<CreativeModeTab> METALLURGY_ALLOYS_TAB = CREATIVE_MODE_TAB.register("alloys_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AA_INGOT.get()))
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "metallurgy_tab"))
                .withTabsAfter(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "hoplology_tab"))
                .title(Component.translatable("creativetab.megalosmod.alloys_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    //Block
                    output.accept(ModBlocks.AA_BLOCK.get());
                    output.accept(ModBlocks.AL_LI_BLOCK.get());
                    output.accept(ModBlocks.ALNICO_BLOCK.get());
                    output.accept(ModBlocks.ALUMINIUM_SCANDIUM_BLOCK.get());
                    output.accept(ModBlocks.BIRMABRIGHT_BLOCK.get());
                    output.accept(ModBlocks.DEVARDA_BLOCK.get());
                    output.accept(ModBlocks.DURALUMIN_BLOCK.get());
                    output.accept(ModBlocks.HIDUMINIUM_BLOCK.get());
                    output.accept(ModBlocks.HYDRONALIUM_BLOCK.get());
                    output.accept(ModBlocks.ITALMA_BLOCK.get());
                    output.accept(ModBlocks.MAGNALIUM_BLOCK.get());
                    output.accept(ModBlocks.MAGNOX_BLOCK.get());
                    output.accept(ModBlocks.NAMBE_BLOCK.get());
                    output.accept(ModBlocks.NITIAL_BLOCK.get());
                    output.accept(ModBlocks.SILUMIN_BLOCK.get());
                    output.accept(ModBlocks.Y_ALLOY_BLOCK.get());
                    output.accept(ModBlocks.ZAMAK_BLOCK.get());

                    output.accept(ModBlocks.LOCKALLOY_BLOCK.get());

                    output.accept(ModBlocks.BISMANOL_BLOCK.get());
                    output.accept(ModBlocks.CERROBEND_BLOCK.get());
                    output.accept(ModBlocks.CERROSAFE_BLOCK.get());
                    output.accept(ModBlocks.FIELDS_METAL_BLOCK.get());
                    output.accept(ModBlocks.ROSE_METAL_BLOCK.get());
                    output.accept(ModBlocks.WOODS_METAL_BLOCK.get());

                    output.accept(ModBlocks.CHROMIUM_HYDRIDE_BLOCK.get());
                    output.accept(ModBlocks.CRNISZWTI_BLOCK.get());
                    output.accept(ModBlocks.NICHROME_BLOCK.get());

                    output.accept(ModBlocks.ELGILOY_BLOCK.get());
                    output.accept(ModBlocks.MEGALLIUM_BLOCK.get());
                    output.accept(ModBlocks.STELLITE_BLOCK.get());
                    output.accept(ModBlocks.TALONITE_BLOCK.get());
                    output.accept(ModBlocks.ULTIMET_BLOCK.get());
                    output.accept(ModBlocks.VITALLIUM_BLOCK.get());

                    output.accept(ModBlocks.ALUMINIUM_BRONZE_BLOCK.get());
                    output.accept(ModBlocks.ARSENICAL_BRONZE_BLOCK.get());
                    output.accept(ModBlocks.ARSENICAL_COPPER_BLOCK.get());
                    output.accept(ModBlocks.BELL_METAL_BLOCK.get());
                    output.accept(ModBlocks.BERYLLIUM_COPPER_BLOCK.get());
                    output.accept(ModBlocks.BILLON_BLOCK.get());
                    output.accept(ModBlocks.BRASS_BLOCK.get());
                    output.accept(ModBlocks.BRONZE_BLOCK.get());
                    output.accept(ModBlocks.CALAMINE_BRASS_BLOCK.get());
                    output.accept(ModBlocks.CHINESE_SILVER_BLOCK.get());
                    output.accept(ModBlocks.CONSTANTAN_BLOCK.get());
                    output.accept(ModBlocks.COPPER_HYDRIDE_BLOCK.get());
                    output.accept(ModBlocks.COPPER_TUNGSTEN_BLOCK.get());
                    output.accept(ModBlocks.CORINTHIAN_BRONZE_BLOCK.get());
                    output.accept(ModBlocks.CUNIFE_BLOCK.get());
                    output.accept(ModBlocks.CUAG_BLOCK.get());
                    output.accept(ModBlocks.CYMBAL_ALLOY_BLOCK.get());
                    output.accept(ModBlocks.DUTCH_METAL_BLOCK.get());
                    output.accept(ModBlocks.FLORENTINE_BRONZE_BLOCK.get());
                    output.accept(ModBlocks.GILDING_METAL_BLOCK.get());
                    output.accept(ModBlocks.GLUCYDUR_BLOCK.get());
                    output.accept(ModBlocks.GUANIN_BLOCK.get());
                    output.accept(ModBlocks.GUN_METAL_BLOCK.get());
                    output.accept(ModBlocks.HEPATIZON_BLOCK.get());
                    output.accept(ModBlocks.MANGANIN_BLOCK.get());
                    output.accept(ModBlocks.MELCHIOR_BLOCK.get());
                    output.accept(ModBlocks.MUNTZ_METAL_BLOCK.get());
                    output.accept(ModBlocks.NICKEL_SILVER_BLOCK.get());
                    output.accept(ModBlocks.NORDIC_GOLD_BLOCK.get());
                    output.accept(ModBlocks.ORMOLU_BLOCK.get());
                    output.accept(ModBlocks.PHOSPHOR_BRONZE_BLOCK.get());
                    output.accept(ModBlocks.PINCHBECK_BLOCK.get());
                    output.accept(ModBlocks.PRINCES_METAL_BLOCK.get());
                    output.accept(ModBlocks.SHAKUDO_BLOCK.get());
                    output.accept(ModBlocks.SILICON_BRONZE_BLOCK.get());
                    output.accept(ModBlocks.SPECULUM_METAL_BLOCK.get());
                    output.accept(ModBlocks.TOMBAC_BLOCK.get());
                    output.accept(ModBlocks.TUMBAGA_BLOCK.get());
                    output.accept(ModBlocks.WHITE_BRONZE_BLOCK.get());

                    output.accept(ModBlocks.AL_GA_BLOCK.get());
                    output.accept(ModBlocks.GALFENOL_BLOCK.get());
                    output.accept(ModBlocks.GALINSTAN_BLOCK.get());

                    output.accept(ModBlocks.COLORED_GOLD_BLOCK.get());
                    output.accept(ModBlocks.CROWN_GOLD_BLOCK.get());
                    output.accept(ModBlocks.ELECTRUM_BLOCK.get());
                    output.accept(ModBlocks.RHODITE_BLOCK.get());
                    output.accept(ModBlocks.ROSE_GOLD_BLOCK.get());
                    output.accept(ModBlocks.WHITE_GOLD_BLOCK.get());

                    output.accept(ModBlocks.ANTHRACITE_IRON_BLOCK.get());
                    output.accept(ModBlocks.BULAT_STEEL_BLOCK.get());
                    output.accept(ModBlocks.CAST_IRON_BLOCK.get());
                    output.accept(ModBlocks.CHROMOLY_BLOCK.get());
                    output.accept(ModBlocks.CRUCIBLE_STEEL_BLOCK.get());
                    output.accept(ModBlocks.DAMASCUS_STEEL_BLOCK.get());
                    output.accept(ModBlocks.DUCOL_BLOCK.get());
                    output.accept(ModBlocks.ELINVAR_BLOCK.get());
                    output.accept(ModBlocks.FERNICO_BLOCK.get());
                    output.accept(ModBlocks.FERROCHROMIUM_BLOCK.get());
                    output.accept(ModBlocks.FERROMAGNESIUM_BLOCK.get());
                    output.accept(ModBlocks.FERROMANGANESE_BLOCK.get());
                    output.accept(ModBlocks.FERROMOLYBDENUM_BLOCK.get());
                    output.accept(ModBlocks.FERRONICKEL_BLOCK.get());
                    output.accept(ModBlocks.FERROPHOSPHORUS_BLOCK.get());
                    output.accept(ModBlocks.FERROSILICON_BLOCK.get());
                    output.accept(ModBlocks.FERROTITANIUM_BLOCK.get());
                    output.accept(ModBlocks.FERROVANADIUM_BLOCK.get());
                    output.accept(ModBlocks.HIGHSPEED_STEEL_BLOCK.get());
                    output.accept(ModBlocks.HSLA_STEEL_BLOCK.get());
                    output.accept(ModBlocks.INVAR_BLOCK.get());
                    output.accept(ModBlocks.IRON_HYDRIDE_BLOCK.get());
                    output.accept(ModBlocks.KANTHAL_BLOCK.get());
                    output.accept(ModBlocks.KOVAR_BLOCK.get());
                    output.accept(ModBlocks.MARAGING_STEEL_BLOCK.get());
                    output.accept(ModBlocks.MUSHET_STEEL_BLOCK.get());
                    output.accept(ModBlocks.PIG_IRON_BLOCK.get());
                    output.accept(ModBlocks.REYNOLDS_FTO_BLOCK.get());
                    output.accept(ModBlocks.SILICON_STEEL_BLOCK.get());
                    output.accept(ModBlocks.SILVER_STEEL_BLOCK.get());
                    output.accept(ModBlocks.SPIEGELEISEN_BLOCK.get());
                    output.accept(ModBlocks.SPRING_STEEL_BLOCK.get());
                    output.accept(ModBlocks.STAINLESS_STEEL_BLOCK.get());
                    output.accept(ModBlocks.STABALLOY_BLOCK.get());
                    output.accept(ModBlocks.STEEL_BLOCK.get());
                    output.accept(ModBlocks.TOOL_STEEL_BLOCK.get());
                    output.accept(ModBlocks.WEATHERING_STEEL_BLOCK.get());
                    output.accept(ModBlocks.WOOTZ_STEEL_BLOCK.get());
                    output.accept(ModBlocks.WROUGHT_IRON_BLOCK.get());

                    output.accept(ModBlocks.MOLYBDOCHALKOS_BLOCK.get());
                    output.accept(ModBlocks.SOLDER_BLOCK.get());
                    output.accept(ModBlocks.TERNE_BLOCK.get());
                    output.accept(ModBlocks.TYPE_METAL_BLOCK.get());

                    output.accept(ModBlocks.ELEKTRON_BLOCK.get());
                    output.accept(ModBlocks.TMGALZN_BLOCK.get());

                    output.accept(ModBlocks.MNFZ_BLOCK.get());
                    output.accept(ModBlocks.MNSZ_BLOCK.get());

                    output.accept(ModBlocks.ZINC_AMALGAM_BLOCK.get());
                    output.accept(ModBlocks.ASHTADHATU_BLOCK.get());

                    output.accept(ModBlocks.ALUMEL_BLOCK.get());
                    output.accept(ModBlocks.BRIGHTRAY_BLOCK.get());
                    output.accept(ModBlocks.CHROMEL_BLOCK.get());
                    output.accept(ModBlocks.COIN_SILVER_BLOCK.get());
                    output.accept(ModBlocks.COPPER_NICKEL_BLOCK.get());
                    output.accept(ModBlocks.CUPRONICKEL_BLOCK.get());
                    output.accept(ModBlocks.GERMAN_SILVER_BLOCK.get());
                    output.accept(ModBlocks.HASTELLOY_BLOCK.get());
                    output.accept(ModBlocks.HAUSLER_BLOCK.get());
                    output.accept(ModBlocks.INCONEL_BLOCK.get());
                    output.accept(ModBlocks.INCONEL_SES_BLOCK.get());
                    output.accept(ModBlocks.MONEL_METAL_BLOCK.get());
                    output.accept(ModBlocks.MU_METAL_BLOCK.get());
                    output.accept(ModBlocks.NICKEL_CARBON_BLOCK.get());
                    output.accept(ModBlocks.NICKEL_HYDRIDE_BLOCK.get());
                    output.accept(ModBlocks.NICROSIL_BLOCK.get());
                    output.accept(ModBlocks.NIMONIC_BLOCK.get());
                    output.accept(ModBlocks.NISIL_BLOCK.get());
                    output.accept(ModBlocks.NITINOL_BLOCK.get());
                    output.accept(ModBlocks.PERMALLOY_BLOCK.get());
                    output.accept(ModBlocks.SUPERMALLOY_BLOCK.get());

                    output.accept(ModBlocks.KLI_BLOCK.get());
                    output.accept(ModBlocks.NAK_BLOCK.get());

                    output.accept(ModBlocks.PSEUDO_PALLADIUM_BLOCK.get());

                    output.accept(ModBlocks.SCANDIUM_HYDRIDE_BLOCK.get());

                    output.accept(ModBlocks.ARGENTIUM_STERLING_SILVER_BLOCK.get());
                    output.accept(ModBlocks.BRITANNIA_SILVER_BLOCK.get());
                    output.accept(ModBlocks.DORE_BLOCK.get());
                    output.accept(ModBlocks.DYMALLOY_BLOCK.get());
                    output.accept(ModBlocks.GOLOID_BLOCK.get());
                    output.accept(ModBlocks.PLATINUM_SILVER_BLOCK.get());
                    output.accept(ModBlocks.SHIBUICHI_BLOCK.get());
                    output.accept(ModBlocks.STERLING_SILVER_BLOCK.get());
                    output.accept(ModBlocks.TIBETAN_SILVER_BLOCK.get());

                    output.accept(ModBlocks.BABBITT_BLOCK.get());
                    output.accept(ModBlocks.BRITANNIUM_BLOCK.get());
                    output.accept(ModBlocks.PEWTER_BLOCK.get());
                    output.accept(ModBlocks.QUEENS_METAL_BLOCK.get());

                    output.accept(ModBlocks.BETA_C_BLOCK.get());
                    output.accept(ModBlocks.GUM_METAL_BLOCK.get());
                    output.accept(ModBlocks.SAL_FV_BLOCK.get());
                    output.accept(ModBlocks.TITANIUM_GOLD_BLOCK.get());
                    output.accept(ModBlocks.TITANIUM_HYDRIDE_BLOCK.get());
                    output.accept(ModBlocks.TITANIUM_NITRIDE_BLOCK.get());

                    output.accept(ModBlocks.ZIRCALOY_BLOCK.get());

                    output.accept(ModItems.AA_INGOT.get());
                    output.accept(ModItems.AL_LI_INGOT.get());
                    output.accept(ModItems.ALNICO_INGOT.get());
                    output.accept(ModItems.ALUMINIUM_SCANDIUM_INGOT.get());
                    output.accept(ModItems.BIRMABRIGHT_INGOT.get());
                    output.accept(ModItems.DEVARDA_INGOT.get());
                    output.accept(ModItems.DURALUMIN_INGOT.get());
                    output.accept(ModItems.HIDUMINIUM_INGOT.get());
                    output.accept(ModItems.HYDRONALIUM_INGOT.get());
                    output.accept(ModItems.ITALMA_INGOT.get());
                    output.accept(ModItems.MAGNALIUM_INGOT.get());
                    output.accept(ModItems.MAGNOX_INGOT.get());
                    output.accept(ModItems.NAMBE_INGOT.get());
                    output.accept(ModItems.NITIAL_INGOT.get());
                    output.accept(ModItems.SILUMIN_INGOT.get());
                    output.accept(ModItems.Y_ALLOY_INGOT.get());
                    output.accept(ModItems.ZAMAK_INGOT.get());

                    output.accept(ModItems.LOCKALLOY_INGOT.get());

                    output.accept(ModItems.BISMANOL_INGOT.get());
                    output.accept(ModItems.CERROBEND_INGOT.get());
                    output.accept(ModItems.CERROSAFE_INGOT.get());
                    output.accept(ModItems.FIELDS_METAL_INGOT.get());
                    output.accept(ModItems.ROSE_METAL_INGOT.get());
                    output.accept(ModItems.WOODS_METAL_INGOT.get());

                    output.accept(ModItems.CHROMIUM_HYDRIDE_INGOT.get());
                    output.accept(ModItems.CRNISZWTI_INGOT.get());
                    output.accept(ModItems.NICHROME_INGOT.get());

                    output.accept(ModItems.ELGILOY_INGOT.get());
                    output.accept(ModItems.MEGALLIUM_INGOT.get());
                    output.accept(ModItems.STELLITE_INGOT.get());
                    output.accept(ModItems.TALONITE_INGOT.get());
                    output.accept(ModItems.ULTIMET_INGOT.get());
                    output.accept(ModItems.VITALLIUM_INGOT.get());

                    output.accept(ModItems.ALUMINIUM_BRONZE_INGOT.get());
                    output.accept(ModItems.ARSENICAL_BRONZE_INGOT.get());
                    output.accept(ModItems.ARSENICAL_COPPER_INGOT.get());
                    output.accept(ModItems.BELL_METAL_INGOT.get());
                    output.accept(ModItems.BERYLLIUM_COPPER_INGOT.get());
                    output.accept(ModItems.BILLON_INGOT.get());
                    output.accept(ModItems.BRASS_INGOT.get());
                    output.accept(ModItems.BRONZE_INGOT.get());
                    output.accept(ModItems.CALAMINE_BRASS_INGOT.get());
                    output.accept(ModItems.CHINESE_SILVER_INGOT.get());
                    output.accept(ModItems.CONSTANTAN_INGOT.get());
                    output.accept(ModItems.COPPER_HYDRIDE_INGOT.get());
                    output.accept(ModItems.COPPER_TUNGSTEN_INGOT.get());
                    output.accept(ModItems.CORINTHIAN_BRONZE_INGOT.get());
                    output.accept(ModItems.CUNIFE_INGOT.get());
                    output.accept(ModItems.CUAG_INGOT.get());
                    output.accept(ModItems.CYMBAL_ALLOY_INGOT.get());
                    output.accept(ModItems.DUTCH_METAL_INGOT.get());
                    output.accept(ModItems.FLORENTINE_BRONZE_INGOT.get());
                    output.accept(ModItems.GILDING_METAL_INGOT.get());
                    output.accept(ModItems.GLUCYDUR_INGOT.get());
                    output.accept(ModItems.GUANIN_INGOT.get());
                    output.accept(ModItems.GUN_METAL_INGOT.get());
                    output.accept(ModItems.HEPATIZON_INGOT.get());
                    output.accept(ModItems.MANGANIN_INGOT.get());
                    output.accept(ModItems.MELCHIOR_INGOT.get());
                    output.accept(ModItems.MUNTZ_METAL_INGOT.get());
                    output.accept(ModItems.NICKEL_SILVER_INGOT.get());
                    output.accept(ModItems.NORDIC_GOLD_INGOT.get());
                    output.accept(ModItems.ORMOLU_INGOT.get());
                    output.accept(ModItems.PHOSPHOR_BRONZE_INGOT.get());
                    output.accept(ModItems.PINCHBECK_INGOT.get());
                    output.accept(ModItems.PRINCES_METAL_INGOT.get());
                    output.accept(ModItems.SHAKUDO_INGOT.get());
                    output.accept(ModItems.SILICON_BRONZE_INGOT.get());
                    output.accept(ModItems.SPECULUM_METAL_INGOT.get());
                    output.accept(ModItems.TOMBAC_INGOT.get());
                    output.accept(ModItems.TUMBAGA_INGOT.get());
                    output.accept(ModItems.WHITE_BRONZE_INGOT.get());

                    output.accept(ModItems.AL_GA_INGOT.get());
                    output.accept(ModItems.GALFENOL_INGOT.get());
                    output.accept(ModItems.GALINSTAN_INGOT.get());

                    output.accept(ModItems.COLORED_GOLD_INGOT.get());
                    output.accept(ModItems.CROWN_GOLD_INGOT.get());
                    output.accept(ModItems.ELECTRUM_INGOT.get());
                    output.accept(ModItems.RHODITE_INGOT.get());
                    output.accept(ModItems.ROSE_GOLD_INGOT.get());
                    output.accept(ModItems.WHITE_GOLD_INGOT.get());

                    output.accept(ModItems.ANTHRACITE_IRON_INGOT.get());
                    output.accept(ModItems.BULAT_STEEL_INGOT.get());
                    output.accept(ModItems.CAST_IRON_INGOT.get());
                    output.accept(ModItems.CHROMOLY_INGOT.get());
                    output.accept(ModItems.CRUCIBLE_STEEL_INGOT.get());
                    output.accept(ModItems.DAMASCUS_STEEL_INGOT.get());
                    output.accept(ModItems.DUCOL_INGOT.get());
                    output.accept(ModItems.ELINVAR_INGOT.get());
                    output.accept(ModItems.FERNICO_INGOT.get());
                    output.accept(ModItems.FERROCHROMIUM_INGOT.get());
                    output.accept(ModItems.FERROMAGNESIUM_INGOT.get());
                    output.accept(ModItems.FERROMANGANESE_INGOT.get());
                    output.accept(ModItems.FERROMOLYBDENUM_INGOT.get());
                    output.accept(ModItems.FERRONICKEL_INGOT.get());
                    output.accept(ModItems.FERROPHOSPHORUS_INGOT.get());
                    output.accept(ModItems.FERROSILICON_INGOT.get());
                    output.accept(ModItems.FERROTITANIUM_INGOT.get());
                    output.accept(ModItems.FERROVANADIUM_INGOT.get());
                    output.accept(ModItems.HIGHSPEED_STEEL_INGOT.get());
                    output.accept(ModItems.HSLA_STEEL_INGOT.get());
                    output.accept(ModItems.INVAR_INGOT.get());
                    output.accept(ModItems.IRON_HYDRIDE_INGOT.get());
                    output.accept(ModItems.KANTHAL_INGOT.get());
                    output.accept(ModItems.KOVAR_INGOT.get());
                    output.accept(ModItems.MARAGING_STEEL_INGOT.get());
                    output.accept(ModItems.MUSHET_STEEL_INGOT.get());
                    output.accept(ModItems.PIG_IRON_INGOT.get());
                    output.accept(ModItems.REYNOLDS_FTO_INGOT.get());
                    output.accept(ModItems.SILICON_STEEL_INGOT.get());
                    output.accept(ModItems.SILVER_STEEL_INGOT.get());
                    output.accept(ModItems.SPIEGELEISEN_INGOT.get());
                    output.accept(ModItems.SPRING_STEEL_INGOT.get());
                    output.accept(ModItems.STAINLESS_STEEL_INGOT.get());
                    output.accept(ModItems.STABALLOY_INGOT.get());
                    output.accept(ModItems.STEEL_INGOT.get());
                    output.accept(ModItems.TOOL_STEEL_INGOT.get());
                    output.accept(ModItems.WEATHERING_STEEL_INGOT.get());
                    output.accept(ModItems.WOOTZ_STEEL_INGOT.get());
                    output.accept(ModItems.WROUGHT_IRON_INGOT.get());

                    output.accept(ModItems.MOLYBDOCHALKOS_INGOT.get());
                    output.accept(ModItems.SOLDER_INGOT.get());
                    output.accept(ModItems.TERNE_INGOT.get());
                    output.accept(ModItems.TYPE_METAL_INGOT.get());

                    output.accept(ModItems.ELEKTRON_INGOT.get());
                    output.accept(ModItems.TMGALZN_INGOT.get());

                    output.accept(ModItems.MNFZ_INGOT.get());
                    output.accept(ModItems.MNSZ_INGOT.get());

                    output.accept(ModItems.ZINC_AMALGAM_INGOT.get());
                    output.accept(ModItems.ASHTADHATU_INGOT.get());

                    output.accept(ModItems.ALUMEL_INGOT.get());
                    output.accept(ModItems.BRIGHTRAY_INGOT.get());
                    output.accept(ModItems.CHROMEL_INGOT.get());
                    output.accept(ModItems.COIN_SILVER_INGOT.get());
                    output.accept(ModItems.COPPER_NICKEL_INGOT.get());
                    output.accept(ModItems.CUPRONICKEL_INGOT.get());
                    output.accept(ModItems.GERMAN_SILVER_INGOT.get());
                    output.accept(ModItems.HASTELLOY_INGOT.get());
                    output.accept(ModItems.HAUSLER_INGOT.get());
                    output.accept(ModItems.INCONEL_INGOT.get());
                    output.accept(ModItems.INCONEL_SES_INGOT.get());
                    output.accept(ModItems.MONEL_METAL_INGOT.get());
                    output.accept(ModItems.MU_METAL_INGOT.get());
                    output.accept(ModItems.NICKEL_CARBON_INGOT.get());
                    output.accept(ModItems.NICKEL_HYDRIDE_INGOT.get());
                    output.accept(ModItems.NICROSIL_INGOT.get());
                    output.accept(ModItems.NIMONIC_INGOT.get());
                    output.accept(ModItems.NISIL_INGOT.get());
                    output.accept(ModItems.NITINOL_INGOT.get());
                    output.accept(ModItems.PERMALLOY_INGOT.get());
                    output.accept(ModItems.SUPERMALLOY_INGOT.get());

                    output.accept(ModItems.KLI_INGOT.get());
                    output.accept(ModItems.NAK_INGOT.get());

                    output.accept(ModItems.PSEUDO_PALLADIUM_INGOT.get());

                    output.accept(ModItems.SCANDIUM_HYDRIDE_INGOT.get());

                    output.accept(ModItems.ARGENTIUM_STERLING_SILVER_INGOT.get());
                    output.accept(ModItems.BRITANNIA_SILVER_INGOT.get());
                    output.accept(ModItems.DORE_INGOT.get());
                    output.accept(ModItems.DYMALLOY_INGOT.get());
                    output.accept(ModItems.GOLOID_INGOT.get());
                    output.accept(ModItems.PLATINUM_SILVER_INGOT.get());
                    output.accept(ModItems.SHIBUICHI_INGOT.get());
                    output.accept(ModItems.STERLING_SILVER_INGOT.get());
                    output.accept(ModItems.TIBETAN_SILVER_INGOT.get());

                    output.accept(ModItems.BABBITT_INGOT.get());
                    output.accept(ModItems.BRITANNIUM_INGOT.get());
                    output.accept(ModItems.PEWTER_INGOT.get());
                    output.accept(ModItems.QUEENS_METAL_INGOT.get());

                    output.accept(ModItems.BETA_C_INGOT.get());
                    output.accept(ModItems.GUM_METAL_INGOT.get());
                    output.accept(ModItems.SAL_FV_INGOT.get());
                    output.accept(ModItems.TITANIUM_GOLD_INGOT.get());
                    output.accept(ModItems.TITANIUM_HYDRIDE_INGOT.get());
                    output.accept(ModItems.TITANIUM_NITRIDE_INGOT.get());

                    output.accept(ModItems.ZIRCALOY_INGOT.get());
                    output.accept(ModItems.AA_NUGGET.get());
                    output.accept(ModItems.AL_LI_NUGGET.get());
                    output.accept(ModItems.ALNICO_NUGGET.get());
                    output.accept(ModItems.ALUMINIUM_SCANDIUM_NUGGET.get());
                    output.accept(ModItems.BIRMABRIGHT_NUGGET.get());
                    output.accept(ModItems.DEVARDA_NUGGET.get());
                    output.accept(ModItems.DURALUMIN_NUGGET.get());
                    output.accept(ModItems.HIDUMINIUM_NUGGET.get());
                    output.accept(ModItems.HYDRONALIUM_NUGGET.get());
                    output.accept(ModItems.ITALMA_NUGGET.get());
                    output.accept(ModItems.MAGNALIUM_NUGGET.get());
                    output.accept(ModItems.MAGNOX_NUGGET.get());
                    output.accept(ModItems.NAMBE_NUGGET.get());
                    output.accept(ModItems.NITIAL_NUGGET.get());
                    output.accept(ModItems.SILUMIN_NUGGET.get());
                    output.accept(ModItems.Y_ALLOY_NUGGET.get());
                    output.accept(ModItems.ZAMAK_NUGGET.get());

                    output.accept(ModItems.LOCKALLOY_NUGGET.get());

                    output.accept(ModItems.BISMANOL_NUGGET.get());
                    output.accept(ModItems.CERROBEND_NUGGET.get());
                    output.accept(ModItems.CERROSAFE_NUGGET.get());
                    output.accept(ModItems.FIELDS_METAL_NUGGET.get());
                    output.accept(ModItems.ROSE_METAL_NUGGET.get());
                    output.accept(ModItems.WOODS_METAL_NUGGET.get());

                    output.accept(ModItems.CHROMIUM_HYDRIDE_NUGGET.get());
                    output.accept(ModItems.CRNISZWTI_NUGGET.get());
                    output.accept(ModItems.NICHROME_NUGGET.get());

                    output.accept(ModItems.ELGILOY_NUGGET.get());
                    output.accept(ModItems.MEGALLIUM_NUGGET.get());
                    output.accept(ModItems.STELLITE_NUGGET.get());
                    output.accept(ModItems.TALONITE_NUGGET.get());
                    output.accept(ModItems.ULTIMET_NUGGET.get());
                    output.accept(ModItems.VITALLIUM_NUGGET.get());

                    output.accept(ModItems.ALUMINIUM_BRONZE_NUGGET.get());
                    output.accept(ModItems.ARSENICAL_BRONZE_NUGGET.get());
                    output.accept(ModItems.ARSENICAL_COPPER_NUGGET.get());
                    output.accept(ModItems.BELL_METAL_NUGGET.get());
                    output.accept(ModItems.BERYLLIUM_COPPER_NUGGET.get());
                    output.accept(ModItems.BILLON_NUGGET.get());
                    output.accept(ModItems.BRASS_NUGGET.get());
                    output.accept(ModItems.BRONZE_NUGGET.get());
                    output.accept(ModItems.CALAMINE_BRASS_NUGGET.get());
                    output.accept(ModItems.CHINESE_SILVER_NUGGET.get());
                    output.accept(ModItems.CONSTANTAN_NUGGET.get());
                    output.accept(ModItems.COPPER_HYDRIDE_NUGGET.get());
                    output.accept(ModItems.COPPER_TUNGSTEN_NUGGET.get());
                    output.accept(ModItems.CORINTHIAN_BRONZE_NUGGET.get());
                    output.accept(ModItems.CUNIFE_NUGGET.get());
                    output.accept(ModItems.CUAG_NUGGET.get());
                    output.accept(ModItems.CYMBAL_ALLOY_NUGGET.get());
                    output.accept(ModItems.DUTCH_METAL_NUGGET.get());
                    output.accept(ModItems.FLORENTINE_BRONZE_NUGGET.get());
                    output.accept(ModItems.GILDING_METAL_NUGGET.get());
                    output.accept(ModItems.GLUCYDUR_NUGGET.get());
                    output.accept(ModItems.GUANIN_NUGGET.get());
                    output.accept(ModItems.GUN_METAL_NUGGET.get());
                    output.accept(ModItems.HEPATIZON_NUGGET.get());
                    output.accept(ModItems.MANGANIN_NUGGET.get());
                    output.accept(ModItems.MELCHIOR_NUGGET.get());
                    output.accept(ModItems.MUNTZ_METAL_NUGGET.get());
                    output.accept(ModItems.NICKEL_SILVER_NUGGET.get());
                    output.accept(ModItems.NORDIC_GOLD_NUGGET.get());
                    output.accept(ModItems.ORMOLU_NUGGET.get());
                    output.accept(ModItems.PHOSPHOR_BRONZE_NUGGET.get());
                    output.accept(ModItems.PINCHBECK_NUGGET.get());
                    output.accept(ModItems.PRINCES_METAL_NUGGET.get());
                    output.accept(ModItems.SHAKUDO_NUGGET.get());
                    output.accept(ModItems.SILICON_BRONZE_NUGGET.get());
                    output.accept(ModItems.SPECULUM_METAL_NUGGET.get());
                    output.accept(ModItems.TOMBAC_NUGGET.get());
                    output.accept(ModItems.TUMBAGA_NUGGET.get());
                    output.accept(ModItems.WHITE_BRONZE_NUGGET.get());

                    output.accept(ModItems.AL_GA_NUGGET.get());
                    output.accept(ModItems.GALFENOL_NUGGET.get());
                    output.accept(ModItems.GALINSTAN_NUGGET.get());

                    output.accept(ModItems.COLORED_GOLD_NUGGET.get());
                    output.accept(ModItems.CROWN_GOLD_NUGGET.get());
                    output.accept(ModItems.ELECTRUM_NUGGET.get());
                    output.accept(ModItems.RHODITE_NUGGET.get());
                    output.accept(ModItems.ROSE_GOLD_NUGGET.get());
                    output.accept(ModItems.WHITE_GOLD_NUGGET.get());

                    output.accept(ModItems.ANTHRACITE_IRON_NUGGET.get());
                    output.accept(ModItems.BULAT_STEEL_NUGGET.get());
                    output.accept(ModItems.CAST_IRON_NUGGET.get());
                    output.accept(ModItems.CHROMOLY_NUGGET.get());
                    output.accept(ModItems.CRUCIBLE_STEEL_NUGGET.get());
                    output.accept(ModItems.DAMASCUS_STEEL_NUGGET.get());
                    output.accept(ModItems.DUCOL_NUGGET.get());
                    output.accept(ModItems.ELINVAR_NUGGET.get());
                    output.accept(ModItems.FERNICO_NUGGET.get());
                    output.accept(ModItems.FERROCHROMIUM_NUGGET.get());
                    output.accept(ModItems.FERROMAGNESIUM_NUGGET.get());
                    output.accept(ModItems.FERROMANGANESE_NUGGET.get());
                    output.accept(ModItems.FERROMOLYBDENUM_NUGGET.get());
                    output.accept(ModItems.FERRONICKEL_NUGGET.get());
                    output.accept(ModItems.FERROPHOSPHORUS_NUGGET.get());
                    output.accept(ModItems.FERROSILICON_NUGGET.get());
                    output.accept(ModItems.FERROTITANIUM_NUGGET.get());
                    output.accept(ModItems.FERROVANADIUM_NUGGET.get());
                    output.accept(ModItems.HIGHSPEED_STEEL_NUGGET.get());
                    output.accept(ModItems.HSLA_STEEL_NUGGET.get());
                    output.accept(ModItems.INVAR_NUGGET.get());
                    output.accept(ModItems.IRON_HYDRIDE_NUGGET.get());
                    output.accept(ModItems.KANTHAL_NUGGET.get());
                    output.accept(ModItems.KOVAR_NUGGET.get());
                    output.accept(ModItems.MARAGING_STEEL_NUGGET.get());
                    output.accept(ModItems.MUSHET_STEEL_NUGGET.get());
                    output.accept(ModItems.PIG_IRON_NUGGET.get());
                    output.accept(ModItems.REYNOLDS_FTO_NUGGET.get());
                    output.accept(ModItems.SILICON_STEEL_NUGGET.get());
                    output.accept(ModItems.SILVER_STEEL_NUGGET.get());
                    output.accept(ModItems.SPIEGELEISEN_NUGGET.get());
                    output.accept(ModItems.SPRING_STEEL_NUGGET.get());
                    output.accept(ModItems.STAINLESS_STEEL_NUGGET.get());
                    output.accept(ModItems.STABALLOY_NUGGET.get());
                    output.accept(ModItems.STEEL_NUGGET.get());
                    output.accept(ModItems.TOOL_STEEL_NUGGET.get());
                    output.accept(ModItems.WEATHERING_STEEL_NUGGET.get());
                    output.accept(ModItems.WOOTZ_STEEL_NUGGET.get());
                    output.accept(ModItems.WROUGHT_IRON_NUGGET.get());

                    output.accept(ModItems.MOLYBDOCHALKOS_NUGGET.get());
                    output.accept(ModItems.SOLDER_NUGGET.get());
                    output.accept(ModItems.TERNE_NUGGET.get());
                    output.accept(ModItems.TYPE_METAL_NUGGET.get());

                    output.accept(ModItems.ELEKTRON_NUGGET.get());
                    output.accept(ModItems.TMGALZN_NUGGET.get());

                    output.accept(ModItems.MNFZ_NUGGET.get());
                    output.accept(ModItems.MNSZ_NUGGET.get());

                    output.accept(ModItems.ZINC_AMALGAM_NUGGET.get());
                    output.accept(ModItems.ASHTADHATU_NUGGET.get());

                    output.accept(ModItems.ALUMEL_NUGGET.get());
                    output.accept(ModItems.BRIGHTRAY_NUGGET.get());
                    output.accept(ModItems.CHROMEL_NUGGET.get());
                    output.accept(ModItems.COIN_SILVER_NUGGET.get());
                    output.accept(ModItems.COPPER_NICKEL_NUGGET.get());
                    output.accept(ModItems.CUPRONICKEL_NUGGET.get());
                    output.accept(ModItems.GERMAN_SILVER_NUGGET.get());
                    output.accept(ModItems.HASTELLOY_NUGGET.get());
                    output.accept(ModItems.HAUSLER_NUGGET.get());
                    output.accept(ModItems.INCONEL_NUGGET.get());
                    output.accept(ModItems.INCONEL_SES_NUGGET.get());
                    output.accept(ModItems.MONEL_METAL_NUGGET.get());
                    output.accept(ModItems.MU_METAL_NUGGET.get());
                    output.accept(ModItems.NICKEL_CARBON_NUGGET.get());
                    output.accept(ModItems.NICKEL_HYDRIDE_NUGGET.get());
                    output.accept(ModItems.NICROSIL_NUGGET.get());
                    output.accept(ModItems.NIMONIC_NUGGET.get());
                    output.accept(ModItems.NISIL_NUGGET.get());
                    output.accept(ModItems.NITINOL_NUGGET.get());
                    output.accept(ModItems.PERMALLOY_NUGGET.get());
                    output.accept(ModItems.SUPERMALLOY_NUGGET.get());

                    output.accept(ModItems.KLI_NUGGET.get());
                    output.accept(ModItems.NAK_NUGGET.get());

                    output.accept(ModItems.PSEUDO_PALLADIUM_NUGGET.get());

                    output.accept(ModItems.SCANDIUM_HYDRIDE_NUGGET.get());

                    output.accept(ModItems.ARGENTIUM_STERLING_SILVER_NUGGET.get());
                    output.accept(ModItems.BRITANNIA_SILVER_NUGGET.get());
                    output.accept(ModItems.DORE_NUGGET.get());
                    output.accept(ModItems.DYMALLOY_NUGGET.get());
                    output.accept(ModItems.GOLOID_NUGGET.get());
                    output.accept(ModItems.PLATINUM_SILVER_NUGGET.get());
                    output.accept(ModItems.SHIBUICHI_NUGGET.get());
                    output.accept(ModItems.STERLING_SILVER_NUGGET.get());
                    output.accept(ModItems.TIBETAN_SILVER_NUGGET.get());

                    output.accept(ModItems.BABBITT_NUGGET.get());
                    output.accept(ModItems.BRITANNIUM_NUGGET.get());
                    output.accept(ModItems.PEWTER_NUGGET.get());
                    output.accept(ModItems.QUEENS_METAL_NUGGET.get());

                    output.accept(ModItems.BETA_C_NUGGET.get());
                    output.accept(ModItems.GUM_METAL_NUGGET.get());
                    output.accept(ModItems.SAL_FV_NUGGET.get());
                    output.accept(ModItems.TITANIUM_GOLD_NUGGET.get());
                    output.accept(ModItems.TITANIUM_HYDRIDE_NUGGET.get());
                    output.accept(ModItems.TITANIUM_NITRIDE_NUGGET.get());

                    output.accept(ModItems.ZIRCALOY_NUGGET.get());

                    output.accept(ModItems.AA_DUST.get());
                    output.accept(ModItems.AL_LI_DUST.get());
                    output.accept(ModItems.ALNICO_DUST.get());
                    output.accept(ModItems.ALUMINIUM_SCANDIUM_DUST.get());
                    output.accept(ModItems.BIRMABRIGHT_DUST.get());
                    output.accept(ModItems.DEVARDA_DUST.get());
                    output.accept(ModItems.DURALUMIN_DUST.get());
                    output.accept(ModItems.HIDUMINIUM_DUST.get());
                    output.accept(ModItems.HYDRONALIUM_DUST.get());
                    output.accept(ModItems.ITALMA_DUST.get());
                    output.accept(ModItems.MAGNALIUM_DUST.get());
                    output.accept(ModItems.MAGNOX_DUST.get());
                    output.accept(ModItems.NAMBE_DUST.get());
                    output.accept(ModItems.NITIAL_DUST.get());
                    output.accept(ModItems.SILUMIN_DUST.get());
                    output.accept(ModItems.Y_ALLOY_DUST.get());
                    output.accept(ModItems.ZAMAK_DUST.get());

                    output.accept(ModItems.LOCKALLOY_DUST.get());

                    output.accept(ModItems.BISMANOL_DUST.get());
                    output.accept(ModItems.CERROBEND_DUST.get());
                    output.accept(ModItems.CERROSAFE_DUST.get());
                    output.accept(ModItems.FIELDS_METAL_DUST.get());
                    output.accept(ModItems.ROSE_METAL_DUST.get());
                    output.accept(ModItems.WOODS_METAL_DUST.get());

                    output.accept(ModItems.CHROMIUM_HYDRIDE_DUST.get());
                    output.accept(ModItems.CRNISZWTI_DUST.get());
                    output.accept(ModItems.NICHROME_DUST.get());

                    output.accept(ModItems.ELGILOY_DUST.get());
                    output.accept(ModItems.MEGALLIUM_DUST.get());
                    output.accept(ModItems.STELLITE_DUST.get());
                    output.accept(ModItems.TALONITE_DUST.get());
                    output.accept(ModItems.ULTIMET_DUST.get());
                    output.accept(ModItems.VITALLIUM_DUST.get());

                    output.accept(ModItems.ALUMINIUM_BRONZE_DUST.get());
                    output.accept(ModItems.ARSENICAL_BRONZE_DUST.get());
                    output.accept(ModItems.ARSENICAL_COPPER_DUST.get());
                    output.accept(ModItems.BELL_METAL_DUST.get());
                    output.accept(ModItems.BERYLLIUM_COPPER_DUST.get());
                    output.accept(ModItems.BILLON_DUST.get());
                    output.accept(ModItems.BRASS_DUST.get());
                    output.accept(ModItems.BRONZE_DUST.get());
                    output.accept(ModItems.CALAMINE_BRASS_DUST.get());
                    output.accept(ModItems.CHINESE_SILVER_DUST.get());
                    output.accept(ModItems.CONSTANTAN_DUST.get());
                    output.accept(ModItems.COPPER_HYDRIDE_DUST.get());
                    output.accept(ModItems.COPPER_TUNGSTEN_DUST.get());
                    output.accept(ModItems.CORINTHIAN_BRONZE_DUST.get());
                    output.accept(ModItems.CUNIFE_DUST.get());
                    output.accept(ModItems.CUAG_DUST.get());
                    output.accept(ModItems.CYMBAL_ALLOY_DUST.get());
                    output.accept(ModItems.DUTCH_METAL_DUST.get());
                    output.accept(ModItems.FLORENTINE_BRONZE_DUST.get());
                    output.accept(ModItems.GILDING_METAL_DUST.get());
                    output.accept(ModItems.GLUCYDUR_DUST.get());
                    output.accept(ModItems.GUANIN_DUST.get());
                    output.accept(ModItems.GUN_METAL_DUST.get());
                    output.accept(ModItems.HEPATIZON_DUST.get());
                    output.accept(ModItems.MANGANIN_DUST.get());
                    output.accept(ModItems.MELCHIOR_DUST.get());
                    output.accept(ModItems.MUNTZ_METAL_DUST.get());
                    output.accept(ModItems.NICKEL_SILVER_DUST.get());
                    output.accept(ModItems.NORDIC_GOLD_DUST.get());
                    output.accept(ModItems.ORMOLU_DUST.get());
                    output.accept(ModItems.PHOSPHOR_BRONZE_DUST.get());
                    output.accept(ModItems.PINCHBECK_DUST.get());
                    output.accept(ModItems.PRINCES_METAL_DUST.get());
                    output.accept(ModItems.SHAKUDO_DUST.get());
                    output.accept(ModItems.SILICON_BRONZE_DUST.get());
                    output.accept(ModItems.SPECULUM_METAL_DUST.get());
                    output.accept(ModItems.TOMBAC_DUST.get());
                    output.accept(ModItems.TUMBAGA_DUST.get());
                    output.accept(ModItems.WHITE_BRONZE_DUST.get());

                    output.accept(ModItems.AL_GA_DUST.get());
                    output.accept(ModItems.GALFENOL_DUST.get());
                    output.accept(ModItems.GALINSTAN_DUST.get());

                    output.accept(ModItems.COLORED_GOLD_DUST.get());
                    output.accept(ModItems.CROWN_GOLD_DUST.get());
                    output.accept(ModItems.ELECTRUM_DUST.get());
                    output.accept(ModItems.RHODITE_DUST.get());
                    output.accept(ModItems.ROSE_GOLD_DUST.get());
                    output.accept(ModItems.WHITE_GOLD_DUST.get());

                    output.accept(ModItems.ANTHRACITE_IRON_DUST.get());
                    output.accept(ModItems.BULAT_STEEL_DUST.get());
                    output.accept(ModItems.CAST_IRON_DUST.get());
                    output.accept(ModItems.CHROMOLY_DUST.get());
                    output.accept(ModItems.CRUCIBLE_STEEL_DUST.get());
                    output.accept(ModItems.DAMASCUS_STEEL_DUST.get());
                    output.accept(ModItems.DUCOL_DUST.get());
                    output.accept(ModItems.ELINVAR_DUST.get());
                    output.accept(ModItems.FERNICO_DUST.get());
                    output.accept(ModItems.FERROCHROMIUM_DUST.get());
                    output.accept(ModItems.FERROMAGNESIUM_DUST.get());
                    output.accept(ModItems.FERROMANGANESE_DUST.get());
                    output.accept(ModItems.FERROMOLYBDENUM_DUST.get());
                    output.accept(ModItems.FERRONICKEL_DUST.get());
                    output.accept(ModItems.FERROPHOSPHORUS_DUST.get());
                    output.accept(ModItems.FERROSILICON_DUST.get());
                    output.accept(ModItems.FERROTITANIUM_DUST.get());
                    output.accept(ModItems.FERROVANADIUM_DUST.get());
                    output.accept(ModItems.HIGHSPEED_STEEL_DUST.get());
                    output.accept(ModItems.HSLA_STEEL_DUST.get());
                    output.accept(ModItems.INVAR_DUST.get());
                    output.accept(ModItems.IRON_HYDRIDE_DUST.get());
                    output.accept(ModItems.KANTHAL_DUST.get());
                    output.accept(ModItems.KOVAR_DUST.get());
                    output.accept(ModItems.MARAGING_STEEL_DUST.get());
                    output.accept(ModItems.MUSHET_STEEL_DUST.get());
                    output.accept(ModItems.PIG_IRON_DUST.get());
                    output.accept(ModItems.REYNOLDS_FTO_DUST.get());
                    output.accept(ModItems.SILICON_STEEL_DUST.get());
                    output.accept(ModItems.SILVER_STEEL_DUST.get());
                    output.accept(ModItems.SPIEGELEISEN_DUST.get());
                    output.accept(ModItems.SPRING_STEEL_DUST.get());
                    output.accept(ModItems.STAINLESS_STEEL_DUST.get());
                    output.accept(ModItems.STABALLOY_DUST.get());
                    output.accept(ModItems.STEEL_DUST.get());
                    output.accept(ModItems.TOOL_STEEL_DUST.get());
                    output.accept(ModItems.WEATHERING_STEEL_DUST.get());
                    output.accept(ModItems.WOOTZ_STEEL_DUST.get());
                    output.accept(ModItems.WROUGHT_IRON_DUST.get());

                    output.accept(ModItems.MOLYBDOCHALKOS_DUST.get());
                    output.accept(ModItems.SOLDER_DUST.get());
                    output.accept(ModItems.TERNE_DUST.get());
                    output.accept(ModItems.TYPE_METAL_DUST.get());

                    output.accept(ModItems.ELEKTRON_DUST.get());
                    output.accept(ModItems.TMGALZN_DUST.get());

                    output.accept(ModItems.MNFZ_DUST.get());
                    output.accept(ModItems.MNSZ_DUST.get());

                    output.accept(ModItems.ZINC_AMALGAM_DUST.get());
                    output.accept(ModItems.ASHTADHATU_DUST.get());

                    output.accept(ModItems.ALUMEL_DUST.get());
                    output.accept(ModItems.BRIGHTRAY_DUST.get());
                    output.accept(ModItems.CHROMEL_DUST.get());
                    output.accept(ModItems.COIN_SILVER_DUST.get());
                    output.accept(ModItems.COPPER_NICKEL_DUST.get());
                    output.accept(ModItems.CUPRONICKEL_DUST.get());
                    output.accept(ModItems.GERMAN_SILVER_DUST.get());
                    output.accept(ModItems.HASTELLOY_DUST.get());
                    output.accept(ModItems.HAUSLER_DUST.get());
                    output.accept(ModItems.INCONEL_DUST.get());
                    output.accept(ModItems.INCONEL_SES_DUST.get());
                    output.accept(ModItems.MONEL_METAL_DUST.get());
                    output.accept(ModItems.MU_METAL_DUST.get());
                    output.accept(ModItems.NICKEL_CARBON_DUST.get());
                    output.accept(ModItems.NICKEL_HYDRIDE_DUST.get());
                    output.accept(ModItems.NICROSIL_DUST.get());
                    output.accept(ModItems.NIMONIC_DUST.get());
                    output.accept(ModItems.NISIL_DUST.get());
                    output.accept(ModItems.NITINOL_DUST.get());
                    output.accept(ModItems.PERMALLOY_DUST.get());
                    output.accept(ModItems.SUPERMALLOY_DUST.get());

                    output.accept(ModItems.KLI_DUST.get());
                    output.accept(ModItems.NAK_DUST.get());

                    output.accept(ModItems.PSEUDO_PALLADIUM_DUST.get());

                    output.accept(ModItems.SCANDIUM_HYDRIDE_DUST.get());

                    output.accept(ModItems.ARGENTIUM_STERLING_SILVER_DUST.get());
                    output.accept(ModItems.BRITANNIA_SILVER_DUST.get());
                    output.accept(ModItems.DORE_DUST.get());
                    output.accept(ModItems.DYMALLOY_DUST.get());
                    output.accept(ModItems.GOLOID_DUST.get());
                    output.accept(ModItems.PLATINUM_SILVER_DUST.get());
                    output.accept(ModItems.SHIBUICHI_DUST.get());
                    output.accept(ModItems.STERLING_SILVER_DUST.get());
                    output.accept(ModItems.TIBETAN_SILVER_DUST.get());

                    output.accept(ModItems.BABBITT_DUST.get());
                    output.accept(ModItems.BRITANNIUM_DUST.get());
                    output.accept(ModItems.PEWTER_DUST.get());
                    output.accept(ModItems.QUEENS_METAL_DUST.get());

                    output.accept(ModItems.BETA_C_DUST.get());
                    output.accept(ModItems.GUM_METAL_DUST.get());
                    output.accept(ModItems.SAL_FV_DUST.get());
                    output.accept(ModItems.TITANIUM_GOLD_DUST.get());
                    output.accept(ModItems.TITANIUM_HYDRIDE_DUST.get());
                    output.accept(ModItems.TITANIUM_NITRIDE_DUST.get());

                    output.accept(ModItems.ZIRCALOY_DUST.get());
                }).build());

    public static final Supplier<CreativeModeTab> HOPLOLOGY_TAB = CREATIVE_MODE_TAB.register("hoplology_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_SWORD.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "alloys_tab"))
                    .withTabsAfter(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "nature_tab"))
                    .title(Component.translatable("creativetab.megalosmod.hoplology_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Aluminium
                        output.accept(ModItems.ALUMINIUM_SWORD.get());
                        output.accept(ModItems.ALUMINIUM_PICKAXE.get());
                        output.accept(ModItems.ALUMINIUM_SHOVEL.get());
                        output.accept(ModItems.ALUMINIUM_AXE.get());
                        output.accept(ModItems.ALUMINIUM_HOE.get());

                        //Silver
                        output.accept(ModItems.SILVER_SWORD.get());
                        output.accept(ModItems.SILVER_PICKAXE.get());
                        output.accept(ModItems.SILVER_SHOVEL.get());
                        output.accept(ModItems.SILVER_AXE.get());
                        output.accept(ModItems.SILVER_HOE.get());

                        //Titanium
                        output.accept(ModItems.TITANIUM_SWORD.get());
                        output.accept(ModItems.TITANIUM_PICKAXE.get());
                        output.accept(ModItems.TITANIUM_SHOVEL.get());
                        output.accept(ModItems.TITANIUM_AXE.get());
                        output.accept(ModItems.TITANIUM_HOE.get());

                        //Armour
                        //Parts
                        output.accept(ModItems.ALUMINIUM_AXEHEAD.get());
                        output.accept(ModItems.ALUMINIUM_BLADE.get());
                        output.accept(ModItems.ALUMINIUM_GUARD.get());
                        output.accept(ModItems.ALUMINIUM_HILT.get());
                        output.accept(ModItems.ALUMINIUM_SHOVELHEAD.get());
                        output.accept(ModItems.ALUMINIUM_POMMEL.get());
                        output.accept(ModItems.ALUMINIUM_PICK.get());
                        output.accept(ModItems.ALUMINIUM_PLATE.get());

                        output.accept(ModItems.SILVER_AXEHEAD.get());
                        output.accept(ModItems.SILVER_BLADE.get());
                        output.accept(ModItems.SILVER_GUARD.get());
                        output.accept(ModItems.SILVER_HILT.get());
                        output.accept(ModItems.SILVER_SHOVELHEAD.get());
                        output.accept(ModItems.SILVER_POMMEL.get());
                        output.accept(ModItems.SILVER_PICK.get());
                        output.accept(ModItems.SILVER_PLATE.get());

                        output.accept(ModItems.TITANIUM_AXEHEAD.get());
                        output.accept(ModItems.TITANIUM_BLADE.get());
                        output.accept(ModItems.TITANIUM_GUARD.get());
                        output.accept(ModItems.TITANIUM_HILT.get());
                        output.accept(ModItems.TITANIUM_SHOVELHEAD.get());
                        output.accept(ModItems.TITANIUM_POMMEL.get());
                        output.accept(ModItems.TITANIUM_PICK.get());
                        output.accept(ModItems.TITANIUM_PLATE.get());

                        output.accept(ModItems.FABRIC_GRIP.get());
                        output.accept(ModItems.FABRIC_STRAP.get());
                        output.accept(ModItems.ARMOUR_PADDING.get());

                        output.accept(ModItems.ALUMINIUM_HELMET.get());
                        output.accept(ModItems.ALUMINIUM_CHESTPLATE.get());
                        output.accept(ModItems.ALUMINIUM_LEGGINGS.get());
                        output.accept(ModItems.ALUMINIUM_BOOTS.get());

                        output.accept(ModItems.SILVER_HELMET.get());
                        output.accept(ModItems.SILVER_CHESTPLATE.get());
                        output.accept(ModItems.SILVER_LEGGINGS.get());
                        output.accept(ModItems.SILVER_BOOTS.get());

                        output.accept(ModItems.TITANIUM_HELMET.get());
                        output.accept(ModItems.TITANIUM_CHESTPLATE.get());
                        output.accept(ModItems.TITANIUM_LEGGINGS.get());
                        output.accept(ModItems.TITANIUM_BOOTS.get());
                    }).build());

    public static final Supplier<CreativeModeTab> NATURE_CROPS_TAB = CREATIVE_MODE_TAB.register("nature_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BHUT_JOLOKIA_CHILLI_SEEDS.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "hoplology_tab"))
                    .withTabsAfter(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "technology_tab"))
                    .title(Component.translatable("creativetab.megalosmod.nature_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Nature - Tree
                        //Log
                        output.accept(ModBlocks.BLACK_ASH_LOG.get());
                        output.accept(ModBlocks.MAPLE_SVCAMORE_LOG.get());

                        //Wood
                        output.accept(ModBlocks.MAPLE_SYCAMORE_WOOD.get());
                        output.accept(ModBlocks.BLACK_ASH_WOOD.get());

                        //Stripped Log
                        output.accept(ModBlocks.STRIPPED_BLACK_ASH_LOG.get());
                        output.accept(ModBlocks.STRIPPED_MAPLE_SYCAMORE_LOG.get());

                        //Stripped Wood
                        output.accept(ModBlocks.STRIPPED_BLACK_ASH_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_MAPLE_SYCAMORE_WOOD.get());

                        //Planks
                        output.accept(ModBlocks.BLACK_ASH_PLANKS.get());
                        output.accept(ModBlocks.MAPLE_SYCAMORE_PLANKS.get());

                        //Sapling
                        output.accept(ModBlocks.BLACK_ASH_SAPLING.get());
                        output.accept(ModBlocks.MAPLE_SYCAMORE_SAPLING.get());

                        //Leaves
                        output.accept(ModBlocks.BLACK_ASH_LEAVES.get());
                        output.accept(ModBlocks.MAPLE_SYCAMORE_LEAVES.get());

                        //Nature - Bush
                        output.accept(ModItems.GOOSEBERRY_BERRIES);

                        //Nature - Seeds
                        output.accept(ModItems.BHUT_JOLOKIA_CHILLI_SEEDS);
                        output.accept(ModItems.BIRDS_EYE_CHILLI_SEEDS);
                        output.accept(ModItems.CAROLINA_REAPER_CHILLI_SEEDS);
                        output.accept(ModItems.CAYENNE_CHILLI_SEEDS);
                        output.accept(ModItems.HABANERO_CHILLI_SEEDS);
                        output.accept(ModItems.JALAPENO_CHILLI_SEEDS);
                        output.accept(ModItems.NAGA_GHOST_CHILLI_SEEDS);
                        output.accept(ModItems.PADRON_CHILLI_SEEDS);
                        output.accept(ModItems.POBLANO_CHILLI_SEEDS);
                        output.accept(ModItems.SCOTCH_BONNET_CHILLI_SEEDS);
                        output.accept(ModItems.SILING_LABUYO_CHILLI_SEEDS);
                        output.accept(ModItems.TABASCO_CHILLI_SEEDS);
                        output.accept(ModItems.TRINIDAD_SCORPION_CHILLI_SEEDS);

                        //Nature - Crop
                        output.accept(ModItems.BHUT_JOLOKIA_CHILLI);
                        output.accept(ModItems.BIRDS_EYE_CHILLI);
                        output.accept(ModItems.CAROLINA_REAPER_CHILLI);
                        output.accept(ModItems.CAYENNE_CHILLI);
                        output.accept(ModItems.HABANERO_CHILLI);
                        output.accept(ModItems.JALAPENO_CHILLI);
                        output.accept(ModItems.NAGA_GHOST_CHILLI);
                        output.accept(ModItems.PADRON_CHILLI);
                        output.accept(ModItems.POBLANO_CHILLI);
                        output.accept(ModItems.SCOTCH_BONNET_CHILLI);
                        output.accept(ModItems.SILING_LABUYO_CHILLI);
                        output.accept(ModItems.TABASCO_CHILLI);
                        output.accept(ModItems.TRINIDAD_SCORPION_CHILLI);
                    }).build());

    public static final Supplier<CreativeModeTab> TECHNOLOGY_TAB = CREATIVE_MODE_TAB.register("technology_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PEDESTAL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "nature_tab"))
                    .withTabsAfter(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "gastronomy_tab"))
                    .title(Component.translatable("creativetab.megalosmod.technology_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Tech - Block
                        output.accept(ModBlocks.PEDESTAL.get());
                    }).build());

    public static final Supplier<CreativeModeTab> GASTRONOMY_TAB = CREATIVE_MODE_TAB.register("gastronomy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BEEF_CARCASS.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "technology_tab"))
                    .title(Component.translatable("creativetab.megalosmod.gastronomy_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Beef
                        output.accept(ModItems.BEEF_CARCASS.get());
                        output.accept(ModItems.BEEF_BRISKET.get());
                        output.accept(ModItems.BEEF_CHUCK.get());
                        output.accept(ModItems.BEEF_FLANK.get());
                        output.accept(ModItems.BEEF_LOIN.get());
                        output.accept(ModItems.BEEF_PLATE.get());
                        output.accept(ModItems.BEEF_RIB.get());
                        output.accept(ModItems.BEEF_ROUND.get());
                        output.accept(ModItems.BEEF_SHANK.get());

                        //Mutton
                        output.accept(ModItems.MUTTON_CARCASS.get());
                        output.accept(ModItems.MUTTON_BREAST.get());
                        output.accept(ModItems.MUTTON_LEG.get());
                        output.accept(ModItems.MUTTON_LOIN.get());
                        output.accept(ModItems.MUTTON_NECK.get());
                        output.accept(ModItems.MUTTON_SHANK.get());
                        output.accept(ModItems.MUTTON_SHOULDER.get());

                        //Pork
                        output.accept(ModItems.PORK_CARCASS.get());
                        output.accept(ModItems.PORK_BELLY.get());
                        output.accept(ModItems.PORK_LEG.get());
                        output.accept(ModItems.PORK_LOIN.get());
                        output.accept(ModItems.PORK_SHOULDER.get());

                        //Chicken
                        output.accept(ModItems.CHICKEN_LEG.get());
                        output.accept(ModItems.CHICKEN_BREAST.get());
                        output.accept(ModItems.CHICKEN_WING.get());
                        output.accept(ModItems.CHICKEN_THIGH.get());
                        output.accept(ModItems.CHICKEN_DRUMSTICK.get());

                        //Horse
                        output.accept(ModItems.HORSE_CARCASS.get());
                        output.accept(ModItems.HORSE_BREAST.get());
                        output.accept(ModItems.HORSE_FLANK.get());
                        output.accept(ModItems.HORSE_LEG.get());
                        output.accept(ModItems.HORSE_LOIN.get());
                        output.accept(ModItems.HORSE_PLATE.get());
                        output.accept(ModItems.HORSE_RIB.get());
                        output.accept(ModItems.HORSE_ROUND.get());
                        output.accept(ModItems.HORSE_RUMP.get());
                        output.accept(ModItems.HORSE_SHOULDER.get());

                        //Frog
                        output.accept(ModItems.FROG_CARCASS.get());
                        output.accept(ModItems.FROG_LEGS.get());

                        //Goat
                        output.accept(ModItems.GOAT_CARCASS.get());
                        output.accept(ModItems.GOAT_BREAST.get());
                        output.accept(ModItems.GOAT_FLANK.get());
                        output.accept(ModItems.GOAT_LEG.get());
                        output.accept(ModItems.GOAT_LOIN.get());
                        output.accept(ModItems.GOAT_NECK.get());
                        output.accept(ModItems.GOAT_RACK.get());
                        output.accept(ModItems.GOAT_SHANK.get());
                        output.accept(ModItems.GOAT_SHOULDER.get());

                        //Squid
                        output.accept(ModItems.SQUID_CARCASS.get());
                        output.accept(ModItems.SQUID_INK.get());
                        output.accept(ModItems.SQUID_MANTLE.get());
                        output.accept(ModItems.SQUID_TENTACLES.get());

                        //Turtle
                        output.accept(ModItems.TURTLE_CARCASS.get());
                        output.accept(ModItems.TURTLE_BACK.get());
                        output.accept(ModItems.TURTLE_LEG.get());
                        output.accept(ModItems.TURTLE_NECK.get());
                        output.accept(ModItems.TURTLE_TAIL.get());

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
