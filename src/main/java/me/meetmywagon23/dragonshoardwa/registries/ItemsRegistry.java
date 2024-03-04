package me.meetmywagon23.dragonshoardwa.registries;

import me.meetmywagon23.dragonshoardwa.DragonsHoardWA;
import me.meetmywagon23.dragonshoardwa.items.CoinItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemsRegistry {

    // Coins
    public static final CoinItem COPPER_COIN = new CoinItem(new Item.Settings());
    public static final CoinItem COPPER_COIN_FIVE_STACK = new CoinItem(new Item.Settings());
    public static final CoinItem COPPER_COIN_TEN_STACK = new CoinItem(new Item.Settings());
    public static final CoinItem SILVER_COIN = new CoinItem(new Item.Settings());
    public static final CoinItem SILVER_COIN_FIVE_STACK = new CoinItem(new Item.Settings());
    public static final CoinItem SILVER_COIN_TEN_STACK = new CoinItem(new Item.Settings());
    public static final CoinItem GOLD_COIN = new CoinItem(new Item.Settings());
    public static final CoinItem GOLD_COIN_FIVE_STACK = new CoinItem(new Item.Settings());
    public static final CoinItem GOLD_COIN_TEN_STACK = new CoinItem(new Item.Settings());
    public static final CoinItem PLATINUM_COIN = new CoinItem(new Item.Settings());
    public static final CoinItem PLATINUM_COIN_FIVE_STACK = new CoinItem(new Item.Settings());
    public static final CoinItem PLATINUM_COIN_TEN_STACK = new CoinItem(new Item.Settings());

    public static final Item LIGHT_ARMOR_MESH = new Item(new Item.Settings());


    protected static Item registerItems(String id, Item newItem) {
        Item item = Registry.register(Registries.ITEM, DragonsHoardWA.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(item));
        return item;
    }

    public static void register() {
        DragonsHoardWA.LOGGER.info("Registering Items for " + DragonsHoardWA.MOD_ID);
    }
}
