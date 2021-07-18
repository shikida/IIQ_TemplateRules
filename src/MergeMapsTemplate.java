import sailpoint.object.Application;
import sailpoint.object.Schema;
import java.util.Map;
import java.util.Map;
import java.util.List;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MergeMapsTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Schema schema  = null;
	private static java.util.Map current  = null;
	private static java.util.Map newObject  = null;
	private static java.util.List mergeAttrs  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.MergeMaps");
		//mylogger.debug("Start MergeMaps");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.MergeMaps.name=rule.MergeMaps 
		//logger.MergeMaps.level=debug

		//mylogger.debug("End MergeMaps");
		//	return Map
	}

}
