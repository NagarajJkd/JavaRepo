package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrach;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends BaseClass{
	
	@Test
	public void createCustomerModule() throws InterruptedException
	{
		Reporter.log("Create Customer Module", true);
		EnterTimeTrach e=new EnterTimeTrach(driver);
		e.getTasklink().click();
		TaskList t=new TaskList(driver);
		t.getAddNewBtn().click();
		
		t.getNewCust().click();
		t.getCustName().sendKeys("BTM_001");
		t.getCustDesc().sendKeys("Coaching Service");
		t.getSelectCust().click();
		t.getOurcomp().click();
		t.getCreateCust().click();
		Thread.sleep(5000);
		String expectedTitle = t.getCustTitle().getText();
		String actualTitle = "BTM_001";
		Assertion a=new Assertion();
		a.assertEquals(actualTitle, expectedTitle);
	
	}
	

}
