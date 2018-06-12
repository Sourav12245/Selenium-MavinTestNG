package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POMtest.POM_login;
import configfiles.testbase;

public class Testfilecheckertobedeleted extends testbase{
		
		@Test
		public void login() throws Exception {
			POM_login pl = new POM_login(driver);
			pl.setuser();
			log.info("Username is set");
			pl.setpassword();
			log.info("Password is set");
			takecreenshot("login_page");
			pl.clicklogin();
			takecreenshot("after_login_page");
			log.info("Login clicked done");
			
		}
		
		@Test(dependsOnMethods = "login")
		public void homepage() throws Exception {
			Thread.sleep(10000);
//			Actions actions = new Actions(driver);
//			WebElement wel = driver.findElement(By.xpath("//a[@title='Companies'][@href='https://www.freecrm.com/system/index.cfm?action=client']"));
			WebElement wel = driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/system/index.cfm?action=sms'][@title='Text/SMS']"));
			highlight(wel);
//			try {
//				actions.moveToElement(wel);
//			}catch(NoSuchElementException e) {
//				log.info("Mouse action coudnt be done: Reason:"+e.getMessage());
//			}
			
			
		}
		
}
