import java.util.List;
import sailpoint.object.ApprovalSet;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ApprovalAssignmentTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static java.util.List approvals  = null;
	private static sailpoint.object.ApprovalSet approvalSet  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.ApprovalAssignment");
		//mylogger.debug("Start ApprovalAssignment");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.ApprovalAssignment.name=rule.ApprovalAssignment 
		//logger.ApprovalAssignment.level=debug

		//mylogger.debug("End ApprovalAssignment");
		//this rule does not return anything

	}

}
