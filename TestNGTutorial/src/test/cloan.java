package test;

//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cloan {
	@Test
	public void carcheck() {
		System.out.println("This is a car");
	}
	@Test(dependsOnMethods = "carcheck")
	public void carwindow() {
		System.out.println("This car has 4 windows");
	}
	@Test(dependsOnMethods = "carcheck")
	public void cardoor() {
		System.out.println("This car has 4 doors");
	}
	
	@Test(dependsOnMethods = "cardoor")
	public void carfloor() {
		System.out.println("This car has the floor");
	}
	
	@Test(dependsOnMethods = "owner")
	public void driver() {
		System.out.println("Driver Name: Raju");
		
	}
	
	@Test(enabled = false)
	public void companycar() {
		System.out.println("Car name: MARUTI");
	}
	
	@Test
	public void owner() {
		System.out.println("Owner: Sourav");
	}
	@BeforeTest
	public void check() {
		System.out.println("------------This is the check point to clear data");
	}
}
