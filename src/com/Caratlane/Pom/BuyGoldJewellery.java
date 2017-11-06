package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;

public class BuyGoldJewellery extends GenericPage
{
	@FindBy(xpath="//*[@id='listing_mithril_desktop']/div[3]/div/div[2]/section/div[6]/div[1]/aside/section/div[3]/div/ul/li[1]/label")
	private WebElement checkbox1;
	
	public BuyGoldJewellery(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void checkBox1Click()
	{
		checkbox1.click();
	}
	
	public void verifyGoldJewelleryPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
}
