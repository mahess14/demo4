package com.qa.codebypassing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithExistingBrowserWindow {

	public static void main(String[] args) {
		//connect to existing browser
		ChromeOptions co=new ChromeOptions();
		co.setExperimentalOption("debuggerAddress","localhost:52387");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("http://www.facebook.com");

	}
}
