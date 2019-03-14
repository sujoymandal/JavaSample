package Selenium1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalizerImplementationClass implements IRetryAnalyzer{

	private int tryCount=0;
	private int tryMax=3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(tryCount<tryMax){
			System.out.println("Trying again for "+result.getName()+" and trying for "+(tryCount+1));
			tryCount++;
			return true;
		}
		return false;
		
		
	}

}
