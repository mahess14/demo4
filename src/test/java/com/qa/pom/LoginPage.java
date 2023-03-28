package com.qa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public RemoteWebDriver driver;
	
	//Locators
	
	@FindBy(id="identifierId")
	public WebElement emailaddress;
	
	@FindBy(how=How.XPATH,using="//span[text()='Next']")
	public WebElement NextButton;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement LoginPageNextButton;
	
	
	//Constructor Method
	
	public LoginPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	//General /Operational methods
	
	public void enterEmailAddress(String x)
	{
		emailaddress.sendKeys(x);
	}
	
	public void click()
	{
		NextButton.click();
	}
	

	public void enterPassword(String x)
	{
		password.sendKeys(x);
	}
	
	public void clickNextButtonInLoginPage()
	{
		LoginPageNextButton.click();
	}
	
	
	
	
	
	
	
}
