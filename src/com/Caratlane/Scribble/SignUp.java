package com.Caratlane.Scribble;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Caratlane.Generic.Ground;
import com.Caratlane.Pom.CreateAnAccount;
import com.Caratlane.Pom.HomePage;
import com.Caratlane.Pom.MyAccountPage;

@Listeners(com.Caratlane.Generic.iTest.class)
public class SignUp extends Ground
{
	@Test
	public void signUp() throws InterruptedException
	{	
		
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		String title = driver.getTitle();
		hp.verifyLoginPage(title);
		
		Thread.sleep(7000);
		
		MyAccountPage map=new MyAccountPage(driver);
		map.clickCreateAnaccount();
		String title1 = driver.getTitle();
		map.verifyCreateAnAccountPage(title1);
		
		Thread.sleep(7000);
		
		CreateAnAccount caa=new CreateAnAccount(driver);
		caa.firstName("mike");
		caa.lastName("weliom");
		caa.mobileNumber("8691877088");
		caa.emailAddress("mike.111.weliom@gmail.com");
		caa.password("mike004");
		caa.confirmPassword("mike004");
		caa.signUp();
		String title2 = driver.getTitle();
		caa.verifyAccountPage(title2);
		
		
		
		
		
	}
	
}
