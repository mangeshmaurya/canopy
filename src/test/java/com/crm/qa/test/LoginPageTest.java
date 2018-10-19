package com.crm.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	 
	public LoginPageTest(){
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		LoginPage loginpage = new LoginPage();
		
	}
	
	@Test
	public void LoginTest(){
		LoginPage.login(prop.getProperty("tocountry"), prop.getProperty("fromcountry"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//LoginPage.creatreport(prop.getProperty("name"),prop.getProperty("type"));
		
		driver.findElement(By.xpath("//*[@id='95']")).click();
	    driver.findElement(By.xpath("//*[@id='menu']/li[7]/ul/li[1]/a")).click();
	    
		String reporttemplate=driver.findElement(By.xpath("//*[@id='reportingManage']/div[5]/table/tbody/tr[3]/td[5]")).getText();
		System.out.println(reporttemplate);
		String reportname1=prop.getProperty("name");
		Assert.assertEquals(reportname1, reporttemplate);
		System.out.println("Test Case Pass");
		
	}
	
	@Test
	public void logoutweb(){
		LoginPage.logout();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	

}
