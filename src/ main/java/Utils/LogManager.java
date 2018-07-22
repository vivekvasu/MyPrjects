package Utils;

import org.apache.logging.log4j.Logger;

public class LogManager
{
	public static Logger Log = org.apache.logging.log4j.LogManager.getLogger(LogManager.class);

	public static void startTestCase(String sTestCaseName)
	{
		Log.info("$$$$$$$$$$$$$$$$$$$$$        START             $$$$$$$$$$$$$$$$$$$$$$$$$");
	}

	public static void endTestCase(String sTestCaseName)
	{
		Log.info("XXXXXXXXXXXXXXXXXXXXXXX        END                      XXXXXXXXXXXXXXXXXXXXXX");
	}

	public static void info(String message) {

		Log.info(message);

	}

	public static void warn(String message) {

		Log.warn(message);

	}

	public static void error(String message) {

		Log.error(message);

	}

	public static void fatal(String message) {

		Log.fatal(message);

	}

	public static void debug(String message) {

		Log.debug(message);

	}

}
