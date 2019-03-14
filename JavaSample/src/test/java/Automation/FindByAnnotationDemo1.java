package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FindByAnnotationDemo1 {

	public static WebDriver driver;
//	@FindBy(id="hp-widget__sfrom")
//	public static WebElement from;
//	
//	@FindBy(id="hp-widget__sTo")
//	public static WebElement to;
//	
//	@FindBy(id="searchBtn")
//	public static WebElement search;
	
	@FindBy(name="username")
	public WebElement name;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@Test
	public void execution(){
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
		PageFactory.initElements(driver, this);
		name.sendKeys("abc");
		pwd.sendKeys("abc");
		
	}
		
		
	

}
