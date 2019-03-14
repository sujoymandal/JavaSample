package JavaProgram9;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {

	@Test
	public void test1(){
		System.out.println("test1  started!!");
		Assert.assertTrue(true);
		System.out.println("hard assertion done!!");
	}
	
	@Test
	public void test2(){
		System.out.println("test2 staretd!!");
		Assert.assertTrue(false);
		System.out.println("hard assertion done!!");
	}
	
	@Test
	public void test3(){
		System.out.println("test3!!");
		
		SoftAssert asrt=new SoftAssert();
		asrt.assertTrue(false);
		System.out.println("soft assertion done!!");
		asrt.assertAll();
	
	}
	
}
