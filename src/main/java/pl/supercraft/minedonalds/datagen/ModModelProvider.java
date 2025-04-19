package pl.supercraft.minedonalds.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import pl.supercraft.minedonalds.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // blockStateModelGenerator.registerSimpleCubeAll(block);
        BlockStateModelGenerator.BlockTexturePool showerTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SHOWER_TILE);
        showerTilePool.stairs(ModBlocks.SHOWER_TILE_STAIRS);
        showerTilePool.slab(ModBlocks.SHOWER_TILE_SLAB);
        showerTilePool.wall(ModBlocks.SHOWER_TILE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // itemModelGenerator.register(item, Models.GENERATED);

    }
}
