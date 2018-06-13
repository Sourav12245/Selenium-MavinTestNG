package com.test;

import org.testng.annotations.Test;

import com.POMFiles.POM_BrokenImage;
import com.config.Testbase;

public class BrokenImage extends Testbase{
	
	@Test
	public void brokimg() throws Exception {
		POM_BrokenImage pombi = new POM_BrokenImage(driver);
		take_screenshot("before_link_click");
		Thread.sleep(1000);
		pombi.clickon_broken_image_link();
		take_screenshot("After_link_click");
		System.out.println("--------------------------");
		pombi.count_images();
		System.out.println("--------------------------");
		pombi.verify_if_image_broken();
		System.out.println("--------------------------");
		pombi.verify_if_valid_image();
		
		
	}
}
