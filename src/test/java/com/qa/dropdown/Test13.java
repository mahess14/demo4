package com.qa.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(1));
		//step 1: Locate the dropdown
		WebElement e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[text()='Multiple Selection']/following-sibling::div")));
		//step 2: click on dropdown
		e.click();
		Thread.sleep(5000);
		//step -3: select item from dropdown
		List<WebElement> l=e.findElements(By.xpath("child::div[2]/div"));
		for(WebElement item:l)
		{
			item.click();
			Thread.sleep(2000);
		}
		
		//step 4: deselect all items in dropdown
		
		List<WebElement> k=e.findElements(By.xpath("child::a"));
		for(WebElement d:k)
		{
			d.findElement(By.xpath("child::i")).click();
			Thread.sleep(5000);
		}
	}

}
