package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;

public class SolitaireJewelleryForWomen extends GenericPage
{
	@FindBy(xpath="(//span[@class='wishlist__icon1'])[1]")
	private WebElement wishlisticon1;
	
	public SolitaireJewelleryForWomen(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void wishListiconClick()
	{
		wishlisticon1.click();
	}
	
	public void verifySolitaireJewelleryForWomenPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
}
