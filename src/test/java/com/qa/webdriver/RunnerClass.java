package com.qa.webdriver;

import com.sun.corba.se.impl.orbutil.ObjectStreamClass_1_3_1;

public class RunnerClass {

	public static void main(String[] args) {
		
		
		Test7 obj = new Test7(100);
		Test7 obj1 = new Test7(1000,2000);
		Test7 obj2 = new Test7(9.4);
		Test7 obj3 = new Test7(obj.x);
	}

}
