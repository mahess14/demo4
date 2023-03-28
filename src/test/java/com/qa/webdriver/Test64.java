package com.qa.webdriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test64 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.co.in");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//*"));
		System.out.println("all elements in a page " + l.size());	
		
		int alllinks=0;
		int workinglinks=0;
		int brokenlinks=0;
		
		for(WebElement e:l)
		{
			if(e.getAttribute("href")!=null)
			{
				String x=e.getAttribute("href");
				if(x.startsWith("http")|x.startsWith("https"))
				{
					alllinks++;
					URL u=new URL(x);
				HttpURLConnection con=	(HttpURLConnection) u.openConnection();
				con.connect();
				if(con.getResponseCode()==200)
				{
					workinglinks++;
				}
				else
				{
					brokenlinks++;
					System.out.println(x + " is broken link due to "+ con.getResponseMessage());
				}
				}
				else
				{
					System.out.println("href attribute not started with http/https");
				}
			}
		}
		System.out.println("all links " + alllinks);
		System.out.println("all working links " + workinglinks);
		System.out.println("all broken links " + brokenlinks);

		
	}

}
