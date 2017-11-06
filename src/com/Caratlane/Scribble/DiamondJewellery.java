package com.Caratlane.Scribble;

import org.testng.annotations.Test;

import com.Caratlane.Generic.Ground;
import com.Caratlane.Pom.Account;
import com.Caratlane.Pom.HomePage;
import com.Caratlane.Pom.MyAccountPage;

public class DiamondJewellery extends Ground
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
		acc.hoverJewellery();
		acc.diamondJwelClick();
		
	}
}
