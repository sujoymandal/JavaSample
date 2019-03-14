package JavaProgram9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingTextInAlert {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("//*[text()='Prompt Pop up']")).click();
		//driver.findElement(By.xpath("//*[text()='Prompt Pop up']")).click();
		Alert alrt=driver.switchTo().alert();
		//alrt.sendKeys("abcd");
		Thread.sleep(3000);
	}

}
