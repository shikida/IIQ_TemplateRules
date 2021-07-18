import sailpoint.object.Identity;
import sailpoint.object.Policy;
import sailpoint.object.BaseConstraint;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PolicyTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.Policy policy  = null;
	private static sailpoint.object.BaseConstraint constraint  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.Policy");
		//mylogger.debug("Start Policy");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.Policy.name=rule.Policy 
		//logger.Policy.level=debug

		//mylogger.debug("End Policy");
		//	return PolicyViolation
	}

}
