package Banking;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testbase {
	
	public static WebDriver driver = null;
	@BeforeTest
	public void loadUP() throws IOException {
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\Sourav\\workspace\\eclipse-workspace\\DebitCard\\src\\main\\java\\Banking\\global.properties");
		p.load(fi);
		String b_name = p.getProperty("browser");
		String u_name = p.getProperty("url");
		if(p.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sourav\\Downloads\\chromedriver.exe" );
			driver = new ChromeDriver();
		}
		else if(p.getProperty("browser").equalsIgnoreCase("firefox")) {
			//do xyz
		}
		else if(p.getProperty("browser").equalsIgnoreCase("internetexplorer")) {
			//  do abc
		}
		else {
			System.out.println("Brower driver not in the system");
		}
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("-------------------Browser has opened "+b_name +"----------------------");
		System.out.println("-------------------URL Opened "+u_name +"----------------------");
	}

	@AfterTest
	public void tearDOWN() {
		driver.close();
		System.out.println("------------------------Browser closed---------------------------------");
	}

}
