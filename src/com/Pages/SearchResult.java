package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResult extends BasePage {

	public SearchResult(WebDriver driver) {
	
		super(driver);
	
	}
	
	@FindBy(xpath = "//a[text()='About Majesco']")
	private WebElement aboutMajescoLink;

	
	public void clickAboutMajescoLink() throws Exception{
		
		aboutMajescoLink.click();	
		
	}
	
	public boolean checkAboutMajescoLink() {
		
		return aboutMajescoLink.isDisplayed();
	}
}
