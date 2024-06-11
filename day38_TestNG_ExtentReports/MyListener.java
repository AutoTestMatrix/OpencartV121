package day38_TestNG_ExtentReports;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	public void onTestStart(ITestResult result) 
	{
	   System.out.println("On Test Start .....");
	}
	
	public void onTestSuccess(ITestResult result) 
	{
	   System.out.println("On Test Success .....");
	}
	
	public void onTestFailure(ITestResult result) 
	{
	   System.out.println("On Test Failure .....");
	}
	
	public void onTestSkipped(ITestResult result) 
	{
	   System.out.println("On Test Skipped .....");
	}
	
	public void onFinish(ITestResult context) 
	{
	   System.out.println("On Finish .....");
	}
}
