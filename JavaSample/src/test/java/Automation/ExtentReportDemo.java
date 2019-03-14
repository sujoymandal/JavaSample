package Automation;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class ExtentReportDemo {

	ExtentReports report;
	ExtentTest test;

	@BeforeTest
	public void beforeTest() {

		report=new ExtentReports(System.getProperty("user.dir")+
				"\\target\\surefire-reports\\html\\extent.html",true,DisplayOrder.OLDEST_FIRST);
		report.loadConfig(new File(System.getProperty("user.dir")+
				"\\src\\test\\resources\\ReportsConfig.xml"));
	}

	@AfterTest
	public void afterTest() {
		
		report.flush();
		report.close();

	}

	@Test
	public void passTest() {

		System.out.println("this is passTest!!");
		test=report.startTest("passTest");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS,"passTest --> Passed ");
	}

	@Test
	public void failTest() {
		
		test=report.startTest("failtest");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "failtest --> Falied ");

	}

	@Test
	public void skipTest() {
		
		test=report.startTest("skipTest");
		test.log(LogStatus.SKIP, "skipTest --> Skipped  ");
	}

	@AfterMethod
	public void getResult(ITestResult result) {

		if(result.getStatus()==ITestResult.FAILURE){
			test.log(LogStatus.FAIL, result.getName()+" test failed!!");
			test.log(LogStatus.FAIL, "failed due to "+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP){
			test.log(LogStatus.SKIP, result.getName()+" test skipped!!");
		}
		
		report.endTest(test);
	}

}
