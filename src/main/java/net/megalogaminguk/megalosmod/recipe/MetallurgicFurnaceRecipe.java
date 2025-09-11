package net.megalogaminguk.megalosmod.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public record MetallurgicFurnaceRecipe(Ingredient inputItem, ItemStack output) implements Recipe<MetallurgicFurnaceRecipeInput> {
    @Override
    public NonNullList<Ingredient> getIngredients(){
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(MetallurgicFurnaceRecipeInput metallurgicFurnaceRecipeInput, Level level) {
        if (level.isClientSide()){
            return false;
        }
        return inputItem.test(metallurgicFurnaceRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(MetallurgicFurnaceRecipeInput metallurgicFurnaceRecipeInput, HolderLookup.Provider provider) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.METALLURGIC_FURNACE_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.METALLURGIC_FURNACE_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<MetallurgicFurnaceRecipe> {
        public static final MapCodec<MetallurgicFurnaceRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC_NONEMPTY.fieldOf("ingredient").forGetter(MetallurgicFurnaceRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(MetallurgicFurnaceRecipe::output)
        ).apply(inst, MetallurgicFurnaceRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, MetallurgicFurnaceRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, MetallurgicFurnaceRecipe::inputItem,
                        ItemStack.STREAM_CODEC, MetallurgicFurnaceRecipe::output,
                        MetallurgicFurnaceRecipe::new);

        @Override
        public MapCodec<MetallurgicFurnaceRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, MetallurgicFurnaceRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}
