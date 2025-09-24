package net.megalogaminguk.megalosaio.recipe;

import net.megalogaminguk.megalosaio.MegalosAIO;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, MegalosAIO.MOD_ID);

    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, MegalosAIO.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<MetallurgicFurnaceRecipe>> METALLURGIC_FURNACE_SERIALIZER =
            SERIALIZERS.register("metallurgic_furnace_smelting", MetallurgicFurnaceRecipe.Serializer::new);

    public static final DeferredHolder<RecipeType<?>, RecipeType<MetallurgicFurnaceRecipe>> METALLURGIC_FURNACE_TYPE =
            TYPES.register("metallurgic_furnace_smelting", () -> new RecipeType<MetallurgicFurnaceRecipe>() {
                @Override
                public String toString() {
                    return "metallurgic_furnace_smelting";
                }
            });


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}