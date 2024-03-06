package me.meetmywagon23.dragonshoardwa.registries;

import me.meetmywagon23.dragonshoardwa.DragonsHoardWA;
import me.meetmywagon23.dragonshoardwa.materials.DragonsHoardWAToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ToolsRegistry {
    public static final PickaxeItem SILVER_PICKAXE = registerPickaxeItem("silver_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.SILVER, 1, -2.8f, new Item.Settings()));
    public static final AxeItem SILVER_AXE = registerAxeItem("silver_axe", new AxeItem(DragonsHoardWAToolMaterials.SILVER, 6f, -1.5f, new Item.Settings()));
    public static final ShovelItem SILVER_SHOVEL = registerShovelItem("silver_shovel", new ShovelItem(DragonsHoardWAToolMaterials.SILVER, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem SILVER_HOE = registerHoeItem("silver_hoe", new HoeItem(DragonsHoardWAToolMaterials.SILVER, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem COPPER_PICKAXE = registerPickaxeItem("copper_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.COPPER, 1, -2.8f, new Item.Settings()));
    public static final AxeItem COPPER_AXE = registerAxeItem("copper_axe", new AxeItem(DragonsHoardWAToolMaterials.COPPER, 6f, -1.5f, new Item.Settings()));
    public static final ShovelItem COPPER_SHOVEL = registerShovelItem("copper_shovel", new ShovelItem(DragonsHoardWAToolMaterials.COPPER, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem COPPER_HOE = registerHoeItem("copper_hoe", new HoeItem(DragonsHoardWAToolMaterials.COPPER, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem BRONZE_PICKAXE = registerPickaxeItem("bronze_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.BRONZE, 1, -2.8f, new Item.Settings()));
    public static final AxeItem BRONZE_AXE = registerAxeItem("bronze_axe", new AxeItem(DragonsHoardWAToolMaterials.BRONZE, 6f, -1.5f, new Item.Settings()));
    public static final ShovelItem BRONZE_SHOVEL = registerShovelItem("bronze_shovel", new ShovelItem(DragonsHoardWAToolMaterials.BRONZE, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem BRONZE_HOE = registerHoeItem("bronze_hoe", new HoeItem(DragonsHoardWAToolMaterials.BRONZE, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem PLATINUM_PICKAXE = registerPickaxeItem("platinum_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.PLATINUM, 1, -2.8f, new Item.Settings()));
    public static final AxeItem PLATINUM_AXE = registerAxeItem("platinum_axe", new AxeItem(DragonsHoardWAToolMaterials.PLATINUM, 6f, -1.5f, new Item.Settings()));
    public static final ShovelItem PLATINUM_SHOVEL = registerShovelItem("platinum_shovel", new ShovelItem(DragonsHoardWAToolMaterials.PLATINUM, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem PLATINUM_HOE = registerHoeItem("platinum_hoe", new HoeItem(DragonsHoardWAToolMaterials.PLATINUM, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem BONE_PICKAXE = registerPickaxeItem("bone_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.BONE, 1, -2.8f, new Item.Settings()));
    public static final AxeItem BONE_AXE = registerAxeItem("bone_axe", new AxeItem(DragonsHoardWAToolMaterials.BONE, 7f, -1.5f, new Item.Settings()));
    public static final ShovelItem BONE_SHOVEL = registerShovelItem("bone_shovel", new ShovelItem(DragonsHoardWAToolMaterials.BONE, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem BONE_HOE = registerHoeItem("bone_hoe", new HoeItem(DragonsHoardWAToolMaterials.BONE, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem INFERNAL_IRON_PICKAXE = registerPickaxeItem("infernal_iron_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 1, -2.8f, new Item.Settings()));
    public static final AxeItem INFERNAL_IRON_AXE = registerAxeItem("infernal_iron_axe", new AxeItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 7f, -1.5f, new Item.Settings()));
    public static final ShovelItem INFERNAL_IRON_SHOVEL = registerShovelItem("infernal_iron_shovel", new ShovelItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem INFERNAL_IRON_HOE = registerHoeItem("infernal_iron_hoe", new HoeItem(DragonsHoardWAToolMaterials.INFERNAL_IRON, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem COLD_IRON_PICKAXE = registerPickaxeItem("cold_iron_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.COLD_IRON, 1, -2.8f, new Item.Settings()));
    public static final AxeItem COLD_IRON_AXE = registerAxeItem("cold_iron_axe", new AxeItem(DragonsHoardWAToolMaterials.COLD_IRON, 7f, -1.5f, new Item.Settings()));
    public static final ShovelItem COLD_IRON_SHOVEL = registerShovelItem("cold_iron_shovel", new ShovelItem(DragonsHoardWAToolMaterials.COLD_IRON, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem COLD_IRON_HOE = registerHoeItem("cold_iron_hoe", new HoeItem(DragonsHoardWAToolMaterials.COLD_IRON, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem STEEL_PICKAXE = registerPickaxeItem("steel_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.STEEL, 1, -2.8f, new Item.Settings()));
    public static final AxeItem STEEL_AXE = registerAxeItem("steel_axe", new AxeItem(DragonsHoardWAToolMaterials.STEEL, 8f, -1.5f, new Item.Settings()));
    public static final ShovelItem STEEL_SHOVEL = registerShovelItem("steel_shovel", new ShovelItem(DragonsHoardWAToolMaterials.STEEL, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem STEEL_HOE = registerHoeItem("steel_hoe", new HoeItem(DragonsHoardWAToolMaterials.STEEL, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem ELVEN_STEEL_PICKAXE = registerPickaxeItem("elven_steel_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 1, -2.8f, new Item.Settings()));
    public static final AxeItem ELVEN_STEEL_AXE = registerAxeItem("elven_steel_axe", new AxeItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 8f, -1.5f, new Item.Settings()));
    public static final ShovelItem ELVEN_STEEL_SHOVEL = registerShovelItem("elven_steel_shovel", new ShovelItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem ELVEN_STEEL_HOE = registerHoeItem("elven_steel_hoe", new HoeItem(DragonsHoardWAToolMaterials.ELVEN_STEEL, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem DARK_STEEL_PICKAXE = registerPickaxeItem("dark_steel_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.DARK_STEEL, 1, -2.8f, new Item.Settings()));
    public static final AxeItem DARK_STEEL_AXE = registerAxeItem("dark_steel_axe", new AxeItem(DragonsHoardWAToolMaterials.DARK_STEEL, 8f, -1.5f, new Item.Settings()));
    public static final ShovelItem DARK_STEEL_SHOVEL = registerShovelItem("dark_steel_shovel", new ShovelItem(DragonsHoardWAToolMaterials.DARK_STEEL, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem DARK_STEEL_HOE = registerHoeItem("dark_steel_hoe", new HoeItem(DragonsHoardWAToolMaterials.DARK_STEEL, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem DRAGON_BONE_PICKAXE = registerPickaxeItem("dragon_bone_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 1, -2.8f, new Item.Settings()));
    public static final AxeItem DRAGON_BONE_AXE = registerAxeItem("dragon_bone_axe", new AxeItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 9f, -1.5f, new Item.Settings()));
    public static final ShovelItem DRAGON_BONE_SHOVEL = registerShovelItem("dragon_bone_shovel", new ShovelItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem DRAGON_BONE_HOE = registerHoeItem("dragon_bone_hoe", new HoeItem(DragonsHoardWAToolMaterials.DRAGON_BONE, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem PALLADIUM_PICKAXE = registerPickaxeItem("palladium_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.PALLADIUM, 1, -2.8f, new Item.Settings()));
    public static final AxeItem PALLADIUM_AXE = registerAxeItem("palladium_axe", new AxeItem(DragonsHoardWAToolMaterials.PALLADIUM, 10f, -1.5f, new Item.Settings()));
    public static final ShovelItem PALLADIUM_SHOVEL = registerShovelItem("palladium_shovel", new ShovelItem(DragonsHoardWAToolMaterials.PALLADIUM, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem PALLADIUM_HOE = registerHoeItem("palladium_hoe", new HoeItem(DragonsHoardWAToolMaterials.PALLADIUM, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem TUNGSTEN_CARBIDE_PICKAXE = registerPickaxeItem("tungsten_carbide_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 1, -2.8f, new Item.Settings()));
    public static final AxeItem TUNGSTEN_CARBIDE_AXE = registerAxeItem("tungsten_carbide_axe", new AxeItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 11f, -1.5f, new Item.Settings()));
    public static final ShovelItem TUNGSTEN_CARBIDE_SHOVEL = registerShovelItem("tungsten_carbide_shovel", new ShovelItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 1f, -3.0f, new Item.Settings()));
    public static final HoeItem TUNGSTEN_CARBIDE_HOE = registerHoeItem("tungsten_carbide_hoe", new HoeItem(DragonsHoardWAToolMaterials.TUNGSTEN_CARBIDE, 1, 0.0f, new Item.Settings()));

    public static final PickaxeItem MITHRIL_PICKAXE = registerPickaxeItem("mithril_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.MITHRIL, 1, -2.8f, new Item.Settings()));
    public static final AxeItem MITHRIL_AXE = registerAxeItem("mithril_axe", new AxeItem(DragonsHoardWAToolMaterials.MITHRIL, 12f, -1.5f, new Item.Settings()));
    public static final ShovelItem MITHRIL_SHOVEL = registerShovelItem("mithril_shovel", new ShovelItem(DragonsHoardWAToolMaterials.MITHRIL, 1f, -3.0f, new Item.Settings()));
    public static final HoeItem MITHRIL_HOE = registerHoeItem("mithril_hoe", new HoeItem(DragonsHoardWAToolMaterials.MITHRIL, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem ADAMANTINE_PICKAXE = registerPickaxeItem("adamantine_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.ADAMANTINE, 2, -2.8f, new Item.Settings()));
    public static final AxeItem ADAMANTINE_AXE = registerAxeItem("adamantine_axe", new AxeItem(DragonsHoardWAToolMaterials.ADAMANTINE, 8f, -1.5f, new Item.Settings()));
    public static final ShovelItem ADAMANTINE_SHOVEL = registerShovelItem("adamantine_shovel", new ShovelItem(DragonsHoardWAToolMaterials.ADAMANTINE, 13f, 3.0f, new Item.Settings()));
    public static final HoeItem ADAMANTINE_HOE = registerHoeItem("adamantine_hoe", new HoeItem(DragonsHoardWAToolMaterials.ADAMANTINE, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem SHADOW_ADAMANTINE_PICKAXE = registerPickaxeItem("shadow_adamantine_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 2, -2.8f, new Item.Settings()));
    public static final AxeItem SHADOW_ADAMANTINE_AXE = registerAxeItem("shadow_adamantine_axe", new AxeItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 8f, -1.5f, new Item.Settings()));
    public static final ShovelItem SHADOW_ADAMANTINE_SHOVEL = registerShovelItem("shadow_adamantine_shovel", new ShovelItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 13f, 3.0f, new Item.Settings()));
    public static final HoeItem SHADOW_ADAMANTINE_HOE = registerHoeItem("shadow_adamantine_hoe", new HoeItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem ADAMANTINE_DRAGON_BONE_PICKAXE = registerPickaxeItem("adamantine_dragon_bone_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.ADAMANTINE_DRAGON_BONE, 2, -2.8f, new Item.Settings()));
    public static final AxeItem ADAMANTINE_DRAGON_BONE_AXE = registerAxeItem("adamantine_dragon_bone_axe", new AxeItem(DragonsHoardWAToolMaterials.ADAMANTINE_DRAGON_BONE, 14f, -1.5f, new Item.Settings()));
    public static final ShovelItem ADAMANTINE_DRAGON_BONE_SHOVEL = registerShovelItem("adamantine_dragon_bone_shovel", new ShovelItem(DragonsHoardWAToolMaterials.ADAMANTINE_DRAGON_BONE, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem ADAMANTINE_DRAGON_BONE_HOE = registerHoeItem("adamantine_dragon_bone_hoe", new HoeItem(DragonsHoardWAToolMaterials.ADAMANTINE_DRAGON_BONE, 1, -0.0f, new Item.Settings()));

    public static final PickaxeItem SHADOW_ADAMANTINE_DRAGON_BONE_PICKAXE = registerPickaxeItem("shadow_adamantine_dragon_bone_pickaxe", new PickaxeItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE_DRAGON_BONE, 2, -2.8f, new Item.Settings()));
    public static final AxeItem SHADOW_ADAMANTINE_DRAGON_BONE_AXE = registerAxeItem("shadow_adamantine_dragon_bone_axe", new AxeItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE_DRAGON_BONE, 14f, -1.5f, new Item.Settings()));
    public static final ShovelItem SHADOW_ADAMANTINE_DRAGON_BONE_SHOVEL = registerShovelItem("shadow_adamantine_dragon_bone_shovel", new ShovelItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE_DRAGON_BONE, 1f, 3.0f, new Item.Settings()));
    public static final HoeItem SHADOW_ADAMANTINE_DRAGON_BONE_HOE = registerHoeItem("shadow_adamantine_dragon_bone_hoe", new HoeItem(DragonsHoardWAToolMaterials.SHADOW_ADAMANTINE_DRAGON_BONE, 1, -0.0f, new Item.Settings()));

    // Divine Equipment sets goes here----\/
    // public static final PickaxeItem PICKAXE_NAME = registerPickaxeItem("name", new PickaxeItem(DragonsHoardToolMaterials.DIVINE, 2, -2.8f, new Item.Settings()));
    // public static final AxeItem AXE_NAME = registerAxeItem("name", new AxeItem(DragonsHoardToolMaterials.DIVINE, 15f, -1.5f, new Item.Settings()));
    // public static final ShovelItem SHOVEL_NAME = registerShovelItem("name", new ShovelItem(DragonsHoardToolMaterials.DIVINE, 1f, 3.0f, new Item.Settings()));
    // public static final HoeItem HOE_NAME = registerHoeItem("name", new HoeItem(DragonsHoardToolMaterials.DIVINE, 1, -0.0f, new Item.Settings()));

    protected static PickaxeItem registerPickaxeItem(String id, PickaxeItem newItem) {
        PickaxeItem pickaxeItem = Registry.register(Registries.ITEM, DragonsHoardWA.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(pickaxeItem));
        return pickaxeItem;
    }
    protected static AxeItem registerAxeItem(String id, AxeItem newItem) {
        AxeItem axeItem = Registry.register(Registries.ITEM, DragonsHoardWA.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(axeItem));
        return axeItem;
    }
    protected static ShovelItem registerShovelItem(String id, ShovelItem newItem) {
        ShovelItem shovelItem = Registry.register(Registries.ITEM, DragonsHoardWA.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(shovelItem));
        return shovelItem;
    }
    protected static HoeItem registerHoeItem(String id, HoeItem newItem) {
        HoeItem hoeItem = Registry.register(Registries.ITEM, DragonsHoardWA.ID(id), newItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroupRegistry.DRAGONSHOARD_WA).register(entries -> entries.add(hoeItem));
        return hoeItem;
    }
    
    public static void register() {
        DragonsHoardWA.LOGGER.info("Registering Tools from the Dragon's Hoard!");
    }
}
