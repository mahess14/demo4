package com.qa.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	public void method1()
	{
		System.out.println("Welcome to method1");
		Assert.assertTrue(false);
		System.out.println(" i am failed");
	}
	
	@Test
	public void method2()
	{
		System.out.println("welcome to method2");
	}

}
