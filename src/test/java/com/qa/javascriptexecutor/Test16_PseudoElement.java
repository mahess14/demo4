package com.qa.javascriptexecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test16_PseudoElement {

	public static void main(String[] args) throws Exception {
		
		//pseudo element
		//Open browser and launch site
		WebDriverManager.chromedriver().setup();         
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rangeslider.js.org/");
		Thread.sleep(5000);
		//1. get details of general element
		String value1=driver.findElement(By.className("rangeslider__fill"))
				.getCssValue("background-color");
		System.out.println(value1);
		//2. get details of pseudo element
		String value2=(String) driver.executeScript(
				"var ne=document.querySelector('div.rangeslider__handle');"
						+ "var pe=window.getComputedStyle(ne,'::after'); "
						+ "var y=pe.getPropertyValue('color');"
						+ "return(y);");
		System.out.println(value2);
		String value3=(String) driver.executeScript(
				"var ne=document.querySelector('div.rangeslider__handle');"
						+ "var pe=window.getComputedStyle(ne,'::after'); "
						+ "var y=pe.getPropertyValue('border-color');"
						+ "return(y);");
		System.out.println(value3);
		String value4=(String) driver.executeScript(
				"var ne=document.querySelector('div.rangeslider__handle');"
						+ "var pe=window.getComputedStyle(ne,'::after'); "
						+ "var y=pe.getPropertyValue('background-color');"
						+ "return(y);");
		System.out.println(value4);
		driver.close();
	}

}
