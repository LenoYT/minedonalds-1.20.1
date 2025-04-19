package pl.supercraft.minedonalds.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import pl.supercraft.minedonalds.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SHOWER_TILE)
                .add(ModBlocks.SHOWER_TILE_SLAB)
                .add(ModBlocks.SHOWER_TILE_STAIRS)
                .add(ModBlocks.SHOWER_TILE_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SHOWER_TILE_WALL);

    }
}
