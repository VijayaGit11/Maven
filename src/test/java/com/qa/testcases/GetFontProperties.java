package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.testUtil.TakeScreenshots;

public class GetFontProperties extends Base{
	
	@Test
	public static void getFontProp() throws IOException {
		
		LaunchBrowser();
		driver.get(prop.getProperty("WikiPage"));
		
		WebElement ele = driver.findElement(By.id("From_today's_featured_article"));
		System.out.println("text is: " + ele.getText());
		
		TakeScreenshots.takeScreenshot();
		
		System.out.println("Font Colour is: " + ele.getCssValue("color"));
		System.out.println("Font size is: " + ele.getCssValue("font-size"));
		System.out.println("Background colour is: "+ ele.getCssValue("background-color"));
		System.out.println("Font format is: "+ ele.getCssValue("font-family"));
	}
	
	@Test
	public static void tearDown() {
		closeBrowser();
	}

}
