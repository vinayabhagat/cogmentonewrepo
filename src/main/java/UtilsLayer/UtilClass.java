package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilClass extends BaseClass{
	
	public static void sendKeys(WebElement wb,String value)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
	
	public static void click(WebElement wb)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.click();
		}
	}

}
