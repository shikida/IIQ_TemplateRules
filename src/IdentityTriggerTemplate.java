import sailpoint.object.Identity;
import sailpoint.object.Identity;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IdentityTriggerTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity previousIdentity  = null;
	private static sailpoint.object.Identity newIdentity  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.IdentityTrigger");
		//mylogger.debug("Start IdentityTrigger");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.IdentityTrigger.name=rule.IdentityTrigger 
		//logger.IdentityTrigger.level=debug

		//mylogger.debug("End IdentityTrigger");
		//	return boolean
	}

}
