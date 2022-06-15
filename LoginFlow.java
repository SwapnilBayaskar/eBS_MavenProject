package com.Flows;

import org.testng.Assert;

import com.Generic.Pojo;
import com.PageFactory.LoginPage;

public class LoginFlow {
	
	private Pojo objPojo;
	private LoginPage objLoginPage;
	
	public LoginFlow(Pojo pojo) {
		this.objPojo = pojo;
		objLoginPage = new LoginPage(objPojo);
	}
	
	public void doLogin() {
		objLoginPage.setUserName("v-khushbut");
		objLoginPage.setPassword("Summer@2018#");
		objLoginPage.clickOnGetStarted();
	}
	
	public String getCurrentPageUrl() {
		String strCurrentUrl = objPojo.getDriver().getCurrentUrl();
		return strCurrentUrl;
	}
	
	public void verifySuccessfulLoginUrl() {
		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/DashBoard/Index";
		Assert.assertEquals(strExpectedUrl, this.getCurrentPageUrl());
	}
	
	public void verifySuccessfulLogOffUrl() {
		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/Account/LogOff";
		Assert.assertEquals(strExpectedUrl, this.getCurrentPageUrl());
	}

}
