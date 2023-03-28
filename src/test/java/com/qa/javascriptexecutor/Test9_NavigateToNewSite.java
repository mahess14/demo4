package com.qa.javascriptexecutor;




import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9_NavigateToNewSite {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch site
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//another site
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		//Another site
		driver.executeScript("window.location='https://www.yahoo.com';");	
	}
}
