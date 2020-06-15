package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class AutoCompleteTextBox extends Base {
	
//	@Test
//	public static void AutoCompleteBox() {
//		
//		LaunchBrowser();
//		driver.navigate().to(prop.getProperty("AutoCompleteTextBox"));
//		driver.findElement(By.id("header-search-input")).sendKeys("selenium");
//		List<WebElement> searchResults = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::span[@class='Fw(n)']"));
//		System.out.println("list of elements are " + searchResults.size());
//		for(int i = 0; i<searchResults.size(); i++) {
//			if(searchResults.get(i).getText().contains("selenium tutorial")){
//				searchResults.get(i).click();
//				break;
//			}
//		}
//		
//		closeBrowser();
//	}
	
	@Test
	public static void autoSearch() {
		
		LaunchBrowser();
		driver.navigate().to(prop.getProperty("autoSearchGoogle"));
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> searchResults = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::span[@class='sbl1']"));
		System.out.println("list of elements are " + searchResults.size());
		for(int i = 0; i<searchResults.size(); i++) {
			if(searchResults.get(i).getText().contains("selenium tutorial")){
				searchResults.get(i).click();
				break;
			}
		}
		
		closeBrowser();
	}

}
