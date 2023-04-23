package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.SearchPage;
import testBase.BaseClass;

public class TC_003_SearchPage extends BaseClass {
	
	@Test
	public void  test_search() throws InterruptedException
	{
	logger.info(" Starting TC_003_Search ");
	
	    try
	    {
		
	     driver.get(rb.getString("appURL"));
//	     HomePage ap = new HomePage(driver);
	     logger.info("Home Page Displayed ");
	
	     driver.manage().window().maximize();
	  
	     SearchPage sp=new SearchPage(driver);
	
	    // sp.searchtxt("iPhoness");
	     sp.search_txt("iMac");
	     Thread.sleep(2000);
	     logger.info("Enter any Product"); 
	
	     sp.search_button();
	     Thread.sleep(1000);
	    
	   
	     boolean tarpage=sp.isPageExists();
	    
	     if(tarpage)
	    {
	    	logger.info("Search Failed ");
			Assert.assertTrue(true);
	    }
	    
	    else
		{
			logger.error("Search Success ");
			captureScreen(driver, "test_search");
			Assert.assertTrue(true);
		}
	}	
	catch(Exception e)
	{
		logger.fatal("Search Failed ");
		Assert.fail();
	}
	
	logger.info(" Finished TC_004Search ");
	
}
     }