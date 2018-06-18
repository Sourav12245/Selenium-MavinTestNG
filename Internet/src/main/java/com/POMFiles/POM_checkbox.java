package com.POMFiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.Utility;

public class POM_checkbox {
	
	WebDriver driver;
	// Declare a constructor
	public POM_checkbox(WebDriver driver) {
		this.driver = driver;
	}
	
	//OR
	By link = By.xpath("//a[@href='/checkboxes']");
	By checkbox_1 = By.xpath("//form[@id ='checkboxes']//input[1]");
	By checkbox_2 = By.xpath("//form[@id ='checkboxes']//input[2]");
	By checkboxes = By.xpath("//form//input[@type='checkbox']");
	By form = By.xpath("//form[@id ='checkboxes']");
	
	//check box by normal xpath selection
	public void click_on_link() throws Exception {
		Utility.highlight(driver.findElement(link));
		driver.findElement(link).click();
	}
	
	public void check_box_1() throws Exception {
		Utility.highlight(driver.findElement(checkbox_1));
		driver.findElement(checkbox_1).click();
	}
	
	public void check_box_2() throws Exception {
		Utility.highlight(driver.findElement(checkbox_2));
		driver.findElement(checkbox_2).click();
	}
	
	public void uncheck_if_checked() {
		List<WebElement> cb = driver.findElements(checkboxes);
		for(WebElement s : cb) {
			Boolean p = s.isSelected();
			if(p == true) {
				s.click();
				}
			}
		}
	public void get_name_checkbox() {
		String frm = driver.findElement(form).getAttribute("innerHTML");
		System.out.println(frm);
	}
	
}
