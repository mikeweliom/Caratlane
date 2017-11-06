package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;

public class BuyJewelleryForMen extends GenericPage
{
	@FindBy(xpath="//*[@id='listing_mithril_desktop']/div[3]/div/div[2]/section/div[6]/div[1]/aside/section/div[1]/div/ul/li[4]/label")
	private WebElement checkbox;
	
	public BuyJewelleryForMen(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void checkBoxClick()
	{
		checkbox.click();
	}
	
	public void verifyBuyJewelleryForMenPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
}
