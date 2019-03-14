package Selenium2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingColorOfElement {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement el=driver.findElement(By.xpath("//a[text()='Sign in']"));
		System.out.println(el.getCssValue("color"));
		System.out.println(el.getCssValue("background-color"));
		WebElement logo=driver.findElement(By.id("hplogo"));
		
		File src=logo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:/06_03_screenshot.png"));
		driver.close();
	}

}
