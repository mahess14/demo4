package com.qa.testng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test16 {
	
	@DataProvider(name="mydata")
	public Object[][] method(Method m)
	{
		if(m.getName().equalsIgnoreCase("method1"))
		{
			Object[][] obj=new Object[][] {
											{10,10},
											{20,20}
										   };
										   return(obj);
		}
		else if(m.getName().equalsIgnoreCase("method2"))
		{
			Object[][] obj=new Object[][] {
				{"Hyder","abad"},
				{"king","koti"}
			   };
			   return(obj);
		}
		else
		{
			Object[][] obj=new Object[][] {
				{10,"abad"},
				{20,"koti"}
			   };
			   return(obj);
		}
	}
	
	@Test(priority=1,dataProvider="mydata")
	public void method1(int x, int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	
	@Test(priority=2,dataProvider="mydata")
	public void method2(String x, String y)
	{
		String z=x+y;
		System.out.println(z);
	}

}
