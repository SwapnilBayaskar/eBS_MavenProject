package com.Flows;

import org.testng.Assert;

import com.Generic.Pojo;

public class HomePageFlow {
	
	private Pojo objPojo;
	
	public HomePageFlow(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	public String getCurrentPageUrl() {
		String strCurrentUrl = objPojo.getDriver().getCurrentUrl();
		return strCurrentUrl;
	}
	
	public void verifyPortfolioProductsPageUrl() {
		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/ConsumerAccount/PortfolioSearch";
		Assert.assertEquals(strExpectedUrl, this.getCurrentPageUrl());
	}
	
	public void verifyQuotesPageUrl() {
		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/ConsumerAccount/QuoteFolder";
		Assert.assertEquals(strExpectedUrl, this.getCurrentPageUrl());
	}

}
