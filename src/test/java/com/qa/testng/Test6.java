package com.qa.testng;

import org.testng.annotations.Test;

public class Test6 {
	
	@Test(invocationCount=5,invocationTimeOut=5000)
	public void method1()
	{
		System.out.println("method1");
	}

}
