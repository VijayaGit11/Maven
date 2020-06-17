package com.qa.testUtil;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.base.Base;

public class Listener extends Base implements ITestListener{
	
	TestUtils utils = new TestUtils();
	
	public void onTestFailure(ITestResult result) {
		try {
			TestUtils.takeScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			System.out.println("Failed test case due to " + e.getMessage());
		}
	}

}
