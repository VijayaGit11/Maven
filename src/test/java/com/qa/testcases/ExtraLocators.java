package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtraLocators {
	
	@Test
	public void extraLoc() {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Title is " + driver.getTitle());
		driver.findElement(new ByAll(By.name("email"), By.id("email"), By.xpath("//*[@type='email']"))).sendKeys("username");
		driver.findElement(new ByIdOrName("email")).sendKeys("naveen");
		driver.findElement(new ByChained(By.id("u_0_l"), By.xpath("//*[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"), By.name("firstname"))).sendKeys("firstName");
		driver.quit();
		
	}

}
