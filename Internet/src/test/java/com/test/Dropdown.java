package com.test;

import org.testng.annotations.Test;

import com.POMFiles.POM_dropdown;
import com.config.Testbase;

public class Dropdown extends Testbase{
	
	@Test
	public void selectstuff() throws Exception {
		POM_dropdown pomd = new POM_dropdown(driver);
		pomd.click_on_link();
		Thread.sleep(2000);
		pomd.get_names_in_dropdown();
		log.info("Drop down names extracted");
		pomd.select_select_opt();
		log.info("Select Option");
		pomd.select_option1();
		log.info("Select Option 1");
		pomd.select_option2();
		log.info("Select option 2");
		
	}
}
