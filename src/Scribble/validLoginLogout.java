package Scribble;

import Generic.Ground;
import Pom.LoginPage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Generic.iTest.class)
public class validLoginLogout extends Ground
{
	@Test
	public void testValidLoginLogout()
	{	
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername("admin");
		
		lp.setPassword("manager");
		
		lp.clickLogin();
		
	}
	
}
