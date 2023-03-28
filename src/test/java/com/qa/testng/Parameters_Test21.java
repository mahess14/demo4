package com.qa.testng;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters_Test21 {

	@Test(priority=1)
	@Parameters({"country","firstname","lastname","browser"})
	public void method1(String c, String fn, String ln, String bn)
	{
		System.out.println(fn+" "+ln+" belongs to "+c);
		
		if(bn.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com");
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.flipkart.com");
		}
	}
	
}
