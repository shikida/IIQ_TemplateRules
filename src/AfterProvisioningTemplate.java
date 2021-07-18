import sailpoint.object.ProvisioningPlan;
import sailpoint.object.Application;
import sailpoint.object.ProvisioningResult;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AfterProvisioningTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.ProvisioningPlan plan  = null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.ProvisioningResult result  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.AfterProvisioning");
		//mylogger.debug("Start AfterProvisioning");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.AfterProvisioning.name=rule.AfterProvisioning 
		//logger.AfterProvisioning.level=debug

		//mylogger.debug("End AfterProvisioning");
		//this rule does not return anything

	}

}
