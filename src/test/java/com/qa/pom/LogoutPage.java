package com.qa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	public RemoteWebDriver driver;
	//locators
	@FindBy(xpath="//*[contains(@aria-label,'Google Account:')]/img")
	public WebElement profilepic;

	@FindBy(xpath="//div[text()='Sign out']")
	public WebElement signout;

	//Constructor Method

	public LogoutPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	//General Methods or Operational methods
	public void profilePicture() throws Exception
	{
		profilepic.click();
		Thread.sleep(2000);
	}

	public void frame(String x)
	{
		driver.switchTo().frame(x);
	}

	public void signout() throws Exception
	{
		signout.click();
		Thread.sleep(2000);
	}

}
