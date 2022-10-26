package com.TrueTech.ACSFlow.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import com.TrueTech.ACSFlow.initializer.ACSDriverFunctions;



public class ACSPostPage {
	
	
	public static void SelectInterviewer(String num) throws InterruptedException{
		
		Thread.sleep(3000);
		
	List<WebElement> panel = ACSDriverFunctions.getElementsByXpath("ACS_POSTPAGE_CLICK_PANELISTS_XPATH");
	
	int value = Integer.parseInt(num);
	
	for(int i=0;i<panel.size();i++){
		
		if(i==value){
			
			panel.get(i).click();
		}
	}
	}
	
	public static void clickSelectTime() throws InterruptedException{
		
		Thread.sleep(3000);
		
		ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_CLICK_SELECTTIME_XPATH").click();
		
	}
	
	public static void ChooseScheduleTime(String time) throws InterruptedException{
		
		Thread.sleep(3000);
		
	
	List<WebElement> times = ACSDriverFunctions.getElementsByXpath("ACS_POSTPAGE_CHOOSE_TIME_XPATH");
	
	for(int i=0;i<times.size();i++){
		
	String data = times.get(i).getText();
	
	if(data.equals(time)){
		
		times.get(i).click();
	}
	}
		
		  
	}
	
public static void uploadCandidateResume(String file) throws AWTException, InterruptedException{
		
		
		
		ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_CLICK_UPLOADCANDIDATERESUME_XPATH").click();
		
		Thread.sleep(3000);
		
		StringSelection ss = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);	
		
	}
   
    public static void enterAadharcardNumber(String number) throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
    	ACSDriverFunctions.getElementByXpath("ACS_POASTPAGE_ENTER_AADHARCARDNUMBER_XPATH").sendKeys(number);
    }
    
    public static void enterSsnNumber(String ssn) throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
    	ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_ENTER_SSNNUMBER_XPATH").clear();
    	
    	ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_ENTER_SSNNUMBER_XPATH").sendKeys(ssn);
    	
    }
    
    public static void clickPreview() throws InterruptedException{
    	
    	ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_CLICK_PREVIEW_XPATH").click();
    	
    	Thread.sleep(5000);
    	
    	WebElement view = ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_CLICK_BACK_XPATH");
    	
    	((JavascriptExecutor) ACSDriverFunctions.driver).executeScript("arguments[0].scrollIntoView(true);", view);
		
    	ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_CLICK_BACK_XPATH").click();
    	
    }
    
    public static void clickSchedule() throws InterruptedException{
    	
    	ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_CLICK_SCHEDULE_XPATH").click();
    	
    	Thread.sleep(3000);
    	
    WebElement view = ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_CLLICK_POPUP_XPATH");	
    	
    	((JavascriptExecutor) ACSDriverFunctions.driver).executeScript("arguments[0].scrollIntoView(true);", view);	
    	
    	
    	ACSDriverFunctions.getElementByXpath("ACS_POSTPAGE_CLLICK_POPUP_XPATH").click();
    }
    
   
    
    
    

}
