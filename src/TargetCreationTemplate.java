import sailpoint.object.Application;
import sailpoint.object.Target;
import sailpoint.object.TargetSource;
import sailpoint.api.TargetAggregator.AggregationSource;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TargetCreationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Target target  = null;
	private static sailpoint.object.TargetSource targetSource  = null;
	private static sailpoint.api.TargetAggregator.AggregationSource aggregationSource  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.TargetCreation");
		//mylogger.debug("Start TargetCreation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.TargetCreation.name=rule.TargetCreation 
		//logger.TargetCreation.level=debug

		//mylogger.debug("End TargetCreation");
		//	return Target
	}

}
