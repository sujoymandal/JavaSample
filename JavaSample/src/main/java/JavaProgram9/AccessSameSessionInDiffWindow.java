package JavaProgram9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessSameSessionInDiffWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		Set<Cookie> cookies=driver.manage().getCookies();
		driver.quit();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		for(Cookie c:cookies){
			driver.manage().addCookie(c);
		}
		driver.get("https://www.google.com/");

	}

}
