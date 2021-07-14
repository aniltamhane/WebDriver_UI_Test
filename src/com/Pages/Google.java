package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Google extends BasePage {
	
	@FindBy(name ="q")
	private WebElement googleSearchBox;	
	
	@FindBy(xpath ="//input[@name='btnK']")
	private WebElement searchBtn;
	
	public Google (WebDriver driver){
		
		super(driver);			
			
	} 
	
	public void open(String testUrl){
		
		openSite(testUrl);
		
	}
	
	
	public void enterSearchCriteria(String uName){
		
		googleSearchBox.sendKeys(uName);
		
	}
	
	
	public void clickSearch() throws Exception{
		
		clickElement(searchBtn);
	
			
	}
	

}
