package com.qa.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void method1()
	{
		System.out.println("Welcome to method 1");
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println(" i am failed");
		sa.assertAll();
	}
	
	@Test
	public void method2()
	{
		System.out.println("welcome to method 2");
	}

}
