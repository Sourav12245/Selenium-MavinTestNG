package com.config;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.utilities.Utility;

public class Testbase extends Utility{
//	public WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sourav.e.ghosh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Browser Started");
		driver.get("http://the-internet.herokuapp.com/");
		log.info("URL opened");
		driver.manage().window().maximize();
		log.info("Browser Maximized");
	}
	
	@AfterTest
	public void  tearDOWN() {
		driver.close();
		log.info("Browser is closed");
	}
	
	@BeforeSuite
	public void setthings() {
		Utility u = new Utility();
		u.deletedirectory("Screenshots");
	}
	
}
