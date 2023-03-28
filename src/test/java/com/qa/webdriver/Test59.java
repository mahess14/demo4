package com.qa.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test59 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.get("https://semantic-ui.com/");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("(//a)|(//div)|(//href)|(//img)|(//link)|(//base)|(//area)"));
		System.out.println(l.size());
		
		List<WebElement> l1= new ArrayList<WebElement>();
		
		for(WebElement	e:l)
		{
			if(e.getAttribute("href")!=null)
			{
				l1.add(e);
			}
		}
		System.out.println(l1.size());
	}

}
