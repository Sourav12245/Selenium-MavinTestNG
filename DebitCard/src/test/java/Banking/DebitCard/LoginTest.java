package Banking.DebitCard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Banking.loginPageRepo;

public class LoginTest {
	// Webdriver to be declared outside.
	WebDriver driver; 
	@BeforeTest
	public void setup() {
		System.out.println("------------------Driver Starts------------------------------");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sourav\\Downloads\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sourav.e.ghosh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println("------------------Webpage activated------------------------------");
		
	}
	
	@Test
	public void LoginApp() {
		// Login into mercury application
		// To access the method present in any class
		// We need to create Object of that class
		// and then call the method of the class with the object.
	
// Creating object means invoking Constructor method. Constructor is used to initialize the code, So it 
// will run first.
		loginPageRepo obj = new loginPageRepo(driver);
		obj.verifydate();
		
	}
	@AfterTest
	public void tearDown() {
		System.out.println("------------------Driver is closed------------------------------");
		driver.close();
		
		
	}

}
