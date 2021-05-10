package Wallethub_test;
import java.io.IOException;
 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wallet_hub.base.Testbase;
 
import com.wallet_hub.environmentvariables.Properties_File;
 
import  Wallethub_pages.Wallethub_login;
import  Wallethub_pages.Wallet_check_stars;



public class wallethub_assignment extends Testbase
{
	
	
	Wallethub_login objwallet_login_Page;
	Testbase testbase=new Testbase();
	Wallet_check_stars  objWallet_check_stars;
	
	@BeforeTest
	public void setup() throws IOException 
	{
		
	 
		 testbase.Wallet_hub_initialization();
				
	
	}
	
	@Test(priority = 1)
	public void go_to_wallethub_login() throws Exception 
	{
		objwallet_login_Page = new Wallethub_login(driver);
		objwallet_login_Page.verifyTitle();
		objwallet_login_Page.login_link();
		objwallet_login_Page.enteremail(Properties_File.wallet_readprperties(2));
		objwallet_login_Page.enterPasswrod(Properties_File.wallet_readprperties(3));
	 	objwallet_login_Page.click_login();
	 	objwallet_login_Page.verify_login();
				 
		
	}
	@Test(priority=2)
	public void check_stars() throws Exception
	{
		
		objWallet_check_stars = new Wallet_check_stars(driver);
		objWallet_check_stars.navigate_to_url(Properties_File.wallet_readprperties(4));
		
		objWallet_check_stars.Hover_stars(); 
		objWallet_check_stars.click_drop_down();
		objWallet_check_stars.write_review();
		
		
	}

/*	@AfterTest
	public void clean()
	{
		
		driver.close();
		driver.quit();
	}*/
	
}
