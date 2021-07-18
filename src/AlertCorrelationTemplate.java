import sailpoint.object.Source;
import sailpoint.object.Alert;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AlertCorrelationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Source source  = null;
	private static sailpoint.object.Alert alert  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.AlertCorrelation");
		//mylogger.debug("Start AlertCorrelation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.AlertCorrelation.name=rule.AlertCorrelation 
		//logger.AlertCorrelation.level=debug

		//mylogger.debug("End AlertCorrelation");
		//	return Alert
	}

}
