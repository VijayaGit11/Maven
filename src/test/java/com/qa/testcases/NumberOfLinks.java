package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class NumberOfLinks extends Base{
	
	@Test
	public void findLinks() {
		
		LaunchBrowser();
		driver.get(prop.getProperty("yahooUrl"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on page are " + links.size());
		for(int i = 0; i<links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		closeBrowser();
	}

}
