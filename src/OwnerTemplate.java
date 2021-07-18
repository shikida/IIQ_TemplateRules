import sailpoint.object.Identity;
import sailpoint.object.Bundle;
import sailpoint.object.Application;
import sailpoint.object.Template;
import sailpoint.object.Field;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class OwnerTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.Bundle role  = null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Template template  = null;
	private static sailpoint.object.Field field  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.Owner");
		//mylogger.debug("Start Owner");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.Owner.name=rule.Owner 
		//logger.Owner.level=debug

		//mylogger.debug("End Owner");
		//	return Object
	}

}
