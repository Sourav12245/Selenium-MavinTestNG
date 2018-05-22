package Banking.DebitCard;

import org.openqa.selenium.WebDriver;

import Banking.flightfinderpagerepo;
import Banking.testbase;

public class flightfinderpage extends testbase{
	WebDriver driver;
	public void flightfind(){
		System.out.println("Start of page 2");
		flightfinderpagerepo obj2 = new flightfinderpagerepo(driver);
		obj2.click_continue();
		
	}
}
