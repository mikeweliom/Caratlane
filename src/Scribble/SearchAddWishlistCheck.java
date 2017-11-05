package Scribble;

import java.awt.AWTException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.GenericUtils;
import Generic.Ground;
import Pom.CatalogSearchResultPage;
import Pom.CustomerWishListPage;
import Pom.HomePage;

@Listeners(Generic.iTest.class)
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
