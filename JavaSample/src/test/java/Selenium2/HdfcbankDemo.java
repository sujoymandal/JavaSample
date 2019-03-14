package Selenium2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcbankDemo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		WebElement el=driver.findElement(By.className("selectedvalue"));
		//Select select=new Select(el);
		//List<WebElement> options=select.getOptions();
		//select.selectByIndex(2);
		el.click();
		Thread.sleep(5000);
		WebElement el2=driver.findElement(By.id("creditcardlogin"));
		el2.click();
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
	}

}
