package com.qa.javascriptexecutor;



import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5_PasswordBoxTesting {

	public static void main(String[] args) throws Exception {
		String x="batch35";
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Step-1 locate password element and enter a value
		WebElement e = driver.findElement(By.name("pass"));
		e.sendKeys(x);
		Thread.sleep(5000);
		
		//Step -2 change password box type to "text" to get visibility of given value
		driver.executeScript("arguments[0].setAttribute('type','text');", e);
		Thread.sleep(5000);
		
		//Step-3 Get visible text
		String y = e.getAttribute("value");
		
		//Step-4 compare visible value with given value
		if(x.equals(y))
		{
			System.out.println(" x and y are same");
		}
		else
		{
			System.out.println("x and y are different");
		}
	}

}
