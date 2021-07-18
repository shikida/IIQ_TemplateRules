import sailpoint.object.Certification;
import sailpoint.object.Certifiable;
import sailpoint.object.AbstractCertifiableEntity;
import sailpoint.api.CertificationBuilder;
import sailpoint.object.CertificationItem;
import java.util.Map;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertificationItemCustomizationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Certification certification  = null;
	private static sailpoint.object.Certifiable certifiable  = null;
	private static sailpoint.object.AbstractCertifiableEntity certifiableEntity  = null;
	private static sailpoint.api.CertificationBuilder certContext  = null;
	private static sailpoint.object.CertificationItem item  = null;
	private static java.util.Map state  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CertificationItemCustomization");
		//mylogger.debug("Start CertificationItemCustomization");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CertificationItemCustomization.name=rule.CertificationItemCustomization 
		//logger.CertificationItemCustomization.level=debug

		//mylogger.debug("End CertificationItemCustomization");
		//this rule does not return anything

	}

}
