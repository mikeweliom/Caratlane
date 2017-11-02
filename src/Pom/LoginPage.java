package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.GenericPage;

public class LoginPage extends GenericPage
{
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//div[contains(.='Login')]")
	private WebElement login;
	
	@FindBy(xpath="//span[contains(.='Login')]")
	private WebElement errmsg;
	
	public LoginPage(WebDriver driver)
	{
		//super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername (String un1)
	{
		un.sendKeys(un1);
	}
	
	public void setPassword (String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	
	public void clickLogin ()
	{
		login.click();
	}
	
	
	public void verifyLoginPage (String etitle)
	{
		verifyTitle(etitle, 10);
	}
	
	
	
}
