package test;

//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ploan {
	@Test(groups= {"Regression"})
	public void loaning() {
		System.out.println("Prsonal Loan @ 10%");
	}
	@Test(groups= {"Smoke"})
	public void loaning_new() {
		System.out.println("Prsonal Loan @ 20%");
	}
//	@BeforeTest
//	public void check() {
//		System.out.println("This is the check point to clear data");
//	}
	
}
