package Banking.DebitCard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justtotest_delete {
	public static void main(String args[]) {
//		String d;
//		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
//		Date date = new Date();
//		d = df.format(date);
//		System.out.println(d);
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sourav.e.ghosh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println("--------------Starts----------------------");
		check("//input[@type=\"text\"][@name=\"userName\"][@size=\"10\"]");
//		String atn = driver.findElement(By.xpath("//input[@type=\"text\"][@name=\"userName\"][@size=\"10\"]")).getTagName();
//		String an = driver.findElement(By.xpath("//input[@type=\"text\"][@name=\"userName\"][@size=\"10\"]")).getAttribute("type");
//		System.out.println(atn);
//		System.out.println(an);
//		
//		if(atn.equalsIgnoreCase("input")) {
//			System.out.println("Input box:"+an+" --Present");
//		}
//		else System.out.println("Input Box:Not present");
		System.out.println("--------------Ends------------------------");
		driver.close();
	}
	
	public static void check(String xp) {
		WebDriver driver =null;
		String atn = driver.findElement(By.xpath(xp)).getTagName();
		String an = driver.findElement(By.xpath(xp)).getAttribute("type");
		System.out.println(atn);
		System.out.println(an);
		
		if(atn.equalsIgnoreCase("input")) {
			System.out.println("Input box:"+an+" --Present");
		}
		else System.out.println("Input Box:Not present");
	}
	
		
	
}

