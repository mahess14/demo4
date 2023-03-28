package com.qa.codebypassing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPushNotification {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disable-notifications");		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		Thread.sleep(5000);

	}

}
