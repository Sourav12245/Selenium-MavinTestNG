package com.POMFiles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.utilities.Utility;


public class POM_authtest {
	WebDriver driver;
	// Start a consructor
	public POM_authtest(WebDriver driver) {
		this.driver = driver;
	}
	
	//get the xpaths
	By Basic_Auth_link = By.xpath("//a[@href='/basic_auth']");
	
	public void click_link() {
//		Utility.highlight(driver.findElement(Basic_Auth_link));
		driver.findElement(Basic_Auth_link).click();
	}
	
	
	public void gettextallert() {
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
	}
	
	

}
