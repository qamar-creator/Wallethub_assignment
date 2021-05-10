package Facebook_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Home_page {

	
	WebDriver driver;
	By Account_Name=By.xpath("//span[contains(text(),'Zoya Ali')]");
	By what_is_on_mind=By.xpath("//span[normalize-space()=\"What's on your mind, Zoya?\"]");
    By post_button=By.xpath("//span[contains(text(),'Post')]");
	
    public   Home_page(WebDriver driver) 
	{
	this.driver=driver;
	}
	
	public void verify_Account_Name() throws Exception 
	{
		try
		{
	  driver.findElement(Account_Name).getText(); // try to find if reached the home_page
	 
	    }
		catch (Exception e)
		{
			 
			throw new Exception("Not able to get to the home page");
		}
		
	}
	public void set_status_message(String status_message)
	{
	driver.findElement(what_is_on_mind).sendKeys(status_message);
	driver.findElement(post_button).click();
	}
	}
 
