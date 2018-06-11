package POMtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import screenshot.utilities;

public class POM_tab_home {
	WebDriver driver;
	//calling a constructor
	public POM_tab_home(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements in the page: LINKS
	//TAB Names
	By home = By.xpath("//a[@title='Home']");
	By calender = By.xpath("//a[@title='Calendar']");
	By Companies = By.xpath("//a[@title='Companies']");
	By Contacts = By.xpath("//a[@title='Contacts']");
	
//	utilities ut = new utilities();
	
	//Methods starts here
	public void getnameunder_calender() {
		utilities.gettabdropdownvalues(calender);
	}
	public void getnameunder_companies() {
		utilities.gettabdropdownvalues(Companies);
	}
	public void getnameunder_contacts() {
		utilities.gettabdropdownvalues(Contacts);
	}
	
}
