package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccount extends BasePage{

	//Constructor
	public MyAccount(WebDriver driver) 
	{
		super(driver);
		
	}
	
	// Locator
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement Myacc_heading;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement link_logout;
	

	
	//Action Methods
	public boolean check_loginsuccess()
	{
		try
		{
			return(Myacc_heading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		
     }
	 
	public void clk_logout()
	{
		link_logout.click();
	}
	
}
