package com.qa.webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test41 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		Dimension d=driver.manage().window().getSize();
		System.out.println(d.getWidth());
		System.out.println(d.getHeight());
		Thread.sleep(5000);
		//set the size of the browser window
		Dimension d1= new Dimension(300,800);
		driver.manage().window().setSize(d1);

	}

}
