package Scribble;

import org.testng.annotations.Test;

import Generic.Ground;
import Pom.CatalogSearchResultPage;
import Pom.HomePage;
import Pom.NotificationPage;
import Pom.SolitaireJewelleryForWomen;

public class NotificationSearch extends Ground
{
	@Test
	public void notificationSearch()
	{
		HomePage hp=new HomePage(driver);
		hp.notificationClick();
		
		NotificationPage np=new NotificationPage(driver);
		String title6 = driver.getTitle();
		np.verifyNotificationPage(title6);
		np.viewButton1Click();
		
		SolitaireJewelleryForWomen sjfw=new SolitaireJewelleryForWomen(driver);
		String title7 = driver.getTitle();
		sjfw.verifySolitaireJewelleryForWomenPage(title7);
		sjfw.wishListiconClick();
		
		CatalogSearchResultPage csrp=new CatalogSearchResultPage(driver);
		csrp.wishDropClick();
		csrp.viewListClick();
		
		
		
	}
}
