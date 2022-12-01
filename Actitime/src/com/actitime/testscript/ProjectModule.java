package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrach;
import com.actitime.pom.TaskList;

public class ProjectModule extends BaseClass{
	
	@Test
	public void createProjectModule() throws InterruptedException
	{
		Reporter.log("Create Project Module", true);
		EnterTimeTrach e=new EnterTimeTrach(driver);
		e.getTasklink().click();
		TaskList t=new TaskList(driver);
		t.getAddNewBtn().click();
		t.getNewProject().click();
		t.getProjectName().sendKeys(".Net-spiders");
		t.getAddProject().click();
		t.getCustProject().click();
		t.getProjectDesc().sendKeys(".Net Training Institute");
		t.getCreateproject().click();
		Thread.sleep(5000);
	}

}
