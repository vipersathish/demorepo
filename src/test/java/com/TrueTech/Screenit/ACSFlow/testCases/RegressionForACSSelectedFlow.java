package com.TrueTech.Screenit.ACSFlow.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import com.TrueTech.ACSFlow.initializer.ACSInitializer;
import com.TrueTech.ACSFlow.pages.ACSDashboardPage;
import com.TrueTech.ACSFlow.pages.ACSLoginPage;
import com.TrueTech.ACSFlow.pages.ACSPostPage;
import com.TrueTech.ACSFlow.pages.ACSSchedulePage;

public class RegressionForACSSelectedFlow extends ACSInitializer{
	
	@BeforeSuite
	
	public void setUp() throws IOException{
		
		 ACSinitialize();
	}
	

   @Test(priority =1 , description = "Valid login Creditals")
   
   public void loginPage() throws IOException{
	  
	   
	   driver.get(ACSenvprop.getProperty("ACS_LOGINURL"));
	   
	   ACSLoginPage.enterEmail(ACSsendkeysprop.getProperty("ACS_LOGINPAGE_ENTER_EMAIL"));
	   
	   ACSLoginPage.enterPassword(ACSsendkeysprop.getProperty("ACS_LOGINPAGE_ENTER_PASSWORD"));
	   
	   ACSLoginPage.clickSigninButton();
   }
   
   @Test(priority=2 , description = "post details")
   public void createpost() throws InterruptedException{
	   
	   ACSDashboardPage.clickCreatePost();
	   
	   ACSDashboardPage.enterClientName(ACSsendkeysprop.getProperty("ACS_DASHBOARDPAGE_ENTER_CLIENTNAME"));
	   
	   ACSDashboardPage.enterRegisterEmail(ACSsendkeysprop.getProperty("ACS_DASHBOARDPAGE_ENTER_REGISTEREDEMAIL"));
	   
	   ACSDashboardPage.SelectBusinessRule(ACSsendkeysprop.getProperty("ACS_DASHBOARDPAGE_SELECT_BUSINESSUNIT"));
	   
	   ACSDashboardPage.enterATSNumber(ACSsendkeysprop.getProperty("ACS_DASHBOARDPAGE_ENTER_ATSNUMBER"));
	   
	   ACSDashboardPage.selectRoles(ACSsendkeysprop.getProperty("ACS_DASHBOARDPAGE_SELECT_ROLES"));
	   
	   ACSDashboardPage.selectValidity(ACSsendkeysprop.getProperty("ACS_DASGBOARDPAGE_CHOOSE_DATE"));
	   
	   ACSDashboardPage.selectyear(ACSsendkeysprop.getProperty("ACS_DASHBOARDPAGE_SELECT_YEARS"));
	   
	   ACSDashboardPage.selectmonth(ACSsendkeysprop.getProperty("ACS_DASHBOARDPAGE_SELECT_MONTHS"));
	   
	   ACSDashboardPage.enterJobdescription(ACSsendkeysprop.getProperty("ACS_DASHBOARDPAGE_ENTER_JD"));
	   
	   ACSDashboardPage.clickPost();
   }
   
   @Test(priority=3)
   
   public void postDetails() throws InterruptedException, AWTException{
	   
	   ACSDashboardPage.postLink();
	   
	   ACSPostPage.SelectInterviewer(ACSsendkeysprop.getProperty("ACS_POSTPAGE_CLICK_PANELISTS"));
	
	   ACSPostPage.clickSelectTime();
	   
	   ACSPostPage.ChooseScheduleTime(ACSsendkeysprop.getProperty("ACS_POSTPAGE_CHOOSE_TIME"));
	   
	   ACSPostPage.uploadCandidateResume(ACSsendkeysprop.getProperty("ACS_POSTPAGE_UPLOADCANDIDATERESUME"));
	   
	 //  ACSPostPage.enterAadharcardNumber(ACSsendkeysprop.getProperty("ACS_POSTPAGE_ENTER_AADHARNUM"));
	   
	   ACSPostPage.enterSsnNumber(ACSsendkeysprop.getProperty("ACS_POSTPAGE_ENTER_SSNNUM"));
	   
	   ACSPostPage.clickPreview();
	   
	   ACSPostPage.clickSchedule();
	   
	   ACSSchedulePage.clickScheduleLink();
	   
	   ACSSchedulePage.getStatus();
	   
	   ACSSchedulePage.getstatus1();
	   
	  ACSSchedulePage.alertPopup();
	   
	   
	   
	   
   }

}
