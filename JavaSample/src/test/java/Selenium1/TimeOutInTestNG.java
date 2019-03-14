package Selenium1;

import org.testng.annotations.Test;

public class TimeOutInTestNG {
	
	@Test(timeOut=2000)
	public void setTimeOut1() throws Exception{
		
		System.out.println("it will be passed because it will complete within the set timeout");
		Thread.sleep(1000);
	}
	
	@Test(timeOut=2000)
	public void setTimeout2() throws Exception{
		System.out.println("it will not be passed because it will not complete within set timeout");
		Thread.sleep(3000);
	}

}
