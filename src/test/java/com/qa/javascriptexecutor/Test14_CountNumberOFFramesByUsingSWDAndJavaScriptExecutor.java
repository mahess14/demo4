package com.qa.javascriptexecutor;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14_CountNumberOFFramesByUsingSWDAndJavaScriptExecutor {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(5000);
		//count number of frames in web page by using SWD
		List<WebElement> l1=driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames by using SWD " + l1.size());
		
		//count number of frames by using JavascriptExecutor
		long l2= (Long) driver.executeScript("return(window.frames.length);");
		System.out.println(l2);
	}
}
