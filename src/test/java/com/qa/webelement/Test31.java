package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test31 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://books-pwakit.appspot.com/");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']"))
			  .getShadowRoot()
			  .findElement(By.id("input"))
			  .sendKeys("Rich Dad and Poor Dad");
	}

}
