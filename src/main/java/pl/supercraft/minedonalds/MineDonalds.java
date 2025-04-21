package pl.supercraft.minedonalds;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.supercraft.minedonalds.block.ModBlocks;
import pl.supercraft.minedonalds.item.ModItems;

public class MineDonalds implements ModInitializer {
	public static final String MOD_ID = "minedonalds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}