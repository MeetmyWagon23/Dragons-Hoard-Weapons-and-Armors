package me.meetmywagon23.dragonshoardwa.datagen;

import me.meetmywagon23.dragonshoardwa.registries.ItemsRegistry;
import me.meetmywagon23.dragonshoardwa.registries.ToolsRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class DragonsHoardWAModelProvider extends FabricModelProvider {
    public DragonsHoardWAModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemsRegistry.COPPER_COIN, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.COPPER_COIN_FIVE_STACK, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.COPPER_COIN_TEN_STACK, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SILVER_COIN, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SILVER_COIN_FIVE_STACK, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SILVER_COIN_TEN_STACK, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.GOLD_COIN, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.GOLD_COIN_FIVE_STACK, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.GOLD_COIN_TEN_STACK, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PLATINUM_COIN, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PLATINUM_COIN_FIVE_STACK, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PLATINUM_COIN_TEN_STACK, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.LIGHT_ARMOR_MESH, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.WITHER_BONE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.BONE_BLIGHT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SKELETON_RIBCAGE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.WITHER_SKELETON_RIBCAGE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SKELETON_PELVIS, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.WITHER_SKELETON_PELVIS, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.DRAGON_SCALE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.DRAGON_BONE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.DIVINE_CATALYST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ANCIENT_ICE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_ADAMANT_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ADAMANTINE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ADAMANTINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ADAMANTINE_COATED_DRAGON_BONE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ADAMANTINE_COATED_DRAGON_SCALE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PRISTINE_ADAMANTINE_COATED_DRAGON_BONE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PRISTINE_ADAMANTINE_COATED_DRAGON_SCALE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_ALUMINUM, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ALUMINUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ALUMINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_BRASS, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.BRASS_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.BRASS_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_BRONZE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.BRONZE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_COLD_IRON, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.COLD_IRON_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.COLD_IRON_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.COPPER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.DARK_STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.DARK_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_ELECTRUM, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ELECTRUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ELECTRUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_ELVEN_STEEL, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ELVEN_STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ELVEN_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_INFERNAL_IRON, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_INFERNAL_SLIVER, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.INFERNAL_IRON_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.INFERNAL_IRON_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_ITANIUM, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ITANIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.LEAD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_MITHRIL, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.MITHRIL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.MITHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_NICKEL_ZINC, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.NICKEL_ZINC_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.NICKEL_ZINC_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_PALLADIUM, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PALLADIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PALLADIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PLATINUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PURE_CARBON, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_SHADOW_ADAMANT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SHADOW_ADAMANTINE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SHADOW_ADAMANTINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SHADOW_ADAMANTINE_COATED_DRAGON_BONE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SHADOW_ADAMANTINE_COATED_DRAGON_SCALE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PRISTINE_SHADOW_ADAMANTINE_COATED_DRAGON_BONE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PRISTINE_SHADOW_ADAMANTINE_COATED_DRAGON_SCALE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SILVER_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_STARFALL_ORE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_STEEL, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.TIN_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.TITANIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_TUNGSTEN, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.TUNGSTEN_CARBIDE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.TUNGSTEN_CARBIDE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.RAW_ZINC, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ZINC_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ZINC_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ADAMANT_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ADAMANTINE_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ALUMINUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ARANDUR_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.BRASS_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.BRONZE_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.COAL_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.COLD_IRON_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.COPPER_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.DARK_STEEL_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.DIAMOND_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ELECTRUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ELVEN_STEEL_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.GLACIAL_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.GOLD_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.INFERNAL_IRON_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.IRON_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ITANIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.LEAD_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.MITHRIL_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.NETHERITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.NICKEL_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PALLADIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.PLATINUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SHADOW_ADAMANTINE_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SILVER_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.STARFALL_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.STEEL_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.TIN_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.TITANIUM_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.TUNGSTEN_DUST, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.ZINC_DUST, Models.GENERATED);

        itemModelGenerator.register(ToolsRegistry.ADAMANTINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ADAMANTINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ADAMANTINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ADAMANTINE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ADAMANTINE_DRAGON_BONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ADAMANTINE_DRAGON_BONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ADAMANTINE_DRAGON_BONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ADAMANTINE_DRAGON_BONE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.BONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.BONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.BONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.BONE_HOE, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.BRASS_PICKAXE, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.BRASS_AXE, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.BRASS_SHOVEL, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.BRASS_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.BRONZE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.COLD_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.COLD_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.COLD_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.COLD_IRON_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.DARK_STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.DARK_STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.DARK_STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.DARK_STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.DRAGON_BONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.DRAGON_BONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.DRAGON_BONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.DRAGON_BONE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ELVEN_STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ELVEN_STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ELVEN_STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.ELVEN_STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.INFERNAL_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.INFERNAL_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.INFERNAL_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.INFERNAL_IRON_HOE, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.ITANIUM_PICKAXE, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.ITANIUM_AXE, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.ITANIUM_SHOVEL, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.ITANIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.MITHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.MITHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.MITHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.MITHRIL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.PALLADIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.PALLADIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.PALLADIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.PALLADIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.PLATINUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.PLATINUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.PLATINUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.PLATINUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SHADOW_ADAMANTINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SHADOW_ADAMANTINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SHADOW_ADAMANTINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SHADOW_ADAMANTINE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SILVER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SILVER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SILVER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.SILVER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.STEEL_HOE, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.TITANIUM_PICKAXE, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.TITANIUM_AXE, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.TITANIUM_SHOVEL, Models.HANDHELD);
        // itemModelGenerator.register(ToolsRegistry.TITANIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.TUNGSTEN_CARBIDE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.TUNGSTEN_CARBIDE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.TUNGSTEN_CARBIDE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.TUNGSTEN_CARBIDE_HOE, Models.HANDHELD);
    }
}