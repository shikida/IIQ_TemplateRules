import sailpoint.object.Application;
import sailpoint.connector.webservices.EndPoint;
import java.util.Map;
import sailpoint.connector.webservices.WebServicesClient;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WebServiceBeforeOperationRuleTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application applciation  = null;
	private static sailpoint.connector.webservices.EndPoint requestEndPoint  = null;
	private static java.util.Map oldResponseMap  = null;
	private static sailpoint.connector.webservices.WebServicesClient restClient  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.WebServiceBeforeOperationRule");
		//mylogger.debug("Start WebServiceBeforeOperationRule");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.WebServiceBeforeOperationRule.name=rule.WebServiceBeforeOperationRule 
		//logger.WebServiceBeforeOperationRule.level=debug

		//mylogger.debug("End WebServiceBeforeOperationRule");
		//	return EndPoint
	}

}
