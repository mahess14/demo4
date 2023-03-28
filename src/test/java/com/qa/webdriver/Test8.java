package com.qa.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {

	public static void main(String[] args) {
	
		//Way-1
		//WebDriverManager.chromedriver().setup();
		
		//Way-2
		WebDriverManager x=WebDriverManager.chromedriver();
		x.setup();
		
		WebDriver driver=new ChromeDriver();

	}

}
