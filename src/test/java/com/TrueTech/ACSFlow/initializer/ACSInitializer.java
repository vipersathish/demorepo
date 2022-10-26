package com.TrueTech.ACSFlow.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACSInitializer {
	
		
	/**
	 * @author 
	 * @date
	 * @purpose environment variable declared
	 */
	
	
	
	
	public static FileInputStream ACSenvfis = null;
	
	public static Properties ACSenvprop= null;
	
	/**
	 * 
	 * 
	 */
	public static FileInputStream ACSsendkeysfis = null ;
	
	public static Properties ACSsendkeysprop = null ;
	
	/**
	 * 
	 * 
	 * @purpose locator variables declared
	 */
	
	public static FileInputStream ACSlocatorfis = null;
	
	public static Properties ACSlocatorprop = null;
	
	/**
	 * @purpose driver initilize
	 */
	
	public static WebDriver driver = null;
	
	/**
	 * 
	 * 
	 * @throws IOException
	 * @purpose initialize env, locator, webdriver variables
	 */
	
	
	public static void ACSinitialize() throws IOException{
		
		 ACSenvfis = new FileInputStream(new File("C:\\Users\\TTS-USER\\workspace\\com.TrueTech.Screenit.ACSFlow\\configures\\ACSenv.properties"));
		
		 ACSenvprop = new Properties();
		
		ACSenvprop.load(ACSenvfis);
		
		
		 ACSlocatorfis = new FileInputStream(new File("C:\\Users\\TTS-USER\\workspace\\com.TrueTech.Screenit.ACSFlow\\configures\\ACSLocator.properties"));
			
		 ACSlocatorprop = new Properties();
		
		ACSlocatorprop.load(ACSlocatorfis);
		
		
		ACSsendkeysfis = new FileInputStream(new File("C:\\Users\\TTS-USER\\workspace\\com.TrueTech.Screenit.ACSFlow\\configures\\ACSsendkeys.properties"));
		
		ACSsendkeysprop = new Properties();
		
		ACSsendkeysprop.load(ACSsendkeysfis);
		
		
		
		
		
		if(ACSenvprop.get("BROWSER").equals("chrome")){
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
			
			Reporter.log("The chrome browser is open now");
			
		}else if(ACSenvprop.get("BROWSER").equals("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			
		}else if(ACSenvprop.get("BROWSER").equals("ie")){
			
			WebDriverManager.iedriver().setup();
			
			driver = new InternetExplorerDriver();
			
		}
	
		
		driver.manage().window().maximize();
		
		Reporter.log("The browser is maximize");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		
		
}
	
		
		
	
		
		
		
	
	
	
}
