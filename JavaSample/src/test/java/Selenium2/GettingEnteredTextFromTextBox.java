package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingEnteredTextFromTextBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		String val=driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(val);
		driver.close();
	}

}
