package com.qa.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test48 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		/*long st=System.currentTimeMillis();
		driver.get("https://www.facebook.com");
		long et=System.currentTimeMillis();
		System.out.println(et-st);
		Thread.sleep(5000);*/
		
		long st=System.currentTimeMillis();
		driver.navigate().to("https://www.facebook.com");
		long et=System.currentTimeMillis();
		System.out.println(et-st);
		Thread.sleep(5000);
		
		
	}

}
