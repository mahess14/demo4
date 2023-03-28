package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//before moving to element
		WebElement e=driver.findElement(By.linkText("Gmail"));
		String x=e.getCssValue("text-decoration");
		System.out.println(x);
		//move to the element
		Actions act= new Actions(driver);
		act.moveToElement(e).build().perform();
		Thread.sleep(5000);
		//after move to element
		String y=e.getCssValue("text-decoration");
		System.out.println(y);
		
	}
}
