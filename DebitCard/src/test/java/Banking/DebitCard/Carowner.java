package Banking.DebitCard;

//import org.testng.annotations.AfterClass;
////import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
////import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Carowner {
	@Test(groups = {"build"})
	public void name() {
		System.out.println("name: Sourav Ghosh");
	}
	
	@Test(groups = {"build"})
	public void age() {
		System.out.println("age: 26");
	}
	
	@Test(groups = {"build"})
	public void sex() {
		System.out.println("sex: Male");
	}
	
	@Test(groups = {"build"})
	public void DOB() {
		System.out.println("January 08, 1993");
	}
	
	@Test(groups = {"build"})
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
//	@BeforeClass
//	public void bclass() {
//		System.out.println("=====================BEFORE CLASS(Car Owner)==================================================");
//	}
//	@AfterClass
//	public void aclass() {
//		System.out.println("======================AFTER CLASS(Car Owner)=================================================");
//	}

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
