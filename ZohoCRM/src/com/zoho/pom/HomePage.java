package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Campaigns")
	private WebElement campaElement;
	
	@FindBy(linkText = "Leads")
	private WebElement leadElement;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampaElement() {
		return campaElement;
	}
	
	public WebElement getLeadElement() {
		return leadElement;
	}
	

}
