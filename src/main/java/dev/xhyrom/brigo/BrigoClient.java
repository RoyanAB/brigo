package dev.xhyrom.brigo;

import dev.xhyrom.brigo.command.serialization.ArgumentTypes;
import dev.xhyrom.brigo.compat.CompatRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BrigoClient {
    public static final String MOD_ID = "brigo";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


	public static void init() {
        ArgumentTypes.init();
        CompatRegistry.init();

        LOGGER.info("Brigo initialized.");
    }
}
