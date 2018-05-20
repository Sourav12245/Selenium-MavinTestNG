package Banking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageRepo {
	
	WebDriver driver;
	
	By username = By.name("userName");
	By password = By.name("password");
	By loginbutton = By.name("login");
	By date = By.xpath("//tr[@align=\"right\"]//td[@colspan=\"2\"]//b");
	By pass_check = By.xpath("//input[@type=\"password\"][@name=\"password\"][@size=\"10\"]");
	String username_xpath = "//input[@type='text'][@name='userName'][@size='10']";
	String password_xpath = "//input[@type='password'][@name='password'][@size='10']";
	String table = "//table[@border='2'][@cellspacing='0'][@cellpadding='2'][@align='center']";
	String table2 = "//td[@height='16'][@align='right']//table";
	// all objects will be defined in this class
	
	// this is a constructor
	public loginPageRepo(WebDriver driver){
		this.driver = driver;
	}
	
	// These are the functions to perform
	
	// Set UserID
	
	public void setuserid(String userid) {
		driver.findElement(username).sendKeys(userid);
	}
	
	//Set Password
	public void setuserpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	// Set Login
	public void login() {
		driver.findElement(loginbutton).click();
	}
	
	//Calling the central Repo
	centralRepo fcr = new centralRepo(driver);
	
	
	//Get link name for the entire page
//	public void get_all_linkname_in_loginpage() {
//		fcr.get_all_linkname("//html");
//	}
	
	public void get_all_link_count_in_loginpage() {
		fcr.testing123();
		System.out.println("This comes from login Repo");
	}
	
	public void verifydate() {
		String c = driver.findElement(date).getText();
		String d;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		Date date = new Date();
		d = df.format(date);
		if(d == c) {
			System.out.println("Date is correcr: "+c);
		}
		else System.out.println("Date is Incorrect: Should be "+d+" but showing "+c);
	}
	
	//verify if textbox are present and active
	public void isusernamepresent() {
		String atributename = driver.findElement(By.xpath(username_xpath)).getTagName();
		String an = driver.findElement(By.xpath(username_xpath)).getAttribute("type");
		System.out.println(atributename);
		System.out.println(an);
		if(atributename.equalsIgnoreCase("input")) {
			System.out.println("Input box:"+an+" --Present");
	
		}
		else System.out.println("Input Box:Not present");
		
	}
	public void ispasswordpresent() {
		fcr.inputboxverification("password_xpath");
	}
	
	//Verify Password box
	public void passwordfieldverification() {
		/*This method verify if the password is present and prints the result*/
			String an = driver.findElement(pass_check).getAttribute("type");
			if(an.equalsIgnoreCase("password")) {
				System.out.println("The password text box is ACTIVE field");
		
			}
			else System.out.println("The Password text box is NOT ACTIVE field");
    }
	

}









