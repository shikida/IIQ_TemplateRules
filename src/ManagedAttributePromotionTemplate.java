import sailpoint.object.ManagedAttribute;
import sailpoint.object.Application;
import java.util.Map;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ManagedAttributePromotionTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.ManagedAttribute attribute  = null;
	private static sailpoint.object.Application application  = null;
	private static java.util.Map state  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.ManagedAttributePromotion");
		//mylogger.debug("Start ManagedAttributePromotion");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.ManagedAttributePromotion.name=rule.ManagedAttributePromotion 
		//logger.ManagedAttributePromotion.level=debug

		//mylogger.debug("End ManagedAttributePromotion");
		//this rule does not return anything

	}

}
