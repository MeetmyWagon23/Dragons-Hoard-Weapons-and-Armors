package me.meetmywagon23.dragonshoardwa.materials;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import me.meetmywagon23.dragonshoardwa.registries.ItemsRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum DragonsHoardWAToolMaterials implements ToolMaterial{
    /*
     * The Mohs Hardness Scale is used to define how these items are organized & how they will be treated in game
     * I have tried to organize them based on this to keep things consistent & Easy to follow.
     */

    /** This is a table to convert Moh's Hardness Scale to Minecraft Durability
     * @Author: purejoshmc (maths, Chronos_Sacaria (formatting)
     * <table border="1">
     * <tr>
     *     <td>
     *         <u>Moh's</u>
     *     </td>
     *     <td>
     *         <u>||MC Dur.</u>
     *     </td>
     *     <td>
     *         <u>||Material Name     </u>
     *     </td>
     * </tr>
     * <tr>
     *     <td>0.0</td>
     *     <td>||</td>
     *     <td>||Zinc</td>
     * </tr>
     * <tr>
     *     <td>0.5</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>1.0</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>1.5</td>
     *     <td>||</td>
     *     <td>||Lead, Tin</td>
     * </tr>
     * <tr>
     *     <td>2.0</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>2.5</td>
     *     <td>||32</td>
     *     <td>||Gold, Silver, Electrum</td>
     * </tr>
     * <tr>
     *     <td>2.75</td>
     *     <td>||</td>
     *     <td>||Aluminium</td>
     * </tr>
     * <tr>
     *     <td>3.0</td>
     *     <td>||59</td>
     *     <td>||Wood, Copper, Brass, Bronze</td>
     * </tr>
     * <tr>
     *     <td>3.5</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>4.0</td>
     *     <td>||131</td>
     *     <td>||Stone</td>
     * </tr>
     * <tr>
     *     <td>4.5</td>
     *     <td>||</td>
     *     <td>||Platinum, Steel</td>
     * </tr>
     * <tr>
     *     <td>4.75</td>
     *     <td>||</td>
     *     <td>||Palladium</td>
     * </tr>
     * <tr>
     *     <td>5.0</td>
     *     <td>||</td>
     *     <td>||Bone</td>
     * </tr>
     * <tr>
     *     <td>5.5</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>6.0</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>6.5</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>7.0</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>7.5</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>8.0</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>8.5</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>9.0</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>9.5</td>
     *     <td>||</td>
     *     <td>||Tungsten Carbide</td>
     * </tr>
     * <tr>
     *     <td>10.0</td>
     *     <td>||1561</td>
     *     <td>||Diamond</td>
     * </tr>
     * <tr>
     *     <td>10.5</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>11.0</td>
     *     <td>||2031</td>
     *     <td>||Netherite</td>
     * </tr>
     * <tr>
     *     <td>11.5</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * <tr>
     *     <td>12.0</td>
     *     <td>||</td>
     *     <td>||</td>
     * </tr>
     * </table>
     */

    /*
     * mining levels
     * WOOD = 0;
     * STONE = 1;
     * IRON = 2;
     * DIAMOND = 3;
     * NETHERITE = 4;
     *     WOOD(MiningLevels.WOOD, 59, 2.0f, 0.0f, 15,
    STONE, 131, 4.0f, 1.0f, 5,
    IRON, 250, 6.0f, 2.0f, 14,
    DIAMOND, 1561, 8.0f, 3.0f, 10,
    GOLD, 32, 12.0f, 0.0f, 22,
    NETHERITE, 2031, 9.0f, 4.0f, 15,
     *
     */
    // Still not sure if im using Flesh, but im leaving it here just in case.
    FLESH(

            0f,
            1,
            1,
            0.5f,
            4, 
            Items.ROTTEN_FLESH),
    SILVER(
            0f,
            15,
            1,
            4f,
            161, 
            ItemsRegistry.SILVER_INGOT),
    COPPER(
            0f,
            3,
            1,
            3.5f,
            181, 
            Items.COPPER_INGOT),
    BRONZE(
            0f,
            4,
            1,
            4.5f,
            221, 
            ItemsRegistry.BRONZE_INGOT),
    PLATINUM(
            0f,
            18,
            1,
            5f,
            241, 
            ItemsRegistry.PLATINUM_INGOT),
    BONE(
            0f,
            2,
            2,
            5.5f,
            9, 
            Items.BONE),
    INFERNAL_IRON(
            0f,
            14,
            2,
            6.5f,
            332,
            ItemsRegistry.INFERNAL_IRON_INGOT),
    COLD_IRON(
            0f,
            14,
            2,
            7f,
            332,
            ItemsRegistry.COLD_IRON_INGOT),
    STEEL(
            0f,
            15,
            3,
            7f,
            670, 
            ItemsRegistry.STEEL_INGOT),
    ELVEN_STEEL(
            0f,
            18,
            3,
            8f,
            1791, 
            ItemsRegistry.ELVEN_STEEL_INGOT),
    DARK_STEEL(
            0f,
            18,
            3,
            8f,
            1781,
            ItemsRegistry.DARK_STEEL_INGOT),
    DRAGON_BONE(
            0f,
            18,
            4,
            10f,
            2031,
            ItemsRegistry.DRAGON_BONE),
    PALLADIUM(
            0f,
            22,
            4,
            10f,
            2031,
            ItemsRegistry.PALLADIUM_INGOT),
    // Titanium needs to be removed, too heavy to be used. Side-eyes gold (. ) (. )
    //                                                                      -----
    TITANIUM (
            0f,
            24,
            4,
            10f,
            2031,
            ItemsRegistry.TITANIUM_INGOT),
    TUNGSTEN_CARBIDE(
            0f,
            16,
            4,
            11f,
            2031,
            ItemsRegistry.TUNGSTEN_CARBIDE_INGOT),
    MITHRIL(
            0f,
            17,
            4,
            11f,
            2031,
            ItemsRegistry.MITHRIL_INGOT),
    ADAMANTINE(
            0f,
            16,
            4,
            12f,
            2228,
            ItemsRegistry.ADAMANTINE_INGOT),
    SHADOW_ADAMANTINE(
            0f,
            16,
            4,
            12f,
            2228,
            ItemsRegistry.SHADOW_ADAMANTINE_INGOT),
    ADAMANTINE_DRAGON_BONE(
            0f,
            18,
            4,
            12.5f,
            2228,
            ItemsRegistry.PRISTINE_ADAMANTINE_COATED_DRAGON_SCALE),
    SHADOW_ADAMANTINE_DRAGON_BONE(
            0f,
            18,
            4,
            12.5f,
            4364, 
            ItemsRegistry.PRISTINE_SHADOW_ADAMANTINE_COATED_DRAGON_SCALE),
    DIVINE(
            0f,
            18,
            4,
            13f,
            4532, 
            ItemsRegistry.DIVINE_CATALYST),
    GLACIAL(
            0f,
            15,
            4,
            13f,
            4624, 
            ItemsRegistry.ANCIENT_ICE);

    private final float attackDamage, miningSpeedMultiplier;
    private final int enchantability, miningLevel, durability;
    private final Supplier<Ingredient> repairIngredient;

    DragonsHoardWAToolMaterials(float attackDamage, int miningLevel, int enchantability, float miningSpeedMultiplier,
                                int durability, Item... items) {
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.durability = durability;
        this.repairIngredient = Suppliers.memoize(() -> Ingredient.ofItems(items));
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}