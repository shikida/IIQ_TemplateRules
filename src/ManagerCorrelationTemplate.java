import sailpoint.object.Attributes;
import sailpoint.object.Application;
import java.lang.String;
import sailpoint.connector.Connector;
import sailpoint.object.Link;
import java.lang.String;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ManagerCorrelationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Attributes environment  = null;
	private static sailpoint.object.Application application  = null;
	private static java.lang.String instance  = null;
	private static sailpoint.connector.Connector connector  = null;
	private static sailpoint.object.Link link  = null;
	private static java.lang.String managerAttributeValue  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.ManagerCorrelation");
		//mylogger.debug("Start ManagerCorrelation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.ManagerCorrelation.name=rule.ManagerCorrelation 
		//logger.ManagerCorrelation.level=debug

		//mylogger.debug("End ManagerCorrelation");
		//	return Map
	}

}
