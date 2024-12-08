package com.pnf.perkcards.contents;

import com.pnf.perkcards.Perkcards;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SUSPICIOUS_SUBSTANCE = register(new Item(getItemSetting("suspicious_substance")), "suspicious_substance");

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((group) -> group.add(SUSPICIOUS_SUBSTANCE));
    }

    public static Item.Settings getItemSetting(String id) {
        Identifier itemID = Identifier.of(Perkcards.MOD_ID, id);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, itemID);

        return new Item.Settings().registryKey(key);
    }

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(Perkcards.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);
    }
}
