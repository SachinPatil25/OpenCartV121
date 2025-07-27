package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	//Constructor
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	//Locators 
	

	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement btnmy_acc;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement btnregister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement link_login;
	
	//Action Methods
	
	public void clk_my_acc()
	 {
			btnmy_acc.click();
	 }
	
	public void clk_register()
	 {
		btnregister.click();
	 }
	
	public void clk_login()
	 {
		link_login.click();
	 }
	
	
	
}
