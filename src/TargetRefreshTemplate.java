import sailpoint.object.Application;
import sailpoint.object.Target;
import sailpoint.object.TargetSource;
import sailpoint.api.TargetAggregator.AggregationSource;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TargetRefreshTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Target target  = null;
	private static sailpoint.object.TargetSource targetSource  = null;
	private static sailpoint.api.TargetAggregator.AggregationSource aggregationSource  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.TargetRefresh");
		//mylogger.debug("Start TargetRefresh");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.TargetRefresh.name=rule.TargetRefresh 
		//logger.TargetRefresh.level=debug

		//mylogger.debug("End TargetRefresh");
		//	return Target
	}

}
