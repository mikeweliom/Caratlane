package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.GenericPage;

public class HomePage extends GenericPage
{
	@FindBy(xpath="/html/body/div[1]/div[1]/nav[1]/div/div[3]/ul/li[3]/a")
	private WebElement ma;
	
	@FindBy(xpath="//div[@id='search_container']")
	private WebElement search;
	
	@FindBy(xpath="//div[@id='search']")
	private WebElement searchbar;
	
	@FindBy(xpath="(//span[contains(.,'JEWELLERY')])[1]")
	private WebElement jewellery;
	
	@FindBy(xpath="//a[contains(.,'Engagement')]")
	private WebElement engagementring;
	
	@FindBy(xpath="//div[@id='notification_container']")
	private WebElement notification;
	
	public HomePage(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}	
	
	public void clickMyaccount ()
	{
		ma.click();
	}
	
	public void clickSearch()
	{
		search.click();
	}
	
	public void enterSearchContent(String entercontent)
	{
		searchbar.sendKeys(entercontent);
	}
	
	public void hoverJewellery()
	{
		Actions act=new Actions(driver);
		act.moveToElement(jewellery).perform();
	}
	
	public void engagementRingClick()
	{
		engagementring.click();
	}
	
	public void notificationClick()
	{
		notification.click();
	}
	
	public void verifyLoginPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
	
}
