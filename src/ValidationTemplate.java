import sailpoint.object.Identity;
import sailpoint.object.Application;
import sailpoint.object.Form;
import sailpoint.object.Field;
import java.lang.Object;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ValidationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.Application app  = null;
	private static sailpoint.object.Form form  = null;
	private static sailpoint.object.Field field  = null;
	private static java.lang.Object value  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.Validation");
		//mylogger.debug("Start Validation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.Validation.name=rule.Validation 
		//logger.Validation.level=debug

		//mylogger.debug("End Validation");
		//	return Object
	}

}
