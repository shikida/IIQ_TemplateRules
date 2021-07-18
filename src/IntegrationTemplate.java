import sailpoint.object.Identity;
import sailpoint.object.ProvisioningPlan;
import sailpoint.object.IntegrationConfig;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IntegrationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.ProvisioningPlan plan  = null;
	private static sailpoint.object.IntegrationConfig integration  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.Integration");
		//mylogger.debug("Start Integration");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.Integration.name=rule.Integration 
		//logger.Integration.level=debug

		//mylogger.debug("End Integration");
		//this rule does not return anything

	}

}
