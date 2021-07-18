import sailpoint.object.Application;
import sailpoint.object.Schema;
import com.sap.conn.jco.JCoDestination;
import sailpoint.object.ProvisioningPlan;
import sailpoint.object.ProvisioningRequest;
import sailpoint.connector.SAPHRConnector;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SapHrOperationProvisioningTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Schema schema  = null;
	private static com.sap.conn.jco.JCoDestination destination  = null;
	private static sailpoint.object.ProvisioningPlan plan  = null;
	private static sailpoint.object.ProvisioningRequest request  = null;
	private static sailpoint.connector.SAPHRConnector connector  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.SapHrOperationProvisioning");
		//mylogger.debug("Start SapHrOperationProvisioning");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.SapHrOperationProvisioning.name=rule.SapHrOperationProvisioning 
		//logger.SapHrOperationProvisioning.level=debug

		//mylogger.debug("End SapHrOperationProvisioning");
		//	return ProvisioningResult
	}

}
