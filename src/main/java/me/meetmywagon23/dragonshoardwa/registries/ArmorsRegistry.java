package me.meetmywagon23.dragonshoardwa.registries;

import me.meetmywagon23.dragonshoardwa.DragonsHoardWA;
import me.meetmywagon23.dragonshoardwa.materials.DragonsHoardWAArmorMaterials;
import me.meetmywagon23.dragonshoardwa.items.armoritems.DragonsHoardWAArmorSetItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.EnumMap;
import java.util.EnumSet;

public class ArmorsRegistry {
    public static final EnumMap<DragonsHoardWAArmorMaterials, EnumMap<ArmorItem .Type, Item>> armorItems = new EnumMap<>(DragonsHoardWAArmorMaterials.class);

    protected static String armorID(DragonsHoardWAArmorMaterials armorSet, ArmorItem.Type type) {
        String slotID = switch (type) {
            case BOOTS -> "boots";
            case CHESTPLATE -> "chestplate";
            case HELMET -> "helmet";
            case LEGGINGS -> "leggings";
            default -> throw new IllegalArgumentException("armor with non-armor type provided");
        };
        return armorSet.getName() + "_" + slotID;
    }

    protected static void registerArmor(DragonsHoardWAArmorMaterials armorSet, EnumSet<ArmorItem.Type> type) {
        EnumMap<ArmorItem.Type, Item> typeItemEnumMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type armorType : type) {
            DragonsHoardWAArmorSetItem item = new DragonsHoardWAArmorSetItem(armorSet, armorType);
            typeItemEnumMap.put(armorType, item);
            Registry.register(Registries.ITEM, DragonsHoardWA.ID(armorID(armorSet, armorType)), item);
        }
        armorItems.put(armorSet, typeItemEnumMap);
    }

    public static void register() {
        for (DragonsHoardWAArmorMaterials armorSet : DragonsHoardWAArmorMaterials.values()) {
            registerArmor(armorSet, armorSet.getSlots());
        }
        DragonsHoardWA.LOGGER.info("Registered Armors from the Dragon's Hoard!");
    }
}
