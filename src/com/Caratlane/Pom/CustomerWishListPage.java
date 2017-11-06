package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;
import com.Caratlane.Generic.GenericUtils;

public class CustomerWishListPage extends GenericPage
{
	@FindBy(xpath="//a[@id='wishlistcarttext']")
	private WebElement viewlist;
	
	public CustomerWishListPage(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void CustomerWishListPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}

}
