package com.crm.qa.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapovider_Test_Excel {
	
	
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
	public Object [][] passdata() throws Exception
	{
		ExcelDataConfig config=new ExcelDataConfig("D:\\pp_lap\\D\\Old Laptop\\D\\eclipse\\workspace\\FreeCRMtestname\\src\\main\\java\\com\\crm\\qa\\testdata\\Test_Data.xlsx");
		
		int rows=config.getRowCount(0);
		Object [][]data=new Object[rows][2];
		for(int i=0;i<rows;i++)
		{
			data[i][0]=config.getData(0, i, 0);
			//data[i][0]=config.getData(0, i, 1);
			
		}
		return data;
	}
	

}
