package me.meetmywagon23.dragonshoardwa.armormaterials;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public interface IDragonsHoardArmorMaterial extends ArmorMaterial {

     double getDragonsHoardProtectionAmountForSlot(ArmorItem.Type type);
}
