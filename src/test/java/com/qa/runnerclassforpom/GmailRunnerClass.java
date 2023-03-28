package com.qa.runnerclassforpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qa.pom.ComposePage;
import com.qa.pom.LoginPage;
import com.qa.pom.LogoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailRunnerClass {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		LoginPage lp=new LoginPage(driver);
		lp.enterEmailAddress("testing15122021@gmail.com");
		lp.click();
		Thread.sleep(5000);
		lp.enterPassword("Testing1512");
		lp.clickNextButtonInLoginPage();
		Thread.sleep(5000);
		ComposePage cp=new ComposePage(driver);
		cp.compose();
		cp.toAddress("sandhyarani1293@gmail.com");
		cp.subject("wishes");
		cp.messageBody("Hi");
		cp.attachFile("C:\\Users\\Rami Reddy\\Desktop\\Manual Testing\\realtime documents\\realtime documents\\Manual Testing Notes on daily basis Latest\\Day 1.docx");
		cp.sendbutton();
		cp.messageSent("Message sent");
		LogoutPage logpage =new LogoutPage(driver);
		logpage.profilePicture();
		logpage.frame("account");
		logpage.signout();
	}

}
