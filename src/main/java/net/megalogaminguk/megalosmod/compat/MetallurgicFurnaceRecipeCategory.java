package net.megalogaminguk.megalosmod.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.recipe.MetallurgicFurnaceRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

public class MetallurgicFurnaceRecipeCategory implements IRecipeCategory<MetallurgicFurnaceRecipe> {
    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "metallurgic_furnace");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID,
            "textures/gui/metallurgic_furnace/metallurgic_furnace_gui.png");

    public static final RecipeType<MetallurgicFurnaceRecipe> METALLURGIC_FURNACE_RECIPE_RECIPE_TYPE =
            new RecipeType<>(UID, MetallurgicFurnaceRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public MetallurgicFurnaceRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE,0,0,176,85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.METALLURGIC_FURNACE));
    }

    @Override
    public RecipeType<MetallurgicFurnaceRecipe> getRecipeType() {
        return METALLURGIC_FURNACE_RECIPE_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.megalosmod.metallurgic_furnace");
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return icon;
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, MetallurgicFurnaceRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 54, 34).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 104, 34).addItemStack(recipe.getResultItem(null));
    }
}
