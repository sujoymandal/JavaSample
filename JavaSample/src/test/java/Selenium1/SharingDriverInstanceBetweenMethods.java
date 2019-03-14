package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SharingDriverInstanceBetweenMethods {
	
	public WebDriver driver=null;
	String url="https://www.google.com/";
	
	@Test(priority=0)
	public void method1(){
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		if(driver==null){
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(url);
		}
		
	}
	
//	@Test(priority=1)
//	public void method2(){
//		if(driver!=null){
//			
//			driver.close();
//		}
//	}
}
