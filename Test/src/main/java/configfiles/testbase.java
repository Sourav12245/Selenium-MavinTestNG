package configfiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import screenshot.utilities;


public class testbase extends utilities{
	/*
	 * Extension: testbase>>utilities>>Excelworks>>config
	 */
	
	/*
	 * Start the session
	 */
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sourav\\Downloads\\Selenium_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Browser trigered");
		driver.get("http://the-internet.herokuapp.com/");
		log.info("Website Entered:"+ driver.getCurrentUrl());
		driver.manage().window().maximize();
		log.info("Browser Maximized");
		String title = driver.getTitle();
		try {
			Assert.assertEquals(true, title.contains("The Internet"));
			log.info("Website is opened");
		}catch(Exception e) {
			log.info("Website info miss match:"+e);
		}
	}
	
	/*
	 * Close the session
	 */
	@AfterTest
	public void tearDOWN() {
		log.info("Browser closed");
		driver.quit();
	}
	
	@BeforeSuite
	public void setthings() {
		utilities u = new utilities();
		u.deletedirectory("Screenshots");
	}
	

}
