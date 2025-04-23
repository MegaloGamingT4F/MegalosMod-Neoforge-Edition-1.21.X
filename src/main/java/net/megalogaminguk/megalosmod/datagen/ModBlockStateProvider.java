package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

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