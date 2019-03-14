package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTheInputTextAndClear {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchTxt=driver.findElement(By.name("q"));
		searchTxt.sendKeys("selenium tutorial");
		Thread.sleep(2000);
		searchTxt.clear();
		searchTxt.sendKeys("java tutorial");
		driver.findElement(By.xpath("(//*[@name='btnK'])[2]")).click();
		String s=driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(s);
		driver.quit();
	}

}
