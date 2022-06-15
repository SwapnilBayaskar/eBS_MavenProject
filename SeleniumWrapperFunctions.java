package com.Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class SeleniumWrapperFunctions {
	
	private Pojo objPojo;
	
	public SeleniumWrapperFunctions(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	public boolean setText(By locator, String strInputValue) {
		try {
			objPojo.getDriver().findElement(locator).sendKeys(strInputValue);
			return true;
			
		} catch (NoSuchElementException exception) {
			System.out.println("Got Error : "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	public boolean click(By locator) {
		try {
			objPojo.getDriver().findElement(locator).click();
			return true;
			
		} catch (NoSuchElementException exception) {
			System.out.println("Got Exception : "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

}
