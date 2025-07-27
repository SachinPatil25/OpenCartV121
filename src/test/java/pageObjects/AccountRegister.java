package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegister extends BasePage {
	
	//Constructor
	
	public AccountRegister(WebDriver driver)
	{
		super(driver);
	}

	//Locator
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txt_inputFN;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txt_inputLN;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txt_inputemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txt_inputphoneno;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txt_inputpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txt_inputRepassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chk_privacy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btn_continue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement txtconfirmation;
	
	
	//Action Methods
	
	public void setFN(String first_name)
	{
		txt_inputFN.sendKeys(first_name);
	}
	
	public void setLN(String last_name)
	{
		txt_inputLN.sendKeys(last_name);
	}
	
	public void setemail(String email)
	{
		txt_inputemail.sendKeys(email);
	}
	
	public void setphoneno(String phoneno)
	{
		txt_inputphoneno.sendKeys(phoneno);
	}
	
	public void setpassword(String password)
	{
		txt_inputpassword.sendKeys(password);
	}
	
	public void setRepassword(String Repassword)
	{
		txt_inputRepassword.sendKeys(Repassword);
	}
	
	public void setprivacy()
	{
		chk_privacy.click();
	}
	
	public void clkbtn()
	{
		btn_continue.click();
	}
	
	public String verify_Confirmtxt()
	{
		try 
		{
			return(txtconfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	
}
