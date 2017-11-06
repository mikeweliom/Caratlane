package Scribble;

import org.testng.annotations.Test;

import Generic.Ground;
import Pom.HomePage;

public class FunctionalityOfSortBy extends Ground
{
	@Test
	public void functionalityOfSortBy()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		
		
	}
}
