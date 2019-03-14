package JavaProgram9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;



public class TakingScreenShotOnTestFailed {
	public static WebDriver driver;
	
	@BeforeTest
	public void initialization(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test1(){
		Assert.assertEquals("Google", driver.getTitle());
	}
	
	@Test
	public void test2(){
		Assert.assertEquals("Google1", driver.getTitle());
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}

}
