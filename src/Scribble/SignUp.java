package Scribble;

import Generic.Ground;
import Pom.HomePage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Generic.iTest.class)
public class SignUp extends Ground
{
	@Test
	public void signUp() throws InterruptedException
	{	
		
		HomePage hp=new HomePage(driver);
		
		hp.clickMyaccount();
		
		String title = driver.getTitle();
		
		hp.verifyLoginPage(title);
		Thread.sleep(10000);
		
		hp.clickCreateAnaccount();
		String title1 = driver.getTitle();
		hp.verifyLoginPage(title1);
		
	}
	
}
