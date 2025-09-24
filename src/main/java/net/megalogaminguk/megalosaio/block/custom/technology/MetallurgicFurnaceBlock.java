package net.megalogaminguk.megalosaio.block.custom.technology;

import com.mojang.serialization.MapCodec;
import net.megalogaminguk.megalosaio.block.entity.MetallurgicFurnaceBlockEntity;
import net.megalogaminguk.megalosaio.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class MetallurgicFurnaceBlock extends BaseEntityBlock {
    public static final MapCodec<MetallurgicFurnaceBlock> CODEC = simpleCodec(MetallurgicFurnaceBlock::new);

    public MetallurgicFurnaceBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {

        return new MetallurgicFurnaceBlockEntity(blockPos, blockState);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving){
        if (state.getBlock() != newState.getBlock()){
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof MetallurgicFurnaceBlockEntity metallurgicFurnaceBlockEntity){
                metallurgicFurnaceBlockEntity.drops();
            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos,
                                              Player player, InteractionHand hand, BlockHitResult result){
        if (!level.isClientSide()){
            BlockEntity entity = level.getBlockEntity(pos);
            if (entity instanceof MetallurgicFurnaceBlockEntity metallurgicFurnaceBlockEntity){
                ((ServerPlayer) player).openMenu(new SimpleMenuProvider(metallurgicFurnaceBlockEntity, Component.literal("Metallurgic Furnace")), pos);
            } else {
                throw new IllegalStateException("Our Container provider is Missing");
            }
        }
        return ItemInteractionResult.sidedSuccess(level.isClientSide());
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> blockEntityType) {
        if (level.isClientSide()){
            return null;
        }

        return createTickerHelper(blockEntityType, ModBlockEntities.METALLURGIC_FURNACE_BE.get(),
                (level1, blockPos, blockState, blockEntity) -> blockEntity.tick(level1, blockPos, blockState));
    }
}
