package com.qa.javascriptexecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_ClickOnElement_Way1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//Way-1 locate and operate element by using JavascriptExecutor only
		driver.findElement(By.name("q")).sendKeys("Ratan");
		driver.executeScript("document.getElementsByName('btnK')[0].click();");	
	}
}
