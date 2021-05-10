package Wallethub_pages;
 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wallethub.utils.utils;

 
import org.openqa.selenium.JavascriptExecutor;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

 

public class Wallet_check_stars {
	int flag=0;
	
	WebDriver driver;
	By star1=By.xpath("//div[@class='rating-box-wrapper']") ;
	By dropdown=By.cssSelector("div[class='dropdown second'] span[class='dropdown-placeholder']");
	By health_insurance=By.xpath("//li[normalize-space()='Health Insurance']");                                         
	By write_review=By.xpath("//textarea[@placeholder='Write your review...']");
	By submit_review=By.xpath("//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']");
	By encountered_error=By.xpath("//div[normalize-space()='We encountered an error. Please retry']");
	public Wallet_check_stars(WebDriver driver) 
	{
	this.driver = driver;
	}
	public void navigate_to_url(String url) 
	{
	 driver.navigate().to(url);
	}
	public void Hover_stars() throws Exception 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element= driver.findElement(By.xpath("//review-star[@class='rvs-svg']//div[@class='rating-box-wrapper']//*[local-name()='svg'][4]/*[name()='g'][1]/*[name()='path'][1]"));
		js.executeScript("window.scrollBy(0,1000)");
		// hover over ratings panel to expose ratings stars
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		driver.manage().timeouts().implicitlyWait(utils.implicitwait, TimeUnit.SECONDS);

	    // click specified star
	    
	    System.out.println("stars hoverd and clicked");
	    driver.manage().timeouts().implicitlyWait(utils.implicitwait, TimeUnit.SECONDS);
	    
	}

	 
	
	
   public void click_drop_down()
   {
	   driver.findElement(dropdown).click();
	   driver.findElement(health_insurance).click();
   }
	   
   public void write_review() throws Exception
   {
	    driver.findElement(write_review).sendKeys("This is wallet_hub assignment that I have been doing for past one day. I am sure that this piece of code works fine,This is wallet_hub assignment that I have been doing for past one day. I am sure that this piece of code works fine");
	    driver.findElement(submit_review).click();
	    driver.manage().timeouts().implicitlyWait(utils.implicitwait, TimeUnit.SECONDS);
	   try
	   {
		   
		   
		   driver.findElement(encountered_error);
		   
		   flag=1;
		   
	   }
	   catch(Exception e)
	   {
		   
	   }
	   
	   finally
	   {
		   
		    
		   if (flag==1)
		   throw new Exception("Can't post the review, system faced error,please check it");
	   }
   }
	

}
