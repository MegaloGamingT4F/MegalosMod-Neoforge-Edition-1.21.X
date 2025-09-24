package net.megalogaminguk.megalosaio.worldgen.tree;

import net.megalogaminguk.megalosaio.MegalosAIO;
import net.megalogaminguk.megalosaio.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower BLACK_ASH = new TreeGrower(MegalosAIO.MOD_ID + ":black_ash",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLACK_ASH_KEY), Optional.empty());
    public static final TreeGrower MAPLE_SYCAMORE = new TreeGrower(MegalosAIO.MOD_ID + ":maple_sycamore",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MAPLE_SYCAMORE_KEY), Optional.empty());
    public static final TreeGrower EBONY = new TreeGrower(MegalosAIO.MOD_ID + "ebony",
            Optional.empty(),Optional.of(ModConfiguredFeatures.EBONY_KEY), Optional.empty());

}