package me.meetmywagon23.dragonshoardwa.registries;

import me.meetmywagon23.dragonshoardwa.DragonsHoardWA;
import me.meetmywagon23.dragonshoardwa.items.CoinItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class ItemsRegistry {
    // Coins
    public static final Item COPPER_COIN = registerItems("copper_coin", new CoinItem(new Item.Settings()));
    public static final Item COPPER_COIN_FIVE_STACK = registerItems("copper_coin_five_stack", new CoinItem(new Item.Settings()));
    public static final Item COPPER_COIN_TEN_STACK = registerItems("copper_coin_ten_stack", new CoinItem(new Item.Settings()));
    public static final Item SILVER_COIN = registerItems("silver_coin", new CoinItem(new Item.Settings()));
    public static final Item SILVER_COIN_FIVE_STACK = registerItems("silver_coin_five_stack", new CoinItem(new Item.Settings()));
    public static final Item SILVER_COIN_TEN_STACK = registerItems("silver_coin_ten_stack", new CoinItem(new Item.Settings()));
    public static final Item GOLD_COIN = registerItems("gold_coin", new CoinItem(new Item.Settings()));
    public static final Item GOLD_COIN_FIVE_STACK = registerItems("gold_coin_five_stack", new CoinItem(new Item.Settings()));
    public static final Item GOLD_COIN_TEN_STACK = registerItems("gold_coin_ten_stack", new CoinItem(new Item.Settings()));
    public static final Item PLATINUM_COIN = registerItems("platinum_coin", new CoinItem(new Item.Settings()));
    public static final Item PLATINUM_COIN_FIVE_STACK = registerItems("platinum_coin_five_stack", new CoinItem(new Item.Settings()));
    public static final Item PLATINUM_COIN_TEN_STACK = registerItems("platinum_coin_ten_stack", new CoinItem(new Item.Settings()));

    public static final Item LIGHT_ARMOR_MESH = registerItems("light_armor_mesh", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    // public static final Item ARMOR_PLATING = registerItems("armor_plating", new Item(new Item.Settings().rarity(Rarity.UNCOMMON))); UNUSED ATM
    public static final Item BONE_SPLINTER = registerItems("bone_splinter", new Item(new Item.Settings()));
    public static final Item WITHER_BONE = registerItems("wither_bone", new Item(new Item.Settings()));
    public static final Item WITHER_BONE_SPLINTER = registerItems("wither_bone_splinter", new Item(new Item.Settings()));
    public static final Item BONE_BLIGHT = registerItems("bone_blight", new Item(new Item.Settings())); //only turn poppy's into wither rose. all else dead bush.
    public static final Item SKELETON_RIBCAGE = registerItems("skeleton_ribcage", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item WITHER_SKELETON_RIBCAGE = registerItems("wither_skeleton_ribcage", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item SKELETON_PELVIS = registerItems("skeleton_pelvis", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item WITHER_SKELETON_PELVIS = registerItems("wither_skeleton_pelvis", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item DRAGON_SCALE = registerItems("dragon_scale", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item DRAGON_BONE = registerItems("dragon_bone", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item BROKEN_DRAGON_SPLINTER = registerItems("broken_dragon_splinter", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    // Need to make a new Rarity specification "Divine"
    public static final Item DIVINE_CATALYST = registerItems("divine_catalyst", new Item(new Item.Settings().maxCount(8).rarity(Rarity.EPIC)));

    // Dropped from Ancient Ice Block &/or Ice Based "Divine Classed" Boss
    public static final Item ANCIENT_ICE = registerItems("ancient_ice", new Item(new Item.Settings().maxCount(8).rarity(Rarity.EPIC)));

    /*
     * Raw, Nugget and Ingot forms of Materials
     */

    // Adamantine - adamant is used only to craft Adamantine. there is lore relation to this reasoning in the D&D lore. -- Fragments +_________ are used to craft the Adamantine Ingot.
    public static final Item RAW_ADAMANT_FRAGMENT = registerItems("raw_adamant_fragment", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item ADAMANTINE_NUGGET = registerItems("adamantine_nugget", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item ADAMANTINE_INGOT = registerItems("adamantine_ingot", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    // Adamantine Coated - Pristine armor may have an "Underglow" (texture related) to the visual effects + the stat bonuses.
    public static final Item ADAMANTINE_COATED_DRAGON_BONE = registerItems("adamantine_coated_dragon_bone", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item ADAMANTINE_COATED_DRAGON_SCALE = registerItems("adamantine_coated_dragon_scale", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item PRISTINE_ADAMANTINE_COATED_DRAGON_BONE = registerItems("pristine_adamantine_coated_dragon_bone", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item PRISTINE_ADAMANTINE_COATED_DRAGON_SCALE = registerItems("pristine_adamantine_coated_dragon_scale", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    // Aluminum
    public static final Item RAW_ALUMINUM = registerItems("raw_aluminum", new Item(new Item.Settings()));
    public static final Item ALUMINUM_NUGGET = registerItems("aluminum_nugget", new Item(new Item.Settings()));
    public static final Item ALUMINUM_INGOT = registerItems("aluminum_ingot", new Item(new Item.Settings()));

    // Brass (Copper + Zinc) || Chronos Note: Brass is EXTREMELY rare, naturally; unsure if you plan to spawn as an ore. Noticed that there are no Zinc items.
    //public static final Item RAW_BRASS = registerItems("raw_brass", new Item(new Item.Settings()));
    //public static final Item BRASS_NUGGET = registerItems("brass_nugget",  new Item(new Item.Settings()));
    //public static final Item BRASS_INGOT = registerItems("brass_ingot", new Item(new Item.Settings()));

    // Bronze (Copper + Tin) || Chronos Note: Bronze is EXTREMELY rare, naturally; unsure if you plan to spawn as an ore.
    public static final Item RAW_BRONZE = registerItems("raw_bronze", new Item(new Item.Settings()));
    public static final Item BRONZE_NUGGET = registerItems("bronze_nugget", new Item(new Item.Settings()));
    public static final Item BRONZE_INGOT = registerItems("bronze_ingot", new Item(new Item.Settings()));

    // Cold Iron
    public static final Item RAW_COLD_IRON = registerItems("raw_cold_iron", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item COLD_IRON_NUGGET = registerItems("cold_iron_nugget", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item COLD_IRON_INGOT = registerItems("cold_iron_ingot", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    // Copper
    public static final Item COPPER_NUGGET = registerItems("copper_nugget", new Item(new Item.Settings()));

    // Dark Steel - Half the weight of Steel
    public static final Item DARK_STEEL_NUGGET = registerItems("dark_steel_nugget", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item DARK_STEEL_INGOT = registerItems("dark_steel_ingot", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    // Electrum || Chronos Note: Electrum is EXTREMELY rare, naturally; unsure if you plan to spawn as an ore.
    public static final Item RAW_ELECTRUM = registerItems("raw_electrum", new Item(new Item.Settings()));
    public static final Item ELECTRUM_NUGGET = registerItems("electrum_nugget", new Item(new Item.Settings()));
    public static final Item ELECTRUM_INGOT = registerItems("electrum_ingot", new Item(new Item.Settings()));

    // Elven Steel - Half the weight of Steel
    public static final Item RAW_ELVEN_STEEL = registerItems("raw_elven_steel", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ELVEN_STEEL_NUGGET = registerItems("elven_steel_nugget", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item ELVEN_STEEL_INGOT = registerItems("elven_steel_ingot", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    // Infernal Iron
    public static final Item RAW_INFERNAL_IRON = registerItems("raw_infernal_iron", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item RAW_INFERNAL_SLIVER = registerItems("raw_infernal_sliver", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item INFERNAL_IRON_NUGGET = registerItems("infernal_iron_nugget", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item INFERNAL_IRON_INGOT = registerItems("infernal_iron_ingot", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    // Itanium
    public static final Item RAW_ITANIUM = registerItems("raw_itanium", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item ITANIUM_NUGGET = registerItems("itanium_nugget", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item ITANIUM_INGOT = registerItems("itanium_ingot", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    // Lead
    public static final Item RAW_LEAD = registerItems("raw_lead", new Item(new Item.Settings()));
    public static final Item LEAD_NUGGET = registerItems("lead_nugget", new Item(new Item.Settings()));
    public static final Item LEAD_INGOT = registerItems("lead_ingot", new Item(new Item.Settings()));

    // Mithril
    public static final Item RAW_MITHRIL = registerItems("raw_mithril", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item MITHRIL_NUGGET = registerItems("mithril_nugget", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item MITHRIL_INGOT = registerItems("mithril_ingot", new Item(new Item.Settings().rarity(Rarity.RARE)));

    // Nickel Zinc || Chronos Note: Nickel Zinc does not occur naturally; unsure if you plan to spawn as an ore.
    public static final Item RAW_NICKEL_ZINC = registerItems("raw_nickel_zinc", new Item(new Item.Settings()));
    public static final Item NICKEL_ZINC_NUGGET = registerItems("nickel_zinc_nugget", new Item(new Item.Settings()));
    public static final Item NICKEL_ZINC_INGOT = registerItems("nickel_zinc_ingot", new Item(new Item.Settings()));

    // Palladium
    public static final Item RAW_PALLADIUM = registerItems("raw_palladium", new Item(new Item.Settings()));
    public static final Item PALLADIUM_NUGGET = registerItems("palladium_nugget", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item PALLADIUM_INGOT = registerItems("palladium_ingot", new Item(new Item.Settings().rarity(Rarity.RARE)));

    // Platinum
    public static final Item RAW_PLATINUM = registerItems("raw_platinum", new Item(new Item.Settings()));
    public static final Item PLATINUM_NUGGET = registerItems("platinum_nugget", new Item(new Item.Settings()));
    public static final Item PLATINUM_INGOT = registerItems("platinum_ingot", new Item(new Item.Settings()));

    // Pure Carbon - Found in small (~8x8 craters in deserts, as a "snow" layer; obtained with a shovel) Carbon + Tungsten
    public static final Item PURE_CARBON = registerItems("pure_carbon", new Item(new Item.Settings().rarity(Rarity.RARE)));

    // Shadow Adamantine - Pristine armor may have an "Underglow" (texture related) to the visual effects + the stat bonuses.
    public static final Item RAW_SHADOW_ADAMANT = registerItems("raw_shadow_adamant", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SHADOW_ADAMANTINE_NUGGET = registerItems("shadow_adamantine_nugget", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SHADOW_ADAMANTINE_INGOT = registerItems("shadow_adamantine_ingot", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SHADOW_ADAMANTINE_COATED_DRAGON_BONE = registerItems("shadow_adamantine_coated_dragon_bone", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SHADOW_ADAMANTINE_COATED_DRAGON_SCALE = registerItems("shadow_adamantine_coated_dragon_scale", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item PRISTINE_SHADOW_ADAMANTINE_COATED_DRAGON_BONE = registerItems("pristine_shadow_adamantine_coated_dragon_bone", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item PRISTINE_SHADOW_ADAMANTINE_COATED_DRAGON_SCALE = registerItems("pristine_shadow_adamantine_coated_dragon_scale", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    // Silver
    public static final Item RAW_SILVER = registerItems("raw_silver", new Item(new Item.Settings()));
    public static final Item SILVER_NUGGET = registerItems("silver_nugget", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItems("silver_ingot", new Item(new Item.Settings()));

    // Starfall
    public static final Item RAW_STARFALL_ORE = registerItems("raw_starfall_ore", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    // Steel || Chronos Note: Steel does not exist naturally; unsure if you plan to spawn as an ore.
    public static final Item RAW_STEEL = registerItems("raw_steel", new Item(new Item.Settings()));
    public static final Item STEEL_NUGGET = registerItems("steel_nugget", new Item(new Item.Settings()));
    public static final Item STEEL_INGOT = registerItems("steel_ingot", new Item(new Item.Settings()));

    // Tin
    public static final Item RAW_TIN = registerItems("raw_tin", new Item(new Item.Settings()));
    public static final Item TIN_NUGGET = registerItems("tin_nugget", new Item(new Item.Settings()));
    public static final Item TIN_INGOT = registerItems("tin_ingot", new Item(new Item.Settings()));

    // Titanium
    public static final Item RAW_TITANIUM = registerItems("raw_titanium", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item TITANIUM_NUGGET = registerItems("titanium_nugget", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item TITANIUM_INGOT = registerItems("titanium_ingot", new Item(new Item.Settings().rarity(Rarity.RARE)));

    // Tungsten || Used in combination with Carbon to make Tungsten Carbide.
    public static final Item RAW_TUNGSTEN = registerItems("raw_tungsten", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item TUNGSTEN_CARBIDE_NUGGET = registerItems("tungsten_carbide_nugget", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item TUNGSTEN_CARBIDE_INGOT = registerItems("tungsten_carbide_ingot", new Item(new Item.Settings().rarity(Rarity.RARE)));

    public static final Item RAW_ZINC = registerItems("raw_zinc", new Item(new Item.Settings()));
    public static final Item ZINC_NUGGET = registerItems("zinc_nugget", new Item(new Item.Settings()));
    public static final Item ZINC_INGOT = registerItems("zinc_ingot", new Item(new Item.Settings()));

    // Ore Dusts | Used by other mods when Dusts are needed (needs a re-write as much has changed since this writing.) || Chronos Note: These should be conditionally registered, then.
    public static final Item ADAMANT_DUST = registerItems("adamant_dust", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DUST = registerItems("adamantine_dust", new Item(new Item.Settings()));
    public static final Item ALUMINUM_DUST = registerItems("aluminum_dust", new Item(new Item.Settings()));
    public static final Item ARANDUR_DUST = registerItems("arandur_dust", new Item(new Item.Settings()));
    public static final Item BRASS_DUST = registerItems("brass_dust", new Item(new Item.Settings()));
    public static final Item BRONZE_DUST = registerItems("bronze_dust", new Item(new Item.Settings()));
    public static final Item COAL_DUST = registerItems("coal_dust", new Item(new Item.Settings()));
    public static final Item COLD_IRON_DUST = registerItems("cold_iron_dust", new Item(new Item.Settings()));
    public static final Item COPPER_DUST = registerItems("copper_dust", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_DUST = registerItems("dark_steel_dust", new Item(new Item.Settings()));
    public static final Item DIAMOND_DUST = registerItems("diamond_dust", new Item(new Item.Settings()));
    public static final Item ELECTRUM_DUST = registerItems("electrum_dust", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_DUST = registerItems("elven_steel_dust", new Item(new Item.Settings()));
    public static final Item GLACIAL_DUST = registerItems("glacial_dust", new Item(new Item.Settings()));
    public static final Item GOLD_DUST = registerItems("gold_dust", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_DUST = registerItems("infernal_iron_dust", new Item(new Item.Settings()));
    public static final Item IRON_DUST = registerItems("iron_dust", new Item(new Item.Settings()));
    public static final Item ITANIUM_DUST = registerItems("itanium_dust", new Item(new Item.Settings()));
    public static final Item LEAD_DUST = registerItems("lead_dust", new Item(new Item.Settings()));
    public static final Item MITHRIL_DUST = registerItems("mithril_dust", new Item(new Item.Settings()));
    public static final Item NETHERITE_DUST = registerItems("netherite_dust", new Item(new Item.Settings()));
    public static final Item NICKEL_DUST = registerItems("nickel_dust", new Item(new Item.Settings()));
    public static final Item PALLADIUM_DUST = registerItems("palladium_dust", new Item(new Item.Settings()));
    public static final Item PLATINUM_DUST = registerItems("platinum_dust", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DUST = registerItems("shadow_adamantine_dust", new Item(new Item.Settings()));
    public static final Item SILVER_DUST = registerItems("silver_dust", new Item(new Item.Settings()));
    public static final Item STARFALL_DUST = registerItems("stallfall_dust", new Item(new Item.Settings()));
    public static final Item STEEL_DUST = registerItems("steel_dust", new Item(new Item.Settings()));
    public static final Item TIN_DUST = registerItems("tin_dust", new Item(new Item.Settings()));
    public static final Item TITANIUM_DUST = registerItems("titanium_dust", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_DUST = registerItems("tungsten_dust", new Item(new Item.Settings()));
    public static final Item ZINC_DUST = registerItems("zinc_dust", new Item(new Item.Settings()));
    /*------------------------------------------------------------------------------------------------------------------
    --------------------------------------------------WEAPON-BLADES-----------------------------------------------------
    ------------------------------------------------------------------------------------------------------------------*/
    // Battle Axe Heads
    public static final Item WOOD_BATTLEAXE_HEAD = registerItems("wood_battleaxe_head", new Item(new Item.Settings()));
    public static final Item STONE_BATTLEAXE_HEAD = registerItems("stone_battleaxe_head", new Item(new Item.Settings()));
    public static final Item GOLDEN_BATTLEAXE_HEAD = registerItems("golden_battleaxe_head", new Item(new Item.Settings()));
    public static final Item SILVER_BATTLEAXE_HEAD = registerItems("silver_battleaxe_head", new Item(new Item.Settings()));
    public static final Item COPPER_BATTLEAXE_HEAD = registerItems("copper_battleaxe_head", new Item(new Item.Settings()));
    public static final Item BRONZE_BATTLEAXE_HEAD = registerItems("bronze_battleaxe_head", new Item(new Item.Settings()));
    public static final Item PLATINUM_BATTLEAXE_HEAD = registerItems("platinum_battleaxe_head", new Item(new Item.Settings()));
    public static final Item BONE_BATTLEAXE_HEAD = registerItems("bone_battleaxe_head", new Item(new Item.Settings()));
    public static final Item IRON_BATTLEAXE_HEAD = registerItems("iron_battleaxe_head", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_BATTLEAXE_HEAD = registerItems("infernal_iron_battleaxe_head", new Item(new Item.Settings()));
    public static final Item COLD_IRON_BATTLEAXE_HEAD = registerItems("cold_iron_battleaxe_head", new Item(new Item.Settings()));
    public static final Item STEEL_BATTLEAXE_HEAD = registerItems("steel_battleaxe_head", new Item(new Item.Settings()));
    public static final Item DIAMOND_BATTLEAXE_HEAD = registerItems("diamond_battleaxe_head", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_BATTLEAXE_HEAD = registerItems("elven_steel_battleaxe_head", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_BATTLEAXE_HEAD = registerItems("dark_steel_battleaxe_head", new Item(new Item.Settings()));
    public static final Item NETHERITE_BATTLEAXE_HEAD = registerItems("netherite_battleaxe_head", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_BATTLEAXE_HEAD = registerItems("dragon_bone_battleaxe_head", new Item(new Item.Settings()));
    public static final Item PALLADIUM_BATTLEAXE_HEAD = registerItems("palladium_battleaxe_head", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_BATTLEAXE_HEAD = registerItems("tungsten_carbide_battleaxe_head", new Item(new Item.Settings()));
    public static final Item MITHRIL_BATTLEAXE_HEAD = registerItems("mithril_battleaxe_head", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_BATTLEAXE_HEAD = registerItems("adamantine_battleaxe_head", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_BATTLEAXE_HEAD = registerItems("shadow_adamantine_battleaxe_head", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_BATTLEAXE_HEAD = registerItems("adamantine_dragon_bone_battleaxe_head", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_BATTLEAXE_HEAD = registerItems("shadow_adamantine_dragon_bone_battleaxe_head", new Item(new Item.Settings()));
    // Divine is used for a base for ALL Divine weapons.
    // public static final Item DIVINE_BATTLEAXE_HEAD = registerItems("divine_battleaxe_head", new Item(new Item.Settings()));
    // Claymores
    public static final Item WOOD_CLAYMORE_BLADE = registerItems("wood_claymore_blade", new Item(new Item.Settings()));
    public static final Item STONE_CLAYMORE_BLADE = registerItems("stone_claymore_blade", new Item(new Item.Settings()));
    public static final Item GOLDEN_CLAYMORE_BLADE = registerItems("golden_claymore_blade", new Item(new Item.Settings()));
    public static final Item SILVER_CLAYMORE_BLADE = registerItems("silver_claymore_blade", new Item(new Item.Settings()));
    public static final Item COPPER_CLAYMORE_BLADE = registerItems("copper_claymore_blade", new Item(new Item.Settings()));
    public static final Item BRONZE_CLAYMORE_BLADE = registerItems("bronze_claymore_blade", new Item(new Item.Settings()));
    public static final Item PLATINUM_CLAYMORE_BLADE = registerItems("platinum_claymore_blade", new Item(new Item.Settings()));
    public static final Item BONE_CLAYMORE_BLADE = registerItems("bone_claymore_blade", new Item(new Item.Settings()));
    public static final Item IRON_CLAYMORE_BLADE = registerItems("iron_claymore_blade", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_CLAYMORE_BLADE = registerItems("infernal_iron_claymore_blade", new Item(new Item.Settings()));
    public static final Item COLD_IRON_CLAYMORE_BLADE = registerItems("cold_iron_claymore_blade", new Item(new Item.Settings()));
    public static final Item STEEL_CLAYMORE_BLADE = registerItems("steel_claymore_blade", new Item(new Item.Settings()));
    public static final Item DIAMOND_CLAYMORE_BLADE = registerItems("diamond_claymore_blade", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_CLAYMORE_BLADE = registerItems("elven_steel_claymore_blade", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_CLAYMORE_BLADE = registerItems("dark_steel_claymore_blade", new Item(new Item.Settings()));
    public static final Item NETHERITE_CLAYMORE_BLADE = registerItems("netherite_claymore_blade", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_CLAYMORE_BLADE = registerItems("dragon_bone_claymore_blade", new Item(new Item.Settings()));
    public static final Item PALLADIUM_CLAYMORE_BLADE = registerItems("palladium_claymore_blade", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_CLAYMORE_BLADE = registerItems("tungsten_carbide_claymore_blade", new Item(new Item.Settings()));
    public static final Item MITHRIL_CLAYMORE_BLADE = registerItems("mithril_claymore_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_CLAYMORE_BLADE = registerItems("adamantine_claymore_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_CLAYMORE_BLADE = registerItems("shadow_adamantine_claymore_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_CLAYMORE_BLADE = registerItems("adamantine_dragon_bone_claymore_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_CLAYMORE_BLADE = registerItems("shadow_adamantine_dragon_bone_claymore_blade", new Item(new Item.Settings()));
    // Divine is used for a base for ALL Divine weapons.
    // public static final Item DIVINE_CLAYMORE_BLADE = registerItems("divine_claymore_blade", new Item(new Item.Settings()));
    // Falchion Blades
    public static final Item WOOD_FALCHION_BLADE = registerItems("wood_falchion_blade", new Item(new Item.Settings()));
    public static final Item STONE_FALCHION_BLADE = registerItems("stone_falchion_blade", new Item(new Item.Settings()));
    public static final Item GOLDEN_FALCHION_BLADE = registerItems("golden_falchion_blade", new Item(new Item.Settings()));
    public static final Item SILVER_FALCHION_BLADE = registerItems("silver_falchion_blade", new Item(new Item.Settings()));
    public static final Item COPPER_FALCHION_BLADE = registerItems("copper_falchion_blade", new Item(new Item.Settings()));
    public static final Item BRONZE_FALCHION_BLADE = registerItems("bronze_falchion_blade", new Item(new Item.Settings()));
    public static final Item PLATINUM_FALCHION_BLADE = registerItems("platinum_falchion_blade", new Item(new Item.Settings()));
    public static final Item BONE_FALCHION_BLADE = registerItems("bone_falchion_blade", new Item(new Item.Settings()));
    public static final Item IRON_FALCHION_BLADE = registerItems("iron_falchion_blade", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_FALCHION_BLADE = registerItems("infernal_iron_falchion_blade", new Item(new Item.Settings()));
    public static final Item COLD_IRON_FALCHION_BLADE = registerItems("cold_iron_falchion_blade", new Item(new Item.Settings()));
    public static final Item STEEL_FALCHION_BLADE = registerItems("steel_falchion_blade", new Item(new Item.Settings()));
    public static final Item DIAMOND_FALCHION_BLADE = registerItems("diamond_falchion_blade", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_FALCHION_BLADE = registerItems("elven_steel_falchion_blade", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_FALCHION_BLADE = registerItems("dark_steel_falchion_blade", new Item(new Item.Settings()));
    public static final Item NETHERITE_FALCHION_BLADE = registerItems("netherite_falchion_blade", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_FALCHION_BLADE = registerItems("dragon_bone_falchion_blade", new Item(new Item.Settings()));
    public static final Item PALLADIUM_FALCHION_BLADE = registerItems("palladium_falchion_blade", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_FALCHION_BLADE = registerItems("tungsten_carbide_falchion_blade", new Item(new Item.Settings()));
    public static final Item MITHRIL_FALCHION_BLADE = registerItems("mithril_falchion_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_FALCHION_BLADE = registerItems("adamantine_falchion_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_FALCHION_BLADE = registerItems("shadow_adamantine_falchion_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_FALCHION_BLADE = registerItems("adamantine_dragon_bone_falchion_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_FALCHION_BLADE = registerItems("shadow_adamantine_dragon_bone_falchion_blade", new Item(new Item.Settings()));
    // Divine is used for a base for ALL Divine weapons.
    // public static final Item DIVINE_FALCHION_BLADE = registerItems("divine_falchion_blade", new Item(new Item.Settings()));
    // Glaive Blades
    public static final Item WOOD_GLAIVE_BLADE = registerItems("wood_glaive_blade", new Item(new Item.Settings()));
    public static final Item STONE_GLAIVE_BLADE = registerItems("stone_glaive_blade", new Item(new Item.Settings()));
    public static final Item GOLDEN_GLAIVE_BLADE = registerItems("golden_glaive_blade", new Item(new Item.Settings()));
    public static final Item SILVER_GLAIVE_BLADE = registerItems("silver_glaive_blade", new Item(new Item.Settings()));
    public static final Item COPPER_GLAIVE_BLADE = registerItems("copper_glaive_blade", new Item(new Item.Settings()));
    public static final Item BRONZE_GLAIVE_BLADE = registerItems("bronze_glaive_blade", new Item(new Item.Settings()));
    public static final Item PLATINUM_GLAIVE_BLADE = registerItems("platinum_glaive_blade", new Item(new Item.Settings()));
    public static final Item BONE_GLAIVE_BLADE = registerItems("bone_glaive_blade", new Item(new Item.Settings()));
    public static final Item IRON_GLAIVE_BLADE = registerItems("iron_glaive_blade", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_GLAIVE_BLADE = registerItems("infernal_iron_glaive_blade", new Item(new Item.Settings()));
    public static final Item COLD_IRON_GLAIVE_BLADE = registerItems("cold_iron_glaive_blade", new Item(new Item.Settings()));
    public static final Item STEEL_GLAIVE_BLADE = registerItems("steel_glaive_blade", new Item(new Item.Settings()));
    public static final Item DIAMOND_GLAIVE_BLADE = registerItems("diamond_glaive_blade", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_GLAIVE_BLADE = registerItems("elven_steel_glaive_blade", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_GLAIVE_BLADE = registerItems("dark_steel_glaive_blade", new Item(new Item.Settings()));
    public static final Item NETHERITE_GLAIVE_BLADE = registerItems("netherite_glaive_blade", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_GLAIVE_BLADE = registerItems("dragon_bone_glaive_blade", new Item(new Item.Settings()));
    public static final Item PALLADIUM_GLAIVE_BLADE = registerItems("palladium_glaive_blade", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_GLAIVE_BLADE = registerItems("tungsten_carbide_glaive_blade", new Item(new Item.Settings()));
    public static final Item MITHRIL_GLAIVE_BLADE = registerItems("mithril_glaive_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_GLAIVE_BLADE = registerItems("adamantine_glaive_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_GLAIVE_BLADE = registerItems("shadow_adamantine_glaive_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_GLAIVE_BLADE = registerItems("adamantine_dragon_bone_glaive_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_GLAIVE_BLADE = registerItems("shadow_adamantine_dragon_bone_glaive_blade", new Item(new Item.Settings()));
    // Divine is used for a base for ALL Divine weapons.
    // public static final Item DIVINE_GLAIVE_BLADE = registerItems("divine_glaive_blade", new Item(new Item.Settings()));
    // Halberd Blades
    public static final Item WOOD_HALBERD_BLADE = registerItems("wood_halberd_blade", new Item(new Item.Settings()));
    public static final Item STONE_HALBERD_BLADE = registerItems("stone_halberd_blade", new Item(new Item.Settings()));
    public static final Item GOLDEN_HALBERD_BLADE = registerItems("golden_halberd_blade", new Item(new Item.Settings()));
    public static final Item SILVER_HALBERD_BLADE = registerItems("silver_halberd_blade", new Item(new Item.Settings()));
    public static final Item COPPER_HALBERD_BLADE = registerItems("copper_halberd_blade", new Item(new Item.Settings()));
    public static final Item BRONZE_HALBERD_BLADE = registerItems("bronze_halberd_blade", new Item(new Item.Settings()));
    public static final Item PLATINUM_HALBERD_BLADE = registerItems("platinum_halberd_blade", new Item(new Item.Settings()));
    public static final Item BONE_HALBERD_BLADE = registerItems("bone_halberd_blade", new Item(new Item.Settings()));
    public static final Item IRON_HALBERD_BLADE = registerItems("iron_halberd_blade", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_HALBERD_BLADE = registerItems("infernal_iron_halberd_blade", new Item(new Item.Settings()));
    public static final Item COLD_IRON_HALBERD_BLADE = registerItems("cold_iron_halberd_blade", new Item(new Item.Settings()));
    public static final Item STEEL_HALBERD_BLADE = registerItems("steel_halberd_blade", new Item(new Item.Settings()));
    public static final Item DIAMOND_HALBERD_BLADE = registerItems("diamond_halberd_blade", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_HALBERD_BLADE = registerItems("elven_steel_halberd_blade", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_HALBERD_BLADE = registerItems("dark_steel_halberd_blade", new Item(new Item.Settings()));
    public static final Item NETHERITE_HALBERD_BLADE = registerItems("netherite_halberd_blade", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_HALBERD_BLADE = registerItems("dragon_bone_halberd_blade", new Item(new Item.Settings()));
    public static final Item PALLADIUM_HALBERD_BLADE = registerItems("palladium_halberd_blade", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_HALBERD_BLADE = registerItems("tungsten_carbide_halberd_blade", new Item(new Item.Settings()));
    public static final Item MITHRIL_HALBERD_BLADE = registerItems("mithril_halberd_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_HALBERD_BLADE = registerItems("adamantine_halberd_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_HALBERD_BLADE = registerItems("shadow_adamantine_halberd_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_HALBERD_BLADE = registerItems("adamantine_dragon_bone_halberd_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_HALBERD_BLADE = registerItems("shadow_adamantine_dragon_bone_halberd_blade", new Item(new Item.Settings()));
    // Divine is used for a base for ALL Divine weapons.
    // public static final Item DIVINE_HALBERD_BLADE = registerItems("divine_halberd_blade", new Item(new Item.Settings()));
    // Greatsword Blades
    public static final Item WOOD_GREATSWORD_BLADE = registerItems("wood_greatsword_blade", new Item(new Item.Settings()));
    public static final Item STONE_GREATSWORD_BLADE = registerItems("stone_greatsword_blade", new Item(new Item.Settings()));
    public static final Item GOLDEN_GREATSWORD_BLADE = registerItems("golden_greatsword_blade", new Item(new Item.Settings()));
    public static final Item SILVER_GREATSWORD_BLADE = registerItems("silver_greatsword_blade", new Item(new Item.Settings()));
    public static final Item COPPER_GREATSWORD_BLADE = registerItems("copper_greatsword_blade", new Item(new Item.Settings()));
    public static final Item BRONZE_GREATSWORD_BLADE = registerItems("bronze_greatsword_blade", new Item(new Item.Settings()));
    public static final Item PLATINUM_GREATSWORD_BLADE = registerItems("platinum_greatsword_blade", new Item(new Item.Settings()));
    public static final Item BONE_GREATSWORD_BLADE = registerItems("bone_greatsword_blade", new Item(new Item.Settings()));
    public static final Item IRON_GREATSWORD_BLADE = registerItems("iron_greatsword_blade", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_GREATSWORD_BLADE = registerItems("infernal_iron_greatsword_blade", new Item(new Item.Settings()));
    public static final Item COLD_IRON_GREATSWORD_BLADE = registerItems("cold_iron_greatsword_blade", new Item(new Item.Settings()));
    public static final Item STEEL_GREATSWORD_BLADE = registerItems("steel_greatsword_blade", new Item(new Item.Settings()));
    public static final Item DIAMOND_GREATSWORD_BLADE = registerItems("diamond_greatsword_blade", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_GREATSWORD_BLADE = registerItems("elven_steel_greatsword_blade", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_GREATSWORD_BLADE = registerItems("dark_steel_greatsword_blade", new Item(new Item.Settings()));
    public static final Item NETHERITE_GREATSWORD_BLADE = registerItems("netherite_greatsword_blade", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_GREATSWORD_BLADE = registerItems("dragon_bone_greatsword_blade", new Item(new Item.Settings()));
    public static final Item PALLADIUM_GREATSWORD_BLADE = registerItems("palladium_greatsword_blade", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_GREATSWORD_BLADE = registerItems("tungsten_carbide_greatsword_blade", new Item(new Item.Settings()));
    public static final Item MITHRIL_GREATSWORD_BLADE = registerItems("mithril_greatsword_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_GREATSWORD_BLADE = registerItems("adamantine_greatsword_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_GREATSWORD_BLADE = registerItems("shadow_adamantine_greatsword_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_GREATSWORD_BLADE = registerItems("adamantine_dragon_bone_greatsword_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_GREATSWORD_BLADE = registerItems("shadow_adamantine_dragon_bone_greatsword_blade", new Item(new Item.Settings()));
    // Divine is a placeholder for all Divine Greatswords.
    //public static final Item DIVINE_GREATSWORD_BLADE = registerItems("divine_greatsword_blade", new Item(new Item.Settings()));
    // Long spear Blades
    public static final Item WOOD_LONG_SPEAR_BLADE = registerItems("wood_long_spear_blade", new Item(new Item.Settings()));
    public static final Item STONE_LONG_SPEAR_BLADE = registerItems("stone_long_spear_blade", new Item(new Item.Settings()));
    public static final Item GOLDEN_LONG_SPEAR_BLADE = registerItems("golden_long_spear_blade", new Item(new Item.Settings()));
    public static final Item SILVER_LONG_SPEAR_BLADE = registerItems("silver_long_spear_blade", new Item(new Item.Settings()));
    public static final Item COPPER_LONG_SPEAR_BLADE = registerItems("copper_long_spear_blade", new Item(new Item.Settings()));
    public static final Item BRONZE_LONG_SPEAR_BLADE = registerItems("bronze_long_spear_blade", new Item(new Item.Settings()));
    public static final Item PLATINUM_LONG_SPEAR_BLADE = registerItems("platinum_long_spear_blade", new Item(new Item.Settings()));
    public static final Item BONE_LONG_SPEAR_BLADE = registerItems("bone_long_spear_blade", new Item(new Item.Settings()));
    public static final Item IRON_LONG_SPEAR_BLADE = registerItems("iron_long_spear_blade", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_LONG_SPEAR_BLADE = registerItems("infernal_iron_long_spear_blade", new Item(new Item.Settings()));
    public static final Item COLD_IRON_LONG_SPEAR_BLADE = registerItems("cold_iron_long_spear_blade", new Item(new Item.Settings()));
    public static final Item STEEL_LONG_SPEAR_BLADE = registerItems("steel_long_spear_blade", new Item(new Item.Settings()));
    public static final Item DIAMOND_LONG_SPEAR_BLADE = registerItems("diamond_long_spear_blade", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_LONG_SPEAR_BLADE = registerItems("elven_steel_long_spear_blade", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_LONG_SPEAR_BLADE = registerItems("dark_steel_long_spear_blade", new Item(new Item.Settings()));
    public static final Item NETHERITE_LONG_SPEAR_BLADE = registerItems("netherite_long_spear_blade", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_LONG_SPEAR_BLADE = registerItems("dragon_bone_long_spear_blade", new Item(new Item.Settings()));
    public static final Item PALLADIUM_LONG_SPEAR_BLADE = registerItems("palladium_long_spear_blade", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_LONG_SPEAR_BLADE = registerItems("tungsten_carbide_long_spear_blade", new Item(new Item.Settings()));
    public static final Item MITHRIL_LONG_SPEAR_BLADE = registerItems("mithril_long_spear_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_LONG_SPEAR_BLADE = registerItems("adamantine_long_spear_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_LONG_SPEAR_BLADE = registerItems("shadow_adamantine_long_spear_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_LONG_SPEAR_BLADE = registerItems("adamantine_dragon_bone_long_spear_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_LONG_SPEAR_BLADE = registerItems("shadow_adamantine_dragon_bone_long_spear_blade", new Item(new Item.Settings()));
    // Divine is a placeholder for all Divine Long Spears.
    //public static final Item DIVINE_LONG_SPEAR_BLADE = registerItems("divine_long_spear_blade", new Item(new Item.Settings()));
    // Mace Heads
    public static final Item WOOD_MACE_HEAD = registerItems("wood_mace_head", new Item(new Item.Settings()));
    public static final Item STONE_MACE_HEAD = registerItems("stone_mace_head", new Item(new Item.Settings()));
    public static final Item GOLDEN_MACE_HEAD = registerItems("golden_mace_head", new Item(new Item.Settings()));
    public static final Item SILVER_MACE_HEAD = registerItems("silver_mace_head", new Item(new Item.Settings()));
    public static final Item COPPER_MACE_HEAD = registerItems("copper_mace_head", new Item(new Item.Settings()));
    public static final Item BRONZE_MACE_HEAD = registerItems("bronze_mace_head", new Item(new Item.Settings()));
    public static final Item PLATINUM_MACE_HEAD = registerItems("platinum_mace_head", new Item(new Item.Settings()));
    public static final Item BONE_MACE_HEAD = registerItems("bone_mace_head", new Item(new Item.Settings()));
    public static final Item IRON_MACE_HEAD = registerItems("iron_mace_head", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_MACE_HEAD = registerItems("infernal_iron_mace_head", new Item(new Item.Settings()));
    public static final Item COLD_IRON_MACE_HEAD = registerItems("cold_iron_mace_head", new Item(new Item.Settings()));
    public static final Item STEEL_MACE_HEAD = registerItems("steel_mace_head", new Item(new Item.Settings()));
    public static final Item DIAMOND_MACE_HEAD = registerItems("diamond_mace_head", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_MACE_HEAD = registerItems("elven_steel_mace_head", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_MACE_HEAD = registerItems("dark_steel_mace_head", new Item(new Item.Settings()));
    public static final Item NETHERITE_MACE_HEAD = registerItems("netherite_mace_head", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_MACE_HEAD = registerItems("dragon_bone_mace_head", new Item(new Item.Settings()));
    public static final Item PALLADIUM_MACE_HEAD = registerItems("palladium_mace_head", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_MACE_HEAD = registerItems("tungsten_carbide_mace_head", new Item(new Item.Settings()));
    public static final Item MITHRIL_MACE_HEAD = registerItems("mithril_mace_head", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_MACE_HEAD = registerItems("adamantine_mace_head", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_MACE_HEAD = registerItems("shadow_adamantine_mace_head", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_MACE_HEAD = registerItems("adamantine_dragon_bone_mace_head", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_MACE_HEAD = registerItems("shadow_adamantine_dragon_bone_mace_head", new Item(new Item.Settings()));
    // Divine is a placeholder for all Divine Mace Heads.
    //public static final Item DIVINE_MACE_HEAD = registerItems("divine_mace_head", new Item(new Item.Settings()));
    // Pike Blades
    public static final Item WOOD_PIKE_BLADE = registerItems("wood_pike_blade", new Item(new Item.Settings()));
    public static final Item STONE_PIKE_BLADE = registerItems("stone_pike_blade", new Item(new Item.Settings()));
    public static final Item GOLDEN_PIKE_BLADE = registerItems("golden_pike_blade", new Item(new Item.Settings()));
    public static final Item SILVER_PIKE_BLADE = registerItems("silver_pike_blade", new Item(new Item.Settings()));
    public static final Item COPPER_PIKE_BLADE = registerItems("copper_pike_blade", new Item(new Item.Settings()));
    public static final Item BRONZE_PIKE_BLADE = registerItems("bronze_pike_blade", new Item(new Item.Settings()));
    public static final Item PLATINUM_PIKE_BLADE = registerItems("platinum_pike_blade", new Item(new Item.Settings()));
    public static final Item BONE_PIKE_BLADE = registerItems("bone_pike_blade", new Item(new Item.Settings()));
    public static final Item IRON_PIKE_BLADE = registerItems("iron_pike_blade", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_PIKE_BLADE = registerItems("infernal_iron_pike_blade", new Item(new Item.Settings()));
    public static final Item COLD_IRON_PIKE_BLADE = registerItems("cold_iron_pike_blade", new Item(new Item.Settings()));
    public static final Item STEEL_PIKE_BLADE = registerItems("steel_pike_blade", new Item(new Item.Settings()));
    public static final Item DIAMOND_PIKE_BLADE = registerItems("diamond_pike_blade", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_PIKE_BLADE = registerItems("elven_steel_pike_blade", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_PIKE_BLADE = registerItems("dark_steel_pike_blade", new Item(new Item.Settings()));
    public static final Item NETHERITE_PIKE_BLADE = registerItems("netherite_pike_blade", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_PIKE_BLADE = registerItems("dragon_bone_pike_blade", new Item(new Item.Settings()));
    public static final Item PALLADIUM_PIKE_BLADE = registerItems("palladium_pike_blade", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_PIKE_BLADE = registerItems("tungsten_carbide_pike_blade", new Item(new Item.Settings()));
    public static final Item MITHRIL_PIKE_BLADE = registerItems("mithril_pike_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_PIKE_BLADE = registerItems("adamantine_pike_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_PIKE_BLADE = registerItems("shadow_adamantine_pike_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_PIKE_BLADE = registerItems("adamantine_dragon_bone_pike_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_PIKE_BLADE = registerItems("shadow_adamantine_dragon_bone_pike_blade", new Item(new Item.Settings()));
    // Divine is a placeholder for all Divine Pike Blades.
    //public static final Item DIVINE_PIKE_BLADE = registerItems("divine_pike_blade", new Item(new Item.Settings()));
    // Scimitar Blades
    public static final Item WOOD_SCIMITAR_BLADE = registerItems("wood_scimitar_blade", new Item(new Item.Settings()));
    public static final Item STONE_SCIMITAR_BLADE = registerItems("stone_scimitar_blade", new Item(new Item.Settings()));
    public static final Item GOLDEN_SCIMITAR_BLADE = registerItems("golden_scimitar_blade", new Item(new Item.Settings()));
    public static final Item SILVER_SCIMITAR_BLADE = registerItems("silver_scimitar_blade", new Item(new Item.Settings()));
    public static final Item COPPER_SCIMITAR_BLADE = registerItems("copper_scimitar_blade", new Item(new Item.Settings()));
    public static final Item BRONZE_SCIMITAR_BLADE = registerItems("bronze_scimitar_blade", new Item(new Item.Settings()));
    public static final Item PLATINUM_SCIMITAR_BLADE = registerItems("platinum_scimitar_blade", new Item(new Item.Settings()));
    public static final Item BONE_SCIMITAR_BLADE = registerItems("bone_scimitar_blade", new Item(new Item.Settings()));
    public static final Item IRON_SCIMITAR_BLADE = registerItems("iron_scimitar_blade", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_SCIMITAR_BLADE = registerItems("infernal_iron_scimitar_blade", new Item(new Item.Settings()));
    public static final Item COLD_IRON_SCIMITAR_BLADE = registerItems("cold_iron_scimitar_blade", new Item(new Item.Settings()));
    public static final Item STEEL_SCIMITAR_BLADE = registerItems("steel_scimitar_blade", new Item(new Item.Settings()));
    public static final Item DIAMOND_SCIMITAR_BLADE = registerItems("diamond_scimitar_blade", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_SCIMITAR_BLADE = registerItems("elven_steel_scimitar_blade", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_SCIMITAR_BLADE = registerItems("dark_steel_scimitar_blade", new Item(new Item.Settings()));
    public static final Item NETHERITE_SCIMITAR_BLADE = registerItems("netherite_scimitar_blade", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_SCIMITAR_BLADE = registerItems("dragon_bone_scimitar_blade", new Item(new Item.Settings()));
    public static final Item PALLADIUM_SCIMITAR_BLADE = registerItems("palladium_scimitar_blade", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_SCIMITAR_BLADE = registerItems("tungsten_carbide_scimitar_blade", new Item(new Item.Settings()));
    public static final Item MITHRIL_SCIMITAR_BLADE = registerItems("mithril_scimitar_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_SCIMITAR_BLADE = registerItems("adamantine_scimitar_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_SCIMITAR_BLADE = registerItems("shadow_adamantine_scimitar_blade", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_SCIMITAR_BLADE = registerItems("adamantine_dragon_bone_scimitar_blade", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_SCIMITAR_BLADE = registerItems("shadow_adamantine_dragon_bone_scimitar_blade", new Item(new Item.Settings()));
    // Divine is a placeholder for all Divine Scimitar Blades.
    //public static final Item DIVINE_SCIMITAR_BLADE = registerItems("divine_scimitar_blade", new Item(new Item.Settings()));
    // Scythe Blades

    // Sickle Blades

    // Spear Heads
    public static final Item WOOD_SPEAR_HEAD = registerItems("wood_spear_head", new Item(new Item.Settings()));
    public static final Item STONE_SPEAR_HEAD = registerItems("stone_spear_head", new Item(new Item.Settings()));
    public static final Item GOLDEN_SPEAR_HEAD = registerItems("golden_spear_head", new Item(new Item.Settings()));
    public static final Item SILVER_SPEAR_HEAD = registerItems("silver_spear_head", new Item(new Item.Settings()));
    public static final Item COPPER_SPEAR_HEAD = registerItems("copper_spear_head", new Item(new Item.Settings()));
    public static final Item BRONZE_SPEAR_HEAD = registerItems("bronze_spear_head", new Item(new Item.Settings()));
    public static final Item PLATINUM_SPEAR_HEAD = registerItems("platinum_spear_head", new Item(new Item.Settings()));
    public static final Item BONE_SPEAR_HEAD = registerItems("bone_spear_head", new Item(new Item.Settings()));
    public static final Item IRON_SPEAR_HEAD = registerItems("iron_spear_head", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_SPEAR_HEAD = registerItems("infernal_iron_spear_head", new Item(new Item.Settings()));
    public static final Item COLD_IRON_SPEAR_HEAD = registerItems("cold_iron_spear_head", new Item(new Item.Settings()));
    public static final Item STEEL_SPEAR_HEAD = registerItems("steel_spear_head", new Item(new Item.Settings()));
    public static final Item DIAMOND_SPEAR_HEAD = registerItems("diamond_spear_head", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_SPEAR_HEAD = registerItems("elven_steel_spear_head", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_SPEAR_HEAD = registerItems("dark_steel_spear_head", new Item(new Item.Settings()));
    public static final Item NETHERITE_SPEAR_HEAD = registerItems("netherite_spear_head", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_SPEAR_HEAD = registerItems("dragon_bone_spear_head", new Item(new Item.Settings()));
    public static final Item PALLADIUM_SPEAR_HEAD = registerItems("palladium_spear_head", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_SPEAR_HEAD = registerItems("tungsten_carbide_spear_head", new Item(new Item.Settings()));
    public static final Item MITHRIL_SPEAR_HEAD = registerItems("mithril_spear_head", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_SPEAR_HEAD = registerItems("adamantine_spear_head", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_SPEAR_HEAD = registerItems("shadow_adamantine_spear_head", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_SPEAR_HEAD = registerItems("adamantine_dragon_bone_spear_head", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_SPEAR_HEAD = registerItems("shadow_adamantine_dragon_bone_spear_head", new Item(new Item.Settings()));
    // Divine is a placeholder for all Divine Spear Heads.
    //public static final Item DIVINE_SPEAR_HEAD = registerItems("divine_spear_head", new Item(new Item.Settings()));
    // Trident Forks
    public static final Item WOOD_TRIDENT_FORK = registerItems("wood_trident_fork", new Item(new Item.Settings()));
    public static final Item STONE_TRIDENT_FORK = registerItems("stone_trident_fork", new Item(new Item.Settings()));
    public static final Item GOLDEN_TRIDENT_FORK = registerItems("golden_trident_fork", new Item(new Item.Settings()));
    public static final Item SILVER_TRIDENT_FORK = registerItems("silver_trident_fork", new Item(new Item.Settings()));
    public static final Item COPPER_TRIDENT_FORK = registerItems("copper_trident_fork", new Item(new Item.Settings()));
    public static final Item BRONZE_TRIDENT_FORK = registerItems("bronze_trident_fork", new Item(new Item.Settings()));
    public static final Item PLATINUM_TRIDENT_FORK = registerItems("platinum_trident_fork", new Item(new Item.Settings()));
    public static final Item BONE_TRIDENT_FORK = registerItems("bone_trident_fork", new Item(new Item.Settings()));
    public static final Item IRON_TRIDENT_FORK = registerItems("iron_trident_fork", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_TRIDENT_FORK = registerItems("infernal_iron_trident_fork", new Item(new Item.Settings()));
    public static final Item COLD_IRON_TRIDENT_FORK = registerItems("cold_iron_trident_fork", new Item(new Item.Settings()));
    public static final Item STEEL_TRIDENT_FORK = registerItems("steel_trident_fork", new Item(new Item.Settings()));
    public static final Item DIAMOND_TRIDENT_FORK = registerItems("diamond_trident_fork", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_TRIDENT_FORK = registerItems("elven_steel_trident_fork", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_TRIDENT_FORK = registerItems("dark_steel_trident_fork", new Item(new Item.Settings()));
    public static final Item NETHERITE_TRIDENT_FORK = registerItems("netherite_trident_fork", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_TRIDENT_FORK = registerItems("dragon_bone_trident_fork", new Item(new Item.Settings()));
    public static final Item PALLADIUM_TRIDENT_FORK = registerItems("palladium_trident_fork", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_TRIDENT_FORK = registerItems("tungsten_carbide_trident_fork", new Item(new Item.Settings()));
    public static final Item MITHRIL_TRIDENT_FORK = registerItems("mithril_trident_fork", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_TRIDENT_FORK = registerItems("adamantine_trident_fork", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_TRIDENT_FORK = registerItems("shadow_adamantine_trident_fork", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_TRIDENT_FORK = registerItems("adamantine_dragon_bone_trident_fork", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_TRIDENT_FORK = registerItems("shadow_adamantine_dragon_bone_trident_fork", new Item(new Item.Settings()));
    // Divine is a placeholder for all Divine Trident Forks.
    //public static final Item DIVINE_TRIDENT_FORK = registerItems("divine_trident_fork", new Item(new Item.Settings()));
    // Warhammer Heads
    public static final Item WOOD_WARHAMMER_HEAD = registerItems("wood_warhammer_head", new Item(new Item.Settings()));
    public static final Item STONE_WARHAMMER_HEAD = registerItems("stone_warhammer_head", new Item(new Item.Settings()));
    public static final Item GOLDEN_WARHAMMER_HEAD = registerItems("golden_warhammer_head", new Item(new Item.Settings()));
    public static final Item SILVER_WARHAMMER_HEAD = registerItems("silver_warhammer_head", new Item(new Item.Settings()));
    public static final Item COPPER_WARHAMMER_HEAD = registerItems("copper_warhammer_head", new Item(new Item.Settings()));
    public static final Item BRONZE_WARHAMMER_HEAD = registerItems("bronze_warhammer_head", new Item(new Item.Settings()));
    public static final Item PLATINUM_WARHAMMER_HEAD = registerItems("platinum_warhammer_head", new Item(new Item.Settings()));
    public static final Item BONE_WARHAMMER_HEAD = registerItems("bone_warhammer_head", new Item(new Item.Settings()));
    public static final Item IRON_WARHAMMER_HEAD = registerItems("iron_warhammer_head", new Item(new Item.Settings()));
    public static final Item INFERNAL_IRON_WARHAMMER_HEAD = registerItems("infernal_iron_warhammer_head", new Item(new Item.Settings()));
    public static final Item COLD_IRON_WARHAMMER_HEAD = registerItems("cold_iron_warhammer_head", new Item(new Item.Settings()));
    public static final Item STEEL_WARHAMMER_HEAD = registerItems("steel_warhammer_head", new Item(new Item.Settings()));
    public static final Item DIAMOND_WARHAMMER_HEAD = registerItems("diamond_warhammer_head", new Item(new Item.Settings()));
    public static final Item ELVEN_STEEL_WARHAMMER_HEAD = registerItems("elven_steel_warhammer_head", new Item(new Item.Settings()));
    public static final Item DARK_STEEL_WARHAMMER_HEAD = registerItems("dark_steel_warhammer_head", new Item(new Item.Settings()));
    public static final Item NETHERITE_WARHAMMER_HEAD = registerItems("netherite_warhammer_head", new Item(new Item.Settings()));
    public static final Item DRAGON_BONE_WARHAMMER_HEAD = registerItems("dragon_bone_warhammer_head", new Item(new Item.Settings()));
    public static final Item PALLADIUM_WARHAMMER_HEAD = registerItems("palladium_warhammer_head", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_CARBIDE_WARHAMMER_HEAD = registerItems("tungsten_carbide_warhammer_head", new Item(new Item.Settings()));
    public static final Item MITHRIL_WARHAMMER_HEAD = registerItems("mithril_warhammer_head", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_WARHAMMER_HEAD = registerItems("adamantine_warhammer_head", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_WARHAMMER_HEAD = registerItems("shadow_adamantine_warhammer_head", new Item(new Item.Settings()));
    public static final Item ADAMANTINE_DRAGON_BONE_WARHAMMER_HEAD = registerItems("adamantine_dragon_bone_warhammer_head", new Item(new Item.Settings()));
    public static final Item SHADOW_ADAMANTINE_DRAGON_BONE_WARHAMMER_HEAD = registerItems("shadow_adamantine_dragon_bone_warhammer_head", new Item(new Item.Settings()));
    // Divine is a placeholder for all Divine Warhammer Heads.
    //public static final Item DIVINE_WARHAMMER_HEAD = registerItems("divine_warhammer_head", new Item(new Item.Settings()));


    protected static Item registerItems(String id, Item newItem) {
        Item item = Registry.register(Registries.ITEM, DragonsHoardWA.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(item));
        return item;
    }

    public static void register() {
        DragonsHoardWA.LOGGER.info("Registering Items from the Dragon's Hoard!");
    }
}
