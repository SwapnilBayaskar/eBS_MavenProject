package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Generic.Pojo;

public class HomePage {
	
	private Pojo objPojo;
	
	public HomePage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	
	By loc_txtPortfolioProducts = By.xpath("//div[text()='Portfolio Products']");
	By loc_icnDashboardReports = By.xpath("//a[@id='executivedashBoard']");
	By loc_tabWorkQueue = By.xpath("(//a[@href='#workQueueTab'])[1]");
	By loc_tabWatchList = By.xpath("(//a[@href='#watchListTab'])[1]");
	By loc_btnNextModulesArrow = By.xpath("(//span[@class='glyphicon glyphicon-chevron-right icons-rightarrow'])[1]");
	By loc_txtQuotes = By.xpath("(//div[text()='Quotes'])[1]");
	By loc_imgUser = By.xpath("//div[@class='pull-right dropdownclick']");
	By loc_txtLogOffLink = By.xpath("//a[@id='confirm']/span");
	By loc_btnConfirmLogOffYes = By.xpath("(//button[text()='Yes'])[1]");
	
	
	public void clickOnPortfolioProducts() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_txtPortfolioProducts));
	}
	
	public void clickOnDashboardReports() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_icnDashboardReports));
	}
	
	public void clickOnNextModulesArrow() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_btnNextModulesArrow));
	}
	
	public void clickOnQuotesText() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_txtQuotes));
	}
	
	public void clickOnWatchListTab() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_tabWatchList));
	}
	
	public void clickOnWorkQueueTab() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_tabWorkQueue));
	}
	
	public void clickOnDashboardIcon() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_icnDashboardReports));
	}
	
	public void clickOnUserImage() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_imgUser));
	}
	
	public void clickOnLogOffLink() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_txtLogOffLink));
	}
	
	public void clickYesOnConfirmLogOffWindow() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_btnConfirmLogOffYes));
	}
	
	public void clickLHSMenuOption(String strMenuOption) {
		By locator = By.xpath("//ul[@id='menu']//a[@id='"+strMenuOption+"']");
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(locator));
		
	}

}
