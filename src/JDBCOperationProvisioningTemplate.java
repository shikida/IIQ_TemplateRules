import sailpoint.object.Application;
import sailpoint.object.Schema;
import java.sql.Connection;
import sailpoint.object.ProvisioningPlan;
import sailpoint.object.ProvisioningPlan.AccountRequest;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JDBCOperationProvisioningTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Schema schema  = null;
	private static java.sql.Connection connection  = null;
	private static sailpoint.object.ProvisioningPlan plan  = null;
	private static sailpoint.object.ProvisioningPlan.AccountRequest request  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.JDBCOperationProvisioning");
		//mylogger.debug("Start JDBCOperationProvisioning");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.JDBCOperationProvisioning.name=rule.JDBCOperationProvisioning 
		//logger.JDBCOperationProvisioning.level=debug

		//mylogger.debug("End JDBCOperationProvisioning");
		//	return ProvisioningResult
	}

}
