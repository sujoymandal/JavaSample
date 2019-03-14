package Automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
				pollingEvery(Duration.ofSeconds(2)).
				ignoring(Exception.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("dfg"))));
		
		WebDriverWait wait2=new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		wait2.until(ExpectedConditions.
				or(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("element1"))),
						ExpectedConditions.elementToBeClickable(By.id("element2"))));
	}

}
