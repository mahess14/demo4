package com.qa.codebypassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadWindow {

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
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("sandhyarani1293@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Wishes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi, \n How are you?");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\\Users\\Rami Reddy\\Desktop\\Manual Testing\\realtime documents\\realtime documents\\Manual Testing Notes on daily basis Latest\\Day 1.docx");		

	}

}
