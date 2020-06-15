package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.base.Base;

public class windowsAuthentication extends Base{
	
	@Test
	public static void authenticateWindow() throws IOException {
		Base.LaunchBrowser();
//		Runtime.getRuntime().exec("H:\\Selenium\\AutoIt\\HandleAutoITINternet.exe");
		driver.get(prop.getProperty("internetWeb"));
//		driver.switchTo().alert().sendKeys("username");
	}

}
