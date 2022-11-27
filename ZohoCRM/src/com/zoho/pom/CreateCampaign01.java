package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaign01 {
	@FindBy(name = "property(Campaign Name)")
	private WebElement campainname;
	
	@FindBy(name = "property(Start Date)")
	private WebElement startdate;
	
	@FindBy(name = "property(Expected Revenue)")
	private WebElement expectedrev;
	
	@FindBy(name = "property(Actual Cost)")
	private WebElement actualcost;
	
	@FindBy(name = "property(Num sent)")
	private WebElement numsent;
	
	@FindBy(name = "property(Type)")
	private WebElement type; //use select class index 7
	
	@FindBy(name = "property(Status)")
	private WebElement status; // use select class index 2
	
	@FindBy(name = "property(End Date)")
	private WebElement enddate;
	
	@FindBy(name = "property(Budgeted Cost)")
	private WebElement budgetedcost;
	
	@FindBy(name = "property(Expected Response)")
	private WebElement expectedresponse;
	
	@FindBy(name = "property(Description)")
	private WebElement description;
	
	@FindBy(name = "Button")
	private WebElement button;

	public CreateCampaign01(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampainname() {
		return campainname;
	}

	public WebElement getStartdate() {
		return startdate;
	}

	public WebElement getExpectedrev() {
		return expectedrev;
	}

	public WebElement getActualcost() {
		return actualcost;
	}

	public WebElement getNumsent() {
		return numsent;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getEnddate() {
		return enddate;
	}

	public WebElement getBudgetedcost() {
		return budgetedcost;
	}

	public WebElement getExpectedresponse() {
		return expectedresponse;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getButton() {
		return button;
	}	

}
