import sailpoint.object.Application;
import sailpoint.object.Schema;
import java.util.Map;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PostIterateTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Schema schema  = null;
	private static java.util.Map stats  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.PostIterate");
		//mylogger.debug("Start PostIterate");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.PostIterate.name=rule.PostIterate 
		//logger.PostIterate.level=debug

		//mylogger.debug("End PostIterate");
		//this rule does not return anything

	}

}
