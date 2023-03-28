package com.qa.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test63 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.co.in");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("count of hyper links " + l.size());		
		
	}

}
