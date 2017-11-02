package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils
{
	public void selectByIndex (WebElement ele, int n)
	{
		Select s= new Select(ele);
		s.selectByIndex(n);
	}
	
	public void selectByValue (WebElement ele, String c)
	{
		Select s= new Select(ele);
		s.selectByValue(c);
	}
	
	public void selectByVisibleText (WebElement ele, String st)
	{
		Select s= new Select(ele);
		s.selectByVisibleText(st);
	}
	
	
}
