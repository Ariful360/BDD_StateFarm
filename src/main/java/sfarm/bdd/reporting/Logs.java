package sfarm.bdd.reporting;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logs {
	static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void log(String msg) {
		logger.log(Level.INFO, msg);
	}

}
