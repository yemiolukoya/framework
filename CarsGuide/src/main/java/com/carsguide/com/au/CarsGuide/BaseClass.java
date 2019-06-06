package com.carsguide.com.au.CarsGuide;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	protected static WebDriver driver;
	 protected WebDriver getDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
			//driver = new FirefoxDriver();
			//driver = new OperaDriver();

		
			
		}
		return driver;
	}
	 
	

}