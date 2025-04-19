package pl.supercraft.minedonalds.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import pl.supercraft.minedonalds.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // addDrop(ModBlock. ---)
        // addDrop(ModBlock. ---, oreDrops(silk, item))

        addDrop(ModBlocks.SHOWER_TILE);
        addDrop(ModBlocks.SHOWER_TILE_SLAB, slabDrops(ModBlocks.SHOWER_TILE_SLAB));
        addDrop(ModBlocks.SHOWER_TILE_WALL);
        addDrop(ModBlocks.SHOWER_TILE_STAIRS);
    }
}
