package com.POMFiles;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utilities.Utility;

public class POM_BrokenImage {
	
	WebDriver driver;
	public POM_BrokenImage(WebDriver driver) {
		this.driver = driver;
	}
	
	By broken_image = By.xpath("//a[@href='/broken_images']");
	By image_verification = By.xpath("//img[contains(@src, '.jpg')]");
	By ValidImage = By.xpath("//img[starts-with(@src, 'img/')]");
	/*
	 * Click on the link
	 */
	public void clickon_broken_image_link() throws Exception {
		Utility.highlight(driver.findElement(broken_image));
		Utility.take_screenshot("After_highlight");
		driver.findElement(broken_image).click();
	}
	
	/*
	 * Check if the given image is broken
	 */
	public void verify_if_image_broken() {
		List<WebElement> list = driver.findElements(image_verification);
		for(WebElement s : list) {
			String p = s.getAttribute("src").substring(34);
			if(p.startsWith("img/")) {
				System.out.println("Image: "+p+" is NOT BROKEN");
			}
			else {
				System.out.println("Image: "+p+" is BROKEN");
			}
		}
	}
	/*
	 * Check if the image has .jpg format
	 */
	public void verify_if_valid_image() {
		List<WebElement> list = driver.findElements(image_verification);
		for(WebElement s : list) {
			String p = s.getAttribute("src").substring(34);
			if(p.endsWith(".jpg")) {
				System.out.println("Image: "+p+" is Valid");
			}
			else {
				System.out.println("Image: "+p+" is IN Valid");
			}
		}
	}
	
	/*
	 * Count the number of images
	 */
	public void count_images() {
		List<WebElement> list = driver.findElements(image_verification);
		System.out.println("Total Number of Images:"+list.size());
	}
	
}
