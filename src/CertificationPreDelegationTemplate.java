import sailpoint.object.Certification;
import sailpoint.object.CertificationEntity;
import sailpoint.api.CertificationContext;
import java.util.Map;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertificationPreDelegationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Certification certification  = null;
	private static sailpoint.object.CertificationEntity entity  = null;
	private static sailpoint.api.CertificationContext certContext  = null;
	private static java.util.Map state  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CertificationPreDelegation");
		//mylogger.debug("Start CertificationPreDelegation");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CertificationPreDelegation.name=rule.CertificationPreDelegation 
		//logger.CertificationPreDelegation.level=debug

		//mylogger.debug("End CertificationPreDelegation");
		//	return Map
	}

}
