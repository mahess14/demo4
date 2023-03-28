package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test20 {

	public static void main(String[] args) throws Exception {
		
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			Thread.sleep(5000);
			WebElement e= driver.findElement(By.xpath("//button[@name='login']"));
			
			if(e.isDisplayed())
			{
				System.out.println("Login button is displayed in page");
			}
			else
			{
				System.out.println("Login button is not displayed in page");
			}

	}

}
