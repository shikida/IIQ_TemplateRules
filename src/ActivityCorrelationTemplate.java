import sailpoint.object.Application;
import sailpoint.object.ActivityDataSource;
import sailpoint.object.ApplicationActivity;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ActivityCorrelationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.ActivityDataSource datasource  = null;
	private static sailpoint.object.ApplicationActivity activity  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.ActivityCorrelation");
		//mylogger.debug("Start ActivityCorrelation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.ActivityCorrelation.name=rule.ActivityCorrelation 
		//logger.ActivityCorrelation.level=debug

		//mylogger.debug("End ActivityCorrelation");
		//	return Map
	}

}
