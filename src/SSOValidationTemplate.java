import javax.servlet.http.HttpServletRequest;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SSOValidationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static javax.servlet.http.HttpServletRequest httpRequest  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.SSOValidation");
		//mylogger.debug("Start SSOValidation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.SSOValidation.name=rule.SSOValidation 
		//logger.SSOValidation.level=debug

		//mylogger.debug("End SSOValidation");
		//	return String
	}

}
