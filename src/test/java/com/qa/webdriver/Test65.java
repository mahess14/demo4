package com.qa.webdriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test65 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.get("https://semantic-ui.com/");
		Thread.sleep(5000);
		List<WebElement> l= driver.findElements(By.tagName("input"));
		System.out.println(l.size());
			
		int textboxes =0;
		int passwords=0;
		int checkboxes=0;
		int radiobuttons=0;
		int emailboxes=0;
		int hidden=0;
		int otherelements=0;
		
		for(WebElement e:l)
		{
				String x=	e.getAttribute("type");
				if(x.equalsIgnoreCase("text"))
				{
					textboxes++;
				}
				else if(x.equalsIgnoreCase("radio"))
				{
					radiobuttons++;
				}
				else if (x.equalsIgnoreCase("password"))
				{
					passwords++;
				}
				else if(x.equalsIgnoreCase("check"))
				{
					checkboxes++;
				}
				else if (x.equalsIgnoreCase("email"))
				{
					emailboxes++;
				}
				else if (x.equalsIgnoreCase("hidden"))
				{
					hidden++;
				}
				else
				{
					otherelements++;
				}
		}
		System.out.println("Count of the text boxes " + textboxes);
		System.out.println("Count of the radio boxes " + radiobuttons);
		System.out.println("Count of the password boxes " + passwords);
		System.out.println("Count of the check boxes " + checkboxes);
		System.out.println("Count of the email boxes " + emailboxes);
		System.out.println("Count of the hidden boxes " + hidden);
		System.out.println("Count of the otherelements  " + otherelements);
		
		
		
	}

}
