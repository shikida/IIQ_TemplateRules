import sailpoint.object.Identity;
import sailpoint.object.Identity;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RequestObjectSelectorTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity requestor  = null;
	private static sailpoint.object.Identity requestee  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.RequestObjectSelector");
		//mylogger.debug("Start RequestObjectSelector");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.RequestObjectSelector.name=rule.RequestObjectSelector 
		//logger.RequestObjectSelector.level=debug

		//mylogger.debug("End RequestObjectSelector");
		//	return sailpoint.object.QueryInfo
	}

}
