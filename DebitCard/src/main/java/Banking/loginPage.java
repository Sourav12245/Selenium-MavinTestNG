package Banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	By username = By.name("userName");
	By password = By.name("password");
	By loginbutton = By.name("login");
	// all objects will be defined in this class
	
	// this is a constructor
	public loginPage(WebDriver driver){
		this.driver = driver;
	}
	
	// These are the functions to perform
	public void setuserid(String userid) {
		driver.findElement(username).sendKeys(userid);
	}
	
	public void setuserpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void login() {
		driver.findElement(loginbutton).click();
	}
	

}
