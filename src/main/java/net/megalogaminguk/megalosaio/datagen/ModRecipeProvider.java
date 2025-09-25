package net.megalogaminguk.megalosaio.datagen;

import net.megalogaminguk.megalosaio.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_ASH_WALL.get(),4)
                .pattern(" B ")
                .pattern("BBB")
                .define('B', ModBlocks.BLACK_ASH_PLANKS.get())
                .unlockedBy("has_bismuth", has(ModBlocks.BLACK_ASH_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EBONY_WALL.get(),4)
                .pattern(" B ")
                .pattern("BBB")
                .define('B', ModBlocks.EBONY_PLANKS.get())
                .unlockedBy("has_bismuth", has(ModBlocks.EBONY_PLANKS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAPLE_SYCAMORE_WALL.get(),4)
                .pattern(" B ")
                .pattern("BBB")
                .define('B', ModBlocks.MAPLE_SYCAMORE_PLANKS.get())
                .unlockedBy("has_bismuth", has(ModBlocks.MAPLE_SYCAMORE_PLANKS)).save(recipeOutput);

        //Black Ash
        stairBuilder(ModBlocks.BLACK_ASH_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_ASH_PLANKS)).group("black_ash")
                .unlockedBy("has_black_ash", has(ModBlocks.BLACK_ASH_PLANKS)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_ASH_SLAB.get(), ModBlocks.BLACK_ASH_PLANKS.get());

        buttonBuilder(ModBlocks.BLACK_ASH_BUTTON.get(), Ingredient.of(ModBlocks.BLACK_ASH_PLANKS.get())).group("black_ash")
                .unlockedBy("has_black_ash", has(ModBlocks.BLACK_ASH_PLANKS.get())).save(recipeOutput);

        pressurePlate(recipeOutput, ModBlocks.BLACK_ASH_PRESSURE_PLATE.get(), ModBlocks.BLACK_ASH_PLANKS.get());

        fenceBuilder(ModBlocks.BLACK_ASH_FENCE.get(), Ingredient.of(ModBlocks.BLACK_ASH_PLANKS.get())).group("black_ash")
                .unlockedBy("has_black_ash", has(ModBlocks.BLACK_ASH_PLANKS.get())).save(recipeOutput);

        fenceGateBuilder(ModBlocks.BLACK_ASH_FENCE_GATE.get(), Ingredient.of(ModBlocks.BLACK_ASH_PLANKS.get())).group("black_ash")
                .unlockedBy("has_black_ash", has(ModBlocks.BLACK_ASH_PLANKS.get())).save(recipeOutput);

        doorBuilder(ModBlocks.BLACK_ASH_DOOR.get(), Ingredient.of(ModBlocks.BLACK_ASH_PLANKS.get())).group("black_ash")
                .unlockedBy("has_black_ash", has(ModBlocks.BLACK_ASH_PLANKS.get())).save(recipeOutput);

        trapdoorBuilder(ModBlocks.BLACK_ASH_TRAPDOOR.get(), Ingredient.of(ModBlocks.BLACK_ASH_PLANKS.get())).group("black_ash")
                .unlockedBy("has_black_ash", has(ModBlocks.BLACK_ASH_PLANKS.get())).save(recipeOutput);

        //Ebony
        stairBuilder(ModBlocks.EBONY_STAIRS.get(), Ingredient.of(ModBlocks.EBONY_PLANKS)).group("ebony")
                .unlockedBy("has_ebony", has(ModBlocks.EBONY_PLANKS)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONY_SLAB.get(), ModBlocks.EBONY_PLANKS.get());

        buttonBuilder(ModBlocks.EBONY_BUTTON.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get())).group("ebony")
                .unlockedBy("has_ebony", has(ModBlocks.EBONY_PLANKS.get())).save(recipeOutput);

        pressurePlate(recipeOutput, ModBlocks.EBONY_PRESSURE_PLATE.get(), ModBlocks.EBONY_PLANKS.get());

        fenceBuilder(ModBlocks.EBONY_FENCE.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get())).group("ebony")
                .unlockedBy("has_ebony", has(ModBlocks.EBONY_PLANKS.get())).save(recipeOutput);

        fenceGateBuilder(ModBlocks.EBONY_FENCE_GATE.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get())).group("ebony")
                .unlockedBy("has_ebony", has(ModBlocks.EBONY_PLANKS.get())).save(recipeOutput);

        doorBuilder(ModBlocks.EBONY_DOOR.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get())).group("ebony")
                .unlockedBy("has_ebony", has(ModBlocks.EBONY_PLANKS.get())).save(recipeOutput);

        trapdoorBuilder(ModBlocks.EBONY_TRAPDOOR.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get())).group("ebony")
                .unlockedBy("has_ebony", has(ModBlocks.EBONY_PLANKS.get())).save(recipeOutput);

        //Maple Sycamore
        stairBuilder(ModBlocks.MAPLE_SYCAMORE_STAIRS.get(), Ingredient.of(ModBlocks.MAPLE_SYCAMORE_PLANKS)).group("maple_sycamore")
                .unlockedBy("has_maple_sycamore", has(ModBlocks.MAPLE_SYCAMORE_PLANKS)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_SYCAMORE_SLAB.get(), ModBlocks.MAPLE_SYCAMORE_PLANKS.get());

        buttonBuilder(ModBlocks.MAPLE_SYCAMORE_BUTTON.get(), Ingredient.of(ModBlocks.MAPLE_SYCAMORE_PLANKS.get())).group("maple_sycamore")
                .unlockedBy("has_maple_sycamore", has(ModBlocks.MAPLE_SYCAMORE_PLANKS.get())).save(recipeOutput);

        pressurePlate(recipeOutput, ModBlocks.MAPLE_SYCAMORE_PRESSURE_PLATE.get(), ModBlocks.MAPLE_SYCAMORE_PLANKS.get());

        fenceBuilder(ModBlocks.MAPLE_SYCAMORE_FENCE.get(), Ingredient.of(ModBlocks.MAPLE_SYCAMORE_PLANKS.get())).group("maple_sycamore")
                .unlockedBy("has_maple_sycamore", has(ModBlocks.MAPLE_SYCAMORE_PLANKS.get())).save(recipeOutput);

        fenceGateBuilder(ModBlocks.MAPLE_SYCAMORE_FENCE_GATE.get(), Ingredient.of(ModBlocks.MAPLE_SYCAMORE_PLANKS.get())).group("maple_sycamore")
                .unlockedBy("has_maple_sycamore", has(ModBlocks.MAPLE_SYCAMORE_PLANKS.get())).save(recipeOutput);

        doorBuilder(ModBlocks.MAPLE_SYCAMORE_DOOR.get(), Ingredient.of(ModBlocks.MAPLE_SYCAMORE_PLANKS.get())).group("maple_sycamore")
                .unlockedBy("has_maple_sycamore", has(ModBlocks.MAPLE_SYCAMORE_PLANKS.get())).save(recipeOutput);

        trapdoorBuilder(ModBlocks.MAPLE_SYCAMORE_TRAPDOOR.get(), Ingredient.of(ModBlocks.MAPLE_SYCAMORE_PLANKS.get())).group("maple_sycamore")
                .unlockedBy("has_maple_sycamore", has(ModBlocks.MAPLE_SYCAMORE_PLANKS.get())).save(recipeOutput);

    }
}
