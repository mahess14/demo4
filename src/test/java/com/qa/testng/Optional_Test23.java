package com.qa.testng;



import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optional_Test23 {
	
	@Test
	@Parameters({"firstname","lastname"})
	public void method123(@Optional("Magnitia in") String a, @Optional("Hyderabad") String b)
	{
		System.out.println(a+" "+b);
	}
}
