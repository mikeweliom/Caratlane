package com.Caratlane.Scribble;

import org.testng.annotations.Test;

import com.Caratlane.Generic.Ground;
import com.Caratlane.Pom.EngagementRingPage;
import com.Caratlane.Pom.HomePage;

public class JewelleryDrop extends Ground
{
	@Test
	public void jewelleryDropSelect()
	{
		HomePage hp=new HomePage(driver);
		hp.hoverJewellery();
		hp.engagementRingClick();
		
		EngagementRingPage er=new EngagementRingPage(driver);
		String title5 = driver.getTitle();
		er.verifyEngagementRingPagePage(title5);
	}
}
