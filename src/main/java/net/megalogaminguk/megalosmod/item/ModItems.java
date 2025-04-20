package net.megalogaminguk.megalosmod.item;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MegalosMod.MOD_ID);

    //Ingots
    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()));

    //Nuggets
    public static final DeferredItem<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget",
            () -> new Item(new Item.Properties()));

    //Dust
    public static final DeferredItem<Item> ALUMINIUM_DUST = ITEMS.register("aluminium_dust",
            () -> new Item(new Item.Properties()));

    //Raw
    public static final DeferredItem<Item> ALUMINIUM_RAW = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
