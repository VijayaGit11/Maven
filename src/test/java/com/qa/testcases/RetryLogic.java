package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.testUtil.TestUtils;

public class RetryLogic extends Base{
	
	@BeforeMethod
	public void launchyahoo(){
		LaunchBrowser();
		driver.navigate().to("https://login.yahoo.com/");
	}
	
	@Test
	public void getYahooTitle() {
		Assert.assertEquals(driver.getTitle(), "Yahoo-login");
	}
	
	@Test
	public void loginToYahoo() {
		driver.findElement(By.id("login-username")).sendKeys("sam.duo");
	}
	
	@AfterMethod
	public void tearDown(){
		closeBrowser();
	}

}
