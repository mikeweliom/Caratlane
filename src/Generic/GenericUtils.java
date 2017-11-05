package Generic;
import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

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
	
	public void pressEnterButton() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		r.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	}
	
}
