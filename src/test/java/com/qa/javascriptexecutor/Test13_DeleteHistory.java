package com.qa.javascriptexecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13_DeleteHistory {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Ramireddy");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Ramireddy");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		driver.executeScript("history.go(0);");//0 means forcibly clean
	}
}
