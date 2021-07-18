import javax.servlet.http.HttpServletRequest;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SSOAuthenticationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static javax.servlet.http.HttpServletRequest httpRequest  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.SSOAuthentication");
		//mylogger.debug("Start SSOAuthentication");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.SSOAuthentication.name=rule.SSOAuthentication 
		//logger.SSOAuthentication.level=debug

		//mylogger.debug("End SSOAuthentication");
		//	return SailPointObject
	}

}
