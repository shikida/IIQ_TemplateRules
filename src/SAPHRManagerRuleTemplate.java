import com.sap.conn.jco.JCoDestination;
import sailpoint.object.Schema;
import sailpoint.connector.SAPHRConnector;
import sailpoint.object.Application;
import java.util.Map;
import java.lang.String;
import java.lang.String;
import java.lang.String;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SAPHRManagerRuleTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static com.sap.conn.jco.JCoDestination destination  = null;
	private static sailpoint.object.Schema schema  = null;
	private static sailpoint.connector.SAPHRConnector connector  = null;
	private static sailpoint.object.Application application  = null;
	private static java.util.Map state  = null;
	private static java.lang.String employeeID  = null;
	private static java.lang.String objectType  = null;
	private static java.lang.String position  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.SAPHRManagerRule");
		//mylogger.debug("Start SAPHRManagerRule");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.SAPHRManagerRule.name=rule.SAPHRManagerRule 
		//logger.SAPHRManagerRule.level=debug

		//mylogger.debug("End SAPHRManagerRule");
		//	return String
	}

}
