import sailpoint.object.ProvisioningPlan;
import sailpoint.object.Application;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BeforeProvisioningTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.ProvisioningPlan plan  = null;
	private static sailpoint.object.Application application  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.BeforeProvisioning");
		//mylogger.debug("Start BeforeProvisioning");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.BeforeProvisioning.name=rule.BeforeProvisioning 
		//logger.BeforeProvisioning.level=debug

		//mylogger.debug("End BeforeProvisioning");
		//this rule does not return anything

	}

}
