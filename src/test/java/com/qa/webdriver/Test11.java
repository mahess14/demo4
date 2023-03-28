package com.qa.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Rami Reddy\\Desktop\\Automation\\operadriver_win64\\operadriver.exe");
		//WebDriverManager.operadriver().browserVersion("93.0.4585.11").driverVersion("93.0.4577.63").setup();
		WebDriver driver = new OperaDriver();
		

	}

}
