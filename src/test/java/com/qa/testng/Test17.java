package com.qa.testng;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test17 {
	
	@DataProvider(name="mydata")
	public Object[][] method(ITestContext tc)
	{
	String[] groups=	tc.getIncludedGroups();
	for(String group:groups)
	{
		if(group.equalsIgnoreCase("Arithmetic"))
		{
			Object[][] obj= new Object[][] {
											{10,20},
											{20,30}
											};
											return(obj);
		}
		else if(group.equalsIgnoreCase("concat"))
		{
			Object[][] obj= new Object[][] {
				{"Ratan","Tata"},
				{"TCS","Tata"}
				};
				return(obj);
		}
		else
		{
			Object[][] obj= new Object[][] {
				{"Hyderabad","Tata"},
				{"TCS","Hyderabad"}
				};
				return(obj);
		}
	}
	return (null);
	}
	
	@Test(priority=1,dataProvider="mydata",groups= {"Arithmetic"})
	public void method1(int x, int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	
	@Test(priority=2,dataProvider="mydata",groups= {"concat"})
	public void method2(String x, String y)
	{
		String z=x+y;
		System.out.println(z);
	}

}
