package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	//Constructor
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//Locator
	@FindBy(xpath="//input[@id='input-email']")
	WebElement login_email;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement login_password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement clk_loginbtn;
	
	//Action Methods
	public void set_loginemail(String enteremail)
	{
		login_email.sendKeys(enteremail);	
	}
	
	public void set_loginpassword(String enterpassword)
	{
		login_password.sendKeys(enterpassword);	
	}
	
	public void clk_btnlogin()
	{
		clk_loginbtn.click();
	}
	
}
