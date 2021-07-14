package com.Pages;

import org.openqa.selenium.WebDriver;

public class MajescoAboutUs extends BasePage {

	public MajescoAboutUs(WebDriver driver) {
		
		super(driver);
		
	}
	
	public String getAboutUsURL() {
		
		return getPageURL();
	}
	
	public String getAboutUSPageTitle() {
		
		return getPageheading();
	}
	

}
