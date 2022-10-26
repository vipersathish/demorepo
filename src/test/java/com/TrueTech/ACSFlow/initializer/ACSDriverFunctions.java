package com.TrueTech.ACSFlow.initializer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ACSDriverFunctions extends ACSInitializer{

	

	public static void getElementById() {

	}

	public static void getElementByName() {

	}

   
	public static WebElement getElementByXpath(String xpath) {
		try{
	return	driver.findElement(By.xpath( ACSlocatorprop.getProperty(xpath)));
	}catch(Exception e){
		
		System.out.println(e.getLocalizedMessage());
	}
  return null;
	}
	
	
	public static List<WebElement> getElementsByXpath(String lists){
		
		try{
	return	driver.findElements(By.xpath(ACSlocatorprop.getProperty(lists)));
		
	}catch(Exception e){
		
		System.out.println(e.getLocalizedMessage());
	}
		return null;
	}

	
	

}
