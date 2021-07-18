import sailpoint.object.Certification;
import sailpoint.object.Identity;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertificationSignOffApproverTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Certification certification  = null;
	private static sailpoint.object.Identity certifier  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CertificationSignOffApprover");
		//mylogger.debug("Start CertificationSignOffApprover");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CertificationSignOffApprover.name=rule.CertificationSignOffApprover 
		//logger.CertificationSignOffApprover.level=debug

		//mylogger.debug("End CertificationSignOffApprover");
		//	return Map
	}

}
