package com.qa.webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test37 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		List<String> l=new ArrayList<String>(s);
		System.out.println(l.size());
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		driver.switchTo().window(l.get(1));
		Thread.sleep(5000);
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		driver.switchTo().window(l.get(1));
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
