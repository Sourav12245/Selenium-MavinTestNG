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

		pomc.click_link(1, "edit");
		pomc.click_link(7, "edit");
		pomc.click_link(10, "edit");
		pomc.click_link(2, "delete");
		pomc.click_link(9, "delete");
		
		
	}
}
