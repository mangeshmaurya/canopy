package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "username")
	static
	private WebElement tocountry;
	
	@FindBy(name="password")
	static
	private WebElement fromcountry;
	
	@FindBy(name="ember763")
	static
	private WebElement purpose;
	
	@FindBy(name="returnUrl")
	static
	private WebElement getstarted;
	
	@FindBy(xpath = "//*[@id='95']")
	static
	private WebElement report;
	
	@FindBy(xpath = "//*[@id='menu']/li[7]/ul/li[1]/a")
	static
	private WebElement reporttemplate;
	
	@FindBy(xpath = "//*[@id='reportingManage']/div[1]/div/a[1]")
	static
	private WebElement reporttemplate1;
	
	@FindBy(id = "reportName")
	static
	private WebElement reportName;
	
	@FindBy(xpath = "//*[@id='baseReports-list']/span/input")
	static
	private WebElement description;
	
	@FindBy(xpath = "/html/body/div[26]/div/div/form/div[2]/div/div[6]/div/span[1]/span")
	static
	private WebElement selecttemplate;
	
	@FindBy(xpath = "//*[@id='reportTypes-list']/span/input")
	static
	private WebElement BaseTemplate;
	
	@FindBy(xpath = "//*[@id='baseReports-list']/span/input")
	static
	private WebElement BaseTemplate1;
	
	@FindBy(xpath = "//*[@id='baseReports_listbox']/li[4]")
	static
	private WebElement BaseTemplate2;
	
	@FindBy(xpath="/html/body/div[26]/div/div/form/div[1]/div[4]/button")
	static
	private WebElement savebtn;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/header/div[2]/ul/li")
	static
	private WebElement logoutdd;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/header/div[2]/ul/li/ul/li[3]/a")
	static
	private WebElement logout;
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public static void login(String un, String pwd){
		tocountry.sendKeys(un);
		fromcountry.sendKeys(pwd);
		getstarted.click();
				
		
	}
	
	public static void creatreport(String uni,String type){
		report.click();
		reporttemplate.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reporttemplate1.click();
		reportName.sendKeys(uni);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		selecttemplate.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BaseTemplate1.sendKeys(type);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BaseTemplate2.click();
		savebtn.click();
	}
	
	public static void logout(){
		logoutdd.click();
		logout.click();
		
	}
}
