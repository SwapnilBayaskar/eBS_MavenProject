package com.Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Flows.HomePageFlow;
import com.Flows.LoginFlow;
import com.Generic.BaseTest;
import com.PageFactory.HomePage;

public class HomePageTest extends BaseTest{
	
	private HomePage objHomePage;
	private LoginFlow objLoginFlow;
	private HomePageFlow objHomePageFlow;
	
	public void initilizeWebPages() {
		objHomePage = new HomePage(this);
		objLoginFlow = new LoginFlow(this);
		objHomePageFlow = new HomePageFlow(this);
	}
	
	@BeforeClass
	public void initilizeWebEnv() {
		this.initilizeWebPages();
		this.initializeWebEnvironment();
	}
	
	@AfterClass
	public void tearDownEnv() {
		this.tearDown();
	}
	
	@Test
	public void TCID_201_VerifyPortfolioProductsPageIsDisplayed() {
		objLoginFlow.doLogin();
		this.waitFor(5);
		objHomePage.clickOnPortfolioProducts();
		objHomePageFlow.verifyPortfolioProductsPageUrl();
	}
	
	@Test
	public void TCID_202_VerifyQuotesPageIsDisplayed() {
		objLoginFlow.doLogin();
		this.waitFor(5);
		objHomePage.clickOnNextModulesArrow();
		this.waitFor(5);
		objHomePage.clickOnQuotesText();
		//this.waitFor(5);
		objHomePageFlow.verifyQuotesPageUrl();
	}
	
	

}
