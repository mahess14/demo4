package com.qa.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnotations {
	
	@BeforeSuite
	public void method1()
	{
	System.out.println("Before Siute");	
	}
	@AfterSuite
	public void method2()
	{
	System.out.println("After Siute");	
	}

	
	@BeforeTest
	public void method3()
	{
	System.out.println("Before Test");	
	}
	@AfterTest
	public void method4()
	{
	System.out.println("After Test");	
	}
	
	
	@BeforeClass
	public void method5()
	{
	System.out.println("Before Class");	
	}
	@AfterClass
	public void method6()
	{
	System.out.println("After Class");	
	}
	
	@BeforeMethod
	public void method7()
	{
	System.out.println("Before Method");	
	}
	@AfterMethod
	public void method8()
	{
	System.out.println("After Method");	
	}
	
	
	@Test
	public void method9()
	{
		System.out.println("Test Annotation");
	}
	
	
	
}
