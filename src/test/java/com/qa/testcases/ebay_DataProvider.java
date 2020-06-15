package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.testUtil.readExcelData;

public class ebay_DataProvider extends Base{
	
	@BeforeMethod
	public static void ebayLoginTest() {
		
		LaunchBrowser();
		driver.get(prop.getProperty("ebay"));
	}
	
	@Test(dataProvider = "eBayData", description = "SignUpTest")
	public void signUpTest(String fName, String lName, String emailId, String password) {
		
		driver.findElement(new ByAll(By.id("create-account-link"))).click();
		driver.findElement(By.id("firstname")).sendKeys(fName);
		driver.findElement(By.id("lastname")).sendKeys(lName);
		driver.findElement(By.id("email")).sendKeys(emailId);
		driver.findElement(By.id("PASSWORD")).sendKeys(password);
		driver.findElement(By.id("ppaFormSbtBtn")).click();
	}
	
//	@Test(description = "LoginTest")
//	public void ebayRegistrationTest(String username, String password) {
//		
//		driver.findElement(By.id("userid")).sendKeys(username);
//		driver.findElement(By.id("signin-continue-btn")).click();
////		driver.findElement(By.id("")).sendKeys(password);	
//	}
	
	@DataProvider(name = "eBayData")
	public static Object[][] getTestData() {
		readExcelData.excelDataConfig("C:/Users/HP/Documents/Framework/MavenDemo/src/test/java/com/TestData/TestDataEbay.xlsx", "Sheet1");
		int rows = readExcelData.getRowCount("Sheet1");
		int columns = readExcelData.getColumnCount("Sheet1");
		Object[][] data = new Object[rows][columns];
		for(int i=1; i<rows;i++) {
			for(int j=0; j<columns; j++){
				data[i][i] =  readExcelData.getStringData(i, j, "Sheet1");
				}
			}
		return data;
	}
	
	@AfterMethod
	public void tearDown() {
		closeBrowser();
	}

}
