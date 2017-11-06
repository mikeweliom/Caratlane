package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;

public class CreateAnAccount extends GenericPage
{
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstname;

	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@id='email_address']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@id='confirmation']")
	private WebElement confir;
	
	@FindBy(xpath="//button[@class='button']")
	private WebElement button;
	
	public CreateAnAccount(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void firstName(String fn)
	{
		firstname.sendKeys(fn);
	}
	
	public void lastName(String ln)
	{
		lastname.sendKeys(ln);
	}
	
	public void mobileNumber(String mob)
	{
		mobile.sendKeys(mob);
	}
	
	public void emailAddress(String em)
	{
		email.sendKeys(em);
	}
	
	public void password(String pa)
	{
		pass.sendKeys(pa);
	}
	
	public void confirmPassword(String con)
	{
		confir.sendKeys(con);
	}
	
	public void signUp()
	{
		button.click();
	}
	public void verifyAccountPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
}
