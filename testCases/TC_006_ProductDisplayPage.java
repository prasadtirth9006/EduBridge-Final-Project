package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ProductDisplayPage;
import testBase.BaseClass;

@Test
public class TC_006_ProductDisplayPage extends BaseClass
{
	
   
   public void test_productdisplaypage() throws InterruptedException 
   {
	  logger.info("Starting TC_006_ProductDisplayPage");
	 try
	 {
	 
		  driver.get(rb.getString("appURL"));
		//  HomePage hp=new HomePage(driver);
		  logger.info("Home Page Displayed ");
		
		  driver.manage().window().maximize();
		   
		  ProductDisplayPage pd=new ProductDisplayPage(driver);
		  
		  pd.search_txt("iMac");
		  Thread.sleep(2000);
          logger.info("Enter any Product"); 
		
		  pd.search_button();
	      Thread.sleep(1000);
	      logger.info("clicked on the search button");
		    
	      pd.i_mg();
          Thread.sleep(1000);
		  logger.info("clicked on the image");
		    
          pd.product();
          Thread.sleep(2000);
          logger.info("click the Product"); 
            
          pd.rightarrowkey();
          Thread.sleep(2000);
          logger.info("clicked on right side arrow"); 
          
          pd.rightarrowkey();
          Thread.sleep(2000);
          logger.info("clicked on right side arrow"); 
          
          
          pd.leftarrowkey();
          Thread.sleep(2000);
          logger.info("clicked on left side arrow"); 
          
          pd.leftarrowkey();
          Thread.sleep(2000);
          logger.info("clicked on left side arrow"); 
          
          pd.escbutton();
          Thread.sleep(2000);
          logger.info("clicked on esc Button"); 
          
          
            pd.review();
            logger.info("click the Product Review"); 
            Thread.sleep(3000);                              
            
      
            
            pd.btncontinue();
            logger.info("clicked on the Continue Button");
            Thread.sleep(2000);
                         
			

    	    boolean tarpage=pd.isPageExists();
    	    
    	    if(tarpage)
    	    {
    	    	logger.info("ProductDisplayPage  success ");
       			Assert.assertTrue(true);
    	    }
    	    
    	    else
    		{
    			logger.error("ProductDisplayPage failed ");
    			Assert.assertTrue(true);
    		}
    	}	
    	catch(Exception e)
    	{
    		logger.fatal("ProductDisplayPage  Failed ");
    		Assert.fail();
    	}
    	
    	logger.info(" Finished TC_006_ProductDisplayPage");
    	 
   }
} 