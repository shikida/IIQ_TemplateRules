import sailpoint.api.SailPointContext;
import sailpoint.object.TaskResult;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TaskCompletionTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.TaskResult result  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.TaskCompletion");
		//mylogger.debug("Start TaskCompletion");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.TaskCompletion.name=rule.TaskCompletion 
		//logger.TaskCompletion.level=debug

		//mylogger.debug("End TaskCompletion");
		//this rule does not return anything

	}

}
