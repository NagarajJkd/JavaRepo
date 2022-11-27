package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustomViewDetails {
	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement newcampaignElement;
	
	@FindBy(xpath = "//input[@value='New Lead']")
	private WebElement newleadElement;

	public DisplayingCustomViewDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNewleadElement() {
		return newleadElement;
	}

	public WebElement getNewcampaignElement() {
		return newcampaignElement;
	}
	
	

}
