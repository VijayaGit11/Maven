package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class javascriptDemo extends Base {
	
	@Test
	public void inputWithJavaScript() throws InterruptedException {
		
		LaunchBrowser();
		driver.navigate().to(prop.getProperty("yahooUrl"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement email = driver.findElement(new ByAll(By.id("login-username"), By.name("username")));
		js.executeScript("arguments[0].value='email'",email);
		Thread.sleep(3000);
		driver.quit();
	}

}
