package Selenium1;

import org.testng.annotations.Test;

public class TimeUnitAtSuiteLevelTestNGDemo {
	
	@Test
	public void test1() throws Exception{
		System.out.println("this is test1!! this will be executed, because suite level timeunit 2000ms");
		Thread.sleep(1000);
	}

	@Test
	public void test2() throws Exception{
		System.out.println("this is test2!! this will not be executed, because suite level timeunit 2000ms");
		Thread.sleep(3000);
	}
	
}
