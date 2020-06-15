package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Base() {
		
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:/Users/HP/Documents/Framework/MavenDemo/src/test/java/com/qa/config/config.properties");
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception " + e + " occured while loading the Environment varibales");
		}
	}
	
	public static void LaunchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.get(prop.getProperty("internetUrl"));
	}
	
	
	public static void closeBrowser() {
	driver.quit();
	}

}
