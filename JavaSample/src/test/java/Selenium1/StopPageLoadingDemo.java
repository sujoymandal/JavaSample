package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StopPageLoadingDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.geeksforgeeks.org/");
		driver.findElement(By.linkText("Courses @ GeeksforGeeks")).click();
		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		
	}

}
