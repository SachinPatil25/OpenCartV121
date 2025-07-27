package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.basesetup;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;

public class TC002_LoginTest extends basesetup{

	
	@Test(groups= {"Regression","Master"})
	public void Verify_login_functionality()
	{
		logger.info("******** Started loginTest *********");
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clk_my_acc();
		hp.clk_login();
		
		LoginPage lp = new LoginPage(driver);
		lp.set_loginemail(p.getProperty("loginEmail"));
		lp.set_loginpassword(p.getProperty("loginPassword"));
		lp.clk_btnlogin();
		
		MyAccount myacc = new MyAccount(driver);
		boolean confirMyAccPage = myacc.check_loginsuccess();
		Assert.assertTrue(confirMyAccPage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("****** Finished LoginTest *********");
		
	}
	
	
}
