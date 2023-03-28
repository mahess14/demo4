package com.qa.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test24 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		String x=driver.getPageSource();
		System.out.println(x);
		if(x.contains("html"))
		{
			System.out.println("Web page designed with HTML");
		}
		else
		{
			System.out.println("Web page not designed with HTML");
		}
		
		if(x.contains("svg"))
		{
			System.out.println("Web page designed with SVG");
		}
		else
		{
			System.out.println("Web page not designed with SVG");
		}
		
		if(x.contains("shadow-root"))
		{
			System.out.println("Web page designed with web compnents");
		}
		else
		{
			System.out.println("Web page not designed with web compnents");
		}
		driver.close();
	}

}
