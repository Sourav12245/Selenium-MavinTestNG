package testcases;

import org.testng.annotations.Test;

import POMtest.POM_login;
import configfiles.testbase;

public class login extends testbase{
	
	@Test
	public void mainpage() throws Exception {
		POM_login pl = new POM_login(driver);
		takecreenshot("login_page");
		pl.setuser("kumar12245");
		log.info("userID is set");
		pl.setpassword("kumar12245");
		takecreenshot("usrid_password_set_login_page");
		log.info("Password is set");
		pl.clicklogin();
		log.info("Click");
		takecreenshot("after_logn_page");
		
	}

}
