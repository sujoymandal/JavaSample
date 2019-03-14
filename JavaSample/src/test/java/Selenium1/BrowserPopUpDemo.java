package Selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopUpDemo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		String url="https://blog.wishpond.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		//driver.findElement(By.xpath("//a[text()='Login & Signup']")).click();
		
		//driver.findElement(By.className("_2zrpKA")).sendKeys("hello");
		driver.findElement(By.id("close-overlay")).click();
		Thread.sleep(50000);
		//WebDriverWait wait=new WebDriverWait(driver,50);
		//wait.until(ExpectedConditions.alertIsPresent());
		Alert alrt=driver.switchTo().alert();
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='onesignal-popover-cancel-button']"))));
		//driver.findElement(By.id("onesignal-popover-cancel-button")).click();
		//alrt.dismiss();
		//System.out.println(alrt.getText());
		driver.findElement(By.xpath("//*[@id='onesignal-popover-cancel-button']")).click();
	}

}
