package com.qa.testng;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerBodies.class)	
public class ITestListener_Test26
{

	@Test(priority=1)
	public void method1()
	{
		System.out.println("method1 started");
		Assert.assertTrue(true);
	}

	@Test(priority=2)
	public void method2()
	{
		Assert.assertTrue(false);
		System.out.println("method2 started");
	}

	@Test(dependsOnMethods={"method2"}, priority=3)
	public void method3()
	{
		System.out.println("method3 started");
	}
	
}


