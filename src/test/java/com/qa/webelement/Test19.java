package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test19 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigotires.com/");
		Thread.sleep(5000);	
		WebElement e= driver.findElement(By.xpath("//div[@data-at-dropdown-container='year']"));
		e.click();
		Actions act=new Actions(driver);
		act.sendKeys("1990",Keys.DOWN,Keys.ENTER).perform();
	}

}
