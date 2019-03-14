package Automation;

import org.testng.annotations.Test;

public class GroupAnnotationTestNGDemo {

	@Test(groups={"odd"})
	public void test1(){
		System.out.println("this is test1!!");
	}
	
	@Test(groups={"even","prime"})
	public void test2(){
		System.out.println("this is test2!!");
	}
	
	@Test(groups={"odd","prime"})
	public void test3(){
		System.out.println("this is test3!!");
	}
	
	@Test(groups={"even"})
	public void test4(){
		System.out.println("this is test4!!");
	}
	
	@Test(groups={"odd","prime"})
	public void test5(){
		System.out.println("this is test5!!");
	}
	
	@Test(groups={"even"})
	public void test6(){
		System.out.println("this is test6!!");
	}
	
	@Test(groups={"odd","prime"})
	public void test7(){
		System.out.println("this is test7!!");
	}
	
	@Test(groups={"even"})
	public void test8(){
		System.out.println("this is test8!!");
	}
}
