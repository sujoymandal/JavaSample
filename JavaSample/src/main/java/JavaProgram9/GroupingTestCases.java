package JavaProgram9;

import org.testng.annotations.Test;

public class GroupingTestCases {

	@Test(groups="odds")
	public void test1(){
		System.out.println("test1!!");
	}
	@Test(groups="evens")
	public void test2(){
		System.out.println("test2!!");
	}
	@Test(groups="odds")
	public void test3(){
		System.out.println("test3!!");
	}
	@Test(groups="evens")
	public void test4(){
		System.out.println("test4!!");
	}
	@Test(groups="odds")
	public void test5(){
		System.out.println("test5!!");
	}
	@Test(groups="evens")
	public void test6(){
		System.out.println("test6!!");
	}
	
}
