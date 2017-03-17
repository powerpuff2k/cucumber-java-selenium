package helpers;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogMessage {
	private static Logger Log = Logger.getLogger(LogMessage.class);

	public static void startTestCase(String sTestCaseName){
		Log.info("Started Test case");
	}

	public void logInfo(String message){
		Log.info(message);
	}


	public static void endTestCase(String sTestCaseName){
		Log.info("Ended Test Case");
	}

	public static void info(String message)
	{
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