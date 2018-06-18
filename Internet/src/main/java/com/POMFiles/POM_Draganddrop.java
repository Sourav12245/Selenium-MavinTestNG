package com.POMFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

import com.utilities.Utility;

public class POM_Draganddrop {
	WebDriver driver;
	public POM_Draganddrop(WebDriver driver) {
		this.driver= driver;
	}
	
	By link = By.linkText("Drag and Drop");
	By colA = By.xpath("//div[@id='column-a']");
	By colB = By.xpath("//div[@id='column-b']");
	
	
	public void click_on_link() throws Exception {
		Utility.highlight(driver.findElement(link));
		driver.findElement(link).click();
	}
	
	private void move(WebElement from, WebElement to) throws Exception {
		Utility.highlight(from);
//		Select sel = new Select(from);
//		sel.selectByIndex(k);
		Actions ac = new Actions(driver);
		ac.moveToElement(from);
		ac.clickAndHold(from).dragAndDrop(from, to).build().perform();
//		ac.dragAndDrop(from, to).perform();
	}
	
	public void SelectfromA_to_B() throws Exception {
		move(driver.findElement(colA),driver.findElement(colB));
	}
	
	public void SelectfromB_to_A() throws Exception {
		move(driver.findElement(colB),driver.findElement(colA));
	}
	
}
