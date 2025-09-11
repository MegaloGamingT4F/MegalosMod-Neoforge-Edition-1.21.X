package net.megalogaminguk.megalosmod.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.recipe.MetallurgicFurnaceRecipe;
import net.megalogaminguk.megalosmod.recipe.ModRecipes;
import net.megalogaminguk.megalosmod.screen.custom.MetallurgicFurnaceScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIMegalosModPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "jei_plugin");
     }

     @Override
    public void registerCategories(IRecipeCategoryRegistration registration){
        registration.addRecipeCategories(new MetallurgicFurnaceRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
     }

     @Override
    public void registerRecipes(IRecipeRegistration registration){
         RecipeManager recipeManager= Minecraft.getInstance().level.getRecipeManager();

         List<MetallurgicFurnaceRecipe> metallurgicFurnaceRecipes = recipeManager
                 .getAllRecipesFor(ModRecipes.METALLURGIC_FURNACE_TYPE.get()).stream().map(RecipeHolder::value).toList();
         registration.addRecipes(MetallurgicFurnaceRecipeCategory.METALLURGIC_FURNACE_RECIPE_RECIPE_TYPE, metallurgicFurnaceRecipes);
     }

     @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration){
        registration.addRecipeClickArea(MetallurgicFurnaceScreen.class, 74, 30, 22, 20,
                MetallurgicFurnaceRecipeCategory.METALLURGIC_FURNACE_RECIPE_RECIPE_TYPE);

     }

     @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration){
        registration.addRecipeCatalyst(new ItemStack(ModBlocks.METALLURGIC_FURNACE.get().asItem()),
                MetallurgicFurnaceRecipeCategory.METALLURGIC_FURNACE_RECIPE_RECIPE_TYPE);
     }
}
