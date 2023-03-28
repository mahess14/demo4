package com.qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test32 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		WebElement e=	driver.findElement(By.xpath("//input[@name='q']"));
		e.sendKeys("Abdul Kalam sir",Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.xpath("//input[@name='q']"));
		e1.sendKeys("Ratan Tata", Keys.ENTER);
		Thread.sleep(5000);
		driver.navigate().back();
		WebElement e2=	driver.findElement(By.xpath("//input[@name='q']"));
		e2.sendKeys("Gandhi",Keys.ENTER);
		Thread.sleep(5000);
		
	}

}
