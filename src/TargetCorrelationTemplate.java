import sailpoint.object.Application;
import java.lang.String;
import sailpoint.object.Target;
import sailpoint.object.TargetSource;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TargetCorrelationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static java.lang.String nativeId  = null;
	private static sailpoint.object.Target target  = null;
	private static sailpoint.object.TargetSource targetSource  = null;
	private static boolean isGroup  = false;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.TargetCorrelation");
		//mylogger.debug("Start TargetCorrelation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.TargetCorrelation.name=rule.TargetCorrelation 
		//logger.TargetCorrelation.level=debug

		//mylogger.debug("End TargetCorrelation");
		//	return Map
	}

}
