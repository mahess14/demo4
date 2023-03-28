package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test32 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.polymer-project.org/");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//shop-app[@page='home']"))
		       .getShadowRoot()
		       .findElement(By.linkText("Ladies T-Shirts"))
		       .click();
		
		
	}

}
