package com.hs.gofmpro.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {	
		
		System.setProperty("webdriver.chrome.driver","/home/zentere/Downloads/chromedriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");



	}
	
}
