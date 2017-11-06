package com.Caratlane.Generic;
import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class GenericUtils extends Ground
{
	public static void selectByIndex (WebElement ele, int n)
	{
		Select s= new Select(ele);
		s.selectByIndex(n);
	}
	
	public static void selectByValue (WebElement ele, String c)
	{
		Select s= new Select(ele);
		s.selectByValue(c);
	}
	
	public static void selectByVisibleText (WebElement ele, String st)
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
	
	public static void actionClassHover(WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
}
