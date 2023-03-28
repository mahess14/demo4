package com.qa.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test23 {

	public static void main(String[] args) throws Exception {
		
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
			Thread.sleep(5000);
			driver.switchTo().frame("iframeResult");
			WebElement e= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			
			if(e.isDisplayed())
			{
				System.out.println("radio button is displayed in page");
				
				if(e.isEnabled())
				{
					System.out.println("Radio button is Enabled");
					
					if(e.isSelected())
					{
						System.out.println("Radio button is selected");
					}
					else
					{
						System.out.println("Radio button is not selected");
					}
				}
				else
				{
					System.out.println("Radio button is Disabled");
				}
				
			}
			else
			{
				System.out.println("Radio button is not displayed in page");
			}

	}

}
