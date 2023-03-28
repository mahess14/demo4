package com.qa.dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {

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
	//Step 1: Add all options to array list
	List<String> l1= new ArrayList<String>();
	List<String> l2= new ArrayList<String>();
	List<WebElement>l=s.getOptions();
	for(int i=1;i<l.size();i++)
	{
		l1.add(l.get(i).getText());
		l2.add(l.get(i).getText());
	}
	
	//Step 2: Sort the array list 1	
	Collections.sort(l1);
	
	//Step 3: Compare the sorted order l1 and l2
	if(l1.equals(l2))
	{
		System.out.println("items already sorted order");
	}
	else
	{
		System.out.println("items not sorted order");
	}
	

}
}
