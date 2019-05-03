package com.hs.gofmpro.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

import com.hs.gofmpro.utils.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {

		try {
			prop = new Properties();
			//FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/Config.properties");
			File file = new File("/home/zentere/workspace/IFMP/src/test/java/com/hs/gofmpro/utils/Config.properties");
			FileInputStream ip = new FileInputStream(file);
			
			

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","/home/zentere/Downloads/chromedriver/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
		}
			

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);*/

		driver.get(prop.getProperty("url"));
		

	}
}
