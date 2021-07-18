import sailpoint.object.Attributes;
import sailpoint.object.Identity;
import sailpoint.object.AttributeDefinition;
import java.lang.String;
import java.lang.Object;
import java.lang.Object;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ListenerTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Attributes environment  = null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.AttributeDefinition attributeDefinition  = null;
	private static java.lang.String attributeName  = null;
	private static java.lang.Object oldValue  = null;
	private static java.lang.Object newValue  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.Listener");
		//mylogger.debug("Start Listener");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.Listener.name=rule.Listener 
		//logger.Listener.level=debug

		//mylogger.debug("End Listener");
		//this rule does not return anything

	}

}
