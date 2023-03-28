package com.qa.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("testing15122021@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Testing1512");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("sandhyarani1293@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Wishes");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi, \n How are you?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\\Users\\Rami Reddy\\Desktop\\Manual Testing\\realtime documents\\realtime documents\\Manual Testing Notes on daily basis Latest\\Day 1.docx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Thread.sleep(3000);
		String x=driver.findElement(By.xpath("//span[text()='Message sent']")).getText();
		if(x.contains("Message sent"))
		{
			System.out.println("Message sent  is displaying");
		}
		else 
		{
			System.out.println("Message sent is not displaying");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account:')]/img")).click();
		driver.switchTo().frame("account");
		driver.findElement(By.xpath("//div[text()='Sign out']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.close();
		
	}

}
