package com.qa.webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test38 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
	//	driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		List<String> l= new ArrayList<String>(s);
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		driver.switchTo().window(l.get(1));
		Thread.sleep(5000);
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		driver.switchTo().window(l.get(1));
		Thread.sleep(5000);
		driver.quit();
		
	}

}
