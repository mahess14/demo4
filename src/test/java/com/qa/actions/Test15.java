package com.qa.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test15 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.xpath("//div[contains(text(),'Top')]"));
		Actions act=new Actions(driver);
		act.clickAndHold(e).perform();
		String x=e.findElement(By.xpath("child::span")).getText();
		System.out.println(x);	
		act.pause(5000).release(e).moveToElement(e, 100, 0).build().perform();
		
	}

}
