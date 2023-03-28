package com.qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test27 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//way-1:
		/*By b=By.name("identifier");//locating element
		driver.findElement(b).sendKeys("testing15122021@gmail.com");; // by class object as argument//operation 
		*/
		
		//way-2
		driver.findElement(By.name("identifier")).sendKeys("testing15122021@gmail.com");
		
	/*	//way-3
		
		WebElement e=driver.findElement(By.name("identifier"));   //located element in page source
		
		e.sendKeys("testing15122021@gmail.com");*/
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
