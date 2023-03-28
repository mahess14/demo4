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

public class Test43 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("testing15122021@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Testing1512");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();		
		Cookie cc= new Cookie("Batch36","TestAutomation");
		driver.manage().addCookie(cc);
		Set<Cookie> s=driver.manage().getCookies();
		System.out.println(s.size());
		List<Cookie> l= new ArrayList<Cookie>(s);
		for(Cookie e:l)
		{
			System.out.println(e.getName() + e.getValue());
		}
		// get a specific cookie by giving name
		Cookie n=driver.manage().getCookieNamed("NID");
		System.out.println(n);
		
		// To delete specific by giving object of that cookie
		driver.manage().deleteCookie(l.get(1)); // delete second cookie (index starting with 0)
		
		//delete cookie based on name
		driver.manage().deleteCookieNamed("NID");
		
		// delete all cookies
		driver.manage().deleteAllCookies();
		
		

	}

}
