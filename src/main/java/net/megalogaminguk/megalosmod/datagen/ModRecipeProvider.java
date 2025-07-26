package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> ALUMINIUM_SMELTABLES = List.of(ModItems.RAW_ALUMINIUM.get(),
                ModBlocks.ALUMINIUM_ORE.get());
        List<ItemLike> ANTIMONY_SMELTABLES = List.of(ModItems.RAW_ANTIMONY.get(),
                ModBlocks.ANTIMONY_ORE.get());
        List<ItemLike> ARSENIC_SMELTABLES = List.of(ModItems.RAW_ARSENIC.get(),
                ModBlocks.ARSENIC_ORE.get());
        List<ItemLike> BARIUM_SMELTABLES = List.of(ModItems.RAW_BARIUM.get(),
                ModBlocks.BARIUM_ORE.get());
        List<ItemLike> BERYLLIUM_SMELTABLES = List.of(ModItems.RAW_BERYLLIUM.get(),
                ModBlocks.BERYLLIUM_ORE.get());
        List<ItemLike> BISMUTH_SMELTABLES = List.of(ModItems.RAW_BISMUTH.get(),
                ModBlocks.BISMUTH_ORE.get());
        List<ItemLike> CADMIUM_SMELTABLES = List.of(ModItems.RAW_CADMIUM.get(),
                ModBlocks.CADMIUM_ORE.get());
        List<ItemLike> CAESIUM_SMELTABLES = List.of(ModItems.RAW_CAESIUM.get(),
                ModBlocks.CAESIUM_ORE.get());
        List<ItemLike> CALCIUM_SMELTABLES = List.of(ModItems.RAW_CALCIUM.get(),
                ModBlocks.CALCIUM_ORE.get());
        List<ItemLike> CHROMIUM_SMELTABLES = List.of(ModItems.RAW_CHROMIUM.get(),
                ModBlocks.CHROMIUM_ORE.get());
        List<ItemLike> CINNABAR_SMELTABLES = List.of(ModItems.RAW_CINNABAR.get(),
                ModBlocks.CINNABAR_ORE.get());
        List<ItemLike> COBALT_SMELTABLES = List.of(ModItems.RAW_COBALT.get(),
                ModBlocks.COBALT_ORE.get());
        List<ItemLike> GALLIUM_SMELTABLES = List.of(ModItems.RAW_GALLIUM.get(),
                ModBlocks.GALLIUM_ORE.get());
        List<ItemLike> GERMANIUM_SMELTABLES = List.of(ModItems.RAW_GERMANIUM.get(),
                ModBlocks.GERMANIUM_ORE.get());
        List<ItemLike> HAFNIUM_SMELTABLES = List.of(ModItems.RAW_HAFNIUM.get(),
                ModBlocks.HAFNIUM_ORE.get());
        List<ItemLike> INDIUM_SMELTABLES = List.of(ModItems.RAW_INDIUM.get(),
                ModBlocks.INDIUM_ORE.get());
        List<ItemLike> IRIDIUM_SMELTABLES = List.of(ModItems.RAW_IRIDIUM.get(),
                ModBlocks.IRIDIUM_ORE.get());
        List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD.get(),
                ModBlocks.LEAD_ORE.get());
        List<ItemLike> LITHIUM_SMELTABLES = List.of(ModItems.RAW_LITHIUM.get(),
                ModBlocks.LITHIUM_ORE.get());
        List<ItemLike> MAGNESIUM_SMELTABLES = List.of(ModItems.RAW_MAGNESIUM.get(),
                ModBlocks.MAGNESIUM_ORE.get());
        List<ItemLike> MANGANESE_SMELTABLES = List.of(ModItems.RAW_MANGANESE.get(),
                ModBlocks.MANGANESE_ORE.get());
        List<ItemLike> MOLYBDENUM_SMELTABLES = List.of(ModItems.RAW_MOLYBDENUM.get(),
                ModBlocks.MOLYBDENUM_ORE.get());
        List<ItemLike> NICKEL_SMELTABLES = List.of(ModItems.RAW_NICKEL.get(),
                ModBlocks.NICKEL_ORE.get());
        List<ItemLike> NIOBIUM_SMELTABLES = List.of(ModItems.RAW_NIOBIUM.get(),
                ModBlocks.NIOBIUM_ORE.get());
        List<ItemLike> OSMIUM_SMELTABLES = List.of(ModItems.RAW_OSMIUM.get(),
                ModBlocks.OSMIUM_ORE.get());
        List<ItemLike> PALLADIUM_SMELTABLES = List.of(ModItems.RAW_PALLADIUM.get(),
                ModBlocks.PALLADIUM_ORE.get());
        List<ItemLike> PHOSPHORUS_SMELTABLES = List.of(ModItems.RAW_PHOSPHORUS.get(),
                ModBlocks.PHOSPHORUS_ORE.get());
        List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM.get(),
                ModBlocks.PLATINUM_ORE.get());
        List<ItemLike> POTASSIUM_SMELTABLES = List.of(ModItems.RAW_POTASSIUM.get(),
                ModBlocks.POTASSIUM_ORE.get());
        List<ItemLike> RHENIUM_SMELTABLES = List.of(ModItems.RAW_RHENIUM.get(),
                ModBlocks.RHENIUM_ORE.get());
        List<ItemLike> RHODIUM_SMELTABLES = List.of(ModItems.RAW_RHODIUM.get(),
                ModBlocks.RHODIUM_ORE.get());
        List<ItemLike> RUBIDIUM_SMELTABLES = List.of(ModItems.RAW_RUBIDIUM.get(),
                ModBlocks.RUBIDIUM_ORE.get());
        List<ItemLike> RUTHENIUM_SMELTABLES = List.of(ModItems.RAW_RUTHENIUM.get(),
                ModBlocks.RUTHENIUM_ORE.get());
        List<ItemLike> SCANDIUM_SMELTABLES = List.of(ModItems.RAW_SCANDIUM.get(),
                ModBlocks.SCANDIUM_ORE.get());
        List<ItemLike> SELENIUM_SMELTABLES = List.of(ModItems.RAW_SELENIUM.get(),
                ModBlocks.SELENIUM_ORE.get());
        List<ItemLike> SILICON_SMELTABLES = List.of(ModItems.RAW_SILICON.get(),
                ModBlocks.SILICON_ORE.get());
        List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER.get(),
                ModBlocks.SILVER_ORE.get());
        List<ItemLike> SODIUM_SMELTABLES = List.of(ModItems.RAW_SODIUM.get(),
                ModBlocks.SODIUM_ORE.get());
        List<ItemLike> STRONTIUM_SMELTABLES = List.of(ModItems.RAW_STRONTIUM.get(),
                ModBlocks.STRONTIUM_ORE.get());
        List<ItemLike> TANTALUM_SMELTABLES = List.of(ModItems.RAW_TANTALUM.get(),
                ModBlocks.TANTALUM_ORE.get());
        List<ItemLike> TECHNETIUM_SMELTABLES = List.of(ModItems.RAW_TECHNETIUM.get(),
                ModBlocks.TECHNETIUM_ORE.get());
        List<ItemLike> TELLURIUM_SMELTABLES = List.of(ModItems.RAW_TELLURIUM.get(),
                ModBlocks.TELLURIUM_ORE.get());
        List<ItemLike> THALLIUM_SMELTABLES = List.of(ModItems.RAW_THALLIUM.get(),
                ModBlocks.THALLIUM_ORE.get());
        List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN.get(),
                ModBlocks.TIN_ORE.get());
        List<ItemLike> TITANIUM_SMELTABLES = List.of(ModItems.RAW_TITANIUM.get(),
                ModBlocks.TITANIUM_ORE.get());
        List<ItemLike> TUNGSTEN_SMELTABLES = List.of(ModItems.RAW_TUNGSTEN.get(),
                ModBlocks.TUNGSTEN_ORE.get());
        List<ItemLike> VANADIUM_SMELTABLES = List.of(ModItems.RAW_VANADIUM.get(),
                ModBlocks.VANADIUM_ORE.get());
        List<ItemLike> YTTRIUM_SMELTABLES = List.of(ModItems.RAW_YTTRIUM.get(),
                ModBlocks.YTTRIUM_ORE.get());
        List<ItemLike> ZINC_SMELTABLES = List.of(ModItems.RAW_ZINC.get(),
                ModBlocks.ZINC_ORE.get());
        List<ItemLike> ZIRCONIUM_SMELTABLES = List.of(ModItems.RAW_ZIRCONIUM.get(),
                ModBlocks.ZIRCONIUM_ORE.get());

        //Shaped Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMINIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ALUMINIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_ALUMINIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_ALUMINIUM.get()), has(ModItems.RAW_ALUMINIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ALUMINIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_NUGGET.get()), has(ModItems.ALUMINIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ALUMINIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_DUST.get()), has(ModItems.ALUMINIUM_DUST.get()))
                .save(pRecipeOutput);

        //Antimony
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ANTIMONY_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ANTIMONY_INGOT.get())
                .unlockedBy(getHasName(ModItems.ANTIMONY_INGOT.get()), has(ModItems.ANTIMONY_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ANTIMONY_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_ANTIMONY.get())
                .unlockedBy(getHasName(ModItems.RAW_ANTIMONY.get()), has(ModItems.RAW_ANTIMONY.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANTIMONY_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ANTIMONY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ANTIMONY_NUGGET.get()), has(ModItems.ANTIMONY_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANTIMONY_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ANTIMONY_DUST.get())
                .unlockedBy(getHasName(ModItems.ANTIMONY_DUST.get()), has(ModItems.ANTIMONY_DUST.get()))
                .save(pRecipeOutput);

        //Arsenic
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ARSENIC_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ARSENIC_INGOT.get())
                .unlockedBy(getHasName(ModItems.ARSENIC_INGOT.get()), has(ModItems.ARSENIC_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ARSENIC_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_ARSENIC.get())
                .unlockedBy(getHasName(ModItems.RAW_ARSENIC.get()), has(ModItems.RAW_ARSENIC.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARSENIC_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ARSENIC_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ARSENIC_NUGGET.get()), has(ModItems.ARSENIC_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARSENIC_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ARSENIC_DUST.get())
                .unlockedBy(getHasName(ModItems.ARSENIC_DUST.get()), has(ModItems.ARSENIC_DUST.get()))
                .save(pRecipeOutput);

        //Beryllium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BERYLLIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BERYLLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_INGOT.get()), has(ModItems.BERYLLIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_BERYLLIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_BERYLLIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_BERYLLIUM.get()), has(ModItems.RAW_BERYLLIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BERYLLIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BERYLLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_NUGGET.get()), has(ModItems.BERYLLIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BERYLLIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BERYLLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_DUST.get()), has(ModItems.BERYLLIUM_DUST.get()))
                .save(pRecipeOutput);

        //Barium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BARIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BARIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.BARIUM_INGOT.get()), has(ModItems.BARIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_BARIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_BARIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_BARIUM.get()), has(ModItems.RAW_BARIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BARIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BARIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BARIUM_NUGGET.get()), has(ModItems.BARIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BARIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BARIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.BARIUM_DUST.get()), has(ModItems.BARIUM_DUST.get()))
                .save(pRecipeOutput);

        //Bismuth
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BISMUTH_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BISMUTH_INGOT.get())
                .unlockedBy(getHasName(ModItems.BISMUTH_INGOT.get()), has(ModItems.BISMUTH_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_BISMUTH_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_BISMUTH.get())
                .unlockedBy(getHasName(ModItems.RAW_BISMUTH.get()), has(ModItems.RAW_BISMUTH.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMUTH_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BISMUTH_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BISMUTH_NUGGET.get()), has(ModItems.BISMUTH_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMUTH_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.BISMUTH_DUST.get())
                .unlockedBy(getHasName(ModItems.BISMUTH_DUST.get()), has(ModItems.BISMUTH_DUST.get()))
                .save(pRecipeOutput);

        //Cadmium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CADMIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CADMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CADMIUM_INGOT.get()), has(ModItems.CADMIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_CADMIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_CADMIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_CADMIUM.get()), has(ModItems.RAW_CADMIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CADMIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CADMIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CADMIUM_NUGGET.get()), has(ModItems.CADMIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CADMIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CADMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.CADMIUM_DUST.get()), has(ModItems.CADMIUM_DUST.get()))
                .save(pRecipeOutput);

        //Caesium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CAESIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CAESIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CAESIUM_INGOT.get()), has(ModItems.CAESIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_CAESIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_CAESIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_CAESIUM.get()), has(ModItems.RAW_CAESIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CAESIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CAESIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CAESIUM_NUGGET.get()), has(ModItems.CAESIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CAESIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CAESIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.CAESIUM_DUST.get()), has(ModItems.CAESIUM_DUST.get()))
                .save(pRecipeOutput);

        //Calcium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CALCIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CALCIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CALCIUM_INGOT.get()), has(ModItems.CALCIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_CALCIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_CALCIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_CALCIUM.get()), has(ModItems.RAW_CALCIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CALCIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CALCIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CALCIUM_NUGGET.get()), has(ModItems.CALCIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CALCIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CALCIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.CALCIUM_DUST.get()), has(ModItems.CALCIUM_DUST.get()))
                .save(pRecipeOutput);

        //Chromium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHROMIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CHROMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_INGOT.get()), has(ModItems.CHROMIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_CHROMIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_CHROMIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_CHROMIUM.get()), has(ModItems.RAW_CHROMIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CHROMIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_NUGGET.get()), has(ModItems.CHROMIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_DUST.get()), has(ModItems.CHROMIUM_DUST.get()))
                .save(pRecipeOutput);

        //Cinnabar
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CINNABAR_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CINNABAR_INGOT.get())
                .unlockedBy(getHasName(ModItems.CINNABAR_INGOT.get()), has(ModItems.CINNABAR_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_CINNABAR_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_CINNABAR.get())
                .unlockedBy(getHasName(ModItems.RAW_CINNABAR.get()), has(ModItems.RAW_CINNABAR.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CINNABAR_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CINNABAR_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CINNABAR_NUGGET.get()), has(ModItems.CINNABAR_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CINNABAR_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.CINNABAR_DUST.get())
                .unlockedBy(getHasName(ModItems.CINNABAR_DUST.get()), has(ModItems.CINNABAR_DUST.get()))
                .save(pRecipeOutput);

        //Cobalt
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COBALT_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.COBALT_INGOT.get())
                .unlockedBy(getHasName(ModItems.COBALT_INGOT.get()), has(ModItems.COBALT_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_COBALT_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_COBALT.get())
                .unlockedBy(getHasName(ModItems.RAW_COBALT.get()), has(ModItems.RAW_COBALT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.COBALT_NUGGET.get())
                .unlockedBy(getHasName(ModItems.COBALT_NUGGET.get()), has(ModItems.COBALT_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COBALT_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.COBALT_DUST.get())
                .unlockedBy(getHasName(ModItems.COBALT_DUST.get()), has(ModItems.COBALT_DUST.get()))
                .save(pRecipeOutput);

        //Gallium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GALLIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.GALLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.GALLIUM_INGOT.get()), has(ModItems.GALLIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_GALLIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_GALLIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_GALLIUM.get()), has(ModItems.RAW_GALLIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GALLIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.GALLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GALLIUM_NUGGET.get()), has(ModItems.GALLIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GALLIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.GALLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.GALLIUM_DUST.get()), has(ModItems.GALLIUM_DUST.get()))
                .save(pRecipeOutput);

        //Germanium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GERMANIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.GERMANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.GERMANIUM_INGOT.get()), has(ModItems.GERMANIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_GERMANIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_GERMANIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_GERMANIUM.get()), has(ModItems.RAW_GERMANIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GERMANIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.GERMANIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GERMANIUM_NUGGET.get()), has(ModItems.GERMANIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GERMANIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.GERMANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.GERMANIUM_DUST.get()), has(ModItems.GERMANIUM_DUST.get()))
                .save(pRecipeOutput);

        //Hafnium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAFNIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.HAFNIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.HAFNIUM_INGOT.get()), has(ModItems.HAFNIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_HAFNIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_HAFNIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_HAFNIUM.get()), has(ModItems.RAW_HAFNIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HAFNIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.HAFNIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.HAFNIUM_NUGGET.get()), has(ModItems.HAFNIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HAFNIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.HAFNIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.HAFNIUM_DUST.get()), has(ModItems.HAFNIUM_DUST.get()))
                .save(pRecipeOutput);

        //Indium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.INDIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.INDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.INDIUM_INGOT.get()), has(ModItems.INDIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_INDIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_INDIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_INDIUM.get()), has(ModItems.RAW_INDIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INDIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.INDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.INDIUM_NUGGET.get()), has(ModItems.INDIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INDIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.INDIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.INDIUM_DUST.get()), has(ModItems.INDIUM_DUST.get()))
                .save(pRecipeOutput);

        //Iridium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IRIDIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.IRIDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.IRIDIUM_INGOT.get()), has(ModItems.IRIDIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_IRIDIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_IRIDIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_IRIDIUM.get()), has(ModItems.RAW_IRIDIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRIDIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.IRIDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.IRIDIUM_NUGGET.get()), has(ModItems.IRIDIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRIDIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.IRIDIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.IRIDIUM_DUST.get()), has(ModItems.IRIDIUM_DUST.get()))
                .save(pRecipeOutput);

        //Lead
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LEAD_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_LEAD_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_LEAD.get())
                .unlockedBy(getHasName(ModItems.RAW_LEAD.get()), has(ModItems.RAW_LEAD.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEAD_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.LEAD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.LEAD_NUGGET.get()), has(ModItems.LEAD_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEAD_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.LEAD_DUST.get())
                .unlockedBy(getHasName(ModItems.LEAD_DUST.get()), has(ModItems.LEAD_DUST.get()))
                .save(pRecipeOutput);

        //Lithium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LITHIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.LITHIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.LITHIUM_INGOT.get()), has(ModItems.LITHIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_LITHIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_LITHIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_LITHIUM.get()), has(ModItems.RAW_LITHIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LITHIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.LITHIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.LITHIUM_NUGGET.get()), has(ModItems.LITHIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LITHIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.LITHIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.LITHIUM_DUST.get()), has(ModItems.LITHIUM_DUST.get()))
                .save(pRecipeOutput);

        //Magnesium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGNESIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MAGNESIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.MAGNESIUM_INGOT.get()), has(ModItems.MAGNESIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_MAGNESIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_MAGNESIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_MAGNESIUM.get()), has(ModItems.RAW_MAGNESIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MAGNESIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MAGNESIUM_NUGGET.get()), has(ModItems.MAGNESIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGNESIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MAGNESIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MAGNESIUM_DUST.get()), has(ModItems.MAGNESIUM_DUST.get()))
                .save(pRecipeOutput);

        //Manganese
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGANESE_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MANGANESE_INGOT.get())
                .unlockedBy(getHasName(ModItems.MANGANESE_INGOT.get()), has(ModItems.MANGANESE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_MANGANESE_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_MANGANESE.get())
                .unlockedBy(getHasName(ModItems.RAW_MANGANESE.get()), has(ModItems.RAW_MANGANESE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MANGANESE_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MANGANESE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MANGANESE_NUGGET.get()), has(ModItems.MANGANESE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MANGANESE_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MANGANESE_DUST.get())
                .unlockedBy(getHasName(ModItems.MANGANESE_DUST.get()), has(ModItems.MANGANESE_DUST.get()))
                .save(pRecipeOutput);

        //Molybdenum
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOLYBDENUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MOLYBDENUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.MOLYBDENUM_INGOT.get()), has(ModItems.MOLYBDENUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_MOLYBDENUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_MOLYBDENUM.get())
                .unlockedBy(getHasName(ModItems.RAW_MOLYBDENUM.get()), has(ModItems.RAW_MOLYBDENUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOLYBDENUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MOLYBDENUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MOLYBDENUM_NUGGET.get()), has(ModItems.MOLYBDENUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOLYBDENUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.MOLYBDENUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MOLYBDENUM_DUST.get()), has(ModItems.MOLYBDENUM_DUST.get()))
                .save(pRecipeOutput);

        //Nickel
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NICKEL_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.NICKEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.NICKEL_INGOT.get()), has(ModItems.NICKEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_NICKEL_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_NICKEL.get())
                .unlockedBy(getHasName(ModItems.RAW_NICKEL.get()), has(ModItems.RAW_NICKEL.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.NICKEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NICKEL_NUGGET.get()), has(ModItems.NICKEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.NICKEL_DUST.get()), has(ModItems.NICKEL_DUST.get()))
                .save(pRecipeOutput);

        //Niobium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NIOBIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.NIOBIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.NIOBIUM_INGOT.get()), has(ModItems.NIOBIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_NIOBIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_NIOBIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_NIOBIUM.get()), has(ModItems.RAW_NIOBIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NIOBIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.NIOBIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NIOBIUM_NUGGET.get()), has(ModItems.NIOBIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NIOBIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.NIOBIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.NIOBIUM_DUST.get()), has(ModItems.NIOBIUM_DUST.get()))
                .save(pRecipeOutput);

        //Osmium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OSMIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.OSMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.OSMIUM_INGOT.get()), has(ModItems.OSMIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_OSMIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_OSMIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_OSMIUM.get()), has(ModItems.RAW_OSMIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.OSMIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.OSMIUM_NUGGET.get()), has(ModItems.OSMIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OSMIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.OSMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.OSMIUM_DUST.get()), has(ModItems.OSMIUM_DUST.get()))
                .save(pRecipeOutput);

        //Palladium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PALLADIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PALLADIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PALLADIUM_INGOT.get()), has(ModItems.PALLADIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PALLADIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_PALLADIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_PALLADIUM.get()), has(ModItems.RAW_PALLADIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PALLADIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PALLADIUM_NUGGET.get()), has(ModItems.PALLADIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PALLADIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PALLADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.PALLADIUM_DUST.get()), has(ModItems.PALLADIUM_DUST.get()))
                .save(pRecipeOutput);

        //Phosphorus
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PHOSPHORUS_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PHOSPHORUS_INGOT.get())
                .unlockedBy(getHasName(ModItems.PHOSPHORUS_INGOT.get()), has(ModItems.PHOSPHORUS_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PHOSPHORUS_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_PHOSPHORUS.get())
                .unlockedBy(getHasName(ModItems.RAW_PHOSPHORUS.get()), has(ModItems.RAW_PHOSPHORUS.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PHOSPHORUS_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PHOSPHORUS_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PHOSPHORUS_NUGGET.get()), has(ModItems.PHOSPHORUS_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PHOSPHORUS_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PHOSPHORUS_DUST.get())
                .unlockedBy(getHasName(ModItems.PHOSPHORUS_DUST.get()), has(ModItems.PHOSPHORUS_DUST.get()))
                .save(pRecipeOutput);

        //Platinum
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PLATINUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_PLATINUM.get())
                .unlockedBy(getHasName(ModItems.RAW_PLATINUM.get()), has(ModItems.RAW_PLATINUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PLATINUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_NUGGET.get()), has(ModItems.PLATINUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.PLATINUM_DUST.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_DUST.get()), has(ModItems.PLATINUM_DUST.get()))
                .save(pRecipeOutput);

        //Potassium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POTASSIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.POTASSIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.POTASSIUM_INGOT.get()), has(ModItems.POTASSIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_POTASSIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_POTASSIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_POTASSIUM.get()), has(ModItems.RAW_POTASSIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.POTASSIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.POTASSIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.POTASSIUM_NUGGET.get()), has(ModItems.POTASSIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.POTASSIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.POTASSIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.POTASSIUM_DUST.get()), has(ModItems.POTASSIUM_DUST.get()))
                .save(pRecipeOutput);

        //Rhenium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RHENIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RHENIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RHENIUM_INGOT.get()), has(ModItems.RHENIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RHENIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_RHENIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_RHENIUM.get()), has(ModItems.RAW_RHENIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RHENIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RHENIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RHENIUM_NUGGET.get()), has(ModItems.RHENIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RHENIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RHENIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.RHENIUM_DUST.get()), has(ModItems.RHENIUM_DUST.get()))
                .save(pRecipeOutput);

        //Rhodium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RHODIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RHODIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RHODIUM_INGOT.get()), has(ModItems.RHODIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RHODIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_RHODIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_RHODIUM.get()), has(ModItems.RAW_RHODIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RHODIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RHODIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RHODIUM_NUGGET.get()), has(ModItems.RHODIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RHODIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RHODIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.RHODIUM_DUST.get()), has(ModItems.RHODIUM_DUST.get()))
                .save(pRecipeOutput);

        //Rubidium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBIDIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RUBIDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RUBIDIUM_INGOT.get()), has(ModItems.RUBIDIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RUBIDIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_RUBIDIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_RUBIDIUM.get()), has(ModItems.RAW_RUBIDIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBIDIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RUBIDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RUBIDIUM_NUGGET.get()), has(ModItems.RUBIDIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBIDIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RUBIDIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.RUBIDIUM_DUST.get()), has(ModItems.RUBIDIUM_DUST.get()))
                .save(pRecipeOutput);

        //Ruthenium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUTHENIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RUTHENIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RUTHENIUM_INGOT.get()), has(ModItems.RUTHENIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RUTHENIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_RUTHENIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_RUTHENIUM.get()), has(ModItems.RAW_RUTHENIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUTHENIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RUTHENIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RUTHENIUM_NUGGET.get()), has(ModItems.RUTHENIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUTHENIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RUTHENIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.RUTHENIUM_DUST.get()), has(ModItems.RUTHENIUM_DUST.get()))
                .save(pRecipeOutput);

        //Scandium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SCANDIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SCANDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_INGOT.get()), has(ModItems.SCANDIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SCANDIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_SCANDIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_SCANDIUM.get()), has(ModItems.RAW_SCANDIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCANDIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SCANDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_NUGGET.get()), has(ModItems.SCANDIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCANDIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SCANDIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_DUST.get()), has(ModItems.SCANDIUM_DUST.get()))
                .save(pRecipeOutput);

        //Selenium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SELENIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SELENIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.SELENIUM_INGOT.get()), has(ModItems.SELENIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SELENIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_SELENIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_SELENIUM.get()), has(ModItems.RAW_SELENIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SELENIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SELENIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SELENIUM_NUGGET.get()), has(ModItems.SELENIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SELENIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SELENIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.SELENIUM_DUST.get()), has(ModItems.SELENIUM_DUST.get()))
                .save(pRecipeOutput);

        //Silicon
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILICON_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILICON_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILICON_INGOT.get()), has(ModItems.SILICON_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SILICON_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_SILICON.get())
                .unlockedBy(getHasName(ModItems.RAW_SILICON.get()), has(ModItems.RAW_SILICON.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILICON_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILICON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SILICON_NUGGET.get()), has(ModItems.SILICON_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILICON_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.SILICON_DUST.get()), has(ModItems.SILICON_DUST.get()))
                .save(pRecipeOutput);

        //Silver
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_SILVER.get())
                .unlockedBy(getHasName(ModItems.RAW_SILVER.get()), has(ModItems.RAW_SILVER.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SILVER_NUGGET.get()), has(ModItems.SILVER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.SILVER_DUST.get()), has(ModItems.SILVER_DUST.get()))
                .save(pRecipeOutput);

        //Sodium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SODIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SODIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.SODIUM_INGOT.get()), has(ModItems.SODIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SODIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_SODIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_SODIUM.get()), has(ModItems.RAW_SODIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SODIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SODIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SODIUM_NUGGET.get()), has(ModItems.SODIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SODIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.SODIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.SODIUM_DUST.get()), has(ModItems.SODIUM_DUST.get()))
                .save(pRecipeOutput);

        //Strontium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRONTIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.STRONTIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.STRONTIUM_INGOT.get()), has(ModItems.STRONTIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_STRONTIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_STRONTIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_STRONTIUM.get()), has(ModItems.RAW_STRONTIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STRONTIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.STRONTIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.STRONTIUM_NUGGET.get()), has(ModItems.STRONTIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STRONTIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.STRONTIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.STRONTIUM_DUST.get()), has(ModItems.STRONTIUM_DUST.get()))
                .save(pRecipeOutput);

        //Tantalum
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TANTALUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TANTALUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TANTALUM_INGOT.get()), has(ModItems.TANTALUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TANTALUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_TANTALUM.get())
                .unlockedBy(getHasName(ModItems.RAW_TANTALUM.get()), has(ModItems.RAW_TANTALUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TANTALUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TANTALUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TANTALUM_NUGGET.get()), has(ModItems.TANTALUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TANTALUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TANTALUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TANTALUM_DUST.get()), has(ModItems.TANTALUM_DUST.get()))
                .save(pRecipeOutput);

        //Technetium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TECHNETIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TECHNETIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TECHNETIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_TECHNETIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_TECHNETIUM.get()), has(ModItems.RAW_TECHNETIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TECHNETIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TECHNETIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_NUGGET.get()), has(ModItems.TECHNETIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TECHNETIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TECHNETIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_DUST.get()), has(ModItems.TECHNETIUM_DUST.get()))
                .save(pRecipeOutput);

        //Tellurium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TELLURIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TELLURIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TELLURIUM_INGOT.get()), has(ModItems.TELLURIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TELLURIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_TELLURIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_TELLURIUM.get()), has(ModItems.RAW_TELLURIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TELLURIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TELLURIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TELLURIUM_NUGGET.get()), has(ModItems.TELLURIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TELLURIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TELLURIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TELLURIUM_DUST.get()), has(ModItems.TELLURIUM_DUST.get()))
                .save(pRecipeOutput);

        //Thallium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.THALLIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.THALLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.THALLIUM_INGOT.get()), has(ModItems.THALLIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_THALLIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_THALLIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_THALLIUM.get()), has(ModItems.RAW_THALLIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THALLIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.THALLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.THALLIUM_NUGGET.get()), has(ModItems.THALLIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THALLIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.THALLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.THALLIUM_DUST.get()), has(ModItems.THALLIUM_DUST.get()))
                .save(pRecipeOutput);

        //Tin
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_TIN.get())
                .unlockedBy(getHasName(ModItems.RAW_TIN.get()), has(ModItems.RAW_TIN.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TIN_NUGGET.get()), has(ModItems.TIN_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.TIN_DUST.get()), has(ModItems.TIN_DUST.get()))
                .save(pRecipeOutput);

        //Titanium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITANIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TITANIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_TITANIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_TITANIUM.get()), has(ModItems.RAW_TITANIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TITANIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_NUGGET.get()), has(ModItems.TITANIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_DUST.get()), has(ModItems.TITANIUM_DUST.get()))
                .save(pRecipeOutput);

        //Tungsten
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TUNGSTEN_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TUNGSTEN_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_TUNGSTEN.get())
                .unlockedBy(getHasName(ModItems.RAW_TUNGSTEN.get()), has(ModItems.RAW_TUNGSTEN.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TUNGSTEN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_NUGGET.get()), has(ModItems.TUNGSTEN_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUNGSTEN_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.TUNGSTEN_DUST.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_DUST.get()), has(ModItems.TUNGSTEN_DUST.get()))
                .save(pRecipeOutput);

        //Vanadium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VANADIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.VANADIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.VANADIUM_INGOT.get()), has(ModItems.VANADIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_VANADIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_VANADIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_VANADIUM.get()), has(ModItems.RAW_VANADIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VANADIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.VANADIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.VANADIUM_NUGGET.get()), has(ModItems.VANADIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VANADIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.VANADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.VANADIUM_DUST.get()), has(ModItems.VANADIUM_DUST.get()))
                .save(pRecipeOutput);

        //Yttrium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YTTRIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.YTTRIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.YTTRIUM_INGOT.get()), has(ModItems.YTTRIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_YTTRIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_YTTRIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_YTTRIUM.get()), has(ModItems.RAW_YTTRIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.YTTRIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.YTTRIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.YTTRIUM_NUGGET.get()), has(ModItems.YTTRIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.YTTRIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.YTTRIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.YTTRIUM_DUST.get()), has(ModItems.YTTRIUM_DUST.get()))
                .save(pRecipeOutput);

        //Zinc
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZINC_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ZINC_INGOT.get())
                .unlockedBy(getHasName(ModItems.ZINC_INGOT.get()), has(ModItems.ZINC_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ZINC_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_ZINC.get())
                .unlockedBy(getHasName(ModItems.RAW_ZINC.get()), has(ModItems.RAW_ZINC.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZINC_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ZINC_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ZINC_NUGGET.get()), has(ModItems.ZINC_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZINC_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.ZINC_DUST.get()), has(ModItems.ZINC_DUST.get()))
                .save(pRecipeOutput);

        //Zirconium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCONIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ZIRCONIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ZIRCONIUM_INGOT.get()), has(ModItems.ZIRCONIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ZIRCONIUM_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RAW_ZIRCONIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_ZIRCONIUM.get()), has(ModItems.RAW_ZIRCONIUM.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ZIRCONIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ZIRCONIUM_NUGGET.get()), has(ModItems.ZIRCONIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCONIUM_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.ZIRCONIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ZIRCONIUM_DUST.get()), has(ModItems.ZIRCONIUM_DUST.get()))
                .save(pRecipeOutput);

        //Tools
        //Aluminium

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARMOUR_PADDING.get())
                .pattern("LFL")
                .pattern("FLF")
                .pattern("LFL")
                .define('L', Items.FEATHER)
                .define('F', ModItems.FABRIC_STRAP.get())
                .unlockedBy(getHasName(ModItems.FABRIC_STRAP.get()), has(ModItems.FABRIC_STRAP.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FABRIC_GRIP.get())
                .pattern(" FS")
                .pattern("FSF")
                .pattern("SF ")
                .define('F', ModItems.FABRIC_STRAP.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FABRIC_STRAP.get())
                .pattern("WWW")
                .pattern("WFW")
                .pattern("WWW")
                .define('W', Items.WHITE_WOOL)
                .define('F', Items.FLINT)
                .unlockedBy(getHasName(Items.WHITE_WOOL), has(Items.WHITE_WOOL))
                .save(pRecipeOutput);

        //Alloys Shaped Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AA_DUST.get())
                .pattern("aaa")
                .pattern("aaz")
                .pattern("tms")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_DUST.get()), has(ModItems.ALUMINIUM_DUST.get()))
                .save(pRecipeOutput);

        //Technology Shaped Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PEDESTAL.get())
                .pattern(" i ")
                .pattern("iii")
                .pattern("sss")
                .define('i', Items.IRON_INGOT)
                .define('s', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pRecipeOutput);

        //Shapeless Recipes
        //Aluminium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 9)
                .requires(ModBlocks.ALUMINIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ALUMINIUM_BLOCK.get()), has(ModBlocks.ALUMINIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":aluminium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_NUGGET.get(), 9)
                .requires(ModItems.ALUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_INGOT.get()), has(ModItems.ALUMINIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":aluminium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_DUST.get(), 9)
                .requires(ModItems.ALUMINIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_NUGGET.get()), has(ModItems.ALUMINIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":aluminium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ALUMINIUM.get(), 9)
                .requires(ModBlocks.RAW_ALUMINIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_ALUMINIUM_BLOCK.get()), has(ModBlocks.RAW_ALUMINIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_aluminium_shapeless");

        //Antimony
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ANTIMONY_INGOT.get(), 9)
                .requires(ModBlocks.ANTIMONY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ANTIMONY_BLOCK.get()), has(ModBlocks.ANTIMONY_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":antimony_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ANTIMONY_NUGGET.get(), 9)
                .requires(ModItems.ANTIMONY_INGOT.get())
                .unlockedBy(getHasName(ModItems.ANTIMONY_INGOT.get()), has(ModItems.ANTIMONY_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":antimony_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ANTIMONY_DUST.get(), 9)
                .requires(ModItems.ANTIMONY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ANTIMONY_NUGGET.get()), has(ModItems.ANTIMONY_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":antimony_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ANTIMONY.get(), 9)
                .requires(ModBlocks.RAW_ANTIMONY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_ANTIMONY_BLOCK.get()), has(ModBlocks.RAW_ANTIMONY_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_antimony_shapeless");

        //Arsenic
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARSENIC_INGOT.get(), 9)
                .requires(ModBlocks.ARSENIC_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ARSENIC_BLOCK.get()), has(ModBlocks.ARSENIC_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":arsenic_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARSENIC_NUGGET.get(), 9)
                .requires(ModItems.ARSENIC_INGOT.get())
                .unlockedBy(getHasName(ModItems.ARSENIC_INGOT.get()), has(ModItems.ARSENIC_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":arsenic_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ARSENIC_DUST.get(), 9)
                .requires(ModItems.ARSENIC_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ARSENIC_NUGGET.get()), has(ModItems.ARSENIC_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":arsenic_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ARSENIC.get(), 9)
                .requires(ModBlocks.RAW_ARSENIC_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_ARSENIC_BLOCK.get()), has(ModBlocks.RAW_ARSENIC_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_arsenic_shapeless");

        //Barium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BARIUM_INGOT.get(), 9)
                .requires(ModBlocks.BARIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BARIUM_BLOCK.get()), has(ModBlocks.BARIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":barium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BARIUM_NUGGET.get(), 9)
                .requires(ModItems.BARIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.BARIUM_INGOT.get()), has(ModItems.BARIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":barium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BARIUM_DUST.get(), 9)
                .requires(ModItems.BARIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BARIUM_NUGGET.get()), has(ModItems.BARIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":barium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_BARIUM.get(), 9)
                .requires(ModBlocks.RAW_BARIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_BARIUM_BLOCK.get()), has(ModBlocks.RAW_BARIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_barium_shapeless");

        //Beryllium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BERYLLIUM_INGOT.get(), 9)
                .requires(ModBlocks.BERYLLIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BERYLLIUM_BLOCK.get()), has(ModBlocks.BERYLLIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":beryllium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BERYLLIUM_NUGGET.get(), 9)
                .requires(ModItems.BERYLLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_INGOT.get()), has(ModItems.BERYLLIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":beryllium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BERYLLIUM_DUST.get(), 9)
                .requires(ModItems.BERYLLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_NUGGET.get()), has(ModItems.BERYLLIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":beryllium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_BERYLLIUM.get(), 9)
                .requires(ModBlocks.RAW_BERYLLIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_BERYLLIUM_BLOCK.get()), has(ModBlocks.RAW_BERYLLIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_beryllium_shapeless");

        //Bismuth
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BISMUTH_INGOT.get(), 9)
                .requires(ModBlocks.BISMUTH_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BISMUTH_BLOCK.get()), has(ModBlocks.BISMUTH_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":bismuth_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BISMUTH_NUGGET.get(), 9)
                .requires(ModItems.BISMUTH_INGOT.get())
                .unlockedBy(getHasName(ModItems.BISMUTH_INGOT.get()), has(ModItems.BISMUTH_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":bismuth_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BISMUTH_DUST.get(), 9)
                .requires(ModItems.BISMUTH_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BISMUTH_NUGGET.get()), has(ModItems.BISMUTH_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":bismuth_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_BISMUTH.get(), 9)
                .requires(ModBlocks.RAW_BISMUTH_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_BISMUTH_BLOCK.get()), has(ModBlocks.RAW_BISMUTH_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_bismuth_shapeless");

        //Cadmium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CADMIUM_INGOT.get(), 9)
                .requires(ModBlocks.CADMIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CADMIUM_BLOCK.get()), has(ModBlocks.CADMIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":cadmium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CADMIUM_NUGGET.get(), 9)
                .requires(ModItems.CADMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CADMIUM_INGOT.get()), has(ModItems.CADMIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":cadmium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CADMIUM_DUST.get(), 9)
                .requires(ModItems.CADMIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CADMIUM_NUGGET.get()), has(ModItems.CADMIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":cadmium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CADMIUM.get(), 9)
                .requires(ModBlocks.RAW_CADMIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_CADMIUM_BLOCK.get()), has(ModBlocks.RAW_CADMIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_cadmium_shapeless");

        //Caesium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CAESIUM_INGOT.get(), 9)
                .requires(ModBlocks.CAESIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CAESIUM_BLOCK.get()), has(ModBlocks.CAESIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":caesium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CAESIUM_NUGGET.get(), 9)
                .requires(ModItems.CAESIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CAESIUM_INGOT.get()), has(ModItems.CAESIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":caesium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CAESIUM_DUST.get(), 9)
                .requires(ModItems.CAESIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CAESIUM_NUGGET.get()), has(ModItems.CAESIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":caesium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CAESIUM.get(), 9)
                .requires(ModBlocks.RAW_CAESIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_CAESIUM_BLOCK.get()), has(ModBlocks.RAW_CAESIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_caesium_shapeless");

        //Calcium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CALCIUM_INGOT.get(), 9)
                .requires(ModBlocks.CALCIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CALCIUM_BLOCK.get()), has(ModBlocks.CALCIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":calcium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CALCIUM_NUGGET.get(), 9)
                .requires(ModItems.CALCIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CALCIUM_INGOT.get()), has(ModItems.CALCIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":calcium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CALCIUM_DUST.get(), 9)
                .requires(ModItems.CALCIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CALCIUM_NUGGET.get()), has(ModItems.CALCIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":calcium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CALCIUM.get(), 9)
                .requires(ModBlocks.RAW_CALCIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_CALCIUM_BLOCK.get()), has(ModBlocks.RAW_CALCIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_calcium_shapeless");

        //Chromium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHROMIUM_INGOT.get(), 9)
                .requires(ModBlocks.CHROMIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CHROMIUM_BLOCK.get()), has(ModBlocks.CHROMIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":chromium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHROMIUM_NUGGET.get(), 9)
                .requires(ModItems.CHROMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_INGOT.get()), has(ModItems.CHROMIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":chromium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHROMIUM_DUST.get(), 9)
                .requires(ModItems.CHROMIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_NUGGET.get()), has(ModItems.CHROMIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":chromium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CHROMIUM.get(), 9)
                .requires(ModBlocks.RAW_CHROMIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_CHROMIUM_BLOCK.get()), has(ModBlocks.RAW_CHROMIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_chromium_shapeless");

        //Cinnabar
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CINNABAR_INGOT.get(), 9)
                .requires(ModBlocks.CINNABAR_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CINNABAR_BLOCK.get()), has(ModBlocks.CINNABAR_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":cinnabar_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CINNABAR_NUGGET.get(), 9)
                .requires(ModItems.CINNABAR_INGOT.get())
                .unlockedBy(getHasName(ModItems.CINNABAR_INGOT.get()), has(ModItems.CINNABAR_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":cinnabar_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CINNABAR_DUST.get(), 9)
                .requires(ModItems.CINNABAR_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CINNABAR_NUGGET.get()), has(ModItems.CINNABAR_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":cinnabar_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CINNABAR.get(), 9)
                .requires(ModBlocks.RAW_CINNABAR_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_CINNABAR_BLOCK.get()), has(ModBlocks.RAW_CINNABAR_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_cinnabar_shapeless");

        //Cobalt
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COBALT_INGOT.get(), 9)
                .requires(ModBlocks.COBALT_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.COBALT_BLOCK.get()), has(ModBlocks.COBALT_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":cobalt_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COBALT_NUGGET.get(), 9)
                .requires(ModItems.COBALT_INGOT.get())
                .unlockedBy(getHasName(ModItems.COBALT_INGOT.get()), has(ModItems.COBALT_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":cobalt_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COBALT_DUST.get(), 9)
                .requires(ModItems.COBALT_NUGGET.get())
                .unlockedBy(getHasName(ModItems.COBALT_NUGGET.get()), has(ModItems.COBALT_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":cobalt_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_COBALT.get(), 9)
                .requires(ModBlocks.RAW_COBALT_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_COBALT_BLOCK.get()), has(ModBlocks.RAW_COBALT_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_cobalt_shapeless");

        //Gallium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GALLIUM_INGOT.get(), 9)
                .requires(ModBlocks.GALLIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.GALLIUM_BLOCK.get()), has(ModBlocks.GALLIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":gallium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GALLIUM_NUGGET.get(), 9)
                .requires(ModItems.GALLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.GALLIUM_INGOT.get()), has(ModItems.GALLIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":gallium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GALLIUM_DUST.get(), 9)
                .requires(ModItems.GALLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GALLIUM_NUGGET.get()), has(ModItems.GALLIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":gallium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_GALLIUM.get(), 9)
                .requires(ModBlocks.RAW_GALLIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_GALLIUM_BLOCK.get()), has(ModBlocks.RAW_GALLIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_gallium_shapeless");

        //Germanium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GERMANIUM_INGOT.get(), 9)
                .requires(ModBlocks.GERMANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.GERMANIUM_BLOCK.get()), has(ModBlocks.GERMANIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":germanium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GERMANIUM_NUGGET.get(), 9)
                .requires(ModItems.GERMANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.GERMANIUM_INGOT.get()), has(ModItems.GERMANIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":germanium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GERMANIUM_DUST.get(), 9)
                .requires(ModItems.GERMANIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GERMANIUM_NUGGET.get()), has(ModItems.GERMANIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":germanium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_GERMANIUM.get(), 9)
                .requires(ModBlocks.RAW_GERMANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_GERMANIUM_BLOCK.get()), has(ModBlocks.RAW_GERMANIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_germanium_shapeless");

        //HAFNIUM
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HAFNIUM_INGOT.get(), 9)
                .requires(ModBlocks.HAFNIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.HAFNIUM_BLOCK.get()), has(ModBlocks.HAFNIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":hafnium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HAFNIUM_NUGGET.get(), 9)
                .requires(ModItems.HAFNIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.HAFNIUM_INGOT.get()), has(ModItems.HAFNIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":hafnium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HAFNIUM_DUST.get(), 9)
                .requires(ModItems.HAFNIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.HAFNIUM_NUGGET.get()), has(ModItems.HAFNIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":hafnium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_HAFNIUM.get(), 9)
                .requires(ModBlocks.RAW_HAFNIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_HAFNIUM_BLOCK.get()), has(ModBlocks.RAW_HAFNIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_hafnium_shapeless");

        //Indium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INDIUM_INGOT.get(), 9)
                .requires(ModBlocks.INDIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.INDIUM_BLOCK.get()), has(ModBlocks.INDIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":indium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INDIUM_NUGGET.get(), 9)
                .requires(ModItems.INDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.INDIUM_INGOT.get()), has(ModItems.INDIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":indium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INDIUM_DUST.get(), 9)
                .requires(ModItems.INDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.INDIUM_NUGGET.get()), has(ModItems.INDIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":indium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_INDIUM.get(), 9)
                .requires(ModBlocks.RAW_INDIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_INDIUM_BLOCK.get()), has(ModBlocks.RAW_INDIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_indium_shapeless");

        //Iridium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRIDIUM_INGOT.get(), 9)
                .requires(ModBlocks.IRIDIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.IRIDIUM_BLOCK.get()), has(ModBlocks.IRIDIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":iridium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRIDIUM_NUGGET.get(), 9)
                .requires(ModItems.IRIDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.IRIDIUM_INGOT.get()), has(ModItems.IRIDIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":iridium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.IRIDIUM_DUST.get(), 9)
                .requires(ModItems.IRIDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.IRIDIUM_NUGGET.get()), has(ModItems.IRIDIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":iridium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_IRIDIUM.get(), 9)
                .requires(ModBlocks.RAW_IRIDIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_IRIDIUM_BLOCK.get()), has(ModBlocks.RAW_IRIDIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_iridium_shapeless");

        //Lead
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 9)
                .requires(ModBlocks.LEAD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.LEAD_BLOCK.get()), has(ModBlocks.LEAD_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":lead_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_NUGGET.get(), 9)
                .requires(ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":lead_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEAD_DUST.get(), 9)
                .requires(ModItems.LEAD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.LEAD_NUGGET.get()), has(ModItems.LEAD_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":lead_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_LEAD.get(), 9)
                .requires(ModBlocks.RAW_LEAD_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_LEAD_BLOCK.get()), has(ModBlocks.RAW_LEAD_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_lead_shapeless");

        //Lithium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LITHIUM_INGOT.get(), 9)
                .requires(ModBlocks.LITHIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.LITHIUM_BLOCK.get()), has(ModBlocks.LITHIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":lithium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LITHIUM_NUGGET.get(), 9)
                .requires(ModItems.LITHIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.LITHIUM_INGOT.get()), has(ModItems.LITHIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":lithium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LITHIUM_DUST.get(), 9)
                .requires(ModItems.LITHIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.LITHIUM_NUGGET.get()), has(ModItems.LITHIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":lithium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_LITHIUM.get(), 9)
                .requires(ModBlocks.RAW_LITHIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_LITHIUM_BLOCK.get()), has(ModBlocks.RAW_LITHIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_lithium_shapeless");

        //Manganese
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MANGANESE_INGOT.get(), 9)
                .requires(ModBlocks.MANGANESE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.MANGANESE_BLOCK.get()), has(ModBlocks.MANGANESE_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":manganese_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MANGANESE_NUGGET.get(), 9)
                .requires(ModItems.MANGANESE_INGOT.get())
                .unlockedBy(getHasName(ModItems.MANGANESE_INGOT.get()), has(ModItems.MANGANESE_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":manganese_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MANGANESE_DUST.get(), 9)
                .requires(ModItems.MANGANESE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MANGANESE_NUGGET.get()), has(ModItems.MANGANESE_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":manganese_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_MANGANESE.get(), 9)
                .requires(ModBlocks.RAW_MANGANESE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_MANGANESE_BLOCK.get()), has(ModBlocks.RAW_MANGANESE_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_manganese_shapeless");

        //Magnesium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT.get(), 9)
                .requires(ModBlocks.MAGNESIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.MAGNESIUM_BLOCK.get()), has(ModBlocks.MAGNESIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":magnesium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MAGNESIUM_NUGGET.get(), 9)
                .requires(ModItems.MAGNESIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.MAGNESIUM_INGOT.get()), has(ModItems.MAGNESIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":magnesium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MAGNESIUM_DUST.get(), 9)
                .requires(ModItems.MAGNESIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MAGNESIUM_NUGGET.get()), has(ModItems.MAGNESIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":magnesium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_MAGNESIUM.get(), 9)
                .requires(ModBlocks.RAW_MAGNESIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_MAGNESIUM_BLOCK.get()), has(ModBlocks.RAW_MAGNESIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_magnesium_shapeless");

        //Molybdenum
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MOLYBDENUM_INGOT.get(), 9)
                .requires(ModBlocks.MOLYBDENUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.MOLYBDENUM_BLOCK.get()), has(ModBlocks.MOLYBDENUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":molybdenum_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MOLYBDENUM_NUGGET.get(), 9)
                .requires(ModItems.MOLYBDENUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.MOLYBDENUM_INGOT.get()), has(ModItems.MOLYBDENUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":molybdenum_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MOLYBDENUM_DUST.get(), 9)
                .requires(ModItems.MOLYBDENUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MOLYBDENUM_NUGGET.get()), has(ModItems.MOLYBDENUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":molybdenum_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_MOLYBDENUM.get(), 9)
                .requires(ModBlocks.RAW_MOLYBDENUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_MOLYBDENUM_BLOCK.get()), has(ModBlocks.RAW_MOLYBDENUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_molybdenum_shapeless");

        //Nickel
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 9)
                .requires(ModBlocks.NICKEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.NICKEL_BLOCK.get()), has(ModBlocks.NICKEL_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":nickel_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NICKEL_NUGGET.get(), 9)
                .requires(ModItems.NICKEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.NICKEL_INGOT.get()), has(ModItems.NICKEL_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":nickel_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NICKEL_DUST.get(), 9)
                .requires(ModItems.NICKEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NICKEL_NUGGET.get()), has(ModItems.NICKEL_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":nickel_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_NICKEL.get(), 9)
                .requires(ModBlocks.RAW_NICKEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_NICKEL_BLOCK.get()), has(ModBlocks.RAW_NICKEL_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_nickel_shapeless");

        //Niobium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NIOBIUM_INGOT.get(), 9)
                .requires(ModBlocks.NIOBIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.NIOBIUM_BLOCK.get()), has(ModBlocks.NIOBIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":niobium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NIOBIUM_NUGGET.get(), 9)
                .requires(ModItems.NIOBIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.NIOBIUM_INGOT.get()), has(ModItems.NIOBIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":niobium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NIOBIUM_DUST.get(), 9)
                .requires(ModItems.NIOBIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NIOBIUM_NUGGET.get()), has(ModItems.NIOBIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":niobium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_NIOBIUM.get(), 9)
                .requires(ModBlocks.RAW_NIOBIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_NIOBIUM_BLOCK.get()), has(ModBlocks.RAW_NIOBIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_niobium_shapeless");

        //Osmium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 9)
                .requires(ModBlocks.OSMIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.OSMIUM_BLOCK.get()), has(ModBlocks.OSMIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":osmium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OSMIUM_NUGGET.get(), 9)
                .requires(ModItems.OSMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.OSMIUM_INGOT.get()), has(ModItems.OSMIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":osmium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OSMIUM_DUST.get(), 9)
                .requires(ModItems.OSMIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.OSMIUM_NUGGET.get()), has(ModItems.OSMIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":osmium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_OSMIUM.get(), 9)
                .requires(ModBlocks.RAW_OSMIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_OSMIUM_BLOCK.get()), has(ModBlocks.RAW_OSMIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_osmium_shapeless");

        //Palladium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 9)
                .requires(ModBlocks.PALLADIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PALLADIUM_BLOCK.get()), has(ModBlocks.PALLADIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":palladium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALLADIUM_NUGGET.get(), 9)
                .requires(ModItems.PALLADIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PALLADIUM_INGOT.get()), has(ModItems.PALLADIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":palladium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALLADIUM_DUST.get(), 9)
                .requires(ModItems.PALLADIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PALLADIUM_NUGGET.get()), has(ModItems.PALLADIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":palladium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_PALLADIUM.get(), 9)
                .requires(ModBlocks.RAW_PALLADIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_PALLADIUM_BLOCK.get()), has(ModBlocks.RAW_PALLADIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_palladium_shapeless");

        //Phosphorus
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PHOSPHORUS_INGOT.get(), 9)
                .requires(ModBlocks.PHOSPHORUS_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PHOSPHORUS_BLOCK.get()), has(ModBlocks.PHOSPHORUS_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":phosphorus_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PHOSPHORUS_NUGGET.get(), 9)
                .requires(ModItems.PHOSPHORUS_INGOT.get())
                .unlockedBy(getHasName(ModItems.PHOSPHORUS_INGOT.get()), has(ModItems.PHOSPHORUS_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":phosphorus_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PHOSPHORUS_DUST.get(), 9)
                .requires(ModItems.PHOSPHORUS_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PHOSPHORUS_NUGGET.get()), has(ModItems.PHOSPHORUS_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":phosphorus_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_PHOSPHORUS.get(), 9)
                .requires(ModBlocks.RAW_PHOSPHORUS_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_PHOSPHORUS_BLOCK.get()), has(ModBlocks.RAW_PHOSPHORUS_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_phosphorus_shapeless");

        //Platinum
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 9)
                .requires(ModBlocks.PLATINUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PLATINUM_BLOCK.get()), has(ModBlocks.PLATINUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":platinum_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_NUGGET.get(), 9)
                .requires(ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":platinum_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLATINUM_DUST.get(), 9)
                .requires(ModItems.PLATINUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_NUGGET.get()), has(ModItems.PLATINUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":platinum_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_PLATINUM.get(), 9)
                .requires(ModBlocks.RAW_PLATINUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_PLATINUM_BLOCK.get()), has(ModBlocks.RAW_PLATINUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_platinum_shapeless");

        //Potassium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POTASSIUM_INGOT.get(), 9)
                .requires(ModBlocks.POTASSIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.POTASSIUM_BLOCK.get()), has(ModBlocks.POTASSIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":potassium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POTASSIUM_NUGGET.get(), 9)
                .requires(ModItems.POTASSIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.POTASSIUM_INGOT.get()), has(ModItems.POTASSIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":potassium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POTASSIUM_DUST.get(), 9)
                .requires(ModItems.POTASSIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.POTASSIUM_NUGGET.get()), has(ModItems.POTASSIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":potassium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_POTASSIUM.get(), 9)
                .requires(ModBlocks.RAW_POTASSIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_POTASSIUM_BLOCK.get()), has(ModBlocks.RAW_POTASSIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_potassium_shapeless");

        //Rhenium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RHENIUM_INGOT.get(), 9)
                .requires(ModBlocks.RHENIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RHENIUM_BLOCK.get()), has(ModBlocks.RHENIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":rhenium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RHENIUM_NUGGET.get(), 9)
                .requires(ModItems.RHENIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RHENIUM_INGOT.get()), has(ModItems.RHENIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":rhenium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RHENIUM_DUST.get(), 9)
                .requires(ModItems.RHENIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RHENIUM_NUGGET.get()), has(ModItems.RHENIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":rhenium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RHENIUM.get(), 9)
                .requires(ModBlocks.RAW_RHENIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_RHENIUM_BLOCK.get()), has(ModBlocks.RAW_RHENIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_rhenium_shapeless");

        //Rhodium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RHODIUM_INGOT.get(), 9)
                .requires(ModBlocks.RHODIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RHODIUM_BLOCK.get()), has(ModBlocks.RHODIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":rhodium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RHODIUM_NUGGET.get(), 9)
                .requires(ModItems.RHODIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RHODIUM_INGOT.get()), has(ModItems.RHODIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":rhodium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RHODIUM_DUST.get(), 9)
                .requires(ModItems.RHODIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RHODIUM_NUGGET.get()), has(ModItems.RHODIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":rhodium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RHODIUM.get(), 9)
                .requires(ModBlocks.RAW_RHODIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_RHODIUM_BLOCK.get()), has(ModBlocks.RAW_RHODIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_rhodium_shapeless");

        //Rubidium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBIDIUM_INGOT.get(), 9)
                .requires(ModBlocks.RUBIDIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RUBIDIUM_BLOCK.get()), has(ModBlocks.RUBIDIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":rubidium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBIDIUM_NUGGET.get(), 9)
                .requires(ModItems.RUBIDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RUBIDIUM_INGOT.get()), has(ModItems.RUBIDIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":rubidium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBIDIUM_DUST.get(), 9)
                .requires(ModItems.RUBIDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RUBIDIUM_NUGGET.get()), has(ModItems.RUBIDIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":rubidium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RUBIDIUM.get(), 9)
                .requires(ModBlocks.RAW_RUBIDIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_RUBIDIUM_BLOCK.get()), has(ModBlocks.RAW_RUBIDIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_rubidium_shapeless");

        //Ruthenium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUTHENIUM_INGOT.get(), 9)
                .requires(ModBlocks.RUTHENIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RUTHENIUM_BLOCK.get()), has(ModBlocks.RUTHENIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":ruthenium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUTHENIUM_NUGGET.get(), 9)
                .requires(ModItems.RUTHENIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.RUTHENIUM_INGOT.get()), has(ModItems.RUTHENIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":ruthenium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUTHENIUM_DUST.get(), 9)
                .requires(ModItems.RUTHENIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RUTHENIUM_NUGGET.get()), has(ModItems.RUTHENIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":ruthenium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RUTHENIUM.get(), 9)
                .requires(ModBlocks.RAW_RUTHENIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_RUTHENIUM_BLOCK.get()), has(ModBlocks.RAW_RUTHENIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_ruthenium_shapeless");

        //Scandium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SCANDIUM_INGOT.get(), 9)
                .requires(ModBlocks.SCANDIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SCANDIUM_BLOCK.get()), has(ModBlocks.SCANDIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":scandium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SCANDIUM_NUGGET.get(), 9)
                .requires(ModItems.SCANDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_INGOT.get()), has(ModItems.SCANDIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":scandium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SCANDIUM_DUST.get(), 9)
                .requires(ModItems.SCANDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_NUGGET.get()), has(ModItems.SCANDIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":scandium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SCANDIUM.get(), 9)
                .requires(ModBlocks.RAW_SCANDIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SCANDIUM_BLOCK.get()), has(ModBlocks.RAW_SCANDIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_scandium_shapeless");

        //Selenium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SELENIUM_INGOT.get(), 9)
                .requires(ModBlocks.SELENIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SELENIUM_BLOCK.get()), has(ModBlocks.SELENIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":selenium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SELENIUM_NUGGET.get(), 9)
                .requires(ModItems.SELENIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.SELENIUM_INGOT.get()), has(ModItems.SELENIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":selenium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SELENIUM_DUST.get(), 9)
                .requires(ModItems.SELENIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SELENIUM_NUGGET.get()), has(ModItems.SELENIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":selenium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SELENIUM.get(), 9)
                .requires(ModBlocks.RAW_SELENIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SELENIUM_BLOCK.get()), has(ModBlocks.RAW_SELENIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_selenium_shapeless");

        //Silicon
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILICON_INGOT.get(), 9)
                .requires(ModBlocks.SILICON_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SILICON_BLOCK.get()), has(ModBlocks.SILICON_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":silicon_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILICON_NUGGET.get(), 9)
                .requires(ModItems.SILICON_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILICON_INGOT.get()), has(ModItems.SILICON_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":silicon_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILICON_DUST.get(), 9)
                .requires(ModItems.SILICON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SILICON_NUGGET.get()), has(ModItems.SILICON_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":silicon_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SILICON.get(), 9)
                .requires(ModBlocks.RAW_SILICON_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SILICON_BLOCK.get()), has(ModBlocks.RAW_SILICON_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_silicon_shapeless");

        //Silver
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 9)
                .requires(ModBlocks.SILVER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SILVER_BLOCK.get()), has(ModBlocks.SILVER_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":silver_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_NUGGET.get(), 9)
                .requires(ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":silver_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILVER_DUST.get(), 9)
                .requires(ModItems.SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SILVER_NUGGET.get()), has(ModItems.SILVER_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":silver_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SILVER.get(), 9)
                .requires(ModBlocks.RAW_SILVER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SILVER_BLOCK.get()), has(ModBlocks.RAW_SILVER_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_silver_shapeless");

        //Sodium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SODIUM_INGOT.get(), 9)
                .requires(ModBlocks.SODIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SODIUM_BLOCK.get()), has(ModBlocks.SODIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":sodium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SODIUM_NUGGET.get(), 9)
                .requires(ModItems.SODIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.SODIUM_INGOT.get()), has(ModItems.SODIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":sodium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SODIUM_DUST.get(), 9)
                .requires(ModItems.SODIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SODIUM_NUGGET.get()), has(ModItems.SODIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":sodium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SODIUM.get(), 9)
                .requires(ModBlocks.RAW_SODIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SODIUM_BLOCK.get()), has(ModBlocks.RAW_SODIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_sodium_shapeless");

        //Strontium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STRONTIUM_INGOT.get(), 9)
                .requires(ModBlocks.STRONTIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.STRONTIUM_BLOCK.get()), has(ModBlocks.STRONTIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":strontium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STRONTIUM_NUGGET.get(), 9)
                .requires(ModItems.STRONTIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.STRONTIUM_INGOT.get()), has(ModItems.STRONTIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":strontium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STRONTIUM_DUST.get(), 9)
                .requires(ModItems.STRONTIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.STRONTIUM_NUGGET.get()), has(ModItems.STRONTIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":strontium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_STRONTIUM.get(), 9)
                .requires(ModBlocks.RAW_STRONTIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_STRONTIUM_BLOCK.get()), has(ModBlocks.RAW_STRONTIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_strontium_shapeless");

        //Tantalum
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TANTALUM_INGOT.get(), 9)
                .requires(ModBlocks.TANTALUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TANTALUM_BLOCK.get()), has(ModBlocks.TANTALUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tantalum_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TANTALUM_NUGGET.get(), 9)
                .requires(ModItems.TANTALUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TANTALUM_INGOT.get()), has(ModItems.TANTALUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tantalum_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TANTALUM_DUST.get(), 9)
                .requires(ModItems.TANTALUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TANTALUM_NUGGET.get()), has(ModItems.TANTALUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tantalum_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TANTALUM.get(), 9)
                .requires(ModBlocks.RAW_TANTALUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_TANTALUM_BLOCK.get()), has(ModBlocks.RAW_TANTALUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_tantalum_shapeless");

        //Tellurium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TELLURIUM_INGOT.get(), 9)
                .requires(ModBlocks.TELLURIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TELLURIUM_BLOCK.get()), has(ModBlocks.TELLURIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tellurium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TELLURIUM_NUGGET.get(), 9)
                .requires(ModItems.TELLURIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TELLURIUM_INGOT.get()), has(ModItems.TELLURIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tellurium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TELLURIUM_DUST.get(), 9)
                .requires(ModItems.TELLURIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TELLURIUM_NUGGET.get()), has(ModItems.TELLURIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tellurium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TELLURIUM.get(), 9)
                .requires(ModBlocks.RAW_TELLURIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_TELLURIUM_BLOCK.get()), has(ModBlocks.RAW_TELLURIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_tellurium_shapeless");

        //Technetium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TECHNETIUM_INGOT.get(), 9)
                .requires(ModBlocks.TECHNETIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TECHNETIUM_BLOCK.get()), has(ModBlocks.TECHNETIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":technetium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TECHNETIUM_NUGGET.get(), 9)
                .requires(ModItems.TECHNETIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_INGOT.get()), has(ModItems.TECHNETIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":technetium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TECHNETIUM_DUST.get(), 9)
                .requires(ModItems.TECHNETIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TECHNETIUM_NUGGET.get()), has(ModItems.TECHNETIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":technetium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TECHNETIUM.get(), 9)
                .requires(ModBlocks.RAW_TECHNETIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_TECHNETIUM_BLOCK.get()), has(ModBlocks.RAW_TECHNETIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_technetium_shapeless");

        //Thallium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THALLIUM_INGOT.get(), 9)
                .requires(ModBlocks.THALLIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.THALLIUM_BLOCK.get()), has(ModBlocks.THALLIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":thallium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THALLIUM_NUGGET.get(), 9)
                .requires(ModItems.THALLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.THALLIUM_INGOT.get()), has(ModItems.THALLIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":thallium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.THALLIUM_DUST.get(), 9)
                .requires(ModItems.THALLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.THALLIUM_NUGGET.get()), has(ModItems.THALLIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":thallium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_THALLIUM.get(), 9)
                .requires(ModBlocks.RAW_THALLIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_THALLIUM_BLOCK.get()), has(ModBlocks.RAW_THALLIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_thallium_shapeless");

        //Tin
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModBlocks.TIN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TIN_BLOCK.get()), has(ModBlocks.TIN_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tin_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_NUGGET.get(), 9)
                .requires(ModItems.TIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIN_INGOT.get()), has(ModItems.TIN_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tin_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_DUST.get(), 9)
                .requires(ModItems.TIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TIN_NUGGET.get()), has(ModItems.TIN_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tin_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TIN.get(), 9)
                .requires(ModBlocks.RAW_TIN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_TIN_BLOCK.get()), has(ModBlocks.RAW_TIN_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_tin_shapeless");

        //Titanium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 9)
                .requires(ModBlocks.TITANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TITANIUM_BLOCK.get()), has(ModBlocks.TITANIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":titanium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_NUGGET.get(), 9)
                .requires(ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":titanium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_DUST.get(), 9)
                .requires(ModItems.TITANIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_NUGGET.get()), has(ModItems.TITANIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":titanium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TITANIUM.get(), 9)
                .requires(ModBlocks.RAW_TITANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_TITANIUM_BLOCK.get()), has(ModBlocks.RAW_TITANIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_titanium_shapeless");

        //Tungsten
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(), 9)
                .requires(ModBlocks.TUNGSTEN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TUNGSTEN_BLOCK.get()), has(ModBlocks.TUNGSTEN_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tungsten_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TUNGSTEN_NUGGET.get(), 9)
                .requires(ModItems.TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_INGOT.get()), has(ModItems.TUNGSTEN_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tungsten_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TUNGSTEN_DUST.get(), 9)
                .requires(ModItems.TUNGSTEN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TUNGSTEN_NUGGET.get()), has(ModItems.TUNGSTEN_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":tungsten_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_TUNGSTEN.get(), 9)
                .requires(ModBlocks.RAW_TUNGSTEN_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_TUNGSTEN_BLOCK.get()), has(ModBlocks.RAW_TUNGSTEN_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_tungsten_shapeless");

        //Vanadium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANADIUM_INGOT.get(), 9)
                .requires(ModBlocks.VANADIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.VANADIUM_BLOCK.get()), has(ModBlocks.VANADIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":vanadium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANADIUM_NUGGET.get(), 9)
                .requires(ModItems.VANADIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.VANADIUM_INGOT.get()), has(ModItems.VANADIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":vanadium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VANADIUM_DUST.get(), 9)
                .requires(ModItems.VANADIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.VANADIUM_NUGGET.get()), has(ModItems.VANADIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":vanadium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_VANADIUM.get(), 9)
                .requires(ModBlocks.RAW_VANADIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_VANADIUM_BLOCK.get()), has(ModBlocks.RAW_VANADIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_vanadium_shapeless");

        //Yttrium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.YTTRIUM_INGOT.get(), 9)
                .requires(ModBlocks.YTTRIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.YTTRIUM_BLOCK.get()), has(ModBlocks.YTTRIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":yttrium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.YTTRIUM_NUGGET.get(), 9)
                .requires(ModItems.YTTRIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.YTTRIUM_INGOT.get()), has(ModItems.YTTRIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":yttrium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.YTTRIUM_DUST.get(), 9)
                .requires(ModItems.YTTRIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.YTTRIUM_NUGGET.get()), has(ModItems.YTTRIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":yttrium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_YTTRIUM.get(), 9)
                .requires(ModBlocks.RAW_YTTRIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_YTTRIUM_BLOCK.get()), has(ModBlocks.RAW_YTTRIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_yttrium_shapeless");

        //Zinc
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZINC_INGOT.get(), 9)
                .requires(ModBlocks.ZINC_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ZINC_BLOCK.get()), has(ModBlocks.ZINC_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":zinc_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZINC_NUGGET.get(), 9)
                .requires(ModItems.ZINC_INGOT.get())
                .unlockedBy(getHasName(ModItems.ZINC_INGOT.get()), has(ModItems.ZINC_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":zinc_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZINC_DUST.get(), 9)
                .requires(ModItems.ZINC_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ZINC_NUGGET.get()), has(ModItems.ZINC_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":zinc_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ZINC.get(), 9)
                .requires(ModBlocks.RAW_ZINC_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_ZINC_BLOCK.get()), has(ModBlocks.RAW_ZINC_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_zinc_shapeless");

        //Zirconium
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT.get(), 9)
                .requires(ModBlocks.ZIRCONIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ZIRCONIUM_BLOCK.get()), has(ModBlocks.ZIRCONIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":zirconium_ingot_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIRCONIUM_NUGGET.get(), 9)
                .requires(ModItems.ZIRCONIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ZIRCONIUM_INGOT.get()), has(ModItems.ZIRCONIUM_INGOT.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":zirconium_nugget_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIRCONIUM_DUST.get(), 9)
                .requires(ModItems.ZIRCONIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ZIRCONIUM_NUGGET.get()), has(ModItems.ZIRCONIUM_NUGGET.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":zirconium_dust_shapeless");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ZIRCONIUM.get(), 9)
                .requires(ModBlocks.RAW_ZIRCONIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_ZIRCONIUM_BLOCK.get()), has(ModBlocks.RAW_ZIRCONIUM_BLOCK.get()))
                .save(pRecipeOutput, MegalosMod.MOD_ID + ":raw_zirconium_shapeless");

        //Smelting
        oreSmelting(pRecipeOutput, ALUMINIUM_SMELTABLES,RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(),0.25f,200,"aluminium");
        oreSmelting(pRecipeOutput, ANTIMONY_SMELTABLES,RecipeCategory.MISC, ModItems.ANTIMONY_INGOT.get(),0.25f,200,"antimony");
        oreSmelting(pRecipeOutput, ARSENIC_SMELTABLES,RecipeCategory.MISC, ModItems.ARSENIC_INGOT.get(),0.25f,200,"arsenic");
        oreSmelting(pRecipeOutput, BARIUM_SMELTABLES,RecipeCategory.MISC, ModItems.BARIUM_INGOT.get(),0.25f,200,"barium");
        oreSmelting(pRecipeOutput, BERYLLIUM_SMELTABLES,RecipeCategory.MISC, ModItems.BERYLLIUM_INGOT.get(),0.25f,200,"beryllium");

        oreSmelting(pRecipeOutput, BISMUTH_SMELTABLES,RecipeCategory.MISC, ModItems.BISMUTH_INGOT.get(),0.25f,200,"bismuth");
        oreSmelting(pRecipeOutput, CADMIUM_SMELTABLES,RecipeCategory.MISC, ModItems.CADMIUM_INGOT.get(),0.25f,200,"cadmium");
        oreSmelting(pRecipeOutput, CAESIUM_SMELTABLES,RecipeCategory.MISC, ModItems.CAESIUM_INGOT.get(),0.25f,200,"caesium");
        oreSmelting(pRecipeOutput, CALCIUM_SMELTABLES,RecipeCategory.MISC, ModItems.CALCIUM_INGOT.get(),0.25f,200,"calcium");
        oreSmelting(pRecipeOutput, CINNABAR_SMELTABLES,RecipeCategory.MISC, ModItems.CINNABAR_INGOT.get(),0.25f,200,"cinnabar");

        oreSmelting(pRecipeOutput, COBALT_SMELTABLES,RecipeCategory.MISC, ModItems.COBALT_INGOT.get(),0.25f,200,"cobalt");
        oreSmelting(pRecipeOutput, CHROMIUM_SMELTABLES,RecipeCategory.MISC, ModItems.CHROMIUM_INGOT.get(),0.25f,200,"chromium");
        oreSmelting(pRecipeOutput, GALLIUM_SMELTABLES,RecipeCategory.MISC, ModItems.GALLIUM_INGOT.get(),0.25f,200,"gallium");
        oreSmelting(pRecipeOutput, GERMANIUM_SMELTABLES,RecipeCategory.MISC, ModItems.GERMANIUM_INGOT.get(),0.25f,200,"germanium");
        oreSmelting(pRecipeOutput, HAFNIUM_SMELTABLES,RecipeCategory.MISC, ModItems.HAFNIUM_INGOT.get(),0.25f,200,"hafnium");

        oreSmelting(pRecipeOutput, INDIUM_SMELTABLES,RecipeCategory.MISC, ModItems.INDIUM_INGOT.get(),0.25f,200,"indium");
        oreSmelting(pRecipeOutput, IRIDIUM_SMELTABLES,RecipeCategory.MISC, ModItems.IRIDIUM_INGOT.get(),0.25f,200,"iridium");
        oreSmelting(pRecipeOutput, LEAD_SMELTABLES,RecipeCategory.MISC, ModItems.LEAD_INGOT.get(),0.25f,200,"lead");
        oreSmelting(pRecipeOutput, LITHIUM_SMELTABLES,RecipeCategory.MISC, ModItems.LITHIUM_INGOT.get(),0.25f,200,"lithium");
        oreSmelting(pRecipeOutput, MANGANESE_SMELTABLES,RecipeCategory.MISC, ModItems.MANGANESE_INGOT.get(),0.25f,200,"manganese");

        oreSmelting(pRecipeOutput, MAGNESIUM_SMELTABLES,RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT.get(),0.25f,200,"magnesium");
        oreSmelting(pRecipeOutput, MOLYBDENUM_SMELTABLES,RecipeCategory.MISC, ModItems.MOLYBDENUM_INGOT.get(),0.25f,200,"molybdenum");
        oreSmelting(pRecipeOutput, NICKEL_SMELTABLES,RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(),0.25f,200,"nickel");
        oreSmelting(pRecipeOutput, NIOBIUM_SMELTABLES,RecipeCategory.MISC, ModItems.NIOBIUM_INGOT.get(),0.25f,200,"niobium");
        oreSmelting(pRecipeOutput, OSMIUM_SMELTABLES,RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(),0.25f,200,"osmium");

        oreSmelting(pRecipeOutput, PALLADIUM_SMELTABLES,RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(),0.25f,200,"palladium");
        oreSmelting(pRecipeOutput, PHOSPHORUS_SMELTABLES,RecipeCategory.MISC, ModItems.PHOSPHORUS_INGOT.get(),0.25f,200,"phosphorus");
        oreSmelting(pRecipeOutput, PLATINUM_SMELTABLES,RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(),0.25f,200,"platinum");
        oreSmelting(pRecipeOutput, POTASSIUM_SMELTABLES,RecipeCategory.MISC, ModItems.POTASSIUM_INGOT.get(),0.25f,200,"potassium");
        oreSmelting(pRecipeOutput, RHENIUM_SMELTABLES,RecipeCategory.MISC, ModItems.RHENIUM_INGOT.get(),0.25f,200,"rhenium");

        oreSmelting(pRecipeOutput, RHODIUM_SMELTABLES,RecipeCategory.MISC, ModItems.RHODIUM_INGOT.get(),0.25f,200,"rhodium");
        oreSmelting(pRecipeOutput, RUBIDIUM_SMELTABLES,RecipeCategory.MISC, ModItems.RUBIDIUM_INGOT.get(),0.25f,200,"rubidium");
        oreSmelting(pRecipeOutput, RUTHENIUM_SMELTABLES,RecipeCategory.MISC, ModItems.RUTHENIUM_INGOT.get(),0.25f,200,"ruthenium");
        oreSmelting(pRecipeOutput, SCANDIUM_SMELTABLES,RecipeCategory.MISC, ModItems.SCANDIUM_INGOT.get(),0.25f,200,"scandium");
        oreSmelting(pRecipeOutput, SELENIUM_SMELTABLES,RecipeCategory.MISC, ModItems.SELENIUM_INGOT.get(),0.25f,200,"selenium");

        oreSmelting(pRecipeOutput, SILICON_SMELTABLES,RecipeCategory.MISC, ModItems.SILICON_INGOT.get(),0.25f,200,"silicon");
        oreSmelting(pRecipeOutput, SILVER_SMELTABLES,RecipeCategory.MISC, ModItems.SILVER_INGOT.get(),0.25f,200,"silver");
        oreSmelting(pRecipeOutput, SODIUM_SMELTABLES,RecipeCategory.MISC, ModItems.SODIUM_INGOT.get(),0.25f,200,"sodium");
        oreSmelting(pRecipeOutput, STRONTIUM_SMELTABLES,RecipeCategory.MISC, ModItems.STRONTIUM_INGOT.get(),0.25f,200,"strontium");
        oreSmelting(pRecipeOutput, TANTALUM_SMELTABLES,RecipeCategory.MISC, ModItems.TANTALUM_INGOT.get(),0.25f,200,"tantalum");

        oreSmelting(pRecipeOutput, TELLURIUM_SMELTABLES,RecipeCategory.MISC, ModItems.TECHNETIUM_INGOT.get(),0.25f,200,"technetium");
        oreSmelting(pRecipeOutput, TECHNETIUM_SMELTABLES,RecipeCategory.MISC, ModItems.TELLURIUM_INGOT.get(),0.25f,200,"tellurium");
        oreSmelting(pRecipeOutput, THALLIUM_SMELTABLES,RecipeCategory.MISC, ModItems.THALLIUM_INGOT.get(),0.25f,200,"thallium");
        oreSmelting(pRecipeOutput, TIN_SMELTABLES,RecipeCategory.MISC, ModItems.TIN_INGOT.get(),0.25f,200,"tin");
        oreSmelting(pRecipeOutput, TITANIUM_SMELTABLES,RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(),0.25f,200,"titanium");

        oreSmelting(pRecipeOutput, TUNGSTEN_SMELTABLES,RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(),0.25f,200,"tungsten");
        oreSmelting(pRecipeOutput, VANADIUM_SMELTABLES,RecipeCategory.MISC, ModItems.VANADIUM_INGOT.get(),0.25f,200,"vanadium");
        oreSmelting(pRecipeOutput, YTTRIUM_SMELTABLES,RecipeCategory.MISC, ModItems.YTTRIUM_INGOT.get(),0.25f,200,"yttrium");
        oreSmelting(pRecipeOutput, ZINC_SMELTABLES,RecipeCategory.MISC, ModItems.ZINC_INGOT.get(),0.25f,200,"zinc");
        oreSmelting(pRecipeOutput, ZIRCONIUM_SMELTABLES,RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT.get(),0.25f,200,"zirconium");

        //Blasting
        oreBlasting(pRecipeOutput, ALUMINIUM_SMELTABLES,RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(),0.25f,100,"aluminium");
        oreBlasting(pRecipeOutput, ANTIMONY_SMELTABLES,RecipeCategory.MISC, ModItems.ANTIMONY_INGOT.get(),0.25f,100,"antimony");
        oreBlasting(pRecipeOutput, ARSENIC_SMELTABLES,RecipeCategory.MISC, ModItems.ARSENIC_INGOT.get(),0.25f,100,"arsenic");
        oreBlasting(pRecipeOutput, BARIUM_SMELTABLES,RecipeCategory.MISC, ModItems.BARIUM_INGOT.get(),0.25f,100,"barium");
        oreBlasting(pRecipeOutput, BERYLLIUM_SMELTABLES,RecipeCategory.MISC, ModItems.BERYLLIUM_INGOT.get(),0.25f,100,"beryllium");

        oreBlasting(pRecipeOutput, BISMUTH_SMELTABLES,RecipeCategory.MISC, ModItems.BISMUTH_INGOT.get(),0.25f,100,"bismuth");
        oreBlasting(pRecipeOutput, CADMIUM_SMELTABLES,RecipeCategory.MISC, ModItems.CADMIUM_INGOT.get(),0.25f,100,"cadmium");
        oreBlasting(pRecipeOutput, CAESIUM_SMELTABLES,RecipeCategory.MISC, ModItems.CAESIUM_INGOT.get(),0.25f,100,"caesium");
        oreBlasting(pRecipeOutput, CALCIUM_SMELTABLES,RecipeCategory.MISC, ModItems.CALCIUM_INGOT.get(),0.25f,100,"calcium");
        oreBlasting(pRecipeOutput, CINNABAR_SMELTABLES,RecipeCategory.MISC, ModItems.CINNABAR_INGOT.get(),0.25f,100,"cinnabar");

        oreBlasting(pRecipeOutput, COBALT_SMELTABLES,RecipeCategory.MISC, ModItems.COBALT_INGOT.get(),0.25f,100,"cobalt");
        oreBlasting(pRecipeOutput, CHROMIUM_SMELTABLES,RecipeCategory.MISC, ModItems.CHROMIUM_INGOT.get(),0.25f,100,"chromium");
        oreBlasting(pRecipeOutput, GALLIUM_SMELTABLES,RecipeCategory.MISC, ModItems.GALLIUM_INGOT.get(),0.25f,100,"gallium");
        oreBlasting(pRecipeOutput, GERMANIUM_SMELTABLES,RecipeCategory.MISC, ModItems.GERMANIUM_INGOT.get(),0.25f,100,"germanium");
        oreBlasting(pRecipeOutput, HAFNIUM_SMELTABLES,RecipeCategory.MISC, ModItems.HAFNIUM_INGOT.get(),0.25f,100,"hafnium");

        oreBlasting(pRecipeOutput, INDIUM_SMELTABLES,RecipeCategory.MISC, ModItems.INDIUM_INGOT.get(),0.25f,100,"indium");
        oreBlasting(pRecipeOutput, IRIDIUM_SMELTABLES,RecipeCategory.MISC, ModItems.IRIDIUM_INGOT.get(),0.25f,100,"iridium");
        oreBlasting(pRecipeOutput, LEAD_SMELTABLES,RecipeCategory.MISC, ModItems.LEAD_INGOT.get(),0.25f,100,"lead");
        oreBlasting(pRecipeOutput, LITHIUM_SMELTABLES,RecipeCategory.MISC, ModItems.LITHIUM_INGOT.get(),0.25f,100,"lithium");
        oreBlasting(pRecipeOutput, MANGANESE_SMELTABLES,RecipeCategory.MISC, ModItems.MANGANESE_INGOT.get(),0.25f,100,"manganese");

        oreBlasting(pRecipeOutput, MAGNESIUM_SMELTABLES,RecipeCategory.MISC, ModItems.MAGNESIUM_INGOT.get(),0.25f,100,"magnesium");
        oreBlasting(pRecipeOutput, MOLYBDENUM_SMELTABLES,RecipeCategory.MISC, ModItems.MOLYBDENUM_INGOT.get(),0.25f,100,"molybdenum");
        oreBlasting(pRecipeOutput, NICKEL_SMELTABLES,RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(),0.25f,100,"nickel");
        oreBlasting(pRecipeOutput, NIOBIUM_SMELTABLES,RecipeCategory.MISC, ModItems.NIOBIUM_INGOT.get(),0.25f,100,"niobium");
        oreBlasting(pRecipeOutput, OSMIUM_SMELTABLES,RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(),0.25f,100,"osmium");

        oreBlasting(pRecipeOutput, PALLADIUM_SMELTABLES,RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(),0.25f,100,"palladium");
        oreBlasting(pRecipeOutput, PHOSPHORUS_SMELTABLES,RecipeCategory.MISC, ModItems.PHOSPHORUS_INGOT.get(),0.25f,100,"phosphorus");
        oreBlasting(pRecipeOutput, PLATINUM_SMELTABLES,RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(),0.25f,100,"platinum");
        oreBlasting(pRecipeOutput, POTASSIUM_SMELTABLES,RecipeCategory.MISC, ModItems.POTASSIUM_INGOT.get(),0.25f,100,"potassium");
        oreBlasting(pRecipeOutput, RHENIUM_SMELTABLES,RecipeCategory.MISC, ModItems.RHENIUM_INGOT.get(),0.25f,100,"rhenium");

        oreBlasting(pRecipeOutput, RHODIUM_SMELTABLES,RecipeCategory.MISC, ModItems.RHODIUM_INGOT.get(),0.25f,100,"rhodium");
        oreBlasting(pRecipeOutput, RUBIDIUM_SMELTABLES,RecipeCategory.MISC, ModItems.RUBIDIUM_INGOT.get(),0.25f,100,"rubidium");
        oreBlasting(pRecipeOutput, RUTHENIUM_SMELTABLES,RecipeCategory.MISC, ModItems.RUTHENIUM_INGOT.get(),0.25f,100,"ruthenium");
        oreBlasting(pRecipeOutput, SCANDIUM_SMELTABLES,RecipeCategory.MISC, ModItems.SCANDIUM_INGOT.get(),0.25f,100,"scandium");
        oreBlasting(pRecipeOutput, SELENIUM_SMELTABLES,RecipeCategory.MISC, ModItems.SELENIUM_INGOT.get(),0.25f,100,"selenium");

        oreBlasting(pRecipeOutput, SILICON_SMELTABLES,RecipeCategory.MISC, ModItems.SILICON_INGOT.get(),0.25f,100,"silicon");
        oreBlasting(pRecipeOutput, SILVER_SMELTABLES,RecipeCategory.MISC, ModItems.SILVER_INGOT.get(),0.25f,100,"silver");
        oreBlasting(pRecipeOutput, SODIUM_SMELTABLES,RecipeCategory.MISC, ModItems.SODIUM_INGOT.get(),0.25f,100,"sodium");
        oreBlasting(pRecipeOutput, STRONTIUM_SMELTABLES,RecipeCategory.MISC, ModItems.STRONTIUM_INGOT.get(),0.25f,100,"strontium");
        oreBlasting(pRecipeOutput, TANTALUM_SMELTABLES,RecipeCategory.MISC, ModItems.TANTALUM_INGOT.get(),0.25f,100,"tantalum");

        oreBlasting(pRecipeOutput, TECHNETIUM_SMELTABLES,RecipeCategory.MISC, ModItems.TECHNETIUM_INGOT.get(),0.25f,100,"technetium");
        oreBlasting(pRecipeOutput, TELLURIUM_SMELTABLES,RecipeCategory.MISC, ModItems.TELLURIUM_INGOT.get(),0.25f,100,"tellurium");
        oreBlasting(pRecipeOutput, THALLIUM_SMELTABLES,RecipeCategory.MISC, ModItems.THALLIUM_INGOT.get(),0.25f,100,"thallium");
        oreBlasting(pRecipeOutput, TIN_SMELTABLES,RecipeCategory.MISC, ModItems.TIN_INGOT.get(),0.25f,100,"tin");
        oreBlasting(pRecipeOutput, TITANIUM_SMELTABLES,RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(),0.25f,100,"titanium");

        oreBlasting(pRecipeOutput, TUNGSTEN_SMELTABLES,RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT.get(),0.25f,100,"tungsten");
        oreBlasting(pRecipeOutput, VANADIUM_SMELTABLES,RecipeCategory.MISC, ModItems.VANADIUM_INGOT.get(),0.25f,100,"vanadium");
        oreBlasting(pRecipeOutput, YTTRIUM_SMELTABLES,RecipeCategory.MISC, ModItems.YTTRIUM_INGOT.get(),0.25f,100,"yttrium");
        oreBlasting(pRecipeOutput, ZINC_SMELTABLES,RecipeCategory.MISC, ModItems.ZINC_INGOT.get(),0.25f,100,"zinc");
        oreBlasting(pRecipeOutput, ZIRCONIUM_SMELTABLES,RecipeCategory.MISC, ModItems.ZIRCONIUM_INGOT.get(),0.25f,100,"zirconium");
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, MegalosMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}