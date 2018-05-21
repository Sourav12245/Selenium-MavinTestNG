package Banking.DebitCard;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justtotest_delete {
	public static void main(String[]args) {
		WebDriver driver;
		By da = By.xpath("//tr[@align=\"right\"]//td[@colspan=\"2\"]//b");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sourav.e.ghosh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println("------------------Webpage activated------------------------------");
		String c = driver.findElement(da).getText();
		DateFormat original_format = new SimpleDateFormat("MMMM dd, yyyy");
		
		Date date = new Date();
		String main_date = original_format.format(date);
		if(main_date.equalsIgnoreCase(c)) {
			System.out.println("Date is correct: "+main_date);
		}
		else System.out.println("Date is Incorrect: Should be "+c+" but showing "+main_date);
		driver.close();
		
	}
	
}

