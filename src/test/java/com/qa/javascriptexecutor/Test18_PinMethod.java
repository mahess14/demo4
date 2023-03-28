package com.qa.javascriptexecutor;



import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test18_PinMethod {

	public static void main(String[] args) throws Exception {
	
		//Open browser and launch site
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://users.cs.cf.ac.uk/Dave.Marshall/Internet/FRAMES/nested_frame.html"); 
		Thread.sleep(5000);
		//write JavaScript statements individually
		ScriptKey sk1=driver.pin("return(window.frames.length);");
		ScriptKey sk2=driver.pin("var frames=window.frames;");
		ScriptKey sk3=driver.pin("frames[3].location='https://www.bbc.com';");
		ScriptKey sk4=driver.pin("frames[4].location='https://www.magnitia.com';");
		//Scenario-1:
		long n= (Long) driver.executeScript(sk1);
		System.out.println(n);
		//Scenario-2:
		driver.executeScript(sk2); //collect frames
		driver.executeScript(sk3); //go to 4th frame
		//Scenario-3:
		driver.executeScript(sk2); //collect frames
		driver.executeScript(sk4); //go to 5th frame
		
	}

}
