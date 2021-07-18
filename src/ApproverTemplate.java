import sailpoint.object.SailPointObject;
import sailpoint.object.Identity;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ApproverTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.SailPointObject object  = null;
	private static sailpoint.object.Identity approver  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.Approver");
		//mylogger.debug("Start Approver");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.Approver.name=rule.Approver 
		//logger.Approver.level=debug

		//mylogger.debug("End Approver");
		//this rule does not return anything

	}

}
