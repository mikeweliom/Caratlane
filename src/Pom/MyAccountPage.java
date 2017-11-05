package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.GenericPage;

public class MyAccountPage extends GenericPage
{
	@FindBy(xpath="/html/body/div[4]/div/div[5]/div[1]/div/div/div/div[2]/button/span/span")
	private WebElement ca;
	
	public MyAccountPage(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreateAnaccount ()
	{
		ca.click();
	}
	
	public void verifyCreateAnAccountPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
	
}
