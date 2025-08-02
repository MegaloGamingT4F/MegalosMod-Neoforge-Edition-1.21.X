package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModAlloysCoreRecipeProvider extends ModCoreRecipeProvider implements IConditionBuilder {

    public ModAlloysCoreRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput){
        //Alloy Recipes - Dust to Dust
        //Aluminium Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AA_DUST.get(), 9)
                .pattern("aaa")
                .pattern("aaz")
                .pattern("tms")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.AA_DUST.get()), has(ModItems.AA_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AL_LI_DUST.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aal")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('l', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.AL_LI_DUST.get()), has(ModItems.AL_LI_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALNICO_DUST.get(), 9)
                .pattern("aaa")
                .pattern("aan")
                .pattern("cit")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ALNICO_DUST.get()), has(ModItems.ALNICO_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_SCANDIUM_DUST.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aas")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('s', ModItems.SCANDIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_SCANDIUM_DUST.get()), has(ModItems.ALUMINIUM_SCANDIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BIRMABRIGHT_DUST.get(), 9)
                .pattern("aaa")
                .pattern("aam")
                .pattern("mnn")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .define('n', ModItems.MANGANESE_DUST.get())
                .unlockedBy(getHasName(ModItems.BIRMABRIGHT_DUST.get()), has(ModItems.BIRMABRIGHT_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEVARDA_DUST.get(), 9)
                .pattern("aaa")
                .pattern("acc")
                .pattern("ccz")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.DEVARDA_DUST.get()), has(ModItems.DEVARDA_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DURALUMIN_DUST.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("cmx")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .define('x', ModItems.MANGANESE_DUST.get())
                .unlockedBy(getHasName(ModItems.DURALUMIN_DUST.get()), has(ModItems.DURALUMIN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HIDUMINIUM_DUST.get(), 9)
                .pattern("aca")
                .pattern("aia")
                .pattern("ana")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.HIDUMINIUM_DUST.get()), has(ModItems.HIDUMINIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HYDRONALIUM_DUST.get(), 9)
                .pattern("aaa")
                .pattern("xmx")
                .pattern("aaa")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('x', ModItems.MAGNESIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.HYDRONALIUM_DUST.get()), has(ModItems.HYDRONALIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ITALMA_DUST.get(), 9)
                .pattern("mam")
                .pattern("aaa")
                .pattern("axa")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .define('x', ModItems.MANGANESE_DUST.get())
                .unlockedBy(getHasName(ModItems.ITALMA_DUST.get()), has(ModItems.ITALMA_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGNALIUM_DUST.get(), 9)
                .pattern("aaa")
                .pattern("ama")
                .pattern("nmt")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.MAGNALIUM_DUST.get()), has(ModItems.MAGNALIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGNOX_DUST.get(), 9)
                .pattern("mam")
                .pattern("ama")
                .pattern("mam")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MAGNOX_DUST.get()), has(ModItems.MAGNOX_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NAMBE_DUST.get(), 9)
                .pattern("nac")
                .pattern("axa")
                .pattern("mao")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('o', ModItems.COBALT_DUST.get())
                .define('x', ModItems.NIOBIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.NAMBE_DUST.get()), has(ModItems.NAMBE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NITIAL_DUST.get(), 9)
                .pattern("nan")
                .pattern("nnn")
                .pattern("ttt")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.NITIAL_DUST.get()), has(ModItems.NITIAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILUMIN_DUST.get(), 9)
                .pattern("mcx")
                .pattern("aaa")
                .pattern("iai")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('x', ModItems.MAGNESIUM_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.SILUMIN_DUST.get()), has(ModItems.SILUMIN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Y_ALLOY_DUST.get(), 9)
                .pattern("aaa")
                .pattern("aac")
                .pattern("cnm")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.Y_ALLOY_DUST.get()), has(ModItems.Y_ALLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZAMAK_DUST.get(), 9)
                .pattern("zzz")
                .pattern("zzz")
                .pattern("mac")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .unlockedBy(getHasName(ModItems.ZAMAK_DUST.get()), has(ModItems.ZAMAK_DUST.get()))
                .save(pRecipeOutput);

        //Beryllium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LOCKALLOY_DUST.get(), 9)
                .pattern("bba")
                .pattern("bab")
                .pattern("abb")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('b', ModItems.BERYLLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.LOCKALLOY_DUST.get()), has(ModItems.LOCKALLOY_DUST.get()))
                .save(pRecipeOutput);
//Bismuth Alloy
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMANOL_DUST.get(), 9)
                .pattern("bbb")
                .pattern("bbm")
                .pattern("mmm")
                .define('b', ModItems.BISMUTH_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .unlockedBy(getHasName(ModItems.BISMANOL_DUST.get()), has(ModItems.BISMANOL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CERROBEND_DUST.get(), 9)
                .pattern("bbb")
                .pattern("bcb")
                .pattern("tlt")
                .define('b', ModItems.BISMUTH_DUST.get())
                .define('c', ModItems.CADMIUM_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.CERROBEND_DUST.get()), has(ModItems.CERROBEND_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CERROSAFE_DUST.get(), 9)
                .pattern("tlt")
                .pattern("bcb")
                .pattern("bbb")
                .define('b', ModItems.BISMUTH_DUST.get())
                .define('c', ModItems.CADMIUM_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.CERROSAFE_DUST.get()), has(ModItems.CERROSAFE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FIELDS_METAL_DUST.get(), 9)
                .pattern("iii")
                .pattern("bbb")
                .pattern("ttt")
                .define('b', ModItems.BISMUTH_DUST.get())
                .define('i', ModItems.INDIUM_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.FIELDS_METAL_DUST.get()), has(ModItems.FIELDS_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_METAL_DUST.get(), 9)
                .pattern("btb")
                .pattern("lbl")
                .pattern("btb")
                .define('b', ModItems.BISMUTH_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.ROSE_METAL_DUST.get()), has(ModItems.ROSE_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOODS_METAL_DUST.get(), 9)
                .pattern("bbb")
                .pattern("ltc")
                .pattern("bbb")
                .define('b', ModItems.BISMUTH_DUST.get())
                .define('c', ModItems.CADMIUM_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.WOODS_METAL_DUST.get()), has(ModItems.WOODS_METAL_DUST.get()))
                .save(pRecipeOutput);

//Chromium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMIUM_HYDRIDE_DUST.get(), 9)
                .pattern("ccc")
                .pattern("twt")
                .pattern("ccc")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('w', Items.POTION)
                .unlockedBy(getHasName(ModItems.CHROMIUM_HYDRIDE_DUST.get()), has(ModItems.CHROMIUM_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CRNISZWTI_DUST.get(), 9)
                .pattern("ccn")
                .pattern("nnn")
                .pattern("nwt")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('w', ModItems.TUNGSTEN_DUST.get())
                .unlockedBy(getHasName(ModItems.CRNISZWTI_DUST.get()), has(ModItems.CRNISZWTI_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICHROME_DUST.get(), 9)
                .pattern("nnn")
                .pattern("cnc")
                .pattern("nnn")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.NICHROME_DUST.get()), has(ModItems.NICHROME_DUST.get()))
                .save(pRecipeOutput);

//Cobalt Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELGILOY_DUST.get(), 9)
                .pattern("ccc")
                .pattern("xni")
                .pattern("myz")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .define('y', ModItems.MANGANESE_DUST.get())
                .define('z', ModItems.COAL_DUST.get())
                .unlockedBy(getHasName(ModItems.ELGILOY_DUST.get()), has(ModItems.ELGILOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MEGALLIUM_DUST.get(), 9)
                .pattern("ccx")
                .pattern("cmc")
                .pattern("xcc")
                .define('c', ModItems.COBALT_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MEGALLIUM_DUST.get()), has(ModItems.MEGALLIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STELLITE_DUST.get(), 9)
                .pattern("ccc")
                .pattern("tcx")
                .pattern("nis")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .define('t', ModItems.TUNGSTEN_DUST.get())
                .define('x', ModItems.COAL_DUST.get())
                .unlockedBy(getHasName(ModItems.STELLITE_DUST.get()), has(ModItems.STELLITE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TALONITE_DUST.get(), 9)
                .pattern("ccc")
                .pattern("tct")
                .pattern("xxx")
                .define('c', ModItems.COBALT_DUST.get())
                .define('t', ModItems.TUNGSTEN_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TALONITE_DUST.get()), has(ModItems.TALONITE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ULTIMET_DUST.get(), 9)
                .pattern("ccc")
                .pattern("icm")
                .pattern("xxn")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ULTIMET_DUST.get()), has(ModItems.ULTIMET_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VITALLIUM_DUST.get(), 9)
                .pattern("ccc")
                .pattern("icm")
                .pattern("xxn")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.VITALLIUM_DUST.get()), has(ModItems.VITALLIUM_DUST.get()))
                .save(pRecipeOutput);

