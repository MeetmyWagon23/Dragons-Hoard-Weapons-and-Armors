package me.meetmywagon23.dragonshoardwa.registries;

import me.meetmywagon23.dragonshoardwa.DragonsHoardWA;
import me.meetmywagon23.dragonshoardwa.materials.DragonsHoardWAToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class WeaponsRegistry {
    /* ----- DAGGERS -----
     * Daggers Damage needs to be adjusted, and Speed needs to be adjusted. not sure how to change it. Will probably just make
     * my own Dagger Class, using the Trident as a working ground. for now these will be as is. 
     * \\\\-1.5f for dagger/// <--when made
     */
    public static final TridentItem WOODEN_DAGGER = registerTridentItems("wooden_dagger", new TridentItem((new Item.Settings()).maxDamage(59)));
    public static final TridentItem STONE_DAGGER = registerTridentItems("stone_dagger", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem GOLDEN_DAGGER = registerTridentItems("golden_dagger", new TridentItem((new Item.Settings()).maxDamage(32)));
    public static final TridentItem SILVER_DAGGER = registerTridentItems("silver_dagger", new TridentItem((new Item.Settings()).maxDamage(161)));
    public static final TridentItem COPPER_DAGGER = registerTridentItems("copper_dagger", new TridentItem((new Item.Settings()).maxDamage(181)));
    public static final TridentItem BRONZE_DAGGER = registerTridentItems("bronze_dagger", new TridentItem((new Item.Settings()).maxDamage(201)));
    public static final TridentItem PLATINUM_DAGGER = registerTridentItems("platinum_dagger", new TridentItem((new Item.Settings()).maxDamage(241)));
    public static final TridentItem BONE_DAGGER = registerTridentItems("bone_dagger", new TridentItem((new Item.Settings()).maxDamage(32)));
    public static final TridentItem IRON_DAGGER = registerTridentItems("iron_dagger", new TridentItem((new Item.Settings()).maxDamage(250)));
    public static final TridentItem INFERNAL_IRON_DAGGER = registerTridentItems("infernal_iron_dagger", new TridentItem((new Item.Settings()).maxDamage(250)));
    public static final TridentItem COLD_IRON_DAGGER = registerTridentItems("cold_iron_dagger", new TridentItem((new Item.Settings()).maxDamage(250)));
    public static final TridentItem STEEL_DAGGER = registerTridentItems("steel_dagger", new TridentItem((new Item.Settings()).maxDamage(670)));
    public static final TridentItem DIAMOND_DAGGER = registerTridentItems("diamond_dagger", new TridentItem((new Item.Settings()).maxDamage(1561)));
    public static final TridentItem ELVEN_STEEL_DAGGER = registerTridentItems("elven_steel_dagger", new TridentItem((new Item.Settings()).maxDamage(670)));
    public static final TridentItem DARK_STEEL_DAGGER = registerTridentItems("dark_steel_dagger", new TridentItem((new Item.Settings()).maxDamage(670)));
    public static final TridentItem NETHERITE_DAGGER = registerTridentItems("netherite_dagger", new TridentItem((new Item.Settings().fireproof().maxDamage(2031))));
    public static final TridentItem DRAGON_BONE_DAGGER = registerTridentItems("dragon_bone_dagger", new TridentItem((new Item.Settings()).maxDamage(2341)));
    public static final TridentItem PALLADIUM_DAGGER = registerTridentItems("palladium_dagger", new TridentItem((new Item.Settings()).maxDamage(2651)));
    public static final TridentItem TUNGSTEN_CARBIDE_DAGGER = registerTridentItems("tungsten_carbide_dagger", new TridentItem((new Item.Settings()).maxDamage(3271)));
    public static final TridentItem MITHRIL_DAGGER = registerTridentItems("mithril_dagger", new TridentItem((new Item.Settings()).maxDamage(3581)));
    public static final TridentItem ADAMANTINE_DAGGER = registerTridentItems("adamantine_dagger", new TridentItem((new Item.Settings()).maxDamage(4101)));
    public static final TridentItem SHADOW_ADAMANTINE_DAGGER = registerTridentItems("shadow_adamantine_dagger", new TridentItem((new Item.Settings()).maxDamage(4101)));
    public static final TridentItem ADAMANTINE_DRAGON_BONE_DAGGER = registerTridentItems("adamantine_dragon_bone_dagger", new TridentItem((new Item.Settings()).maxDamage(4101)));
    public static final TridentItem SHADOW_ADAMANTINE_DRAGON_BONE_DAGGER = registerTridentItems("shadow_adamantine_dragon_bone_dagger", new TridentItem((new Item.Settings()).maxDamage(4101)));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------SPEARS------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_SPEAR = registerSwordItems("wooden_spear", new SwordItem(ToolMaterials.WOOD, 4, -2.7f, new Item.Settings()));
    public static final SwordItem STONE_SPEAR = registerSwordItems("stone_spear", new SwordItem(ToolMaterials.STONE, 4, -2.7f, new Item.Settings()));
    public static final SwordItem GOLDEN_SPEAR = registerSwordItems("golden_spear", new SwordItem(ToolMaterials.GOLD, 4, -2.7f, new Item.Settings()));
    public static final SwordItem SILVER_SPEAR = registerSwordItems("silver_spear", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 4, -2.7f, new Item.Settings()));
    public static final SwordItem COPPER_SPEAR = registerSwordItems("copper_spear", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 4, -2.7f, new Item.Settings()));
    public static final SwordItem BRONZE_SPEAR = registerSwordItems("bronze_spear", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 5, -2.7f, new Item.Settings()));
    public static final SwordItem PLATINUM_SPEAR = registerSwordItems("platinum_spear", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 5, -2.7f, new Item.Settings()));
    public static final SwordItem BONE_SPEAR = registerSwordItems("bone_spear", new SwordItem(DragonsHoardWAToolMaterials.BONE, 6, -2.7f, new Item.Settings()));
    public static final SwordItem IRON_SPEAR = registerSwordItems("iron_spear", new SwordItem(ToolMaterials.IRON, 4, -2.7f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_SPEAR = registerSwordItems("infernal_iron_spear", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 6, -2.7f, new Item.Settings()));
    public static final SwordItem COLD_IRON_SPEAR = registerSwordItems("cold_iron_spear", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 6, -2.7f, new Item.Settings()));
    public static final SwordItem STEEL_SPEAR = registerSwordItems("steel_spear", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 6, -2.7f, new Item.Settings()));
    public static final SwordItem DIAMOND_SPEAR = registerSwordItems("diamond_spear", new SwordItem(ToolMaterials.DIAMOND, 4, -2.7f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_SPEAR = registerSwordItems("elven_steel_spear", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 7, -2.7f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_SPEAR = registerSwordItems("dark_steel_spear", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 7, -2.7f, new Item.Settings()));
    public static final SwordItem NETHERITE_SPEAR = registerSwordItems("netherite_spear", new SwordItem(ToolMaterials.NETHERITE, 4, -2.7f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_SPEAR = registerSwordItems("dragon_bone_spear", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 8, -2.7f, new Item.Settings()));
    public static final SwordItem PALLADIUM_SPEAR = registerSwordItems("palladium_spear", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 8, -2.7f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_SPEAR = registerSwordItems("tungsten_carbide_spear", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 8, -2.7f, new Item.Settings()));
    public static final SwordItem MITHRIL_SPEAR = registerSwordItems("mithril_spear", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 8, -2.7f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_SPEAR = registerSwordItems("adamantine_spear", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.7f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_SPEAR = registerSwordItems("shadow_adamantine_spear", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.7f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_SPEAR = registerSwordItems("adamantine_dragon_bone_spear", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 10, -2.7f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_SPEAR = registerSwordItems("shadow_adamantine_dragon_bone_spear", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 10, -2.7f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------RAPIERS-----------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_RAPIER = registerSwordItems("wooden_rapier", new SwordItem(ToolMaterials.WOOD, 2, -1.8f, new Item.Settings()));
    public static final SwordItem STONE_RAPIER = registerSwordItems("stone_rapier", new SwordItem(ToolMaterials.STONE, 2, -1.8f, new Item.Settings()));
    public static final SwordItem GOLDEN_RAPIER = registerSwordItems("golden_rapier", new SwordItem(ToolMaterials.GOLD, 2, -1.8f, new Item.Settings()));
    public static final SwordItem SILVER_RAPIER = registerSwordItems("silver_rapier", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 2, -1.8f, new Item.Settings()));
    public static final SwordItem COPPER_RAPIER = registerSwordItems("copper_rapier", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 2, -1.8f, new Item.Settings()));
    public static final SwordItem BRONZE_RAPIER = registerSwordItems("bronze_rapier", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 3, -1.8f, new Item.Settings()));
    public static final SwordItem PLATINUM_RAPIER = registerSwordItems("platinum_rapier", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 3, -1.8f, new Item.Settings()));
    public static final SwordItem BONE_RAPIER = registerSwordItems("bone_rapier", new SwordItem(DragonsHoardWAToolMaterials.BONE, 3, -1.8f, new Item.Settings()));
    public static final SwordItem IRON_RAPIER = registerSwordItems("iron_rapier", new SwordItem(ToolMaterials.IRON, 2, -1.8f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_RAPIER = registerSwordItems("infernal_iron_rapier", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 4, -1.8f, new Item.Settings()));
    public static final SwordItem COLD_IRON_RAPIER = registerSwordItems("cold_iron_rapier", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 4, -1.8f, new Item.Settings()));
    public static final SwordItem STEEL_RAPIER = registerSwordItems("steel_rapier", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 4, -1.8f, new Item.Settings()));
    public static final SwordItem DIAMOND_RAPIER = registerSwordItems("diamond_rapier", new SwordItem(ToolMaterials.DIAMOND, 2, -1.8f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_RAPIER = registerSwordItems("elven_steel_rapier", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 5, -1.8f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_RAPIER = registerSwordItems("dark_steel_rapier", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 5, -1.8f, new Item.Settings()));
    public static final SwordItem NETHERITE_RAPIER = registerSwordItems("netherite_rapier", new SwordItem(ToolMaterials.NETHERITE, 2, -1.8f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_RAPIER = registerSwordItems("dragon_bone_rapier", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 6, -1.8f, new Item.Settings()));
    public static final SwordItem PALLADIUM_RAPIER = registerSwordItems("palladium_rapier", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 6, -1.8f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_RAPIER = registerSwordItems("tungsten_carbide_rapier", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 6, -1.8f, new Item.Settings()));
    public static final SwordItem MITHRIL_RAPIER = registerSwordItems("mithril_rapier", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 6, -1.8f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_RAPIER = registerSwordItems("adamantine_rapier", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 7, -1.8f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_RAPIER = registerSwordItems("shadow_adamantine_rapier", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 7, -1.8f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_RAPIER = registerSwordItems("adamantine_dragon_bone_rapier", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 8, -1.8f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_RAPIER = registerSwordItems("shadow_adamantine_dragon_bone_rapier", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 8, -1.8f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------HAND AXES---------------------------------------------------------
    -----------------------------------Removed in favor of having regular axes fill this position-------------------------*/
    //public static final AxeItem WOODEN_HANDAXE = registerAxeItems("wooden_handaxe", new AxeItem(ToolMaterials.WOOD, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem STONE_HANDAXE = registerAxeItems("stone_handaxe", new AxeItem(ToolMaterials.STONE, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem GOLDEN_HANDAXE = registerAxeItems("golden_handaxe", new AxeItem(ToolMaterials.GOLD, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem SILVER_HANDAXE = registerAxeItems("silver_handaxe", new AxeItem(DragonsHoardWAToolMaterials.SILVER, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem COPPER_HANDAXE = registerAxeItems("copper_handaxe", new AxeItem(DragonsHoardWAToolMaterials.COPPER, 4, -3.2f, new Item.Settings()));
    ////public static final AxeItem BRASS_HANDAXE = registerAxeItems("brass_handaxe", new AxeItem(DragonsHoardWAToolMaterials.BRASS, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem BRONZE_HANDAXE = registerAxeItems("bronze_handaxe", new AxeItem(DragonsHoardWAToolMaterials.BRONZE, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem PLATINUM_HANDAXE = registerAxeItems("platinum_handaxe", new AxeItem(DragonsHoardWAToolMaterials.PLATINUM, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem BONE_HANDAXE = registerAxeItems("bone_handaxe", new AxeItem(DragonsHoardWAToolMaterials.BONE, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem IRON_HANDAXE = registerAxeItems("iron_handaxe", new AxeItem(ToolMaterials.IRON, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem INFERNAL_IRON_HANDAXE = registerAxeItems("infernal_iron_handaxe", new AxeItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem COLD_IRON_HANDAXE = registerAxeItems("cold_iron_handaxe", new AxeItem(DragonsHoardWAToolMaterials.COLD_IRON, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem STEEL_HANDAXE = registerAxeItems("steel_handaxe", new AxeItem(DragonsHoardWAToolMaterials.STEEL, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem DIAMOND_HANDAXE = registerAxeItems("diamond_handaxe", new AxeItem(ToolMaterials.DIAMOND, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem ELVEN_STEEL_HANDAXE = registerAxeItems("elven_steel_handaxe", new AxeItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem DARK_STEEL_HANDAXE = registerAxeItems("dark_steel_handaxe", new AxeItem(DragonsHoardWAToolMaterials.DARK_STEEL, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem NETHERITE_HANDAXE = registerAxeItems("netherite_handaxe", new AxeItem(ToolMaterials.NETHERITE, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem DRAGON_BONE_HANDAXE = registerAxeItems("dragon_bone_handaxe", new AxeItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem PALLADIUM_HANDAXE = registerAxeItems("palladium_handaxe", new AxeItem(DragonsHoardWAToolMaterials.PALLADIUM, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem TITANIUM_HANDAXE = registerAxeItems("titanium_handaxe", new AxeItem(DragonsHoardWAToolMaterials.TITANIUM, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem TUNGSTEN_CARBIDE_HANDAXE = registerAxeItems("tungsten_handaxe", new AxeItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem MITHRIL_HANDAXE = registerAxeItems("mithril_handaxe", new AxeItem(DragonsHoardWAToolMaterials.MITHRIL, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem ITANIUM_HANDAXE = registerAxeItems("itanium_handaxe", new AxeItem(DragonsHoardWAToolMaterials.ITANIUM, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem ADAMANTINE_HANDAXE = registerAxeItems("adamantine_handaxe", new AxeItem(DragonsHoardWAToolMaterials.ADAMANTINE, 4, -3.2f, new Item.Settings()));
    //public static final AxeItem SHADOW_ADAMANTINE_HANDAXE = registerAxeItems("shadow_adamantine_handaxe", new AxeItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 4, -3.2f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------LONGSWORDS-------Currently_Removed--------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    // public static final SwordItem WOODEN_LONGSWORD = registerSwordItems("wooden_longsword", new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem STONE_LONGSWORD = registerSwordItems("stone_longsword", new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem GOLDEN_LONGSWORD = registerSwordItems("golden_longsword", new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem SILVER_LONGSWORD = registerSwordItems("silver_longsword", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem COPPER_LONGSWORD = registerSwordItems("copper_longsword", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 4, -3.0f, new Item.Settings()));
    // //public static final SwordItem BRASS_LONGSWORD = registerSwordItems("brass_longsword", new SwordItem(DragonsHoardWAToolMaterials.BRASS, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem BRONZE_LONGSWORD = registerSwordItems("bronze_longsword", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem PLATINUM_LONGSWORD = registerSwordItems("platinum_longsword", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem BONE_LONGSWORD = registerSwordItems("bone_longsword", new SwordItem(DragonsHoardWAToolMaterials.BONE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem IRON_LONGSWORD = registerSwordItems("iron_longsword", new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem INFERNAL_IRON_LONGSWORD = registerSwordItems("infernal_iron_longsword", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem COLD_IRON_LONGSWORD = registerSwordItems("cold_iron_longsword", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem STEEL_LONGSWORD = registerSwordItems("steel_longsword", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem DIAMOND_LONGSWORD = registerSwordItems("diamond_longsword", new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem ELVEN_STEEL_LONGSWORD = registerSwordItems("elven_steel_longsword", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem DARK_STEEL_LONGSWORD = registerSwordItems("dark_steel_longsword", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem NETHERITE_LONGSWORD = registerSwordItems("netherite_longsword", new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem DRAGON_BONE_LONGSWORD = registerSwordItems("dragon_bone_longsword", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem PALLADIUM_LONGSWORD = registerSwordItems("palladium_longsword", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem TITANIUM_LONGSWORD = registerSwordItems("titanium_longsword", new SwordItem(DragonsHoardWAToolMaterials.TITANIUM, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem TUNGSTEN_CARBIDE_LONGSWORD = registerSwordItems("tungsten_longsword", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem MITHRIL_LONGSWORD = registerSwordItems("mithril_longsword", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem ITANIUM_LONGSWORD = registerSwordItems("itanium_longsword", new SwordItem(DragonsHoardWAToolMaterials.ITANIUM, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem ADAMANTINE_LONGSWORD = registerSwordItems("adamantine_longsword", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem SHADOW_ADAMANTINE_LONGSWORD = registerSwordItems("shadow_adamantine_longsword", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------GREATSWORDS-------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_GREATSWORD = registerSwordItems("wooden_greatsword", new SwordItem(ToolMaterials.WOOD, 5, -3.3f, new Item.Settings()));
    public static final SwordItem STONE_GREATSWORD = registerSwordItems("stone_greatsword", new SwordItem(ToolMaterials.STONE, 5, -3.3f, new Item.Settings()));
    public static final SwordItem GOLDEN_GREATSWORD = registerSwordItems("golden_greatsword", new SwordItem(ToolMaterials.GOLD, 5, -3.3f, new Item.Settings()));
    public static final SwordItem SILVER_GREATSWORD = registerSwordItems("silver_greatsword", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 5, -3.3f, new Item.Settings()));
    public static final SwordItem COPPER_GREATSWORD = registerSwordItems("copper_greatsword", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 5, -3.3f, new Item.Settings()));
    public static final SwordItem BRONZE_GREATSWORD = registerSwordItems("bronze_greatsword", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 6, -3.3f, new Item.Settings()));
    public static final SwordItem PLATINUM_GREATSWORD = registerSwordItems("platinum_greatsword", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 6, -3.3f, new Item.Settings()));
    public static final SwordItem BONE_GREATSWORD = registerSwordItems("bone_greatsword", new SwordItem(DragonsHoardWAToolMaterials.BONE, 6, -3.3f, new Item.Settings()));
    public static final SwordItem IRON_GREATSWORD = registerSwordItems("iron_greatsword", new SwordItem(ToolMaterials.IRON, 5, -3.3f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_GREATSWORD = registerSwordItems("infernal_iron_greatsword", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 7, -3.3f, new Item.Settings()));
    public static final SwordItem COLD_IRON_GREATSWORD = registerSwordItems("cold_iron_greatsword", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 7, -3.3f, new Item.Settings()));
    public static final SwordItem STEEL_GREATSWORD = registerSwordItems("steel_greatsword", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 7, -3.3f, new Item.Settings()));
    public static final SwordItem DIAMOND_GREATSWORD = registerSwordItems("diamond_greatsword", new SwordItem(ToolMaterials.DIAMOND, 5, -3.3f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_GREATSWORD = registerSwordItems("elven_steel_greatsword", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 8, -3.3f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_GREATSWORD = registerSwordItems("dark_steel_greatsword", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 8, -3.3f, new Item.Settings()));
    public static final SwordItem NETHERITE_GREATSWORD = registerSwordItems("netherite_greatsword", new SwordItem(ToolMaterials.NETHERITE, 5, -3.3f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_GREATSWORD = registerSwordItems("dragon_bone_greatsword", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 9, -3.3f, new Item.Settings()));
    public static final SwordItem PALLADIUM_GREATSWORD = registerSwordItems("palladium_greatsword", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 9, -3.3f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_GREATSWORD = registerSwordItems("tungsten_carbide_greatsword", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 9, -3.3f, new Item.Settings()));
    public static final SwordItem MITHRIL_GREATSWORD = registerSwordItems("mithril_greatsword", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 9, -3.3f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_GREATSWORD = registerSwordItems("adamantine_greatsword", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 10, -3.3f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_GREATSWORD = registerSwordItems("shadow_adamantine_greatsword", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 10, -3.3f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_GREATSWORD = registerSwordItems("adamantine_dragon_bone_greatsword", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 11, -3.3f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_GREATSWORD = registerSwordItems("shadow_adamantine_dragon_bone_greatsword", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 11, -3.3f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    -----------------------------------------------------CLAYMORES----------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_CLAYMORE = registerSwordItems("wooden_claymore", new SwordItem(ToolMaterials.WOOD, 5, -3.2f, new Item.Settings()));
    public static final SwordItem STONE_CLAYMORE = registerSwordItems("stone_claymore", new SwordItem(ToolMaterials.STONE, 5, -3.2f, new Item.Settings()));
    public static final SwordItem GOLDEN_CLAYMORE = registerSwordItems("golden_claymore", new SwordItem(ToolMaterials.GOLD, 5, -3.2f, new Item.Settings()));
    public static final SwordItem SILVER_CLAYMORE = registerSwordItems("silver_claymore", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 5, -3.2f, new Item.Settings()));
    public static final SwordItem COPPER_CLAYMORE = registerSwordItems("copper_claymore", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 5, -3.2f, new Item.Settings()));
    //public static final SwordItem BRASS_CLAYMORE = registerSwordItems("brass_claymore", new SwordItem(DragonsHoardWAToolMaterials.BRASS, 4, -3.2f, new Item.Settings()));
    public static final SwordItem BRONZE_CLAYMORE = registerSwordItems("bronze_claymore", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 6, -3.2f, new Item.Settings()));
    public static final SwordItem PLATINUM_CLAYMORE = registerSwordItems("platinum_claymore", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 6, -3.2f, new Item.Settings()));
    public static final SwordItem BONE_CLAYMORE = registerSwordItems("bone_claymore", new SwordItem(DragonsHoardWAToolMaterials.BONE, 6, -3.2f, new Item.Settings()));
    public static final SwordItem IRON_CLAYMORE = registerSwordItems("iron_claymore", new SwordItem(ToolMaterials.IRON, 5, -3.2f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_CLAYMORE = registerSwordItems("infernal_iron_claymore", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON,7, -3.2f, new Item.Settings()));
    public static final SwordItem COLD_IRON_CLAYMORE = registerSwordItems("cold_iron_claymore", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 7, -3.2f, new Item.Settings()));
    public static final SwordItem STEEL_CLAYMORE = registerSwordItems("steel_claymore", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 7, -3.2f, new Item.Settings()));
    public static final SwordItem DIAMOND_CLAYMORE = registerSwordItems("diamond_claymore", new SwordItem(ToolMaterials.DIAMOND, 5, -3.2f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_CLAYMORE = registerSwordItems("elven_steel_claymore", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 8, -3.2f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_CLAYMORE = registerSwordItems("dark_steel_claymore", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 8, -3.2f, new Item.Settings()));
    public static final SwordItem NETHERITE_CLAYMORE = registerSwordItems("netherite_claymore", new SwordItem(ToolMaterials.NETHERITE, 5, -3.2f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_CLAYMORE = registerSwordItems("dragon_bone_claymore", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 9, -3.2f, new Item.Settings()));
    public static final SwordItem PALLADIUM_CLAYMORE = registerSwordItems("palladium_claymore", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 9, -3.2f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_CLAYMORE = registerSwordItems("tungsten_carbide_claymore", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 9, -3.2f, new Item.Settings()));
    public static final SwordItem MITHRIL_CLAYMORE = registerSwordItems("mithril_claymore", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 9, -3.2f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_CLAYMORE = registerSwordItems("adamantine_claymore", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 10, -3.2f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_CLAYMORE = registerSwordItems("shadow_adamantine_claymore", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 10, -3.2f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_CLAYMORE = registerSwordItems("adamantine_dragon_bone_claymore", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 11, -3.2f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_CLAYMORE = registerSwordItems("shadow_adamantine_dragon_bone_claymore", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 11, -3.2f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------GLAIVES-----------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_GLAIVE = registerSwordItems("wooden_glaive", new SwordItem(ToolMaterials.WOOD, 3, -2.6f, new Item.Settings()));
    public static final SwordItem STONE_GLAIVE = registerSwordItems("stone_glaive", new SwordItem(ToolMaterials.STONE, 3, -2.6f, new Item.Settings()));
    public static final SwordItem GOLDEN_GLAIVE = registerSwordItems("golden_glaive", new SwordItem(ToolMaterials.GOLD, 3, -2.6f, new Item.Settings()));
    public static final SwordItem SILVER_GLAIVE = registerSwordItems("silver_glaive", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 3, -2.6f, new Item.Settings()));
    public static final SwordItem COPPER_GLAIVE = registerSwordItems("copper_glaive", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 3, -2.6f, new Item.Settings()));
    public static final SwordItem BRONZE_GLAIVE = registerSwordItems("bronze_glaive", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 4, -2.6f, new Item.Settings()));
    public static final SwordItem PLATINUM_GLAIVE = registerSwordItems("platinum_glaive", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 4, -2.6f, new Item.Settings()));
    public static final SwordItem BONE_GLAIVE = registerSwordItems("bone_glaive", new SwordItem(DragonsHoardWAToolMaterials.BONE, 4, -2.6f, new Item.Settings()));
    public static final SwordItem IRON_GLAIVE = registerSwordItems("iron_glaive", new SwordItem(ToolMaterials.IRON, 3, -2.0f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_GLAIVE = registerSwordItems("infernal_iron_glaive", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 5, -2.6f, new Item.Settings()));
    public static final SwordItem COLD_IRON_GLAIVE = registerSwordItems("cold_iron_glaive", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 5, -2.6f, new Item.Settings()));
    public static final SwordItem STEEL_GLAIVE = registerSwordItems("steel_glaive", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 5, -2.6f, new Item.Settings()));
    public static final SwordItem DIAMOND_GLAIVE = registerSwordItems("diamond_glaive", new SwordItem(ToolMaterials.DIAMOND, 3, -2.6f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_GLAIVE = registerSwordItems("elven_steel_glaive", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 6, -2.6f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_GLAIVE = registerSwordItems("dark_steel_glaive", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 6, -2.6f, new Item.Settings()));
    public static final SwordItem NETHERITE_GLAIVE = registerSwordItems("netherite_glaive", new SwordItem(ToolMaterials.NETHERITE, 3, -2.6f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_GLAIVE = registerSwordItems("dragon_bone_glaive", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 7, -2.6f, new Item.Settings()));
    public static final SwordItem PALLADIUM_GLAIVE = registerSwordItems("palladium_glaive", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 7, -2.6f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_GLAIVE = registerSwordItems("tungsten_carbide_glaive", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 7, -2.6f, new Item.Settings()));
    public static final SwordItem MITHRIL_GLAIVE = registerSwordItems("mithril_glaive", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 7, -2.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_GLAIVE = registerSwordItems("adamantine_glaive", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 8, -2.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_GLAIVE = registerSwordItems("shadow_adamantine_glaive", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE,8, -2.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_GLAIVE = registerSwordItems("adamantine_dragon_bone_glaive", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_GLAIVE = registerSwordItems("shadow_adamantine_dragon_bone_glaive", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.6f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------SCIMITARS---------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_SCIMITAR = registerSwordItems("wooden_scimitar", new SwordItem(ToolMaterials.WOOD, 3, -2.3f, new Item.Settings()));
    public static final SwordItem STONE_SCIMITAR = registerSwordItems("stone_scimitar", new SwordItem(ToolMaterials.STONE, 3, -2.3f, new Item.Settings()));
    public static final SwordItem GOLDEN_SCIMITAR = registerSwordItems("golden_scimitar", new SwordItem(ToolMaterials.GOLD, 3, -2.3f, new Item.Settings()));
    public static final SwordItem SILVER_SCIMITAR = registerSwordItems("silver_scimitar", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 3, -2.3f, new Item.Settings()));
    public static final SwordItem COPPER_SCIMITAR = registerSwordItems("copper_scimitar", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 3, -2.3f, new Item.Settings()));
    public static final SwordItem BRONZE_SCIMITAR = registerSwordItems("bronze_scimitar", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 4, -2.3f, new Item.Settings()));
    public static final SwordItem PLATINUM_SCIMITAR = registerSwordItems("platinum_scimitar", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 4, -2.3f, new Item.Settings()));
    public static final SwordItem BONE_SCIMITAR = registerSwordItems("bone_scimitar", new SwordItem(DragonsHoardWAToolMaterials.BONE, 4, -2.3f, new Item.Settings()));
    public static final SwordItem IRON_SCIMITAR = registerSwordItems("iron_scimitar", new SwordItem(ToolMaterials.IRON, 3, -2.4f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_SCIMITAR = registerSwordItems("infernal_iron_scimitar", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 5, -2.3f, new Item.Settings()));
    public static final SwordItem COLD_IRON_SCIMITAR = registerSwordItems("cold_iron_scimitar", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 5, -2.3f, new Item.Settings()));
    public static final SwordItem STEEL_SCIMITAR = registerSwordItems("steel_scimitar", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 5, -2.3f, new Item.Settings()));
    public static final SwordItem DIAMOND_SCIMITAR = registerSwordItems("diamond_scimitar", new SwordItem(ToolMaterials.DIAMOND, 3, -2.3f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_SCIMITAR = registerSwordItems("elven_steel_scimitar", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 6, -2.3f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_SCIMITAR = registerSwordItems("dark_steel_scimitar", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 6, -2.3f, new Item.Settings()));
    public static final SwordItem NETHERITE_SCIMITAR = registerSwordItems("netherite_scimitar", new SwordItem(ToolMaterials.NETHERITE, 3, -2.3f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_SCIMITAR = registerSwordItems("dragon_bone_scimitar", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 7, -2.3f, new Item.Settings()));
    public static final SwordItem PALLADIUM_SCIMITAR = registerSwordItems("palladium_scimitar", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 7, -2.3f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_SCIMITAR = registerSwordItems("tungsten_carbide_scimitar", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 7, -2.3f, new Item.Settings()));
    public static final SwordItem MITHRIL_SCIMITAR = registerSwordItems("mithril_scimitar", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 7, -2.3f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_SCIMITAR = registerSwordItems("adamantine_scimitar", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 8, -2.3f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_SCIMITAR = registerSwordItems("shadow_adamantine_scimitar", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 8, -2.3f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_SCIMITAR = registerSwordItems("adamantine_dragon_bone_scimitar", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.3f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_SCIMITAR = registerSwordItems("shadow_adamantine_dragon_bone_scimitar", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.3f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------QUARTERSTAFFS-----------------------------------------------------
    ---------------------------Ponderosa Pine tree -> planks -> sticks -> strongest stick material--------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_QUARTERSTAFF = registerSwordItems("wooden_quarterstaff", new SwordItem(ToolMaterials.WOOD, 3, -2.6f, new Item.Settings()));
    public static final SwordItem STONE_QUARTERSTAFF = registerSwordItems("stone_quarterstaff", new SwordItem(ToolMaterials.STONE, 3, -2.6f, new Item.Settings()));
    public static final SwordItem GOLDEN_QUARTERSTAFF = registerSwordItems("golden_quarterstaff", new SwordItem(ToolMaterials.GOLD, 3, -2.6f, new Item.Settings()));
    public static final SwordItem SILVER_QUARTERSTAFF = registerSwordItems("silver_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 3, -2.6f, new Item.Settings()));
    public static final SwordItem COPPER_QUARTERSTAFF = registerSwordItems("copper_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 3, -2.6f, new Item.Settings()));
    public static final SwordItem BRONZE_QUARTERSTAFF = registerSwordItems("bronze_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 4, -2.6f, new Item.Settings()));
    public static final SwordItem PLATINUM_QUARTERSTAFF = registerSwordItems("platinum_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 4, -2.6f, new Item.Settings()));
    public static final SwordItem BONE_QUARTERSTAFF = registerSwordItems("bone_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.BONE, 4, -2.6f, new Item.Settings()));
    public static final SwordItem IRON_QUARTERSTAFF = registerSwordItems("iron_quarterstaff", new SwordItem(ToolMaterials.IRON, 3, -2.6f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_QUARTERSTAFF = registerSwordItems("infernal_iron_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 5, -2.6f, new Item.Settings()));
    public static final SwordItem COLD_IRON_QUARTERSTAFF = registerSwordItems("cold_iron_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 5, -2.6f, new Item.Settings()));
    public static final SwordItem STEEL_QUARTERSTAFF = registerSwordItems("steel_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 5, -2.6f, new Item.Settings()));
    public static final SwordItem DIAMOND_QUARTERSTAFF = registerSwordItems("diamond_quarterstaff", new SwordItem(ToolMaterials.DIAMOND, 3, -2.6f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_QUARTERSTAFF = registerSwordItems("elven_steel_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 6, -2.6f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_QUARTERSTAFF = registerSwordItems("dark_steel_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 6, -2.6f, new Item.Settings()));
    public static final SwordItem NETHERITE_QUARTERSTAFF = registerSwordItems("netherite_quarterstaff", new SwordItem(ToolMaterials.NETHERITE, 3, -2.6f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_QUARTERSTAFF = registerSwordItems("dragon_bone_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 7, -2.6f, new Item.Settings()));
    public static final SwordItem PALLADIUM_QUARTERSTAFF = registerSwordItems("palladium_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 7, -2.6f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_QUARTERSTAFF = registerSwordItems("tungsten_carbide_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 77, -2.6f, new Item.Settings()));
    public static final SwordItem MITHRIL_QUARTERSTAFF = registerSwordItems("mithril_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 7, -2.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_QUARTERSTAFF = registerSwordItems("adamantine_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 8, -2.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_QUARTERSTAFF = registerSwordItems("shadow_adamantine_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 8, -2.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_QUARTERSTAFF = registerSwordItems("adamantine_dragon_bone_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_QUARTERSTAFF = registerSwordItems("shadow_adamantine_dragon_bone_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.6f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------HALBERDS----------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_HALBERD = registerSwordItems("wooden_halberd", new SwordItem(ToolMaterials.WOOD, 3, -2.6f, new Item.Settings()));
    public static final SwordItem STONE_HALBERD = registerSwordItems("stone_halberd", new SwordItem(ToolMaterials.STONE, 3, -2.6f, new Item.Settings()));
    public static final SwordItem GOLDEN_HALBERD = registerSwordItems("golden_halberd", new SwordItem(ToolMaterials.GOLD, 3, -2.6f, new Item.Settings()));
    public static final SwordItem SILVER_HALBERD = registerSwordItems("silver_halberd", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 3, -2.6f, new Item.Settings()));
    public static final SwordItem COPPER_HALBERD = registerSwordItems("copper_halberd", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 3, -2.6f, new Item.Settings()));
    //public static final SwordItem BRASS_HALBERD = registerSwordItems("brass_halberd", new SwordItem(DragonsHoardWAToolMaterials.BRASS, 4, -3.0f, new Item.Settings()));
    public static final SwordItem BRONZE_HALBERD = registerSwordItems("bronze_halberd", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 4, -2.6f, new Item.Settings()));
    public static final SwordItem PLATINUM_HALBERD = registerSwordItems("platinum_halberd", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 4, -2.6f, new Item.Settings()));
    public static final SwordItem BONE_HALBERD = registerSwordItems("bone_halberd", new SwordItem(DragonsHoardWAToolMaterials.BONE, 4, -2.6f, new Item.Settings()));
    public static final SwordItem IRON_HALBERD = registerSwordItems("iron_halberd", new SwordItem(ToolMaterials.IRON, 3, -3.0f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_HALBERD = registerSwordItems("infernal_iron_halberd", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 5, -2.6f, new Item.Settings()));
    public static final SwordItem COLD_IRON_HALBERD = registerSwordItems("cold_iron_halberd", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 5, -2.6f, new Item.Settings()));
    public static final SwordItem STEEL_HALBERD = registerSwordItems("steel_halberd", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 5, -2.6f, new Item.Settings()));
    public static final SwordItem DIAMOND_HALBERD = registerSwordItems("diamond_halberd", new SwordItem(ToolMaterials.DIAMOND, 3, -2.6f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_HALBERD = registerSwordItems("elven_steel_halberd", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 6, -2.6f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_HALBERD = registerSwordItems("dark_steel_halberd", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 6, -2.6f, new Item.Settings()));
    public static final SwordItem NETHERITE_HALBERD = registerSwordItems("netherite_halberd", new SwordItem(ToolMaterials.NETHERITE, 3, -2.6f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_HALBERD = registerSwordItems("dragon_bone_halberd", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 7, -2.6f, new Item.Settings()));
    public static final SwordItem PALLADIUM_HALBERD = registerSwordItems("palladium_halberd", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 7, -2.6f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_HALBERD = registerSwordItems("tungsten_carbide_halberd", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 7, -2.6f, new Item.Settings()));
    public static final SwordItem MITHRIL_HALBERD = registerSwordItems("mithril_halberd", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 7, -2.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_HALBERD = registerSwordItems("adamantine_halberd", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 8, -2.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_HALBERD = registerSwordItems("shadow_adamantine_halberd", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 8, -2.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_HALBERD = registerSwordItems("adamantine_dragon_bone_halberd", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_HALBERD = registerSwordItems("shadow_adamantine_dragon_bone_halberd", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.6f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------TRIDENTS----------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final TridentItem WOODEN_TRIDENT = registerTridentItems("wooden_trident", new TridentItem((new Item.Settings()).maxDamage(59)));
    public static final TridentItem STONE_TRIDENT = registerTridentItems("stone_trident", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem GOLDEN_TRIDENT = registerTridentItems("golden_trident", new TridentItem((new Item.Settings()).maxDamage(32)));
    public static final TridentItem SILVER_TRIDENT = registerTridentItems("silver_trident", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem COPPER_TRIDENT = registerTridentItems("copper_trident", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem BRONZE_TRIDENT = registerTridentItems("bronze_trident", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem PLATINUM_TRIDENT = registerTridentItems("platinum_trident", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem BONE_TRIDENT = registerTridentItems("bone_trident", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem IRON_TRIDENT = registerTridentItems("iron_trident", new TridentItem((new Item.Settings()).maxDamage(250)));
    public static final TridentItem INFERNAL_IRON_TRIDENT = registerTridentItems("infernal_iron_trident", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem COLD_IRON_TRIDENT = registerTridentItems("cold_iron_trident", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem STEEL_TRIDENT = registerTridentItems("steel_trident", new TridentItem((new Item.Settings()).maxDamage(400)));
    public static final TridentItem DIAMOND_TRIDENT = registerTridentItems("diamond_trident", new TridentItem((new Item.Settings()).maxDamage(1561)));
    public static final TridentItem ELVEN_STEEL_TRIDENT = registerTridentItems("elven_steel_trident", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem DARK_STEEL_TRIDENT = registerTridentItems("dark_steel_trident", new TridentItem((new Item.Settings()).maxDamage(131)));
    public static final TridentItem NETHERITE_TRIDENT = registerTridentItems("netherite_trident", new TridentItem((new Item.Settings().fireproof().maxDamage(2341))));
    public static final TridentItem DRAGON_BONE_TRIDENT = registerTridentItems("dragon_bone_trident", new TridentItem((new Item.Settings()).maxDamage(2341)));
    public static final TridentItem PALLADIUM_TRIDENT = registerTridentItems("palladium_trident", new TridentItem((new Item.Settings()).maxDamage(2651)));
    public static final TridentItem TUNGSTEN_CARBIDE_TRIDENT = registerTridentItems("tungsten_carbide_trident", new TridentItem((new Item.Settings()).maxDamage(3271)));
    public static final TridentItem MITHRIL_TRIDENT = registerTridentItems("mithril_trident", new TridentItem((new Item.Settings()).maxDamage(3581)));
    public static final TridentItem ADAMANTINE_TRIDENT = registerTridentItems("adamantine_trident", new TridentItem((new Item.Settings()).maxDamage(4101)));
    public static final TridentItem SHADOW_ADAMANTINE_TRIDENT = registerTridentItems("shadow_adamantine_trident", new TridentItem((new Item.Settings()).maxDamage(4101)));
    public static final TridentItem ADAMANTINE_DRAGON_BONE_TRIDENT = registerTridentItems("adamantine_dragon_bone_trident", new TridentItem((new Item.Settings()).maxDamage(4101)));
    public static final TridentItem SHADOW_ADAMANTINE_DRAGON_BONE_TRIDENT = registerTridentItems("shadow_adamantine_dragon_bone_trident", new TridentItem((new Item.Settings()).maxDamage(4101)));
    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------BATTLEAXES--------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final AxeItem WOODEN_BATTLEAXE = registerAxeItems("wooden_battleaxe", new AxeItem(ToolMaterials.WOOD, 4, -2.8f, new Item.Settings()));
    public static final AxeItem STONE_BATTLEAXE = registerAxeItems("stone_battleaxe", new AxeItem(ToolMaterials.STONE, 4, -2.8f, new Item.Settings()));
    public static final AxeItem GOLDEN_BATTLEAXE = registerAxeItems("golden_battleaxe", new AxeItem(ToolMaterials.GOLD, 4, -2.8f, new Item.Settings()));
    public static final AxeItem SILVER_BATTLEAXE = registerAxeItems("silver_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.SILVER, 4, -2.8f, new Item.Settings()));
    public static final AxeItem COPPER_BATTLEAXE = registerAxeItems("copper_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.COPPER, 4, -2.8f, new Item.Settings()));
    public static final AxeItem BRONZE_BATTLEAXE = registerAxeItems("bronze_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.BRONZE, 5, -2.8f, new Item.Settings()));
    public static final AxeItem PLATINUM_BATTLEAXE = registerAxeItems("platinum_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.PLATINUM, 5, -2.8f, new Item.Settings()));
    public static final AxeItem BONE_BATTLEAXE = registerAxeItems("bone_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.BONE, 5, -2.8f, new Item.Settings()));
    public static final AxeItem IRON_BATTLEAXE = registerAxeItems("iron_battleaxe", new AxeItem(ToolMaterials.IRON, 4, -2.8f, new Item.Settings()));
    public static final AxeItem INFERNAL_IRON_BATTLEAXE = registerAxeItems("infernal_iron_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 6, -2.8f, new Item.Settings()));
    public static final AxeItem COLD_IRON_BATTLEAXE = registerAxeItems("cold_iron_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.COLD_IRON, 6, -2.8f, new Item.Settings()));
    public static final AxeItem STEEL_BATTLEAXE = registerAxeItems("steel_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.STEEL, 6, -2.8f, new Item.Settings()));
    public static final AxeItem DIAMOND_BATTLEAXE = registerAxeItems("diamond_battleaxe", new AxeItem(ToolMaterials.DIAMOND, 4, -2.8f, new Item.Settings()));
    public static final AxeItem ELVEN_STEEL_BATTLEAXE = registerAxeItems("elven_steel_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 7, -2.8f, new Item.Settings()));
    public static final AxeItem DARK_STEEL_BATTLEAXE = registerAxeItems("dark_steel_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.DARK_STEEL, 7, -2.8f, new Item.Settings()));
    public static final AxeItem NETHERITE_BATTLEAXE = registerAxeItems("netherite_battleaxe", new AxeItem(ToolMaterials.NETHERITE, 4, -2.8f, new Item.Settings()));
    public static final AxeItem DRAGON_BONE_BATTLEAXE = registerAxeItems("dragon_bone_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 8, -2.8f, new Item.Settings()));
    public static final AxeItem PALLADIUM_BATTLEAXE = registerAxeItems("palladium_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.PALLADIUM, 8, -2.8f, new Item.Settings()));
    public static final AxeItem TUNGSTEN_CARBIDE_BATTLEAXE = registerAxeItems("tungsten_carbide_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 8, -2.8f, new Item.Settings()));
    public static final AxeItem MITHRIL_BATTLEAXE = registerAxeItems("mithril_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.MITHRIL, 8, -2.8f, new Item.Settings()));
    public static final AxeItem ADAMANTINE_BATTLEAXE = registerAxeItems("adamantine_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.8f, new Item.Settings()));
    public static final AxeItem SHADOW_ADAMANTINE_BATTLEAXE = registerAxeItems("shadow_adamantine_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.8f, new Item.Settings()));
    public static final AxeItem ADAMANTINE_DRAGON_BONE_BATTLEAXE = registerAxeItems("adamantine_dragon_bone_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.ADAMANTINE, 10, -2.8f, new Item.Settings()));
    public static final AxeItem SHADOW_ADAMANTINE_DRAGON_BONE_BATTLEAXE = registerAxeItems("shadow_adamantine_dragon_bone_battleaxe", new AxeItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 10, -2.8f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------FLAILS------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    // public static final SwordItem STEEL_FLAIL = registerSwordItems("steel_flail", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 6, -2.8f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------WARHAMMERS--------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_WARHAMMER = registerSwordItems("wooden_warhammer", new SwordItem(ToolMaterials.WOOD, 5, -3.2f, new Item.Settings()));
    public static final SwordItem STONE_WARHAMMER = registerSwordItems("stone_warhammer", new SwordItem(ToolMaterials.STONE, 5, -3.2f, new Item.Settings()));
    public static final SwordItem GOLDEN_WARHAMMER = registerSwordItems("golden_warhammer", new SwordItem(ToolMaterials.GOLD, 5, -3.2f, new Item.Settings()));
    public static final SwordItem SILVER_WARHAMMER = registerSwordItems("silver_warhammer", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 5, -3.2f, new Item.Settings()));
    public static final SwordItem COPPER_WARHAMMER = registerSwordItems("copper_warhammer", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 5, -3.2f, new Item.Settings()));
    public static final SwordItem BRONZE_WARHAMMER = registerSwordItems("bronze_warhammer", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 6, -3.2f, new Item.Settings()));
    public static final SwordItem PLATINUM_WARHAMMER = registerSwordItems("platinum_warhammer", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 6, -3.2f, new Item.Settings()));
    public static final SwordItem BONE_WARHAMMER = registerSwordItems("bone_warhammer", new SwordItem(DragonsHoardWAToolMaterials.BONE, 6, -3.2f, new Item.Settings()));
    public static final SwordItem IRON_WARHAMMER = registerSwordItems("iron_warhammer", new SwordItem(ToolMaterials.IRON, 5, -3.2f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_WARHAMMER = registerSwordItems("infernal_iron_warhammer", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 7, -3.2f, new Item.Settings()));
    public static final SwordItem COLD_IRON_WARHAMMER = registerSwordItems("cold_iron_warhammer", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 7, -3.2f, new Item.Settings()));
    public static final SwordItem STEEL_WARHAMMER = registerSwordItems("steel_warhammer", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 7, -3.2f, new Item.Settings()));
    public static final SwordItem DIAMOND_WARHAMMER = registerSwordItems("diamond_warhammer", new SwordItem(ToolMaterials.DIAMOND, 5, -3.2f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_WARHAMMER = registerSwordItems("elven_steel_warhammer", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 8, -3.2f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_WARHAMMER = registerSwordItems("dark_steel_warhammer", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 8,8 -3.2f, new Item.Settings()));
    public static final SwordItem NETHERITE_WARHAMMER = registerSwordItems("netherite_warhammer", new SwordItem(ToolMaterials.NETHERITE, 5, -3.2f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_WARHAMMER = registerSwordItems("dragon_bone_warhammer", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 9, -3.2f, new Item.Settings()));
    public static final SwordItem PALLADIUM_WARHAMMER = registerSwordItems("palladium_warhammer", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 9, -3.2f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_WARHAMMER = registerSwordItems("tungsten_carbide_warhammer", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 9, -3.2f, new Item.Settings()));
    public static final SwordItem MITHRIL_WARHAMMER = registerSwordItems("mithril_warhammer", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 9, -3.2f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_WARHAMMER = registerSwordItems("adamantine_warhammer", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 10, -3.2f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_WARHAMMER = registerSwordItems("shadow_adamantine_warhammer", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 10, -3.2f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_WARHAMMER = registerSwordItems("adamantine_dragon_bone_warhammer", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 11, -3.2f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_WARHAMMER = registerSwordItems("shadow_adamantine_dragon_bone_warhammer", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 11, -3.2f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------SICKLES-----------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_SICKLE = registerSwordItems("wooden_sickle", new SwordItem(ToolMaterials.WOOD, 2, -1.6f, new Item.Settings()));
    public static final SwordItem STONE_SICKLE = registerSwordItems("stone_sickle", new SwordItem(ToolMaterials.STONE, 2, -1.6f, new Item.Settings()));
    public static final SwordItem GOLDEN_SICKLE = registerSwordItems("golden_sickle", new SwordItem(ToolMaterials.GOLD, 2, -1.6f, new Item.Settings()));
    public static final SwordItem SILVER_SICKLE = registerSwordItems("silver_sickle", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 2, -1.6f, new Item.Settings()));
    public static final SwordItem COPPER_SICKLE = registerSwordItems("copper_sickle", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 2, -1.6f, new Item.Settings()));
    public static final SwordItem BRONZE_SICKLE = registerSwordItems("bronze_sickle", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 3, -1.6f, new Item.Settings()));
    public static final SwordItem PLATINUM_SICKLE = registerSwordItems("platinum_sickle", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 3, -1.6f, new Item.Settings()));
    public static final SwordItem BONE_SICKLE = registerSwordItems("bone_sickle", new SwordItem(DragonsHoardWAToolMaterials.BONE, 3, -1.6f, new Item.Settings()));
    public static final SwordItem IRON_SICKLE = registerSwordItems("iron_sickle", new SwordItem(ToolMaterials.IRON, 2, -1.6f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_SICKLE = registerSwordItems("infernal_iron_sickle", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 4, -1.6f, new Item.Settings()));
    public static final SwordItem COLD_IRON_SICKLE = registerSwordItems("cold_iron_sickle", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 4, -1.6f, new Item.Settings()));
    public static final SwordItem STEEL_SICKLE = registerSwordItems("steel_sickle", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 4, -1.6f, new Item.Settings()));
    public static final SwordItem DIAMOND_SICKLE = registerSwordItems("diamond_sickle", new SwordItem(ToolMaterials.DIAMOND, 2, -1.6f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_SICKLE = registerSwordItems("elven_steel_sickle", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 5, -1.6f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_SICKLE = registerSwordItems("dark_steel_sickle", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 5, -1.6f, new Item.Settings()));
    public static final SwordItem NETHERITE_SICKLE = registerSwordItems("netherite_sickle", new SwordItem(ToolMaterials.NETHERITE, 2, -1.6f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_SICKLE = registerSwordItems("dragon_bone_sickle", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 6, -1.6f, new Item.Settings()));
    public static final SwordItem PALLADIUM_SICKLE = registerSwordItems("palladium_sickle", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 6, -1.6f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_SICKLE = registerSwordItems("tungsten_carbide_sickle", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 6, -1.6f, new Item.Settings()));
    public static final SwordItem MITHRIL_SICKLE = registerSwordItems("mithril_sickle", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 6, -1.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_SICKLE = registerSwordItems("adamantine_sickle", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 7, -1.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_SICKLE = registerSwordItems("shadow_adamantine_sickle", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE,7, -1.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_SICKLE = registerSwordItems("adamantine_dragon_bone_sickle", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 8, -1.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_SICKLE = registerSwordItems("shadow_adamantine_dragon_bone_sickle", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 8, -1.6f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------SCYTHES-----------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_SCYTHE = registerSwordItems("wooden_scythe", new SwordItem(ToolMaterials.WOOD, 3, -2.6f, new Item.Settings()));
    public static final SwordItem STONE_SCYTHE = registerSwordItems("stone_scythe", new SwordItem(ToolMaterials.STONE, 3, -2.6f, new Item.Settings()));
    public static final SwordItem GOLDEN_SCYTHE = registerSwordItems("golden_scythe", new SwordItem(ToolMaterials.GOLD, 3, -2.6f, new Item.Settings()));
    public static final SwordItem SILVER_SCYTHE = registerSwordItems("silver_scythe", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 3, -2.6f, new Item.Settings()));
    public static final SwordItem COPPER_SCYTHE = registerSwordItems("copper_scythe", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 3, -2.6f, new Item.Settings()));
    public static final SwordItem BRONZE_SCYTHE = registerSwordItems("bronze_scythe", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 4, -2.6f, new Item.Settings()));
    public static final SwordItem PLATINUM_SCYTHE = registerSwordItems("platinum_scythe", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 4, -2.6f, new Item.Settings()));
    public static final SwordItem BONE_SCYTHE = registerSwordItems("bone_scythe", new SwordItem(DragonsHoardWAToolMaterials.BONE, 4, -2.6f, new Item.Settings()));
    public static final SwordItem IRON_SCYTHE = registerSwordItems("iron_scythe", new SwordItem(ToolMaterials.IRON, 3, -2.6f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_SCYTHE = registerSwordItems("infernal_iron_scythe", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 5, -2.6f, new Item.Settings()));
    public static final SwordItem COLD_IRON_SCYTHE = registerSwordItems("cold_iron_scythe", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 5, -2.6f, new Item.Settings()));
    public static final SwordItem STEEL_SCYTHE = registerSwordItems("steel_scythe", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 5, -2.6f, new Item.Settings()));
    public static final SwordItem DIAMOND_SCYTHE = registerSwordItems("diamond_scythe", new SwordItem(ToolMaterials.DIAMOND, 3, -2.6f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_SCYTHE = registerSwordItems("elven_steel_scythe", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 6, -2.6f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_SCYTHE = registerSwordItems("dark_steel_scythe", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 6, -2.6f, new Item.Settings()));
    public static final SwordItem NETHERITE_SCYTHE = registerSwordItems("netherite_scythe", new SwordItem(ToolMaterials.NETHERITE, 3, -2.6f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_SCYTHE = registerSwordItems("dragon_bone_scythe", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 7, -2.6f, new Item.Settings()));
    public static final SwordItem PALLADIUM_SCYTHE = registerSwordItems("palladium_scythe", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 7, -2.6f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_SCYTHE = registerSwordItems("tungsten_carbide_scythe", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 7, -2.6f, new Item.Settings()));
    public static final SwordItem MITHRIL_SCYTHE = registerSwordItems("mithril_scythe", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 7, -2.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_SCYTHE = registerSwordItems("adamantine_scythe", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 8, -2.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_SCYTHE = registerSwordItems("shadow_adamantine_scythe", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 8, -2.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_SCYTHE = registerSwordItems("adamantine_dragon_bone_scythe", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_SCYTHE = registerSwordItems("shadow_adamantine_dragon_bone_scythe", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.6f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------WarScythes------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    // WARSCYTHES TO BE MOVED TO P:RPG:EXTENDED WEAPONRY
    // public static final SwordItem WOODEN_WARSCYTHE = registerSwordItems("wooden_warscythe", new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem STONE_WARSCYTHE = registerSwordItems("stone_warscythe", new SwordItem(ToolMaterials.STONE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem GOLDEN_WARSCYTHE = registerSwordItems("golden_warscythe", new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem SILVER_WARSCYTHE = registerSwordItems("silver_warscythe", new SwordItem(DragonsHoardToolMaterials.SILVER, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem COPPER_WARSCYTHE = registerSwordItems("copper_warscythe", new SwordItem(DragonsHoardToolMaterials.COPPER, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem BRONZE_WARSCYTHE = registerSwordItems("bronze_warscythe", new SwordItem(DragonsHoardToolMaterials.BRONZE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem PLATINUM_WARSCYTHE = registerSwordItems("platinum_warscythe", new SwordItem(DragonsHoardToolMaterials.PLATINUM, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem BONE_WARSCYTHE = registerSwordItems("bone_warscythe", new SwordItem(DragonsHoardToolMaterials.BONE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem IRON_WARSCYTHE = registerSwordItems("iron_warscythe", new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem INFERNAL_IRON_WARSCYTHE = registerSwordItems("infernal_iron_warscythe", new SwordItem(DragonsHoardToolMaterials.INFERNAL_IRON, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem COLD_IRON_WARSCYTHE = registerSwordItems("cold_iron_warscythe", new SwordItem(DragonsHoardToolMaterials.COLD_IRON, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem STEEL_WARSCYTHE = registerSwordItems("steel_warscythe", new SwordItem(DragonsHoardToolMaterials.STEEL, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem DIAMOND_WARSCYTHE = registerSwordItems("diamond_warscythe", new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem ELVEN_STEEL_WARSCYTHE = registerSwordItems("elven_steel_swarcythe", new SwordItem(DragonsHoardToolMaterials.ELVEN_STEEL, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem DARK_STEEL_WARSCYTHE = registerSwordItems("dark_steel_warscythe", new SwordItem(DragonsHoardToolMaterials.DARK_STEEL, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem NETHERITE_WARSCYTHE = registerSwordItems("netherite_warscythe", new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem DRAGON_BONE_WARSCYTHE = registerSwordItems("dragon_bone_warscythe", new SwordItem(DragonsHoardToolMaterials.DRAGON_BONE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem PALLADIUM_WARSCYTHE = registerSwordItems("palladium_warscythe", new SwordItem(DragonsHoardToolMaterials.PALLADIUM, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem TUNGSTEN_CARBIDE_WARSCYTHE = registerSwordItems("tungsten_warscythe", new SwordItem(DragonsHoardToolMaterials.TUNGSTEN, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem MITHRIL_WARSCYTHE = registerSwordItems("mithril_warscythe", new SwordItem(DragonsHoardToolMaterials.MITHRIL, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem ADAMANTINE_WARSCYTHE = registerSwordItems("adamantine_warscythe", new SwordItem(DragonsHoardToolMaterials.ADAMANTINE, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem SHADOW_ADAMANTINE_WARSCYTHE = registerSwordItems("shadow_adamantine_warscythe", new SwordItem(DragonsHoardToolMaterials.SHADOW_ADAMANTINE, 4, -3.0f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------SWORDS------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    // public static final SwordItem WOODEN_SWORD = registerSwordItems("wooden_sword", new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings()));
    // public static final SwordItem GOLDEN_SWORD = registerSwordItems("golden_sword", new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings()));
    public static final SwordItem SILVER_SWORD = registerSwordItems("silver_sword", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 3, -2.4f, new Item.Settings()));
    public static final SwordItem COPPER_SWORD = registerSwordItems("copper_sword", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 3, -2.4f, new Item.Settings()));
    // public static final SwordItem STONE_SWORD = registerSwordItems("stone_sword", new SwordItem(ToolMaterials.STONE, 5, -3.0f, new Item.Settings()));
    public static final SwordItem BRONZE_SWORD = registerSwordItems("bronze_sword", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 4, -2.4f, new Item.Settings()));
    public static final SwordItem PLATINUM_SWORD = registerSwordItems("platinum_sword", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 4, -2.4f, new Item.Settings()));
    public static final SwordItem BONE_SWORD = registerSwordItems("bone_sword", new SwordItem(DragonsHoardWAToolMaterials.BONE, 4, -2.4f, new Item.Settings()));
    // public static final SwordItem IRON_SWORD = registerSwordItems("iron_sword", () -> new SwordItem(ToolMaterials.IRON, 6, -3.0f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_SWORD = registerSwordItems("infernal_iron_sword", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 5, -2.4f, new Item.Settings()));
    public static final SwordItem COLD_IRON_SWORD = registerSwordItems("cold_iron_sword", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 5, -2.4f, new Item.Settings()));
    public static final SwordItem STEEL_SWORD = registerSwordItems("steel_sword", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 5, -2.4f, new Item.Settings()));
    // public static final SwordItem DIAMOND_SWORD = registerSwordItems("diamond_sword", new SwordItem(ToolMaterials.DIAMOND, 7, -3.0f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_SWORD = registerSwordItems("elven_steel_sword", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 6, -2.4f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_SWORD = registerSwordItems("dark_steel_sword", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 6, -2.4f, new Item.Settings()));
    // public static final SwordItem NETHERITE_SWORD = registerSwordItems("netherite_sword", new SwordItem(ToolMaterials.NETHERITE, 8, -3.0f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_SWORD = registerSwordItems("dragon_bone_sword", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 7, -2.4f, new Item.Settings()));
    public static final SwordItem PALLADIUM_SWORD = registerSwordItems("palladium_sword", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 7, -2.4f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_SWORD = registerSwordItems("tungsten_carbide_sword", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 7, -2.4f, new Item.Settings()));
    public static final SwordItem MITHRIL_SWORD = registerSwordItems("mithril_sword", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 7, -2.4f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_SWORD = registerSwordItems("adamantine_sword", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 8, -2.4f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_SWORD = registerSwordItems("shadow_adamantine_sword", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 8, -2.4f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_SWORD = registerSwordItems("adamantine_dragon_bone_sword", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.4f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_SWORD = registerSwordItems("shadow_adamantine_dragon_bone_sword", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.4f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------MACES-------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_MACE = registerSwordItems("wooden_mace", new SwordItem(ToolMaterials.WOOD, 4, -2.8f, new Item.Settings()));
    public static final SwordItem STONE_MACE = registerSwordItems("stone_mace", new SwordItem(ToolMaterials.STONE, 4, -2.8f, new Item.Settings()));
    public static final SwordItem GOLDEN_MACE = registerSwordItems("golden_mace", new SwordItem(ToolMaterials.GOLD, 4, -2.8f, new Item.Settings()));
    public static final SwordItem SILVER_MACE = registerSwordItems("silver_mace", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 4, -2.8f, new Item.Settings()));
    public static final SwordItem COPPER_MACE = registerSwordItems("copper_mace", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 4, -2.8f, new Item.Settings()));
    public static final SwordItem BRONZE_MACE = registerSwordItems("bronze_mace", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 5, -2.8f, new Item.Settings()));
    public static final SwordItem PLATINUM_MACE = registerSwordItems("platinum_mace", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 5, -2.8f, new Item.Settings()));
    public static final SwordItem BONE_MACE = registerSwordItems("bone_mace", new SwordItem(DragonsHoardWAToolMaterials.BONE, 5, -2.8f, new Item.Settings()));
    public static final SwordItem IRON_MACE = registerSwordItems("iron_mace", new SwordItem(ToolMaterials.IRON, 4, -2.8f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_MACE = registerSwordItems("infernal_iron_mace", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 6, -2.8f, new Item.Settings()));
    public static final SwordItem COLD_IRON_MACE = registerSwordItems("cold_iron_mace", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 6, -2.8f, new Item.Settings()));
    public static final SwordItem STEEL_MACE = registerSwordItems("steel_mace", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 6, -2.8f, new Item.Settings()));
    public static final SwordItem DIAMOND_MACE = registerSwordItems("diamond_mace", new SwordItem(ToolMaterials.DIAMOND, 4, -2.8f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_MACE = registerSwordItems("elven_steel_mace", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 7, -2.8f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_MACE = registerSwordItems("dark_steel_mace", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 7, -2.8f, new Item.Settings()));
    public static final SwordItem NETHERITE_MACE = registerSwordItems("netherite_mace", new SwordItem(ToolMaterials.NETHERITE, 4, -2.8f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_MACE = registerSwordItems("dragon_bone_mace", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 8, -2.8f, new Item.Settings()));
    public static final SwordItem PALLADIUM_MACE = registerSwordItems("palladium_mace", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 8, -2.8f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_MACE = registerSwordItems("tungsten_carbide_mace", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 8, -2.8f, new Item.Settings()));
    public static final SwordItem MITHRIL_MACE = registerSwordItems("mithril_mace", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 8, -2.8f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_MACE = registerSwordItems("adamantine_mace", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.8f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_MACE = registerSwordItems("shadow_adamantine_mace", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.8f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_MACE = registerSwordItems("adamantine_dragon_bone_mace", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 10, -2.8f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_MACE = registerSwordItems("shadow_adamantine_dragon_bone_mace", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 10, -2.8f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------PIKES-------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_PIKE = registerSwordItems("wooden_pike", new SwordItem(ToolMaterials.WOOD, 5, -3.6f, new Item.Settings()));
    public static final SwordItem STONE_PIKE = registerSwordItems("stone_pike", new SwordItem(ToolMaterials.STONE, 5, -3.6f, new Item.Settings()));
    public static final SwordItem GOLDEN_PIKE = registerSwordItems("golden_pike", new SwordItem(ToolMaterials.GOLD, 5, -3.6f, new Item.Settings()));
    public static final SwordItem SILVER_PIKE = registerSwordItems("silver_pike", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 6, -3.6f, new Item.Settings()));
    public static final SwordItem COPPER_PIKE = registerSwordItems("copper_pike", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 6, -3.6f, new Item.Settings()));
    public static final SwordItem BRONZE_PIKE = registerSwordItems("bronze_pike", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 6, -3.6f, new Item.Settings()));
    public static final SwordItem PLATINUM_PIKE = registerSwordItems("platinum_pike", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 6, -3.6f, new Item.Settings()));
    public static final SwordItem BONE_PIKE = registerSwordItems("bone_pike", new SwordItem(DragonsHoardWAToolMaterials.BONE, 6, -3.6f, new Item.Settings()));
    public static final SwordItem IRON_PIKE = registerSwordItems("iron_pike", new SwordItem(ToolMaterials.IRON, 5, -3.6f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_PIKE = registerSwordItems("infernal_iron_pike", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 4, -3.6f, new Item.Settings()));
    public static final SwordItem COLD_IRON_PIKE = registerSwordItems("cold_iron_pike", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 7, -3.6f, new Item.Settings()));
    public static final SwordItem STEEL_PIKE = registerSwordItems("steel_pike", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 7, -3.6f, new Item.Settings()));
    public static final SwordItem DIAMOND_PIKE = registerSwordItems("diamond_pike", new SwordItem(ToolMaterials.DIAMOND, 5, -3.6f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_PIKE = registerSwordItems("elven_steel_pike", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 8, -3.6f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_PIKE = registerSwordItems("dark_steel_pike", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 8, -3.6f, new Item.Settings()));
    public static final SwordItem NETHERITE_PIKE = registerSwordItems("netherite_pike", new SwordItem(ToolMaterials.NETHERITE, 5, -3.6f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_PIKE = registerSwordItems("dragon_bone_pike", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 9, -3.6f, new Item.Settings()));
    public static final SwordItem PALLADIUM_PIKE = registerSwordItems("palladium_pike", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 9, -3.6f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_PIKE = registerSwordItems("tungsten_carbide_pike", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 9, -3.6f, new Item.Settings()));
    public static final SwordItem MITHRIL_PIKE = registerSwordItems("mithril_pike", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 9, -3.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_PIKE = registerSwordItems("adamantine_pike", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 10, -3.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_PIKE = registerSwordItems("shadow_adamantine_pike", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 10, -3.6f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_PIKE = registerSwordItems("adamantine_dragon_bone_pike", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 11, -3.6f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_PIKE = registerSwordItems("shadow_adamantine_dragon_bone_pike", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 11, -3.6f, new Item.Settings()));
    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------FALCHIONS---------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_FALCHION = registerSwordItems("wooden_falchion", new SwordItem(ToolMaterials.WOOD, 3, -2.3f, new Item.Settings()));
    public static final SwordItem STONE_FALCHION = registerSwordItems("stone_falchion", new SwordItem(ToolMaterials.STONE, 3, -2.3f, new Item.Settings()));
    public static final SwordItem GOLDEN_FALCHION = registerSwordItems("golden_falchion", new SwordItem(ToolMaterials.GOLD, 3, -2.3f, new Item.Settings()));
    public static final SwordItem SILVER_FALCHION = registerSwordItems("silver_falchion", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 3, -2.3f, new Item.Settings()));
    public static final SwordItem COPPER_FALCHION = registerSwordItems("copper_falchion", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 3, -2.3f, new Item.Settings()));
    public static final SwordItem BRONZE_FALCHION = registerSwordItems("bronze_falchion", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 4, -2.3f, new Item.Settings()));
    public static final SwordItem PLATINUM_FALCHION = registerSwordItems("platinum_falchion", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 4, -2.3f, new Item.Settings()));
    public static final SwordItem BONE_FALCHION = registerSwordItems("bone_falchion", new SwordItem(DragonsHoardWAToolMaterials.BONE, 4, -2.3f, new Item.Settings()));
    public static final SwordItem IRON_FALCHION = registerSwordItems("iron_falchion", new SwordItem(ToolMaterials.IRON, 3, -2.3f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_FALCHION = registerSwordItems("infernal_iron_falchion", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 5, -2.3f, new Item.Settings()));
    public static final SwordItem COLD_IRON_FALCHION = registerSwordItems("cold_iron_falchion", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 5, -2.3f, new Item.Settings()));
    public static final SwordItem STEEL_FALCHION = registerSwordItems("steel_falchion", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 5, -2.3f, new Item.Settings()));
    public static final SwordItem DIAMOND_FALCHION = registerSwordItems("diamond_falchion", new SwordItem(ToolMaterials.DIAMOND, 3, -2.3f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_FALCHION = registerSwordItems("elven_steel_falchion", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 6, -2.3f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_FALCHION = registerSwordItems("dark_steel_falchion", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 6, -2.3f, new Item.Settings()));
    public static final SwordItem NETHERITE_FALCHION = registerSwordItems("netherite_falchion", new SwordItem(ToolMaterials.NETHERITE, 3, -2.3f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_FALCHION = registerSwordItems("dragon_bone_falchion", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 7, -2.3f, new Item.Settings()));
    public static final SwordItem PALLADIUM_FALCHION = registerSwordItems("palladium_falchion", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 7, -2.3f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_FALCHION = registerSwordItems("tungsten_carbide_falchion", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 7, -2.3f, new Item.Settings()));
    public static final SwordItem MITHRIL_FALCHION = registerSwordItems("mithril_falchion", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 7, -2.3f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_FALCHION = registerSwordItems("adamantine_falchion", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 8, -2.3f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_FALCHION = registerSwordItems("shadow_adamantine_falchion", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 8, -2.3f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_FALCHION = registerSwordItems("adamantine_dragon_bone_falchion", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.3f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_FALCHION = registerSwordItems("shadow_adamantine_dragon_bone_falchion", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.3f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------LONG_SPEARS--------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem WOODEN_LONG_SPEAR = registerSwordItems("wooden_long_spear", new SwordItem(ToolMaterials.WOOD, 4, -2.7f, new Item.Settings()));
    public static final SwordItem STONE_LONG_SPEAR = registerSwordItems("stone_long_spear", new SwordItem(ToolMaterials.STONE, 4, -2.7f, new Item.Settings()));
    public static final SwordItem GOLDEN_LONG_SPEAR = registerSwordItems("golden_long_spear", new SwordItem(ToolMaterials.GOLD, 4, -2.7f, new Item.Settings()));
    public static final SwordItem SILVER_LONG_SPEAR = registerSwordItems("silver_long_spear", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 4, -2.7f, new Item.Settings()));
    public static final SwordItem COPPER_LONG_SPEAR = registerSwordItems("copper_long_spear", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 4, -2.7f, new Item.Settings()));
    //public static final SwordItem BRASS_LONG_SPEAR = registerSwordItems("brass_long_spear", new SwordItem(DragonsHoardWAToolMaterials.BRASS, 4, -3.0f, new Item.Settings()));
    public static final SwordItem BRONZE_LONG_SPEAR = registerSwordItems("bronze_long_spear", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 5, -2.7f, new Item.Settings()));
    public static final SwordItem PLATINUM_LONG_SPEAR = registerSwordItems("platinum_long_spear", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 5, -2.7f, new Item.Settings()));
    public static final SwordItem BONE_LONG_SPEAR = registerSwordItems("bone_long_spear", new SwordItem(DragonsHoardWAToolMaterials.BONE, 5, -2.7f, new Item.Settings()));
    public static final SwordItem IRON_LONG_SPEAR = registerSwordItems("iron_long_spear", new SwordItem(ToolMaterials.IRON, 4, -2.7f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_LONG_SPEAR = registerSwordItems("infernal_iron_long_spear", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 6, -2.7f, new Item.Settings()));
    public static final SwordItem COLD_IRON_LONG_SPEAR = registerSwordItems("cold_iron_long_spear", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 6, -2.7f, new Item.Settings()));
    public static final SwordItem STEEL_LONG_SPEAR = registerSwordItems("steel_long_spear", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 6, -2.7f, new Item.Settings()));
    public static final SwordItem DIAMOND_LONG_SPEAR = registerSwordItems("diamond_long_spear", new SwordItem(ToolMaterials.DIAMOND, 4, -2.7f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_LONG_SPEAR = registerSwordItems("elven_steel_long_spear", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 7, -2.7f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_LONG_SPEAR = registerSwordItems("dark_steel_long_spear", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 7, -2.7f, new Item.Settings()));
    public static final SwordItem NETHERITE_LONG_SPEAR = registerSwordItems("netherite_long_spear", new SwordItem(ToolMaterials.NETHERITE, 4, -2.7f, new Item.Settings()));
    public static final SwordItem DRAGON_BONE_LONG_SPEAR = registerSwordItems("dragon_bone_long_spear", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 8, -2.7f, new Item.Settings()));
    public static final SwordItem PALLADIUM_LONG_SPEAR = registerSwordItems("palladium_long_spear", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 8, -2.7f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_LONG_SPEAR = registerSwordItems("tungsten_long_spear", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 8, -2.7f, new Item.Settings()));
    public static final SwordItem MITHRIL_LONG_SPEAR = registerSwordItems("mithril_long_spear", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 8, -2.7f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_LONG_SPEAR = registerSwordItems("adamantine_long_spear", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 9, -2.7f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_LONG_SPEAR = registerSwordItems("shadow_adamantine_long_spear", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 9, -2.7f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_DRAGON_BONE_LONG_SPEAR = registerSwordItems("adamantine_dragon_bone_long_spear", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 10, -2.7f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_LONG_SPEAR = registerSwordItems("shadow_adamantine_dragon_bone_long_spear", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 10, -2.7f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------------BOW---------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/

    /*----------------------------------------------------------------------------------------------------------------------
    ----------------------------------------------------SHORTBOW------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/

    /*----------------------------------------------------------------------------------------------------------------------
    ---------------------------------------------------Caestus--------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem LEATHER_CAESTUS = registerSwordItems("leather_caestus", new SwordItem(ToolMaterials.WOOD, 1, -1.5f, new Item.Settings()));
    public static final SwordItem DRAGON_SCALE_CAESTUS = registerSwordItems("dragon_scale_caestus", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 5, -1.5f, new Item.Settings()));
    //Change the 2 below to Dragon Scale in the future.
    public static final SwordItem ADAMANTINE_DRAGON_BONE_CAESTUS = registerSwordItems("adamantine_dragon_bone_caestus", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 7, -1.5f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_DRAGON_BONE_CAESTUS = registerSwordItems("shadow_adamantine_dragon_bone_caestus", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 7, -1.5f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ---------------------------------------------------Gauntlets-------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    public static final SwordItem GOLDEN_GAUNTLET = registerSwordItems("golden_gauntlet", new SwordItem(ToolMaterials.GOLD, 1, -1.5f, new Item.Settings()));
    public static final SwordItem SILVER_GAUNTLET = registerSwordItems("silver_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.SILVER, 1, -1.5f, new Item.Settings()));
    public static final SwordItem COPPER_GAUNTLET = registerSwordItems("copper_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.COPPER, 1, -1.5f, new Item.Settings()));
    public static final SwordItem BRONZE_GAUNTLET = registerSwordItems("bronze_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.BRONZE, 2, -1.5f, new Item.Settings()));
    public static final SwordItem PLATINUM_GAUNTLET = registerSwordItems("platinum_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.PLATINUM, 2, -1.5f, new Item.Settings()));
    public static final SwordItem IRON_GAUNTLET = registerSwordItems("iron_gauntlet", new SwordItem(ToolMaterials.IRON, 1, -1.5f, new Item.Settings()));
    public static final SwordItem INFERNAL_IRON_GAUNTLET = registerSwordItems("infernal_iron_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 3, -1.5f, new Item.Settings()));
    public static final SwordItem COLD_IRON_GAUNTLET = registerSwordItems("cold_iron_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.COLD_IRON, 3, -1.5f, new Item.Settings()));
    public static final SwordItem STEEL_GAUNTLET = registerSwordItems("steel_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.STEEL, 3, -1.5f, new Item.Settings()));
    public static final SwordItem DIAMOND_GAUNTLET = registerSwordItems("diamond_gauntlet", new SwordItem(ToolMaterials.DIAMOND, 1, -1.5f, new Item.Settings()));
    public static final SwordItem ELVEN_STEEL_GAUNTLET = registerSwordItems("elven_steel_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 4, -1.5f, new Item.Settings()));
    public static final SwordItem DARK_STEEL_GAUNTLET = registerSwordItems("dark_steel_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.DARK_STEEL, 4, -1.5f, new Item.Settings()));
    public static final SwordItem NETHERITE_GAUNTLET = registerSwordItems("netherite_gauntlet", new SwordItem(ToolMaterials.NETHERITE, 1, -1.5f, new Item.Settings()));
    public static final SwordItem PALLADIUM_GAUNTLET = registerSwordItems("palladium_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.PALLADIUM, 5, -1.5f, new Item.Settings()));
    public static final SwordItem TUNGSTEN_CARBIDE_GAUNTLET = registerSwordItems("tungsten_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 5, -1.5f, new Item.Settings()));
    public static final SwordItem MITHRIL_GAUNTLET = registerSwordItems("mithril_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.MITHRIL, 5, -1.5f, new Item.Settings()));
    public static final SwordItem ADAMANTINE_GAUNTLET = registerSwordItems("adamantine_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.ADAMANTINE, 6, -1.5f, new Item.Settings()));
    public static final SwordItem SHADOW_ADAMANTINE_GAUNTLET = registerSwordItems("shadow_adamantine_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 6, -1.5f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ---------------------------------------------------CLAWS----------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    // public static final SwordItem GLACIAL_CLAW = registerSwordItems("glacial_claw", new SwordItem(DragonsHoardToolMaterials.GLACIAL, 4, -1.5f, new Item.Settings()));
    public static final SwordItem DRAGON_CLAW = registerSwordItems("dragon_claw", new SwordItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 5, -1.5f, new Item.Settings()));

    /*----------------------------------------------------------------------------------------------------------------------
    ---------------------------------------------------Crossbow-------------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    // NOT to be made from metals

    /*----------------------------------------------------------------------------------------------------------------------
    ------------------------------------------------Light_Crossbow----------------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    // Not to be made from METALS, Only use Ponderosa Pine & Dragon bone.
    // public static final RegistrySupplier<CrossbowItem> SHADOW_ADAMANTINE_CROSSBOW = registerCrossbowItems("shadow_adamantine_crossbow", new CrossbowItem(DragonsHoardToolMaterials.SHADOW_ADAMANTINE,));

    /*----------------------------------------------------------------------------------------------------------------------
    ----------------------------------------------------------Heavy_Crossbow------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/



    /*----------------------------------------------------------------------------------------------------------------------
    ---------------------------------------------------Weapons for later mod------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    // shortsword
    // Morningstar
    // Mauls
    // Lance (maybe)
    // Dart
    // war crossbow -very heavy bolt w/ Very long reload, high damage. possibilty of using haveing a Tungsten Carbid "upgrade" for the bolts.
    // longbow
    // blowgun
    // warpick   *
    // javelin   *
    // qatar gauntlets
    // xiphos
    // pila
    // falcata
    // boarspear
    // Waraxe
    // khopesh
    // handgonne

    /*----------------------------------------------------------------------------------------------------------------------
    ----------------------------------------------AXES-ARE-FOUND-IN-THE-ToolsInit-------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/



    /*----------------------------------------------------------------------------------------------------------------------
    ----------------------------------------------STAFFS-(Wizards Compat)---------------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/



    /*----------------------------------------------------------------------------------------------------------------------
    -----------------------------------DIVINE-WEAPONS (Literal Placeholders, NOT actual weapons)----------------------------
    ------------------------------------------------------------------------------------------------------------------------
    -------These are all placeholder quick builds of ANY weapon type in DH: W&A, specifically for DIVINE Equipment.---------
    -------------------------------------------Just Copy & paste with a Name Change.----------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    // public static final SwordItem DIVINE_BATTLEAXE = registerSwordItems("divine_battleaxe", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_CAESTUS = registerSwordItems("divine_caestus", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_CLAYMORE = registerSwordItems("divine_claymore", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_DAGGER = registerSwordItems("divine_dagger", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_FALCHION = registerSwordItems("divine_falchion", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_GAUNTLET = registerSwordItems("divine_gauntlet", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_GLAIVE = registerSwordItems("divine_glaive", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_HALBERD = registerSwordItems("divine_halberd", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_HANDAXE = registerSwordItems("divine_handaxe", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_LONGSWORD = registerSwordItems("divine_longsword", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_LONG_SPEAR = registerSwordItems("divine_long_spear", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_MACE = registerSwordItems("divine_mace", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_PIKE = registerSwordItems("divine_pike", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_QUARTERSTAFF = registerSwordItems("divine_quarterstaff", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_RAPIER = registerSwordItems("divine_rapier", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_SCIMITAR = registerSwordItems("divine_scimitar", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_SCYTHE = registerSwordItems("divine_scythe", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_SICKLE = registerSwordItems("divine_sickle", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_SPEAR = registerSwordItems("divine_spear", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_SWORD = registerSwordItems("divine_sword", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_TRIDENT = registerSwordItems("divine_trident", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    // public static final SwordItem DIVINE_WARHAMMER = registerSwordItems("divine_warhammer", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 1, -1.0f, new Item.Settings()));
    /*----------------------------------------------------------------------------------------------------------------------
    -----------------------------------------------------DIVINE/MISC-WEAPONRY-----------------------------------------------
    ----------------------------------------------------------------------------------------------------------------------*/
    // Homebrew content is NOT ALLOWED (Unless owned by YOU), though inspiration can be drawn from it, need to check existing and future weapons below.
    // public static final SwordItem HOLY_AVENGER_GREATSWORD = registerSwordItems("holy_avenger_greatsword", new SwordItem(DragonsHoardToolMaterials.DIVINE, 17, -3.3f, new Item.Settings().rarity(Rarity.EPIC)));
    // public static final SwordItem HAZIRAWN_GREATSWORD = registerSwordItems("hazirawn_greatsword", new SwordItem(DragonsHoardToolMaterials.DIVINE, 17, -3.3f, new Item.Settings().rarity(Rarity.EPIC)));
    // Ravens Wing- Glaive, google it.
    public static final SwordItem ATROPOS = registerSwordItems("atropos", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 10, -2.6f, new Item.Settings().rarity(Rarity.EPIC)));
    // -------------------------------------JustaSnowAngel's set------------------------------ 1 scythe 2 sickles
    public static final SwordItem SNOWDRIFT_FROSTREAPER = registerSwordItems("snowdrift_frostreaper", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 10, -2.6f, new Item.Settings().rarity(Rarity.EPIC)));
    public static final SwordItem PURITYS_FROSTFALL_SERENADE = registerSwordItems("puritys_frostfall_serenade", new SwordItem(DragonsHoardWAToolMaterials.DIVINE,9, -1.6f, new Item.Settings().rarity(Rarity.EPIC)));
    public static final SwordItem MALEVOLENT_ARCTIC_DESPAIR = registerSwordItems("malevolent_arctic_despair", new SwordItem(DragonsHoardWAToolMaterials.DIVINE,9, -1.6f, new Item.Settings().rarity(Rarity.EPIC)));
    // ----------------------------------------Phoenix's Set------------------------------------ 1 warscythe 2 small scythes
    public static final SwordItem EMBERWING_SCORNBLADE = registerSwordItems("emberwing_scornblade", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 10, -2.6f, new Item.Settings().rarity(Rarity.EPIC)));
    public static final SwordItem SERAPHIC_PLUMEREAVER = registerSwordItems("seraphic_plumereaver", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 9, -1.8f, new Item.Settings().rarity(Rarity.EPIC)));
    public static final SwordItem DEMONIC_PYROFEATHER = registerSwordItems("demonic_pyrofeather", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 9, -1.8f, new Item.Settings().rarity(Rarity.EPIC)));
    // ------------------------------------------Mtiger's Set------------------------------------- 3 Katanas
    // public static final SwordItem PROWLING_SWIFTCLAW = registerSwordItems("prowling_swiftclaw", new SwordItem(DragonsHoardToolMaterials.DIVINE, 11, -2.2f, new Item.Settings().rarity(Rarity.EPIC)));
    // public static final SwordItem HARMONIOUS_HUNTRESS = registerSwordItems("harmonious_huntress", new SwordItem(DragonsHoardToolMaterials.DIVINE, 1, -1.9f, new Item.Settings().rarity(Rarity.EPIC)));
    // public static final SwordItem WICKED_WHISKER = registerSwordItems("wicked_whisker", new SwordItem(DragonsHoardToolMaterials.DIVINE, 1, -1.9f, new Item.Settings().rarity(Rarity.EPIC)));
    // //The True Pumpkin King -Inspiration by Pumpkinking6647 on Twitch. needs to be a scythe.----------1-Scythe
    // public static final SwordItem W1 = registerSwordItems("w1", new SwordItem(DragonsHoardToolMaterials.DIVINE, 16, -2.6f, new Item.Settings().rarity(Rarity.EPIC)));
    // ------------------------------------Assistance_Required's set--------------------------------------
    // Ornate longsword (Good)
    // 2 sistser blades (boths evil)
    // ------------------------------------------Tamaki's Set----------------------------------------------
    // Yellowey dragon type Halberd.
    // sister weapons 2 katana like blades like the ninjas from elden ring. Lots of Color saturation- yellowy. (Tamaki is color blind)
    // -------------------------------------------Solaces Set----------------------------------------------
    // ---------Eclipse----- https://docs.google.com/document/d/1d4psOBlnjd8o4wiiwG8O69ppE73nYKGnyeAWODnxnbM/edit?usp=drivesdk ---------
    public static final SwordItem THE_ECLIPSE = registerSwordItems("the_eclipse", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 12, -3.3f, new Item.Settings().rarity(Rarity.EPIC)));
    public static final SwordItem DAWN = registerSwordItems("dawn", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 10, -2.2f, new Item.Settings()));//Katanas need to get damage set, (whole set)
    public static final SwordItem DUSK = registerSwordItems("dusk", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 10, -2.2f, new Item.Settings()));
    // Combine both these to get The Eclipse.

    // PureJosh's set-------------------------------------------------------------------------------------
    // main: katana - handed, fast
    // side: tachi -2 handed, check 2 handed weapons in better combat, slow-er speed.
    // aux: naginata 2 handed staff like glaive type weapon, faster than tachi, less damage than tachi.
    // wants focus around speed and damage, speed or stealth abilities

    // Backupcup's set-----------------------------------------------------------------------------------------------------------
    public static final SwordItem CUPS_CLAYMORE = registerSwordItems("cups_claymore", new SwordItem(DragonsHoardWAToolMaterials.DIVINE, 12, -3.2f, new Item.Settings().rarity(Rarity.EPIC)));

    // Main: Yellow Claymore - 1 handed, pretty slow, "low-end high" damage,
    // secondary Red Claymore - 1 handed, pretty slow, "low-end high" damage
    //

    // Zarras set
    // Havoc staff (but a chicken demon skull)
    // Shang-chi Rings

    protected static TridentItem registerTridentItems(String id, TridentItem newItem) {
        TridentItem tridentItem = Registry.register(Registries.ITEM, DragonsHoardWA.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(tridentItem));
        return tridentItem;
    }
    protected static AxeItem registerAxeItems(String id, AxeItem newItem) {
        AxeItem axeItem = Registry.register(Registries.ITEM, DragonsHoardWA.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(axeItem));
        return axeItem;
    }
    protected static SwordItem registerSwordItems(String id, SwordItem newItem) {
        SwordItem swordItem = Registry.register(Registries.ITEM, DragonsHoardWA.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(swordItem));
        return swordItem;
    }
    public static void register() {
        DragonsHoardWA.LOGGER.info("Registering Weapons from the Dragon's Hoard!");
    }

}
