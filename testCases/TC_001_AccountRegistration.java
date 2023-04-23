package testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass{
	
	@Test
	public void test_accout_Registration() throws IOException
	{
		logger.info(" Starting TC_001_AccountRegistration ");
		
		try
		{   logger.info("Launching Application");
			driver.get(rb.getString("appURL"));
			
			logger.info("Home Page Displayed ");
			driver.manage().window().maximize();
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account ");
			
			hp.clickRegister();
			logger.info("Clicked on Register ");
			
			AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
			regpage.setFirstName("Prasad");
			logger.info("Provided First Name ");
			
			regpage.setLastName("Tirth");
			logger.info("Provided Last Name ");
			
			regpage.setEmail(randomestring()+"@gmail.com");
			//regpage.setEmail("prasadtirthgmail.com");
			logger.info("Provided Email ");
			
			regpage.setTelephone("1234567890");
			logger.info("Provided Telephone ");
			
			regpage.setPassword("prasad123");
			logger.info("Provided Password ");
			
			regpage.setConfirmPassword("prasad123");
			logger.info("Provided Confirmed Password ");
			
			regpage.setPrivacyPolicy();
			logger.info("Set Privacy Policy ");
			
			regpage.clickContinue();
			logger.info("Clicked on Continue ");
			
			String confmsg=regpage.getConfirmationMsg();
			
			if(confmsg.equals("Your Account Has Been Created!"))
			{
				logger.info("Account Registration Success ");
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Account Registration Failed ");
				captureScreen(driver, "test_account_Registration"); //Capturing screenshot in the screenshot folder==>we mentioned caputure screen method in the base class
				Assert.assertTrue(false);
			}
		}	
		catch(Exception e)
		{
			captureScreen(driver, "test_account_Registration");
			logger.fatal("Account Registration Failed ");
			Assert.fail();
		}
		
		logger.info(" Finished TC_001_AccountRegistration ");
		
	}

	
	
	
}
