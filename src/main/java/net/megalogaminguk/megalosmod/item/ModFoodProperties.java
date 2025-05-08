package net.megalogaminguk.megalosmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {

    //Crop

    public static final FoodProperties BHUTJOLOKIACHILLI_CHILLI = new FoodProperties.Builder().nutrition(2)
            .saturationModifier(0.15f).effect(() ->new MobEffectInstance(MobEffects.HUNGER, 120),0.35f).fast().build();
    //Bush
    public static final FoodProperties GOOSEBERRY_BERRY = new FoodProperties.Builder().nutrition(2)
            .saturationModifier(0.15f).fast().build();
}
