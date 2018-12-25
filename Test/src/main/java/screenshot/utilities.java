package screenshot;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import excelReader.Excelworks;

public class utilities extends Excelworks{
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
	/*
	 * Get all the link names
	 */
	public static void getlinkname(By xp) {
		List<WebElement> linkchecker = driver.findElements(xp);
		String[] linknamearray = new String[linkchecker.size()]; 
		System.out.println(linkchecker.size());
		int num = 0;
		for(WebElement i : linkchecker) {
			String linkname = i.getText();
			if(linkname.isEmpty()) {
				continue;
			}else {
					if(linkname.equalsIgnoreCase(null)) {
						int s = linkname.length();
						linknamearray[num] = Integer.toString(s);
					}else {
						linknamearray[num] = linkname;
					}
			}
			num++;
		}
		int k = 1;
		for(String j : linknamearray) {
			System.out.println(k+":"+j);
			k++;
		}
		
		
	}
	
	public static void userwait(long time_in_sec) {
		driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
	}
	
	public static void getnumberoflinks(By xp) {
		List<WebElement> linknumber = driver.findElements(xp); 
		System.out.println(linknumber.size());
	}
	
	public static void gettabdropdownvalues(By tabxp) {
		WebElement tabname = driver.findElement(tabxp);
		List<WebElement> tabdropdown = tabname.findElements(By.xpath("//following-sibling::ul//li//a"));
		String[] str = new String[tabdropdown.size()];
		int num = 0;
		for(WebElement s: tabdropdown) {
			String i = s.getText();
			str[num] = i;
			num++;
		}
		for(String p : str) {
			System.out.println(p);
		}
	}
	public static void highlight(WebElement Element) throws Exception{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int time = 800;
		for(int i = 1; i<=2;i++){
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", Element);
			Thread.sleep(time);
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", Element);
			Thread.sleep(time-200);
			time = time - 200;
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", Element);
	}
}