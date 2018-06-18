package com.test;

import org.testng.annotations.Test;

import com.POMFiles.POM_Draganddrop;
import com.config.Testbase;

public class Draganddrop extends Testbase{

	@Test
	public void draganddrop() throws Exception {
		POM_Draganddrop pomd = new POM_Draganddrop(driver);
		pomd.click_on_link();
		Thread.sleep(2000);
		take_screenshot("before");
		pomd.SelectfromA_to_B();
		Thread.sleep(2000);
		take_screenshot("after");
	}
}
