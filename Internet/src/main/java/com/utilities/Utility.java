package com.utilities;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	// declare web driver
	public static WebDriver driver;
	/*
	 * Log4g files
	 */
	public Logger log = Logger.getLogger(this.getClass().getName());
	
	/*
	 * Highlight stuffs
	 */
	public static void highlight(WebElement element) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int n = 800;
		for(int i = 1; i<=2;i++) {
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", element);
		Thread.sleep(n);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
		Thread.sleep(n-200);
		n = n - 200;
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", element);
	}
	
	
	
	/*
	 * Takes screenshots
	 */
	public static void take_screenshot(String screen_shot_name) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		String name = getdate() + screen_shot_name;
		FileHandler.copy(f, new File("Screenshots//"+ name +".jpg"));
		
	}
	/*
	 * Get the syatem date and time
	 */
	public static String getdate() {
		DateFormat dateFormat_date = new SimpleDateFormat("dd-MM-yyyy");
		DateFormat dateFormat_time = new SimpleDateFormat("HH-mm-ss");
		Date date = new Date();
		Date time = new Date();
		String date1 = dateFormat_date.format(date);
		String time1 = dateFormat_time.format(time);
		String total_date = "["+date1+"]"+"["+time1+"]";
		return total_date;
	}
	/*
	 * Delete directory
	 */
	public void deletedirectory(String path) {
		File fi = new File(path);
		File[] filez = fi.listFiles();
		for(File f: filez) {
			if(!f.delete()) {
				log.info("Somes files were not deleted");
			}
		}
	}
}
