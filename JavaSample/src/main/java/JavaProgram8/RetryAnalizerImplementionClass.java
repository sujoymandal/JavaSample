package JavaProgram8;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalizerImplementionClass implements IRetryAnalyzer{

	private int tryCount=1;
	private int tryMax=3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(tryCount<=tryMax){
			System.out.println(result.getName()+" trying for "+tryCount);
			tryCount++;
			return true;
		}
		
		return false;
	}

}
