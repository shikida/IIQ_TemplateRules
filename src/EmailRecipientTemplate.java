import sailpoint.object.Notifiable;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EmailRecipientTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Notifiable item  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.EmailRecipient");
		//mylogger.debug("Start EmailRecipient");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.EmailRecipient.name=rule.EmailRecipient 
		//logger.EmailRecipient.level=debug

		//mylogger.debug("End EmailRecipient");
		//	return String or List of Strings
	}

}
