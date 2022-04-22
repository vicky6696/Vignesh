package com.Maven_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {

	public static WebDriver driver;

	// Browser Launching
	public static void BL() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse-workspace\\Selenium_Testing\\Driver\\chromeversion99.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	// to get URL
	public static void geturl(String urlname) {
		
		driver.get(urlname);
	}
	
	// click
	public static void click (WebElement element) {
	
		element.click();
	}
	
	// to SendKeys
		public static void Sendkeys(WebElement element, String input) {
			element.sendKeys(input);
		}
	
}
