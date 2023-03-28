package com.qa.javascriptexecutor;




import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8_ZoomInAndZoomOut {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		//Zoom in(using JavaScript)
	    driver.executeScript("document.body.style.zoom='200%';");
		Thread.sleep(5000);
		
		//Zoom out  (using JavaScript)
		driver.executeScript("document.body.style.zoom='100%';");
	}
}
