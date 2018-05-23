package website.pagetest;

import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	@BeforeTest(description = "------------Browser STARTS-------------------------")
	public void setUP(){
		Logger logger = Logger.getLogger("setUP");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sourav\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		logger.info("Browser started");
		driver.get("https://www.google.co.in/");
		logger.info("Website opened");
		driver.manage().window().maximize();
		logger.info("Window Maximixed");
		driver.manage().deleteAllCookies();
		logger.info("Cookie deleted");
	}
	
	@Test(priority = 1)
	public void count_numberlink(){
		List<WebElement> countlink = driver.findElements(By.xpath("//a"));
		System.out.println("Total Number of links: "+countlink.size());
	}
	@Test(priority = 2, description = "--------------This is the main body---------------------")
	public void mainbody(){
		driver.findElement(By.id("lst-ib")).sendKeys("Sourav Ghosh");
		try{
		driver.findElement(By.xpath("//input[@value='Google Search'][@aria-label='Google Search'][@name='btnK']")).click();
		}catch(NoSuchElementException e){
			driver.findElement(By.xpath("//input[@type='button'][@value='Google Search']")).click();
		}catch(WebDriverException e){
			driver.findElement(By.xpath("//input[@type='button'][@value='Google Search']")).click();
		}
		driver.navigate().back();
	}
	
	@AfterTest(description = "------------Browser ENDS-------------------------")
	public void tearDOWN(){
		driver.close();
	}
}

