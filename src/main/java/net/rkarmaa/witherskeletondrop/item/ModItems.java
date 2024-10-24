package net.rkarmaa.witherskeletondrop.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.rkarmaa.witherskeletondrop.BetterWitherSkeletonDrop;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
  public static final Item WITHER_SKULL_FRAGMENT = registerItem("wither_skull_fragment", new Item(new Item.Settings()));

  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(BetterWitherSkeletonDrop.MOD_ID, name), item);
  }

  public static void registerModItems() {
    BetterWitherSkeletonDrop.LOGGER.info("Registering Mod Items for " + BetterWitherSkeletonDrop.MOD_ID);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
      fabricItemGroupEntries.add(WITHER_SKULL_FRAGMENT);
    });
  }
}
