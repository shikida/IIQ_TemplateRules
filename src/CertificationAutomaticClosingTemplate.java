import sailpoint.object.Certification;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertificationAutomaticClosingTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Certification certification  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CertificationAutomaticClosing");
		//mylogger.debug("Start CertificationAutomaticClosing");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CertificationAutomaticClosing.name=rule.CertificationAutomaticClosing 
		//logger.CertificationAutomaticClosing.level=debug

		//mylogger.debug("End CertificationAutomaticClosing");
		//this rule does not return anything

	}

}
