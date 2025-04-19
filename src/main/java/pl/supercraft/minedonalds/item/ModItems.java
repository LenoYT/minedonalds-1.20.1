package pl.supercraft.minedonalds.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pl.supercraft.minedonalds.MineDonalds;
import pl.supercraft.minedonalds.block.ModBlocks;

public class ModItems {

    // public static final Item {NAME} = registerItem("{name (low)}", new Item(new FabricItemSettings()));
    public static final Item QUARTERED_POTATOES = registerItem("quartered_potatoes",
            new Item(new FabricItemSettings().food(ModFoodComponents.QUARTERED_POTATOES)));

    public static final Item FRIES = registerItem("fries",
            new Item(new FabricItemSettings().food(ModFoodComponents.FRIES)));

    public static final Item FRY_CARTON = registerItem("fry_carton",
            new Item(new FabricItemSettings()));

    public static final Item FRIED_QUARTERED_POTATOES = registerItem("fried_quartered_potatoes",
            new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_QUARTERED_POTATOES)));

    private static void addItemsToFoodTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(QUARTERED_POTATOES);
        entries.add(FRIES);
        entries.add(FRY_CARTON);
        entries.add(FRIED_QUARTERED_POTATOES);

//        entries.add(ModBlocks.SHOWER_TILE);
//        entries.add(ModBlocks.SHOWER_TILE_SLAB);
//        entries.add(ModBlocks.SHOWER_TILE_STAIRS);
//        entries.add(ModBlocks.SHOWER_TILE_STAIRS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MineDonalds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MineDonalds.LOGGER.info("Registering McDonald's x minecraft movie items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTabItemGroup);
    }
}
