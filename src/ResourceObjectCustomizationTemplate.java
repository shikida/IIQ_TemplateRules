import sailpoint.object.ResourceObject;
import sailpoint.object.Application;
import sailpoint.connector.Connector;
import java.util.Map;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ResourceObjectCustomizationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.ResourceObject object  = null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.connector.Connector connector  = null;
	private static java.util.Map state  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.ResourceObjectCustomization");
		//mylogger.debug("Start ResourceObjectCustomization");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.ResourceObjectCustomization.name=rule.ResourceObjectCustomization 
		//logger.ResourceObjectCustomization.level=debug

		//mylogger.debug("End ResourceObjectCustomization");
		//	return ResourceObject
	}

}
