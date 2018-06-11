package testcases;

import org.testng.annotations.Test;

import POMtest.POM_login;
import POMtest.POM_tab_home;
import configfiles.testbase;

public class login extends testbase{
	
	@Test
	public void mainpage() throws Exception {
		POM_login pl = new POM_login(driver);
		takecreenshot("login_page");
		pl.setuser();
		log.info("userID is set");
		pl.setpassword();
		takecreenshot("usrid_password_set_login_page");
		log.info("Password is set");
		pl.clicklogin();
		log.info("Click");
		takecreenshot("after_logn_page");
		userwait(5);
	}
	
	@Test(dependsOnMethods = "mainpage")
	public void homepage() {
		POM_tab_home th = new POM_tab_home(driver);
		th.getnameunder_calender();
		log.info("Callender name taken");
		th.getnameunder_companies();
		log.info("Company name taken");
		th.getnameunder_contacts();
		log.info("Contacts name taken");
	}

}
