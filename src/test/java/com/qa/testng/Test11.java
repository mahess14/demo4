package com.qa.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test11 {
	
	@Test(priority=1)
	public void method1()
	{
		Assert.assertTrue(false);
		System.out.println("Method1");
	}
	
	
	@Test(priority=2,dependsOnMethods="method1")
	public void base()
	{
	System.out.println("Method2");	
	}

}
