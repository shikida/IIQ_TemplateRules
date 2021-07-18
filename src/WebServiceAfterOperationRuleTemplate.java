import sailpoint.object.Application;
import sailpoint.connector.webservices.EndPoint;
import java.util.List;
import java.lang.String;
import sailpoint.connector.webservices.WebServicesClient;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WebServiceAfterOperationRuleTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application applciation  = null;
	private static sailpoint.connector.webservices.EndPoint requestEndPoint  = null;
	private static java.util.List processedResponseObject  = null;
	private static java.lang.String rawResponseObject  = null;
	private static sailpoint.connector.webservices.WebServicesClient restClient  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.WebServiceAfterOperationRule");
		//mylogger.debug("Start WebServiceAfterOperationRule");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.WebServiceAfterOperationRule.name=rule.WebServiceAfterOperationRule 
		//logger.WebServiceAfterOperationRule.level=debug

		//mylogger.debug("End WebServiceAfterOperationRule");
		//	return Object
	}

}
