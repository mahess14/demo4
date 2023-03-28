package com.qa.testng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test18 {
	
	@DataProvider(name="mydata")
	public Object[][] method() throws Exception
	{
		Object[][] obj=new Object[5][2];
		File f=new File("C:\\Users\\Rami Reddy\\Desktop\\Automation\\testdata.txt");
		FileReader fr=new FileReader(f);//take read permission
		BufferedReader br= new BufferedReader(fr); //get file from hard disk to RAM
		String line;
		int i=0;
		//read line by line upto last line
		while((line=br.readLine())!=null)
		{
			String[] pieces=line.split(",");
			int j=0;
			for(String piece:pieces)
			{
				obj[i][j]=piece;
				j++;
			}
			i++;
		}
		br.close();
		fr.close();
		return(obj);
	}
	
	@Test(priority=1,dataProvider="mydata")
	public void method1(String x, String y)
	{
		String z=x+y;
		System.out.println(z);
	}
	
	@Test(priority=2,dataProvider="mydata")
	public void method2(String x, String y)
	{
		String z=x+y;
		System.out.println(z);
	}

}
