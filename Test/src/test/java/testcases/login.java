package testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import POMtest.POM_login;
import configfiles.testbase;

public class login extends testbase{
	
	@Test
	public void mainpage() throws FileNotFoundException {
		POM_login pl = new POM_login(driver);
		takescreenshot("login_page");
		pl.setuser("kumar12245");
		log.info("userID is set");
		pl.setpassword("kumar12245");
		takescreenshot("usrid_password_set_login_page");
		log.info("Password is set");
		pl.clicklogin();
		log.info("Click");
		takescreenshot("after_logn_page");
		
	}

}
