package Facebook_pages;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wallethub.utils.utils;

public class Landing_page {
	
	WebDriver driver;
	 
	By userName = By.cssSelector("#email");
	By password = By.xpath("//input[@placeholder='Password']");
	By Login_button= By.xpath("//button[normalize-space()='Log In']");
	public Landing_page(WebDriver driver) 
	{
	this.driver = driver;
	}
	public void verifyTitle() 
	{
	String Title = driver.getTitle();
	assertEquals("Facebook - Log In or Sign Up", Title);
	}
	public void enterUsername(String username) 
	{
		driver.manage().timeouts().implicitlyWait(utils.implicitwait, TimeUnit.SECONDS);
	
	driver.findElement(userName).sendKeys(username);
	}
	 
	public void enterPasswrod(String pass)
	{
	driver.findElement(password).sendKeys(pass);
	}
	
   public void click_login() throws InterruptedException
   {
	   driver.findElement(Login_button).click();
		   
   }
   
}
