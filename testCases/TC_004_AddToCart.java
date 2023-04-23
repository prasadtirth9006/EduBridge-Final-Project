package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AddToCart;

import testBase.BaseClass;

@Test
public class TC_004_AddToCart extends BaseClass

{
	public void  test_AddToCart() throws InterruptedException
	{

	 logger.info("Starting TC_004_Addcart");

	 logger.info("Starting TC_004_AddToCart");

	 try
	 {
	 driver.get(rb.getString("appURL"));
	// HomePage hp=  new HomePage(driver);
	 logger.info("Home Page Displayed ");
	 
	 driver.manage().window().maximize();
		
	 AddToCart ac =new AddToCart(driver);
	  ac.search_txt("iMac");
	  
	  Thread.sleep(3000);
		logger.info("Enter any Product"); 
		
		ac.search_button();
		Thread.sleep(3000);
		logger.info("product displayed on HomePage");
		
		ac.addcart();
		logger.info("product added to cart");
		Thread.sleep(2000);//
		
		
		String confmg=ac.getConfirmationMsg();// validation message
		 
		
		
		if(confmg.contains("Success: You have added MacBook to your shopping cart!"))
	        {
		       	 logger.info("Search page is Success ");
	 			  Assert.assertTrue(true);
	 		}
	 		else
	 		{
	 			logger.error("AddToCart  Page Failed ");
	 			captureScreen(driver, "test_add to cart");
				 
				Assert.assertTrue(false);
	 		}
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(" exception occured..handled..");
	    		logger.fatal("Add cart  Failed");
	    		Assert.fail();
	    	
	    	}
	    	logger.info("Finished TC_004_AddToCart");
	    
	}
	
	
}