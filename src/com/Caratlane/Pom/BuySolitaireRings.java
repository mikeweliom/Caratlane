package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;

public class BuySolitaireRings extends GenericPage
{
	@FindBy(xpath="//div[@id='sort__a']")
	private WebElement sort;
	
	@FindBy(xpath="(//span[@class='sort__wrap__filter__li__a__span--filter'])[3]")
	private WebElement lowtohigh;
	
	public BuySolitaireRings(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void sortClick()
	{
		sort.click();
	}
	
	public void lowToHighClick()
	{
		lowtohigh.click();
	}
	
	public void verifyBuySolitaireRingsPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
}
