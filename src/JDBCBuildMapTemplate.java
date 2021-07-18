import sailpoint.object.Application;
import sailpoint.object.Schema;
import java.util.Map;
import java.sql.ResultSet;
import java.sql.Connection;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JDBCBuildMapTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.Application application  = null;
	private static sailpoint.object.Schema schema  = null;
	private static java.util.Map state  = null;
	private static java.sql.ResultSet result  = null;
	private static java.sql.Connection connection  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.JDBCBuildMap");
		//mylogger.debug("Start JDBCBuildMap");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.JDBCBuildMap.name=rule.JDBCBuildMap 
		//logger.JDBCBuildMap.level=debug

		//mylogger.debug("End JDBCBuildMap");
		//	return Map
	}

}
