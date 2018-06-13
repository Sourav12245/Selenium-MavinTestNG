package com.test;

import org.testng.annotations.Test;

import com.POMFiles.POM_authtest;
import com.config.Testbase;

public class Authtest extends Testbase{
	
	@Test
	public void click_on_link() {
		POM_authtest poma = new POM_authtest(driver);
		poma.click_link();
		log.info("Link was clicked");
		poma.gettextallert();
		log.info("Pop up message was recorded");
	}

}
