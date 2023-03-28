package com.qa.testng;



import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Test20 {

	@Test(priority=1)
	@Parameters({"country","firstname","lastname"})
	public void method1(String c, String fn, String ln)
	{
		System.out.println(fn+" "+ln+" belongs to "+c);
	}
	
	@Test(priority=2)
	@Parameters({"firstname","lastname"})
	public void method2(String fn, String ln)
	{
		System.out.println(fn+" "+ln);
	}
	
	@Test(priority=3)
	public void method3()
	{
		System.out.println("Done");
	}
}
