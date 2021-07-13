package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jBasicConfigurator {

	static Logger logger=Logger.getLogger(Log4jBasicConfigurator.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		logger.debug("This is a debug Message");
		logger.info("This is a info");
		logger.warn("This is a warning");
		logger.error("This is an error");
		logger.fatal("This is a fatal message");

	}

}
