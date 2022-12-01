package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrach;
import com.actitime.pom.LoginPage;

public class BaseClass {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		Reporter.log("Open Browser", true);
		driver=new ChromeDriver();
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close Browser",true);
		driver.close();
	}
	
	@BeforeMethod
	public void logIn() throws IOException
	{
		Reporter.log("Log in",true);
		FileLib f=new FileLib();
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pw);
	}
	
	@AfterMethod
	public void logOut()
	{
		Reporter.log("Log Out",true);
		EnterTimeTrach e=new EnterTimeTrach(driver);
		e.setLgobtn();
	}
	
}
