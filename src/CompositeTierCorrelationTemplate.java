import sailpoint.object.Identity;
import sailpoint.object.Application;
import sailpoint.object.Link;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CompositeTierCorrelationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.Application tierApplication  = null;
	private static sailpoint.object.Link primaryLink  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CompositeTierCorrelation");
		//mylogger.debug("Start CompositeTierCorrelation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CompositeTierCorrelation.name=rule.CompositeTierCorrelation 
		//logger.CompositeTierCorrelation.level=debug

		//mylogger.debug("End CompositeTierCorrelation");
		//	return List
	}

}
