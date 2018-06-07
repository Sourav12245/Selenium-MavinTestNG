package configfiles;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * @author sourav.e.ghosh
 */
public class config{
	public static WebDriver driver;
	/*
	 * Log4j files
	 */
	public Logger log = Logger.getLogger(this.getClass().getName());	
	
}
