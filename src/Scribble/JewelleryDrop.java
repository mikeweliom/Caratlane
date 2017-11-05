package Scribble;

import org.testng.annotations.Test;

import Generic.Ground;
import Pom.EngagementRingPage;
import Pom.HomePage;

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
