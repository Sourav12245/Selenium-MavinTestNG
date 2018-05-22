package Banking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
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
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// this is a constructor
	public loginPageRepo(WebDriver driver){
		this.driver = driver;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	// Set UserID
	public void setuserid(String userid) {
		try {
		driver.findElement(username).sendKeys(userid);
		}catch(NoSuchElementException e) {
			System.out.println("Element not found");
		}
		
	}
	//Set Password
	public void setuserpassword(String pass) {
		try {
		driver.findElement(password).sendKeys(pass);
	    }catch(NoSuchElementException e) {
			System.out.println("Element not found");
		}
	}
	
	// Set Login
	public void login() {
		try {
		driver.findElement(loginbutton).click();
		}catch(NoSuchElementException e) {
			System.out.println("Element not found");
		}
	}
		
	
	// OTHER FUNCTIONS
	// Get all the link name
	public void get_all_link_name() {
		List<WebElement> linkname = driver.findElements(links);
		String[] p = new String[linkname.size()];
		int k = 0;
		for(WebElement b : linkname) {
			p[k] = b.getText();
		}
		for(String i : p) {
			System.out.println(i);
		}
	}
	
	// Get all link count
	public void get_all_link_count_in_loginpage() {
		List<WebElement> linkcount = driver.findElements(By.tagName("a"));
		System.out.println("Total count: "+linkcount.size());
		if(linkcount.size()==16) {
			System.out.println("All links are present and correct");
		}
		else if(linkcount.size()<16) System.out.println("Some link has been removed");
		else System.out.println("New Link have been added");
	}
	
	// Verify date 
	public void verifydate() {
		String c = driver.findElement(da).getText();
		// formating date taken from system
		DateFormat original_format = new SimpleDateFormat("MMMM dd, yyyy");
		Date date = new Date();
		String main_date = original_format.format(date);/// date from the syatem taken
		if(main_date.equalsIgnoreCase(c)) {
			System.out.println("Date is correct: "+main_date);
		}
		else System.out.println("Date is Incorrect: Should be "+c+" but showing "+main_date);
	}

	//is username present
	public void isusernamepresent() {
		try {
			String atributename = driver.findElement(By.xpath(username_xpath)).getTagName();
			String an = driver.findElement(By.xpath(username_xpath)).getAttribute("type");
			if(atributename.equalsIgnoreCase("input")) {
				System.out.println("Input box:"+an+" --Present");
		
			}
		
		}catch(NoSuchElementException e) {
			System.out.println("Element was not found");
		}
			
		
	}
	// is password box present
	public void ispasswordpresent() {
		try {
			String atributename = driver.findElement(By.xpath(password_xpath)).getTagName();
			String an = driver.findElement(By.xpath(username_xpath)).getAttribute("type");
			if(atributename.equalsIgnoreCase("input")) {
				System.out.println("Input box:"+an+" --Present");
		
			}
		}catch(NoSuchElementException e) {
			System.out.println("Element was not found");
		}
	}
	
	//Verify Password box
	public void passwordfieldverification() {
		/*This method verify if the password is present and prints the result*/
			try {
				String an = driver.findElement(pass_check).getAttribute("type");
				if(an.equalsIgnoreCase("password")) {
					System.out.println("The password text box is ACTIVE field");
			
				}
				else System.out.println("The Password text box is NOT ACTIVE field");
			}catch(NoSuchElementException e) {
				System.out.println("Password was not found");
			}
			
    }
	
	public void check_if_links_are_working() {
		List<WebElement> linkcount = driver.findElements(links);
		String[] p = new String[linkcount.size()];
		int k =0;
		for(WebElement i : linkcount) {
			p[k] = i.getText();
			k++;
		}
		
		for(int i =0;i<=p.length-1;i++) {
			driver.findElement(By.linkText(p[i])).click();
			String g = driver.getTitle();
			if(g.equalsIgnoreCase("Under Construction: Mercury Tours")) {
				System.out.println((i+1)+"Link: "+p[i]+" --is under construction");
			}
			else System.out.println((i+1)+"Link: "+p[i]+"-- has folllowing Title--: "+g);
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		}
		

		
	}
	

}









