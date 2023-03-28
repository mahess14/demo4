package com.qa.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test7 {
	
	public int x=10;
	@Test(successPercentage=40, invocationCount=10)
	public void method1()
	{
		if(x%2==0)
		{
			x++;
			Assert.assertTrue(true);
			
		}
		else
		{
			x++;
			Assert.fail();
		}
		
	}

}
