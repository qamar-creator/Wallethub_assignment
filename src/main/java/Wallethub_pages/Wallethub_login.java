package Wallethub_pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wallethub.utils.utils;

public class Wallethub_login {
	
	

	WebDriver driver;
	By Login_link=By.xpath("//a[@class='login']") ;
	By email = By.xpath("//input[@placeholder='Email Address']");
	By password = By.xpath("//input[@placeholder='Password']");
	By Login_button= By.xpath("//span[@ng-if='!pending']");
	By Profile_name=By.xpath("//span[normalize-space()='qamar']");
	public Wallethub_login(WebDriver driver) 
	{
	this.driver = driver;
	}
	public void verifyTitle() 
	{
	String Title = driver.getTitle();
	assertEquals("WalletHub: Free Credit Scores, Reports & Credit Improvement", Title);
	}
	public void login_link() 
	{
	driver.findElement(Login_link).click();
	}
	 
	public void enteremail(String user_email)
	{
		driver.findElement(email).sendKeys(user_email);
	}
	public void enterPasswrod(String pass)
	{
	driver.findElement(password).sendKeys(pass);
	}
	
   public void click_login() throws InterruptedException
   {
	   driver.findElement(Login_button).click();
	   driver.manage().timeouts().pageLoadTimeout(utils.page_load_timeout, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(utils.implicitwait, TimeUnit.SECONDS);
   }
   public void verify_login() throws Exception
   {
	   try
	   {
   driver.findElement(Profile_name).getText(); 
	 System.out.println("successfully logged in");
	   }
	   catch (Exception e)
		{
			 
			throw new Exception("Not able to get on the home page");
		}
	  
   }
}
