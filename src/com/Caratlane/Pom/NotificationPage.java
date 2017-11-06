package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;

public class NotificationPage extends GenericPage
{
	@FindBy(xpath="(//button[contains(.,'View Details')])[1]")
	private WebElement viewbutton1;
	
	public NotificationPage(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void viewButton1Click()
	{
		viewbutton1.click();
	}
	
	public void verifyNotificationPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
}
