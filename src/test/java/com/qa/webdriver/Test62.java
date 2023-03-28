package com.qa.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test62 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.tagName("input"));
		System.out.println("count of input tags " + l.size());
		
		int textboxes=0;
		int radiobuttons=0;
		int otherelements=0;
		
		for(WebElement e:l)
		{
			String x=e.getAttribute("type");
			if(x.equalsIgnoreCase("text"))
			{
				textboxes++;
			}
			else if(x.equalsIgnoreCase("radio"))
			{
				radiobuttons++;
			}
			else
			{
				otherelements++;
			}
		}
		
		System.out.println("count of the text boxes " + textboxes);
		System.out.println("count of the radio boxes " + radiobuttons);
		System.out.println("count of the other elements " + otherelements);
		
	}

}
