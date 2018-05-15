package Banking.DebitCard;

//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Carparts {
	@Test(groups = {"build"})
	public void chechis() {
		System.out.println("chechis-1");
	}
	
	@Test(groups = {"regression"})
	public void wheel() {
		System.out.println("wheel-4");
	}
	
	@Test(groups = {"build"})
	public void headlight() {
		System.out.println("headlight-2");
	}
	
	@Test(groups = {"regression"})
	public void taillight() {
		System.out.println("taillight: 2");
	}
	
	@Test(groups = {"build"})
	public void door() {
		System.out.println("Door: 4");
	}
	
	@Test(groups = {"regression"})
	public void window() {
		System.out.println("Window: 4");
	}
	
//====================================================================================================
//=======================================CLASS========================================================
//====================================================================================================
//		@BeforeClass
//		public void bclass() {
//			System.out.println("=====================BEFORE CLASS(Car Parts)==================================================");
//		}
//		@AfterClass
//		public void aclass() {
//			System.out.println("======================AFTER CLASS(Car Parts)=================================================");
//		}

}
