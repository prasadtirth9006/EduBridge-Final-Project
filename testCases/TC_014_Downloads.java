package testCases;

import org.testng.annotations.Test;

import pageObject.Downloads;
import pageObject.MyAccount;
import testBase.BaseClass;

@Test
public class TC_014_Downloads extends BaseClass {
	
	public void test_Downloads() throws InterruptedException
	{

		logger.info("Starting TC_016_MyAccountInformation");
		 
	    driver.get(rb.getString("appURL"));
		MyAccount mp = new MyAccount(driver);
	    logger.info("Home Page Displayed ");
	    
	    driver.manage().window().maximize();
	    
	    mp.clickMyAccount();
	    logger.info("Clicked On The My Account");
	    Thread.sleep(2000);
	    
	    mp.dashboardLogin();
	    logger.info("Clicked On the Login");
	    Thread.sleep(2000);
	    
	    mp.setEmail("prasadtirth9006@gmail.com");
	    logger.info("Provided Email Address ");
	    Thread.sleep(2000);
	    
	    mp.setPassword("test1234");
	    logger.info("Provided Password");
	    Thread.sleep(2000);
	    
	    mp.clickLogin();
	    logger.info("Clickded On THe Login Button");
	    Thread.sleep(2000);
	    
	    Downloads dwd = new Downloads(driver);
	    
	    dwd.download();
	    logger.info("Clicked On The Download Button");
	    Thread.sleep(2000);
	    
	}

}
