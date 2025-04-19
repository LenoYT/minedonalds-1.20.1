package pl.supercraft.minedonalds.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pl.supercraft.minedonalds.MineDonalds;

public class ModBlocks {
    public static final Block SHOWER_TILE = registerBlock("shower_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block SHOWER_TILE_STAIRS = registerBlock("shower_tile_stairs",
            new StairsBlock(SHOWER_TILE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block SHOWER_TILE_SLAB = registerBlock("shower_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block SHOWER_TILE_WALL = registerBlock("shower_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MineDonalds.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MineDonalds.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
}
