package com.qa.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver =new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
	wait.withTimeout(Duration.ofSeconds(30));
	wait.pollingEvery(Duration.ofSeconds(1));
	driver.switchTo().frame("iframeResult");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cars")));
	WebElement e= driver.findElement(By.xpath("//select[@id='cars']"));
	Select s= new Select(e);	
	Actions act= new Actions(driver);
	act.keyDown(Keys.CONTROL).click(s.getOptions().get(3))
							 .click(s.getOptions().get(0))
							 .click(s.getOptions().get(1))
							 .click(s.getOptions().get(2))
							 .keyUp(Keys.CONTROL).build().perform();
	
	s.deselectByVisibleText("Volvo");
	Thread.sleep(5000);
	s.deselectByValue("opel");
	Thread.sleep(5000);
	s.deselectByIndex(3);
	
}
}
