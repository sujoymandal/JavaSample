package Selenium1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

public class TestNGListenerDemo extends ExtentReportWithTestNG implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println(result.getName()+" Started!!");
		
		test=extent.startTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getName()+" test succeeded!!");
		test.log(LogStatus.PASS, result.getName()+" --> Succeeded!!");
		extent.endTest(test);
		extent.flush();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getName()+" test failed!! and the reason is "+result.getThrowable());
		test.log(LogStatus.FAIL,result.getName()+" --> Failed!!",
				test.addScreenCapture(TakeScreenShotWithTestNGListener.getScreenShot()));
		//TakeScreenShotWithTestNGListener.getScreenShot();
		
		extent.endTest(test);
		extent.flush();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(result.getName()+" test skipped!!");
		test.log(LogStatus.SKIP, result.getName()+" --> Skipped!!");
		extent.endTest(test);
		extent.flush();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println(context.getName()+" test staretd!!");
		extent=ExtentReportWithTestNG.getInstance();
		//test=extent.startTest(context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println(context.getName()+" test completed!!");
		
		extent.close();
		
	}

	

}
