package JavaProgram9;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TimeOutInTestNG {
	
	
	@Test
	public void test1(){
		System.out.println("test1 started!!");
	}
	
	@Test(timeOut=3000)
	public void test2() throws Exception{
		System.out.println("test2 started!!");
		Thread.sleep(2000);
	}
	
	@Test(timeOut=3000)
	public void test3() throws Exception{
		System.out.println("test3 started!!");
		Thread.sleep(4000);
	}

}
