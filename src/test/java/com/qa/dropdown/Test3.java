package com.qa.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.co.in");
	FluentWait<RemoteWebDriver> wait= new FluentWait<RemoteWebDriver>(driver);
	wait.withTimeout(Duration.ofSeconds(30));
	wait.pollingEvery(Duration.ofSeconds(1));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-search-dropdown-card")));
	WebElement e= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select s=new Select(e);
	s.selectByVisibleText("Amazon Devices");

}
}
