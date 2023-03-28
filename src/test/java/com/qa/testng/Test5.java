package com.qa.testng;

import org.testng.annotations.Test;

public class Test5 {
	
	@Test(expectedExceptions= {Exception.class})
	public void method1()
	{
		int x=10;
		int y=0;
		int z=0;
		z=x/y;
		
	}

}
