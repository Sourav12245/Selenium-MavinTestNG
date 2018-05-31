package test;

import org.testng.annotations.Test;

public class hloan {
	@Test
	public void homewindow() {
		System.out.println("This is the home WINDOW-1");
	}
	@Test
	public void homedoor() {
		System.out.println("This is the home DOOR-2");
	}
	@Test
	public void homefloor() {
		System.out.println("This is the home FLOOR-3");
	}
	@Test
	public void nameowner() {
		System.out.println("I am the owner");
	}
	@Test(groups= {"Regression","Smoke"})
	public void place() {
		System.out.println("Location: BANGALORE");
	}

}

