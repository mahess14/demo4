package com.qa.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test30 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//way-1
		driver.findElement(By.xpath("//input[@name='']")).sendKeys("testing15122021@mail.com");



		//way-2
		/*WebElement e=driver.findElement(By.xpath("//input[@name='identifier']"));
		e.sendKeys("testing15122021@gmail.com");
		
		WebElement e1=driver.findElement(By.xpath("//span[text()='Next']"));
		e1.click();*/
	}

}
