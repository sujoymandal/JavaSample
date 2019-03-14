package Selenium1;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class RetryTestCasesDemo {
	
	@Test(retryAnalyzer=RetryAnalizerImplementationClass.class)
	public void test1(){
		System.out.println("this test will try to execute 4 times!!");
		Assert.assertTrue(false);
	}

}
