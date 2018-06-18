package com.POMFiles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utilities.Utility;

public class POM_dropdown {
	WebDriver driver;
	public POM_dropdown(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By link = By.linkText("Dropdown");
	By select1 = By.xpath("//select//option[1]");
	By select2 = By.xpath("//select//option[2]");
	By select3 = By.xpath("//select//option[3]");
	By select_dropdown = By.xpath("//select");
	
	
	public void click_on_link() throws Exception {
		Utility.highlight(driver.findElement(link));
		driver.findElement(link).click();
	}
	
	public void get_names_in_dropdown() {
		List<WebElement> opt = driver.findElements(By.xpath("//select//option"));
		String[] arr = new String[opt.size()];
		int i = 0;
		for(WebElement g: opt) {
			String p = g.getText();
			arr[i] = p;
			i++;
		}
		String[] arr1 = new String[opt.size()];
		int d = 0;
		for(WebElement k: opt) {
			Boolean c = k.isEnabled();
			if(c == true) {
				arr1[d] = "Is enabled";
			}else {
				arr1[d] = "Is not enabled";
			}
		d++;
		}
		for(int n=0; n<=arr.length-1;n++) {
			System.out.println(arr[n] +":"+ arr1[n]);
		}
		
	}
	
		
	private void select_index(int num) {
		Select drpmenu = new Select(driver.findElement(By.id("dropdown")));
		drpmenu.selectByIndex(num);
	}
	
	public void select_option1() {
		Boolean c = driver.findElement(select2).isEnabled();
		if(c == true)
		select_index(1);
		else System.out.println("Option 1 is not enabled");
	}
	
	public void select_option2() {
		Boolean c = driver.findElement(select3).isEnabled();
		if(c == true)
		select_index(2);
		else System.out.println("Option 2 is not enabled");
	}

	public void select_select_opt() {
		Boolean c = driver.findElement(select3).isEnabled();
		if(c == true)
		select_index(0);
		else System.out.println("Please select option is not enabled");
	}
}
