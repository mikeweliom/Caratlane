package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;
import com.Caratlane.Generic.GenericUtils;

public class Account extends GenericPage
{
	@FindBy(xpath="//span[contains(.,'SOLITAIRES')]")
	private WebElement solitaires;
	
	@FindBy(xpath="//span[@class='solitairesubmenu__presets__title']")
	private WebElement rings;
	
	@FindBy(xpath="(//span[contains(.,'JEWELLERY')])[1]")
	private WebElement jewellery;
	
	@FindBy(xpath="//a[@href='/jewellery/for+men.html']")
	private WebElement menjwel;
	
	@FindBy(xpath="//span[contains(.,'GOLD')]")
	private WebElement gold;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/div[4]/header/div/div/nav/div[2]/ul/li[2]/div/div/div[1]/div[3]/div[2]/ul/li[3]/a/span[1]")
	private WebElement pendant;
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/div[4]/header/div/div/nav/div[2]/ul/li[1]/div/div/div[2]/ul/li[3]/a")
	private WebElement diamondjwel;
	
	public Account(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void hoverSolotaires()
	{
		GenericUtils.actionClassHover(solitaires);
	}
	
	public void ringClick()
	{
		rings.click();
	}
	
	public void hoverJewellery()
	{
		GenericUtils.actionClassHover(jewellery);
	}
	
	public void menJewelleryClick()
	{
		menjwel.click();
	}
	
	public void goldJewelleryClick()
	{
		gold.click();
	}
	
	public void pendantClick()
	{
		pendant.click();
	}
	
	public void diamondJwelClick()
	{
		diamondjwel.click();
	}
	
	public void verifyAccountPage(String etitle)
	{
		verifyTitle(etitle, ETO);
	}

}
