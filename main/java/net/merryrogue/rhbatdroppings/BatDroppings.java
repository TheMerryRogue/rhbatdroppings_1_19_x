package net.merryrogue.rhbatdroppings;

import net.fabricmc.api.ModInitializer;
import net.merryrogue.rhbatdroppings.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BatDroppings implements ModInitializer {

	public static final String MOD_ID = "rhbatdroppings";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}
