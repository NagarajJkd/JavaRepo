package com.zoho.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.zoho.generic.Baseclass;
import com.zoho.pom.CreateCampaign01;
import com.zoho.pom.DisplayingCustomViewDetails;
import com.zoho.pom.HomePage;
@Listeners(com.zoho.generic.ListenerImplimentation.class)
public class CreateCampaignModul extends Baseclass {
	@Test
	public void createCampaig() throws InterruptedException{
		Reporter.log("Create Campaign", true);
		HomePage h=new HomePage(driver);
		h.getCampaElement().click();
		DisplayingCustomViewDetails d=new DisplayingCustomViewDetails(driver);
		d.getNewcampaignElement().click();
		CreateCampaign01 c=new CreateCampaign01(driver);
		c.getCampainname().sendKeys("Realme");
		WebElement type = c.getType();
		Select s=new Select(type);
		s.selectByIndex(7);
		c.getStartdate().sendKeys("11/23/2022");
		WebElement status = c.getStatus();
		Select s1=new Select(status);
		s1.selectByIndex(2);
		c.getEnddate().sendKeys("11/26/2022");
		c.getExpectedrev().sendKeys("200000");
		c.getBudgetedcost().sendKeys("800000");
		c.getActualcost().sendKeys("650000");
		c.getExpectedresponse().sendKeys("40000");
		c.getNumsent().sendKeys("40");
		c.getDescription().sendKeys("Good Response");
		c.getButton().click();
		Thread.sleep(3000);		
	}

}
