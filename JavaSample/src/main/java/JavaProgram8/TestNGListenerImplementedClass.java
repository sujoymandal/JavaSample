package JavaProgram8;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenerImplementedClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println(result.getName()+" Started..");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getName()+" Successfully Completed!!");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getName()+" Got Failed!!");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println(result.getName()+" Skipped!!");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println(context.getName()+" Suite Started!!");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println(context.getName()+" Suite Finished!!");
		
	}

}
