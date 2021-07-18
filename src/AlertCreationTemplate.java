import sailpoint.object.Application;
import sailpoint.object.Alert;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AlertCreationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Alert alert  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.AlertCreation");
		//mylogger.debug("Start AlertCreation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.AlertCreation.name=rule.AlertCreation 
		//logger.AlertCreation.level=debug

		//mylogger.debug("End AlertCreation");
		//	return Alert
	}

}
