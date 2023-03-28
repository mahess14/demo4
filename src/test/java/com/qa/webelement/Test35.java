package com.qa.webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test35 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("testing15122021@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Testing1512");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(15000);	
		//way-1
		WebElement e=driver.findElement(By.xpath("(//table)[6]/tbody/tr[1]/td[4]/div[1]"));
		String y=(String) driver.executeScript("return(arguments[0].textContent);",e);
		System.out.println(y);
		
		//way-2
		WebElement t= driver.findElement(By.xpath("(//table)[6]"));
		WebElement t1=t.findElement(By.xpath("child::tbody"));
		WebElement t2=t1.findElement(By.xpath("child::tr[1]"));
		WebElement t3=t2.findElement(By.xpath("child::td[4]"));
		WebElement t4=t3.findElement(By.xpath("child::div[1]"));
		String x=(String) driver.executeScript("return(arguments[0].textContent);",t4);
		System.out.println(x);
		String k[] = x.split(",");
		for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i].trim());
		}
		/*System.out.println(k[0].trim());
		System.out.println(k[1].trim());
		System.out.println(k[2].trim());
		System.out.println(k[3].trim());
		System.out.println(k[4].trim());
		System.out.println(k[5].trim());*/
		
	}
}
