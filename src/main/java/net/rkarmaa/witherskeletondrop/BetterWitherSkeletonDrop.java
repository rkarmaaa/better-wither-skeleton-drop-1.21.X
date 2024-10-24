package net.rkarmaa.witherskeletondrop;

import net.fabricmc.api.ModInitializer;

import net.rkarmaa.witherskeletondrop.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BetterWitherSkeletonDrop implements ModInitializer {
	public static final String MOD_ID = "betterwitherskeletondrop";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}