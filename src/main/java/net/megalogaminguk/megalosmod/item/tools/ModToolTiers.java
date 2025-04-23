package net.megalogaminguk.megalosmod.item.tools;

import net.megalogaminguk.megalosmod.item.ModItems;
import net.megalogaminguk.megalosmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier ALUMINIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ALUMINIUM_TOOL,
            180,5f,2f,15, () -> Ingredient.of(ModItems.ALUMINIUM_INGOT));
    public static final Tier SILVER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SILVER_TOOL,
            700,10f,1f,21, () -> Ingredient.of(ModItems.SILVER_INGOT));
    public static final Tier TITANIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL,
            1200,8f,3f,13, () -> Ingredient.of(ModItems.TITANIUM_INGOT));
}
