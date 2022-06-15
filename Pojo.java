package com.Generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Pojo {
	
	private WebDriver driver;
	private String strBaseUrl;
	//private int implicitWait=0;
	private Utilities objUtilities;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getStrBaseUrl() {
		return strBaseUrl;
	}
	
	public void setStrBaseUrl(String strBaseUrl) {
		this.strBaseUrl = strBaseUrl;
	}

	public Utilities getObjUtilities() {
		return objUtilities;
	}

	public void setObjUtilities(Utilities objUtilities) {
		this.objUtilities = objUtilities;
	}

	public SeleniumWrapperFunctions getObjSeleniumWrapperFunctions() {
		return objSeleniumWrapperFunctions;
	}

	public void setObjSeleniumWrapperFunctions(SeleniumWrapperFunctions objSeleniumWrapperFunctions) {
		this.objSeleniumWrapperFunctions = objSeleniumWrapperFunctions;
	}

	/*
	 * public int getImplicitWait() { return implicitWait; }
	 */

	/*
	 * public void setImplicitWait(int implicitWait) {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 * this.implicitWait = implicitWait; }
	 */
	
	

}
