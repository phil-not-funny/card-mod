package com.pnf.perkcards;

import com.pnf.perkcards.contents.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Perkcards implements ModInitializer {
	public static final String MOD_ID = "perkcards";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Perkcards is now loading...");
		ModItems.initialize();
	}
}