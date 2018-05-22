package Banking.DebitCard;

import java.io.IOException;


import org.testng.annotations.Test;
import Banking.loginPageRepo;
import Banking.testbase;

public class LoginTest extends testbase{
	@Test
	public void LoginApp() throws IOException {
		System.out.println("Start of page 1");
		loginPageRepo obj = new loginPageRepo(driver);
		obj.setuserid("mercury");
		obj.setuserpassword("mercury");
		obj.login();
	}

}
