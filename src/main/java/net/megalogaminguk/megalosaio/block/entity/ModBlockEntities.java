package net.megalogaminguk.megalosaio.block.entity;

import net.megalogaminguk.megalosaio.MegalosAIO;
import net.megalogaminguk.megalosaio.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MegalosAIO.MOD_ID);

    public static final Supplier<BlockEntityType<PedestalBlockEntity>> PEDESTAL_BE =
            BLOCK_ENTITIES.register("pedestal_be", () -> BlockEntityType.Builder.of(
                    PedestalBlockEntity::new, ModBlocks.PEDESTAL.get()).build(null));

    public static final Supplier<BlockEntityType<MetallurgicFurnaceBlockEntity>> METALLURGIC_FURNACE_BE =
            BLOCK_ENTITIES.register("metallurgic_furnace_be", () -> BlockEntityType.Builder.of(
                    MetallurgicFurnaceBlockEntity::new, ModBlocks.METALLURGIC_FURNACE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}