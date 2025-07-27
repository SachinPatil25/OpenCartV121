package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.basesetup;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import utilities.DataProviders;


/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/

public class TC003_LoginDDT extends basesetup
{

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriven")
	public void verify_loginDDT(String Myemail, String Mypassword, String exp)
	{
		logger.info("**** Starting TC_003_LoginDDT *****");
		
		try {
	
		//Home page
			HomePage hp=new HomePage(driver);
			hp.clk_my_acc();
			hp.clk_login(); //Login link under MyAccount
				
			//Login page
			LoginPage lp=new LoginPage(driver);
			lp.set_loginemail(Myemail);
			lp.set_loginpassword(Mypassword);
			lp.clk_btnlogin(); //Login button
				
			//My Account Page
			MyAccount myacc=new MyAccount(driver);
			boolean confirMyAccPage= myacc.check_loginsuccess();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(confirMyAccPage==true)
				{
					myacc.clk_logout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(confirMyAccPage==true)
				{
					myacc.clk_logout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");
	}
	
}








