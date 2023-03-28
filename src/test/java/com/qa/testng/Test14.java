package com.qa.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test14 {
	
	
	@DataProvider(name="addition")
	public Object[][] method1()
	{
		Object[][] obj= new Object[][] {
										{10,10},
										{10,20},
										{10,30}};
		return(obj);
	}
	
	
	
	@Test(priority=1,dataProvider="addition")
	public void method2(int x, int y)
	{
		int z=x+y;
		System.out.println(z);
	}

}
