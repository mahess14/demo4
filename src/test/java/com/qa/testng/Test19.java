package com.qa.testng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test19 {
	
	@DataProvider(name="mydata")
	public Object[][] method() throws Exception 
	{
		File f=new File("C:\\Users\\Rami Reddy\\Desktop\\Automation\\testdata.xlsx");
		FileInputStream fi= new FileInputStream(f);//read the file and get thet file from harddisk to RAM
		Workbook wb= WorkbookFactory.create(fi); //get my workbook
		Sheet sh=wb.getSheetAt(0); // get first sheet from workbook
		int x=sh.getPhysicalNumberOfRows(); // count number of rows
		int y=sh.getRow(0).getLastCellNum(); // get last column number
		// array size as per count of data
		Object[][] data=new Object[x][y];
		//loop starts from 2nd row
		for(int i=0;i<x;i++)
		{
			//loop starts from 0 column
			for(int j=0;j<y;j++)
			{
				try {
					//get all values as string which are int, float....etc
				DataFormatter df= new DataFormatter();
				data[i][j]=df.formatCellValue(sh.getRow(i).getCell(j));
				}
				catch(Exception ex){
					data[i][j]="";
				}
			}
		}
		return(data);
	}
	
	@Test(priority=1,dataProvider="mydata")
	public void method1(String x, String y)
	{
		String z=x + " "+y;
		System.out.println(z);
	}
	
	@Test(priority=2,dataProvider="mydata")
	public void method2(String x, String y)
	{
		String z=x + " "+y;
		System.out.println(z);
	}
	

}
