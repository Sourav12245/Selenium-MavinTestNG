package screenshot;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import configfiles.config;

public class utilities extends config{
	/*
	 * Take Screenshot and store in the drsired location
	 * Atribute: String: Screenshotname - Give name of the screenshot
	 */
	public static void takecreenshot(String screenshotname) throws FileNotFoundException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String name = "["+getdateandtime()+"]"+screenshotname;
	
		try {
			FileHandler.copy(source, new File("Screenshots//"+ name +".jpg"));
		} catch (Exception e) {
			System.out.println("Exception:"+e);
		}
	}
	

	/*
	 * Get the System date and return the same
	 */
	public static String getdateandtime(){
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
		Date date = new Date();
		String date1= dateFormat.format(date);
		return date1;
		}
	
	/*
	 * Delete files inside a directory irrespective of format
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
