import sailpoint.object.Identity;
import java.lang.String;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IdentitySelectorTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity identity  = null;
	private static java.lang.String roleName  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.IdentitySelector");
		//mylogger.debug("Start IdentitySelector");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.IdentitySelector.name=rule.IdentitySelector 
		//logger.IdentitySelector.level=debug

		//mylogger.debug("End IdentitySelector");
		//	return boolean
	}

}
