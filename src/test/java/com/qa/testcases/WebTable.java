package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.Base;

public class WebTable extends Base{
	
	@Test
	public static void handleWebtable() {
		
		LaunchBrowser();
		driver.get(prop.getProperty("webTable"));
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th"));
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]" ;
		
		for(int i =2 ; i<=rows.size(); i++) {
			String actaulXpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actaulXpath));
			if(element.getText().equals("Centro comercial Moctezuma")) {
				
				System.out.println(element.getText());
				break;
			}
			
		}
		
		closeBrowser();
	}

}
