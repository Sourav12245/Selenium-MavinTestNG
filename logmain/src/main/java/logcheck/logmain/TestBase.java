package logcheck.logmain;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase extends Testproperties{
//	Logger log = Logger.getLogger("Testbase");
	WebDriver driver;
	@BeforeTest
	public void setUP() throws IOException{
		System.setProperty("webdriver.chrome.driver", nameofdata("chrome_path"));
		try {
			driver = new ChromeDriver();
			log.debug("Chrome driver trigered");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			tearDOWN();
		}
		log.debug("Open Chrome");
		try{
		driver.get(nameofdata("url"));
		}catch(Exception e){
			log.debug("ERROR"+e);
			tearDOWN();
		}
		log.debug(driver.getTitle()+" opened");
		waitsometime(30);
		driver.manage().window().maximize();
		log.debug("Windows maximized");
	}
	
	@AfterTest
	public void tearDOWN(){
		driver.close();
		log.debug("Browser closed");
	}
	
	@Test
	public void waitsometime(int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
}
