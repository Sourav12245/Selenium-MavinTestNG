package car;

import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Carowner {
	@Test
	public void name() {
		System.out.println("name: Sourav Ghosh");
	}
	
	@Test
	public void age() {
		System.out.println("age: 26");
	}
	
	@Test
	public void sex() {
		System.out.println("sex: Male");
	}
	
	@Test
	public void DOB() {
		System.out.println("January 08, 1993");
	}
	
	@Test
	public void profession() {
		System.out.println("Software Engineer");
	}
	
	@Test
	public void driver() {
		System.out.println("YES");
	}
	
//====================================================================================================
//=======================================CLASS========================================================
//====================================================================================================
	@BeforeClass
	public void bclass() {
		System.out.println("=====================BEFORE CLASS(Car Owner)==================================================");
	}
	@AfterClass
	public void aclass() {
		System.out.println("======================AFTER CLASS(Car Owner)=================================================");
	}

////====================================================================================================
////=======================================METHOD========================================================
////====================================================================================================
//	@BeforeMethod
//	public void bmethod() {
//		System.out.println("=====================BEFORE METHOD(Car Owner)==================================================");
//	}
//	@AfterMethod
//	public void amethod() {
//		System.out.println("======================AFTER METHOD(Car Owner)=================================================");
//	}
	

}
