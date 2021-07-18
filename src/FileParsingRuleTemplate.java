import sailpoint.object.Application;
import sailpoint.object.Attributes;
import sailpoint.object.Schema;
import java.io.InputStream;
import java.io.Reader;
import java.util.Map;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FileParsingRuleTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Attributes config  = null;
	private static sailpoint.object.Schema schema  = null;
	private static java.io.InputStream inputStream  = null;
	private static java.io.Reader reader  = null;
	private static java.util.Map state  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.FileParsingRule");
		//mylogger.debug("Start FileParsingRule");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.FileParsingRule.name=rule.FileParsingRule 
		//logger.FileParsingRule.level=debug

		//mylogger.debug("End FileParsingRule");
		//	return Map
	}

}
