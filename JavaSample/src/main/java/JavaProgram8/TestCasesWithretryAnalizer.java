package JavaProgram8;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCasesWithretryAnalizer {
	
	@Test(retryAnalyzer=RetryAnalizerImplementionClass.class)
	public void test1(){
		System.out.println("test1!!");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2(){
		System.out.println("test2!!");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3(){
		System.out.println("test3!!");
		Assert.assertTrue(true);
	}

}
