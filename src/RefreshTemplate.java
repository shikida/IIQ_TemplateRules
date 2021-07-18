import sailpoint.object.Attributes;
import sailpoint.object.Identity;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RefreshTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Attributes environment  = null;
	private static sailpoint.object.Identity identity  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.Refresh");
		//mylogger.debug("Start Refresh");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.Refresh.name=rule.Refresh 
		//logger.Refresh.level=debug

		//mylogger.debug("End Refresh");
		//this rule does not return anything

	}

}
