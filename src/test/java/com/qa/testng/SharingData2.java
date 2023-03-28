package com.qa.testng;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class SharingData2 {
	
	@Test
	public void method2(ITestContext ct)
	{
		ISuite s=ct.getSuite();
		System.out.println(s.getAttribute("result"));
	}

}
