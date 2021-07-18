import sailpoint.object.Certification;
import sailpoint.object.CertificationEntity;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertificationEntityRefreshTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Certification certification  = null;
	private static sailpoint.object.CertificationEntity entity  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CertificationEntityRefresh");
		//mylogger.debug("Start CertificationEntityRefresh");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CertificationEntityRefresh.name=rule.CertificationEntityRefresh 
		//logger.CertificationEntityRefresh.level=debug

		//mylogger.debug("End CertificationEntityRefresh");
		//this rule does not return anything

	}

}
