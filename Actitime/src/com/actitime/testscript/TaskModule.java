package com.actitime.testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.WebDriverCommonFileLib;
import com.actitime.pom.EnterTimeTrach;
import com.actitime.pom.TaskList;

public class TaskModule extends BaseClass{
	

	@Test
	public void createTaskModule() throws InterruptedException
	{
		Reporter.log("Create Task Module", true);
		WebDriverCommonFileLib c=new WebDriverCommonFileLib();
		EnterTimeTrach e=new EnterTimeTrach(driver);
		
		e.getTasklink().click();
		TaskList t=new TaskList(driver);
		t.getAddNewBtn().click();
		t.getNewTask().click();
		t.getSeleCustlist().click();
		t.getCustselect().click();
		WebElement cust = t.getCustselect();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated((By) cust));
		t.getSeleProjectList().click();
		t.getProjectSelect().click();
		t.getTaskname().sendKeys("Special Programe");
		t.getCreatebtn().click();
		
	}
	
	
		

}
