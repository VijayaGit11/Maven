package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.base.Base;
import com.qa.testUtil.Listener;

@Listeners(Listener.class)
public class SoftAssertion extends Base	 {
	
	@Test
	public static void softAssert() {
		SoftAssert soft = new SoftAssert();
		LaunchBrowser();
		driver.navigate().to("https://login.yahoo.com/");
		soft.assertEquals(driver.getTitle(), "Yahoo-login");
		driver.findElement(By.id("login-username")).sendKeys("sam.duo");
		soft.assertAll();
	}
	
	@AfterMethod
	public void tearDown(){
		closeBrowser();
	}

}
