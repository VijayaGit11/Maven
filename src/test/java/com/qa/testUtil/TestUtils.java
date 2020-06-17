package com.qa.testUtil;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.qa.base.Base;

import bsh.classpath.BshClassPath.GeneratedClassSource;

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
	
	public static void takeScreenshot(String testMethodName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile =  ts.getScreenshotAs(OutputType.FILE);
//		String path = (System.getProperty("user.dir")+ "/Screenshots/" + TestUtils.formatDate() + ".png");
//		String path = (System.getProperty("user.dir")+ "/Screenshots/" +this.getClass().getName() + "_" + TestUtils.formatDate() + ".png");
		String path = (System.getProperty("user.dir")+ "/Screenshots/" + testMethodName + "_" + TestUtils.formatDate() + ".png");
		FileUtils.copyFile(srcFile, new File(path));
		}
	

	public boolean retry(ITestResult result) {
		
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		return false;
	}
	
	
}
