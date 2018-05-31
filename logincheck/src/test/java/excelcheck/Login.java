package excelcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Login {
	WebDriver driver;
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sourav.e.ghosh\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void login() {
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='Username']")).sendKeys("hello");
		driver.findElement(By.name("password")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='submit'][@value='Login']")).click();
		
	}
	
	@AfterTest
	public void tearDOWN() {
		driver.close();
	}

}
