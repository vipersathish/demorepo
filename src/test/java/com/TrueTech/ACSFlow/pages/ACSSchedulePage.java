package com.TrueTech.ACSFlow.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.TrueTech.ACSFlow.initializer.ACSDriverFunctions;

public class ACSSchedulePage {
	
	
	 public static void clickScheduleLink() throws InterruptedException{
	    	
	    	Thread.sleep(3000);
	    	
	    	ACSDriverFunctions.getElementByXpath("ACS_SCHEDULEPAGE_CLICK_XPATH").click();
	    	
	    }
	    
	  public static void getStatus() throws InterruptedException{
		  
		  Thread.sleep(3000);
		  
		  WebElement status = ACSDriverFunctions.getElementByXpath("ACS_SCHEDULEPAGE_GETTEXT_XPATH");
		  
		String data =  status.getText();
		  
		System.out.println(data);
	  }
	  
	  public static void getstatus1() throws InterruptedException{
		  
		  
		  Thread.sleep(30000);
			 
			// ACSDriverFunctions.driver.navigate().refresh();
			 
		
		 try{
			  
	WebElement status1 =ACSDriverFunctions.getElementByXpath("ACS_SCHEDULEPAGE_GETSTATUS_XPATH");
	
	String data = status1.getText();
	
	System.out.println(data);
	
		 }catch(StaleElementReferenceException e){
			 
			 System.out.println(e.getLocalizedMessage());
		 }
		  
		ACSDriverFunctions.getElementByXpath("ACS_SCHEDULEPAGE_GETSTATUS_XPATH").click();
	  }
	
	  public static void alertPopup() throws InterruptedException{
		  
		  Thread.sleep(3000);
		  
		 ACSDriverFunctions.getElementByXpath("ACS_SCHEDULEPAGE_CLICK_POPUP_XPATH").click();
	  }
	  

}
