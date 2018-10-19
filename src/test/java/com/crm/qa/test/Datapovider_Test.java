package com.crm.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapovider_Test {
	
	@Test(dataProvider="country")
	public void logintest(String un,String pws)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\pp_lap\\C\\Users\\PC\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://visa.guide");
	    driver.findElement(By.xpath("//*[@id='ember511']/input")).sendKeys(un);;
	    driver.findElement(By.xpath("//*[@id='ember762']/input")).sendKeys(pws);
	    
	    driver.findElement(By.id("btn-login")).click();
	}
	
	@DataProvider(name="country")
	public String [][] passdata()
	{
		String [][]data=new String[1][2];
		data[0][0]="Nepal";
		data[0][1]="India";
		return data;
	}
	

}
