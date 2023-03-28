package com.qa.javascriptexecutor;



import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test19_UnpinMethod {

	public static void main(String[] args) throws Exception {
		
		//Open browser and launch site
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://users.cs.cf.ac.uk/Dave.Marshall/Internet/FRAMES/nested_frame.html"); 
		Thread.sleep(5000);
		//write JavaScript statements
		driver.pin("return(window.frames.length);");
		driver.pin("var frames=window.frames;");
		driver.pin("frames[3].location='https://www.bbc.com';");
		driver.pin("frames[4].location='https://www.google.com';");
		Thread.sleep(5000);
		//get display pinned statements
		Set<ScriptKey> l1=driver.getPinnedScripts(); //sequential collection
		ArrayList<ScriptKey> al1=new ArrayList<ScriptKey>(l1); //random collection
		System.out.println(al1.size());
		//unpin all statements and verify list
		for(ScriptKey sk:al1)
		{
			driver.unpin(sk);
		}
		Set<ScriptKey> l2=driver.getPinnedScripts(); //sequential collection
		ArrayList<ScriptKey> al2=new ArrayList<ScriptKey>(l2); //random collection
		System.out.println(al2.size());

	}
}
