package me.meetmywagon23.dragonshoardwa.datagen;

import me.meetmywagon23.dragonshoardwa.registries.ItemsRegistry;
import me.meetmywagon23.dragonshoardwa.registries.ToolsRegistry;
import me.meetmywagon23.dragonshoardwa.registries.WeaponsRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class DragonsHoardWAModelProvider extends FabricModelProvider {
    public DragonsHoardWAModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // -------------------------------------------------------------------------------------------------
        // --------------------------------Item Generators-------------------------------------------------
        // --------------------DO NOT REMOVE CUSTOM .json FILES IF REPLACING GEN'D ONES---------------------

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
        // itemModelGenerator.register(ItemsRegistry.ARMOR_PLATING, Models.GENERATED); UNUSED ATM, for future Heavy armors
        itemModelGenerator.register(ItemsRegistry.BONE_SPLINTER, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.WITHER_BONE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.WITHER_BONE_SPLINTER, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.BONE_BLIGHT, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SKELETON_RIBCAGE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.WITHER_SKELETON_RIBCAGE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.SKELETON_PELVIS, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.WITHER_SKELETON_PELVIS, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.DRAGON_SCALE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.DRAGON_BONE, Models.GENERATED);
        itemModelGenerator.register(ItemsRegistry.BROKEN_DRAGON_SPLINTER, Models.GENERATED);
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

        /*--------------------------------------------------------------------------------------------------------------
        ----------------------------------------------Weapon-Blades-Model-----------------------------------------------
        ----------------------------DO NOT REMOVE CUSTOM .json FILES IF REPLACING GEN'D ONES--------------------------*/



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
        itemModelGenerator.register(ToolsRegistry.TUNGSTEN_CARBIDE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.TUNGSTEN_CARBIDE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.TUNGSTEN_CARBIDE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ToolsRegistry.TUNGSTEN_CARBIDE_HOE, Models.HANDHELD);

        // ---------------------------------------------------------------------------------------
        // -------------------------------Tool Model Generators-----------------------------------
        // --------------------DO NOT REMOVE CUSTOM .json FILES IF REPLACING GEN'D ONES---------------------

        // Tools to be moved to here.

        // ---------------------------------------------------------------------------------------
        // -------------------------------Weapon Model Builders-----------------------------------
        // --------------------DO NOT REMOVE CUSTOM .json FILES IF REPLACING GEN'D ONES---------------------

        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_CAESTUS, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.BONE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.BRONZE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.COPPER_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.DIAMOND_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.DRAGON_CLAWS, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_SCALE_CAESTUS, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.GOLDEN_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.LEATHER_CAESTUS, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.IRON_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.MITHRIL_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.PLATINUM_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_CAESTUS, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.SILVER_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.STEEL_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.STONE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.NETHERITE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_GAUNTLET, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_WARHAMMER, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.WOODEN_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STONE_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.GOLDEN_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SILVER_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COPPER_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BRONZE_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PLATINUM_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.BONE_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.IRON_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.INFERNAL_IRON_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.COLD_IRON_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.STEEL_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DIAMOND_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ELVEN_STEEL_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DARK_STEEL_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.NETHERITE_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DRAGON_BONE_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PALLADIUM_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.TUNGSTEN_CARBIDE_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MITHRIL_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.ADAMANTINE_DRAGON_BONE_GREATSWORD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SHADOW_ADAMANTINE_DRAGON_BONE_GREATSWORD, Models.HANDHELD);

        itemModelGenerator.register(WeaponsRegistry.WOODEN_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_CLAYMORE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_FALCHION, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_GLAIVE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_HALBERD, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_LONG_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_MACE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_PIKE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_QUARTERSTAFF, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_SCIMITAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_SCYTHE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_SICKLE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_TRIDENT, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.WOODEN_WARHAMMER, Models.HANDHELD);

        /*--------------------------------------------------------------------------------------------------
        ------------------------------------WEAPON-BLADES---------------------------------------------------
        --------------------------------------------------------------------------------------------------*/
        // BATTLEAXE HEADS
        itemModelGenerator.register(ItemsRegistry.BATTLEAXE_HEAD_TEMPLATE, Models.HANDHELD);

        // CLAYMORE BLADES
        itemModelGenerator.register(ItemsRegistry.CLAYMORE_BLADE_TEMPLATE, Models.HANDHELD);

        // FALCHION BLADES
        itemModelGenerator.register(ItemsRegistry.FALCHION_BLADE_TEMPLATE, Models.HANDHELD);

        // GLAIVE BLADES
        itemModelGenerator.register(ItemsRegistry.GLAIVE_BLADE_TEMPLATE, Models.HANDHELD);

        // HALBERD BLADES
        itemModelGenerator.register(ItemsRegistry.HALBERD_BLADE_TEMPLATE, Models.HANDHELD);

        // GREATSWORD BLADES
        itemModelGenerator.register(ItemsRegistry.GREATSWORD_BLADE_TEMPLATE, Models.HANDHELD);

        // LONG SPEAR BLADES
        itemModelGenerator.register(ItemsRegistry.LONG_SPEAR_BLADE_TEMPLATE, Models.HANDHELD);

        // MACE HEADS
        itemModelGenerator.register(ItemsRegistry.MACE_HEAD_TEMPLATE, Models.HANDHELD);

        // PIKE BLADES
        itemModelGenerator.register(ItemsRegistry.PIKE_BLADE_TEMPLATE, Models.HANDHELD);

        // SCIMITAR BLADES
        itemModelGenerator.register(ItemsRegistry.SCIMITAR_BLADE_TEMPLATE, Models.HANDHELD);

        // SPEAR HEADS
        itemModelGenerator.register(ItemsRegistry.SPEAR_HEAD_TEMPLATE, Models.HANDHELD);

        // TRIDENT FORKS
        itemModelGenerator.register(ItemsRegistry.TRIDENT_FORK_TEMPLATE, Models.HANDHELD);

        // WARHAMMER HEADS
        itemModelGenerator.register(ItemsRegistry.WARHAMMER_HEAD_TEMPLATE, Models.HANDHELD);




        // -------------------------------------------------------------------------------------------------
        // ---------------------------------Divine Weapons--------------------------------------------------
        // --------------------DO NOT REMOVE CUSTOM .json FILES IF REPLACING GEN'D ONES---------------------

        itemModelGenerator.register(WeaponsRegistry.ATROPOS, Models.HANDHELD);

        // -------------------------------------------------------------------------------------------------
        // ---------------------------------Twitch Community Skins------------------------------------------
        // --------------------DO NOT REMOVE CUSTOM .json FILES IF REPLACING GEN'D ONES---------------------
        // Solaces set
        itemModelGenerator.register(WeaponsRegistry.ECLIPSE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DUSK, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DAWN, Models.HANDHELD);
        // Snow-Angels set
        itemModelGenerator.register(WeaponsRegistry.SNOWDRIFT_FROSTREAPER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.PURITYS_FROSTFALL_SERENADE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.MALEVOLENT_ARCTIC_DESPAIR, Models.HANDHELD);
        // Phoenix's Set
        itemModelGenerator.register(WeaponsRegistry.EMBERWING_SCORNBLADE, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.SERAPHIC_PLUMEREAVER, Models.HANDHELD);
        itemModelGenerator.register(WeaponsRegistry.DEMONIC_PYROFEATHER, Models.HANDHELD);
        // INSPIRING_SUNFIRE This weapon was created from Codeium, nice name. May use this later.
        //  Backup Cups set
        //itemModelGenerator.register(WeaponsRegistry.CUPS_CLAYMORE, Models.HANDHELD);


    }
}
