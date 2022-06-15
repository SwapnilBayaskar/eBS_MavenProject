package com.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Generic.Pojo;

public class PortfolioPage {
	
	private Pojo objPojo;
	
	public PortfolioPage(Pojo pojo) {
		this.objPojo = pojo;
	}
		
	By loc_tabPackageBuild = By.xpath("//a[text()='Package Build']");
	By loc_tabProductBuild = By.xpath("//li[@class='active ui-state-default ui-corner-top ui-tabs-active ui-state-active']");
	By loc_drpSwitchView = By.xpath("(//select[@id='drpViewModeLoad'])[1]");
	By loc_btnProductSearch = By.xpath("//button[@id='switchToadvanceSearch']");
	By loc_btnAddPortfolio = By.xpath("//button[@class='btn-fill-blue pull-right ml10 btn-add-portfolio']");
	By loc_btnPortfolioUpArrow = By.xpath("(//div[@class='fa fa-long-arrow-up'])[3]");
	By loc_btnPortfolioDownArrow = By.xpath("(//div[@class='fa fa-long-arrow-down'])[3]");
	By loc_btnReloadGrid = By.xpath("//span[@id='refresh_pdg']");
	By loc_chkSelectAll = By.xpath("//span[@class='ag-checkbox-unchecked CbSelectChecked']");
	
	public void clickOnPackageBuildTab() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_tabPackageBuild));
	}
	
	public void clickOnProductBuildTab() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_tabProductBuild));
	}
	
	public void selectSwitchViewOption(int intIndex) {
		Select drpSwitchView = new Select(objPojo.getDriver().findElement(loc_drpSwitchView));
		drpSwitchView.selectByIndex(intIndex);
	}
	
	public void clickOnProductSearchButton() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_btnProductSearch));
	}
	
	public void clickOnAddPortfolioButton() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_btnAddPortfolio));
	}
	
	public void clickOnReloadGridButton() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_btnReloadGrid));
	}
	
	public void checkSelectAllCheckbox() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_chkSelectAll));
	}
	

}
