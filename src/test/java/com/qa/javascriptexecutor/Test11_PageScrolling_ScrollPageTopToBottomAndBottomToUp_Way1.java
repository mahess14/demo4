package com.qa.javascriptexecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11_PageScrolling_ScrollPageTopToBottomAndBottomToUp_Way1 {

	public static void main(String[] args) throws Exception {
		
		//Page scrolling(top to bottom and bottom to top)
				//Open browser and launch site
				WebDriverManager.chromedriver().setup(); 
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Launch site
			    driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
				Thread.sleep(5000);
				//Page Scroll Down
				Actions act = new Actions(driver);
				WebElement e1 = driver.findElement(By.xpath("//a[text()='Contact Us']"));
				act.moveToElement(e1).perform();
				Thread.sleep(5000);
				//Page Scroll UP
				WebElement e2 = driver.findElement(By.partialLinkText("Ask Question"));
				act.moveToElement(e2).perform();
	}
}
