package com.qa.javascriptexecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6_GetTextofHiddenElement {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement  e = driver.findElement(By.xpath("(//div[text()='Gender']/following-sibling::div/div)[1]"));
		String x=e.getText();
		System.out.println(x);// blank (or) null
		
	    String y = (String) driver.executeScript("return(arguments[0].textContent);",e);
	    System.out.println(y); //male
    
	}

}
