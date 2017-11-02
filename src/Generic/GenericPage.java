package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class GenericPage implements Stable
{
	public WebDriver driver;
	
//	public GenericPage (WebDriver driver)//Constructor
//	{
//		this.driver=driver;
//	}
	
	public void verifyTitle(String etitle,long ETO)
	{
		WebDriverWait wait=new WebDriverWait(driver,ETO);
		try{
			wait.until(ExpectedConditions.titleContains(etitle));
			Reporter.log("Title is maching", true);
		}catch(Exception e){
			
			Reporter.log("Title is not maching", true);
			Assert.fail();
		}
	}
		public void verifyElement(WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver,ETO);
			try{
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("Element is present", true);
			}catch(Exception e){
				
				Reporter.log("Element is not present", true);
				Assert.fail();
			}
		}
	}
