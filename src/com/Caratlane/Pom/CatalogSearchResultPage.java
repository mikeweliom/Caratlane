package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;
import com.Caratlane.Generic.Ground;

public class CatalogSearchResultPage extends GenericPage
{
	@FindBy(xpath="//span[@class='wishlist__icon1']")
	private WebElement wishlisticon;
	
	@FindBy(xpath="//a[@class='wishlist_anchor segment_mixpanel']")
	private WebElement wishlistdrop;
	
	@FindBy(xpath="//a[@id='wishlistcarttext']")
	private WebElement viewlist;
	
	public CatalogSearchResultPage(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void wishIconClick()
	{
		wishlisticon.click();
	}
	
	public void wishDropClick()
	{
		wishlistdrop.click();
	}
	
	public void viewListClick()
	{
		viewlist.click();
	}
	
	public void verifyCatalogSearchResultPage(String etitle)
	{
		verifyTitle(etitle, ETO);
	}
	
}
