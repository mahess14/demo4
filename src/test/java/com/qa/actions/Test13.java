package com.qa.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.xpath("//li[text()='D']"));
		Actions act=new Actions(driver);
		act.moveToElement(e).clickAndHold(e).moveToElement(e, 300, 0).build().perform();
		act.pause(2000).release(e).build().perform();
	}

}
