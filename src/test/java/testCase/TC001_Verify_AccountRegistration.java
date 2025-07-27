package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.basesetup;
import pageObjects.AccountRegister;
import pageObjects.HomePage;

public class TC001_Verify_AccountRegistration extends basesetup {
	
	@Test(groups= {"Sanity","Master"})
	public void Account_Regi()
	{
		logger.info("****** started verification ********");
		try {
		HomePage hp = new HomePage(driver);
		logger.info("****** click MyAccount********");
		hp.clk_my_acc();
		logger.info("****** click Register********");
		hp.clk_register();
		
		logger.info("****** Provide User Details ********");
		AccountRegister ar = new AccountRegister(driver);
		ar.setFN(randomalpha().toUpperCase());
		ar.setLN(randomalpha().toUpperCase());
		ar.setemail(randomalpha()+"@gmail.com");
		ar.setphoneno(randomnumber());
		String Security = randomalphanumber();
		ar.setpassword(Security);
		ar.setRepassword(Security);
		ar.setprivacy();
		ar.clkbtn();
		String confirmMessage = ar.verify_Confirmtxt();
		if(confirmMessage.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Test Failed....");
			logger.debug("Debug Logs...");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e)
		{
			
			Assert.fail();
		}
		
		logger.info("****** finished verification ********");
	}
	
}
