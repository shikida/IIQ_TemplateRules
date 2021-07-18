import sailpoint.object.Application;
import sailpoint.object.Schema;
import java.sql.Connection;
import java.util.Map;
import sailpoint.object.Identity;
import sailpoint.connector.PeopleSoftHRMSConnector;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PeopleSoftHRMSBuildMapTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Schema schema  = null;
	private static java.sql.Connection connection  = null;
	private static java.util.Map state  = null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.connector.PeopleSoftHRMSConnector connector  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.PeopleSoftHRMSBuildMap");
		//mylogger.debug("Start PeopleSoftHRMSBuildMap");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.PeopleSoftHRMSBuildMap.name=rule.PeopleSoftHRMSBuildMap 
		//logger.PeopleSoftHRMSBuildMap.level=debug

		//mylogger.debug("End PeopleSoftHRMSBuildMap");
		//	return map
	}

}
