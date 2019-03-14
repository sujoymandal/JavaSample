package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGListenerDemoMainClass {
	
	boolean test4=false;
	boolean test8=false;

	public static WebDriver driver;
	public String baseUrl="https://www.geeksforgeeks.org";
	
	@BeforeTest
	public void getStarted(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}
		
	@AfterTest
	public void endUp(){
		driver.quit();
	}
	@Test
	public void test1(){
		System.out.println("this is test1!!");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2(){
		System.out.println("this is test2!!");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3(){
		System.out.println("this is test3!!");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test4(){
		if(!test4){
			throw new SkipException("this is skipped!!");
		}
		else{
		System.out.println("this is test4!!");
		Assert.assertTrue(true);
		}
	}
	
	@Test
	public void test5(){
		System.out.println("this is test5!!");
		Assert.assertTrue(false);
	}
	
	@Test(enabled=false)
	public void test6(){
		
		System.out.println("this is test6!!");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods="test5")
	public void test7(){
		System.out.println("this is test7!!");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test8(){
		if(!test8){
			throw new SkipException("this is skipped!!");
		}
		else
		{
		System.out.println("this is test8!!");
		Assert.assertTrue(true);
		}
	}
	
}
