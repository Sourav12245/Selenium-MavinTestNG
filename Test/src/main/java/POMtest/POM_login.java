package POMtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import excelReader.Testdata;
import screenshot.utilities;



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
	By link = By.xpath("//a");
	
	public void setuser() throws Exception {
		WebElement we = driver.findElement(username);
		utilities.highlight(we);
		driver.findElement(username).sendKeys(Testdata.testdatalogin().get(0));
	
	}
	
	public void setpassword() throws Exception {
		WebElement we = driver.findElement(password);
		utilities.highlight(we);
		driver.findElement(password).sendKeys(Testdata.testdatalogin().get(1));
	}
	
	public void clicklogin() throws Exception {
		WebElement we = driver.findElement(login);
		utilities.highlight(we);
		driver.findElement(login).click();
	}
	
	public void getlinknames() {
		utilities.getlinkname(link);
	}
	
}
