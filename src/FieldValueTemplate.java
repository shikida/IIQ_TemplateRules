import sailpoint.object.Application;
import sailpoint.object.Identity;
import sailpoint.object.Form;
import sailpoint.object.Field;
import sailpoint.object.Link;
import sailpoint.object.ManagedAttribute;
import sailpoint.object.ProvisioningProject;
import sailpoint.object.ProvisioningPlan.AccountRequest;
import sailpoint.object.ProvisioningPlan.ObjectRequest;
import sailpoint.object.Bundle;
import sailpoint.object.Template;
import java.lang.Object;
import sailpoint.object.ProvisioningPlan.Operation;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FieldValueTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Identity identity  = null;
	private static sailpoint.object.Form form  = null;
	private static sailpoint.object.Field field  = null;
	private static sailpoint.object.Link link  = null;
	private static sailpoint.object.ManagedAttribute group  = null;
	private static sailpoint.object.ProvisioningProject project  = null;
	private static sailpoint.object.ProvisioningPlan.AccountRequest accountRequest  = null;
	private static sailpoint.object.ProvisioningPlan.ObjectRequest objectRequest  = null;
	private static sailpoint.object.Bundle role  = null;
	private static sailpoint.object.Template template  = null;
	private static java.lang.Object current  = null;
	private static sailpoint.object.ProvisioningPlan.Operation operation  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.FieldValue");
		//mylogger.debug("Start FieldValue");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.FieldValue.name=rule.FieldValue 
		//logger.FieldValue.level=debug

		//mylogger.debug("End FieldValue");
		//	return String
	}

}
