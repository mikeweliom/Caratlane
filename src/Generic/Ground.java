package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Ground implements Stable
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openappln()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get("https://www.caratlane.com");
	}
	@AfterMethod
	public void closeappln()
	{
		driver.quit();
	}
}
