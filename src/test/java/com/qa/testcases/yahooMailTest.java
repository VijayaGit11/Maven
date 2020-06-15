package com.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class yahooMailTest {
	
	@BeforeTest
	public void envSetting() {
		System.out.println("Env setting");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch FF");
	}
	
	
	@BeforeMethod
	public void login() {
		System.out.println("login to app");
	}
	
	@Test
	public void composeMail() {
		System.out.println("compose mail");
	}
	
	@Test
	public void deleteMail(){
		System.out.println("Delete mails");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}

	@AfterClass
	public void quitBrowser() {
		System.out.println("Close app");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Close browser");
	}
}
