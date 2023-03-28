package com.qa.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement e= driver.findElement(By.xpath("//div[@id='slider']/child::span"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(e, 200, 0).build().perform();
		act.pause(Duration.ofSeconds(5)).dragAndDropBy(e, -200, 0).build().perform();
	}

}
