package JavaProgram8;

import org.testng.annotations.Test;

public class RunningTestCaseMultipleTimes {

	@Test(invocationCount=3)
	public void test1(){
		System.out.println("test1!!");
	}
	
	@Test
	public void test2(){
		System.out.println("test2!!");
	}
	
	@Test(invocationCount=2)
	public void test3(){
		System.out.println("test3!!");
	}
	
}
