package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTheHieghtOfElement {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println(js.executeScript("return window.innerHeight"));
		WebElement el=driver.findElement(By.xpath("//*[text()='Sign in']"));
		js.executeScript("arguments[0].style.border='3px solid red'", el);
		System.out.println(el.getSize().getHeight());
		System.out.println(el.getSize().getWidth());
		Thread.sleep(3000);
		driver.close();
	}

}
