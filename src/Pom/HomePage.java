package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.GenericPage;

public class HomePage extends GenericPage
{
	@FindBy(xpath="/html/body/div[1]/div[1]/nav[1]/div/div[3]/ul/li[3]/a")
	private WebElement ma;
	
	@FindBy(xpath="/html/body/div[4]/div/div[5]/div[1]/div/div/div/div[2]/button/span/span")
	private WebElement ca;
	
	public HomePage(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}	
	
	public void clickMyaccount ()
	{
		ma.click();
	}
	
	public void clickCreateAnaccount ()
	{
		ma.click();
	}
	
	public void verifyLoginPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
	
	
	
}
