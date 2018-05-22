package Banking.DebitCard;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class justtotest_delete {
	public static void main(String[]args) {
		WebDriver driver;
		By links = By.xpath("//a");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sourav.e.ghosh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println("------------------Webpage activated------------------------------");
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
		System.out.println("-----------------Webpage closed------------------------------------");
		driver.close();
		
	}
	
}

