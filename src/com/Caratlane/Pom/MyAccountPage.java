package com.Caratlane.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Caratlane.Generic.GenericPage;

public class MyAccountPage extends GenericPage
{
	@FindBy(xpath="/html/body/div[4]/div/div[5]/div[1]/div/div/div/div[2]/button/span/span")
	private WebElement ca;
	
	@FindBy(xpath="//input[@title='Email Address']")
	private WebElement email;
	
	@FindBy(xpath="//input[@title='Password']")
	private WebElement password;
	
	@FindBy(xpath="(//span[contains(.,'Sign In')])[3]")
	private WebElement signin;
	
	public MyAccountPage(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreateAnaccount ()
	{
		ca.click();
	}
	
	public void emailEnter(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void passwordEnter(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void signIn()
	{
		signin.click();
	}
	
	
	
	public void verifyCreateAnAccountPage (String etitle)
	{
		verifyTitle(etitle, ETO);
	}
	
}
