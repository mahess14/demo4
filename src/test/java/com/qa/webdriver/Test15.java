package com.qa.webdriver;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name from the keyboard :");
		String x=sc.nextLine();
		sc.close();
		
		RemoteWebDriver driver=null;
		
		if(x.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();		
		}
		else if(x.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else if(x.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver =new EdgeDriver();
		}
		else if(x.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver", "C:\\Users\\Rami Reddy\\Desktop\\Automation\\operadriver_win64\\operadriver.exe");
			 driver =new OperaDriver();
		}
		else
		{
			System.out.println("Entered wrong browser name");
		}
	}

}
