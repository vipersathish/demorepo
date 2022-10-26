package com.TrueTech.ACSFlow.pages;

import org.testng.Reporter;

import com.TrueTech.ACSFlow.initializer.ACSDriverFunctions;



public class ACSLoginPage {
	
	
	public static void enterEmail(String Email){
		
		ACSDriverFunctions.getElementByXpath("ACS_LOGINPAGE_TYPE_EMAILID_XPATH").sendKeys(Email);
		
		Reporter.log("Loginpage Enter the Email-- "+Email );
		
	}
	
	public static void enterPassword(String Password){
		
		ACSDriverFunctions.getElementByXpath("ACS_LOGINPAGE_TYPE_PASSWORD_XPATH").sendKeys(Password);
		
		Reporter.log("Loginpage Enter the Password --"+ Password);
	}
	
	public static void clickSigninButton(){
		
		ACSDriverFunctions.getElementByXpath("ACS_LOGINPAGE_CLICK_SIGNINBUTTON_XPATH").click();
		
		Reporter.log("Loginpage click the loginbutton navigate to the dashboradpage");
	}


}
