package car;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Carparts {
	@Test
	public void chechis() {
		System.out.println("chechis-1");
	}
	
	@Test
	public void wheel() {
		System.out.println("wheel-4");
	}
	
	@Test
	public void headlight() {
		System.out.println("headlight-2");
	}
	
	@Test
	public void taillight() {
		System.out.println("taillight: 2");
	}
	
	@Test
	public void door() {
		System.out.println("Door: 4");
	}
	
	@Test
	public void window() {
		System.out.println("Window: 4");
	}
	
//====================================================================================================
//=======================================CLASS========================================================
//====================================================================================================
		@BeforeClass
		public void bclass() {
			System.out.println("=====================BEFORE CLASS(Car Parts)==================================================");
		}
		@AfterClass
		public void aclass() {
			System.out.println("======================AFTER CLASS(Car Parts)=================================================");
		}

}
