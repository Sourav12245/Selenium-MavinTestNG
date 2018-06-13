package com.utilities;


import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robotcall{
	
	public static void PressTab() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
	}
	
	public static void PressEnter() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
}
