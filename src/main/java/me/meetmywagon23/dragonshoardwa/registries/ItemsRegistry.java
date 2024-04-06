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
    // Withered Ribcage & Ribcage. rename later.
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
    public static final Item STARFALL_DUST = registerItems("starfall_dust", new Item(new Item.Settings()));
    public static final Item STEEL_DUST = registerItems("steel_dust", new Item(new Item.Settings()));
    public static final Item TIN_DUST = registerItems("tin_dust", new Item(new Item.Settings()));
    public static final Item TITANIUM_DUST = registerItems("titanium_dust", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_DUST = registerItems("tungsten_dust", new Item(new Item.Settings()));
    public static final Item ZINC_DUST = registerItems("zinc_dust", new Item(new Item.Settings()));
    /*------------------------------------------------------------------------------------------------------------------
    --------------------------------------------------WEAPON_TEMPLATES--------------------------------------------------
    ------------------------------------------------------------------------------------------------------------------*/
    // Templates
    // Battle Axe Heads
    public static final Item BATTLEAXE_HEAD_TEMPLATE = registerItems("battleaxe_head_template", new Item(new Item.Settings()));
    // Claymores
    public static final Item CLAYMORE_BLADE_TEMPLATE = registerItems("claymore_blade_template", new Item(new Item.Settings()));
    // Falchion Blades
    public static final Item FALCHION_BLADE_TEMPLATE = registerItems("falchion_blade_template", new Item(new Item.Settings()));
    // Glaive Blades
    public static final Item GLAIVE_BLADE_TEMPLATE = registerItems("glaive_blade_template", new Item(new Item.Settings()));
    // Halberd Blades
    public static final Item HALBERD_BLADE_TEMPLATE = registerItems("halberd_blade_template", new Item(new Item.Settings()));
    // Greatsword Blades
    public static final Item GREATSWORD_BLADE_TEMPLATE = registerItems("greatsword_blade_template", new Item(new Item.Settings()));
    // Long spear Blades
    public static final Item LONG_SPEAR_BLADE_TEMPLATE = registerItems("long_spear_blade_template", new Item(new Item.Settings()));
    // Mace Heads
    public static final Item MACE_HEAD_TEMPLATE = registerItems("mace_head_template", new Item(new Item.Settings()));
    // Pike Blades
    public static final Item PIKE_BLADE_TEMPLATE = registerItems("pike_blade_template", new Item(new Item.Settings()));
    // Scimitar Blades
    public static final Item SCIMITAR_BLADE_TEMPLATE = registerItems("scimitar_blade_template", new Item(new Item.Settings()));
    // Scythe Blades
    //  Not Needed
    // Sickle Blades
    //  Not Needed
    // Spear Heads
    public static final Item SPEAR_HEAD_TEMPLATE = registerItems("spear_head_template", new Item(new Item.Settings()));
    // Trident Forks
    public static final Item TRIDENT_FORK_TEMPLATE = registerItems("trident_fork_template", new Item(new Item.Settings()));
    // Warhammer Heads
    public static final Item WARHAMMER_HEAD_TEMPLATE = registerItems("warhammer_head_template", new Item(new Item.Settings()));


    protected static Item registerItems(String id, Item newItem) {
        Item item = Registry.register(Registries.ITEM, DragonsHoardWA.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(item));
        return item;
    }

    public static void register() {
        DragonsHoardWA.LOGGER.info("Registering Items from the Dragon's Hoard!");
    }
}
