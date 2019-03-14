package Selenium1;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class ExtentReportWithTestNG {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static ExtentReports getInstance(){
		
		if(extent==null){
		extent=new ExtentReports(System.getProperty("user.dir")+
				"\\target\\surefire-reports\\html\\ExtentReportWithTestNG_extent_report.html");
		
		extent.loadConfig(new File(System.getProperty("user.dir")+
				"\\src\\test\\resources\\ReportsConfig.xml"));
	}
		return extent;
	}
	
	@BeforeTest
	public void beforeTest(){
		extent=ExtentReportWithTestNG.getInstance();
		
	}
	
	@Test
	public void test1(){
		test=extent.startTest("test1");
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void test2(){
		test=extent.startTest("test2");
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result){
		if(result.getStatus()==ITestResult.SUCCESS){
			test.log(LogStatus.PASS, result.getName()+" ->Passed!!");
		}
		else if(result.getStatus()==ITestResult.FAILURE){
			test.log(LogStatus.FAIL, result.getName()+" ->Failed!!");
		}
		extent.endTest(test);
	}
	
	@AfterTest
	public void afterTest(){
		extent.flush();
		extent.close();
	}
}
