package Banking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageRepo {
	
	WebDriver driver;
	
	By username = By.name("userName");
	By password = By.name("password");
	By loginbutton = By.name("login");
	By da = By.xpath("//tr[@align=\"right\"]//td[@colspan=\"2\"]//b");
	By pass_check = By.xpath("//input[@type=\"password\"][@name=\"password\"][@size=\"10\"]");
	String username_xpath = "//input[@type='text'][@name='userName'][@size='10']";
	String password_xpath = "//input[@type='password'][@name='password'][@size='10']";
	String table = "//table[@border='2'][@cellspacing='0'][@cellpadding='2'][@align='center']";
	String table2 = "//td[@height='16'][@align='right']//table";
	By links = By.tagName("//a");
	// all objects will be defined in this class
	
	// this is a constructor
	public loginPageRepo(WebDriver driver){
		this.driver = driver;
	}
	
	// TO LOGIN ACTION
	
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
	
	// OTHER FUNCTIONS
	// Get all the link name
	public void get_all_link_name() {
		List<WebElement> linkname = driver.findElements(links);
		for(WebElement b : linkname) {
			String s = b.getText();
			System.out.println(s);
		}
	}
	
	// Get all link count
	public void get_all_link_count_in_loginpage() {
		List<WebElement> linkcount = driver.findElements(By.tagName("a"));
		System.out.println(linkcount.size());
		if(linkcount.size()==16) {
			System.out.println("All links are present and correct");
		}
		else if(linkcount.size()<16) System.out.println("Some link has been removed");
		else System.out.println("New Link have been added");
	}
	
	// Verify date 
//	public void verifydate() {
//		String c = driver.findElement(da).getText();
//		// formating date taken from system
//		DateFormat original_format = new SimpleDateFormat("MMMM dd, yyyy");
//		Date date = new Date();
//		String main_date = original_format.format(date);/// date from the syatem taken
//		if(main_date.equalsIgnoreCase(c)) {
//			System.out.println("Date is correct: "+main_date);
//		}
//		else System.out.println("Date is Incorrect: Should be "+c+" but showing "+main_date);
//	}
	centralRepo cr = new centralRepo(driver);
	public void verifydate() {
		cr.c_verifydate();
	}
	
	//is username present
	public void isusernamepresent() {
		String atributename = driver.findElement(By.xpath(username_xpath)).getTagName();
		String an = driver.findElement(By.xpath(username_xpath)).getAttribute("type");
		if(atributename.equalsIgnoreCase("input")) {
			System.out.println("Input box:"+an+" --Present");
	
		}
		else System.out.println("Input Box: "+an+" Not present");
		
	}
	// is password box present
	public void ispasswordpresent() {
		String atributename = driver.findElement(By.xpath(password_xpath)).getTagName();
		String an = driver.findElement(By.xpath(username_xpath)).getAttribute("type");
		if(atributename.equalsIgnoreCase("input")) {
			System.out.println("Input box:"+an+" --Present");
	
		}
		else System.out.println("Input Box: "+an+" Not present");
		
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
	
	public void check_if_links_are_working() {
		List<WebElement> linkcount = driver.findElements(links);
		String[] p = new String[linkcount.size()];
		int k =0;
		for(WebElement i : linkcount) {
			p[k] = i.getText();
			k++;
		}
		
		for(int i =0;i<=p.length-2;i++) {
			try {
			driver.findElement(By.linkText(p[i])).click();
			}catch(ElementNotVisibleException e) {
				System.out.println("Element: P["+i+"] is not visible");
			}
			String g = driver.getTitle();
			if(g.equalsIgnoreCase("Under Construction: Mercury Tours")) {
				System.out.println("Link: "+p[i]+" --is under construction");
			}
			else System.out.println("Link: "+p[i]+"-- has folllowing Title--: "+g);
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		}
		

		
	}
	

}









