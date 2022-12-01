package com.zoho.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.zoho.generic.Baseclass;
import com.zoho.pom.CreateLead;
import com.zoho.pom.DisplayingCustomViewDetails;
import com.zoho.pom.HomePage;
@Listeners(com.zoho.generic.ListenerImplimentation.class)
public class LeadModule extends Baseclass {

	@Test
	public void testcreateLead() {
		Reporter.log("Create lead", true);
		HomePage h=new HomePage(driver);
		h.getLeadElement().click();
		DisplayingCustomViewDetails d=new DisplayingCustomViewDetails(driver);
		d.getNewleadElement().click();
		CreateLead c=new CreateLead(driver);
		c.getCompanyElement().sendKeys("New Soft Solution");
		WebElement ele = c.getInitialfornameElement();
		Select s=new Select(ele);
		s.selectByIndex(1);
		c.getFirstnameElement().sendKeys("Aira");
		c.getLastnameElement().sendKeys("Kalal");
		c.getDesignationElement().sendKeys("CEO");
		c.getEmailElement().sendKeys("aira@gmail.com");
		c.getPhonenoElement().sendKeys("9108086348");
		c.getFaxElement().sendKeys("54863210");
		c.getMobileElement().sendKeys("9108086348");
		c.getWebsiteElement().sendKeys("www.newsoftsolution.com");
		WebElement ele1 = c.getLeadsourceElement();
		Select s1=new Select(ele1);
		s1.selectByIndex(1);
		WebElement ele2 = c.getLeadstatusElement();
		Select s2=new Select(ele2);
		s2.selectByIndex(3);
		WebElement ele3 = c.getIndustryElement();
		Select s3=new Select(ele3);
		s3.selectByIndex(3);
		c.getNoofemployeesElement().sendKeys("40");
		c.getAnnualrevenueElement().sendKeys("800000");
		WebElement ele4 = c.getRatingElement();
		Select s4=new Select(ele4);
		s4.selectByIndex(2);
		c.getLookupElement().click();
		String pw = driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
		
		for(String w:allwh) {
			driver.switchTo().window(w);
			String wh = driver.getWindowHandle();
			if (wh.equals(pw)) {
				
			}
			else {
				c.getProductElement().click();
			}
			
		}
		driver.switchTo().window(pw);
		
		c.getstreetElement().sendKeys("Vega City Mall");
		c.getCityElement().sendKeys("Banglore");
		c.getStateElement().sendKeys("Karanataka");
		c.getZipcodElement().sendKeys("5670065");
		c.getCountryElement().sendKeys("India");
		c.getDescriptionElement().sendKeys("Got Information");
		c.getButtonElement().click();
		
		
		
		
		
	}

}
