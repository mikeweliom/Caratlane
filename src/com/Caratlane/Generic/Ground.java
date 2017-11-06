package com.Caratlane.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Ground implements Stable
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void openappln()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.caratlane.com/");
	}
	@AfterMethod
	public void closeappln()
	{
		driver.quit();
	}
}
