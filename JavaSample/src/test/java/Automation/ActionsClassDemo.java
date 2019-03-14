package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
		WebElement user=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("password"));
		
		Actions act=new Actions(driver);
		act.moveToElement(user).sendKeys("abc");
		act.moveToElement(pwd).sendKeys("abc");
		act.build().perform();
		
	}

}
