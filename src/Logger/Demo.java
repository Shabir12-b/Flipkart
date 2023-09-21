package Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Demo {
	public static Logger log = Logger.getLogger(Demo.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("This is info");
		log.warn("This is Warning");
		log.error("This is error");
		log.fatal("this is fatal");
		log.debug("THIS is debug");

	}
}
