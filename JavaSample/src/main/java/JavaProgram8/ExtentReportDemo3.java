package JavaProgram8;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.ScreenCapture;

public class ExtentReportDemo3 {

	public  ExtentReports  report;
	public  ExtentTest test;
	
	
	@BeforeTest
	public void initialReport(){
		
		report=new ExtentReports("D:/extentreport_04_03.html",true,DisplayOrder.OLDEST_FIRST);
		report.loadConfig(new File("C:\\Users\\sujoym\\workspace\\JavaSample"
				+ "\\src\\test\\resources\\ReportsConfig.xml"));
		
	}
	
	@Test
	public void test1(){
		test=report.startTest("test1");
		System.out.println("test1!!");
		Assert.assertTrue(true);
		
	}
	@Test
	public void test2(){
		test=report.startTest("test2");
		System.out.println("test2!!");
		Assert.assertTrue(true);
		
	}
	@Test
	public void test3(){
		test=report.startTest("test3");
		System.out.println("test3!!");
		Assert.assertTrue(false);
		
	}
	@Test
	public void test4() {
		test=report.startTest("test4");
		System.out.println("test4!!");
		throw new SkipException("this is skipped!!");
		
	}

	@AfterMethod
	public void testComplete(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			test.log(LogStatus.FAIL, result.getName()+" got failed!!",test.addScreenCapture("D:/28_02_screenshot.png"));
		}
		else if (result.getStatus()==ITestResult.SKIP){
			test.log(LogStatus.SKIP, result.getName()+" got skipped!!");
		}
		else {
			test.log(LogStatus.PASS, result.getName()+" got passed!!");
		}
		report.flush();
		report.endTest(test);
	}
	
	@AfterTest
	public void reportComplete(){
		
		report.close();
	}
}
