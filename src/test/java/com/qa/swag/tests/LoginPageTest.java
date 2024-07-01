package com.qa.swag.tests;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.qa.swag.base.BaseTest;
import com.qa.swag.constants.AppConstants;
import com.qa.swag.factory.PlaywrightFactory;
import com.qa.swag.pages.HomePage;
import com.qa.swag.pages.LoginPage;


public class LoginPageTest extends BaseTest {
	Page page;
	PlaywrightFactory pf;	
	LoginPage lp = new LoginPage(page);
	
	public LoginPageTest() {
        super(); // Call BaseTest constructor to initialize properties or perform setup
        pf = new PlaywrightFactory(); // Initialize PlaywrightFactory
        lp = new LoginPage(page); // Initialize LoginPage with appropriate parameters if needed
    }
	
	@Test
	public void loginPageTitleTest() {
		String actualTitle = homePage.getHomePageTitle();
		Assert.assertEquals(actualTitle, AppConstants.HOME_PAGE_TITLE);
	}

	@Test
	public void loginPageURLTest() {
		String actualURL = homePage.getHomePageURL();
		Assert.assertEquals(actualURL, prop.getProperty("url"));
	}
	

}
