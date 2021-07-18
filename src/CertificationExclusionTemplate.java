import sailpoint.object.AbstractCertifiableEntity;
import sailpoint.object.Certification;
import sailpoint.api.CertificationContext;
import java.util.List;
import java.util.List;
import java.util.Map;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertificationExclusionTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.AbstractCertifiableEntity entity  = null;
	private static sailpoint.object.Certification certification  = null;
	private static sailpoint.api.CertificationContext certContext  = null;
	private static java.util.List items  = null;
	private static java.util.List itemsToExclude  = null;
	private static java.util.Map state  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.CertificationExclusion");
		//mylogger.debug("Start CertificationExclusion");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.CertificationExclusion.name=rule.CertificationExclusion 
		//logger.CertificationExclusion.level=debug

		//mylogger.debug("End CertificationExclusion");
		//	return String
	}

}
