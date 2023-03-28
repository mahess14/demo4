package com.qa.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(1));
		//step 1: Locate the dropdown
		WebElement e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='Gender'])[2]/following::div[5]")));
		//step 2: click on dropdown
		e.click();
		Thread.sleep(5000);
		//step -3: select item from dropdown
		
		for(int i=1;i<=6;i++)
		{
		e.findElement(By.xpath("child::div[2]/div["+i+"]")).click();
		Thread.sleep(3000);
		e.click();
		}

	}

}
