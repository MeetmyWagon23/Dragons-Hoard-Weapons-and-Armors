package me.meetmywagon23.dragonshoardwa.items.armoritems;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import me.meetmywagon23.dragonshoardwa.materials.DragonsHoardWAArmorMaterials;
import me.meetmywagon23.dragonshoardwa.registries.ItemGroupRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;

import java.util.UUID;

public class DragonsHoardWAArmorSetItem extends ArmorItem {
    private static final UUID[] MODIFIERS = new UUID[] {
            UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
    };
    private final Multimap<EntityAttribute, EntityAttributeModifier> dragonsHoardAttributeModifiers;
    private final DragonsHoardWAArmorMaterials material;
    public DragonsHoardWAArmorSetItem(DragonsHoardWAArmorMaterials material, Type type) {
        super(material, type, new Item.Settings());
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(this));
        this.material = material;

        int protection = material.getProtection(type);
        float toughness = material.getToughness();

        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = MODIFIERS[type.getEquipmentSlot().getEntitySlotId()];
        builder.put(
                EntityAttributes.GENERIC_ARMOR,
                new EntityAttributeModifier(
                        uuid,
                        "Armor modifier",
                        protection,
                        EntityAttributeModifier.Operation.ADDITION)
        );
        if (material.getToughness() > 0) {
            builder.put(
                    EntityAttributes.GENERIC_ARMOR_TOUGHNESS,
                    new EntityAttributeModifier(
                            uuid,
                            "Armor toughness",
                            toughness,
                            EntityAttributeModifier.Operation.ADDITION)
            );
        }
        if (material.getKnockbackResistance() > 0) {
            builder.put(
                    EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                    new EntityAttributeModifier(
                            uuid,
                            "Armor knockback resistance",
                            material.getKnockbackResistance(),
                            EntityAttributeModifier.Operation.ADDITION)
            );
        }

        // This is where you would put your call to a config if you add one

        /*
         * This code is for if you want to be able to add attributes to your armor
         * builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(uuid,
         *        "Armor attack damage boost",
         *        armorStats.attackDamageBoost,
         *        EntityAttributeModifier.Operation.MULTIPLY_BASE));
         * builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(uuid,
         *        "Armor attack speed boost",
         *        armorStats.attackSpeedBoost, EntityAttributeModifier.Operation.MULTIPLY_BASE));
         * builder.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uuid,
         *        "Armor movement speed boost",
         *        armorStats.movementSpeedBoost, EntityAttributeModifier.Operation.MULTIPLY_BASE));
         */

        this.dragonsHoardAttributeModifiers = builder.build();
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == this.type.getEquipmentSlot()
                ? this.dragonsHoardAttributeModifiers
                : super.getAttributeModifiers(slot);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        return this.material.getRarity();
    }

    public DragonsHoardWAArmorMaterials getArmorSetMaterial() {
        return this.material;
    }
}