//Copper Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_BRONZE_DUST.get(), 9)
                .pattern("aaa")
                .pattern("ccc")
                .pattern("aaa")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_BRONZE_DUST.get()), has(ModItems.ALUMINIUM_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARSENICAL_BRONZE_DUST.get(), 9)
                .pattern("ccc")
                .pattern("ata")
                .pattern("ctc")
                .define('a', ModItems.ARSENIC_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.ARSENICAL_BRONZE_DUST.get()),has(ModItems.ARSENICAL_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARSENICAL_COPPER_DUST.get(), 9)
                .pattern("cca")
                .pattern("cac")
                .pattern("acc")
                .define('a', ModItems.ARSENIC_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .unlockedBy(getHasName(ModItems.ARSENICAL_COPPER_DUST.get()), has(ModItems.ARSENICAL_COPPER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BELL_METAL_DUST.get(), 9)
                .pattern("tbb")
                .pattern("btb")
                .pattern("bbt")
                .define('b', ModItems.BRONZE_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.BELL_METAL_DUST.get()), has(ModItems.BELL_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BERYLLIUM_COPPER_DUST.get(), 9)
                .pattern("bcc")
                .pattern("cbc")
                .pattern("ccb")
                .define('b', ModItems.BERYLLIUM_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_COPPER_DUST.get()), has(ModItems.BERYLLIUM_COPPER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BILLON_DUST.get(), 9)
                .pattern("ccs")
                .pattern("csc")
                .pattern("scc")
                .define('c', ModItems.COBALT_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.BILLON_DUST.get()), has(ModItems.BILLON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRASS_DUST.get(), 9)
                .pattern("ccz")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.COBALT_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.BRASS_DUST.get()), has(ModItems.BRASS_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_DUST.get(), 9)
                .pattern("cct")
                .pattern("ctc")
                .pattern("tcc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.BRONZE_DUST.get()), has(ModItems.BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CALAMINE_BRASS_DUST.get(), 9)
                .pattern("ccz")
                .pattern("ccc")
                .pattern("zcc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.CALAMINE_BRASS_DUST.get()), has(ModItems.CALAMINE_BRASS_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHINESE_SILVER_DUST.get(), 9)
                .pattern("ccz")
                .pattern("ccc")
                .pattern("czc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.CHINESE_SILVER_DUST.get()), has(ModItems.CHINESE_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONSTANTAN_DUST.get(), 9)
                .pattern("ccc")
                .pattern("nnn")
                .pattern("ccc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.CONSTANTAN_DUST.get()), has(ModItems.CONSTANTAN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_HYDRIDE_DUST.get(), 9)
                .pattern("ccc")
                .pattern("cwc")
                .pattern("ccc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('w', Items.POTION)
                .unlockedBy(getHasName(ModItems.COPPER_HYDRIDE_DUST.get()),has(ModItems.COPPER_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_TUNGSTEN_DUST.get(), 9)
                .pattern("cct")
                .pattern("ctc")
                .pattern("tcc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('t', ModItems.TUNGSTEN_DUST.get())
                .unlockedBy(getHasName(ModItems.COPPER_TUNGSTEN_DUST.get()), has(ModItems.COPPER_TUNGSTEN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORINTHIAN_BRONZE_DUST.get(), 9)
                .pattern("bbb")
                .pattern("gsg")
                .pattern("bbb")
                .define('b', ModItems.BRASS_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.CORINTHIAN_BRONZE_DUST.get()), has(ModItems.CORINTHIAN_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CUNIFE_DUST.get(), 9)
                .pattern("ccc")
                .pattern("icn")
                .pattern("ccc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.CUNIFE_DUST.get()), has(ModItems.CUNIFE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CUAG_DUST.get(), 9)
                .pattern("ccs")
                .pattern("ccs")
                .pattern("scc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.CUAG_DUST.get()), has(ModItems.CUAG_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CYMBAL_ALLOY_DUST.get(), 9)
                .pattern("btb")
                .pattern("bbb")
                .pattern("btb")
                .define('c', ModItems.BELL_METAL_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.CYMBAL_ALLOY_DUST.get()), has(ModItems.CYMBAL_ALLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DUTCH_METAL_DUST.get(), 9)
                .pattern("bzb")
                .pattern("zzz")
                .pattern("bbb")
                .define('b', ModItems.BRASS_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.DUTCH_METAL_DUST.get()), has(ModItems.DUTCH_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLORENTINE_BRONZE_DUST.get(), 9)
                .pattern("bbb")
                .pattern("tba")
                .pattern("bbb")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('b', ModItems.BRONZE_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.FLORENTINE_BRONZE_DUST.get()), has(ModItems.FLORENTINE_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GILDING_METAL_DUST.get(), 9)
                .pattern("bbb")
                .pattern("zzb")
                .pattern("bbb")
                .define('b', ModItems.BRASS_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.GILDING_METAL_DUST.get()), has(ModItems.GILDING_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLUCYDUR_DUST.get(), 9)
                .pattern("bbb")
                .pattern("xix")
                .pattern("bbb")
                .define('b', ModItems.BRONZE_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('x', ModItems.BERYLLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.GLUCYDUR_DUST.get()), has(ModItems.GLUCYDUR_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GUANIN_DUST.get(), 9)
                .pattern("bbb")
                .pattern("sbb")
                .pattern("ggb")
                .define('b', ModItems.BRONZE_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.GUANIN_DUST.get()),has(ModItems.GUANIN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GUN_METAL_DUST.get(), 9)
                .pattern("zbb")
                .pattern("tbt")
                .pattern("bbz")
                .define('b', ModItems.BRONZE_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.GUN_METAL_DUST.get()), has(ModItems.GUN_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HEPATIZON_DUST.get(), 9)
                .pattern("cgc")
                .pattern("cgc")
                .pattern("csc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.HEPATIZON_DUST.get()), has(ModItems.HEPATIZON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MANGANIN_DUST.get(), 9)
                .pattern("ccc")
                .pattern("xni")
                .pattern("myz")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .define('y', ModItems.MANGANESE_DUST.get())
                .define('z', ModItems.COAL_DUST.get())
                .unlockedBy(getHasName(ModItems.MANGANIN_DUST.get()), has(ModItems.MANGANIN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MELCHIOR_DUST.get(), 9)
                .pattern("ccx")
                .pattern("cmc")
                .pattern("xcc")
                .define('c', ModItems.COBALT_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MELCHIOR_DUST.get()), has(ModItems.MELCHIOR_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUNTZ_METAL_DUST.get(), 9)
                .pattern("ccc")
                .pattern("tcx")
                .pattern("nis")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .define('t', ModItems.TUNGSTEN_DUST.get())
                .define('x', ModItems.COAL_DUST.get())
                .unlockedBy(getHasName(ModItems.MUNTZ_METAL_DUST.get()), has(ModItems.MUNTZ_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_SILVER_DUST.get(), 9)
                .pattern("ccc")
                .pattern("tct")
                .pattern("xxx")
                .define('c', ModItems.COBALT_DUST.get())
                .define('t', ModItems.TUNGSTEN_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TALONITE_DUST.get()), has(ModItems.TALONITE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NORDIC_GOLD_DUST.get(), 9)
                .pattern("ccc")
                .pattern("icm")
                .pattern("xxn")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.NORDIC_GOLD_DUST.get()), has(ModItems.NORDIC_GOLD_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORMOLU_DUST.get(), 9)
                .pattern("ccc")
                .pattern("icm")
                .pattern("xxn")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ORMOLU_DUST.get()), has(ModItems.ORMOLU_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PHOSPHOR_BRONZE_DUST.get(), 9)
                .pattern("bbb")
                .pattern("ltc")
                .pattern("bbb")
                .define('b', ModItems.BISMUTH_DUST.get())
                .define('c', ModItems.CADMIUM_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.PHOSPHOR_BRONZE_DUST.get()), has(ModItems.PHOSPHOR_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PINCHBECK_DUST.get(), 9)
                .pattern("ccc")
                .pattern("twt")
                .pattern("ccc")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('w', Items.POTION)
                .unlockedBy(getHasName(ModItems.PINCHBECK_DUST.get()),has(ModItems.PINCHBECK_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PRINCES_METAL_DUST.get(), 9)
                .pattern("ccn")
                .pattern("nnn")
                .pattern("nwt")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('w', ModItems.TUNGSTEN_DUST.get())
                .unlockedBy(getHasName(ModItems.PRINCES_METAL_DUST.get()), has(ModItems.PRINCES_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHAKUDO_DUST.get(), 9)
                .pattern("nnn")
                .pattern("cnc")
                .pattern("nnn")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.SHAKUDO_DUST.get()), has(ModItems.SHAKUDO_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILICON_BRONZE_DUST.get(), 9)
                .pattern("ccc")
                .pattern("xni")
                .pattern("myz")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .define('y', ModItems.MANGANESE_DUST.get())
                .define('z', ModItems.COAL_DUST.get())
                .unlockedBy(getHasName(ModItems.SILICON_BRONZE_DUST.get()), has(ModItems.SILICON_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPECULUM_METAL_DUST.get(), 9)
                .pattern("ccx")
                .pattern("cmc")
                .pattern("xcc")
                .define('c', ModItems.COBALT_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.SPECULUM_METAL_DUST.get()), has(ModItems.SPECULUM_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOMBAC_DUST.get(), 9)
                .pattern("ccc")
                .pattern("tcx")
                .pattern("nis")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .define('t', ModItems.TUNGSTEN_DUST.get())
                .define('x', ModItems.COAL_DUST.get())
                .unlockedBy(getHasName(ModItems.TOMBAC_DUST.get()), has(ModItems.TOMBAC_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUMBAGA_DUST.get(), 9)
                .pattern("ccc")
                .pattern("tct")
                .pattern("xxx")
                .define('c', ModItems.COBALT_DUST.get())
                .define('t', ModItems.TUNGSTEN_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TUMBAGA_DUST.get()), has(ModItems.TUMBAGA_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WHITE_BRONZE_DUST.get(), 9)
                .pattern("ccc")
                .pattern("icm")
                .pattern("xxn")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.WHITE_BRONZE_DUST.get()), has(ModItems.WHITE_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        //Gallium Alloy
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AL_GA_DUST.get(), 9)
                .pattern("aaa")
                .pattern("aag")
                .pattern("ggg")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('g', ModItems.GALLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.AL_GA_DUST.get()), has(ModItems.AL_GA_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GALFENOL_DUST.get(), 9)
                .pattern("iii")
                .pattern("gig")
                .pattern("iii")
                .define('g', ModItems.GALLIUM_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.GALFENOL_DUST.get()), has(ModItems.GALFENOL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GALINSTAN_DUST.get(), 9)
                .pattern("ggg")
                .pattern("iti")
                .pattern("ggg")
                .define('g', ModItems.GALLIUM_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.GALINSTAN_DUST.get()), has(ModItems.GALINSTAN_DUST.get()))
                .save(pRecipeOutput);

        //Gold Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COLORED_GOLD_DUST.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("scs")
                .define('c', ModItems.COPPER_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.COLORED_GOLD_DUST.get()), has(ModItems.COLORED_GOLD_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CROWN_GOLD_DUST.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("lsp")
                .define('g', ModItems.GOLD_DUST.get())
                .define('l', ModItems.PLATINUM_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .define('p', ModItems.PALLADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.CROWN_GOLD_DUST.get()), has(ModItems.CROWN_GOLD_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_DUST.get(), 9)
                .pattern("gbg")
                .pattern("isc")
                .pattern("gpg")
                .define('b', ModItems.BISMUTH_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('p', ModItems.PALLADIUM_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.ELECTRUM_DUST.get()), has(ModItems.ELECTRUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RHODITE_DUST.get(), 9)
                .pattern("grg")
                .pattern("rgr")
                .pattern("grg")
                .define('g', ModItems.GOLD_DUST.get())
                .define('r', ModItems.RHODIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.RHODITE_DUST.get()), has(ModItems.RHODITE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_DUST.get(), 9)
                .pattern("ggg")
                .pattern("cgc")
                .pattern("cgc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_DUST.get()), has(ModItems.ROSE_GOLD_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WHITE_GOLD_DUST.get(), 9)
                .pattern("ngg")
                .pattern("ggg")
                .pattern("cgz")
                .define('c', ModItems.COPPER_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.WHITE_GOLD_DUST.get()), has(ModItems.WHITE_GOLD_DUST.get()))
                .save(pRecipeOutput);

//Iron Alloys (39)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANTHRACITE_IRON_DUST.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("icc")
                .define('c', ModItems.COAL_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.ANTHRACITE_IRON_DUST.get()), has(ModItems.ANTHRACITE_IRON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BULAT_STEEL_DUST.get(), 9)
                .pattern("ici")
                .pattern("ici")
                .pattern("ici")
                .define('c', ModItems.COAL_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.BULAT_STEEL_DUST.get()), has(ModItems.BULAT_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CAST_IRON_DUST.get(), 9)
                .pattern("iii")
                .pattern("cis")
                .pattern("iii")
                .define('c', ModItems.COAL_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.CAST_IRON_DUST.get()), has(ModItems.CAST_IRON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMOLY_DUST.get(), 9)
                .pattern("iii")
                .pattern("icm")
                .pattern("ihv")
                .define('c', ModItems.COAL_DUST.get())
                .define('h', ModItems.CHROMIUM_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('v', ModItems.VANADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.CHROMOLY_DUST.get()), has(ModItems.CHROMOLY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CRUCIBLE_STEEL_DUST.get(), 9)
                .pattern("ppp")
                .pattern("ipc")
                .pattern("ipc")
                .define('c', ModItems.COAL_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('p', ModItems.PIG_IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.CRUCIBLE_STEEL_DUST.get()), has(ModItems.CRUCIBLE_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DAMASCUS_STEEL_DUST.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("csn")
                .define('c', ModItems.COAL_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_DUST.get()), has(ModItems.DAMASCUS_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DUCOL_DUST.get(), 9)
                .pattern("mxs")
                .pattern("pat")
                .pattern("nxc")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('c', ModItems.COAL_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('n', ModItems.NIOBIUM_DUST.get())
                .define('p', ModItems.PHOSPHORUS_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('x', ModItems.STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.DUCOL_DUST.get()), has(ModItems.DUCOL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELINVAR_DUST.get(), 9)
                .pattern("iii")
                .pattern("iin")
                .pattern("nnc")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.ELINVAR_DUST.get()), has(ModItems.ELINVAR_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERNICO_DUST.get(), 9)
                .pattern("cin")
                .pattern("cin")
                .pattern("cin")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.FERNICO_DUST.get()), has(ModItems.FERNICO_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROCHROMIUM_DUST.get(), 9)
                .pattern("iii")
                .pattern("ici")
                .pattern("iii")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROCHROMIUM_DUST.get()), has(ModItems.FERROCHROMIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROMAGNESIUM_DUST.get(), 9)
                .pattern("iii")
                .pattern("imi")
                .pattern("iii")
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROMAGNESIUM_DUST.get()), has(ModItems.FERROMAGNESIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROMANGANESE_DUST.get(), 9)
                .pattern("iii")
                .pattern("imi")
                .pattern("iii")
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROMANGANESE_DUST.get()), has(ModItems.FERROMANGANESE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROMOLYBDENUM_DUST.get(), 9)
                .pattern("iii")
                .pattern("imi")
                .pattern("iii")
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROMOLYBDENUM_DUST.get()), has(ModItems.FERROMOLYBDENUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERRONICKEL_DUST.get(), 9)
                .pattern("iii")
                .pattern("ini")
                .pattern("iii")
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.FERRONICKEL_DUST.get()), has(ModItems.FERRONICKEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROPHOSPHORUS_DUST.get(), 9)
                .pattern("iii")
                .pattern("ipi")
                .pattern("iii")
                .define('i', ModItems.IRON_DUST.get())
                .define('p', ModItems.PHOSPHORUS_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROPHOSPHORUS_DUST.get()), has(ModItems.FERROPHOSPHORUS_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROSILICON_DUST.get(), 9)
                .pattern("iii")
                .pattern("isi")
                .pattern("iii")
                .define('i', ModItems.IRON_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROSILICON_DUST.get()), has(ModItems.FERROSILICON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROTITANIUM_DUST.get(), 9)
                .pattern("iii")
                .pattern("iti")
                .pattern("iii")
                .define('i', ModItems.IRON_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROTITANIUM_DUST.get()), has(ModItems.FERROTITANIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROVANADIUM_DUST.get(), 9)
                .pattern("iii")
                .pattern("ivi")
                .pattern("iii")
                .define('i', ModItems.IRON_DUST.get())
                .define('v', ModItems.VANADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROVANADIUM_DUST.get()), has(ModItems.FERROVANADIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HIGHSPEED_STEEL_DUST.get(), 9)
                .pattern("svc")
                .pattern("sts")
                .pattern("cvc")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .define('t', ModItems.TUNGSTEN_DUST.get())
                .define('v', ModItems.VANADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.HIGHSPEED_STEEL_DUST.get()), has(ModItems.HIGHSPEED_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HSLA_STEEL_DUST.get(), 9)
                .pattern("vcn")
                .pattern("sxs")
                .pattern("hmz")
                .define('c', ModItems.COPPER_DUST.get())
                .define('h', ModItems.NIOBIUM_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .define('v', ModItems.VANADIUM_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .define('z', ModItems.ZIRCONIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.HSLA_STEEL_DUST.get()), has(ModItems.HSLA_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INVAR_DUST.get(), 9)
                .pattern("nnn")
                .pattern("nii")
                .pattern("iii")
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.INVAR_DUST.get()), has(ModItems.INVAR_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_HYDRIDE_DUST.get(), 9)
                .pattern("iii")
                .pattern("iwi")
                .pattern("iii")
                .define('i', ModItems.IRON_DUST.get())
                .define('w', Items.POTION)
                .unlockedBy(getHasName(ModItems.IRON_HYDRIDE_DUST.get()), has(ModItems.IRON_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KANTHAL_DUST.get(), 9)
                .pattern("iii")
                .pattern("ici")
                .pattern("cac")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.KANTHAL_DUST.get()), has(ModItems.KANTHAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KOVAR_DUST.get(), 9)
                .pattern("iii")
                .pattern("ini")
                .pattern("ici")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.KOVAR_DUST.get()), has(ModItems.KOVAR_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MARAGING_STEEL_DUST.get(), 9)
                .pattern("sss")
                .pattern("nsn")
                .pattern("mta")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MARAGING_STEEL_DUST.get()), has(ModItems.MARAGING_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSHET_STEEL_DUST.get(), 9)
                .pattern("sss")
                .pattern("tst")
                .pattern("sms")
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .define('t', ModItems.TUNGSTEN_DUST.get())
                .unlockedBy(getHasName(ModItems.MUSHET_STEEL_DUST.get()), has(ModItems.MUSHET_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_DUST.get(), 9)
                .pattern("iii")
                .pattern("isi")
                .pattern("cic")
                .define('c', ModItems.COAL_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_DUST.get()), has(ModItems.PIG_IRON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REYNOLDS_FTO_DUST.get(), 9)
                .pattern("sss")
                .pattern("mxc")
                .pattern("sss")
                .define('c', ModItems.COAL_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .define('x', ModItems.MOLYBDENUM_DUST.get())
                .unlockedBy(getHasName(ModItems.REYNOLDS_FTO_DUST.get()), has(ModItems.REYNOLDS_FTO_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILICON_STEEL_DUST.get(), 9)
                .pattern("sss")
                .pattern("xxx")
                .pattern("sss")
                .define('s', ModItems.STEEL_DUST.get())
                .define('x', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.SILICON_STEEL_DUST.get()), has(ModItems.SILICON_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_STEEL_DUST.get(), 9)
                .pattern("sxs")
                .pattern("sxs")
                .pattern("sxs")
                .define('s', ModItems.STEEL_DUST.get())
                .define('x', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.SILVER_STEEL_DUST.get()), has(ModItems.SILVER_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPIEGELEISEN_DUST.get(), 9)
                .pattern("iii")
                .pattern("mcs")
                .pattern("iii")
                .define('c', ModItems.COAL_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.SPIEGELEISEN_DUST.get()), has(ModItems.SPIEGELEISEN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPRING_STEEL_DUST.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("cpm")
                .define('c', ModItems.COAL_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('p', ModItems.PHOSPHORUS_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.SPRING_STEEL_DUST.get()), has(ModItems.SPRING_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STAINLESS_STEEL_DUST.get(), 9)
                .pattern("ssc")
                .pattern("sss")
                .pattern("nss")
                .define('c', ModItems.COPPER_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.STAINLESS_STEEL_DUST.get()), has(ModItems.STAINLESS_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STABALLOY_DUST.get(), 9)
                .pattern("sms")
                .pattern("sts")
                .pattern("sms")
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.STABALLOY_DUST.get()), has(ModItems.STABALLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_DUST.get(), 9)
                .pattern("iii")
                .pattern("ccc")
                .pattern("iii")
                .define('c', ModItems.COAL_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.STEEL_DUST.get()), has(ModItems.STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOOL_STEEL_DUST.get(), 9)
                .pattern("sts")
                .pattern("tst")
                .pattern("sms")
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .define('t', ModItems.TUNGSTEN_DUST.get())
                .unlockedBy(getHasName(ModItems.TOOL_STEEL_DUST.get()), has(ModItems.TOOL_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WEATHERING_STEEL_DUST.get(), 9)
                .pattern("sss")
                .pattern("xmy")
                .pattern("cvn")
                .define('c', ModItems.COPPER_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .define('v', ModItems.VANADIUM_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .define('y', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.WEATHERING_STEEL_DUST.get()), has(ModItems.WEATHERING_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOOTZ_STEEL_DUST.get(), 9)
                .pattern("scs")
                .pattern("sxs")
                .pattern("sas")
                .define('a', ModItems.ARSENIC_DUST.get())
                .define('c', ModItems.COAL_DUST.get())
                .define('s', ModItems.STEEL_DUST.get())
                .define('x', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.WOOTZ_STEEL_DUST.get()), has(ModItems.WOOTZ_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WROUGHT_IRON_DUST.get(), 9)
                .pattern("cii")
                .pattern("iii")
                .pattern("iic")
                .define('c', ModItems.COAL_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.WROUGHT_IRON_DUST.get()), has(ModItems.WROUGHT_IRON_DUST.get()))
                .save(pRecipeOutput);

//Lead Alloys (4)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOLYBDOCHALKOS_DUST.get(), 9)
                .pattern("lll")
                .pattern("lcl")
                .pattern("lll")
                .define('c', ModItems.COPPER_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .unlockedBy(getHasName(ModItems.MOLYBDOCHALKOS_DUST.get()), has(ModItems.MOLYBDOCHALKOS_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOLDER_DUST.get(), 9)
                .pattern("ttt")
                .pattern("lta")
                .pattern("atl")
                .define('a', ModItems.ANTIMONY_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.SOLDER_DUST.get()), has(ModItems.SOLDER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TERNE_DUST.get(), 9)
                .pattern("lll")
                .pattern("llt")
                .pattern("ttt")
                .define('l', ModItems.LEAD_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.TERNE_DUST.get()), has(ModItems.TERNE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TYPE_METAL_DUST.get(), 9)
                .pattern("lll")
                .pattern("aaa")
                .pattern("ltl")
                .define('a', ModItems.ANTIMONY_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.TYPE_METAL_DUST.get()), has(ModItems.TYPE_METAL_DUST.get()))
                .save(pRecipeOutput);

//Magnesium Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELEKTRON_DUST.get(), 9)
                .pattern("ymm")
                .pattern("mam")
                .pattern("mms")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .define('y', ModItems.YTTRIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ELEKTRON_DUST.get()), has(ModItems.ELEKTRON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TMGALZN_DUST.get(), 9)
                .pattern("mmm")
                .pattern("mam")
                .pattern("mtz")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.TMGALZN_DUST.get()), has(ModItems.TMGALZN_DUST.get()))
                .save(pRecipeOutput);

//Manganese Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MNFZ_DUST.get(), 9)
                .pattern("mim")
                .pattern("imi")
                .pattern("xic")
                .define('c', ModItems.COBALT_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('x', ModItems.CHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MNFZ_DUST.get()), has(ModItems.MNFZ_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MNSZ_DUST.get(), 9)
                .pattern("mnm")
                .pattern("nnm")
                .pattern("mmm")
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.MNSZ_DUST.get()), has(ModItems.MNSZ_DUST.get()))
                .save(pRecipeOutput);

//Mercury (Cinnabar) Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZINC_AMALGAM_DUST.get(), 9)
                .pattern("mmm")
                .pattern("sts")
                .pattern("zcz")
                .define('c', ModItems.COPPER_DUST.get())
                .define('m', ModItems.CINNABAR_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.ZINC_AMALGAM_DUST.get()), has(ModItems.ZINC_AMALGAM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ASHTADHATU_DUST.get(), 9)
                .pattern("mma")
                .pattern("clz")
                .pattern("sgt")
                .define('a', ModItems.ANTIMONY_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .define('m', ModItems.CINNABAR_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.ASHTADHATU_DUST.get()), has(ModItems.ASHTADHATU_DUST.get()))
                .save(pRecipeOutput);

        //Nickel Alloys (21)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMEL_DUST.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("ams")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.ALUMEL_DUST.get()), has(ModItems.ALUMEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRIGHTRAY_DUST.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("ncc")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.BRIGHTRAY_DUST.get()), has(ModItems.BRIGHTRAY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMEL_DUST.get(), 9)
                .pattern("nnn")
                .pattern("ncn")
                .pattern("nnn")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.CHROMEL_DUST.get()), has(ModItems.CHROMEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN_SILVER_DUST.get(), 9)
                .pattern("ggg")
                .pattern("sss")
                .pattern("ccc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.COIN_SILVER_DUST.get()), has(ModItems.COIN_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_NICKEL_DUST.get(), 9)
                .pattern("ncn")
                .pattern("cnc")
                .pattern("ncn")
                .define('c', ModItems.COPPER_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.COPPER_NICKEL_DUST.get()), has(ModItems.COPPER_NICKEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CUPRONICKEL_DUST.get(), 9)
                .pattern("cnc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.CUPRONICKEL_DUST.get()), has(ModItems.CUPRONICKEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GERMAN_SILVER_DUST.get(), 9)
                .pattern("ccc")
                .pattern("cnc")
                .pattern("znz")
                .define('c', ModItems.COPPER_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.GERMAN_SILVER_DUST.get()), has(ModItems.GERMAN_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HASTELLOY_DUST.get(), 9)
                .pattern("nmn")
                .pattern("inc")
                .pattern("nmn")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.HASTELLOY_DUST.get()), has(ModItems.HASTELLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HAUSLER_DUST.get(), 9)
                .pattern("cmc")
                .pattern("tnt")
                .pattern("cmc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.HAUSLER_DUST.get()), has(ModItems.HAUSLER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INCONEL_DUST.get(), 9)
                .pattern("nmn")
                .pattern("ncn")
                .pattern("nxn")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('x', ModItems.NIOBIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.INCONEL_DUST.get()), has(ModItems.INCONEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INCONEL_SES_DUST.get(), 9)
                .pattern("nmn")
                .pattern("nnn")
                .pattern("cxc")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('x', ModItems.NIOBIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.INCONEL_SES_DUST.get()), has(ModItems.INCONEL_SES_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MONEL_METAL_DUST.get(), 9)
                .pattern("nnn")
                .pattern("cnc")
                .pattern("mni")
                .define('c', ModItems.COPPER_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MANGANESE_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.MONEL_METAL_DUST.get()), has(ModItems.MONEL_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_CARBON_DUST.get(), 9)
                .pattern("nnn")
                .pattern("iii")
                .pattern("cic")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.NICKEL_CARBON_DUST.get()), has(ModItems.NICKEL_CARBON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_HYDRIDE_DUST.get(), 9)
                .pattern("nnn")
                .pattern("nwn")
                .pattern("nnn")
                .define('n', ModItems.NICKEL_DUST.get())
                .define('w', Items.POTION)
                .unlockedBy(getHasName(ModItems.NICKEL_HYDRIDE_DUST.get()), has(ModItems.NICKEL_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICROSIL_DUST.get(), 9)
                .pattern("nnn")
                .pattern("cmc")
                .pattern("csc")
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('m', ModItems.MAGNESIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.NICROSIL_DUST.get()), has(ModItems.NICROSIL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NIMONIC_DUST.get(), 9)
                .pattern("nnn")
                .pattern("ctc")
                .pattern("can")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.NIMONIC_DUST.get()), has(ModItems.NIMONIC_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NISIL_DUST.get(), 9)
                .pattern("nns")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NICKEL_DUST.get())
                .define('s', ModItems.SILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.NISIL_DUST.get()), has(ModItems.NISIL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NITINOL_DUST.get(), 9)
                .pattern("ntn")
                .pattern("ttt")
                .pattern("nnn")
                .define('n', ModItems.NICKEL_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.NITINOL_DUST.get()), has(ModItems.NITINOL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MU_METAL_DUST.get(), 9)
                .pattern("nin")
                .pattern("nin")
                .pattern("ncn")
                .define('c', ModItems.COPPER_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.MU_METAL_DUST.get()), has(ModItems.MU_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PERMALLOY_DUST.get(), 9)
                .pattern("nnn")
                .pattern("nin")
                .pattern("nin")
                .define('i', ModItems.IRON_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.PERMALLOY_DUST.get()), has(ModItems.PERMALLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SUPERMALLOY_DUST.get(), 9)
                .pattern("ini")
                .pattern("nmn")
                .pattern("nnn")
                .define('i', ModItems.IRON_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.SUPERMALLOY_DUST.get()), has(ModItems.SUPERMALLOY_DUST.get()))
                .save(pRecipeOutput);

//Potassium Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NAK_DUST.get(), 9)
                .pattern("ppp")
                .pattern("sss")
                .pattern("ppp")
                .define('p', ModItems.POTASSIUM_DUST.get())
                .define('s', ModItems.SODIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.NAK_DUST.get()), has(ModItems.NAK_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KLI_DUST.get(), 9)
                .pattern("ppp")
                .pattern("lll")
                .pattern("ppp")
                .define('l', ModItems.LITHIUM_DUST.get())
                .define('p', ModItems.POTASSIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.KLI_DUST.get()), has(ModItems.KLI_DUST.get()))
                .save(pRecipeOutput);

//Rhodium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PSEUDO_PALLADIUM_DUST.get(), 9)
                .pattern("rrs")
                .pattern("rsr")
                .pattern("srr")
                .define('r', ModItems.RHODIUM_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.PSEUDO_PALLADIUM_DUST.get()), has(ModItems.PSEUDO_PALLADIUM_DUST.get()))
                .save(pRecipeOutput);

//Scandium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCANDIUM_HYDRIDE_DUST.get(), 9)
                .pattern("sss")
                .pattern("sws")
                .pattern("sss")
                .define('s', ModItems.SCANDIUM_DUST.get())
                .define('w', Items.POTION)
                .unlockedBy(getHasName(ModItems.SCANDIUM_HYDRIDE_DUST.get()), has(ModItems.SCANDIUM_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);

//Silver Alloys (9)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARGENTIUM_STERLING_SILVER_DUST.get(), 9)
                .pattern("sss")
                .pattern("ssc")
                .pattern("cgg")
                .define('c', ModItems.COPPER_DUST.get())
                .define('g', ModItems.GERMANIUM_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.ARGENTIUM_STERLING_SILVER_DUST.get()), has(ModItems.ARGENTIUM_STERLING_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRITANNIA_SILVER_DUST.get(), 9)
                .pattern("sss")
                .pattern("sca")
                .pattern("sac")
                .define('a', ModItems.ANTIMONY_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.BRITANNIA_SILVER_DUST.get()), has(ModItems.BRITANNIA_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DORE_DUST.get(), 9)
                .pattern("gsp")
                .pattern("sss")
                .pattern("psg")
                .define('g', ModItems.GOLD_DUST.get())
                .define('p', ModItems.PLATINUM_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.DORE_DUST.get()), has(ModItems.DORE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DYMALLOY_DUST.get(), 9)
                .pattern("ssc")
                .pattern("sss")
                .pattern("css")
                .define('c', ModItems.COPPER_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.DYMALLOY_DUST.get()), has(ModItems.DYMALLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLOID_DUST.get(), 9)
                .pattern("css")
                .pattern("sss")
                .pattern("ssg")
                .define('c', ModItems.COPPER_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.GOLOID_DUST.get()), has(ModItems.GOLOID_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_SILVER_DUST.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sps")
                .define('p', ModItems.PLATINUM_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_SILVER_DUST.get()), has(ModItems.PLATINUM_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHIBUICHI_DUST.get(), 9)
                .pattern("ccc")
                .pattern("gcg")
                .pattern("gag")
                .define('a', ModItems.ARSENIC_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('g', ModItems.GOLD_DUST.get())
                .unlockedBy(getHasName(ModItems.SHIBUICHI_DUST.get()), has(ModItems.SHIBUICHI_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STERLING_SILVER_DUST.get(), 9)
                .pattern("scs")
                .pattern("sss")
                .pattern("scs")
                .define('c', ModItems.COPPER_DUST.get())
                .define('s', ModItems.SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.STERLING_SILVER_DUST.get()), has(ModItems.STERLING_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIBETAN_SILVER_DUST.get(), 9)
                .pattern("nzc")
                .pattern("ncc")
                .pattern("nzc")
                .define('c', ModItems.COPPER_DUST.get())
                .define('n', ModItems.NICKEL_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.TIBETAN_SILVER_DUST.get()), has(ModItems.TIBETAN_SILVER_DUST.get()))
                .save(pRecipeOutput);

//Tin Alloys (4)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BABBITT_DUST.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("atn")
                .define('a', ModItems.ANTIMONY_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .define('n', ModItems.TIN_DUST.get())
                .define('t', ModItems.ARSENIC_DUST.get())
                .unlockedBy(getHasName(ModItems.BABBITT_DUST.get()), has(ModItems.BABBITT_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRITANNIUM_DUST.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("tac")
                .define('a', ModItems.ANTIMONY_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.BRITANNIUM_DUST.get()), has(ModItems.BRITANNIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PEWTER_DUST.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("abc")
                .define('a', ModItems.ANTIMONY_DUST.get())
                .define('b', ModItems.BISMUTH_DUST.get())
                .define('c', ModItems.COPPER_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.PEWTER_DUST.get()), has(ModItems.PEWTER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.QUEENS_METAL_DUST.get(), 9)
                .pattern("ttt")
                .pattern("alb")
                .pattern("ttt")
                .define('a', ModItems.ANTIMONY_DUST.get())
                .define('b', ModItems.BISMUTH_DUST.get())
                .define('l', ModItems.LEAD_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .unlockedBy(getHasName(ModItems.QUEENS_METAL_DUST.get()), has(ModItems.QUEENS_METAL_DUST.get()))
                .save(pRecipeOutput);

//Titanium Alloys (6)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAL_FV_DUST.get(), 9)
                .pattern("ttt")
                .pattern("via")
                .pattern("ttt")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('i', ModItems.IRON_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('v', ModItems.VANADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.SAL_FV_DUST.get()), has(ModItems.SAL_FV_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BETA_C_DUST.get(), 9)
                .pattern("ttt")
                .pattern("tma")
                .pattern("zcv")
                .define('a', ModItems.ALUMINIUM_DUST.get())
                .define('c', ModItems.CHROMIUM_DUST.get())
                .define('m', ModItems.MOLYBDENUM_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('v', ModItems.VANADIUM_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.BETA_C_DUST.get()), has(ModItems.BETA_C_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GUM_METAL_DUST.get(), 9)
                .pattern("ttt")
                .pattern("nxz")
                .pattern("ttt")
                .define('n', ModItems.NIOBIUM_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .define('x', ModItems.TUNGSTEN_DUST.get())
                .define('z', ModItems.ZINC_DUST.get())
                .unlockedBy(getHasName(ModItems.GUM_METAL_DUST.get()), has(ModItems.GUM_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_GOLD_DUST.get(), 9)
                .pattern("ttt")
                .pattern("tgt")
                .pattern("ttt")
                .define('g', ModItems.GOLD_DUST.get())
                .define('t', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_GOLD_DUST.get()), has(ModItems.TITANIUM_GOLD_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_HYDRIDE_DUST.get(), 9)
                .pattern("ttt")
                .pattern("twt")
                .pattern("ttt")
                .define('t', ModItems.GOLD_DUST.get())
                .define('w', Items.POTION)
                .unlockedBy(getHasName(ModItems.TITANIUM_HYDRIDE_DUST.get()), has(ModItems.TITANIUM_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_NITRIDE_DUST.get(), 9)
                .pattern("ttt")
                .pattern("tgt")
                .pattern("ttt")
                .define('g', Items.GUNPOWDER)
                .define('t', ModItems.TITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_NITRIDE_DUST.get()), has(ModItems.TITANIUM_NITRIDE_DUST.get()))
                .save(pRecipeOutput);

//Zirconium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCALOY_DUST.get(), 9)
                .pattern("zzz")
                .pattern("zzz")
                .pattern("tzn")
                .define('n', ModItems.NIOBIUM_DUST.get())
                .define('t', ModItems.TIN_DUST.get())
                .define('z', ModItems.ZIRCONIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ZIRCALOY_DUST.get()), has(ModItems.ZIRCALOY_DUST.get()))
                .save(pRecipeOutput);

        //Alloy Recipes - Dust to Nugget
        //Aluminium Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AA_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.AA_DUST.get())
                .unlockedBy(getHasName(ModItems.AA_DUST.get()), has(ModItems.AA_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AL_LI_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.AL_LI_DUST.get())
                .unlockedBy(getHasName(ModItems.AL_LI_DUST.get()), has(ModItems.AL_LI_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALNICO_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ALNICO_DUST.get())
                .unlockedBy(getHasName(ModItems.ALNICO_DUST.get()), has(ModItems.ALNICO_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_SCANDIUM_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ALUMINIUM_SCANDIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_SCANDIUM_DUST.get()), has(ModItems.ALUMINIUM_SCANDIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BIRMABRIGHT_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.BIRMABRIGHT_DUST.get())
                .unlockedBy(getHasName(ModItems.BIRMABRIGHT_DUST.get()), has(ModItems.BIRMABRIGHT_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEVARDA_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.DEVARDA_DUST.get())
                .unlockedBy(getHasName(ModItems.DEVARDA_DUST.get()), has(ModItems.DEVARDA_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DURALUMIN_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.DURALUMIN_DUST.get())
                .unlockedBy(getHasName(ModItems.DURALUMIN_DUST.get()), has(ModItems.DURALUMIN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HIDUMINIUM_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.HIDUMINIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.HIDUMINIUM_DUST.get()), has(ModItems.HIDUMINIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HYDRONALIUM_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.HYDRONALIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.HYDRONALIUM_DUST.get()), has(ModItems.HYDRONALIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ITALMA_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ITALMA_DUST.get())
                .unlockedBy(getHasName(ModItems.ITALMA_DUST.get()), has(ModItems.ITALMA_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGNALIUM_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.MAGNALIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MAGNALIUM_DUST.get()), has(ModItems.MAGNALIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGNOX_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.MAGNOX_DUST.get())
                .unlockedBy(getHasName(ModItems.MAGNOX_DUST.get()), has(ModItems.MAGNOX_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NAMBE_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.NAMBE_DUST.get())
                .unlockedBy(getHasName(ModItems.NAMBE_DUST.get()), has(ModItems.NAMBE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NITIAL_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.NITIAL_DUST.get())
                .unlockedBy(getHasName(ModItems.NITIAL_DUST.get()), has(ModItems.NITIAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILUMIN_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.SILUMIN_DUST.get())
                .unlockedBy(getHasName(ModItems.SILUMIN_DUST.get()), has(ModItems.SILUMIN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Y_ALLOY_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.Y_ALLOY_DUST.get())
                .unlockedBy(getHasName(ModItems.Y_ALLOY_DUST.get()), has(ModItems.Y_ALLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZAMAK_NUGGET.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ZAMAK_DUST.get())
                .unlockedBy(getHasName(ModItems.ZAMAK_DUST.get()), has(ModItems.ZAMAK_DUST.get()))
                .save(pRecipeOutput);

//Beryllium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LOCKALLOY_NUGGET.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.LOCKALLOY_DUST.get())
                .unlockedBy(getHasName(ModItems.LOCKALLOY_DUST.get()), has(ModItems.LOCKALLOY_DUST.get()))
                .save(pRecipeOutput);
//Bismuth Alloy
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMANOL_NUGGET.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.BISMANOL_DUST.get())
                .unlockedBy(getHasName(ModItems.BISMANOL_DUST.get()), has(ModItems.BISMANOL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CERROBEND_NUGGET.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.CERROBEND_DUST.get())
                .unlockedBy(getHasName(ModItems.CERROBEND_DUST.get()), has(ModItems.CERROBEND_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CERROSAFE_NUGGET.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.CERROSAFE_DUST.get())
                .unlockedBy(getHasName(ModItems.CERROSAFE_DUST.get()), has(ModItems.CERROSAFE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FIELDS_METAL_NUGGET.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.FIELDS_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.FIELDS_METAL_DUST.get()), has(ModItems.FIELDS_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_METAL_NUGGET.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.ROSE_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.ROSE_METAL_DUST.get()), has(ModItems.ROSE_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOODS_METAL_NUGGET.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.WOODS_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.WOODS_METAL_DUST.get()), has(ModItems.WOODS_METAL_DUST.get()))
                .save(pRecipeOutput);

//Chromium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMIUM_HYDRIDE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CHROMIUM_HYDRIDE_DUST.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_HYDRIDE_DUST.get()), has(ModItems.CHROMIUM_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CRNISZWTI_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CRNISZWTI_DUST.get())
                .unlockedBy(getHasName(ModItems.CRNISZWTI_DUST.get()), has(ModItems.CRNISZWTI_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICHROME_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.NICHROME_DUST.get())
                .unlockedBy(getHasName(ModItems.NICHROME_DUST.get()), has(ModItems.NICHROME_DUST.get()))
                .save(pRecipeOutput);

//Cobalt Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELGILOY_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ELGILOY_DUST.get())
                .unlockedBy(getHasName(ModItems.ELGILOY_DUST.get()), has(ModItems.ELGILOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MEGALLIUM_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MEGALLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.MEGALLIUM_DUST.get()), has(ModItems.MEGALLIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STELLITE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.STELLITE_DUST.get())
                .unlockedBy(getHasName(ModItems.STELLITE_DUST.get()), has(ModItems.STELLITE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TALONITE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.TALONITE_DUST.get())
                .unlockedBy(getHasName(ModItems.TALONITE_DUST.get()), has(ModItems.TALONITE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ULTIMET_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ULTIMET_DUST.get())
                .unlockedBy(getHasName(ModItems.ULTIMET_DUST.get()), has(ModItems.ULTIMET_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VITALLIUM_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.VITALLIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.VITALLIUM_DUST.get()), has(ModItems.VITALLIUM_DUST.get()))
                .save(pRecipeOutput);

//Copper Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_BRONZE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ALUMINIUM_BRONZE_DUST.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_BRONZE_DUST.get()), has(ModItems.ALUMINIUM_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARSENICAL_BRONZE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ARSENICAL_BRONZE_DUST.get())
                .unlockedBy(getHasName(ModItems.ARSENICAL_BRONZE_DUST.get()),has(ModItems.ARSENICAL_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARSENICAL_COPPER_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ARSENICAL_COPPER_DUST.get())
                .unlockedBy(getHasName(ModItems.ARSENICAL_COPPER_DUST.get()), has(ModItems.ARSENICAL_COPPER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BELL_METAL_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BELL_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.BELL_METAL_DUST.get()), has(ModItems.BELL_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BERYLLIUM_COPPER_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BERYLLIUM_COPPER_DUST.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_COPPER_DUST.get()), has(ModItems.BERYLLIUM_COPPER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BILLON_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BILLON_DUST.get())
                .unlockedBy(getHasName(ModItems.BILLON_DUST.get()), has(ModItems.BILLON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRASS_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BRASS_DUST.get())
                .unlockedBy(getHasName(ModItems.BRASS_DUST.get()), has(ModItems.BRASS_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BRONZE_DUST.get())
                .unlockedBy(getHasName(ModItems.BRONZE_DUST.get()), has(ModItems.BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CALAMINE_BRASS_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CALAMINE_BRASS_DUST.get())
                .unlockedBy(getHasName(ModItems.CALAMINE_BRASS_DUST.get()), has(ModItems.CALAMINE_BRASS_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHINESE_SILVER_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CHINESE_SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.CHINESE_SILVER_DUST.get()), has(ModItems.CHINESE_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONSTANTAN_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('b', ModItems.CONSTANTAN_DUST.get())
                .unlockedBy(getHasName(ModItems.CONSTANTAN_DUST.get()), has(ModItems.CONSTANTAN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_HYDRIDE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.COPPER_HYDRIDE_DUST.get())
                .unlockedBy(getHasName(ModItems.COPPER_HYDRIDE_DUST.get()),has(ModItems.COPPER_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_TUNGSTEN_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.COPPER_TUNGSTEN_DUST.get())
                .unlockedBy(getHasName(ModItems.COPPER_TUNGSTEN_DUST.get()), has(ModItems.COPPER_TUNGSTEN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORINTHIAN_BRONZE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CORINTHIAN_BRONZE_DUST.get())
                .unlockedBy(getHasName(ModItems.CORINTHIAN_BRONZE_DUST.get()), has(ModItems.CORINTHIAN_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CUNIFE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CUNIFE_DUST.get())
                .unlockedBy(getHasName(ModItems.CUNIFE_DUST.get()), has(ModItems.CUNIFE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CUAG_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CUAG_DUST.get())
                .unlockedBy(getHasName(ModItems.CUAG_DUST.get()), has(ModItems.CUAG_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CYMBAL_ALLOY_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CYMBAL_ALLOY_DUST.get())
                .unlockedBy(getHasName(ModItems.CYMBAL_ALLOY_DUST.get()), has(ModItems.CYMBAL_ALLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DUTCH_METAL_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.DUTCH_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.DUTCH_METAL_DUST.get()), has(ModItems.DUTCH_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLORENTINE_BRONZE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.FLORENTINE_BRONZE_DUST.get())
                .unlockedBy(getHasName(ModItems.FLORENTINE_BRONZE_DUST.get()), has(ModItems.FLORENTINE_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GILDING_METAL_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.GILDING_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.GILDING_METAL_DUST.get()), has(ModItems.GILDING_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLUCYDUR_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('b', ModItems.GLUCYDUR_DUST.get())
                .unlockedBy(getHasName(ModItems.GLUCYDUR_DUST.get()), has(ModItems.GLUCYDUR_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GUANIN_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.GUANIN_DUST.get())
                .unlockedBy(getHasName(ModItems.GUANIN_DUST.get()),has(ModItems.GUANIN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GUN_METAL_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.GUN_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.GUN_METAL_DUST.get()), has(ModItems.GUN_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HEPATIZON_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.HEPATIZON_DUST.get())
                .unlockedBy(getHasName(ModItems.HEPATIZON_DUST.get()), has(ModItems.HEPATIZON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MANGANIN_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MANGANIN_DUST.get())
                .unlockedBy(getHasName(ModItems.MANGANIN_DUST.get()), has(ModItems.MANGANIN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MELCHIOR_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MELCHIOR_DUST.get())
                .unlockedBy(getHasName(ModItems.MELCHIOR_DUST.get()), has(ModItems.MELCHIOR_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUNTZ_METAL_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MUNTZ_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.MUNTZ_METAL_DUST.get()), has(ModItems.MUNTZ_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_SILVER_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.NICKEL_SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.TALONITE_DUST.get()), has(ModItems.TALONITE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NORDIC_GOLD_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.NORDIC_GOLD_DUST.get())
                .unlockedBy(getHasName(ModItems.NORDIC_GOLD_DUST.get()), has(ModItems.NORDIC_GOLD_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORMOLU_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ORMOLU_DUST.get())
                .unlockedBy(getHasName(ModItems.ORMOLU_DUST.get()), has(ModItems.ORMOLU_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PHOSPHOR_BRONZE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.PHOSPHOR_BRONZE_DUST.get())
                .unlockedBy(getHasName(ModItems.PHOSPHOR_BRONZE_DUST.get()), has(ModItems.PHOSPHOR_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PINCHBECK_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.PINCHBECK_DUST.get())
                .unlockedBy(getHasName(ModItems.PINCHBECK_DUST.get()),has(ModItems.PINCHBECK_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PRINCES_METAL_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.PRINCES_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.PRINCES_METAL_DUST.get()), has(ModItems.PRINCES_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHAKUDO_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.SHAKUDO_DUST.get())
                .unlockedBy(getHasName(ModItems.SHAKUDO_DUST.get()), has(ModItems.SHAKUDO_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILICON_BRONZE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.SILICON_BRONZE_DUST.get())
                .unlockedBy(getHasName(ModItems.SILICON_BRONZE_DUST.get()), has(ModItems.SILICON_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPECULUM_METAL_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.SPECULUM_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.SPECULUM_METAL_DUST.get()), has(ModItems.SPECULUM_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOMBAC_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.TOMBAC_DUST.get())
                .unlockedBy(getHasName(ModItems.TOMBAC_DUST.get()), has(ModItems.TOMBAC_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUMBAGA_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.TUMBAGA_DUST.get())
                .unlockedBy(getHasName(ModItems.TUMBAGA_DUST.get()), has(ModItems.TUMBAGA_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WHITE_BRONZE_NUGGET.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.WHITE_BRONZE_DUST.get())
                .unlockedBy(getHasName(ModItems.WHITE_BRONZE_DUST.get()), has(ModItems.WHITE_BRONZE_DUST.get()))
                .save(pRecipeOutput);

        //Gallium Alloy
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AL_GA_NUGGET.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.AL_GA_DUST.get())
                .unlockedBy(getHasName(ModItems.AL_GA_DUST.get()), has(ModItems.AL_GA_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GALFENOL_NUGGET.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.GALFENOL_DUST.get())
                .unlockedBy(getHasName(ModItems.GALFENOL_DUST.get()), has(ModItems.GALFENOL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GALINSTAN_NUGGET.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.GALINSTAN_DUST.get())
                .unlockedBy(getHasName(ModItems.GALINSTAN_DUST.get()), has(ModItems.GALINSTAN_DUST.get()))
                .save(pRecipeOutput);

        //Gold Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COLORED_GOLD_NUGGET.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.COLORED_GOLD_DUST.get())
                .unlockedBy(getHasName(ModItems.COLORED_GOLD_DUST.get()), has(ModItems.COLORED_GOLD_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CROWN_GOLD_NUGGET.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.CROWN_GOLD_DUST.get())
                .unlockedBy(getHasName(ModItems.CROWN_GOLD_DUST.get()), has(ModItems.CROWN_GOLD_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_NUGGET.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.ELECTRUM_DUST.get())
                .unlockedBy(getHasName(ModItems.ELECTRUM_DUST.get()), has(ModItems.ELECTRUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RHODITE_NUGGET.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.RHODITE_DUST.get())
                .unlockedBy(getHasName(ModItems.RHODITE_DUST.get()), has(ModItems.RHODITE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.ROSE_GOLD_DUST.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_DUST.get()), has(ModItems.ROSE_GOLD_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WHITE_GOLD_NUGGET.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.WHITE_GOLD_DUST.get())
                .unlockedBy(getHasName(ModItems.WHITE_GOLD_DUST.get()), has(ModItems.WHITE_GOLD_DUST.get()))
                .save(pRecipeOutput);

//Iron Alloys (39)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANTHRACITE_IRON_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.ANTHRACITE_IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.ANTHRACITE_IRON_DUST.get()), has(ModItems.ANTHRACITE_IRON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BULAT_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.BULAT_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.BULAT_STEEL_DUST.get()), has(ModItems.BULAT_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CAST_IRON_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.CAST_IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.CAST_IRON_DUST.get()), has(ModItems.CAST_IRON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMOLY_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('c', ModItems.CHROMOLY_DUST.get())
                .unlockedBy(getHasName(ModItems.CHROMOLY_DUST.get()), has(ModItems.CHROMOLY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CRUCIBLE_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.CRUCIBLE_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.CRUCIBLE_STEEL_DUST.get()), has(ModItems.CRUCIBLE_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DAMASCUS_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.DAMASCUS_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_DUST.get()), has(ModItems.DAMASCUS_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DUCOL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.DUCOL_DUST.get())
                .unlockedBy(getHasName(ModItems.DUCOL_DUST.get()), has(ModItems.DUCOL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELINVAR_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.ELINVAR_DUST.get())
                .unlockedBy(getHasName(ModItems.ELINVAR_DUST.get()), has(ModItems.ELINVAR_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERNICO_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERNICO_DUST.get())
                .unlockedBy(getHasName(ModItems.FERNICO_DUST.get()), has(ModItems.FERNICO_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROCHROMIUM_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROCHROMIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROCHROMIUM_DUST.get()), has(ModItems.FERROCHROMIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROMAGNESIUM_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROMAGNESIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROMAGNESIUM_DUST.get()), has(ModItems.FERROMAGNESIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROMANGANESE_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROMANGANESE_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROMANGANESE_DUST.get()), has(ModItems.FERROMANGANESE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROMOLYBDENUM_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROMOLYBDENUM_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROMOLYBDENUM_DUST.get()), has(ModItems.FERROMOLYBDENUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERRONICKEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERRONICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.FERRONICKEL_DUST.get()), has(ModItems.FERRONICKEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROPHOSPHORUS_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROPHOSPHORUS_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROPHOSPHORUS_DUST.get()), has(ModItems.FERROPHOSPHORUS_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROSILICON_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROSILICON_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROSILICON_DUST.get()), has(ModItems.FERROSILICON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROTITANIUM_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROTITANIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROTITANIUM_DUST.get()), has(ModItems.FERROTITANIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROVANADIUM_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROVANADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.FERROVANADIUM_DUST.get()), has(ModItems.FERROVANADIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HIGHSPEED_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.HIGHSPEED_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.HIGHSPEED_STEEL_DUST.get()), has(ModItems.HIGHSPEED_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HSLA_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.HSLA_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.HSLA_STEEL_DUST.get()), has(ModItems.HSLA_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INVAR_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.INVAR_DUST.get())
                .unlockedBy(getHasName(ModItems.INVAR_DUST.get()), has(ModItems.INVAR_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_HYDRIDE_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.IRON_HYDRIDE_DUST.get())
                .unlockedBy(getHasName(ModItems.IRON_HYDRIDE_DUST.get()), has(ModItems.IRON_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KANTHAL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.KANTHAL_DUST.get())
                .unlockedBy(getHasName(ModItems.KANTHAL_DUST.get()), has(ModItems.KANTHAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KOVAR_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.KOVAR_DUST.get())
                .unlockedBy(getHasName(ModItems.KOVAR_DUST.get()), has(ModItems.KOVAR_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MARAGING_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.MARAGING_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.MARAGING_STEEL_DUST.get()), has(ModItems.MARAGING_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSHET_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.MUSHET_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.MUSHET_STEEL_DUST.get()), has(ModItems.MUSHET_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.PIG_IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_DUST.get()), has(ModItems.PIG_IRON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REYNOLDS_FTO_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.REYNOLDS_FTO_DUST.get())
                .unlockedBy(getHasName(ModItems.REYNOLDS_FTO_DUST.get()), has(ModItems.REYNOLDS_FTO_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILICON_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SILICON_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.SILICON_STEEL_DUST.get()), has(ModItems.SILICON_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SILVER_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.SILVER_STEEL_DUST.get()), has(ModItems.SILVER_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPIEGELEISEN_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SPIEGELEISEN_DUST.get())
                .unlockedBy(getHasName(ModItems.SPIEGELEISEN_DUST.get()), has(ModItems.SPIEGELEISEN_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPRING_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SPRING_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.SPRING_STEEL_DUST.get()), has(ModItems.SPRING_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STAINLESS_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.STAINLESS_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.STAINLESS_STEEL_DUST.get()), has(ModItems.STAINLESS_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STABALLOY_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.STABALLOY_DUST.get())
                .unlockedBy(getHasName(ModItems.STABALLOY_DUST.get()), has(ModItems.STABALLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.STEEL_DUST.get()), has(ModItems.STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOOL_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.TOOL_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.TOOL_STEEL_DUST.get()), has(ModItems.TOOL_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WEATHERING_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.WEATHERING_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.WEATHERING_STEEL_DUST.get()), has(ModItems.WEATHERING_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOOTZ_STEEL_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.WOOTZ_STEEL_DUST.get())
                .unlockedBy(getHasName(ModItems.WOOTZ_STEEL_DUST.get()), has(ModItems.WOOTZ_STEEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WROUGHT_IRON_NUGGET.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.WROUGHT_IRON_DUST.get())
                .unlockedBy(getHasName(ModItems.WROUGHT_IRON_DUST.get()), has(ModItems.WROUGHT_IRON_DUST.get()))
                .save(pRecipeOutput);

//Lead Alloys (4)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOLYBDOCHALKOS_NUGGET.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.MOLYBDOCHALKOS_DUST.get())
                .unlockedBy(getHasName(ModItems.MOLYBDOCHALKOS_DUST.get()), has(ModItems.MOLYBDOCHALKOS_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOLDER_NUGGET.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.SOLDER_DUST.get())
                .unlockedBy(getHasName(ModItems.SOLDER_DUST.get()), has(ModItems.SOLDER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TERNE_NUGGET.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.TERNE_DUST.get())
                .unlockedBy(getHasName(ModItems.TERNE_DUST.get()), has(ModItems.TERNE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TYPE_METAL_NUGGET.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.TYPE_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.TYPE_METAL_DUST.get()), has(ModItems.TYPE_METAL_DUST.get()))
                .save(pRecipeOutput);

//Magnesium Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELEKTRON_NUGGET.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.ELEKTRON_DUST.get())
                .unlockedBy(getHasName(ModItems.ELEKTRON_DUST.get()), has(ModItems.ELEKTRON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TMGALZN_NUGGET.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.TMGALZN_DUST.get())
                .unlockedBy(getHasName(ModItems.TMGALZN_DUST.get()), has(ModItems.TMGALZN_DUST.get()))
                .save(pRecipeOutput);

//Manganese Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MNFZ_NUGGET.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.MNFZ_DUST.get())
                .unlockedBy(getHasName(ModItems.MNFZ_DUST.get()), has(ModItems.MNFZ_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MNSZ_NUGGET.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.MNSZ_DUST.get())
                .unlockedBy(getHasName(ModItems.MNSZ_DUST.get()), has(ModItems.MNSZ_DUST.get()))
                .save(pRecipeOutput);

//Mercury (Cinnabar) Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZINC_AMALGAM_NUGGET.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.ZINC_AMALGAM_DUST.get())
                .unlockedBy(getHasName(ModItems.ZINC_AMALGAM_DUST.get()), has(ModItems.ZINC_AMALGAM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ASHTADHATU_NUGGET.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.ASHTADHATU_DUST.get())
                .unlockedBy(getHasName(ModItems.ASHTADHATU_DUST.get()), has(ModItems.ASHTADHATU_DUST.get()))
                .save(pRecipeOutput);

        //Nickel Alloys (21)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMEL_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.ALUMEL_DUST.get())
                .unlockedBy(getHasName(ModItems.ALUMEL_DUST.get()), has(ModItems.ALUMEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRIGHTRAY_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.BRIGHTRAY_DUST.get())
                .unlockedBy(getHasName(ModItems.BRIGHTRAY_DUST.get()), has(ModItems.BRIGHTRAY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMEL_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.CHROMEL_DUST.get())
                .unlockedBy(getHasName(ModItems.CHROMEL_DUST.get()), has(ModItems.CHROMEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN_SILVER_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.COIN_SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.COIN_SILVER_DUST.get()), has(ModItems.COIN_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_NICKEL_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.COPPER_NICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.COPPER_NICKEL_DUST.get()), has(ModItems.COPPER_NICKEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CUPRONICKEL_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.CUPRONICKEL_DUST.get())
                .unlockedBy(getHasName(ModItems.CUPRONICKEL_DUST.get()), has(ModItems.CUPRONICKEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GERMAN_SILVER_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.GERMAN_SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.GERMAN_SILVER_DUST.get()), has(ModItems.GERMAN_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HASTELLOY_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.HASTELLOY_DUST.get())
                .unlockedBy(getHasName(ModItems.HASTELLOY_DUST.get()), has(ModItems.HASTELLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HAUSLER_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.HAUSLER_DUST.get())
                .unlockedBy(getHasName(ModItems.HAUSLER_DUST.get()), has(ModItems.HAUSLER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INCONEL_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.INCONEL_DUST.get())
                .unlockedBy(getHasName(ModItems.INCONEL_DUST.get()), has(ModItems.INCONEL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INCONEL_SES_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.INCONEL_SES_DUST.get())
                .unlockedBy(getHasName(ModItems.INCONEL_SES_DUST.get()), has(ModItems.INCONEL_SES_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MONEL_METAL_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.MONEL_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.MONEL_METAL_DUST.get()), has(ModItems.MONEL_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_CARBON_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NICKEL_CARBON_DUST.get())
                .unlockedBy(getHasName(ModItems.NICKEL_CARBON_DUST.get()), has(ModItems.NICKEL_CARBON_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_HYDRIDE_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NICKEL_HYDRIDE_DUST.get())
                .unlockedBy(getHasName(ModItems.NICKEL_HYDRIDE_DUST.get()), has(ModItems.NICKEL_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICROSIL_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NICROSIL_DUST.get())
                .unlockedBy(getHasName(ModItems.NICROSIL_DUST.get()), has(ModItems.NICROSIL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NIMONIC_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NIMONIC_DUST.get())
                .unlockedBy(getHasName(ModItems.NIMONIC_DUST.get()), has(ModItems.NIMONIC_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NISIL_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NISIL_DUST.get())
                .unlockedBy(getHasName(ModItems.NISIL_DUST.get()), has(ModItems.NISIL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NITINOL_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NITINOL_DUST.get())
                .unlockedBy(getHasName(ModItems.NITINOL_DUST.get()), has(ModItems.NITINOL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MU_METAL_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.MU_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.MU_METAL_DUST.get()), has(ModItems.MU_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PERMALLOY_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.PERMALLOY_DUST.get())
                .unlockedBy(getHasName(ModItems.PERMALLOY_DUST.get()), has(ModItems.PERMALLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SUPERMALLOY_NUGGET.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.SUPERMALLOY_DUST.get())
                .unlockedBy(getHasName(ModItems.SUPERMALLOY_DUST.get()), has(ModItems.SUPERMALLOY_DUST.get()))
                .save(pRecipeOutput);

//Potassium Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NAK_NUGGET.get(), 9)
                .pattern("ppp")
                .pattern("ppp")
                .pattern("ppp")
                .define('p', ModItems.NAK_DUST.get())
                .unlockedBy(getHasName(ModItems.NAK_DUST.get()), has(ModItems.NAK_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KLI_NUGGET.get(), 9)
                .pattern("ppp")
                .pattern("ppp")
                .pattern("ppp")
                .define('p', ModItems.KLI_DUST.get())
                .unlockedBy(getHasName(ModItems.KLI_DUST.get()), has(ModItems.KLI_DUST.get()))
                .save(pRecipeOutput);

//Rhodium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PSEUDO_PALLADIUM_NUGGET.get(), 9)
                .pattern("rrr")
                .pattern("rrr")
                .pattern("rrr")
                .define('r', ModItems.PSEUDO_PALLADIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.PSEUDO_PALLADIUM_DUST.get()), has(ModItems.PSEUDO_PALLADIUM_DUST.get()))
                .save(pRecipeOutput);

//Scandium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCANDIUM_HYDRIDE_NUGGET.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.SCANDIUM_HYDRIDE_DUST.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_HYDRIDE_DUST.get()), has(ModItems.SCANDIUM_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);

//Silver Alloys (9)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARGENTIUM_STERLING_SILVER_NUGGET.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.ARGENTIUM_STERLING_SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.ARGENTIUM_STERLING_SILVER_DUST.get()), has(ModItems.ARGENTIUM_STERLING_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRITANNIA_SILVER_NUGGET.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.BRITANNIA_SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.BRITANNIA_SILVER_DUST.get()), has(ModItems.BRITANNIA_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DORE_NUGGET.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.DORE_DUST.get())
                .unlockedBy(getHasName(ModItems.DORE_DUST.get()), has(ModItems.DORE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DYMALLOY_NUGGET.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.DYMALLOY_DUST.get())
                .unlockedBy(getHasName(ModItems.DYMALLOY_DUST.get()), has(ModItems.DYMALLOY_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLOID_NUGGET.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.GOLOID_DUST.get())
                .unlockedBy(getHasName(ModItems.GOLOID_DUST.get()), has(ModItems.GOLOID_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_SILVER_NUGGET.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.PLATINUM_SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_SILVER_DUST.get()), has(ModItems.PLATINUM_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHIBUICHI_NUGGET.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.SHIBUICHI_DUST.get())
                .unlockedBy(getHasName(ModItems.SHIBUICHI_DUST.get()), has(ModItems.SHIBUICHI_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STERLING_SILVER_NUGGET.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.STERLING_SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.STERLING_SILVER_DUST.get()), has(ModItems.STERLING_SILVER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIBETAN_SILVER_NUGGET.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.TIBETAN_SILVER_DUST.get())
                .unlockedBy(getHasName(ModItems.TIBETAN_SILVER_DUST.get()), has(ModItems.TIBETAN_SILVER_DUST.get()))
                .save(pRecipeOutput);

//Tin Alloys (4)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BABBITT_NUGGET.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.BABBITT_DUST.get())
                .unlockedBy(getHasName(ModItems.BABBITT_DUST.get()), has(ModItems.BABBITT_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRITANNIUM_NUGGET.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.BRITANNIUM_DUST.get())
                .unlockedBy(getHasName(ModItems.BRITANNIUM_DUST.get()), has(ModItems.BRITANNIUM_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PEWTER_NUGGET.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.PEWTER_DUST.get())
                .unlockedBy(getHasName(ModItems.PEWTER_DUST.get()), has(ModItems.PEWTER_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.QUEENS_METAL_NUGGET.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.QUEENS_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.QUEENS_METAL_DUST.get()), has(ModItems.QUEENS_METAL_DUST.get()))
                .save(pRecipeOutput);

//Titanium Alloys (6)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAL_FV_NUGGET.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.SAL_FV_DUST.get())
                .unlockedBy(getHasName(ModItems.SAL_FV_DUST.get()), has(ModItems.SAL_FV_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BETA_C_NUGGET.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.BETA_C_DUST.get())
                .unlockedBy(getHasName(ModItems.BETA_C_DUST.get()), has(ModItems.BETA_C_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GUM_METAL_NUGGET.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.GUM_METAL_DUST.get())
                .unlockedBy(getHasName(ModItems.GUM_METAL_DUST.get()), has(ModItems.GUM_METAL_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_GOLD_NUGGET.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.TITANIUM_GOLD_DUST.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_GOLD_DUST.get()), has(ModItems.TITANIUM_GOLD_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_HYDRIDE_NUGGET.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.TITANIUM_HYDRIDE_DUST.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_HYDRIDE_DUST.get()), has(ModItems.TITANIUM_HYDRIDE_DUST.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_NITRIDE_NUGGET.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.TITANIUM_NITRIDE_DUST.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_NITRIDE_DUST.get()), has(ModItems.TITANIUM_NITRIDE_DUST.get()))
                .save(pRecipeOutput);

//Zirconium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCALOY_NUGGET.get(), 9)
                .pattern("zzz")
                .pattern("zzz")
                .pattern("zzz")
                .define('z', ModItems.ZIRCALOY_DUST.get())
                .unlockedBy(getHasName(ModItems.ZIRCALOY_DUST.get()), has(ModItems.ZIRCALOY_DUST.get()))
                .save(pRecipeOutput);
        //Alloy Recipes - NUGGET to INGOT
        //Aluminium Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AA_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.AA_NUGGET.get())
                .unlockedBy(getHasName(ModItems.AA_NUGGET.get()), has(ModItems.AA_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AL_LI_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.AL_LI_NUGGET.get())
                .unlockedBy(getHasName(ModItems.AL_LI_NUGGET.get()), has(ModItems.AL_LI_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALNICO_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ALNICO_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ALNICO_NUGGET.get()), has(ModItems.ALNICO_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_SCANDIUM_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ALUMINIUM_SCANDIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_SCANDIUM_NUGGET.get()), has(ModItems.ALUMINIUM_SCANDIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BIRMABRIGHT_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.BIRMABRIGHT_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BIRMABRIGHT_NUGGET.get()), has(ModItems.BIRMABRIGHT_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DEVARDA_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.DEVARDA_NUGGET.get())
                .unlockedBy(getHasName(ModItems.DEVARDA_NUGGET.get()), has(ModItems.DEVARDA_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DURALUMIN_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.DURALUMIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.DURALUMIN_NUGGET.get()), has(ModItems.DURALUMIN_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HIDUMINIUM_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.HIDUMINIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.HIDUMINIUM_NUGGET.get()), has(ModItems.HIDUMINIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HYDRONALIUM_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.HYDRONALIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.HYDRONALIUM_NUGGET.get()), has(ModItems.HYDRONALIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ITALMA_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ITALMA_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ITALMA_NUGGET.get()), has(ModItems.ITALMA_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGNALIUM_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.MAGNALIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MAGNALIUM_NUGGET.get()), has(ModItems.MAGNALIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MAGNOX_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.MAGNOX_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MAGNOX_NUGGET.get()), has(ModItems.MAGNOX_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NAMBE_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.NAMBE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NAMBE_NUGGET.get()), has(ModItems.NAMBE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NITIAL_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.NITIAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NITIAL_NUGGET.get()), has(ModItems.NITIAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILUMIN_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.SILUMIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SILUMIN_NUGGET.get()), has(ModItems.SILUMIN_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Y_ALLOY_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.Y_ALLOY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.Y_ALLOY_NUGGET.get()), has(ModItems.Y_ALLOY_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZAMAK_INGOT.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ZAMAK_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ZAMAK_NUGGET.get()), has(ModItems.ZAMAK_NUGGET.get()))
                .save(pRecipeOutput);

//Beryllium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LOCKALLOY_INGOT.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.LOCKALLOY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.LOCKALLOY_NUGGET.get()), has(ModItems.LOCKALLOY_NUGGET.get()))
                .save(pRecipeOutput);
//Bismuth Alloy
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BISMANOL_INGOT.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.BISMANOL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BISMANOL_NUGGET.get()), has(ModItems.BISMANOL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CERROBEND_INGOT.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.CERROBEND_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CERROBEND_NUGGET.get()), has(ModItems.CERROBEND_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CERROSAFE_INGOT.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.CERROSAFE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CERROSAFE_NUGGET.get()), has(ModItems.CERROSAFE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FIELDS_METAL_INGOT.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.FIELDS_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FIELDS_METAL_NUGGET.get()), has(ModItems.FIELDS_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_METAL_INGOT.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.ROSE_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ROSE_METAL_NUGGET.get()), has(ModItems.ROSE_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOODS_METAL_INGOT.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.WOODS_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.WOODS_METAL_NUGGET.get()), has(ModItems.WOODS_METAL_NUGGET.get()))
                .save(pRecipeOutput);

//Chromium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMIUM_HYDRIDE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CHROMIUM_HYDRIDE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_HYDRIDE_NUGGET.get()), has(ModItems.CHROMIUM_HYDRIDE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CRNISZWTI_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CRNISZWTI_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CRNISZWTI_NUGGET.get()), has(ModItems.CRNISZWTI_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICHROME_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.NICHROME_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NICHROME_NUGGET.get()), has(ModItems.NICHROME_NUGGET.get()))
                .save(pRecipeOutput);

//Cobalt Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELGILOY_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ELGILOY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ELGILOY_NUGGET.get()), has(ModItems.ELGILOY_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MEGALLIUM_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MEGALLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MEGALLIUM_NUGGET.get()), has(ModItems.MEGALLIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STELLITE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.STELLITE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.STELLITE_NUGGET.get()), has(ModItems.STELLITE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TALONITE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.TALONITE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TALONITE_NUGGET.get()), has(ModItems.TALONITE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ULTIMET_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ULTIMET_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ULTIMET_NUGGET.get()), has(ModItems.ULTIMET_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VITALLIUM_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.VITALLIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.VITALLIUM_NUGGET.get()), has(ModItems.VITALLIUM_NUGGET.get()))
                .save(pRecipeOutput);

//Copper Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMINIUM_BRONZE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ALUMINIUM_BRONZE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_BRONZE_NUGGET.get()), has(ModItems.ALUMINIUM_BRONZE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARSENICAL_BRONZE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ARSENICAL_BRONZE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ARSENICAL_BRONZE_NUGGET.get()),has(ModItems.ARSENICAL_BRONZE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARSENICAL_COPPER_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ARSENICAL_COPPER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ARSENICAL_COPPER_NUGGET.get()), has(ModItems.ARSENICAL_COPPER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BELL_METAL_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BELL_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BELL_METAL_NUGGET.get()), has(ModItems.BELL_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BERYLLIUM_COPPER_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BERYLLIUM_COPPER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_COPPER_NUGGET.get()), has(ModItems.BERYLLIUM_COPPER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BILLON_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BILLON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BILLON_NUGGET.get()), has(ModItems.BILLON_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRASS_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BRASS_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BRASS_NUGGET.get()), has(ModItems.BRASS_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BRONZE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BRONZE_NUGGET.get()), has(ModItems.BRONZE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CALAMINE_BRASS_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CALAMINE_BRASS_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CALAMINE_BRASS_NUGGET.get()), has(ModItems.CALAMINE_BRASS_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHINESE_SILVER_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CHINESE_SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CHINESE_SILVER_NUGGET.get()), has(ModItems.CHINESE_SILVER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CONSTANTAN_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('b', ModItems.CONSTANTAN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CONSTANTAN_NUGGET.get()), has(ModItems.CONSTANTAN_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_HYDRIDE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.COPPER_HYDRIDE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.COPPER_HYDRIDE_NUGGET.get()),has(ModItems.COPPER_HYDRIDE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_TUNGSTEN_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.COPPER_TUNGSTEN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.COPPER_TUNGSTEN_NUGGET.get()), has(ModItems.COPPER_TUNGSTEN_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CORINTHIAN_BRONZE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CORINTHIAN_BRONZE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CORINTHIAN_BRONZE_NUGGET.get()), has(ModItems.CORINTHIAN_BRONZE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CUNIFE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CUNIFE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CUNIFE_NUGGET.get()), has(ModItems.CUNIFE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CUAG_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CUAG_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CUAG_NUGGET.get()), has(ModItems.CUAG_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CYMBAL_ALLOY_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CYMBAL_ALLOY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CYMBAL_ALLOY_NUGGET.get()), has(ModItems.CYMBAL_ALLOY_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DUTCH_METAL_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.DUTCH_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.DUTCH_METAL_NUGGET.get()), has(ModItems.DUTCH_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLORENTINE_BRONZE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.FLORENTINE_BRONZE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FLORENTINE_BRONZE_NUGGET.get()), has(ModItems.FLORENTINE_BRONZE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GILDING_METAL_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.GILDING_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GILDING_METAL_NUGGET.get()), has(ModItems.GILDING_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GLUCYDUR_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('b', ModItems.GLUCYDUR_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GLUCYDUR_NUGGET.get()), has(ModItems.GLUCYDUR_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GUANIN_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.GUANIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GUANIN_NUGGET.get()),has(ModItems.GUANIN_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GUN_METAL_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.GUN_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GUN_METAL_NUGGET.get()), has(ModItems.GUN_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HEPATIZON_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.HEPATIZON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.HEPATIZON_NUGGET.get()), has(ModItems.HEPATIZON_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MANGANIN_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MANGANIN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MANGANIN_NUGGET.get()), has(ModItems.MANGANIN_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MELCHIOR_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MELCHIOR_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MELCHIOR_NUGGET.get()), has(ModItems.MELCHIOR_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUNTZ_METAL_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MUNTZ_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MUNTZ_METAL_NUGGET.get()), has(ModItems.MUNTZ_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_SILVER_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.NICKEL_SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TALONITE_NUGGET.get()), has(ModItems.TALONITE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NORDIC_GOLD_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.NORDIC_GOLD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NORDIC_GOLD_NUGGET.get()), has(ModItems.NORDIC_GOLD_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ORMOLU_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ORMOLU_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ORMOLU_NUGGET.get()), has(ModItems.ORMOLU_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PHOSPHOR_BRONZE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.PHOSPHOR_BRONZE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PHOSPHOR_BRONZE_NUGGET.get()), has(ModItems.PHOSPHOR_BRONZE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PINCHBECK_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.PINCHBECK_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PINCHBECK_NUGGET.get()),has(ModItems.PINCHBECK_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PRINCES_METAL_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.PRINCES_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PRINCES_METAL_NUGGET.get()), has(ModItems.PRINCES_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHAKUDO_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.SHAKUDO_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SHAKUDO_NUGGET.get()), has(ModItems.SHAKUDO_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILICON_BRONZE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.SILICON_BRONZE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SILICON_BRONZE_NUGGET.get()), has(ModItems.SILICON_BRONZE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPECULUM_METAL_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.SPECULUM_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SPECULUM_METAL_NUGGET.get()), has(ModItems.SPECULUM_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOMBAC_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.TOMBAC_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TOMBAC_NUGGET.get()), has(ModItems.TOMBAC_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TUMBAGA_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.TUMBAGA_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TUMBAGA_NUGGET.get()), has(ModItems.TUMBAGA_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WHITE_BRONZE_INGOT.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.WHITE_BRONZE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.WHITE_BRONZE_NUGGET.get()), has(ModItems.WHITE_BRONZE_NUGGET.get()))
                .save(pRecipeOutput);

        //Gallium Alloy
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AL_GA_INGOT.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.AL_GA_NUGGET.get())
                .unlockedBy(getHasName(ModItems.AL_GA_NUGGET.get()), has(ModItems.AL_GA_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GALFENOL_INGOT.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.GALFENOL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GALFENOL_NUGGET.get()), has(ModItems.GALFENOL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GALINSTAN_INGOT.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.GALINSTAN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GALINSTAN_NUGGET.get()), has(ModItems.GALINSTAN_NUGGET.get()))
                .save(pRecipeOutput);

        //Gold Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COLORED_GOLD_INGOT.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.COLORED_GOLD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.COLORED_GOLD_NUGGET.get()), has(ModItems.COLORED_GOLD_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CROWN_GOLD_INGOT.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.CROWN_GOLD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CROWN_GOLD_NUGGET.get()), has(ModItems.CROWN_GOLD_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTRUM_INGOT.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.ELECTRUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ELECTRUM_NUGGET.get()), has(ModItems.ELECTRUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RHODITE_INGOT.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.RHODITE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.RHODITE_NUGGET.get()), has(ModItems.RHODITE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.ROSE_GOLD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_NUGGET.get()), has(ModItems.ROSE_GOLD_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WHITE_GOLD_INGOT.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.WHITE_GOLD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.WHITE_GOLD_NUGGET.get()), has(ModItems.WHITE_GOLD_NUGGET.get()))
                .save(pRecipeOutput);

//Iron Alloys (39)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ANTHRACITE_IRON_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.ANTHRACITE_IRON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ANTHRACITE_IRON_NUGGET.get()), has(ModItems.ANTHRACITE_IRON_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BULAT_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.BULAT_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BULAT_STEEL_NUGGET.get()), has(ModItems.BULAT_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CAST_IRON_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.CAST_IRON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CAST_IRON_NUGGET.get()), has(ModItems.CAST_IRON_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMOLY_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('c', ModItems.CHROMOLY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CHROMOLY_NUGGET.get()), has(ModItems.CHROMOLY_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CRUCIBLE_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.CRUCIBLE_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CRUCIBLE_STEEL_NUGGET.get()), has(ModItems.CRUCIBLE_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DAMASCUS_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.DAMASCUS_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_NUGGET.get()), has(ModItems.DAMASCUS_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DUCOL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.DUCOL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.DUCOL_NUGGET.get()), has(ModItems.DUCOL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELINVAR_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.ELINVAR_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ELINVAR_NUGGET.get()), has(ModItems.ELINVAR_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERNICO_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERNICO_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FERNICO_NUGGET.get()), has(ModItems.FERNICO_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROCHROMIUM_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROCHROMIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FERROCHROMIUM_NUGGET.get()), has(ModItems.FERROCHROMIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROMAGNESIUM_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROMAGNESIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FERROMAGNESIUM_NUGGET.get()), has(ModItems.FERROMAGNESIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROMANGANESE_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROMANGANESE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FERROMANGANESE_NUGGET.get()), has(ModItems.FERROMANGANESE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROMOLYBDENUM_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROMOLYBDENUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FERROMOLYBDENUM_NUGGET.get()), has(ModItems.FERROMOLYBDENUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERRONICKEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERRONICKEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FERRONICKEL_NUGGET.get()), has(ModItems.FERRONICKEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROPHOSPHORUS_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROPHOSPHORUS_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FERROPHOSPHORUS_NUGGET.get()), has(ModItems.FERROPHOSPHORUS_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROSILICON_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROSILICON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FERROSILICON_NUGGET.get()), has(ModItems.FERROSILICON_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROTITANIUM_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROTITANIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FERROTITANIUM_NUGGET.get()), has(ModItems.FERROTITANIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FERROVANADIUM_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROVANADIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.FERROVANADIUM_NUGGET.get()), has(ModItems.FERROVANADIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HIGHSPEED_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.HIGHSPEED_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.HIGHSPEED_STEEL_NUGGET.get()), has(ModItems.HIGHSPEED_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HSLA_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.HSLA_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.HSLA_STEEL_NUGGET.get()), has(ModItems.HSLA_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INVAR_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.INVAR_NUGGET.get())
                .unlockedBy(getHasName(ModItems.INVAR_NUGGET.get()), has(ModItems.INVAR_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_HYDRIDE_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.IRON_HYDRIDE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.IRON_HYDRIDE_NUGGET.get()), has(ModItems.IRON_HYDRIDE_NUGGET.get()))
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KANTHAL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.KANTHAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.KANTHAL_NUGGET.get()), has(ModItems.KANTHAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KOVAR_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.KOVAR_NUGGET.get())
                .unlockedBy(getHasName(ModItems.KOVAR_NUGGET.get()), has(ModItems.KOVAR_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MARAGING_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.MARAGING_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MARAGING_STEEL_NUGGET.get()), has(ModItems.MARAGING_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSHET_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.MUSHET_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MUSHET_STEEL_NUGGET.get()), has(ModItems.MUSHET_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PIG_IRON_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.PIG_IRON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_NUGGET.get()), has(ModItems.PIG_IRON_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REYNOLDS_FTO_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.REYNOLDS_FTO_NUGGET.get())
                .unlockedBy(getHasName(ModItems.REYNOLDS_FTO_NUGGET.get()), has(ModItems.REYNOLDS_FTO_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILICON_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SILICON_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SILICON_STEEL_NUGGET.get()), has(ModItems.SILICON_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SILVER_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SILVER_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SILVER_STEEL_NUGGET.get()), has(ModItems.SILVER_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPIEGELEISEN_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SPIEGELEISEN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SPIEGELEISEN_NUGGET.get()), has(ModItems.SPIEGELEISEN_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SPRING_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SPRING_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SPRING_STEEL_NUGGET.get()), has(ModItems.SPRING_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STAINLESS_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.STAINLESS_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.STAINLESS_STEEL_NUGGET.get()), has(ModItems.STAINLESS_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STABALLOY_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.STABALLOY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.STABALLOY_NUGGET.get()), has(ModItems.STABALLOY_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.STEEL_NUGGET.get()), has(ModItems.STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TOOL_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.TOOL_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TOOL_STEEL_NUGGET.get()), has(ModItems.TOOL_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WEATHERING_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.WEATHERING_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.WEATHERING_STEEL_NUGGET.get()), has(ModItems.WEATHERING_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WOOTZ_STEEL_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.WOOTZ_STEEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.WOOTZ_STEEL_NUGGET.get()), has(ModItems.WOOTZ_STEEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WROUGHT_IRON_INGOT.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.WROUGHT_IRON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.WROUGHT_IRON_NUGGET.get()), has(ModItems.WROUGHT_IRON_NUGGET.get()))
                .save(pRecipeOutput);

//Lead Alloys (4)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOLYBDOCHALKOS_INGOT.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.MOLYBDOCHALKOS_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MOLYBDOCHALKOS_NUGGET.get()), has(ModItems.MOLYBDOCHALKOS_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOLDER_INGOT.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.SOLDER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SOLDER_NUGGET.get()), has(ModItems.SOLDER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TERNE_INGOT.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.TERNE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TERNE_NUGGET.get()), has(ModItems.TERNE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TYPE_METAL_INGOT.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.TYPE_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TYPE_METAL_NUGGET.get()), has(ModItems.TYPE_METAL_NUGGET.get()))
                .save(pRecipeOutput);

//Magnesium Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELEKTRON_INGOT.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.ELEKTRON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ELEKTRON_NUGGET.get()), has(ModItems.ELEKTRON_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TMGALZN_INGOT.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.TMGALZN_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TMGALZN_NUGGET.get()), has(ModItems.TMGALZN_NUGGET.get()))
                .save(pRecipeOutput);

//Manganese Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MNFZ_INGOT.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.MNFZ_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MNFZ_NUGGET.get()), has(ModItems.MNFZ_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MNSZ_INGOT.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.MNSZ_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MNSZ_NUGGET.get()), has(ModItems.MNSZ_NUGGET.get()))
                .save(pRecipeOutput);

//Mercury (Cinnabar) Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZINC_AMALGAM_INGOT.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.ZINC_AMALGAM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ZINC_AMALGAM_NUGGET.get()), has(ModItems.ZINC_AMALGAM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ASHTADHATU_INGOT.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.ASHTADHATU_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ASHTADHATU_NUGGET.get()), has(ModItems.ASHTADHATU_NUGGET.get()))
                .save(pRecipeOutput);

        //Nickel Alloys (21)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALUMEL_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.ALUMEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ALUMEL_NUGGET.get()), has(ModItems.ALUMEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRIGHTRAY_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.BRIGHTRAY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BRIGHTRAY_NUGGET.get()), has(ModItems.BRIGHTRAY_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHROMEL_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.CHROMEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CHROMEL_NUGGET.get()), has(ModItems.CHROMEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COIN_SILVER_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.COIN_SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.COIN_SILVER_NUGGET.get()), has(ModItems.COIN_SILVER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_NICKEL_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.COPPER_NICKEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.COPPER_NICKEL_NUGGET.get()), has(ModItems.COPPER_NICKEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CUPRONICKEL_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.CUPRONICKEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.CUPRONICKEL_NUGGET.get()), has(ModItems.CUPRONICKEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GERMAN_SILVER_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.GERMAN_SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GERMAN_SILVER_NUGGET.get()), has(ModItems.GERMAN_SILVER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HASTELLOY_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.HASTELLOY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.HASTELLOY_NUGGET.get()), has(ModItems.HASTELLOY_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.HAUSLER_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.HAUSLER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.HAUSLER_NUGGET.get()), has(ModItems.HAUSLER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INCONEL_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.INCONEL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.INCONEL_NUGGET.get()), has(ModItems.INCONEL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INCONEL_SES_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.INCONEL_SES_NUGGET.get())
                .unlockedBy(getHasName(ModItems.INCONEL_SES_NUGGET.get()), has(ModItems.INCONEL_SES_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MONEL_METAL_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.MONEL_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MONEL_METAL_NUGGET.get()), has(ModItems.MONEL_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_CARBON_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NICKEL_CARBON_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NICKEL_CARBON_NUGGET.get()), has(ModItems.NICKEL_CARBON_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICKEL_HYDRIDE_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NICKEL_HYDRIDE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NICKEL_HYDRIDE_NUGGET.get()), has(ModItems.NICKEL_HYDRIDE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NICROSIL_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NICROSIL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NICROSIL_NUGGET.get()), has(ModItems.NICROSIL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NIMONIC_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NIMONIC_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NIMONIC_NUGGET.get()), has(ModItems.NIMONIC_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NISIL_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NISIL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NISIL_NUGGET.get()), has(ModItems.NISIL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NITINOL_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NITINOL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NITINOL_NUGGET.get()), has(ModItems.NITINOL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MU_METAL_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.MU_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.MU_METAL_NUGGET.get()), has(ModItems.MU_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PERMALLOY_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.PERMALLOY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PERMALLOY_NUGGET.get()), has(ModItems.PERMALLOY_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SUPERMALLOY_INGOT.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.SUPERMALLOY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SUPERMALLOY_NUGGET.get()), has(ModItems.SUPERMALLOY_NUGGET.get()))
                .save(pRecipeOutput);

//Potassium Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NAK_INGOT.get(), 9)
                .pattern("ppp")
                .pattern("ppp")
                .pattern("ppp")
                .define('p', ModItems.NAK_NUGGET.get())
                .unlockedBy(getHasName(ModItems.NAK_NUGGET.get()), has(ModItems.NAK_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KLI_INGOT.get(), 9)
                .pattern("ppp")
                .pattern("ppp")
                .pattern("ppp")
                .define('p', ModItems.KLI_NUGGET.get())
                .unlockedBy(getHasName(ModItems.KLI_NUGGET.get()), has(ModItems.KLI_NUGGET.get()))
                .save(pRecipeOutput);

//Rhodium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PSEUDO_PALLADIUM_INGOT.get(), 9)
                .pattern("rrr")
                .pattern("rrr")
                .pattern("rrr")
                .define('r', ModItems.PSEUDO_PALLADIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PSEUDO_PALLADIUM_NUGGET.get()), has(ModItems.PSEUDO_PALLADIUM_NUGGET.get()))
                .save(pRecipeOutput);

//Scandium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SCANDIUM_HYDRIDE_INGOT.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.SCANDIUM_HYDRIDE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_HYDRIDE_NUGGET.get()), has(ModItems.SCANDIUM_HYDRIDE_NUGGET.get()))
                .save(pRecipeOutput);

//Silver Alloys (9)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ARGENTIUM_STERLING_SILVER_INGOT.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.ARGENTIUM_STERLING_SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ARGENTIUM_STERLING_SILVER_NUGGET.get()), has(ModItems.ARGENTIUM_STERLING_SILVER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRITANNIA_SILVER_INGOT.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.BRITANNIA_SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BRITANNIA_SILVER_NUGGET.get()), has(ModItems.BRITANNIA_SILVER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DORE_INGOT.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.DORE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.DORE_NUGGET.get()), has(ModItems.DORE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DYMALLOY_INGOT.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.DYMALLOY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.DYMALLOY_NUGGET.get()), has(ModItems.DYMALLOY_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLOID_INGOT.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.GOLOID_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GOLOID_NUGGET.get()), has(ModItems.GOLOID_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLATINUM_SILVER_INGOT.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.PLATINUM_SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_SILVER_NUGGET.get()), has(ModItems.PLATINUM_SILVER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHIBUICHI_INGOT.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.SHIBUICHI_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SHIBUICHI_NUGGET.get()), has(ModItems.SHIBUICHI_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STERLING_SILVER_INGOT.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.STERLING_SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.STERLING_SILVER_NUGGET.get()), has(ModItems.STERLING_SILVER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIBETAN_SILVER_INGOT.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.TIBETAN_SILVER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TIBETAN_SILVER_NUGGET.get()), has(ModItems.TIBETAN_SILVER_NUGGET.get()))
                .save(pRecipeOutput);

//Tin Alloys (4)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BABBITT_INGOT.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.BABBITT_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BABBITT_NUGGET.get()), has(ModItems.BABBITT_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BRITANNIUM_INGOT.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.BRITANNIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BRITANNIUM_NUGGET.get()), has(ModItems.BRITANNIUM_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PEWTER_INGOT.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.PEWTER_NUGGET.get())
                .unlockedBy(getHasName(ModItems.PEWTER_NUGGET.get()), has(ModItems.PEWTER_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.QUEENS_METAL_INGOT.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.QUEENS_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.QUEENS_METAL_NUGGET.get()), has(ModItems.QUEENS_METAL_NUGGET.get()))
                .save(pRecipeOutput);

//Titanium Alloys (6)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAL_FV_INGOT.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.SAL_FV_NUGGET.get())
                .unlockedBy(getHasName(ModItems.SAL_FV_NUGGET.get()), has(ModItems.SAL_FV_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BETA_C_INGOT.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.BETA_C_NUGGET.get())
                .unlockedBy(getHasName(ModItems.BETA_C_NUGGET.get()), has(ModItems.BETA_C_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GUM_METAL_INGOT.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.GUM_METAL_NUGGET.get())
                .unlockedBy(getHasName(ModItems.GUM_METAL_NUGGET.get()), has(ModItems.GUM_METAL_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_GOLD_INGOT.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.TITANIUM_GOLD_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_GOLD_NUGGET.get()), has(ModItems.TITANIUM_GOLD_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_HYDRIDE_INGOT.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.TITANIUM_HYDRIDE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_HYDRIDE_NUGGET.get()), has(ModItems.TITANIUM_HYDRIDE_NUGGET.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_NITRIDE_INGOT.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.TITANIUM_NITRIDE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_NITRIDE_NUGGET.get()), has(ModItems.TITANIUM_NITRIDE_NUGGET.get()))
                .save(pRecipeOutput);

//Zirconium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIRCALOY_INGOT.get(), 9)
                .pattern("zzz")
                .pattern("zzz")
                .pattern("zzz")
                .define('z', ModItems.ZIRCALOY_NUGGET.get())
                .unlockedBy(getHasName(ModItems.ZIRCALOY_NUGGET.get()), has(ModItems.ZIRCALOY_NUGGET.get()))
                .save(pRecipeOutput);
        //Alloy Recipes - INGOT to BLOCK
        //Aluminium Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AA_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.AA_INGOT.get())
                .unlockedBy(getHasName(ModItems.AA_INGOT.get()), has(ModItems.AA_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AL_LI_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.AL_LI_INGOT.get())
                .unlockedBy(getHasName(ModItems.AL_LI_INGOT.get()), has(ModItems.AL_LI_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALNICO_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ALNICO_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALNICO_INGOT.get()), has(ModItems.ALNICO_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMINIUM_SCANDIUM_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ALUMINIUM_SCANDIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_SCANDIUM_INGOT.get()), has(ModItems.ALUMINIUM_SCANDIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIRMABRIGHT_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.BIRMABRIGHT_INGOT.get())
                .unlockedBy(getHasName(ModItems.BIRMABRIGHT_INGOT.get()), has(ModItems.BIRMABRIGHT_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DEVARDA_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.DEVARDA_INGOT.get())
                .unlockedBy(getHasName(ModItems.DEVARDA_INGOT.get()), has(ModItems.DEVARDA_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DURALUMIN_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.DURALUMIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.DURALUMIN_INGOT.get()), has(ModItems.DURALUMIN_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HIDUMINIUM_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.HIDUMINIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.HIDUMINIUM_INGOT.get()), has(ModItems.HIDUMINIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HYDRONALIUM_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.HYDRONALIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.HYDRONALIUM_INGOT.get()), has(ModItems.HYDRONALIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ITALMA_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ITALMA_INGOT.get())
                .unlockedBy(getHasName(ModItems.ITALMA_INGOT.get()), has(ModItems.ITALMA_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGNALIUM_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.MAGNALIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.MAGNALIUM_INGOT.get()), has(ModItems.MAGNALIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGNOX_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.MAGNOX_INGOT.get())
                .unlockedBy(getHasName(ModItems.MAGNOX_INGOT.get()), has(ModItems.MAGNOX_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NAMBE_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.NAMBE_INGOT.get())
                .unlockedBy(getHasName(ModItems.NAMBE_INGOT.get()), has(ModItems.NAMBE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NITIAL_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.NITIAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.NITIAL_INGOT.get()), has(ModItems.NITIAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILUMIN_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.SILUMIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILUMIN_INGOT.get()), has(ModItems.SILUMIN_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.Y_ALLOY_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.Y_ALLOY_INGOT.get())
                .unlockedBy(getHasName(ModItems.Y_ALLOY_INGOT.get()), has(ModItems.Y_ALLOY_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZAMAK_BLOCK.get(), 9)
                .pattern("aaa")
                .pattern("aaa")
                .pattern("aaa")
                .define('a', ModItems.ZAMAK_INGOT.get())
                .unlockedBy(getHasName(ModItems.ZAMAK_INGOT.get()), has(ModItems.ZAMAK_INGOT.get()))
                .save(pRecipeOutput);

//Beryllium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LOCKALLOY_BLOCK.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.LOCKALLOY_INGOT.get())
                .unlockedBy(getHasName(ModItems.LOCKALLOY_INGOT.get()), has(ModItems.LOCKALLOY_INGOT.get()))
                .save(pRecipeOutput);
//Bismuth Alloy
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BISMANOL_BLOCK.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.BISMANOL_INGOT.get())
                .unlockedBy(getHasName(ModItems.BISMANOL_INGOT.get()), has(ModItems.BISMANOL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERROBEND_BLOCK.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.CERROBEND_INGOT.get())
                .unlockedBy(getHasName(ModItems.CERROBEND_INGOT.get()), has(ModItems.CERROBEND_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERROSAFE_BLOCK.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.CERROSAFE_INGOT.get())
                .unlockedBy(getHasName(ModItems.CERROSAFE_INGOT.get()), has(ModItems.CERROSAFE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FIELDS_METAL_BLOCK.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.FIELDS_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.FIELDS_METAL_INGOT.get()), has(ModItems.FIELDS_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_METAL_BLOCK.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.ROSE_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_METAL_INGOT.get()), has(ModItems.ROSE_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOODS_METAL_BLOCK.get(), 9)
                .pattern("bbb")
                .pattern("bbb")
                .pattern("bbb")
                .define('b', ModItems.WOODS_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.WOODS_METAL_INGOT.get()), has(ModItems.WOODS_METAL_INGOT.get()))
                .save(pRecipeOutput);

//Chromium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHROMIUM_HYDRIDE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CHROMIUM_HYDRIDE_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMIUM_HYDRIDE_INGOT.get()), has(ModItems.CHROMIUM_HYDRIDE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRNISZWTI_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CRNISZWTI_INGOT.get())
                .unlockedBy(getHasName(ModItems.CRNISZWTI_INGOT.get()), has(ModItems.CRNISZWTI_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NICHROME_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.NICHROME_INGOT.get())
                .unlockedBy(getHasName(ModItems.NICHROME_INGOT.get()), has(ModItems.NICHROME_INGOT.get()))
                .save(pRecipeOutput);

//Cobalt Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELGILOY_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ELGILOY_INGOT.get())
                .unlockedBy(getHasName(ModItems.ELGILOY_INGOT.get()), has(ModItems.ELGILOY_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MEGALLIUM_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MEGALLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.MEGALLIUM_INGOT.get()), has(ModItems.MEGALLIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STELLITE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.STELLITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.STELLITE_INGOT.get()), has(ModItems.STELLITE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TALONITE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.TALONITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.TALONITE_INGOT.get()), has(ModItems.TALONITE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ULTIMET_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ULTIMET_INGOT.get())
                .unlockedBy(getHasName(ModItems.ULTIMET_INGOT.get()), has(ModItems.ULTIMET_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VITALLIUM_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.VITALLIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.VITALLIUM_INGOT.get()), has(ModItems.VITALLIUM_INGOT.get()))
                .save(pRecipeOutput);

//Copper Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMINIUM_BRONZE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ALUMINIUM_BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMINIUM_BRONZE_INGOT.get()), has(ModItems.ALUMINIUM_BRONZE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ARSENICAL_BRONZE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ARSENICAL_BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.ARSENICAL_BRONZE_INGOT.get()),has(ModItems.ARSENICAL_BRONZE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ARSENICAL_COPPER_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ARSENICAL_COPPER_INGOT.get())
                .unlockedBy(getHasName(ModItems.ARSENICAL_COPPER_INGOT.get()), has(ModItems.ARSENICAL_COPPER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BELL_METAL_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BELL_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.BELL_METAL_INGOT.get()), has(ModItems.BELL_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BERYLLIUM_COPPER_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BERYLLIUM_COPPER_INGOT.get())
                .unlockedBy(getHasName(ModItems.BERYLLIUM_COPPER_INGOT.get()), has(ModItems.BERYLLIUM_COPPER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BILLON_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BILLON_INGOT.get())
                .unlockedBy(getHasName(ModItems.BILLON_INGOT.get()), has(ModItems.BILLON_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRASS_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BRASS_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRASS_INGOT.get()), has(ModItems.BRASS_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRONZE_INGOT.get()), has(ModItems.BRONZE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CALAMINE_BRASS_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CALAMINE_BRASS_INGOT.get())
                .unlockedBy(getHasName(ModItems.CALAMINE_BRASS_INGOT.get()), has(ModItems.CALAMINE_BRASS_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHINESE_SILVER_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CHINESE_SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHINESE_SILVER_INGOT.get()), has(ModItems.CHINESE_SILVER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONSTANTAN_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('b', ModItems.CONSTANTAN_INGOT.get())
                .unlockedBy(getHasName(ModItems.CONSTANTAN_INGOT.get()), has(ModItems.CONSTANTAN_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_HYDRIDE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.COPPER_HYDRIDE_INGOT.get())
                .unlockedBy(getHasName(ModItems.COPPER_HYDRIDE_INGOT.get()),has(ModItems.COPPER_HYDRIDE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_TUNGSTEN_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.COPPER_TUNGSTEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.COPPER_TUNGSTEN_INGOT.get()), has(ModItems.COPPER_TUNGSTEN_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CORINTHIAN_BRONZE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CORINTHIAN_BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.CORINTHIAN_BRONZE_INGOT.get()), has(ModItems.CORINTHIAN_BRONZE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CUNIFE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CUNIFE_INGOT.get())
                .unlockedBy(getHasName(ModItems.CUNIFE_INGOT.get()), has(ModItems.CUNIFE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CUAG_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CUAG_INGOT.get())
                .unlockedBy(getHasName(ModItems.CUAG_INGOT.get()), has(ModItems.CUAG_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYMBAL_ALLOY_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.CYMBAL_ALLOY_INGOT.get())
                .unlockedBy(getHasName(ModItems.CYMBAL_ALLOY_INGOT.get()), has(ModItems.CYMBAL_ALLOY_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DUTCH_METAL_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.DUTCH_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.DUTCH_METAL_INGOT.get()), has(ModItems.DUTCH_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FLORENTINE_BRONZE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.FLORENTINE_BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.FLORENTINE_BRONZE_INGOT.get()), has(ModItems.FLORENTINE_BRONZE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GILDING_METAL_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.GILDING_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.GILDING_METAL_INGOT.get()), has(ModItems.GILDING_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLUCYDUR_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('b', ModItems.GLUCYDUR_INGOT.get())
                .unlockedBy(getHasName(ModItems.GLUCYDUR_INGOT.get()), has(ModItems.GLUCYDUR_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GUANIN_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.GUANIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.GUANIN_INGOT.get()),has(ModItems.GUANIN_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GUN_METAL_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.GUN_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.GUN_METAL_INGOT.get()), has(ModItems.GUN_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HEPATIZON_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.HEPATIZON_INGOT.get())
                .unlockedBy(getHasName(ModItems.HEPATIZON_INGOT.get()), has(ModItems.HEPATIZON_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGANIN_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MANGANIN_INGOT.get())
                .unlockedBy(getHasName(ModItems.MANGANIN_INGOT.get()), has(ModItems.MANGANIN_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MELCHIOR_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MELCHIOR_INGOT.get())
                .unlockedBy(getHasName(ModItems.MELCHIOR_INGOT.get()), has(ModItems.MELCHIOR_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MUNTZ_METAL_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.MUNTZ_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MUNTZ_METAL_INGOT.get()), has(ModItems.MUNTZ_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NICKEL_SILVER_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.NICKEL_SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.TALONITE_INGOT.get()), has(ModItems.TALONITE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NORDIC_GOLD_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.NORDIC_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.NORDIC_GOLD_INGOT.get()), has(ModItems.NORDIC_GOLD_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORMOLU_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.ORMOLU_INGOT.get())
                .unlockedBy(getHasName(ModItems.ORMOLU_INGOT.get()), has(ModItems.ORMOLU_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PHOSPHOR_BRONZE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.PHOSPHOR_BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.PHOSPHOR_BRONZE_INGOT.get()), has(ModItems.PHOSPHOR_BRONZE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINCHBECK_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.PINCHBECK_INGOT.get())
                .unlockedBy(getHasName(ModItems.PINCHBECK_INGOT.get()),has(ModItems.PINCHBECK_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PRINCES_METAL_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.PRINCES_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.PRINCES_METAL_INGOT.get()), has(ModItems.PRINCES_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SHAKUDO_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.SHAKUDO_INGOT.get())
                .unlockedBy(getHasName(ModItems.SHAKUDO_INGOT.get()), has(ModItems.SHAKUDO_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILICON_BRONZE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.SILICON_BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILICON_BRONZE_INGOT.get()), has(ModItems.SILICON_BRONZE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SPECULUM_METAL_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.SPECULUM_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.SPECULUM_METAL_INGOT.get()), has(ModItems.SPECULUM_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TOMBAC_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.TOMBAC_INGOT.get())
                .unlockedBy(getHasName(ModItems.TOMBAC_INGOT.get()), has(ModItems.TOMBAC_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TUMBAGA_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.TUMBAGA_INGOT.get())
                .unlockedBy(getHasName(ModItems.TUMBAGA_INGOT.get()), has(ModItems.TUMBAGA_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_BRONZE_BLOCK.get(), 9)
                .pattern("ccc")
                .pattern("ccc")
                .pattern("ccc")
                .define('c', ModItems.WHITE_BRONZE_INGOT.get())
                .unlockedBy(getHasName(ModItems.WHITE_BRONZE_INGOT.get()), has(ModItems.WHITE_BRONZE_INGOT.get()))
                .save(pRecipeOutput);

        //Gallium Alloy
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AL_GA_BLOCK.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.AL_GA_INGOT.get())
                .unlockedBy(getHasName(ModItems.AL_GA_INGOT.get()), has(ModItems.AL_GA_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GALFENOL_BLOCK.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.GALFENOL_INGOT.get())
                .unlockedBy(getHasName(ModItems.GALFENOL_INGOT.get()), has(ModItems.GALFENOL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GALINSTAN_BLOCK.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.GALINSTAN_INGOT.get())
                .unlockedBy(getHasName(ModItems.GALINSTAN_INGOT.get()), has(ModItems.GALINSTAN_INGOT.get()))
                .save(pRecipeOutput);

        //Gold Alloys
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COLORED_GOLD_BLOCK.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.COLORED_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.COLORED_GOLD_INGOT.get()), has(ModItems.COLORED_GOLD_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CROWN_GOLD_BLOCK.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.CROWN_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.CROWN_GOLD_INGOT.get()), has(ModItems.CROWN_GOLD_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELECTRUM_BLOCK.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.ELECTRUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ELECTRUM_INGOT.get()), has(ModItems.ELECTRUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RHODITE_BLOCK.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.RHODITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.RHODITE_INGOT.get()), has(ModItems.RHODITE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_GOLD_BLOCK.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.ROSE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.ROSE_GOLD_INGOT.get()), has(ModItems.ROSE_GOLD_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_GOLD_BLOCK.get(), 9)
                .pattern("ggg")
                .pattern("ggg")
                .pattern("ggg")
                .define('g', ModItems.WHITE_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.WHITE_GOLD_INGOT.get()), has(ModItems.WHITE_GOLD_INGOT.get()))
                .save(pRecipeOutput);

//Iron Alloys (39)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ANTHRACITE_IRON_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.ANTHRACITE_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.ANTHRACITE_IRON_INGOT.get()), has(ModItems.ANTHRACITE_IRON_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BULAT_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.BULAT_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.BULAT_STEEL_INGOT.get()), has(ModItems.BULAT_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CAST_IRON_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.CAST_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.CAST_IRON_INGOT.get()), has(ModItems.CAST_IRON_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHROMOLY_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('c', ModItems.CHROMOLY_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMOLY_INGOT.get()), has(ModItems.CHROMOLY_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRUCIBLE_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.CRUCIBLE_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.CRUCIBLE_STEEL_INGOT.get()), has(ModItems.CRUCIBLE_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DAMASCUS_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.DAMASCUS_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.DAMASCUS_STEEL_INGOT.get()), has(ModItems.DAMASCUS_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DUCOL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.DUCOL_INGOT.get())
                .unlockedBy(getHasName(ModItems.DUCOL_INGOT.get()), has(ModItems.DUCOL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELINVAR_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.ELINVAR_INGOT.get())
                .unlockedBy(getHasName(ModItems.ELINVAR_INGOT.get()), has(ModItems.ELINVAR_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERNICO_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERNICO_INGOT.get())
                .unlockedBy(getHasName(ModItems.FERNICO_INGOT.get()), has(ModItems.FERNICO_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERROCHROMIUM_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROCHROMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.FERROCHROMIUM_INGOT.get()), has(ModItems.FERROCHROMIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERROMAGNESIUM_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROMAGNESIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.FERROMAGNESIUM_INGOT.get()), has(ModItems.FERROMAGNESIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERROMANGANESE_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROMANGANESE_INGOT.get())
                .unlockedBy(getHasName(ModItems.FERROMANGANESE_INGOT.get()), has(ModItems.FERROMANGANESE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERROMOLYBDENUM_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROMOLYBDENUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.FERROMOLYBDENUM_INGOT.get()), has(ModItems.FERROMOLYBDENUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERRONICKEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERRONICKEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.FERRONICKEL_INGOT.get()), has(ModItems.FERRONICKEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERROPHOSPHORUS_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROPHOSPHORUS_INGOT.get())
                .unlockedBy(getHasName(ModItems.FERROPHOSPHORUS_INGOT.get()), has(ModItems.FERROPHOSPHORUS_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERROSILICON_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROSILICON_INGOT.get())
                .unlockedBy(getHasName(ModItems.FERROSILICON_INGOT.get()), has(ModItems.FERROSILICON_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERROTITANIUM_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROTITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.FERROTITANIUM_INGOT.get()), has(ModItems.FERROTITANIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FERROVANADIUM_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.FERROVANADIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.FERROVANADIUM_INGOT.get()), has(ModItems.FERROVANADIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HIGHSPEED_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.HIGHSPEED_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.HIGHSPEED_STEEL_INGOT.get()), has(ModItems.HIGHSPEED_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HSLA_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.HSLA_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.HSLA_STEEL_INGOT.get()), has(ModItems.HSLA_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.INVAR_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.INVAR_INGOT.get())
                .unlockedBy(getHasName(ModItems.INVAR_INGOT.get()), has(ModItems.INVAR_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IRON_HYDRIDE_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.IRON_HYDRIDE_INGOT.get())
                .unlockedBy(getHasName(ModItems.IRON_HYDRIDE_INGOT.get()), has(ModItems.IRON_HYDRIDE_INGOT.get()))
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.KANTHAL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.KANTHAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.KANTHAL_INGOT.get()), has(ModItems.KANTHAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.KOVAR_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.KOVAR_INGOT.get())
                .unlockedBy(getHasName(ModItems.KOVAR_INGOT.get()), has(ModItems.KOVAR_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MARAGING_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.MARAGING_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MARAGING_STEEL_INGOT.get()), has(ModItems.MARAGING_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MUSHET_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.MUSHET_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MUSHET_STEEL_INGOT.get()), has(ModItems.MUSHET_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PIG_IRON_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.PIG_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.PIG_IRON_INGOT.get()), has(ModItems.PIG_IRON_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REYNOLDS_FTO_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.REYNOLDS_FTO_INGOT.get())
                .unlockedBy(getHasName(ModItems.REYNOLDS_FTO_INGOT.get()), has(ModItems.REYNOLDS_FTO_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILICON_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SILICON_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILICON_STEEL_INGOT.get()), has(ModItems.SILICON_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVER_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SILVER_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_STEEL_INGOT.get()), has(ModItems.SILVER_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SPIEGELEISEN_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SPIEGELEISEN_INGOT.get())
                .unlockedBy(getHasName(ModItems.SPIEGELEISEN_INGOT.get()), has(ModItems.SPIEGELEISEN_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SPRING_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.SPRING_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.SPRING_STEEL_INGOT.get()), has(ModItems.SPRING_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STAINLESS_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.STAINLESS_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STAINLESS_STEEL_INGOT.get()), has(ModItems.STAINLESS_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STABALLOY_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.STABALLOY_INGOT.get())
                .unlockedBy(getHasName(ModItems.STABALLOY_INGOT.get()), has(ModItems.STABALLOY_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TOOL_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.TOOL_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.TOOL_STEEL_INGOT.get()), has(ModItems.TOOL_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WEATHERING_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.WEATHERING_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.WEATHERING_STEEL_INGOT.get()), has(ModItems.WEATHERING_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WOOTZ_STEEL_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.WOOTZ_STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.WOOTZ_STEEL_INGOT.get()), has(ModItems.WOOTZ_STEEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WROUGHT_IRON_BLOCK.get(), 9)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .define('i', ModItems.WROUGHT_IRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.WROUGHT_IRON_INGOT.get()), has(ModItems.WROUGHT_IRON_INGOT.get()))
                .save(pRecipeOutput);

//Lead Alloys (4)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOLYBDOCHALKOS_BLOCK.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.MOLYBDOCHALKOS_INGOT.get())
                .unlockedBy(getHasName(ModItems.MOLYBDOCHALKOS_INGOT.get()), has(ModItems.MOLYBDOCHALKOS_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SOLDER_BLOCK.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.SOLDER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SOLDER_INGOT.get()), has(ModItems.SOLDER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TERNE_BLOCK.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.TERNE_INGOT.get())
                .unlockedBy(getHasName(ModItems.TERNE_INGOT.get()), has(ModItems.TERNE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TYPE_METAL_BLOCK.get(), 9)
                .pattern("lll")
                .pattern("lll")
                .pattern("lll")
                .define('l', ModItems.TYPE_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.TYPE_METAL_INGOT.get()), has(ModItems.TYPE_METAL_INGOT.get()))
                .save(pRecipeOutput);

//Magnesium Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELEKTRON_BLOCK.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.ELEKTRON_INGOT.get())
                .unlockedBy(getHasName(ModItems.ELEKTRON_INGOT.get()), has(ModItems.ELEKTRON_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TMGALZN_BLOCK.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.TMGALZN_INGOT.get())
                .unlockedBy(getHasName(ModItems.TMGALZN_INGOT.get()), has(ModItems.TMGALZN_INGOT.get()))
                .save(pRecipeOutput);

//Manganese Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MNFZ_BLOCK.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.MNFZ_INGOT.get())
                .unlockedBy(getHasName(ModItems.MNFZ_INGOT.get()), has(ModItems.MNFZ_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MNSZ_BLOCK.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.MNSZ_INGOT.get())
                .unlockedBy(getHasName(ModItems.MNSZ_INGOT.get()), has(ModItems.MNSZ_INGOT.get()))
                .save(pRecipeOutput);

//Mercury (Cinnabar) Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZINC_AMALGAM_BLOCK.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.ZINC_AMALGAM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ZINC_AMALGAM_INGOT.get()), has(ModItems.ZINC_AMALGAM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ASHTADHATU_BLOCK.get(), 9)
                .pattern("mmm")
                .pattern("mmm")
                .pattern("mmm")
                .define('m', ModItems.ASHTADHATU_INGOT.get())
                .unlockedBy(getHasName(ModItems.ASHTADHATU_INGOT.get()), has(ModItems.ASHTADHATU_INGOT.get()))
                .save(pRecipeOutput);

        //Nickel Alloys (21)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMEL_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.ALUMEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.ALUMEL_INGOT.get()), has(ModItems.ALUMEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRIGHTRAY_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.BRIGHTRAY_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRIGHTRAY_INGOT.get()), has(ModItems.BRIGHTRAY_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHROMEL_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.CHROMEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.CHROMEL_INGOT.get()), has(ModItems.CHROMEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COIN_SILVER_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.COIN_SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.COIN_SILVER_INGOT.get()), has(ModItems.COIN_SILVER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_NICKEL_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.COPPER_NICKEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.COPPER_NICKEL_INGOT.get()), has(ModItems.COPPER_NICKEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CUPRONICKEL_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.CUPRONICKEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.CUPRONICKEL_INGOT.get()), has(ModItems.CUPRONICKEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GERMAN_SILVER_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.GERMAN_SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.GERMAN_SILVER_INGOT.get()), has(ModItems.GERMAN_SILVER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HASTELLOY_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.HASTELLOY_INGOT.get())
                .unlockedBy(getHasName(ModItems.HASTELLOY_INGOT.get()), has(ModItems.HASTELLOY_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUSLER_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.HAUSLER_INGOT.get())
                .unlockedBy(getHasName(ModItems.HAUSLER_INGOT.get()), has(ModItems.HAUSLER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.INCONEL_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.INCONEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.INCONEL_INGOT.get()), has(ModItems.INCONEL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.INCONEL_SES_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.INCONEL_SES_INGOT.get())
                .unlockedBy(getHasName(ModItems.INCONEL_SES_INGOT.get()), has(ModItems.INCONEL_SES_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MONEL_METAL_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.MONEL_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MONEL_METAL_INGOT.get()), has(ModItems.MONEL_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NICKEL_CARBON_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NICKEL_CARBON_INGOT.get())
                .unlockedBy(getHasName(ModItems.NICKEL_CARBON_INGOT.get()), has(ModItems.NICKEL_CARBON_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NICKEL_HYDRIDE_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NICKEL_HYDRIDE_INGOT.get())
                .unlockedBy(getHasName(ModItems.NICKEL_HYDRIDE_INGOT.get()), has(ModItems.NICKEL_HYDRIDE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NICROSIL_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NICROSIL_INGOT.get())
                .unlockedBy(getHasName(ModItems.NICROSIL_INGOT.get()), has(ModItems.NICROSIL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NIMONIC_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NIMONIC_INGOT.get())
                .unlockedBy(getHasName(ModItems.NIMONIC_INGOT.get()), has(ModItems.NIMONIC_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NISIL_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NISIL_INGOT.get())
                .unlockedBy(getHasName(ModItems.NISIL_INGOT.get()), has(ModItems.NISIL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NITINOL_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.NITINOL_INGOT.get())
                .unlockedBy(getHasName(ModItems.NITINOL_INGOT.get()), has(ModItems.NITINOL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MU_METAL_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.MU_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.MU_METAL_INGOT.get()), has(ModItems.MU_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PERMALLOY_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.PERMALLOY_INGOT.get())
                .unlockedBy(getHasName(ModItems.PERMALLOY_INGOT.get()), has(ModItems.PERMALLOY_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SUPERMALLOY_BLOCK.get(), 9)
                .pattern("nnn")
                .pattern("nnn")
                .pattern("nnn")
                .define('n', ModItems.SUPERMALLOY_INGOT.get())
                .unlockedBy(getHasName(ModItems.SUPERMALLOY_INGOT.get()), has(ModItems.SUPERMALLOY_INGOT.get()))
                .save(pRecipeOutput);

//Potassium Alloys (2)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NAK_BLOCK.get(), 9)
                .pattern("ppp")
                .pattern("ppp")
                .pattern("ppp")
                .define('p', ModItems.NAK_INGOT.get())
                .unlockedBy(getHasName(ModItems.NAK_INGOT.get()), has(ModItems.NAK_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.KLI_BLOCK.get(), 9)
                .pattern("ppp")
                .pattern("ppp")
                .pattern("ppp")
                .define('p', ModItems.KLI_INGOT.get())
                .unlockedBy(getHasName(ModItems.KLI_INGOT.get()), has(ModItems.KLI_INGOT.get()))
                .save(pRecipeOutput);

//Rhodium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PSEUDO_PALLADIUM_BLOCK.get(), 9)
                .pattern("rrr")
                .pattern("rrr")
                .pattern("rrr")
                .define('r', ModItems.PSEUDO_PALLADIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PSEUDO_PALLADIUM_INGOT.get()), has(ModItems.PSEUDO_PALLADIUM_INGOT.get()))
                .save(pRecipeOutput);

//Scandium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SCANDIUM_HYDRIDE_BLOCK.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.SCANDIUM_HYDRIDE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SCANDIUM_HYDRIDE_INGOT.get()), has(ModItems.SCANDIUM_HYDRIDE_INGOT.get()))
                .save(pRecipeOutput);

//Silver Alloys (9)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ARGENTIUM_STERLING_SILVER_BLOCK.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.ARGENTIUM_STERLING_SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.ARGENTIUM_STERLING_SILVER_INGOT.get()), has(ModItems.ARGENTIUM_STERLING_SILVER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRITANNIA_SILVER_BLOCK.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.BRITANNIA_SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRITANNIA_SILVER_INGOT.get()), has(ModItems.BRITANNIA_SILVER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DORE_BLOCK.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.DORE_INGOT.get())
                .unlockedBy(getHasName(ModItems.DORE_INGOT.get()), has(ModItems.DORE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DYMALLOY_BLOCK.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.DYMALLOY_INGOT.get())
                .unlockedBy(getHasName(ModItems.DYMALLOY_INGOT.get()), has(ModItems.DYMALLOY_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GOLOID_BLOCK.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.GOLOID_INGOT.get())
                .unlockedBy(getHasName(ModItems.GOLOID_INGOT.get()), has(ModItems.GOLOID_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLATINUM_SILVER_BLOCK.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.PLATINUM_SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_SILVER_INGOT.get()), has(ModItems.PLATINUM_SILVER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SHIBUICHI_BLOCK.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.SHIBUICHI_INGOT.get())
                .unlockedBy(getHasName(ModItems.SHIBUICHI_INGOT.get()), has(ModItems.SHIBUICHI_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STERLING_SILVER_BLOCK.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.STERLING_SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.STERLING_SILVER_INGOT.get()), has(ModItems.STERLING_SILVER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIBETAN_SILVER_BLOCK.get(), 9)
                .pattern("sss")
                .pattern("sss")
                .pattern("sss")
                .define('s', ModItems.TIBETAN_SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.TIBETAN_SILVER_INGOT.get()), has(ModItems.TIBETAN_SILVER_INGOT.get()))
                .save(pRecipeOutput);

//Tin Alloys (4)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BABBITT_BLOCK.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.BABBITT_INGOT.get())
                .unlockedBy(getHasName(ModItems.BABBITT_INGOT.get()), has(ModItems.BABBITT_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRITANNIUM_BLOCK.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.BRITANNIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.BRITANNIUM_INGOT.get()), has(ModItems.BRITANNIUM_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PEWTER_BLOCK.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.PEWTER_INGOT.get())
                .unlockedBy(getHasName(ModItems.PEWTER_INGOT.get()), has(ModItems.PEWTER_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUEENS_METAL_BLOCK.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.QUEENS_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.QUEENS_METAL_INGOT.get()), has(ModItems.QUEENS_METAL_INGOT.get()))
                .save(pRecipeOutput);

//Titanium Alloys (6)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAL_FV_BLOCK.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.SAL_FV_INGOT.get())
                .unlockedBy(getHasName(ModItems.SAL_FV_INGOT.get()), has(ModItems.SAL_FV_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BETA_C_BLOCK.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.BETA_C_INGOT.get())
                .unlockedBy(getHasName(ModItems.BETA_C_INGOT.get()), has(ModItems.BETA_C_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GUM_METAL_BLOCK.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.GUM_METAL_INGOT.get())
                .unlockedBy(getHasName(ModItems.GUM_METAL_INGOT.get()), has(ModItems.GUM_METAL_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITANIUM_GOLD_BLOCK.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.TITANIUM_GOLD_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_GOLD_INGOT.get()), has(ModItems.TITANIUM_GOLD_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITANIUM_HYDRIDE_BLOCK.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.TITANIUM_HYDRIDE_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_HYDRIDE_INGOT.get()), has(ModItems.TITANIUM_HYDRIDE_INGOT.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITANIUM_NITRIDE_BLOCK.get(), 9)
                .pattern("ttt")
                .pattern("ttt")
                .pattern("ttt")
                .define('t', ModItems.TITANIUM_NITRIDE_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_NITRIDE_INGOT.get()), has(ModItems.TITANIUM_NITRIDE_INGOT.get()))
                .save(pRecipeOutput);

//Zirconium Alloys (1)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ZIRCALOY_BLOCK.get(), 9)
                .pattern("zzz")
                .pattern("zzz")
                .pattern("zzz")
                .define('z', ModItems.ZIRCALOY_INGOT.get())
                .unlockedBy(getHasName(ModItems.ZIRCALOY_INGOT.get()), has(ModItems.ZIRCALOY_INGOT.get()))
                .save(pRecipeOutput);
    }
}
