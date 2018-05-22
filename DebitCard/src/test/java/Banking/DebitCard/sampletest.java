package Banking.DebitCard;

import org.testng.annotations.Test;

import Banking.flightfinderpagerepo;
import Banking.loginPageRepo;
import Banking.testbase;

public class sampletest extends testbase{
	
	@Test(priority = 1)
	public void loginappcheck() {
		loginPageRepo lpr = new loginPageRepo(driver);
//		lpr.ispasswordpresent();
//		lpr.isusernamepresent();
		lpr.get_all_link_name();
//		lpr.get_all_link_count_in_loginpage();
//		lpr.get_all_link_name();
//		lpr.verifydate();
//		System.out.println("------ALL OK------------");
	}
	
//	@Test(priority = 2)
//	public void login() {
//		loginPageRepo lpr = new loginPageRepo(driver);
//		lpr.setuserid("mercury");
//		lpr.setuserpassword("mercury");
//		lpr.login();
//		System.out.println("Login Successful");
//	}
//	
//	@Test(priority = 3)
//	public void continie_up() {
//		flightfinderpagerepo ffpr = new flightfinderpagerepo(driver);
//		ffpr.click_continue();
//	}
//
}
