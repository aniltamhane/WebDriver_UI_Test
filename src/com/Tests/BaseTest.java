package com.Tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//import utilities.ReadDataFromExcel;

public class BaseTest {

	
	WebDriver driver;
	Logger logger;
	
	@BeforeClass
	public void tearUP(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger = LogManager.getLogger(getClass());
		logger.info("Browser opened");
		
	}
	
	@AfterClass
	public void tearDown(){
	
			driver.quit();
	}
	
}
