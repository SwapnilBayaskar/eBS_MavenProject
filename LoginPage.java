package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Generic.Pojo;

public class LoginPage {
	
	private Pojo objPojo;
	
	public LoginPage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	
	By loc_inpUsername = By.xpath("//input[@id='UserName']");
	By loc_inpPassword = By.xpath("//input[@id='Password']");
	By loc_btnGetStarted = By.xpath("//button[@class='btn btn-lg btn-primary btn-block btn-signin']");
	
	
	public void setUserName(String strUsername) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpUsername, strUsername));
	}
	
	public void setPassword(String strPassword) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpPassword, strPassword));
	}
	
	public void clickOnGetStarted() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_btnGetStarted));
	}
	
	public void getRandomMobileNumber() {
		System.out.println("Mobile Number : "+objPojo.getObjUtilities().getMobileNumber(8));
	}

}
