package com.qa.javascriptexecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_ClickOnElement_Way2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//Way-1 locate and operate element by using JavascriptExecutor only
		driver.executeScript("document.getElementsByName('q')[0].value='Ratan Tata';");
		Thread.sleep(5000);
		//Way-2 locate element by using SWD-Java and operate element by using JavascriptExecutor
		WebElement e = driver.findElement(By.xpath("(//*[@name='btnK'])[2]"));
		driver.executeScript("arguments[0].click();",e);
	}
}
