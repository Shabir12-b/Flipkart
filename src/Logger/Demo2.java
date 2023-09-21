package Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo2 {
	
	public static Logger log = Logger.getLogger(Demo2.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("Login.Propertires");
		log.info("This is info");
		log.warn("THIS IS WARN");
		log.error("THIS IS ERROR");
		log.fatal("THIS IS FATAL");
		log.debug("THIS IS DEBUG");
		
	}
	

}
