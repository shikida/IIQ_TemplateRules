import sailpoint.object.Identity;
import sailpoint.object.Policy;
import sailpoint.object.BaseConstraint;
import sailpoint.object.PolicyViolation;
import java.util.Map;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ViolationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.Policy policy  = null;
	private static sailpoint.object.BaseConstraint constraint  = null;
	private static sailpoint.object.PolicyViolation violation  = null;
	private static java.util.Map state  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.Violation");
		//mylogger.debug("Start Violation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.Violation.name=rule.Violation 
		//logger.Violation.level=debug

		//mylogger.debug("End Violation");
		//	return PolicyViolation
	}

}
