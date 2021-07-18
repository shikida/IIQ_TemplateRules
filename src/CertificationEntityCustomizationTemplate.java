import sailpoint.object.Certification;
import sailpoint.object.Certifiable;
import sailpoint.object.AbstractCertifiableEntity;
import sailpoint.api.CertificationContext;
import sailpoint.object.CertificationEntity;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertificationEntityCustomizationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Certification certification  = null;
	private static sailpoint.object.Certifiable certifiable  = null;
	private static sailpoint.object.AbstractCertifiableEntity certifiableEntity  = null;
	private static sailpoint.api.CertificationContext certContext  = null;
	private static sailpoint.object.CertificationEntity entity  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CertificationEntityCustomization");
		//mylogger.debug("Start CertificationEntityCustomization");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CertificationEntityCustomization.name=rule.CertificationEntityCustomization 
		//logger.CertificationEntityCustomization.level=debug

		//mylogger.debug("End CertificationEntityCustomization");
		//this rule does not return anything

	}

}
