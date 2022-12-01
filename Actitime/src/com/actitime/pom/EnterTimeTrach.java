package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrach {
	@FindBy(id="logoutLink")
	private WebElement lgobtn;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement tasklink;

	public EnterTimeTrach(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLgobtn() {
		 lgobtn.click();
	}

	public WebElement getTasklink() {
		return tasklink;
	}

}
