package me.meetmywagon23.dragonshoardwa.items;

import me.meetmywagon23.dragonshoardwa.registries.ItemGroupRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;

public class CoinItem extends Item {
    public CoinItem(Settings settings) {
        super(settings.maxCount(50));
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA)
                .register(entries -> entries.add(this.getDefaultStack()));
    }
}
