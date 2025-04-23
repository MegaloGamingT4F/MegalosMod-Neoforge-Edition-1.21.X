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

public class ModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MegalosMod.MOD_ID);

    public static final Supplier<CreativeModeTab> METALLURGY_CORE_TAB = CREATIVE_MODE_TAB.register("metallurgy_core_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALUMINIUM_ORE))
                    .title(Component.translatable("creativetab.megalosmod.metallurgy_core_tab"))
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
                        output.accept(ModItems.CADMIUM_DUST.get());
                        output.accept(ModItems.CAESIUM_INGOT.get());
                        output.accept(ModItems.CALCIUM_INGOT.get());
                        output.accept(ModItems.CHROMIUM_INGOT.get());

                        output.accept(ModItems.CINNABAR_INGOT.get());
                        output.accept(ModItems.COBALT_INGOT.get());
                        output.accept(ModItems.GALLIUM_DUST.get());
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
                        output.accept(ModItems.CADMIUM_DUST.get());
                        output.accept(ModItems.CAESIUM_NUGGET.get());
                        output.accept(ModItems.CALCIUM_NUGGET.get());
                        output.accept(ModItems.CHROMIUM_NUGGET.get());

                        output.accept(ModItems.CINNABAR_NUGGET.get());
                        output.accept(ModItems.COBALT_NUGGET.get());
                        output.accept(ModItems.GALLIUM_DUST.get());
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
                        output.accept(ModItems.COBALT_DUST.get());
                        output.accept(ModItems.COPPER_DUST.get());
                        output.accept(ModItems.GALLIUM_DUST.get());
                        output.accept(ModItems.GERMANIUM_DUST.get());

                        output.accept(ModItems.HAFNIUM_DUST.get());
                        output.accept(ModItems.INDIUM_DUST.get());
                        output.accept(ModItems.IRIDIUM_DUST.get());
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

    public static final Supplier<CreativeModeTab> METALLURGY_ALLOYS_TAB = CREATIVE_MODE_TAB.register("metallurgy_alloys_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AA_INGOT.get()))
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "metallurgy_core_tab"))
                .title(Component.translatable("creativetab.megalosmod.metallurgy_alloys_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    //Block

                    //Item
                    output.accept(ModItems.AA_INGOT);
                    output.accept(ModItems.AA_NUGGET);
                    output.accept(ModItems.AA_DUST);
                }).build());

    public static final Supplier<CreativeModeTab> HOPLOLOGY_TAB = CREATIVE_MODE_TAB.register("hoplology_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FABRIC_GRIP.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "metallurgy_alloys_tab"))
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

    public static final Supplier<CreativeModeTab> NATURE_CROPS_TAB = CREATIVE_MODE_TAB.register("nature_crops_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "hoplology_tab"))
                    .title(Component.translatable("creativetab.megalosmod.nature_crops_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Block

                        //Item
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
