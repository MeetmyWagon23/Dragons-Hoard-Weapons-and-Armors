package me.meetmywagon23.dragonshoardwa.data;

import me.meetmywagon23.dragonshoardwa.registries.ItemGroupRegistry;
import me.meetmywagon23.dragonshoardwa.registries.ItemsRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class DragonsHoardWAEnglishUSLangProvider extends FabricLanguageProvider {
    protected DragonsHoardWAEnglishUSLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemsRegistry.COPPER_COIN, "Copper Coin");
        translationBuilder.add(ItemsRegistry.COPPER_COIN_FIVE_STACK, "Copper Coin Stack (5)");
        translationBuilder.add(ItemsRegistry.COPPER_COIN_TEN_STACK, "Copper Coin Stack (10)");
        translationBuilder.add(ItemsRegistry.SILVER_COIN, "Silver Coin");
        translationBuilder.add(ItemsRegistry.SILVER_COIN_FIVE_STACK, "Silver Coin Stack (5)");
        translationBuilder.add(ItemsRegistry.SILVER_COIN_TEN_STACK, "Silver Coin Stack (10)");
        translationBuilder.add(ItemsRegistry.GOLD_COIN, "Gold Coin");
        translationBuilder.add(ItemsRegistry.GOLD_COIN_FIVE_STACK, "Gold Coin Stack (5)");
        translationBuilder.add(ItemsRegistry.GOLD_COIN_TEN_STACK, "Gold Coin Stack (10)");
        translationBuilder.add(ItemsRegistry.PLATINUM_COIN, "Platinum Coin");
        translationBuilder.add(ItemsRegistry.PLATINUM_COIN_FIVE_STACK, "Platinum Coin Stack (5)");
        translationBuilder.add(ItemsRegistry.PLATINUM_COIN_TEN_STACK, "Platinum Coin Stack (10)");




        translationBuilder.add(ItemGroupRegistry.DRAGONSHOARD_WA, "Dragon's Hoard: Weapons and Armors");
        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/dragonshoardwa/lang/en_us.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("failed to add existing language file", e);
        }

    }
}
