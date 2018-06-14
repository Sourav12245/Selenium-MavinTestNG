package com.test;

import org.testng.annotations.Test;

import com.POMFiles.POM_challengingdom;
import com.config.Testbase;

public class Challenging_dom extends Testbase{
	
	@Test
	public void chaldom() throws Exception {
		POM_challengingdom pomc = new POM_challengingdom(driver);
		pomc.click_on_link();
		log.info("link clicked to new page");
//		take_screenshot("afterlinkclick");
//		pomc.get_number_value();
//		
//		
//		pomc.click_on_button_bar();
//		log.info("bar is pressed");
//		pomc.get_number_value();
//		
//		
//		pomc.click_on_button_foo();
//		log.info("foo is pressed");
//		pomc.get_number_value();
//		
//		
//		pomc.click_on_button_qux();
//		log.info("qux is pressed");
//		pomc.get_number_value();
		pomc.press_blue();
		log.info("Blue button pressed");
		pomc.press_green();
		log.info("green button pressed");
		pomc.press_red();
		log.info("Red button pressed");
		pomc.press_green();
		log.info("green button pressed");
		pomc.press_blue();
		log.info("Blue button pressed");
		
		
	}
}
