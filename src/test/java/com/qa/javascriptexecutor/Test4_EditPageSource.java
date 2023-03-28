package com.qa.javascriptexecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4_EditPageSource {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Locate element  and change source of that element
		WebElement e = driver.findElement(By.name("q"));
		
		//change-1: Disable element and then back to enable
		driver.executeScript("arguments[0].disabled=true;", e);
		Thread.sleep(5000);
		
		driver.executeScript("arguments[0].disabled=false;", e);
		//change-2: change type of element
		driver.executeScript("arguments[0].setAttribute('type','checkbox');",e);
		Thread.sleep(5000);
		
		//Change-3 remove element
		
		WebElement e1 = driver.findElement(By.xpath("//*[@aria-label='Search by voice']"));
		driver.executeScript("arguments[0].remove();",e1);
		
		//change-4: add new plain text element
		WebElement e2=driver.findElement(By.xpath("//input[@name='q']/parent::div"));
		driver.executeScript(
						"var para=document.createElement('p');"
						+"var tn=document.createTextNode('Hi, How are you');"
						+ "para.appendChild(tn); "
						+ "arguments[0].appendChild(para);",e2);
				Thread.sleep(5000); 
		
	}

}
