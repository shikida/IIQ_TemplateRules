import sailpoint.object.WorkItem;
import sailpoint.object.Identity;
import java.lang.String;
import java.util.List;
import java.lang.String;
import sailpoint.object.Certification.Type;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FallbackWorkItemForwardTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.WorkItem item  = null;
	private static sailpoint.object.Identity owner  = null;
	private static java.lang.String creator  = null;
	private static java.util.List certifiers  = null;
	private static java.lang.String name  = null;
	private static sailpoint.object.Certification.Type type  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.FallbackWorkItemForward");
		//mylogger.debug("Start FallbackWorkItemForward");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.FallbackWorkItemForward.name=rule.FallbackWorkItemForward 
		//logger.FallbackWorkItemForward.level=debug

		//mylogger.debug("End FallbackWorkItemForward");
		//	return Object
	}

}
