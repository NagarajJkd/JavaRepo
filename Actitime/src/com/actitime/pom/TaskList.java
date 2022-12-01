package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	
	//Customer Creation
	
	@FindBy(xpath="//div[.=\"Add New\"]")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCust;
	
	@FindBy(xpath="(//input[@placeholder=\"Enter Customer Name\"])[2]")
	private WebElement custName;
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement custDesc;
	
	@FindBy(xpath="(//div[.=\"- Select Customer -\"])[1]")
	private WebElement selectCust;
	
	@FindBy(xpath="(//div[.=\"Our company\"]/../div[@class='itemRow cpItemRow '])[3]")
	private WebElement Ourcomp;
	
	@FindBy(xpath="//div[.=\"Create Customer\"]")
	private WebElement createCust;
	
	@FindBy(xpath="//div[@Class='titleEditButtonContainer']")
	private WebElement custTitle;
	
	//Project Creation
	
	@FindBy(xpath="//div[.='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement projectName;
	
	@FindBy(xpath="//div[.='Customer:']/../div[2]")
	private WebElement addProject;
	
	@FindBy(xpath="//div[.='-- New Customer --']/../div[.='Big Bang Company']")
	private WebElement custProject;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement projectDesc;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createproject;
	
	//Task Creation
	
	@FindBy(xpath="//div[.='+ New Tasks']")
	private WebElement newTask;
	
	@FindBy(xpath="(//div[@class='comboboxButton'])[1]")
	private WebElement seleCustlist;
	
	@FindBy(xpath="//div[text()='- New Customer -']/following-sibling::div[text()='Our company']")
	private WebElement custselect;
	
	@FindBy(xpath="(//div[@class='comboboxButton'])[2]")
	private WebElement seleProjectList;
	
	@FindBy(xpath="//div[text()='- New Project -']/../div[text()='- SELECTED ACTIVE PROJECTS (by project name) -']")
	private WebElement projectSelect;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement taskname;
	
	@FindBy(xpath="//div[.='Create Tasks']")
	private WebElement createbtn;
	
	
	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNewProject() {
		return newProject;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getAddProject() {
		return addProject;
	}

	public WebElement getCustProject() {
		return custProject;
	}

	public WebElement getProjectDesc() {
		return projectDesc;
	}

	public WebElement getCreateproject() {
		return createproject;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCust() {
		return newCust;
	}

	public WebElement getCustName() {
		return custName;
	}

	public WebElement getCustDesc() {
		return custDesc;
	}

	public WebElement getSelectCust() {
		return selectCust;
	}

	public WebElement getOurcomp() {
		return Ourcomp;
	}

	public WebElement getCreateCust() {
		return createCust;
	}

	public WebElement getCustTitle() {
		return custTitle;
	}

	public WebElement getNewTask() {
		return newTask;
	}

	public WebElement getSeleCustlist() {
		return seleCustlist;
	}

	public WebElement getCustselect() {
		return custselect;
	}

	public WebElement getSeleProjectList() {
		return seleProjectList;
	}

	public WebElement getProjectSelect() {
		return projectSelect;
	}

	public WebElement getTaskname() {
		return taskname;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}
	
	

}
