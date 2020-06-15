package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.testUtil.TestUtils;

public class WindowHandle extends Base {
	
	@Test(invocationCount = 2)
	@Parameters({"url", "username"})
	public static void handleWindows() {
		
		LaunchBrowser();
		driver.get(prop.getProperty("WindowHandle"));
		TestUtils.handleWindows(driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[1]")));
		
	}

}
