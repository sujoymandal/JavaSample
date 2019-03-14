package Selenium1;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class ExceptionHandlingDemo {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void exceptionHandledMethod(){
		System.out.println("exception handled here!!");
		System.out.println(20/0);
		
	}
	
	@Test
	public void exceptionNotHandledMethod(){
		System.out.println("exception not handled here!!");
		System.out.println(20/0);
	}
	
	@Test(expectedExceptions=NoSuchElementException.class)
	public void differentExceptionOccured(){
		
		System.out.println("different exception occured, so it will fail!!");
		System.out.println(20/0);
	}

}
