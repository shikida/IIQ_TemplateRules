import sailpoint.workflow.WorkflowContext;
import sailpoint.workflow.WorkflowHandler;
import sailpoint.object.Workflow;
import sailpoint.object.Workflow.Step;
import sailpoint.object.Workflow.Approval;
import sailpoint.object.WorkItem;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WorkflowTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.workflow.WorkflowContext wfcontext  = null;
	private static sailpoint.workflow.WorkflowHandler handler  = null;
	private static sailpoint.object.Workflow workflow  = null;
	private static sailpoint.object.Workflow.Step step  = null;
	private static sailpoint.object.Workflow.Approval approval  = null;
	private static sailpoint.object.WorkItem item  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.Workflow");
		//mylogger.debug("Start Workflow");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.Workflow.name=rule.Workflow 
		//logger.Workflow.level=debug

		//mylogger.debug("End Workflow");
		//	return Object
	}

}
