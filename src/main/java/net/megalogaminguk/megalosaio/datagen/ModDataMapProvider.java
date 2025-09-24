package net.megalogaminguk.megalosaio.datagen;

import net.megalogaminguk.megalosaio.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider){
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        this.builder(NeoForgeDataMaps.COMPOSTABLES)
                //Nature - Crops

                //Nature - Seeds
                .add(ModItems.BHUT_JOLOKIA_CHILLI_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.BHUT_JOLOKIA_CHILLI.getId(), new Compostable(0.45f), false);
    }
}
