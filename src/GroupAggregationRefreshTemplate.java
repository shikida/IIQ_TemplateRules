import java.util.Map;
import sailpoint.object.ResourceObject;
import sailpoint.object.ManagedAttribute;
import sailpoint.object.Application;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class GroupAggregationRefreshTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static java.util.Map environment  = null;
	private static sailpoint.object.ResourceObject obj  = null;
	private static sailpoint.object.ManagedAttribute accountGroup  = null;
	private static sailpoint.object.Application groupApplication  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.GroupAggregationRefresh");
		//mylogger.debug("Start GroupAggregationRefresh");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.GroupAggregationRefresh.name=rule.GroupAggregationRefresh 
		//logger.GroupAggregationRefresh.level=debug

		//mylogger.debug("End GroupAggregationRefresh");
		//	return Object
	}

}
