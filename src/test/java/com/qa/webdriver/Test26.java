package com.qa.webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test26 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Try it Yourself »")).click();
		Set<String> x=driver.getWindowHandles();
		System.out.println(x);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
