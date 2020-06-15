package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class KeyPressEvent extends Base{
	
	@Test
	public static void keyEvents() {
		
		LaunchBrowser();
		driver.get(prop.getProperty("Key-Press-Url"));
//		driver.findElement(new ByAll(By.id("content"))).sendKeys(Keys.SPACE);
		
		Actions action = new Actions(driver);
//		action.sendKeys(Keys.TAB).build().perform();
		action.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT);
		action.perform();
		Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: TAB");
		
		driver.quit();
	}

}
