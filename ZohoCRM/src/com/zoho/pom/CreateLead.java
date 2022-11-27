package com.zoho.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLead {
	
	@FindBy(xpath = "//input[@name='property(Company)']")
	private WebElement companyElement;
	
	@FindBy(xpath = "//select[@name='property(saltName)']")
	private WebElement initialfornameElement;
	
	@FindBy(xpath = "//input[@name='property(First Name)']")
	private WebElement firstnameElement;
	
	@FindBy(xpath = "//input[@name='property(Last Name)']")
	private WebElement lastnameElement;
	
	@FindBy(xpath = "//input[@name='property(Designation)']")
	private WebElement designationElement;
	
	@FindBy(xpath = "//input[@name='property(Email)']")
	private WebElement emailElement;
	
	@FindBy(xpath = "//input[@name='property(Phone)']")
	private WebElement phonenoElement;
	
	@FindBy(xpath = "//input[@name='property(Fax)']")
	private WebElement faxElement;
	
	@FindBy(xpath = "//input[@name='property(Mobile)']")
	private WebElement mobileElement;
	
	@FindBy(xpath = "//input[@name='property(Website)']")
	private WebElement websiteElement;
	
	@FindBy(xpath = "//select[@name='property(Lead Source)']")
	private WebElement leadsourceElement;
	
	@FindBy(xpath = "//select[@name='property(Lead Status)']")
	private WebElement leadstatusElement;
	
	@FindBy(xpath = "//select[@name='property(Industry)']")
	private WebElement industryElement;
	
	@FindBy(xpath = "//input[@name='property(No of Employees)']")
	private WebElement noofemployeesElement;
	
	@FindBy(xpath = "//input[@name='property(Annual Revenue)']")
	private WebElement annualrevenueElement;
	
	@FindBy(xpath = "//select[@name='property(Rating)']")
	private WebElement ratingElement;
	
	@FindBy(xpath = "//img[@title='Campaign Name Lookup']")
	private WebElement lookupElement;
	
	@FindBy(name = "property(Street)")
	private WebElement streetElement;
	
	@FindBy(name = "property(City)")
	private WebElement cityElement;
	
	@FindBy(name = "property(State)")
	private WebElement stateElement;
	
	@FindBy(name = "property(Zip Code)")
	private WebElement zipcodElement;
	
	@FindBy(name = "property(Country)")
	private WebElement countryElement;
	
	@FindBy(name = "property(Description)")
	private WebElement descriptionElement;
	
	@FindBy(xpath = "(//a[text()='Realme'])[1]")
	private WebElement productElement;
	
	@FindBy(name = "Button")
	private WebElement buttonElement;

	public CreateLead(WebDriver driver) {

		PageFactory.initElements(driver, this);
		
	}

	public WebElement getInitialfornameElement() {
		return initialfornameElement;
	}

	public WebElement getFirstnameElement() {
		return firstnameElement;
	}

	public WebElement getLastnameElement() {
		return lastnameElement;
	}

	public WebElement getDesignationElement() {
		return designationElement;
	}

	public WebElement getEmailElement() {
		return emailElement;
	}

	public WebElement getPhonenoElement() {
		return phonenoElement;
	}

	public WebElement getFaxElement() {
		return faxElement;
	}

	public WebElement getMobileElement() {
		return mobileElement;
	}

	public WebElement getWebsiteElement() {
		return websiteElement;
	}

	public WebElement getLeadsourceElement() {
		return leadsourceElement;
	}

	public WebElement getLeadstatusElement() {
		return leadstatusElement;
	}

	public WebElement getIndustryElement() {
		return industryElement;
	}

	public WebElement getNoofemployeesElement() {
		return noofemployeesElement;
	}

	public WebElement getAnnualrevenueElement() {
		return annualrevenueElement;
	}

	public WebElement getRatingElement() {
		return ratingElement;
	}

	public WebElement getLookupElement() {
		return lookupElement;
	}

	public WebElement getstreetElement() {
		return streetElement;
	}

	public WebElement getCityElement() {
		return cityElement;
	}

	public WebElement getStateElement() {
		return stateElement;
	}

	public WebElement getZipcodElement() {
		return zipcodElement;
	}

	public WebElement getCountryElement() {
		return countryElement;
	}

	public WebElement getDescriptionElement() {
		return descriptionElement;
	}

	public WebElement getButtonElement() {
		return buttonElement;
	}

	public WebElement getCompanyElement() {
		return companyElement;
	}

	public WebElement getProductElement() {
		return productElement;
	}
	
	

	
}
