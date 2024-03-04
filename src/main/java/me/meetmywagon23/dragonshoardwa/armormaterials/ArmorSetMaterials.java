package me.meetmywagon23.dragonshoardwa.armormaterials;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public enum ArmorSetMaterials implements IDragonsHoardArmorMaterial {

    FLESH("flesh", 4, new double[]{0.4,0.6,0.8,0.5}, 1, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, Items.ROTTEN_FLESH);
    //leather                           5, new double[]{1, 2, 3, 1}
    //LEAD("lead", 4, new double[]{1,1,2,1}, 1, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,1.5f, 0.2f, ItemsRegistry.LEAD_INGOT), //unused
    //TIN("tin", 5, new double[]{1,1,2,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, ItemsRegistry.TIN_NUGGET), //unused
    //ZINC("zinc", 6, new double[]{1,2,3,1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsRegistry.ZINC_INGOT), //unused
    //SILVER("silver", 7, new double[]{1.2,1.5,2,1.3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.4f, 0.0f, ItemsRegistry.SILVER_INGOT),
    //LIGHT_SILVER("light_silver", 6, new double[]{.8,1,1.4,.9}, 14, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.2f, 0.0f, ItemsRegistry.SILVER_INGOT),
    //ALUMINUM("aluminum", 8, new double[]{1,2,2,1},8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsRegistry.ALUMINUM_INGOT), //unused
    //ELECTRUM("electrum", 9, new double[]{2,2,3,2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsRegistry.ELECTRUM_INGOT), //unused
    //COPPER("copper", 10, new double[]{1.4,1.7,2.3,1.6}, 3, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, Items.COPPER_INGOT),
    //LIGHT_COPPER("light_copper", 8, new double[]{.9,1.1,1.6,1.2}, 3, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.0f, 0.0f, Items.COPPER_INGOT),
    //BRASS("brass", 11, new double[]{1.6,1.9,2.3,1.5}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.5f, 0.4f, ItemsRegistry.BRASS_INGOT),
    //BRONZE("bronze", 12, new double[]{1.6,3.6,3.9,1.7}, 4, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.8f, 0.0f, ItemsRegistry.BRONZE_INGOT),
    //PLATINUM("platinum", 14, new double[]{1.8,4.4,5.2,1.8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsRegistry.PLATINUM_INGOT),
    //LIGHT_PLATINUM("light_platinum", 11, new double[]{2,3,4,1}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,0.0f, 0.0f, ItemsRegistry.PLATINUM_INGOT),
    //BONE("bone", 4, new double[]{1.8,4.6,5.3,1.8}, 2, SoundEvents.ENTITY_SKELETON_AMBIENT,1.0f, 0.0f, Items.BONE),
    //iron                             15, new double[]{2, 5, 6, 2}
    //LIGHT_IRON("light_iron", 12, new double[]{1.4,3.5,4.2,1.4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.5f, 0.f, Items.IRON_INGOT),
    //INFERNAL_IRON("infernal_iron", 15, new double[]{2.2,5.2,6.2,2.2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.5f, 0.1f, ItemsRegistry.INFERNAL_IRON_INGOT),
    //COLD_IRON_MAIL("cold_iron_mail", 12, new double[]{1.6,3.7,4.4,1.6}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.5f, 0.1f, ItemsRegistry.COLD_IRON_INGOT),
    //WITHER_BONE("wither_bone", 12, new double[]{2.4,5.4,6.4,2.4}, 2, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.0f, 0.1f, ItemsRegistry.WITHER_BONE),
    //STEEL("steel", 21, new double[]{2.6,5.6,6.6,2.6}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.0f, 0.1f, ItemsRegistry.STEEL_INGOT),
    //STEEL_CHAIN("steel_chain", 17, new double[]{1.8,3.9,4.6,1.8}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.0f, 0.0f, ItemsRegistry.STEEL_INGOT),
    //ELVEN_STEEL("elven_steel", 26, new double[]{2.8,5.8,6.8,2.8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.5f, 0.0f, ItemsRegistry.ELVEN_STEEL_INGOT),
    //ELVEN_STEEL_MAIL("elven_steel_mail", 21, new double[]{1.9,4,4.7,1.9}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON,0.7f, 0.0f, ItemsRegistry.ELVEN_STEEL_INGOT),
    //DARK_STEEL("dark_steel", 26, new double[]{2.8,5.8,6.8,2.8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.0f, 0.2f, ItemsRegistry.DARK_STEEL_INGOT),//half the weight of steel
    //DARK_STEEL_MAIL("dark_steel_mail", 21, new double[]{1.9,4,4.7,1.9}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON,1.0f, 0.1f, ItemsRegistry.DARK_STEEL_INGOT),//half the weight of steel

    //diamond                                   25, new double[]{3, 6, 8, 3}
    //netherite                                 37, new double[]{3, 6, 8, 3}
    //Dragon scale male is a LIGHT ARMOR!!!!
    //DRAGON_SCALE_MAIL("dragon_scale_mail", 46, new double[]{3.5,6.5,8.5,3.5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0f, 0.0f, ItemsRegistry.DRAGON_SCALE),
    //PALLADIUM("palladium", 41, new double[]{4,7,9,4}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.0f, 0.1f, ItemsRegistry.PALLADIUM_INGOT),
    //LIGHT_PALLADIUM("light_palladium", 32, new double[]{2.8,4.9,6.3,2.8}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,1.0f, 0.0f, ItemsRegistry.PALLADIUM_INGOT),
    //TUNGSTEN_CARBIDE("tungsten_carbide", 55, new double[]{5,8,10,5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,3.0f, 0.3f, ItemsRegistry.TUNGSTEN_CARBIDE_INGOT),
    //MITHRIL_MAIL("mithril_mail", 49, new double[]{3.5,5.6,7,3.5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,1.7f, 0.1f, ItemsRegistry.MITHRIL_INGOT),
    //ADAMANTINE("adamantine", 62, new double[]{6,10,12,6}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f, 0.4f, ItemsRegistry.ADAMANTINE_INGOT),
    //LIGHT_ADAMANTINE("light_adamantine", 50, new double[]{4.2,7,8.2,4.2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, 0.2f, ItemsRegistry.ADAMANTINE_INGOT),
    //SHADOW_ADAMANTINE("shadow_adamantine", 62, new double[]{6,10,12,6}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f, 0.4f, ItemsRegistry.SHADOW_ADAMANTINE_INGOT),
    //LIGHT_SHADOW_ADAMANTINE("light_shadow_adamantine", 50, new double[]{4.2,7,8.2,4.2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, 0.2f, ItemsRegistry.SHADOW_ADAMANTINE_INGOT),
    //ADAMANTINE_COATED_DRAGON_SCALE("adamantine_dragon_scale", 67, new double[]{6.5,10.5,12.5,6.5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 5f, 0.4f, ItemsRegistry.ADAMANTINE_COATED_DRAGON_SCALE),
    //LIGHT_ADAMANTINE_COATED_DRAGON_SCALE("light_shadow_adamantine", 55, new double[]{4.7,7.5,8.7,4.7}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f, 0.2f, ItemsRegistry.ADAMANTINE_COATED_DRAGON_SCALE),
    //SHADOW_ADAMANTINE_COATED_DRAGON_SCALE("shadow_adamantine_coated_dragon_scale", 67, new double[]{6.5,10.5,12.5,6.5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5f, 0.4f, ItemsRegistry.SHADOW_ADAMANTINE_COATED_DRAGON_SCALE),
    //LIGHT_SHADOW_ADAMANTINE_COATED_DRAGON_SCALE("shadow_adamantine_coated_dragon_scale", 55, new double[]{4.7,7.5,8.7,4.7}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f, 0.2f, ItemsRegistry.SHADOW_ADAMANTINE_COATED_DRAGON_SCALE),
    ////-------------------------------------------------------------------------Legendary Armors Below Here----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //DIVINE("divine", 69, new double[]{7,11,13,7}, 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,6.0f, 0.4f, ItemsRegistry.DIVINE_CATALYST),
    //LIGHT_DIVINE("light_divine", 69, new double[]{4.9,7.7,9.1,4.9}, 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,3.0f, 0.2f, ItemsRegistry.DIVINE_CATALYST),
    //GLACIAL("glacial", 9, new double[]{7,11,13,7}, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.5f, 0.2f, ItemsRegistry.ANCIENT_ICE),
    //E("E", 9, new double[]{7,11,13,7}, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.5f, 0.2f, ItemsRegistry.ANCIENT_ICE);




    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final double[] wagonsProtectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ArmorSetMaterials(String name, int durabilityMultiplier, double[] wagonsProtectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Item... items) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = new int[]{1, 1, 2, 1};
        this.wagonsProtectionAmounts = wagonsProtectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Suppliers.memoize(() -> Ingredient.ofItems(items));
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * this.durabilityMultiplier;
    }


    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public double getDragonsHoardProtectionAmountForSlot(ArmorItem.Type type) {
        return this.wagonsProtectionAmounts[type.getEquipmentSlot().getEntitySlotId()];
    }


    @Override
    public int getProtection(ArmorItem.Type type) {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}