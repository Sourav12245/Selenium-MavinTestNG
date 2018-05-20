package Banking;


import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class centralRepo {
	
	WebDriver driver;

	// This is the constructor
	public centralRepo(WebDriver driver) {
		this.driver = driver;
	}
	
	//To get name of all the link 
	public void get_all_linkname() {
		/*This method provides name of all elements present in link that are present in Page or Table or 
		 * anywere where link is present by giving xpath of the table or page and prints 
		 * the result */
//		String j = xp;
//		List<WebElement> linknameinpage = driver.findElement(By.xpath(j)).findElements(By.tagName("a"));
//		String[] ln = new String[linknameinpage.size()];
//		int i=0;
//		for(WebElement k : linknameinpage) {
//			ln[i] = k.getText();
//			i++;
//		}
//		i = 0;
//		for(String p: ln) {
//			System.out.println(p);
//		}
		List<WebElement> linknameinpage = driver.findElements(By.tagName("a"));
		String[] ln = new String[linknameinpage.size()];
		int i=0;
		for(WebElement k : linknameinpage) {
			ln[i] = k.getText();
			i++;
		}
		i = 0;
		for(String p: ln) System.out.println(p);
		
	}
	
	//Get the number of links
	public void getnumberof_in(String xp) {
		/*This method finds the number of elements like: Textbox,link,checkboxes, radio button by using the 
		 * xpath*/
		List<WebElement> linknumberinpage = driver.findElement(By.xpath(xp)).findElements(By.tagName("a"));
		System.out.println(linknumberinpage.size());
	}
	
	//Verify if Text box is present
	public void inputboxverification(String xp) {
	/*This method verify if the Text box is present and prints the result*/
		String atributename = driver.findElement(By.xpath(xp)).getTagName();
		String an = driver.findElement(By.xpath(xp)).getAttribute("type");
		if(atributename == "input") {
			System.out.println("Input box:"+an+" --Present");
	
		}
		else System.out.println("Input Box:Not present");
	}

	public void testing123(){
		String p = driver.getTitle();
		System.out.println("This comes from central repo");
		System.out.println(p);
	}
	

	
	
	
	
	

}
