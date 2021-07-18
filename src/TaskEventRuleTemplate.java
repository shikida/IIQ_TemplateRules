import sailpoint.object.TaskResult;
import sailpoint.object.TaskEvent;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TaskEventRuleTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.TaskResult taskResult  = null;
	private static sailpoint.object.TaskEvent event  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.TaskEventRule");
		//mylogger.debug("Start TaskEventRule");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.TaskEventRule.name=rule.TaskEventRule 
		//logger.TaskEventRule.level=debug

		//mylogger.debug("End TaskEventRule");
		//	return Map
	}

}
