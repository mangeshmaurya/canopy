package com.crm.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSequence {
	
	@BeforeSuite
	public void beforesuitest()
	{
		System.out.println("BeforeSuit executed");
	}

	@BeforeTest
	public void beforetestest()
	{
		System.out.println("BeforeTest executed");
	}
	
	@BeforeMethod
	public void beforemethodtest()
	{
		System.out.println("BeforeMethod executed");
	}
	
	@Test(priority=1)
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void Test2()
	{
		int a=10;
		if(a<=10){
		System.out.println("Test2");
		}
	}
	
	@AfterMethod
	public void Aftermethodtest()
	{
		System.out.println("Aftermethod executed");
	}
	
	@AfterTest
	public void Aftertestest()
	{
		System.out.println("AfterTest executed");
	}
	
	@AfterSuite
	public void Aftersuitest()
	{
		System.out.println("AfterSuit executed");
	}
	@BeforeClass
	public void Beforeclasstest()
	{
		System.out.println("Before class executed");
	}
	
	@AfterClass
	public void Afterclasstest()
	{
		System.out.println("After class executed");
	}
}
