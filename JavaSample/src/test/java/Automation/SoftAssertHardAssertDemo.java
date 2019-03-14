package Automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertHardAssertDemo {

	@Test
	public void softAssert(){
		SoftAssert sft=new SoftAssert();
		System.out.println("soft assertion started!!");
		sft.assertTrue(false);
		System.out.println("soft assertion end!!");
	}
	
	@Test
	public void hardAssert(){
		System.out.println("hard assert started!!");
		Assert.assertTrue(false);
		System.out.println("hard assert end!!");
	}
	
	@Test
	public void softAssertWithAssertAll(){
		
		System.out.println("soft assert with assert all started!!");
		SoftAssert sft=new SoftAssert();
		sft.assertTrue(false);
		System.out.println("step1 executed!!");
		sft.assertTrue(false);
		System.out.println("step2 executed!!");
		sft.assertAll();
		System.out.println("soft assertion with assert all end!!");
	}

}
