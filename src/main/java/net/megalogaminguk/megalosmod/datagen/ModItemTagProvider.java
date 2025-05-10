package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.item.ModItems;
import net.megalogaminguk.megalosmod.util.ModTags;
import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MegalosMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS)
                .add(ModItems.ALUMINIUM_SWORD.get())
                .add(ModItems.SILVER_SWORD.get())
                .add(ModItems.TITANIUM_SWORD.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.ALUMINIUM_PICKAXE.get())
                .add(ModItems.SILVER_PICKAXE.get())
                .add(ModItems.TITANIUM_PICKAXE.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.ALUMINIUM_SHOVEL.get())
                .add(ModItems.SILVER_SHOVEL.get())
                .add(ModItems.TITANIUM_SHOVEL.get());

        tag(ItemTags.AXES)
                .add(ModItems.ALUMINIUM_AXE.get())
                .add(ModItems.SILVER_AXE.get())
                .add(ModItems.TITANIUM_AXE.get());

        tag(ItemTags.HOES)
                .add(ModItems.ALUMINIUM_HOE.get())
                .add(ModItems.SILVER_HOE.get())
                .add(ModItems.TITANIUM_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ALUMINIUM_HELMET.get())
                .add(ModItems.ALUMINIUM_CHESTPLATE.get())
                .add(ModItems.ALUMINIUM_LEGGINGS.get())
                .add(ModItems.ALUMINIUM_BOOTS.get())

                .add(ModItems.SILVER_HELMET.get())
                .add(ModItems.SILVER_CHESTPLATE.get())
                .add(ModItems.SILVER_LEGGINGS.get())
                .add(ModItems.SILVER_BOOTS.get())

                .add(ModItems.TITANIUM_HELMET.get())
                .add(ModItems.TITANIUM_CHESTPLATE.get())
                .add(ModItems.TITANIUM_LEGGINGS.get())
                .add(ModItems.TITANIUM_BOOTS.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.BLACK_ASH_LOG.get().asItem())
                .add(ModBlocks.BLACK_ASH_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BLACK_ASH_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BLACK_ASH_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.BLACK_ASH_PLANKS.asItem());

        this.tag(ModTags.Items.FUEL_ITEMS)
                .add(Items.COAL)
                .add(Items.COAL_BLOCK)
                .add(Items.COAL);

    }
}