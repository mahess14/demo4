package com.qa.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//span[text()='Login']/preceding::button[1]")).click();
		}
		catch(Exception ex)
		{
			
		}
		Thread.sleep(5000);
		
		WebElement e= driver.findElement(By.xpath("//div[text()='Mobiles']"));
		Actions a=new Actions(driver);
		a.moveToElement(e,100,0).build().perform();
		

	}

}
