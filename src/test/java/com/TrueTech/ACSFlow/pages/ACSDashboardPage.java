package com.TrueTech.ACSFlow.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.TrueTech.ACSFlow.initializer.ACSDriverFunctions;

public class ACSDashboardPage {
	
	public static void clickCreatePost() throws InterruptedException{
		
		Thread.sleep(5000);
		
		ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_CLICK_CREATEPOST_XPATH").click();
	}
	
	public static void enterClientName(String name) throws InterruptedException{
		
		Thread.sleep(3000);
		
		ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_TYPE_CLIENTNAME_XPATH").sendKeys(name);
	}
	
	public static void enterRegisterEmail(String mail){
		
		ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_TYPE_REGISTEREDEMAIL").sendKeys(mail);
	}
	
	public static void SelectBusinessRule(String value){
		
   WebElement unit =ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_SELECT_BUSINESSUNIT_XPATH");

   Select s = new Select(unit);
  
   s.selectByValue(value);;
		
	}
	
	public static void enterATSNumber(String number){
		
		ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_ENTER_ATSNUMBER_XPATH").sendKeys(number);
	}
	
	public static void selectRoles(String title){
		
	WebElement roles =	ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_SELECT_ROLES_XPATH");
	
	Select s = new Select(roles);
	
	s.selectByVisibleText(title);
	
	}
	
   public static void selectValidity(String choosedate){
	   
	   ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_CLICK_VALIDITY_XPATH").click();
	   
	List<WebElement> date =  ACSDriverFunctions.getElementsByXpath("ACS_DASHBOARDPAGE_CLICK_DATE_XPATH");
	
	for(int i=0;i<date.size();i++){
		
		String data = date.get(i).getText();
		
		if(data.equals(choosedate)){
			
			date.get(i).click();
		}
	}
	
	ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_CLICK_OKBUTTON").click();
   }
   
   public static void selectyear(String year){
		
		WebElement selectyears = ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_CLICK_SELECT_CANDIDATEYEAR_XPATH");
			
		Select s = new Select(selectyears);
		
		s.selectByVisibleText(year);
		
		}
		
   public static void selectmonth(String month){
		
		WebElement selectmonths = ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_CLICK_SELECT_CANDIDATEMONTH_XPATH");
		
		Select s = new Select(selectmonths);
		
		s.selectByVisibleText(month);
		
	}
   
   public static void enterJobdescription(String jd){
	   
	   ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_TYPE_JD_XPATH").sendKeys(jd);
   }
   
   public static void clickPost(){
	   
	   ACSDriverFunctions.getElementByXpath("ACS_DASHBOARDPAGE_CLICK_POST_XPATH").click();
   }
   
   public static void postLink() throws InterruptedException{
	   
	   Thread.sleep(5000);
	   
	   ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_CLICK_POSTLINKS_XPATH").click();
   }
   
}
