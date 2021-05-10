package com.wallet_hub.base;
 
import java.io.IOException;
 
import java.util.Properties;
import java.util.concurrent.TimeUnit;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.wallethub.utils.utils;
import com.wallet_hub.environmentvariables.*;
import org.openqa.selenium.chrome.ChromeDriver;

// this is test base class, all test initialization is done from here
public class Testbase {
	  
	 
   public  static Properties prop;
   public	static int attempts ;
	WebElement uploadElement;
     String  actualResult;
	String expectedResult;
	public static  WebDriver driver;
	 
	
	public void facebook_initializtion() throws IOException
	
	
	{
		System.setProperty("webdriver.chrome.driver",Globals.path+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	 	driver.navigate().to(Properties_File.readproperties(1));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utils.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utils.implicitwait, TimeUnit.SECONDS);
		
		
		
	}
	
public  void Wallet_hub_initialization() throws IOException  
	{
		
		System.setProperty("webdriver.chrome.driver",Globals.path+"\\drivers\\chromedriver.exe");
		driver =  new  ChromeDriver();
		driver.navigate().to(Properties_File.wallet_readprperties(1));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utils.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utils.implicitwait, TimeUnit.SECONDS);
				
		
	}
}



