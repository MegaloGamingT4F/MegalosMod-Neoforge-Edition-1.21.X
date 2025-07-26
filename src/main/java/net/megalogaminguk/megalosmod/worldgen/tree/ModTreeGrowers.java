package net.megalogaminguk.megalosmod.worldgen.tree;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower BLACK_ASH = new TreeGrower(MegalosMod.MOD_ID + ":black_ash",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLACK_ASH_KEY), Optional.empty());
    public static final TreeGrower MAPLE_SYCAMORE = new TreeGrower(MegalosMod.MOD_ID + ":maple_sycamore",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MAPLE_SYCAMORE_KEY), Optional.empty());

}