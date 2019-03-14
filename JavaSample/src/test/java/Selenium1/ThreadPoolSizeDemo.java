package Selenium1;

import org.testng.annotations.Test;

public class ThreadPoolSizeDemo {

	@Test(invocationCount=5,threadPoolSize=5)
	public void threadPoolwithInvocationCount() {

		System.out.println("this is a demo method for thread pool size with invocation count!!!");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(threadPoolSize=5)
	public void threadPoolwithoutInvocationCount() {

		System.out.println("this is a demo method for thread pool size without invocation count!!!");
		System.out.println(Thread.currentThread().getId());
	}

}
