package configfiles;

import java.io.File;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class config {
	public static WebDriver driver;
	public Logger log = Logger.getLogger(this.getClass().getName());
	
	public static void takescreenshot(String screenshotname) throws FileNotFoundException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(source, new File("Screenshots\\"+screenshotname+".jpg"));
		} catch (Exception e) {
			System.out.println("Exception:"+e);
		}
	}
	
}
