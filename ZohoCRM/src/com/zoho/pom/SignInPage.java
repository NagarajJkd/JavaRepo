package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	@FindBy(id = "userName")
	private WebElement usernametxb;
	
	@FindBy(id = "passWord")
	private WebElement passwordtxb;
	
	@FindBy(xpath = "//input[@alt='Sign In']")
	private WebElement signinbtn;
	
	@FindBy(linkText = "Logout [rashmi@dell.com]")
	private WebElement logoutbtn;

	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un, String pwd) {
		
		usernametxb.sendKeys(un);
		passwordtxb.sendKeys(pwd);
		signinbtn.click();
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
}
