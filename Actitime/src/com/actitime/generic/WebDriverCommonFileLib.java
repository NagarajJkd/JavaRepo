package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This is a generic class for calling implicitly wait, explicitly wait and custom wait
 * @author JORAPUR
 */

public class WebDriverCommonFileLib {

	/**
	 * This is a generic method for calling implicit wait
	 * @param driver
	 * @param time
	 */
		public void waitForElementToLoad(WebDriver driver, int time)
		{
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		
	/**
	 * This is a generic method for calling explicit wait
	 * @param driver
	 * @param time_value
	 * @param element
	 */
		public void waitForElementInGui(WebDriver driver, int time_value, WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver, time_value);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		
	/**
	 * 	This is a generic method for calling custom wait
	 * @param element
	 */
		public void customeWaitForElement(WebElement element)
		{
			int i=0;
			while(i<=1000)
			{
				try
				{
					element.isDisplayed();
					break;
				}
				catch(Exception e)
				{
					i++;
				}
			}
		}
		
		
	/**
	 * This is a generic method for calling select the list box element by visible text
	 * @param element
	 * @param text
	 */
		public void select(WebElement element, String text)
		{
			Select s=new Select(element);
			s.selectByVisibleText(text);
		}
		
		/**
		 * This is a generic method for calling select the list box element by index
		 * @param element
		 * @param text
		 */
			public void select(WebElement element, int i)
			{
				Select s=new Select(element);
				s.selectByIndex(i);
			}

}
