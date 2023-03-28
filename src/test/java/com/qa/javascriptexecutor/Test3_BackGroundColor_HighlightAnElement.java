package com.qa.javascriptexecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3_BackGroundColor_HighlightAnElement {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//Locate element  and change source of that element
		WebElement e = driver.findElement(By.name("q"));
		// change-1 background color to green
		driver.executeScript("arguments[0].style.background='green';",e);
		Thread.sleep(5000);
		// change-2 Enter text in red color
		driver.executeScript("arguments[0].style.color='red';",e);
		driver.executeScript("arguments[0].value='Ratan Tata';",e);
		Thread.sleep(5000);
		//change-3 highlight that element with solid line in blue
		driver.executeScript("arguments[0].style.border='5px blue groove';",e);
		
	}

}
