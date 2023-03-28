package com.qa.sikulix;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.magnitia.com/images/courses/Selenium-with-Java-Magnitia-Content.pdf");
		Thread.sleep(5000);
		Screen s =new Screen();
		s.click("C:\\Users\\Rami Reddy\\Desktop\\Automation\\com.google.gmail\\src\\test\\resources\\download.png");

	}

}
