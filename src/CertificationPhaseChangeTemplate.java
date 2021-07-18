import sailpoint.object.Certification;
import sailpoint.object.CertificationItem;
import sailpoint.object.Certification.Phase;
import sailpoint.object.Certification.Phase;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertificationPhaseChangeTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Certification certification  = null;
	private static sailpoint.object.CertificationItem certificationItem  = null;
	private static sailpoint.object.Certification.Phase previousPhase  = null;
	private static sailpoint.object.Certification.Phase nextPhase  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CertificationPhaseChange");
		//mylogger.debug("Start CertificationPhaseChange");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CertificationPhaseChange.name=rule.CertificationPhaseChange 
		//logger.CertificationPhaseChange.level=debug

		//mylogger.debug("End CertificationPhaseChange");
		//this rule does not return anything

	}

}
