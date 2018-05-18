package Banking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageRepo {
	
	WebDriver driver;
	
	By username = By.name("userName");
	By password = By.name("password");
	By loginbutton = By.name("login");
	By date = By.xpath("//tr[@align=\"right\"]//td[@colspan=\"2\"]//b");
	By pass_check = By.xpath("//input[@type=\"password\"][@name=\"password\"][@size=\"10\"]");
	By username_xpath = By.xpath("//input[@type=\"text\"][@name=\"userName\"][@size=\"10\"]");
//	By all_page = By.xpath("\"//html\"");
	
	
	//Table xpaths
	
	
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
	public void get_all_linkname_in_loginpage() {
		fcr.get_all_linkname("//html");
	}
	
	public void get_all_link_count_in_loginpage() {
		fcr.getnumberof_in("//html");
		
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
		fcr.inputboxverification("//input[@type=\"text\"][@name=\"userName\"][@size=\"10\"]");
		
	}
	public void ispasswordpresent() {
		fcr.inputboxverification("pass_check");
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









