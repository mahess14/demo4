package com.qa.testng;

import org.testng.annotations.Test;

public class Test8 {

	
	@Test(priority=1)
	public void method1()
	{
		System.out.println("Method 1");
	}
	
	
	@Test(priority=2)
	public void method2()
	{
	System.out.println("Method 2");	
	}
	
	@Test(priority=3)
	public void method3()
	{
	System.out.println("Method 3");	
	}
	
	
}
