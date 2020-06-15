package com.qa.testUtil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.internal.Systematiser;

import com.qa.base.Base;

public class TakeScreenshots extends Base{
	
	
	public static void takeScreenshot() throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File srcFile =  ts.getScreenshotAs(OutputType.FILE);
	String path = (System.getProperty("user.dir")+ "/Screenshots/" + TestUtils.formatDate() + ".png");
	FileUtils.copyFile(srcFile, new File(path));
	}

}
