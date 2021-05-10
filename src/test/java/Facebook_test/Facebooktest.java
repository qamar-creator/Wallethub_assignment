package Facebook_test;
 
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wallet_hub.base.*;
 
import com.wallet_hub.environmentvariables.Properties_File;
import com.wallethub.utils.utils;
import  Facebook_pages.Landing_page;
import  Facebook_pages.Home_page;



public class Facebooktest extends Testbase
{
	
	 
	 
	Landing_page objlanding_Page;
	Home_page objHome_page;
	Testbase testbase=new Testbase();
	
	@BeforeTest
	public void setup() throws IOException 
	{
		
	 testbase.facebook_initializtion();
	 
	
	}
	
	@Test(priority = 1)
	public void go_to_facebook_login() throws IOException, InterruptedException 
	{
		 
		objlanding_Page = new Landing_page(driver);
		objlanding_Page.verifyTitle();
		objlanding_Page.enterUsername(Properties_File.readproperties(2));
		objlanding_Page.enterPasswrod(Properties_File.readproperties(3));
		driver.manage().timeouts().implicitlyWait(utils.implicitwait, TimeUnit.SECONDS);
		objlanding_Page.click_login();
		
	}
	@Test(priority = 2)
	public void navigate_to_homepage_set_status() throws Exception 
	{
		
		objHome_page = new Home_page(driver);
		objHome_page.verify_Account_Name();
		objHome_page.set_status_message("Hello World");
	}
	
	@AfterTest
	public void clear()
	{
		
		driver.close();
		driver.quit();
	}
	}

 
