package net.megalogaminguk.megalosmod.util;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ALUMINIUM_TOOL = createTag("needs_aluminium_tool");
        public static final TagKey<Block> NEEDS_SILVER_TOOL = createTag("needs_silver_tool");
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = createTag("needs_titanium_tool");
        public static final TagKey<Block> INCORRECT_FOR_ALUMINIUM_TOOL = createTag("incorrect_for_aluminium_tool");
        public static final TagKey<Block> INCORRECT_FOR_SILVER_TOOL = createTag("incorrect_for_silver_tool");
        public static final TagKey<Block> INCORRECT_FOR_TITANIUM_TOOL = createTag("incorrect_for_titanium_tool");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item>FUEL_ITEMS = createTag("fuel");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, name));
        }
    }
}
