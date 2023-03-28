package com.qa.webdriver;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logs {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		Set<String> s=driver.manage().logs().getAvailableLogTypes();
		System.out.println(s);
		
		//1. browser
		LogEntries bl=driver.manage().logs().get("browser");
		System.out.println(bl);
		
		for(LogEntry l:bl)
		{
			System.out.println(l.getMessage());
		}
		
		
		//2. client
		
		LogEntries bc=driver.manage().logs().get("client");
		System.out.println(bc);
		for(LogEntry c:bc)
		{
			System.out.println(c.getMessage());
		}
		//3. driver
		LogEntries bd=driver.manage().logs().get("driver");
		System.out.println(bd);
		for(LogEntry d:bd)
		{
			System.out.println(d.getMessage());
		}
	}

}
