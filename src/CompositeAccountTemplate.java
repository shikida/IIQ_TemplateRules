import sailpoint.object.Identity;
import sailpoint.object.Application;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CompositeAccountTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.Application application  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CompositeAccount");
		//mylogger.debug("Start CompositeAccount");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CompositeAccount.name=rule.CompositeAccount 
		//logger.CompositeAccount.level=debug

		//mylogger.debug("End CompositeAccount");
		//	return Object
	}

}
