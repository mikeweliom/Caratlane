package com.Caratlane.Scribble;

import java.awt.AWTException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Caratlane.Generic.GenericUtils;
import com.Caratlane.Generic.Ground;
import com.Caratlane.Pom.CatalogSearchResultPage;
import com.Caratlane.Pom.CustomerWishListPage;
import com.Caratlane.Pom.HomePage;

@Listeners(com.Caratlane.Generic.iTest.class)
public class SearchAddWishlistCheck extends Ground
{
	@Test
	public void searchAndAddToWishList() throws AWTException
	{
		HomePage hp=new HomePage(driver);
		hp.clickSearch();
		hp.enterSearchContent("ring");
		
		GenericUtils gu=new GenericUtils();
		gu.pressEnterButton();
		
		CatalogSearchResultPage csrp=new CatalogSearchResultPage(driver);
		String title3 = driver.getTitle();
		csrp.verifyCatalogSearchResultPage(title3);
		csrp.wishIconClick();
		csrp.wishDropClick();
		csrp.viewListClick();
		
		String title4 = driver.getTitle();
		CustomerWishListPage cwlp=new CustomerWishListPage(driver);
		cwlp.verifyTitle(title4, ETO);
	}
}
