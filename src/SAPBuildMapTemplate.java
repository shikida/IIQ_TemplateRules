import com.sap.conn.jco.JCoDestination;
import sailpoint.object.Schema;
import sailpoint.connector.SAPInternalConnector;
import sailpoint.object.Application;
import java.util.Map;
import java.util.Map;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SAPBuildMapTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static com.sap.conn.jco.JCoDestination destination  = null;
	private static sailpoint.object.Schema schema  = null;
	private static sailpoint.connector.SAPInternalConnector connector  = null;
	private static sailpoint.object.Application application  = null;
	private static java.util.Map state  = null;
	private static java.util.Map object  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.SAPBuildMap");
		//mylogger.debug("Start SAPBuildMap");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.SAPBuildMap.name=rule.SAPBuildMap 
		//logger.SAPBuildMap.level=debug

		//mylogger.debug("End SAPBuildMap");
		//this rule does not return anything

	}

}
