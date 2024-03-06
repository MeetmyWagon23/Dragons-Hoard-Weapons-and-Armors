package me.meetmywagon23.dragonshoardwa.data;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class DragonsHoardWATags {
    public static class Items {
        public static final TagKey<Item> LIGHT_ARMORS = createTag("light_armors");
        public static final TagKey<Item> MEDIUM_ARMORS = createTag("medium_armors");
        public static final TagKey<Item> HEAVY_ARMORS = createTag("heavy_armors");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(name));
        }
    }
}
