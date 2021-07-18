import sailpoint.unstructured.TargetCollector;
import sailpoint.object.Target;
import sailpoint.object.TargetSource;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TargetTransformerTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.unstructured.TargetCollector collector  = null;
	private static sailpoint.object.Target target  = null;
	private static sailpoint.object.TargetSource targetSource  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.TargetTransformer");
		//mylogger.debug("Start TargetTransformer");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.TargetTransformer.name=rule.TargetTransformer 
		//logger.TargetTransformer.level=debug

		//mylogger.debug("End TargetTransformer");
		//	return Target
	}

}
