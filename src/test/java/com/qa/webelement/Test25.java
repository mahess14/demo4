package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test25 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		WebElement e= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));

		int width=	e.getSize().getWidth();
		int height=	e.getSize().getHeight();
		System.out.println(width);
		System.out.println(height);

		int x=e.getLocation().getX();
		int y=e.getLocation().getY();
		System.out.println(x);
		System.out.println(y);





		int width1=	e.getRect().getWidth();
		int height1=e.getRect().getHeight();
		int x1=e.getRect().getX();
		int y1=e.getRect().getY();
		System.out.println(width1);
		System.out.println(height1);
		System.out.println(x1);
		System.out.println(y1);

	}

}
