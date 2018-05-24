package logcheck.logmain;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checklog {
	WebDriver driver;
//	Logger log = Logger.getLogger("checklog");
	Logger log = Logger.getLogger("checklog");
	@BeforeTest
	public void browseropen(){
//		PropertyConfigurator.configure("C:\\Users\\Sourav\\workspace\\eclipse-workspace\\logmain\\src\\main\\resources\\log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sourav\\Downloads\\chromedriver.exe");
		log.debug("Chrome driver trigered");
		driver = new ChromeDriver();
		log.debug("Open Chrome");
		driver.get("https://www.google.com/");
		log.debug("Google opened");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.debug("Windows maximized");
		driver.manage().deleteAllCookies();
		log.debug("Cookies deleted");
	
	}
	
	@Test(priority = 2)
	public void validinput(){
		String s = "Sourav Ghosh";
		driver.findElement(By.id("lst-ib")).sendKeys(s);
		log.debug(s+" entered");
		driver.findElement(By.id("gb")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try {
			driver.findElement(By.xpath("//input[@value='Google Search'][@name='btnK']")).click();
			log.debug("Search button clicked");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Exception occured: "+ e);
		}
		
		driver.navigate().back();
		log.debug("Go back");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(priority = 1)
	public void getnumberoflinks(){
		List<WebElement> countlink = driver.findElements(By.tagName("a"));
		System.out.println("Link Count: "+countlink.size());
		log.debug("Number of links counted");
	}
	
	@AfterTest
	public void closebrowser(){
		driver.close();
		log.debug("Browser closed");
	}
	

}
