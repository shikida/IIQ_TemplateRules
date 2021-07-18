import sailpoint.object.WorkItem;
import sailpoint.object.Identity;
import sailpoint.object.Identity;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WorkItemForwardTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.WorkItem item  = null;
	private static sailpoint.object.Identity owner  = null;
	private static sailpoint.object.Identity newOwner  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.WorkItemForward");
		//mylogger.debug("Start WorkItemForward");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.WorkItemForward.name=rule.WorkItemForward 
		//logger.WorkItemForward.level=debug

		//mylogger.debug("End WorkItemForward");
		//	return Object
	}

}
