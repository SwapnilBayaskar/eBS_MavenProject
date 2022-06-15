package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Pojo{
	
	private WebDriver driver;
	private String strBaseUrl;
	private Utilities objUtilities;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	
	public void initializeWebEnvironment() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		strBaseUrl = "https://ebs4-qa2.simplifyhealthcare.com/";
		this.setStrBaseUrl(strBaseUrl);
		driver.get(this.getStrBaseUrl());
		this.setDriver(driver);
		
		objUtilities = new Utilities();
		this.setObjUtilities(objUtilities);
		
		objSeleniumWrapperFunctions = new SeleniumWrapperFunctions(this);
		this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunctions);
				
		driver.manage().window().maximize();
		
	}
	
	public void tearDown() {
		driver.close();
	}
	
	public void waitFor(int intSeconds) {
		try {
			Thread.sleep(intSeconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * public void setImplicitWait(int intSeconds) {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(intSeconds)); }
	 */
	
	/*
	 * public void waitFor() { this.getImplicitWait(); }
	 */

}
