package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Downloads {
	
	WebDriver driver;
	
	public Downloads(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	

	@FindBy(xpath="//ul[@class='list-unstyled']//a[normalize-space()='Downloads']")
	WebElement dwd;
	
	public void download()
	{
		dwd.click();
	}

}
