import sailpoint.object.Application;
import sailpoint.object.Schema;
import sailpoint.object.ProvisioningPlan;
import sailpoint.object.ProvisioningRequest;
import java.lang.Class;
import sailpoint.connector.PeopleSoftHRMSConnector;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PeopleSoftHRMSProvisionTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Schema schema  = null;
	private static sailpoint.object.ProvisioningPlan plan  = null;
	private static sailpoint.object.ProvisioningRequest request  = null;
	private static java.lang.Class session  = null;
	private static sailpoint.connector.PeopleSoftHRMSConnector connector  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.PeopleSoftHRMSProvision");
		//mylogger.debug("Start PeopleSoftHRMSProvision");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.PeopleSoftHRMSProvision.name=rule.PeopleSoftHRMSProvision 
		//logger.PeopleSoftHRMSProvision.level=debug

		//mylogger.debug("End PeopleSoftHRMSProvision");
		//	return ProvisioningResult
	}

}
