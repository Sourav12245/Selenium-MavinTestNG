package car;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cardetail {
	@Test
	public void manufacture() {
		System.out.println("Made in INDIA");
	}
	
	@Test
	public void company() {
		System.out.println("Its SUZUKI-DEZIRE");
	}
	
	@Test
	public void country() {
		System.out.println("Shipping Country: JAPAN");
	}
	
	@Test(dependsOnMethods="country")
	public void shippingcost() {
		System.out.println("Shipping Cost: Rs45,000");
	}
	
	@Test(dependsOnMethods= {"cost","country","manufacture"})
	public void tax() {
		System.out.println("Tax: Rs 80,000");
	}
	
	@Test(dependsOnMethods= {"shippingcost"})
	public void importtax() {
		System.out.println("Import Tax: Rs 20,000");
	}
	
	@Test(dependsOnMethods= {"country","company"})
	public void cost() {
		System.out.println("Cost: Rs: 6,00,000");
	}
	
	@Test(dependsOnMethods = {"cost","tax","shippingcost","importtax"},enabled = false)
	public void overallcost() {
		System.out.println("Over All Cost: 9,20,000");
	}
//====================================================================================================
//=======================================TEST========================================================
//====================================================================================================
	@BeforeTest
	public void btest() {
		System.out.println("this is class Number 1: ----------------------");
		System.out.println("=====================BEFORE TEST(Car Detail)==================================================");
	}
	@AfterTest
	public void atest() {
		System.out.println("=====================AFTER TEST(Car Detail)==================================================");
	}
//====================================================================================================
//=======================================CLASS========================================================
//====================================================================================================
	@BeforeClass
	public void bclass() {
		System.out.println("=====================BEFORE CLASS(Car Detail)==================================================");
	}
	@AfterClass
	public void aclass() {
		System.out.println("======================AFTER CLASS(Car Detail)=================================================");
	}



}
