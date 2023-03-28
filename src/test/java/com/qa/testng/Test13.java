package com.qa.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test13 {
	
	@Test(priority=1,groups= {"smoketest", "retest"})
	public void method1()
	{
		System.out.println("Method1");
	}
	
	
	@Test(priority=2,groups={"regressiontest","retest"})
	public void method2()
	{
	System.out.println("Method2");	
	}
	
	@Test(priority=3,groups={"realtest","smoketest"})
	public void method3()
	{
	System.out.println("Method3");	
	}

}
