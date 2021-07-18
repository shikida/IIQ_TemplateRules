import sailpoint.object.Attributes;
import sailpoint.object.Application;
import sailpoint.object.ResourceObject;
import sailpoint.object.Identity;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IdentityCreationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Attributes environment  = null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.ResourceObject account  = null;
	private static sailpoint.object.Identity identity  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.IdentityCreation");
		//mylogger.debug("Start IdentityCreation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.IdentityCreation.name=rule.IdentityCreation 
		//logger.IdentityCreation.level=debug

		//mylogger.debug("End IdentityCreation");
		//this rule does not return anything

	}

}
