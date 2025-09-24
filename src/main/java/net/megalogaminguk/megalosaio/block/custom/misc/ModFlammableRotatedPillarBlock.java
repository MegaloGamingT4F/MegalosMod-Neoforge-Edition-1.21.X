package net.megalogaminguk.megalosaio.block.custom.misc;

import net.megalogaminguk.megalosaio.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context,
                                                     ItemAbility itemAbility, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            //Log
            if(state.is(ModBlocks.BLACK_ASH_LOG)) {
                return ModBlocks.STRIPPED_BLACK_ASH_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.MAPLE_SYCAMORE_LOG)) {
                return ModBlocks.STRIPPED_MAPLE_SYCAMORE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.EBONY_LOG)) {
                return ModBlocks.STRIPPED_EBONY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            //Wood
            if(state.is(ModBlocks.BLACK_ASH_WOOD)) {
                return ModBlocks.STRIPPED_BLACK_ASH_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.MAPLE_SYCAMORE_WOOD)) {
                return ModBlocks.STRIPPED_MAPLE_SYCAMORE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.EBONY_WOOD)) {
                return ModBlocks.STRIPPED_EBONY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}