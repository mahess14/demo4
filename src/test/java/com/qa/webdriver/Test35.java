package com.qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test35 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(5000);
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//*[@id='topic']/following-sibling::input")).sendKeys("Ratan Tata");
		Thread.sleep(5000);
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//*[@id='animals']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.close();

	}

}
