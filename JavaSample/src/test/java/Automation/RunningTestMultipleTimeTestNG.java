package Automation;

import org.testng.annotations.Test;

public class RunningTestMultipleTimeTestNG {

	@Test(invocationCount=5)
	public void print(){
		System.out.println("running this test multiple times!!");
	}
	
}
