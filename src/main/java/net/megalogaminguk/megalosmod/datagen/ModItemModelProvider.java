package net.megalogaminguk.megalosmod.datagen;

import net.megalogaminguk.megalosmod.MegalosMod;
import net.megalogaminguk.megalosmod.block.ModBlocks;
import net.megalogaminguk.megalosmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MegalosMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Ingot
        basicItem(ModItems.ALUMINIUM_INGOT.get());
        basicItem(ModItems.ANTIMONY_INGOT.get());
        basicItem(ModItems.ARSENIC_INGOT.get());
        basicItem(ModItems.BARIUM_INGOT.get());
        basicItem(ModItems.BERYLLIUM_INGOT.get());
        basicItem(ModItems.BISMUTH_INGOT.get());
        basicItem(ModItems.CADMIUM_INGOT.get());
        basicItem(ModItems.CAESIUM_INGOT.get());
        basicItem(ModItems.CALCIUM_INGOT.get());
        basicItem(ModItems.CHROMIUM_INGOT.get());
        basicItem(ModItems.CINNABAR_INGOT.get());
        basicItem(ModItems.COBALT_INGOT.get());
        basicItem(ModItems.GALLIUM_INGOT.get());
        basicItem(ModItems.GERMANIUM_INGOT.get());
        basicItem(ModItems.HAFNIUM_INGOT.get());
        basicItem(ModItems.INDIUM_INGOT.get());
        basicItem(ModItems.IRIDIUM_INGOT.get());
        basicItem(ModItems.LEAD_INGOT.get());
        basicItem(ModItems.LITHIUM_INGOT.get());
        basicItem(ModItems.MAGNESIUM_INGOT.get());
        basicItem(ModItems.MANGANESE_INGOT.get());
        basicItem(ModItems.MOLYBDENUM_INGOT.get());
        basicItem(ModItems.NICKEL_INGOT.get());
        basicItem(ModItems.NIOBIUM_INGOT.get());
        basicItem(ModItems.OSMIUM_INGOT.get());
        basicItem(ModItems.PALLADIUM_INGOT.get());
        basicItem(ModItems.PHOSPHORUS_INGOT.get());
        basicItem(ModItems.PLATINUM_INGOT.get());
        basicItem(ModItems.POTASSIUM_INGOT.get());
        basicItem(ModItems.RHENIUM_INGOT.get());
        basicItem(ModItems.RHODIUM_INGOT.get());
        basicItem(ModItems.RUBIDIUM_INGOT.get());
        basicItem(ModItems.RUTHENIUM_INGOT.get());
        basicItem(ModItems.SCANDIUM_INGOT.get());
        basicItem(ModItems.SELENIUM_INGOT.get());
        basicItem(ModItems.SILICON_INGOT.get());
        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.SODIUM_INGOT.get());
        basicItem(ModItems.STRONTIUM_INGOT.get());
        basicItem(ModItems.TANTALUM_INGOT.get());
        basicItem(ModItems.TECHNETIUM_INGOT.get());
        basicItem(ModItems.TELLURIUM_INGOT.get());
        basicItem(ModItems.THALLIUM_INGOT.get());
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.TITANIUM_INGOT.get());
        basicItem(ModItems.TUNGSTEN_INGOT.get());
        basicItem(ModItems.VANADIUM_INGOT.get());
        basicItem(ModItems.YTTRIUM_INGOT.get());
        basicItem(ModItems.ZINC_INGOT.get());
        basicItem(ModItems.ZIRCONIUM_INGOT.get());

        //Nugget
        basicItem(ModItems.ALUMINIUM_NUGGET.get());
        basicItem(ModItems.ANTIMONY_NUGGET.get());
        basicItem(ModItems.ARSENIC_NUGGET.get());
        basicItem(ModItems.BARIUM_NUGGET.get());
        basicItem(ModItems.BERYLLIUM_NUGGET.get());
        basicItem(ModItems.BISMUTH_NUGGET.get());
        basicItem(ModItems.CADMIUM_NUGGET.get());
        basicItem(ModItems.CAESIUM_NUGGET.get());
        basicItem(ModItems.CALCIUM_NUGGET.get());
        basicItem(ModItems.CHROMIUM_NUGGET.get());
        basicItem(ModItems.CINNABAR_NUGGET.get());
        basicItem(ModItems.COBALT_NUGGET.get());
        basicItem(ModItems.GALLIUM_NUGGET.get());
        basicItem(ModItems.GERMANIUM_NUGGET.get());
        basicItem(ModItems.HAFNIUM_NUGGET.get());
        basicItem(ModItems.INDIUM_NUGGET.get());
        basicItem(ModItems.IRIDIUM_NUGGET.get());
        basicItem(ModItems.LEAD_NUGGET.get());
        basicItem(ModItems.LITHIUM_NUGGET.get());
        basicItem(ModItems.MAGNESIUM_NUGGET.get());
        basicItem(ModItems.MANGANESE_NUGGET.get());
        basicItem(ModItems.MOLYBDENUM_NUGGET.get());
        basicItem(ModItems.NICKEL_NUGGET.get());
        basicItem(ModItems.NIOBIUM_NUGGET.get());
        basicItem(ModItems.OSMIUM_NUGGET.get());
        basicItem(ModItems.PALLADIUM_NUGGET.get());
        basicItem(ModItems.PHOSPHORUS_NUGGET.get());
        basicItem(ModItems.PLATINUM_NUGGET.get());
        basicItem(ModItems.POTASSIUM_NUGGET.get());
        basicItem(ModItems.RHENIUM_NUGGET.get());
        basicItem(ModItems.RHODIUM_NUGGET.get());
        basicItem(ModItems.RUBIDIUM_NUGGET.get());
        basicItem(ModItems.RUTHENIUM_NUGGET.get());
        basicItem(ModItems.SCANDIUM_NUGGET.get());
        basicItem(ModItems.SELENIUM_NUGGET.get());
        basicItem(ModItems.SILICON_NUGGET.get());
        basicItem(ModItems.SILVER_NUGGET.get());
        basicItem(ModItems.SODIUM_NUGGET.get());
        basicItem(ModItems.STRONTIUM_NUGGET.get());
        basicItem(ModItems.TANTALUM_NUGGET.get());
        basicItem(ModItems.TECHNETIUM_NUGGET.get());
        basicItem(ModItems.TELLURIUM_NUGGET.get());
        basicItem(ModItems.THALLIUM_NUGGET.get());
        basicItem(ModItems.TIN_NUGGET.get());
        basicItem(ModItems.TITANIUM_NUGGET.get());
        basicItem(ModItems.TUNGSTEN_NUGGET.get());
        basicItem(ModItems.VANADIUM_NUGGET.get());
        basicItem(ModItems.YTTRIUM_NUGGET.get());
        basicItem(ModItems.ZINC_NUGGET.get());
        basicItem(ModItems.ZIRCONIUM_NUGGET.get());

        //Dust
        basicItem(ModItems.ALUMINIUM_DUST.get());
        basicItem(ModItems.ANTIMONY_DUST.get());
        basicItem(ModItems.ARSENIC_DUST.get());
        basicItem(ModItems.BARIUM_DUST.get());
        basicItem(ModItems.BERYLLIUM_DUST.get());
        basicItem(ModItems.BISMUTH_DUST.get());
        basicItem(ModItems.CADMIUM_DUST.get());
        basicItem(ModItems.CAESIUM_DUST.get());
        basicItem(ModItems.CALCIUM_DUST.get());
        basicItem(ModItems.CHROMIUM_DUST.get());
        basicItem(ModItems.CINNABAR_DUST.get());
        basicItem(ModItems.COBALT_DUST.get());
        basicItem(ModItems.COPPER_DUST.get());
        basicItem(ModItems.GALLIUM_DUST.get());
        basicItem(ModItems.GERMANIUM_DUST.get());
        basicItem(ModItems.HAFNIUM_DUST.get());
        basicItem(ModItems.INDIUM_DUST.get());
        basicItem(ModItems.IRIDIUM_DUST.get());
        basicItem(ModItems.LEAD_DUST.get());
        basicItem(ModItems.LITHIUM_DUST.get());
        basicItem(ModItems.MAGNESIUM_DUST.get());
        basicItem(ModItems.MANGANESE_DUST.get());
        basicItem(ModItems.MOLYBDENUM_DUST.get());
        basicItem(ModItems.NICKEL_DUST.get());
        basicItem(ModItems.NIOBIUM_DUST.get());
        basicItem(ModItems.OSMIUM_DUST.get());
        basicItem(ModItems.PALLADIUM_DUST.get());
        basicItem(ModItems.PHOSPHORUS_DUST.get());
        basicItem(ModItems.PLATINUM_DUST.get());
        basicItem(ModItems.POTASSIUM_DUST.get());
        basicItem(ModItems.RHENIUM_DUST.get());
        basicItem(ModItems.RHODIUM_DUST.get());
        basicItem(ModItems.RUBIDIUM_DUST.get());
        basicItem(ModItems.RUTHENIUM_DUST.get());
        basicItem(ModItems.SCANDIUM_DUST.get());
        basicItem(ModItems.SELENIUM_DUST.get());
        basicItem(ModItems.SILICON_DUST.get());
        basicItem(ModItems.SILVER_DUST.get());
        basicItem(ModItems.SODIUM_DUST.get());
        basicItem(ModItems.STRONTIUM_DUST.get());
        basicItem(ModItems.TANTALUM_DUST.get());
        basicItem(ModItems.TECHNETIUM_DUST.get());
        basicItem(ModItems.TELLURIUM_DUST.get());
        basicItem(ModItems.THALLIUM_DUST.get());
        basicItem(ModItems.TIN_DUST.get());
        basicItem(ModItems.TITANIUM_DUST.get());
        basicItem(ModItems.TUNGSTEN_DUST.get());
        basicItem(ModItems.VANADIUM_DUST.get());
        basicItem(ModItems.YTTRIUM_DUST.get());
        basicItem(ModItems.ZINC_DUST.get());
        basicItem(ModItems.ZIRCONIUM_DUST.get());

        //Raw
        basicItem(ModItems.RAW_ALUMINIUM.get());
        basicItem(ModItems.RAW_ANTIMONY.get());
        basicItem(ModItems.RAW_ARSENIC.get());
        basicItem(ModItems.RAW_BARIUM.get());
        basicItem(ModItems.RAW_BERYLLIUM.get());
        basicItem(ModItems.RAW_BISMUTH.get());
        basicItem(ModItems.RAW_CADMIUM.get());
        basicItem(ModItems.RAW_CAESIUM.get());
        basicItem(ModItems.RAW_CALCIUM.get());
        basicItem(ModItems.RAW_CHROMIUM.get());
        basicItem(ModItems.RAW_CINNABAR.get());
        basicItem(ModItems.RAW_COBALT.get());
        basicItem(ModItems.RAW_GALLIUM.get());
        basicItem(ModItems.RAW_GERMANIUM.get());
        basicItem(ModItems.RAW_HAFNIUM.get());
        basicItem(ModItems.RAW_INDIUM.get());
        basicItem(ModItems.RAW_IRIDIUM.get());
        basicItem(ModItems.RAW_LEAD.get());
        basicItem(ModItems.RAW_LITHIUM.get());
        basicItem(ModItems.RAW_MAGNESIUM.get());
        basicItem(ModItems.RAW_MANGANESE.get());
        basicItem(ModItems.RAW_MOLYBDENUM.get());
        basicItem(ModItems.RAW_NICKEL.get());
        basicItem(ModItems.RAW_NIOBIUM.get());
        basicItem(ModItems.RAW_OSMIUM.get());
        basicItem(ModItems.RAW_PALLADIUM.get());
        basicItem(ModItems.RAW_PHOSPHORUS.get());
        basicItem(ModItems.RAW_PLATINUM.get());
        basicItem(ModItems.RAW_POTASSIUM.get());
        basicItem(ModItems.RAW_RHENIUM.get());
        basicItem(ModItems.RAW_RHODIUM.get());
        basicItem(ModItems.RAW_RUBIDIUM.get());
        basicItem(ModItems.RAW_RUTHENIUM.get());
        basicItem(ModItems.RAW_SCANDIUM.get());
        basicItem(ModItems.RAW_SELENIUM.get());
        basicItem(ModItems.RAW_SILICON.get());
        basicItem(ModItems.RAW_SILVER.get());
        basicItem(ModItems.RAW_SODIUM.get());
        basicItem(ModItems.RAW_STRONTIUM.get());
        basicItem(ModItems.RAW_TANTALUM.get());
        basicItem(ModItems.RAW_TECHNETIUM.get());
        basicItem(ModItems.RAW_TELLURIUM.get());
        basicItem(ModItems.RAW_THALLIUM.get());
        basicItem(ModItems.RAW_TIN.get());
        basicItem(ModItems.RAW_TITANIUM.get());
        basicItem(ModItems.RAW_TUNGSTEN.get());
        basicItem(ModItems.RAW_VANADIUM.get());
        basicItem(ModItems.RAW_YTTRIUM.get());
        basicItem(ModItems.RAW_ZINC.get());
        basicItem(ModItems.RAW_ZIRCONIUM.get());

        //Armour
        basicItem(ModItems.ARMOUR_PADDING.get());

        //Metallurgy - Hoplology
        basicItem(ModItems.FABRIC_GRIP.get());
        basicItem(ModItems.FABRIC_STRAP.get());

        basicItem(ModItems.ALUMINIUM_AXEHEAD.get());
        basicItem(ModItems.ALUMINIUM_BLADE.get());
        basicItem(ModItems.ALUMINIUM_GUARD.get());
        basicItem(ModItems.ALUMINIUM_HILT.get());
        basicItem(ModItems.ALUMINIUM_SHOVELHEAD.get());
        basicItem(ModItems.ALUMINIUM_POMMEL.get());
        basicItem(ModItems.ALUMINIUM_PICK.get());
        basicItem(ModItems.ALUMINIUM_PLATE.get());

        basicItem(ModItems.SILVER_AXEHEAD.get());
        basicItem(ModItems.SILVER_BLADE.get());
        basicItem(ModItems.SILVER_GUARD.get());
        basicItem(ModItems.SILVER_HILT.get());
        basicItem(ModItems.SILVER_SHOVELHEAD.get());
        basicItem(ModItems.SILVER_POMMEL.get());
        basicItem(ModItems.SILVER_PICK.get());
        basicItem(ModItems.SILVER_PLATE.get());

        basicItem(ModItems.TITANIUM_AXEHEAD.get());
        basicItem(ModItems.TITANIUM_BLADE.get());
        basicItem(ModItems.TITANIUM_GUARD.get());
        basicItem(ModItems.TITANIUM_HILT.get());
        basicItem(ModItems.TITANIUM_SHOVELHEAD.get());
        basicItem(ModItems.TITANIUM_POMMEL.get());
        basicItem(ModItems.TITANIUM_PICK.get());
        basicItem(ModItems.TITANIUM_PLATE.get());

        handheldItem(ModItems.ALUMINIUM_SWORD);
        handheldItem(ModItems.ALUMINIUM_PICKAXE);
        handheldItem(ModItems.ALUMINIUM_SHOVEL);
        handheldItem(ModItems.ALUMINIUM_AXE);
        handheldItem(ModItems.ALUMINIUM_HOE);

        handheldItem(ModItems.SILVER_SWORD);
        handheldItem(ModItems.SILVER_PICKAXE);
        handheldItem(ModItems.SILVER_SHOVEL);
        handheldItem(ModItems.SILVER_AXE);
        handheldItem(ModItems.SILVER_HOE);

        handheldItem(ModItems.TITANIUM_SWORD);
        handheldItem(ModItems.TITANIUM_PICKAXE);
        handheldItem(ModItems.TITANIUM_SHOVEL);
        handheldItem(ModItems.TITANIUM_AXE);
        handheldItem(ModItems.TITANIUM_HOE);

        trimmedArmorItem(ModItems.ALUMINIUM_HELMET);
        trimmedArmorItem(ModItems.ALUMINIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.ALUMINIUM_LEGGINGS);
        trimmedArmorItem(ModItems.ALUMINIUM_BOOTS);

        trimmedArmorItem(ModItems.SILVER_HELMET);
        trimmedArmorItem(ModItems.SILVER_CHESTPLATE);
        trimmedArmorItem(ModItems.SILVER_LEGGINGS);
        trimmedArmorItem(ModItems.SILVER_BOOTS);

        trimmedArmorItem(ModItems.TITANIUM_HELMET);
        trimmedArmorItem(ModItems.TITANIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.TITANIUM_LEGGINGS);
        trimmedArmorItem(ModItems.TITANIUM_BOOTS);

        //Alloys - Ingot
        basicItem(ModItems.AA_INGOT.get());

        //Alloys - Nugget
        basicItem(ModItems.AA_NUGGET.get());

        //Alloys - Dust
        basicItem(ModItems.AA_DUST.get());

        //Nature - Bush
        basicItem(ModItems.GOOSEBERRY_BERRIES.get());

        //Nature - Sapling
        saplingItem(ModBlocks.BLACK_ASH_SAPLING);

        //Nature - Crop
        basicItem(ModItems.BHUT_JOLOKIA_CHILLI.get());
        basicItem(ModItems.BIRDS_EYE_CHILLI.get());
        basicItem(ModItems.CAROLINA_REAPER_CHILLI.get());
        basicItem(ModItems.CAYENNE_CHILLI.get());
        basicItem(ModItems.HABANERO_CHILLI.get());
        basicItem(ModItems.JALAPENO_CHILLI.get());
        basicItem(ModItems.NAGA_GHOST_CHILLI.get());
        basicItem(ModItems.PADRON_CHILLI.get());
        basicItem(ModItems.POBLANO_CHILLI.get());
        basicItem(ModItems.SCOTCH_BONNET_CHILLI.get());
        basicItem(ModItems.SILING_LABUYO_CHILLI.get());
        basicItem(ModItems.TABASCO_CHILLI.get());
        basicItem(ModItems.TRINIDAD_SCORPION_CHILLI.get());

        //Nature - Seeds
        basicItem(ModItems.BHUT_JOLOKIA_CHILLI_SEEDS.get());
        basicItem(ModItems.BIRDS_EYE_CHILLI_SEEDS.get());
        basicItem(ModItems.CAROLINA_REAPER_CHILLI_SEEDS.get());
        basicItem(ModItems.CAYENNE_CHILLI_SEEDS.get());
        basicItem(ModItems.HABANERO_CHILLI_SEEDS.get());
        basicItem(ModItems.JALAPENO_CHILLI_SEEDS.get());
        basicItem(ModItems.NAGA_GHOST_CHILLI_SEEDS.get());
        basicItem(ModItems.PADRON_CHILLI_SEEDS.get());
        basicItem(ModItems.POBLANO_CHILLI_SEEDS.get());
        basicItem(ModItems.SCOTCH_BONNET_CHILLI_SEEDS.get());
        basicItem(ModItems.SILING_LABUYO_CHILLI_SEEDS.get());
        basicItem(ModItems.TABASCO_CHILLI_SEEDS.get());
        basicItem(ModItems.TRINIDAD_SCORPION_CHILLI_SEEDS.get());
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID, "block/" + item.getId().getPath()));
    }
    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = MegalosMod.MOD_ID; // Change this to your mod id

        if (itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace() + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(MegalosMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}