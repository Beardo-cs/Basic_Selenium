package alpha;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;

public class Demo {

		private static Logger log = LogManager.getLogger(Demo.class.getName());

		public static void main(String[] args) {
			log.debug("I'm debugging");
			if(5>4) { 
			log.debug("Object is present");
			log.info("Object is present");
			log.error("Object is not present");
			log.fatal("this is fatal");

		}
		}

	}


