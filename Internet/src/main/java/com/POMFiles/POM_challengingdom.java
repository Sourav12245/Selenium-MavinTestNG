package com.POMFiles;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.Utility;

public class POM_challengingdom {
	
	// constructor declared
	WebDriver driver;
	public POM_challengingdom(WebDriver driver) {
		this.driver = driver;
	}
	
	// Object repo
	By link_name = By.xpath("//a[@href='/challenging_dom']");
	// After click next page
	By text = By.xpath("//div[@id = 'content'][@class = 'large-12 columns']//script");
	
//	By click_button = By.xpath("//div[@class='large-2 columns']//a");
	
	By edit = By.xpath("//a[@href = '#edit']");
	
	public void click_on_link() throws Exception {
		WebElement e = driver.findElement(link_name);
		Utility.highlight(e);
		driver.findElement(link_name).click();
	}
	
	/*
	 * To get the dynamic number value from the screen
	 */
	public void get_number_value() {
		String s = driver.findElement(text).getAttribute("innerHTML");
		int index_of_colon = s.indexOf(":");
		String before_final = s.substring(index_of_colon+2);
		String[] nana = new String[before_final.length()];
		nana = before_final.split("'");
		System.out.println(nana[0]);		
	}
	
	/*
	 * Click on buttons without any name
	 */
	public void click_on_top_button() {
		WebElement s = get_on(1);
		s.click();
	}
	public void click_on_middle_button() {
		WebElement s=get_on(2);
		s.click();
	}
	public void click_on_bottom_button() {
		WebElement s = get_on(3);
		s.click();
	}
	
	
	private WebElement get_on(int number) {
		WebElement k = driver.findElement(By.xpath("//div[@class='large-2 columns']//a["+number+"]"));
		return k;
	}
	
	/*
	 * Click on buttons having certain name
	 */
	private void get_button_name(String button_name) throws Exception {
		WebElement s1 = get_on(1);
		String p1 = s1.getText();			//foo
		//*****************************
		WebElement s2 = get_on(2);
		String p2 = s2.getText();			//qux
		//****************************
		WebElement s3 = get_on(3);
//		String p3 = s3.getText();			//bar
		//****************************
		if(button_name.equalsIgnoreCase(p1)) { //foo = foo
			Utility.highlight(s1);
			s1.click();
		}else if(button_name.equalsIgnoreCase(p2)) {
			Utility.highlight(s2);
			s2.click();
		}else {
			Utility.highlight(s3);
			s3.click();
		}
	}
	
	public void click_on_button_foo() throws Exception {
		get_button_name("foo");
		
	}
	
	public void click_on_button_qux() throws Exception {
		get_button_name("qux");
	}
	
	public void click_on_button_bar() throws Exception {
		get_button_name("bar");
		
	}
	
	/*
	 * Colour of the Buton presses
	 */
	private void getcolour(String colour_name) throws Exception {
		WebElement s1 = get_on(1);
		String p1 = s1.getAttribute("class");
		//*****************************
		WebElement s2 = get_on(2);
		String p2 = s2.getAttribute("class");
		//****************************
		WebElement s3 = get_on(3);
//		String p3 = s3.getAttribute("class");;			//bar
		//****************************
		if(colour_name.equalsIgnoreCase("blue")) { //foo = foo
			if(p1.equalsIgnoreCase("button")) {
				Utility.highlight(s1);
				s1.click();
				
			}else if(p2.equalsIgnoreCase("button")) {
				Utility.highlight(s2);
				s2.click();
				
			}else {
				Utility.highlight(s3);
				s3.click();
			}
		}else  if(colour_name.equalsIgnoreCase("red")) {
			if(p1.equalsIgnoreCase("button alert")) {
				Utility.highlight(s1);
				s1.click();
			}else if(p2.equalsIgnoreCase("button alert")) {
				Utility.highlight(s2);
				s2.click();
			}else {
				Utility.highlight(s3);
				s3.click();
			}
		}else if(colour_name.equalsIgnoreCase("green")){
			if(p1.equalsIgnoreCase("button success")) {
				Utility.highlight(s1);
				s1.click();
			}else if(p2.equalsIgnoreCase("button success")) {
				Utility.highlight(s2);
				s2.click();
			}else {
				Utility.highlight(s3);
				s3.click();
			}
		}else {
			System.out.println("Select valid button colour: red/blue/green");
		}
	
	}
	
	public void press_blue() throws Exception {
		getcolour("blue");
	}
	
	public void press_red() throws Exception {
		getcolour("red");
	}
	
	public void press_green() throws Exception {
		getcolour("green");
	}
	
	/*
	 * highlight edit or delete links
	 */
	public void click_link(int n, String name) throws Exception {
		if(name.equalsIgnoreCase("edit")) {
			Utility.highlight(driver.findElement(By.xpath("//table//tbody//tr["+n+"]//td[7]//a[1]")));
		}else {
			Utility.highlight(driver.findElement(By.xpath("//table//tbody//tr["+n+"]//td[7]//a[2]")));
		}
	}
	
	
}
