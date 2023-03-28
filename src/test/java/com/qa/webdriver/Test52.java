package com.qa.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test52 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//*"));
		System.out.println(l.size());
		int visible=0;
		int hidden=0;
		int enabled=0;
		int disabled =0;
		if(l.size()==0)
		{
			System.out.println("No elements in page");
		}
		else
		{
			for(  WebElement e:l)
			{
				if(e.isDisplayed())
				{
					visible++;
					if(e.isEnabled())
					{
						enabled++;
					}
					else
					{
						disabled++;
					}
				}
				else
				{
					hidden++;
				}
			}
		}
		System.out.println("Total visible elements " + visible);
		System.out.println("Total hidden elements " + hidden);
		System.out.println("Total enabled elements " + enabled);
		System.out.println("Total disabled elements " + disabled);
	}

}
