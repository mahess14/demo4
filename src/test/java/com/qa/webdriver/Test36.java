package com.qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test36 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("Testing15122021@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("151222021",Keys.TAB,Keys.TAB,Keys.ENTER);
		

	}

}
