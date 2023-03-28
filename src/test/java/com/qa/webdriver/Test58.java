package com.qa.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test58 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.get("https://semantic-ui.com/");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("(//div[contains(@class,'dropdown')])|(//select)"));
		System.out.println(l.size());
		
	}

}
