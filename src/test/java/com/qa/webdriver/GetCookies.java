package com.qa.webdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCookies {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("testing15122021@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Testing1512");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Set<Cookie> s=driver.manage().getCookies();
		System.out.println(s);
		List<Cookie> l=new ArrayList<Cookie>(s);
		System.out.println("count of the cookies " + l.size());
		
		for(Cookie b:l)
		{
			System.out.println(b.getName());
		}

	}

}
