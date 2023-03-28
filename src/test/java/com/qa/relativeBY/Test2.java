package com.qa.relativeBY;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		RelativeBy rb= RelativeLocator.with(By.tagName("input"));  // about target element
		driver.findElement(rb.below(By.xpath("//input[@id='email']"))).sendKeys("Batch36");
		

	}

}
