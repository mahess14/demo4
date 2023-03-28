package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test34 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);	
		WebElement e=driver.findElement(By.xpath("//input[@type='text']"));
		String attribute=e.getDomAttribute("aria-label");
		System.out.println(attribute);
		String property=e.getDomProperty("clientHeight");
		System.out.println(property);	 	
	}

}
