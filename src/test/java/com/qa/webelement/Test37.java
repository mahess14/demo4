package com.qa.webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test37 {

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
		
		int allmails=0;
		int unreadmails=0;
		int readmails=0;
				
		
		while(true)  //infinite loop for pagenation (until last page)
		{
			//Step 1: collect all mails in current table		
			List<WebElement> e=driver.findElements(By.xpath("(//table)[6]/tbody/tr"));
			allmails=allmails+e.size();
						
			//step 2: got each mail to check read / unread mail
			for(WebElement mail:e)
			{
				WebElement l=mail.findElement(By.xpath("child::td[4]/div[1]"));
				String y=(String) driver.executeScript("return(arguments[0].textContent);",l);
				if(y.startsWith("unread"))
				{
					unreadmails++;
				}
				else
				{
					readmails++;
				}				
			}
						
			// Step 3: go to next page
			try {
			String x=driver.findElement(By.xpath("//div[@aria-label='Older']")).getAttribute("aria-disabled");
			if(x.equals("true"))
			{
				break;
			}
			}
			catch(Exception ex) {
			driver.findElement(By.xpath("//div[@aria-label='Older']")).click();
			Thread.sleep(5000);
			}
		}
		System.out.println(allmails);
		System.out.println(unreadmails);
		System.out.println(readmails);
		
	}
}
