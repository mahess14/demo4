package com.qa.testng;

import org.testng.annotations.Test;

public class Test15_1 {
	
	@Test(dataProvider="addition",dataProviderClass=Test15.class)
	public void method2(int x, int y)
	{
		int z=x+y;
		System.out.println(z);
	}

}
