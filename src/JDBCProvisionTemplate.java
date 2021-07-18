import sailpoint.object.Application;
import sailpoint.object.Schema;
import java.sql.Connection;
import sailpoint.object.ProvisioningPlan;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JDBCProvisionTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Schema schema  = null;
	private static java.sql.Connection connection  = null;
	private static sailpoint.object.ProvisioningPlan plan  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.JDBCProvision");
		//mylogger.debug("Start JDBCProvision");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.JDBCProvision.name=rule.JDBCProvision 
		//logger.JDBCProvision.level=debug

		//mylogger.debug("End JDBCProvision");
		//	return ProvisioningResult
	}

}
