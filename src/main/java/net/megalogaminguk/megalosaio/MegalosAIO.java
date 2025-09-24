package net.megalogaminguk.megalosaio;

import net.megalogaminguk.megalosaio.block.ModBlocks;
import net.megalogaminguk.megalosaio.block.entity.ModBlockEntities;
import net.megalogaminguk.megalosaio.block.entity.renderer.PedestalBlockEntityRenderer;
import net.megalogaminguk.megalosaio.item.ModItems;
import net.megalogaminguk.megalosaio.loot.ModLootModifiers;
import net.megalogaminguk.megalosaio.recipe.ModRecipes;
import net.megalogaminguk.megalosaio.screen.ModMenuTypes;
import net.megalogaminguk.megalosaio.screen.custom.MetallurgicFurnaceScreen;
import net.megalogaminguk.megalosaio.tabs.ModCreativeModeTabs;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(MegalosAIO.MOD_ID)
public class MegalosAIO
{
    public static final String MOD_ID = "megalosaio";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MegalosAIO(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLootModifiers.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);

        //add item to vanilla creative tabs
        modEventBus.addListener(this::addCreative);

        //Config
        modContainer.registerConfig(ModConfig.Type.COMMON, net.megalogaminguk.megalosaio.Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

        @SubscribeEvent
        public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL_BE.get(), PedestalBlockEntityRenderer::new);
        }

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event){
            event.register(ModMenuTypes.METALLURGIC_FURNACE_MENU.get(), MetallurgicFurnaceScreen::new);
        }
    }
}