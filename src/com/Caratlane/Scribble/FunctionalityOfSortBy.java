package com.Caratlane.Scribble;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Caratlane.Generic.Ground;
import com.Caratlane.Pom.Account;
import com.Caratlane.Pom.BuySolitaireRings;
import com.Caratlane.Pom.HomePage;
import com.Caratlane.Pom.MyAccountPage;

public class FunctionalityOfSortBy extends Ground
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
		
		Account acc=new Account(driver);
		acc.hoverSolotaires();
		acc.ringClick();
		
		BuySolitaireRings bsr=new BuySolitaireRings(driver);
		bsr.verifyBuySolitaireRingsPage("Buy Solitaire Rings Design Online Price Starting Rs. 24,845 in India");
		bsr.sortClick();
		bsr.lowToHighClick();
		String url = driver.getCurrentUrl();
		String url2 = "https://mobile.caratlane.com/catalog/jewellery/solitaire-rings-by-price-lowtohigh.html?CLNI-9";
		Assert.assertEquals(url, url2);
		
	}
}
