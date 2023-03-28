package com.qa.relativeBY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//near
		WebElement e1= driver.findElement(By.xpath("(//*[name()='svg'])[2]"));
		RelativeBy rb= RelativeLocator.with(By.name("q"));  // about target element
		driver.findElement(rb.near(e1)).sendKeys("Ratan Tata");
		
		

	}

}
