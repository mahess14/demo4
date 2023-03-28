package com.qa.testng;

import org.testng.annotations.Test;

public class Test9 {

	
	@Test(priority=4)
	public void method1()
	{
		System.out.println("Method 4");
	}
	
	
	@Test(priority=5)
	public void base()
	{
	System.out.println("Method 5");	
	}
	
	@Test(priority=6)
	public void app()
	{
	System.out.println("Method 6");	
	}
	
	
}
