package com.qa.webdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test45 {

	public static void main(String[] args) throws Exception {
		
		//Open gmail in chrome browser
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
		Thread.sleep(5000);
		
		//get all cookies
		Set<Cookie> s= driver.manage().getCookies();
		List<Cookie> l= new ArrayList<Cookie>(s);
		
		//Firefox browser
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver1= new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.gmail.com");
		Thread.sleep(5000);
		
		for(Cookie c:l)
		{
			try {
			driver.manage().addCookie(c);
			}
			catch(Exception e)
			{
				
			}
		}
		driver1.navigate().refresh();
		Thread.sleep(5000);

	}
}
