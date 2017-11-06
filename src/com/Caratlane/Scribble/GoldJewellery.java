package com.Caratlane.Scribble;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Caratlane.Generic.Ground;
import com.Caratlane.Pom.Account;
import com.Caratlane.Pom.BuyGoldJewellery;
import com.Caratlane.Pom.HomePage;
import com.Caratlane.Pom.MyAccountPage;

public class GoldJewellery extends Ground
{
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
			a.goldJewelleryClick();
			
			BuyGoldJewellery gj=new BuyGoldJewellery(driver);
			gj.verifyGoldJewelleryPage("Buy Gold Jewellery Designs Online at Best Price in India | CaratLane");
			gj.checkBox1Click();
			String url5 = driver.getCurrentUrl();
			String url6 = "https://www.caratlane.com/jewellery/weight+range+from+0+to+2+grams-gold.html";
			Assert.assertEquals(url5, url6);
}
}
}
