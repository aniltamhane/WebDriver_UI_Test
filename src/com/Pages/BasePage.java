package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	WebDriverWait wait;
	Actions action;
	JavascriptExecutor js;
	

	public BasePage (WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	

	public void openSite(String url){
		
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	
	public void waitForelementToBeClickable(WebElement element){
		
		wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	

	public void submitAlert(){
		
		driver.switchTo().alert().accept();
		
	}	
	

	public String getText(WebElement element){
		
		return element.getText();
		
	}
	
	public String getPageheading() {
		
		return driver.getTitle();
		
	}
	
	public String getPageURL() {
		
		return driver.getCurrentUrl();
	}

	public void moveToElement(WebElement element){
		
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}
	
   public void clickElement(WebElement element1){
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element1);
	}

	
	
}
