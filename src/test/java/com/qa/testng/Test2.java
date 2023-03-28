package com.qa.testng;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority=2)
	public void method1()
	{
		System.out.println("welcome to method1");
	}
	
	@Test(priority=1)
	public void method2()
	{
		System.out.println("Welcome to method2");
	}

	

}
