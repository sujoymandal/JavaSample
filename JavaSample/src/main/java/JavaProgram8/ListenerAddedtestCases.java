package JavaProgram8;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerAddedtestCases {
	
	@Test
	public void test1(){
		System.out.println("test1!!");
		Assert.assertTrue(true);
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
	
	@Test
	public void test4(){
		System.out.println("test4!!");
		throw new SkipException("Skipping!!");
	}
	
	@Test
	public void test5(){
		System.out.println("test5!!");
		Assert.assertTrue(false);
	}

}
