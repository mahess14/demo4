package com.qa.testng;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class SharingData1 {
	
	@Test
	public void method1(ITestContext ct)
	{
		int a=10;
		int b=20;
		int c=a+b;
		
		ISuite s=ct.getSuite();
		s.setAttribute("result", c);
	}

}
