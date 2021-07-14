package com.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.Google;
import com.Pages.MajescoAboutUs;
import com.Pages.SearchResult;
import com.Utilities.ReadProperties;

public class TestCases extends BaseTest {
	
	Google objGoogle;
	MajescoAboutUs objMajescoAboutUs ;
	SearchResult objSearchResult;
	ReadProperties prop;
	
		
	@Test (priority =1)
	public void OpenGoogleAndSearch() throws Exception{
		
		objGoogle = PageFactory.initElements(driver, Google.class);
		objSearchResult = PageFactory.initElements(driver, SearchResult.class);
		prop = new ReadProperties();
		
		objGoogle.openSite(prop.getTestUrl());
		logger.info("Url entered.");
		objGoogle.enterSearchCriteria("Majesco");
		logger.info("Entered Search Criteria.");
				
		objGoogle.clickSearch();
		logger.info("Search button clicked.");
		Assert.assertEquals(objSearchResult.checkAboutMajescoLink(), true, "About Majesco link Not displayed");
		logger.info("Test case OpenGoogleAndSearch - PASS. About Majesco link displayed");
		
	}
		
	@Test (priority =2)
	public void clickOnAboutUS() throws Exception{
	
		objMajescoAboutUs = PageFactory.initElements(driver, MajescoAboutUs.class);
		
		objSearchResult.clickAboutMajescoLink();
		
		if (objMajescoAboutUs.getAboutUSPageTitle().trim().equals("Insurance Software Companies | Next-Gen Insurance Software")){
			
			logger.info("Test Case clickOnAboutUS PASS");
						
		}
		
		else {
			
			logger.error("Test Case clickOnAboutUS FAIL. Actual Title is: " + objMajescoAboutUs.getAboutUSPageTitle());
		}
		
						
	}
	
		
}


