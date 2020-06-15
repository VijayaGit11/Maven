package com.qa.testUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.qa.base.Base;

public class TestUtils extends Base implements IRetryAnalyzer {
	
	public static int counter = 0;
	public static int retryLimit =1;
	
	public static String formatDate() {
	
	Date date = new Date();
	DateFormat format = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	return format.format(date);
	
	}
	
	public static void handleWindows(WebElement element) {
		
		String parentWindow= driver.getWindowHandle();
		System.out.println("Parent widnow name is "+ parentWindow);
		
		element.click();
		
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println("Number of child windows are " + childWindows.size());
		
		for(String child:childWindows) {
			if(!parentWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		driver.close();
	}
	

	public boolean retry(ITestResult result) {
		
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		return false;
	}
	
	
}
