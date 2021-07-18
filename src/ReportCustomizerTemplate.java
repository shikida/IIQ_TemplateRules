import java.util.Locale;
import sailpoint.object.LiveReport;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ReportCustomizerTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static java.util.Locale locale  = null;
	private static sailpoint.object.LiveReport report  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.ReportCustomizer");
		//mylogger.debug("Start ReportCustomizer");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.ReportCustomizer.name=rule.ReportCustomizer 
		//logger.ReportCustomizer.level=debug

		//mylogger.debug("End ReportCustomizer");
		//this rule does not return anything

	}

}
