import sailpoint.object.Identity;
import sailpoint.object.ProvisioningPlan;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CompositeRemediationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.ProvisioningPlan plan  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CompositeRemediation");
		//mylogger.debug("Start CompositeRemediation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CompositeRemediation.name=rule.CompositeRemediation 
		//logger.CompositeRemediation.level=debug

		//mylogger.debug("End CompositeRemediation");
		//	return ProvisioningPlan
	}

}
