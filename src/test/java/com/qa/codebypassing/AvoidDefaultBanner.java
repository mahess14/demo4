package com.qa.codebypassing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AvoidDefaultBanner {

	public static void main(String[] args) {

		//Open chrome browser 
		ChromeOptions co=new ChromeOptions();
		String[] s=new String[]{"enable-automation"};
		co.setExperimentalOption("excludeSwitches",s); //native command as argument
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
}
