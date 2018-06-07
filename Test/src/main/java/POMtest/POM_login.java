package POMtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class POM_login{
	WebDriver driver;
	
	//Initialze the constructor
	public POM_login(WebDriver driver) {
		this.driver = driver;
	}
	
	// Create OR
	By username = By.xpath("//input[@type='text'][@placeholder='Username'][@name='username']");
	By password = By.xpath("//input[@type='password'][@name='password']");
	By login = By.xpath("//input[@type='submit'][@value='Login']");
	
	
	public void setuser(String usrnam) throws Exception {
		driver.findElement(username).sendKeys(usrnam);
	}
	
	public void setpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clicklogin() {
		driver.findElement(login).click();
	}
	
}
