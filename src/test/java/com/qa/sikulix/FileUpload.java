package com.qa.sikulix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_file");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		WebElement e = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(e).moveByOffset(-10, 0).click().build().perform();
		Thread.sleep(5000);
		Screen s = new Screen();
		s.type("C:\\Users\\Rami Reddy\\Desktop\\Automation\\com.google.gmail\\src\\test\\resources\\filename.png","C:\\Users\\Rami Reddy\\Desktop\\Automation\\testdata.txt");
		Thread.sleep(5000);
		s.click("C:\\Users\\Rami Reddy\\Desktop\\Automation\\com.google.gmail\\src\\test\\resources\\open.png");
	
	}

}
