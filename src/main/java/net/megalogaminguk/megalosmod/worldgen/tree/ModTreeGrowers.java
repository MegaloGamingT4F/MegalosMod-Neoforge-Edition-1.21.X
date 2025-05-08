package net.megalogaminguk.megalosmod.worldgen.tree;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower BLACK_ASH = new TreeGrower(MegalosMod.MOD_ID + ":black_ash",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLACK_ASH_KEY), Optional.empty());

}