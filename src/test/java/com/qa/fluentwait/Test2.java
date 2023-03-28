package com.qa.fluentwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30)); //maximum waiting time
		wait.pollingEvery(Duration.ofSeconds(1)); //waiting interval time
		wait.until(visibilityOfElementLocated(By.xpath("//input[@name='email']"))).sendKeys("TestAutomation");
		wait.until(visibilityOfElementLocated(By.xpath("//input[@name='pass']"))).sendKeys("batch35");
		wait.until(elementToBeClickable(By.xpath("//button[text()='Log in']"))).click();
		
	}
}
