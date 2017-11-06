package com.Caratlane.Scribble;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Caratlane.Generic.Ground;
import com.Caratlane.Pom.Account;
import com.Caratlane.Pom.BuyJewelleryForMen;
import com.Caratlane.Pom.HomePage;
import com.Caratlane.Pom.MyAccountPage;

public class MensJewellery extends Ground
{
	@Test
	public void functionalityOfSortBy()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		
		MyAccountPage map=new MyAccountPage(driver);
		map.emailEnter("mike.111.weliom@gmail.com");
		map.passwordEnter("mike004");
		map.signIn();
		Account a=new Account(driver);
		a.verifyAccountPage("Account");
		
		Account acct=new Account(driver);
		acct.hoverJewellery();
		acct.menJewelleryClick();
		
		BuyJewelleryForMen jfm=new BuyJewelleryForMen(driver);
		jfm.verifyBuyJewelleryForMenPage("Buy Jewellery For Men Design Online Price Starting Rs. 4,842 in India");
		jfm.checkBoxClick();
		String url3 = driver.getCurrentUrl();
		String url4 = "https://www.caratlane.com/jewellery/for+men-rs+20001-rs+30000.html?CLNI-9";
		Assert.assertEquals(url3, url4);
}
}
