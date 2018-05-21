package Banking;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class centralRepo {
	
	WebDriver driver;
	By da = By.xpath("//tr[@align=\"right\"]//td[@colspan=\"2\"]//b");
	// This is the constructor
	public centralRepo(WebDriver driver) {
		this.driver = driver;
	}
	
	//to get the date from given xpath
	public void c_verifydate() {
		String c = driver.findElement(da).getText();
		// formating date taken from system
		DateFormat original_format = new SimpleDateFormat("MMMM dd, yyyy");
		Date date = new Date();
		String main_date = original_format.format(date);/// date from the system taken
		if(main_date.equalsIgnoreCase(c)) {
			System.out.println("Date is correct: "+main_date);
		}
		else System.out.println("Date is Incorrect: Should be "+c+" but showing "+main_date);
	}
	
	

	
	
	
	
	

}
