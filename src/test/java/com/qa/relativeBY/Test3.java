package com.qa.relativeBY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		WebElement e1= driver.findElement(By.xpath("//input[@name='email']"));
		WebElement e2= driver.findElement(By.xpath("//button[@name='login']"));		
		RelativeBy rb= RelativeLocator.with(By.tagName("input"));  // about target element
		driver.findElement(rb.below(e1).above(e2)).sendKeys("Batch36");;
		

	}

}
