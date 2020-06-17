package com.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.testUtil.TestUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchGoogle extends Base {
	
//	static WebDriver driver;
	
	@Test
	public static void launchGoogle() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		TestUtils.takeScreenshot(null);
		driver.quit();
		
	}

}
