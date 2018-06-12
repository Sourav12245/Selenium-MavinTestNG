package com.utilities;


import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robotcall {
	
	public static void presstab() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
	}
	
}
