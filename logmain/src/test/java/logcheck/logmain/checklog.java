package logcheck.logmain;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class checklog extends TestBase{
	@Test(priority = 2)
	public void validinput(){
		String s = "Sourav Ghosh";
		driver.findElement(By.id("lst-ib")).sendKeys(s);
		log.debug(s+" entered");
		driver.findElement(By.id("gb")).click();
		try {
			driver.findElement(By.xpath("//input[@value='Google Search'][@name='btnK']")).click();
			log.debug("Search button clicked");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Exception occured: "+ e);
		}
		
		driver.navigate().back();
		log.debug("Go back");
	}
	@Test(priority = 1)
	public void getnumberoflinks(){
		List<WebElement> countlink = driver.findElements(By.tagName("a"));
		System.out.println("Link Count: "+countlink.size());
		log.debug("Number of links counted in page "+ driver.getTitle()+" = "+countlink.size());
	}
	

}
