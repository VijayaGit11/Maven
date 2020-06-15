package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class ClickHiddenLink extends Base{
	
	@Test
	public static void clickHiddenLinks() {
		
		LaunchBrowser();
		driver.navigate().to("/http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> maleRadio = driver.findElements(By.id("male"));
		
		for(int i= 0; i<=maleRadio.size(); i++) {
			int x = maleRadio.get(i).getLocation().getX();
			if(x!=0) {
				maleRadio.get(i).click();
				break;
			}
			
		}
		driver.navigate().refresh();
		driver.findElement(By.id("male")).sendKeys(Keys.F5);
		
		closeBrowser();
	}

}
