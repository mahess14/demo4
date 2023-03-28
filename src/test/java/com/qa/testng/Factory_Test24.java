package com.qa.testng;



import org.testng.annotations.Factory;

public class Factory_Test24 {

	@Factory
	public Object[] method() 
	{
		//Create objects to runner classes
		Test8 obj1=new Test8();
		Test9 obj2=new Test9();
		//store runner classes objects into an array
		Object[] tests=new Object[2];
		tests[0]=obj1;
		tests[1]=obj2;
		//return that array to TestNG to run listed runner classes sequentially
		return(tests);
	}
}
