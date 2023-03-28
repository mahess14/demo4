package com.qa.screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLevel {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		File desc=new File("C:\\Users\\Rami Reddy\\Desktop\\Manual Testing\\realtime documents\\realtime documents\\Manual Testing Notes on daily basis Latest\\PageLevel.png");
		File src=driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, desc);
	}

}
