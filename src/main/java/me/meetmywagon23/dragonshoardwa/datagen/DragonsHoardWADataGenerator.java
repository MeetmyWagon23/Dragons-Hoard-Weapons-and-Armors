package me.meetmywagon23.dragonshoardwa.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DragonsHoardWADataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(DragonsHoardWAEnglishUSLangProvider::new);
        pack.addProvider(DragonsHoardWAItemTagProvider::new);
        pack.addProvider(DragonsHoardWAModelProvider::new);
    }
}
