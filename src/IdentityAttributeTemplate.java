import sailpoint.object.Attributes;
import sailpoint.object.Identity;
import sailpoint.object.AttributeDefinition;
import sailpoint.object.Link;
import sailpoint.object.AttributeSource;
import java.lang.String;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IdentityAttributeTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Attributes environment  = null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.AttributeDefinition attributeDefinition  = null;
	private static sailpoint.object.Link link  = null;
	private static sailpoint.object.AttributeSource attributeSource  = null;
	private static java.lang.String oldValue  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.IdentityAttribute");
		//mylogger.debug("Start IdentityAttribute");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.IdentityAttribute.name=rule.IdentityAttribute 
		//logger.IdentityAttribute.level=debug

		//mylogger.debug("End IdentityAttribute");
		//	return String
	}

}
