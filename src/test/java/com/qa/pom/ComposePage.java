package com.qa.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ComposePage {

	public RemoteWebDriver driver;
	//locators
	@FindBy(xpath="//*[text()='Compose']")
	public WebElement compose;

	@FindBy(how=How.XPATH,using="(//*[@type='text'])[4]")
	public WebElement to;

	@FindBy(xpath="//input[@name='subjectbox']")
	public WebElement subject;


	@FindBy(xpath="//div[@aria-label='Message Body']")
	public WebElement messagebody;

	@FindBy(xpath="//*[@type='file']")
	public WebElement attachement;


	@FindBy(xpath="//div[text()='Send']")
	public WebElement send;

	@FindBy(xpath="//span[text()='Message sent']")
	public WebElement messageSent;

	//Constructor Method

	public ComposePage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	//General Methods or Operational methods
	public void compose() throws Exception
	{
		compose.click();
		Thread.sleep(2000);
	}

	public void toAddress(String x) throws Exception
	{
		to.sendKeys(x);
		Thread.sleep(2000);
	}

	public void subject(String x) throws Exception
	{
		subject.sendKeys(x);
		Thread.sleep(2000);
	}

	public void messageBody(String x) throws Exception
	{
		messagebody.sendKeys(x);
		Thread.sleep(2000);
	}

	public void attachFile(String x) throws Exception
	{
		attachement.sendKeys(x);
		Thread.sleep(2000);
	}

	public void sendbutton() throws Exception
	{
		send.click();
		Thread.sleep(2000);
	}

	public void messageSent(String x)
	{
		String y=messageSent.getText();
		if(x.equalsIgnoreCase(y))
		{
			System.out.println("Message Sent is displayed");
		}
		else
		{
			System.out.println("Message Sent is not displayed");
		}
	}
}
