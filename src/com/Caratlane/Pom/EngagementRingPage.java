package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;

public class EngagementRingPage extends GenericPage
{
	@FindBy(xpath="//a[@id='wishlistcarttext']")
	private WebElement viewlist;
	
	public EngagementRingPage(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void verifyEngagementRingPagePage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
}
