import sailpoint.object.Attributes;
import sailpoint.object.Application;
import sailpoint.object.ResourceObject;
import sailpoint.object.Link;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CorrelationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Attributes environment  = null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.ResourceObject account  = null;
	private static sailpoint.object.Link link  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.Correlation");
		//mylogger.debug("Start Correlation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.Correlation.name=rule.Correlation 
		//logger.Correlation.level=debug

		//mylogger.debug("End Correlation");
		//	return Map
	}

}
