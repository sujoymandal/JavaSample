package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomIsDisplayedMathodDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		try {
			WebElement el=driver.findElement(By.xpath("//a[text()='Sign in1']"));
			System.out.println("Present!!");
		} catch (Exception e) {
			
			System.out.println("Not Present!!");
			//System.out.println(e.getMessage());
		}
		
			
		
		driver.close();
	}

}
