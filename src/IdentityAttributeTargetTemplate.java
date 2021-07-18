import java.lang.Object;
import sailpoint.object.ObjectAttribute;
import java.lang.String;
import sailpoint.object.ProvisioningPlan.AttributeRequest;
import sailpoint.object.AttributeTarget;
import sailpoint.object.Identity;
import sailpoint.object.ProvisioningProject;
import java.lang.Object;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IdentityAttributeTargetTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static java.lang.Object value  = null;
	private static sailpoint.object.ObjectAttribute sourceIdentityAttribute  = null;
	private static java.lang.String sourceIdentityAttributeName  = null;
	private static sailpoint.object.ProvisioningPlan.AttributeRequest sourceAttributeRequest  = null;
	private static sailpoint.object.AttributeTarget target  = null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.ProvisioningProject project  = null;
	private static java.lang.Object attributeValue  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.IdentityAttributeTarget");
		//mylogger.debug("Start IdentityAttributeTarget");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.IdentityAttributeTarget.name=rule.IdentityAttributeTarget 
		//logger.IdentityAttributeTarget.level=debug

		//mylogger.debug("End IdentityAttributeTarget");
		//	return Object
	}

}
