package com.qa.sikulix;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationWindow {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		Screen s =new Screen();
		s.type("C:\\Users\\Rami Reddy\\Desktop\\Automation\\com.google.gmail\\src\\test\\resources\\username.png", "admin");
		Thread.sleep(5000);
		s.type("C:\\Users\\Rami Reddy\\Desktop\\Automation\\com.google.gmail\\src\\test\\resources\\password.png", "admin");
		Thread.sleep(5000);
		s.click("C:\\Users\\Rami Reddy\\Desktop\\Automation\\com.google.gmail\\src\\test\\resources\\signin.png");

	}

}
