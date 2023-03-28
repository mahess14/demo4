package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test17 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get(" https://www.worldometers.info/world-population/");
		Thread.sleep(5000);		
		//get text of 
		WebElement e= driver.findElement(By.xpath("//span[@rel='current_population']"));
		String y=(String) driver.executeScript("return(arguments[0].textContent);", e);
		System.out.println(y);
	}
}
