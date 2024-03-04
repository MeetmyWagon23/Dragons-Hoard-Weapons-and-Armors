package me.meetmywagon23.dragonshoardwa.registries;

import me.meetmywagon23.dragonshoardwa.DragonsHoardWA;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

public class ItemGroupRegistry {
    public static final RegistryKey<ItemGroup> DRAGONSHOARD_WA = RegistryKey.of(RegistryKeys.ITEM_GROUP, DragonsHoardWA.ID(DragonsHoardWA.MOD_ID));

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, DRAGONSHOARD_WA, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.dragonshoardwa"))
                .icon(() -> new ItemStack(ItemsRegistry.PLATINUM_COIN))
                .build());
    }
}
