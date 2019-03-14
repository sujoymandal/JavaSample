package Automation;

import org.testng.annotations.Test;

public class IncludeExcludeTestNGDemo {
	
	@Test
	public void test1(){
		System.out.println("test1 method!!");
	}
	
	@Test
	public void test2(){
		System.out.println("test2 method!!");
	}
	
	@Test(priority=1)
	public void test3(){
		System.out.println("test3 method!!");
	}
	
	@Test(dependsOnMethods="test8")
	public void test4(){
		System.out.println("test4 method!!");
	}
	
	@Test(priority=0,invocationCount=3)
	public void test5(){
		System.out.println("test5 method!!");
	}
	
	@Test(enabled=false)
	public void test6(){
		System.out.println("test6 method!!");
	}
	
	@Test(invocationCount=4)
	public void test7(){
		System.out.println("test7 method!!");
	}
	
	@Test
	public void test8(){
		System.out.println("test8 method!!");
	}

}
