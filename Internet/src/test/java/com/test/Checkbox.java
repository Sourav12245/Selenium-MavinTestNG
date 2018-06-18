package com.test;

import org.testng.annotations.Test;

import com.POMFiles.POM_checkbox;
import com.config.Testbase;

public class Checkbox extends Testbase {
	
	@Test
	public void click_checkbox() throws Exception {
		POM_checkbox pomc = new POM_checkbox(driver);
		pomc.click_on_link();
		log.info("Link clicked, moved to next page");
//		pomc.check_box_1();
//		log.info("Checkbox 1 was clicked");
//		pomc.check_box_2();
//		log.info("Check box 2 was clicked");
//		pomc.uncheck_if_checked();
//		take_screenshot("checkboxes");
//		pomc.check_box_1();
//		pomc.check_box_2();
//		take_screenshot("checkboxes_after_check");
		Thread.sleep(2000);
		pomc.get_name_checkbox();
	}
}
