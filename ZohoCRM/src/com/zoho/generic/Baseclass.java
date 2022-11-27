package com.zoho.generic;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.zoho.pom.SignInPage;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		
		Reporter.log("Open Browser", true);
		Library l=new Library();
		String url = l.getPropertyData("zurl");
		String un = l.getPropertyData("zusername");
		String pwd = l.getPropertyData("zpassword");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser");
		driver.close();
	}
	
	@BeforeMethod
	public void logIn() throws IOException
	{
		Reporter.log("Log In To ZOHO CRM");
		Library l=new Library();
		String un = l.getPropertyData("zusername");
		String pwd = l.getPropertyData("zpassword");
		SignInPage s=new SignInPage(driver);
		s.setLogin(un, pwd);
	}
	
	@AfterMethod
	public void logOut()
	{
		Reporter.log("LogOut From ZOHO CRM");
		SignInPage s=new SignInPage(driver);
		s.getLogoutbtn().click();
	}
	

}
