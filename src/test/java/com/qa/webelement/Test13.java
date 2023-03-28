package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath("//input[@type='email']")).getAttribute("aria-label");
		System.out.println(x);
		String y=driver.findElement(By.xpath("//input[@type='email']")).getCssValue("height");
		System.out.println(y);
	}

}
