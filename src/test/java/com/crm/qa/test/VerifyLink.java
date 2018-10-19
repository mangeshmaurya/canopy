package com.crm.qa.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\pp_lap\\C\\Users\\PC\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
	    driver1.get("https://www.google.co.in/");
	   List<WebElement> linklist=driver1.findElements(By.tagName("a"));
	   
	   List<WebElement> activelink= new ArrayList<WebElement>();
	   
	   for(int i=0;i<=linklist.size();i++){
		   String linkname=linklist.get(i).getAttribute("href");
		  // System.out.println(linkname);
		   URL url=new URL(linkname);
		   HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		   connection.connect();
		   String response=connection.getResponseMessage();
		   System.out.println(linkname+" "+response);
	   }
	}

}
