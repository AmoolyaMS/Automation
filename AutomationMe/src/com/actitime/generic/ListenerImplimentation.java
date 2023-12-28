package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplimentation extends BaseClass implements ITestListener 
{@Override
	public void onTestSuccess(ITestResult result) {
	String res = result.getName();
	Reporter.log(res+":script is pass",true);}
@Override
	public void onTestFailure(ITestResult result) {
String res = result.getName();
	Reporter.log(res+":script is fail",true);
	TakesScreenshot ts=(TakesScreenshot)driver;
//	String date = LocalDate.now().toString().replace(':', '-');
//	System.out.println(date);
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/"+res+".png");
	try {
		FileUtils.copyFile(temp, dest);
	} catch (IOException e) {
	}}
@Override
	public void onTestSkipped(ITestResult result) {
	String res = result.getName();
	Reporter.log(res+":script is skipped",true);
	}
@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}
	@Override
	public void onTestStart(ITestResult result) {
		
	}

}
