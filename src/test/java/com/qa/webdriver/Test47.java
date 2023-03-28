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

public class Test47 {

	public static void main(String[] args) throws Exception {
		
		//Open gmail in chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testyou.in/Login.aspx");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[contains(@src,'google.png')])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("testing15122021@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Testing1512");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		//get all cookies
		Set<Cookie> s= driver.manage().getCookies();
		List<Cookie> l= new ArrayList<Cookie>(s);

		//Firefox browser
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver1= new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.testyou.in/Login.aspx");
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
