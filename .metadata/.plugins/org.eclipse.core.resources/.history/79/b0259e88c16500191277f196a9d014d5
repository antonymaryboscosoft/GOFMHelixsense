package com.hs.gofmpro.utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.hs.gofmpro.base.TestBase;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;

	public static  String captureScreenshot(WebDriver driver,String screenshotName)
	
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String dest =System.getProperty("user.dir")+"/ErrorScreenshot/"+screenshotName+".png";
			File destination = new File(dest);
			FileUtils.copyFile(source,destination );
			System.out.println("Screen shot taken");
			return dest;
		}
catch (Exception e)
		{
			System.out .println("Exception while taking the screen shot"+e. getMessage());
			return e.getMessage();
		} }
}

