package com.qa.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test31 {
	public RemoteWebDriver driver;
	public ATUTestRecorder rec;
	public String f;
	
	@BeforeClass
	@Test
	public void method1() throws ATUTestRecorderException, Exception 
	{
		f="\\target\\";
		 rec= new ATUTestRecorder(f,false);
		rec.start();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.close();	
	}
	
	@Test
	public void method2() throws Exception
	{
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.close();	
	}

	@Test
	public void method3() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		driver.close();
	}
	
	@AfterClass
	public void method() throws ATUTestRecorderException
	{
		rec.stop();
	}
}
