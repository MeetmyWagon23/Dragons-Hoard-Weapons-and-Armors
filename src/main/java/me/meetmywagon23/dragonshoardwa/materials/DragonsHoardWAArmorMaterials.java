package me.meetmywagon23.dragonshoardwa.materials;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import me.meetmywagon23.dragonshoardwa.registries.ItemsRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Rarity;

import java.util.EnumSet;

public enum DragonsHoardWAArmorMaterials implements ArmorMaterial {
    FLESH(
            "flesh",
            "flesh_armor",
            4,
            new int[]{
                    1,
                    1,
                    1,
                    1
            },
            1,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            0.0F,
            0.0F,
            Items.ROTTEN_FLESH
    ),
    // Leather's Stats: 5, new int[]{1, 2, 3, 1}
    LEAD(
            "lead",
            "lead_armor",
            4,
            new int[]{
                    1,
                    1,
                    2,
                    1
            },
            1,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            1.5f,
            0.2f,
            ItemsRegistry.LEAD_INGOT
    ),
    TIN(
            "tin",
            "tin_armor",
            5,
            new int[]{
                    1,
                    1,
                    2,
                    1
            },
            8,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0f,
            0.0f,
            ItemsRegistry.TIN_NUGGET
    ),
    ZINC(
            "zinc",
            "zinc_armor",
            6,
            new int[]{
                    1,
                    2,
                    3,
                    1
            },
            8,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            0.0f,
            0.0f,
            ItemsRegistry.ZINC_INGOT
    ),
    SILVER(
            "silver",
            "silver_armor",
            7,
            new int[]{
                    1,
                    2,
                    2,
                    1
            },
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            0.4f,
            0.0f,
            ItemsRegistry.SILVER_INGOT
    ),
    LIGHT_SILVER(
            "light_silver",
            "light_silver_armor",
            6,
            new int[]{
                    1,
                    1,
                    1,
                    1
            },
            14,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            0.2f,
            0.0f,
            ItemsRegistry.SILVER_INGOT
    ),
    ALUMINUM(
            "aluminum",
            "aluminum_armor",
            8,
            new int[]{
                    1,
                    2,
                    2,
                    1
            },
            8,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            0.0f,
            0.0f,
            ItemsRegistry.ALUMINUM_INGOT
    ),
    ELECTRUM(
            "electrum",
            "electrum_armor",
            9,
            new int[]{
                    2,
                    2,
                    3,
                    2
            },
            20,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            0.0f,
            0.0f,
            ItemsRegistry.ELECTRUM_INGOT
    ),
    COPPER(
            "copper",
            "copper_armor",
            10,
            new int[]{
                    1,
                    2,
                    2,
                    2
            },
            3,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0f,
            0.0f,
            Items.COPPER_INGOT
    ),
    LIGHT_COPPER(
            "light_copper",
            "light_copper_armor",
            8,
            new int[]{
                    1,
                    1,
                    2,
                    1
            },
            3,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0f,
            0.0f,
            Items.COPPER_INGOT
    ),
    BRASS(
            "brass",
            "brass_armor",
            11,
            new int[]{
                    2,
                    2,
                    2,
                    2
            },
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            1.5f,
            0.4f,
            ItemsRegistry.BRASS_INGOT
    ),
    BRONZE(
            "bronze",
            "bronze_armor",
            12,
            new int[]{
                    2,
                    4,
                    4,
                    2
            },
            4,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.8f,
            0.0f,
            ItemsRegistry.BRONZE_INGOT
    ),
    PLATINUM(
            "platinum",
            "platinum_armor",
            14,
            new int[]{
                    2,
                    4,
                    5,
                    2
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            0.0f,
            0.0f,
            ItemsRegistry.PLATINUM_INGOT
    ),
    LIGHT_PLATINUM(
            "light_platinum",
            "light_platinum_armor",
            11,
            new int[]{
                    2,
                    3,
                    4,
                    1
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            0.0f,
            0.0f,
            ItemsRegistry.PLATINUM_INGOT
    ),
    BONE(
            "bone",
            "bone_armor",
            4,
            new int[]{
                    2,
                    5,
                    5,
                    2
            },
            2,
            SoundEvents.ENTITY_SKELETON_AMBIENT,
            1.0f,
            0.0f,
            Items.BONE
    ),
    // Iron's Stats: 15, new int[]{2, 5, 6, 2}
    LIGHT_IRON(
            "light_iron",
            "light_iron_armors",
            12,
            new int[]{
                    1,
                    4,
                    4,
                    1
            },
            16,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.5f,
            0.f,
            Items.IRON_INGOT
    ),
    INFERNAL_IRON(
            "infernal_iron",
            "infernal_iron_armor",
            15,
            new int[]{
                    2,
                    5,
                    6,
                    2
            },
            13,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            1.5f,
            0.1f,
            ItemsRegistry.INFERNAL_IRON_INGOT
    ),
    COLD_IRON_MAIL(
            "cold_iron_mail",
            "cold_iron_mail",
            15,
            new int[]{
                    2,
                    4,
                    4,
                    2
            },
            13,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
            1.5f,
            0.1f,
            ItemsRegistry.COLD_IRON_INGOT
    ),
    WITHER_BONE(
            "wither_bone",
            "wither_bone_armor",
            12,
            new int[]{
                    2,
                    5,
                    6,
                    2
            },
            2,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            2.0f,
            0.1f,
            ItemsRegistry.WITHER_BONE
    ),
    STEEL(
            "steel",
            "steel_armor",
            21,
            new int[]{
                    3,
                    6,
                    7,
                    3
            },
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            2.0f,
            0.1f,
            ItemsRegistry.STEEL_INGOT
    ),
    STEEL_CHAIN(
            "steel_chain",
            "steel_chain_armor",
            17,
            new int[]{
                    2,
                    4,
                    5,
                    2
            },
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
            1.0f,
            0.0f,
            ItemsRegistry.STEEL_INGOT
    ),
    ELVEN_STEEL(
            "elven_steel",
            "elven_steel_armor",
            26,
            new int[]{
                    3,
                    6,
                    7,
                    3
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            1.5f,
            0.0f,
            ItemsRegistry.ELVEN_STEEL_INGOT
    ),
    ELVEN_STEEL_MAIL(
            "elven_steel_mail",
            "elven_steel_mail",
            21,
            new int[]{
                    2,
                    4,
                    5,
                    2
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
            0.7f,
            0.0f,
            ItemsRegistry.ELVEN_STEEL_INGOT
    ),
    DARK_STEEL(
            "dark_steel",
            "dark_steel_armor",
            26,
            new int[]{
                    3,
                    6,
                    7,
                    3
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            2.0f,
            0.2f,
            ItemsRegistry.DARK_STEEL_INGOT
    ),
    DARK_STEEL_MAIL(
            "dark_steel_mail",
            "dark_steel_mail",
            21,
            new int[]{
                    2,
                    4,
                    5,
                    2
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
            1.0f,
            0.1f,
            ItemsRegistry.DARK_STEEL_INGOT
    ),
    // Diamond's Stats: 25, new int[]{3, 6, 8, 3}
    // Netherite's Stats: 37, new int[]{3, 6, 8, 3}
    // Note: Dragon scale mail is a LIGHT ARMOR!!!!
    DRAGON_SCALE_MAIL(
            "dragon_scale_mail",
            "dragon_scale_mail",
            46,
            new int[]{
                    4,
                    7,
                    9,
                    4
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            1.0f,
            0.0f,
            ItemsRegistry.DRAGON_SCALE
    ),
    PALLADIUM(
            "palladium",
            "palladium_armor",
            41,
            new int[]{
                    4,
                    7,
                    9,
                    4
            },
            22,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.1f,
            ItemsRegistry.PALLADIUM_INGOT
    ),
    LIGHT_PALLADIUM(
            "light_palladium",
            "light_palladium_armor",
            32,
            new int[]{
                    3,
                    5,
                    6,
                    3
            },
            22,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            1.0f,
            0.0f,
            ItemsRegistry.PALLADIUM_INGOT
    ),
    TUNGSTEN_CARBIDE(
            "tungsten_carbide",
            "tungsten_carbide_armor",
            55,
            new int[]{
                    5,
                    8,
                    10,
                    5
            },
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0f,
            0.3f,
            ItemsRegistry.TUNGSTEN_CARBIDE_INGOT
    ),
    MITHRIL_MAIL(
            "mithril_mail",
            "mithril_mail",
            49,
            new int[]{
                    4,
                    6,
                    7,
                    4
            },
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            1.7f,
            0.1f,
            ItemsRegistry.MITHRIL_INGOT
    ),
    ADAMANTINE(
            "adamantine",
            "adamantine_armor",
            62,
            new int[]{
                    6,
                    10,
                    12,
                    6
            },
            12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            4.0f,
            0.4f,
            ItemsRegistry.ADAMANTINE_INGOT
    ),
    LIGHT_ADAMANTINE(
            "light_adamantine",
            "light_adamantine_armor",
            50,
            new int[]{
                    4,
                    7,
                    8,
                    4
            },
            12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.2f,
            ItemsRegistry.ADAMANTINE_INGOT
    ),
    SHADOW_ADAMANTINE(
            "shadow_adamantine",
            "shadow_adamantine_armor",
            62,
            new int[]{
                    6,
                    10,
                    12,
                    6
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            4.0f,
            0.4f,
            ItemsRegistry.SHADOW_ADAMANTINE_INGOT
    ),
    LIGHT_SHADOW_ADAMANTINE(
            "light_shadow_adamantine",
            "light_shadow_adamantine_armor",
            50,
            new int[]{
                    4,
                    7,
                    8,
                    4
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.2f,
            ItemsRegistry.SHADOW_ADAMANTINE_INGOT
    ),
    ADAMANTINE_COATED_DRAGON_SCALE(
            "adamantine_dragon_scale",
            "adamantine_coated_dragon_scale_mail",
            67,
            new int[]{
                    7,
                    11,
                    13,
                    7
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            5f,
            0.4f,
            ItemsRegistry.ADAMANTINE_COATED_DRAGON_SCALE
    ),
    LIGHT_ADAMANTINE_COATED_DRAGON_SCALE(
            "light_adamantine_dragon_scale",
            "light_adamantine_coated_dragon_scale_mail",
            55,
            new int[]{
                    5,
                    8,
                    9,
                    5
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.5f,
            0.2f,
            ItemsRegistry.ADAMANTINE_COATED_DRAGON_SCALE
    ),
    SHADOW_ADAMANTINE_COATED_DRAGON_SCALE(
            "shadow_adamantine_coated_dragon_scale",
            "shadow_adamantine_coated_dragon_scale_mail",
            67,
            new int[]{
                    7,
                    11,
                    13,
                    7
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            5f,
            0.4f,
            ItemsRegistry.SHADOW_ADAMANTINE_COATED_DRAGON_SCALE
    ),
    LIGHT_SHADOW_ADAMANTINE_COATED_DRAGON_SCALE(
            "light_shadow_adamantine_coated_dragon_scale",
            "light_shadow_adamantine_coated_dragon_scale_mail",
            55,
            new int[]{
                    5,
                    8,
                    9,
                    5
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.5f,
            0.2f,
            ItemsRegistry.SHADOW_ADAMANTINE_COATED_DRAGON_SCALE
    ),

    /* -------- Legendary Armors Below Here -------- */
    DIVINE(
            "divine",
            "divine_armor",
            69,
            new int[]{
                    7,
                    11,
                    13,
                    7
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            6.0f,
            0.4f,
            ItemsRegistry.DIVINE_CATALYST
    ),
    LIGHT_DIVINE(
            "light_divine",
            "light_divine_armor",
            69,
            new int[]{
                    5,
                    8,
                    9,
                    5
            },
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0f,
            0.2f,
            ItemsRegistry.DIVINE_CATALYST
    ),
    GLACIAL(
            "glacial",
            "glacial_armor",
            9,
            new int[]{
                    7,
                    11,
                    13,
                    7
            },
            14,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            2.5f,
            0.2f,
            ItemsRegistry.ANCIENT_ICE
    ),
    E(
            "e",
            "e_armor",
            9,
            new int[]{
                    7,
                    11,
                    13,
                    7
            },
            14,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            2.5f,
            0.2f,
            ItemsRegistry.ANCIENT_ICE
    );

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String textureName;
    private final String setName;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    DragonsHoardWAArmorMaterials(String textureName, String setName, int durabilityMultiplier,
                                 int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness,
                                 float knockbackResistance, Item... items) {
        this.textureName = textureName;
        this.setName = setName;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Suppliers.memoize(() -> Ingredient.ofItems(items));
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public String getSetName() {
        return setName;
    }

    public Rarity getRarity() {
        return switch (this) {
            case FLESH -> Rarity.UNCOMMON;
            default -> Rarity.COMMON;
        };
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * this.durabilityMultiplier;
    }


    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts[type.getEquipmentSlot().getEntitySlotId()];
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
        return this.textureName;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public boolean isOf(DragonsHoardWAArmorMaterials armorSet) {
        return this == armorSet;
    }

    public boolean isOf(DragonsHoardWAArmorMaterials... armorSets) {
        for (DragonsHoardWAArmorMaterials armorSet : armorSets)
            if (this == armorSet)
                return true;
        return false;
    }

    public EnumSet<ArmorItem.Type> getSlots() {
        return switch (this) {
            /*
             * If the set only has a helmet:
             * case FLESH -> EnumSet.of(ArmorItem.Type.HELMET);
             * If the set only has a helmet and a chestplate:
             * case FLESH -> EnumSet.of(ArmorItem.Type.HELMET, ArmorItem.Type.CHESTPLATE);
             * If the set only has a helmet and a leggings:
             * case FLESH -> EnumSet.of(ArmorItem.Type.HELMET, ArmorItem.Type.LEGGINGS);
             * If the set only has a helmet and a boots:
             * case FLESH -> EnumSet.of(ArmorItem.Type.HELMET, ArmorItem.Type.BOOTS);
             * If the set only has a helmet, chestplate, and leggings:
             * case FLESH -> EnumSet.of(ArmorItem.Type.HELMET, ArmorItem.Type.CHESTPLATE, ArmorItem.Type.LEGGINGS);
             * If the set only has a helmet, chestplate, and boots:
             * case FLESH -> EnumSet.of(ArmorItem.Type.HELMET, ArmorItem.Type.CHESTPLATE, ArmorItem.Type.BOOTS);
             * If the set only has a helmet, leggings, and boots:
             * case FLESH -> EnumSet.of(ArmorItem.Type.HELMET, ArmorItem.Type.LEGGINGS, ArmorItem.Type.BOOTS);
             * If the set only has a helmet and boots:
             * case FLESH -> EnumSet.of(ArmorItem.Type.HELMET, ArmorItem.Type.BOOTS);
             *
             * If the set only has a chestplate:
             * case FLESH -> EnumSet.of(ArmorItem.Type.CHESTPLATE);
             * If the set only has a chestplate and a leggings:
             * case FLESH -> EnumSet.of(ArmorItem.Type.CHESTPLATE, ArmorItem.Type.LEGGINGS);
             * If the set only has a chestplate and a boots:
             * case FLESH -> EnumSet.of(ArmorItem.Type.CHESTPLATE, ArmorItem.Type.BOOTS);
             * If the set only has a chestplate, leggings, and boots:
             * case FLESH -> EnumSet.of(ArmorItem.Type.CHESTPLATE, ArmorItem.Type.LEGGINGS, ArmorItem.Type.BOOTS);
             *
             * If the set only has a leggings:
             * case FLESH -> EnumSet.of(ArmorItem.Type.LEGGINGS);
             * If the set only has a leggings and a boots:
             * case FLESH -> EnumSet.of(ArmorItem.Type.LEGGINGS, ArmorItem.Type.BOOTS);
             *
             * If the set only has a boots:
             * case FLESH -> EnumSet.of(ArmorItem.Type.BOOTS);
             *
             * If the set only has a full set:
             * default -> EnumSet.of(ArmorItem.Type.HELMET, ArmorItem.Type.CHESTPLATE, ArmorItem.Type.LEGGINGS, ArmorItem.Type.BOOTS);
             */
            default -> EnumSet.of(ArmorItem.Type.HELMET, ArmorItem.Type.CHESTPLATE, ArmorItem.Type.LEGGINGS, ArmorItem.Type.BOOTS);
        };
    }
}