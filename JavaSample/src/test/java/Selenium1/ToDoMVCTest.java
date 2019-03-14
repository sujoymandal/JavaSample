package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToDoMVCTest {

	public static String baseURl="https://todomvc4tasj.herokuapp.com/";
	
	@Test
	public void startUp(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(baseURl);
		driver.findElement(By.id("new-todo")).sendKeys("goto office-10am");
		
	}
}
