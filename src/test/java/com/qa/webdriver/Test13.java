package com.qa.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		
		
		
	//	RemoteWebDriver driver =new RemoteWebDriver();
		
	//	RemoteWebDriver driver = RemoteWebDriver.
		
	//	RemoteWebDriver driver = new ChromeDriver();
		
	//	RemoteWebDriver driver1 =new FirefoxDriver();
		
		
	//	RemoteWebDriver driver2 =new EdgeDriver();
		
	//	ChromiumDriver driver5 =new ChromiumDriver();
		
		ChromeDriver driver =new ChromeDriver();
		
		FirefoxDriver driver2 =new FirefoxDriver();
		
		
	//	WebDriver driver4 =new WebDriver();
		
		WebDriver driver1 =new ChromeDriver();
		WebDriver driver3 = new EdgeDriver();
		
		
		
		
		
		RemoteWebDriver driver10 =new ChromeDriver();
		
		

	}

}
