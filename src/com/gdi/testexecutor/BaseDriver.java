package com.gdi.testexecutor;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import com.gdi.helpers.Excel;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class BaseDriver implements PathDefiner {
	
	public AndroidDriver androidDriver;
	public  ExtentReports eReport;
	public  ExtentTest testReport;
	
	@DataProvider
	public String[][] getScenarios()
	{
		int scenarioCount=Excel.getRowCount(scenariosPath,suiteSheet);
		System.out.println(scenarioCount);
		String[][] data =new String[scenarioCount][2];
		for(int i=1;i<=scenarioCount;i++)
		{
			String scenarioName=Excel.getCellValue(scenariosPath,suiteSheet,i,0);
			System.out.println(scenarioName);
			String executionStatus=Excel.getCellValue(scenariosPath,suiteSheet,i,1);
			data[i-1][0]=scenarioName;
			data[i-1][1]=executionStatus;
		
		}
		return data;
	}
	
	@BeforeSuite
	public void initFrameWork()
	{
		 eReport=new ExtentReports("./Reports/GDI.html");
	}
	
	
	@AfterSuite
	public void endFrameWork()
	{
		System.out.println("In suite");
		eReport.flush();
//		androidDriver.quit();
	}
	}



