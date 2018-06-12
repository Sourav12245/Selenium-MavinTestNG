package com.POMFiles;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_authtest {
	WebDriver driver;
	// Start a consructor
	public POM_authtest(WebDriver driver) {
		this.driver = driver;
	}
	
	//get the xpaths
	By Basic_Auth_link = By.xpath("//a[@href='/basic_auth']");

}
