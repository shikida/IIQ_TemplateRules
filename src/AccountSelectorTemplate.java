import java.lang.String;
import sailpoint.object.Bundle;
import sailpoint.object.Identity;
import sailpoint.object.Application;
import java.util.List;
import sailpoint.object.ProvisioningProject;
import sailpoint.object.ProvisioningPlan.AccountRequest;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AccountSelectorTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static java.lang.String source  = null;
	private static sailpoint.object.Bundle role  = null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.Application application  = null;
	private static java.util.List links  = null;
	private static boolean isSecondary  = false;
	private static sailpoint.object.ProvisioningProject project  = null;
	private static sailpoint.object.ProvisioningPlan.AccountRequest accountRequest  = null;
	private static boolean allowCreate  = false;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.AccountSelector");
		//mylogger.debug("Start AccountSelector");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.AccountSelector.name=rule.AccountSelector 
		//logger.AccountSelector.level=debug

		//mylogger.debug("End AccountSelector");
		//	return Link
	}

}
