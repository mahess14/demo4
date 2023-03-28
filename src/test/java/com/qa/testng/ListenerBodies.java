package com.qa.testng;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerBodies implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Test Failed But Within Success Percentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on Test Failed With Timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("All test started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All test Finshed");
	}


	

}
